package vn.tiki.steps;
import net.thucydides.core.annotations.Step;
import vn.tiki.pages.HomePage;
public class HomeSteps {
	
	HomePage onHomePage;
	
	@Step
	public void visit_home() {
		onHomePage.open();
	}
	
	@Step
	public void user_click_sigin_account() {
		onHomePage.clickSiginAccount();
	}
	
	@Step
	public void user_click_button_sigin() {
		onHomePage.clickBtnSignin();
	}
	
	@Step
	public void user_go_to_login()
	{
		visit_home();
		user_click_sigin_account();
		user_click_button_sigin();
	}
}
