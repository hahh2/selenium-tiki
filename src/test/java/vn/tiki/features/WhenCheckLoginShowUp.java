package vn.tiki.features;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import vn.tiki.steps.HomeSteps;

@RunWith(SerenityRunner.class)
public class WhenCheckLoginShowUp {
	@Managed
	WebDriver driver;

	@Steps
	HomeSteps homeSteps;
	
	@Test
	public void should_see_error_messege_with_invalid_data() {
		homeSteps.show_login_popup();
		try {
			Thread.sleep(100000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertThat(homeSteps.pop_up_menu_show()).isEqualTo(true);

		
	}
	
	
	
}
