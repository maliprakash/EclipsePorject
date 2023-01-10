package TestRuneer;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
                                            
@RunWith(Cucumber.class)
@CucumberOptions(features=  {"src/main/resources/Features/hooks.feature"
		                     ,"src/main/resources/Features/login.feature"
		                     ,"src/main/resources/Features/NopcommerceLogin.feature"},

                   glue={"StepDefinition"} ,
                   monochrome = true,
                   dryRun = true 
                   
                          )
public class Run_1 {



	
}
