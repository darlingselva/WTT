package StepDefinition.OVRLite.Adminportal;

import base.Commonmethods;
import io.cucumber.java.en.Given;
import org.openqa.selenium.support.ui.WebDriverWait;

import static base.DriverInitialisation.driver;

public class ParaplayerAdminportalLiteSnippet {

    public static WebDriverWait wait1 = new WebDriverWait(driver, 60);
    public static Commonmethods base = new Commonmethods(driver, wait1);

    @Given("^Para Player toggle button in the Individuals module$")
    public static void ParaPlayertogglebuttonintheIndividualsmodule() throws Exception {

    }
}
