package StepDefinition.OVRLite.Adminportal;

import base.Commonmethods;
import io.cucumber.java.en.Given;
import org.openqa.selenium.support.ui.WebDriverWait;

import static base.DriverInitialisation.driver;

public class OESLiteAdminportalSnippet {

    public static WebDriverWait wait1 = new WebDriverWait(driver, 60);
    public static Commonmethods base = new Commonmethods(driver, wait1);

    @Given("^Enable OES toggle button in the Online Entry System step for Event creation process$")
    public static void EnableOEStogglebuttonintheOnlineEntrySystemstepforEventcreationprocess() throws Exception {

    }
}
