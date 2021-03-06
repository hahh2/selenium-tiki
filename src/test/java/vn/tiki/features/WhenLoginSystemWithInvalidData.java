package vn.tiki.features;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import vn.tiki.steps.HomeSteps;
import vn.tiki.steps.LoginSteps;

@RunWith(SerenityRunner.class)
public class WhenLoginSystemWithInvalidData {
	@Managed
	WebDriver driver;
	
	@Steps
	HomeSteps homeSteps;
	
	@Steps
	LoginSteps loginSteps;
	
	
	@Test
	public void should_see_error_messege_with_invalid_data() {
		
		String EXPECTED = "Thông tin đăng nhập không đúng";
		
		homeSteps.user_go_to_login();
		loginSteps.user_login_system("duckduckgo@gmail.com", "123456");
		String actualErrMSg = loginSteps.get_error_messge();
		assertThat(actualErrMSg).isEqualTo(EXPECTED);
	}
	
	
	
}
