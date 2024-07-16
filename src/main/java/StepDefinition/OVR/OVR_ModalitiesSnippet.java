package StepDefinition.OVR;

import base.Commonmethods;
import base.DriverInitialisation;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import pages.OVRElements.OVR_Home_page_Elements;
import pages.OVRElements.OVR_Modalities_page_Elements;

import java.util.List;

public class OVR_ModalitiesSnippet extends DriverInitialisation {

    OVR_Modalities_page_Elements OVR_Modalities = PageFactory.initElements(driver, OVR_Modalities_page_Elements.class);
    OVR_Home_page_Elements OVR_Home = PageFactory.initElements(driver, OVR_Home_page_Elements.class);
    Commonmethods base = new Commonmethods(driver, wait);
    @When("^create draw for subevent of '(.*)'$")
    public void create_draw(String Subeventname) throws Exception{

        base.wait(2);
        OVR_Home.button_OVR_Homepage_RightMenu_modality.click();
        base.wait(2);
        //OVR_Modalities.text_OVR_Modalities_eventlist.findElement(By.tagName("li"));

        List<WebElement> Event_list=OVR_Modalities.text_OVR_Modalities_eventlist.findElements(By.tagName("li"));
        System.out.println("Size="+Event_list.size());

    }

}
