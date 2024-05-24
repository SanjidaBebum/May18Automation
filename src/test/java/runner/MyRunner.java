package runner;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
	    features = "src/test/resources/Features/", // Corrected path
	    glue = "stepDefinition", // Corrected package name
	    plugin = {"pretty", "html:target/cucumber-reports.html", "json:target/cucumber.json"}

	    )
public class MyRunner extends AbstractTestNGCucumberTests{

}
