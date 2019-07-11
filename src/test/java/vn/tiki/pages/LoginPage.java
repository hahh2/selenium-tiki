package vn.tiki.pages;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class LoginPage extends PageObject {
	
	@FindBy(xpath="//*[@id=\"email\"]")
	WebElement emailOrPhone;
	
	@FindBy(xpath=("//*[@id=\"password\"]"))
	WebElement password;
	
	@FindBy(xpath="//button[@class = 'UserModalstyle__RightButton-uq4a18-8 jpHvvv']")
	WebElement btnSigin;
	
	public void enter_email_or_phone(String keyword) {
		emailOrPhone.sendKeys(keyword);
	}
	
	public void enter_password(String keyword) {
		password.sendKeys(keyword);
	}
	
	public void click_sigin() {
		btnSigin.click();
	}
}