package Com.FB.BaseClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Com.FB.PathConfiguration.Path;

public class Base {

	WebDriver driver;
	
public WebDriver initialisation() {
		
		System.setProperty("webdriver.chrome.driver",Path.Chromepath);
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    return driver;
		
	}	
	
	
}
