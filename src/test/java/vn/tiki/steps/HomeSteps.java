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
	public void user_move_sigin_account() {
		onHomePage.mouse_move_sigin_btn();
	}
	
	@Step
	public void user_click_button_sigin() {
		onHomePage.click_btn_signin();
	}
	
	@Step
	public void user_go_to_login()
	{
		visit_home();
		user_move_sigin_account();
		user_click_button_sigin();
	}
}
