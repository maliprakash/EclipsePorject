package StepDefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import Com.FB.BaseClass.Base;
import Com.FB.PomClass.Pom_NopcommerceLogin;
import Com.FB.UtilityClass.Util;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NopCommerceLogin extends Base {

	WebDriver driver;
    Util util;
    Pom_NopcommerceLogin NopLogin ;
    SoftAssert sAssert ;
    
	@Given("User vist the Nopcommerce login page")
	public void user_vist_the_nopcommerce_login_page() throws IOException {
	   
	
		driver =initialisation();
		NopLogin = new Pom_NopcommerceLogin(driver);
		util = new Util();
		driver.get(util.getproperties("NopCommerceLoginPageUrl"));
		sAssert = new SoftAssert();
	}

	@When("User Enters Uername and Password and Click on login Button")
	public void user_enters_uername_and_password_and_click_on_login_button() throws IOException {
	
		NopLogin.UserEnterUsernameandPassword_andClickOnLoginbutton(util.getproperties("Nopusername"), util.getproperties("NopPassword"));
	   
	}

	@Then("verify the title of the WebPage")
	public void verify_the_title_of_the_web_page() throws IOException {
		String actualtitle =driver.getTitle();
		String expectedtitle = util.getproperties("expectedtitle");	
		sAssert.assertEquals(actualtitle, expectedtitle);
	}

	@Then("close the Browser")
	public void close_the_browser() {
	
		driver.close();
	}
}
