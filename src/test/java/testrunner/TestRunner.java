package testrunner;
import io.cucumber.messages.internal.com.google.common.reflect.ClassPath;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;


@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty:target/cucumber/cucumber.txt",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"html:target/cucumber/report",
				"json:target/cucumber/cucumber.json",
				"util.MyTestListener"}
		,features= {"classpath:features/Admin_portal_OES_lite"}
		,glue = {"StepDefinition" , "PreDefinedstepdefinitions"}
		//,dryRun = true
		,monochrome = true
		,snippets = SnippetType.CAMELCASE
		,tags = "@Admin_OES_lite"
		//,publish = true
		)
//@SpringBootTest
//@ContextConfiguration(classes = SpringBootTestApplication.class)
public class TestRunner {

}