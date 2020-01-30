package skelten;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin= {"pretty","html:cucumber-reports"},
tags= {"notinrange","inrange"})

		
public class CucumberRunner
{
	
}
