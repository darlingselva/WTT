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
		,tags = "@WTT_OVR_Lite_Admin_portal_TS001 or @WTT_OVR_Lite_Admin_portal_TS010 or @WTT_OVR_Lite_Admin_portal_TS028 or @WTT_OVR_Lite_Admin_portal_TS046 or @WTT_OVR_Lite_Admin_portal_TS064 or @WTT_OVR_Lite_Admin_portal_TS077 or @WTT_OVR_Lite_Admin_Portal_TS113 or @WTT_OVR_Lite_Admin_Portal_TS130 or @WTT_OVR_Lite_Admin_Portal_TS148 or @WTT_OVR_Lite_Admin_Portal_TS169"
		//,publish = true
		)
//@SpringBootTest
//@ContextConfiguration(classes = SpringBootTestApplication.class)
public class TestRunner {

}