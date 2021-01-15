package runner;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)


@CucumberOptions (
        features = {"./src/test/resources/features"}
        ,glue = {"stepDefinitions","hooks"}
        ,tags = {"@Test2"},
        		
       plugin = {"pretty", "html:target/cucumber-pretty-report/test-output","json:target/cucumber.json"},
	    		 
        monochrome = true)


public class TestRunner{

}
