package StepDefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import Com.FB.BaseClass.Base;
import Com.FB.PomClass.Pom_login;
import Com.FB.UtilityClass.Util;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginstepdefinition extends Base {

	WebDriver driver;
    Util u;
	Pom_login in;
	
	@Given("user is on loginpage")
	public void user_is_on_loginpage() {
		
		driver = initialisation();
	    u = new Util();
	    in = new Pom_login(driver);
		driver.get("https://www.stealmylogin.com/demo.html");
	}
	@When("user enter username")
	public void user_enter_username() throws IOException {
		
		in.Enter_FirstName(u.getproperties("username"));
	}
	@And("user enter password")
	public void user_enter_password() throws IOException {
	
		in.Enter_LastName(u.getproperties("password"));
	}
	
	@Then("user click on login button")
	public void user_click_on_login_button() {
		
		in.ClickOn_LoginButton();
	}
	
	// invalid scenarios
	
	@Given("user is on loginpage1")
	public void user_is_on_loginpage1() {
		
		driver = initialisation();
	    u = new Util();
	    in = new Pom_login(driver);
		driver.get("https://www.stealmylogin.com/demo.html");
	}
	@When("user enter invalid username")
	public void user_enter_invalid_username() throws IOException {
		
		in.Enter_FirstName(u.getproperties("invalid_username"));
	}
	@And("user enter invalid password")
	public void user_enter_invalid_password() throws IOException {
	
		in.Enter_LastName(u.getproperties("invalid_password"));
	}
	
	@Then("user click on login button1")
	public void user_click_on_login_button1() {
		
		in.ClickOn_LoginButton();
	}
}
