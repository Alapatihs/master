package runner;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)


@CucumberOptions (
        features = {"./src/test/resources/features"}
        ,glue = {"stepDefinitions","hooks"}
        ,tags = {"@Scenario1"},
        		 plugin = {"html:target/cucumber-pretty-report/regression-tests",
		"json:target/cucumber.json" } 
        ,monochrome = true)

public class TestRunner{

}
