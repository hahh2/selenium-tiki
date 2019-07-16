package vn.tiki.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class HomePage extends PageObject {

	@FindBy(xpath = "//span[text()='Đăng nhập']")
	WebElementFacade signInAccountBtn;

	@FindBy(xpath = "//button[text()='Đăng nhập']")
	WebElementFacade signInButton;

	public void mouse_move_sigin_btn() {
		withAction().moveToElement(signInAccountBtn).build().perform();
	}

	public void click_btn_signin() {
		signInButton.waitUntilVisible().click(); // chờ 
		// có rất nhiều kiểu chờ khác nhau
		// ví dụ: signInButton.waitUntilClickable().click();
		
		// waitUntilVisible: chờ 60s, được quy định bởi webdriver.wait.for.timeout
		
		// Anh chỉ cần dumgf đối tượng gọi nó lên. Tùy vào tình huống test case mà anh dùng lệnh wait cho phù hợp
		
	}
	
	public boolean sigin_button_is_visible() {
		return element(signInButton).isVisible(); // chờ 60s
		
		// Có rất nhiều các kiểm tra xem đối tượng đó có trạng thái như thế nào.
		// Cách sử dụng tương tự, chỉ cần dùng đối tượng web và ọi nó ra
		// anh nhìn thấy dòng boolean - Webstatus khÔNG ?
		// boolean là kiểu trả về của những method có bắt đầu là isXXXXX
		// Nhóm lệnh bắt đầu có chữ is... là để kiểm tra Webstatus ( trạng thái của phần tử web)
		//signInButton.isCurrentlyVisible(); // ko chờ gì cả
		
		// isCurrentlyVisible khác isVisible: là Current thì không có thời gian chờ. nó kiểm tra luôn
		
		// Thời gian chờ thiết lập ở đâu ?
		
	}
}
