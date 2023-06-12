package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = ".//Features/CreateVisit.feature",
		glue = "StepDefinitions",
		dryRun = false,
		monochrome = true,
		plugin = {"pretty","html:target/cucumber-reports/reports1.html",
				"json:target/cucumber-reports/reports2.json",
				"junit:target/cucumber-reports/reports3.xml"}
		)
public class Run {

}
