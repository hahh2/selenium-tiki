package vn.tiki.steps;

import net.thucydides.core.annotations.Step;
import vn.tiki.pages.LoginPage;

public class LoginSteps {
	LoginPage loginPage;
	
	@Step
	public void user_enter_email_or_phone(String keyword) {
		loginPage.enter_email_or_phone(keyword);
	}
	
	@Step
	public void user_enter_password(String keyword) {
		loginPage.enter_password(keyword);
	}
	
	@Step
	public void user_click_sigin() {
		loginPage.click_signin();
	}
	
	@Step
	public String should_see_messege_show_error() {
		return "keyword incorrect";
	}
	@Step
	public void user_login_system(String emailOrPhone, String password)
	{
		user_enter_email_or_phone(emailOrPhone);
		user_enter_password(password);
		user_click_sigin();
	}
}
