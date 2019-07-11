package vn.tiki.pages;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class HomePage extends PageObject {
	//private final static String hoverSiginAccount = "/html/body/div[1]/div/header/div[3]/div/div[2]/div[2]/span/span";
	//private final static String btnSigin = "/html/body/div[1]/div/header/div[3]/div/div[2]/div[2]/div/button[1]";
	
	@FindBy(xpath = "//span[@class = 'Userstyle__NoWrap-xrezqc-11 cotJxS']")
	WebElement clkSiginAccount;
	@FindBy(xpath = "//*[@id=\"__next\"]/div/header/div[3]/div/div[2]/div[2]/div/button[1]")
	WebElement btnSigin;
	
	public void clickSiginAccount() {
		clkSiginAccount.click();
	}
	
	public void clickBtnSignin() {
		btnSigin.click();
	}
}
