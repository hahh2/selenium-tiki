package vn.tiki.features;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.core.Is.is;

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
	
	private static String EXPECTED = "account or password incorrect";
	
	@Test
	public void should_see_error_messege_with_invalid_data() {
		homeSteps.user_go_to_login();
		loginSteps.user_login_system("duckduckgo@gmail.com", "123456");
		String actual = loginSteps.should_see_messege_show_error();
		//assertThat(actual).isEqualTo(EXPECTED);
		//assertThat(actual, is(equals(EXPECTED)));
		assertThat(actual, is(equalTo(EXPECTED)));
	}
	
	
	
}
