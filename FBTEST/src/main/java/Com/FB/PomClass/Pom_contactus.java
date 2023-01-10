package Com.FB.PomClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Pom_contactus {

@FindBy(xpath = "//input[@name='first_name']")private WebElement username;
@FindBy(xpath="//input[@name='first_name']")private WebElement last_name;
@FindBy(xpath="/input[@name='email']")private WebElement email;



}//name="email"














