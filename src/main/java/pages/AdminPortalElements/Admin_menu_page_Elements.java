package pages.AdminPortalElements;

import base.Webelementname;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pageobjectconfiguration.ElementName;


public class Admin_menu_page_Elements {

    WebDriver driver;

    public Admin_menu_page_Elements(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);  // Initialize WebElements using PageFactory
    }


    @FindBy(xpath = "(//div[contains(text(),'Paralympic Classes')])[2]")
    @ElementName("button_admin_para_ParalympicClasses")
    @Webelementname(name = "button_admin_para_ParalympicClasses")
    public WebElement button_admin_para_ParalympicClasses;

    @FindBy(xpath = "(//div[contains(text(),'Para Mobility Code')])[2]")
    @ElementName("button_admin_para_ParaMobilityCode")
    @Webelementname(name = "button_admin_para_ParaMobilityCode")
    public WebElement button_admin_para_ParaMobilityCode;

    @FindBy(xpath = "(//div[contains(text(),'Para Classification Status')])[2]")
    @ElementName("button_admin_para_ParaClassificationStatus")
    @Webelementname(name = "button_admin_para_ParaClassificationStatus")
    public WebElement button_admin_para_ParaClassificationStatus;
    @FindBy(xpath = "(//div[contains(text(),'Para Impairment Groups')])[2]")
    @ElementName("button_admin_para_ParaImpairmentGroups")
    @Webelementname(name = "button_admin_para_ParaImpairmentGroups")
    public WebElement button_admin_para_ParaImpairmentGroups;

    @FindBy(xpath = "(//div[contains(text(),'Para Room Type')])[2]")
    @ElementName("button_admin_para_ParaRoomType")
    @Webelementname(name = "button_admin_para_ParaRoomType")
    public WebElement button_admin_para_ParaRoomType;



}
