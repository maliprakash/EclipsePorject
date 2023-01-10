package Practice_StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Com.FB.BaseClass.Base;
import Com.FB.UtilityClass.Util;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class ScenarioWithDataStep extends Base {

	WebDriver driver;
	Util util ;
	
	@Given("User visit the login Page")
	public void user_visit_the_login_page() {
		driver = initialisation();
		driver.get("https://www.saucedemo.com/");
	}

	@When("User enter {string} and  {string} and click login button")
	public void user_enter_and_and_click_login_button(String username, String password) {
	   
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("login-button")).click();
	}
}
