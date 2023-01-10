package Practice_StepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Hoksstepdef {

	@Before
	public void login() {
		System.out.println("login");
	}
	@After
	public void logout() {
		System.out.println("logout");
	}
	
	@When("user select the product")
	public void user_select_the_product(){
	
		System.out.println("user select the product");
	}
	@Then("click on add to cart button")
	public void click_on_add_to_cart_button() {
		
		System.out.println("click on add to cart button");
	}

	@Then("and go to the add to cart functionality")
	public void and_go_to_the_add_to_cart_functionality() {
	   System.out.println("and go to the add to cart functionality");
	}
	
	@Then("click on Buy button")
	public void click_on_buy_button() {
	   System.out.println("click on Buy button");
	}	
}
