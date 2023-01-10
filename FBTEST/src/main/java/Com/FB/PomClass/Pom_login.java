package Com.FB.PomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_login {

	@FindBy(xpath="//input[@name=\"username\"]")private WebElement FName;
	@FindBy(xpath="//input[@name=\"password\"]")private WebElement LName;
	@FindBy(xpath="//input[@value=\"login\"]")private WebElement LoginButton;
	
	public Pom_login(WebDriver driver) {
	
		PageFactory.initElements(driver,this);
		
	}
	public void Enter_FirstName(String fName) {
		
		FName.sendKeys(fName);
	}
	public void Enter_LastName(String lName) {
		
		LName.sendKeys(lName);
	}
	public void ClickOn_LoginButton() {
		
		LoginButton.click();
	}
}
