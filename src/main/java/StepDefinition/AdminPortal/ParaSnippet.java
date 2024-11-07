package StepDefinition.AdminPortal;

import base.Commonmethods;
import base.DriverInitialisation;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.AdminPortalElements.Admin_login_page_Elements;
import pages.AdminPortalElements.Admin_para_page_Elements;
import pages.AdminPortalElements.EventcreationElements;

public class ParaSnippet extends DriverInitialisation {

    static Admin_para_page_Elements para =  PageFactory.initElements(driver,Admin_para_page_Elements.class);


    @Given("^Admin portal elemement visiability '(.*)'$")
    public static void admin_element_visiability(String Webelement_name)throws Exception{
        WebDriverWait wait1 = new WebDriverWait(driver,60);
        Commonmethods base=new Commonmethods(driver,wait1);
        base.wait(2);
        WebElement b;
        b=(WebElement) Admin_para_page_Elements.class.getField(Webelement_name).get(para);
        base.checkelementvisibility(b);


    }

/*
    @Given("^element visiability '(.*)'$")
    public static  void element_visiability(String Webelement_name)throws Exception{
        WebDriverWait wait1 = new WebDriverWait(driver,60);
        Commonmethods base=new Commonmethods(driver,wait1);
        base.wait(2);
        base.element_visiability(Webelement_name);

    }

    @Given("^click on element '(.*)'$")
    public static  void click_on_element(String Webelement_name)throws Exception{
        WebDriverWait wait1 = new WebDriverWait(driver,60);
        Commonmethods base=new Commonmethods(driver,wait1);
        base.wait(2);
        base.element_on_element(Webelement_name);

    }

 */


}
