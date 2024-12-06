package StepDefinition.OVRLite.Adminportal;

import base.Commonmethods;
import io.cucumber.java.en.Given;
import org.openqa.selenium.support.ui.WebDriverWait;

import static base.DriverInitialisation.driver;

public class ParaeventAdminportalLiteSnippet {

    public static WebDriverWait wait1 = new WebDriverWait(driver, 60);
    public static Commonmethods base = new Commonmethods(driver, wait1);

    @Given("^enable Is Para Event toggle button in the Core step page Event creation process$")
    public static void enableIsParaEventtogglebuttonintheCoresteppageEventcreationprocess() throws Exception {

    }

}
