package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;


@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty:target/cucumber/cucumber.txt",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"html:target/cucumber/report",
				"json:target/cucumber/cucumber.json",
				"util.MyTestListener"}
		,features= {"classpath:features/Admin_portal_OES_lite/OES_Lite_Scenario.feature"}
		,glue = {"StepDefinition" , "PreDefinedstepdefinitions"}
		//,dryRun = true
		,monochrome = true
		,snippets = SnippetType.CAMELCASE
		,tags = "@WTT_OVR_Lite_Admin_Portal_TS147"

		//,publish = true
		)

public class TestRunner {

}