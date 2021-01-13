package runner;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)


@CucumberOptions (
        features = {"./src/test/resources/features"}
        ,glue = {"stepDefinitions","hooks"}
        ,tags = {"@Scenario1"},
        	/*	plugin = { "pretty", "html:test-output", "json:target/cucumber.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}, */
        		
        	    		 plugin = {"html:target/cucumber-pretty-report/test-output",
        		"json:target/cucumber.json" } ,
        monochrome = true)

public class TestRunner{

}
