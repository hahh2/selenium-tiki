package vn.tiki.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class HomePage extends PageObject {
	//private final static String hoverSiginAccount = "/html/body/div[1]/div/header/div[3]/div/div[2]/div[2]/span/span";
	//private final static String btnSigin = "/html/body/div[1]/div/header/div[3]/div/div[2]/div[2]/div/button[1]";
	
	//@FindBy(xpath = "//span[Test() = 'Đăng nhập']")
	//WebElementFacade siginAccountBtn;
	@FindBy(xpath = "//span[text()='Đăng nhập']")
	WebElementFacade signInAccountBtn;
	
	@FindBy(xpath = "//button[text()='Đăng nhập']")
	WebElementFacade signInButton;
	
	public void mouse_move_sigin_btn(){
		signInAccountBtn.click();
		//withAction().moveToElement(signInAccountBtn).build().perform();
	
	}
	
	public void click_btn_signin() {
		//
		if(signInButton.isCurrentlyVisible())
			signInButton.click();
	}
}
