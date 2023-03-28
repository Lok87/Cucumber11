package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
	@CucumberOptions(features = ".\\src\\test\\resources\\features\\background.feature", glue = {
			"steps" }, dryRun = false, monochrome = true, plugin = { "pretty","html:target/reports/cucumber.html",
					"json:target/reports/cucumber.json"})
	public class Backgroundrunner {
}
