package vn.tiki.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoginPage extends PageObject {
	
	WebElementFacade email;
	WebElementFacade password;
	
	@FindBy(xpath = "//button[text()='Đăng nhập' and starts-with(@class,'UserModalstyle')]")
	WebElementFacade signInButton ;
	
	@FindBy(xpath = "//div[starts-with(@class,'InputError')]")
	WebElementFacade errorMessge ;
	
	@FindBy(id = "onesignal-popover-cancel-button")
	WebElementFacade cancelConfirmPopup ;
	
	public void clickOnCancelPopUp() {
		cancelConfirmPopup.waitUntilPresent().click();
		
		//cancelConfirmPopup.click();
		
		// Tình huống này mới thấy sự quan trọng của wait. 
		//Vì mình ko biết nó hiện ra lúc nào nhưng có thể đoán được. Nó sẽ hiện ra trong 60s chảng hạn
		
		// trong 60s đó mà đến giây thứ 10 nó hiện ra là nó sẽ click luôn chứ không hcowf hết 60s như lệnh sleep
	}
	
	public void enter_email_or_phone(String keyword) {
		element(email).waitUntilPresent().sendKeys(keyword);
	}
	
	public void enter_password(String keyword) {
		element(password).sendKeys(keyword);
	}
	
	public void click_signin() {
		signInButton.click();
	}
	
	public String getErrorMessage() {
		return errorMessge.waitUntilPresent().getText();
	}
}
