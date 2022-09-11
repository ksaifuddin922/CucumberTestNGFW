package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "", features = { "src/test/resources/features/LoginPage.feature" }, glue = {
		"Stepdefs" }, plugin = {})
public class TestsRunner extends AbstractTestNGCucumberTests{

}
