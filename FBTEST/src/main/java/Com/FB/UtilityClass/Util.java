package Com.FB.UtilityClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


import org.openqa.selenium.WebDriver;

import Com.FB.PathConfiguration.Path;

public class Util {

	WebDriver driver;
	public  String getproperties(String key) throws IOException {
		
		FileInputStream file = new FileInputStream(Path.propertyfile_path);
		Properties prop = new Properties();
		prop.load(file);
		String readporperty  = prop.getProperty(key);
		return readporperty;
	}

}