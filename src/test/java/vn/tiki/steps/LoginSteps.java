package vn.tiki.steps;

import net.thucydides.core.annotations.Step;
import vn.tiki.pages.LoginPage;

public class LoginSteps {
	LoginPage onLoginPage;
	
	@Step
	public void user_enter_email_or_phone(String keyword) {
		onLoginPage.enter_email_or_phone(keyword);
	}
	
	@Step
	public void user_enter_password(String keyword) {
		onLoginPage.enter_password(keyword);
	}
	
	@Step
	public void user_click_sigin() {
		onLoginPage.click_signin();
	}
	
	@Step
	public void user_login_system(String emailOrPhone, String password)
	{
		click_cancel_pop_up();
		user_enter_email_or_phone(emailOrPhone);
		user_enter_password(password);
		user_click_sigin();
	}
	
	
	@Step
	public String get_error_messge() {
		return onLoginPage.getErrorMessage();
	}
	
	@Step
	public void click_cancel_pop_up() {
		onLoginPage.clickOnCancelPopUp();
	}
}
