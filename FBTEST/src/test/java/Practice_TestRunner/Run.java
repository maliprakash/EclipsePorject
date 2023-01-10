package Practice_TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="src\\main\\resources\\Practice_features\\Scenario_Outline.feature",        
                   glue= {"Practice_StepDefinition"} 
                                                                 
		)

public class Run {

}