package Com.FB.PomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

public class Pom_NopcommerceLogin {
	
	@FindBy(xpath = "//input[@id='Email']") private  WebElement username;
	@FindBy(xpath = "//input[@id='Password']") private  WebElement password;
	@FindBy(xpath ="//button[@type='submit']") private WebElement loginbutton;
	
    public Pom_NopcommerceLogin(WebDriver driver) {
    	
    	PageFactory.initElements(driver, this);
    }
    
    public void UserEnterUsernameandPassword_andClickOnLoginbutton(String user_name , String pass_word) {
    	
    	username.clear();
    	username.sendKeys(user_name);
    	password.clear();
    	password.sendKeys(pass_word);
    	loginbutton.click();
    }
    
   public void GetTitleOfThePage() {
	   
	    
   }
    public void CloseTheBrowser() {
    	
    	
    }
    
    
}
