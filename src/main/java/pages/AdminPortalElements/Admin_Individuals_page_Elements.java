package pages.AdminPortalElements;

import base.Webelementname;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pageobjectconfiguration.ElementName;

public class Admin_Individuals_page_Elements {
    WebDriver driver;
    public Admin_Individuals_page_Elements(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);  // Initialize WebElements using PageFactory
    }

    @FindBy(xpath = "//div[contains(@class,'mat-select-panel-wrap')]//input[@type='text']")
    @ElementName("text_multiselectionpopuo_searchfield")
    @Webelementname(name = "text_multiselectionpopuo_searchfield")
    public WebElement text_multiselectionpopuo_searchfield;

    @FindBy(xpath = "//app-list//button[contains(text(),' Individual')]")
    @ElementName("button_Individuals_Individual_CreateIndividual")
    @Webelementname(name = "button_Individuals_Individual_CreateIndividual")
    public WebElement button_Individuals_Individual_CreateIndividual;

    @FindBy(xpath = "//app-list//input[@placeholder='Search by Individuals,Organization,Nationality']")
    @ElementName("text_Individuals_Individual_searchfields")
    @Webelementname(name = "text_Individuals_Individual_searchfields")
    public WebElement text_Individuals_Individual_searchfields;

    @FindBy(xpath = "//app-list//button[@class='search-btn']")
    @ElementName("button_Individuals_Individual_searchfieldsicon")
    @Webelementname(name = "button_Individuals_Individual_searchfieldsicon")
    public WebElement button_Individuals_Individual_searchfieldsicon;

    @FindBy(xpath = "//app-list//table//tbody")
    @ElementName("table_Individuals_Individual")
    @Webelementname(name = "table_Individuals_Individual")
    public WebElement table_Individuals_Individual;

    @FindBy(xpath = "(//span[contains(text(),'Create')])[2]")
    @ElementName("button_Individuals_Individual_Create")
    @Webelementname(name = "button_Individuals_Individual_Create")
    public WebElement button_Individuals_Individual_Create;

    @FindBy(xpath = "//button[contains(text(),'Next')]")
    @ElementName("button_Individuals_Individual_Next")
    @Webelementname(name = "button_Individuals_Individual_Next")
    public WebElement button_Individuals_Individual_Next;

    @FindBy(xpath = "//button[contains(text(),'Cancel')]")
    @ElementName("button_Individuals_Individual_Cancel")
    @Webelementname(name = "button_Individuals_Individual_Cancel")
    public WebElement button_Individuals_Individual_Cancel;

    @FindBy(xpath = "//div[contains(text(),'1: Basics')]")
    @ElementName("button_Individuals_Individual_Basics")
    @Webelementname(name = "button_Individuals_Individual_Basics")
    public WebElement button_Individuals_Individual_Basics;

    @FindBy(xpath = "//span[contains(text(),'Upload Location')]//following-sibling::mat-select")
    @ElementName("button_Individuals_Individual_Basics_photoUploadLocation")
    @Webelementname(name = "button_Individuals_Individual_Basics_photoUploadLocation")
    public WebElement button_Individuals_Individual_Basics_photoUploadLocation;

    @FindBy(xpath = "//app-create-individuals//div[contains(text(),'Photo')]//parent::div//parent::div//label[contains(text(),' Select Image ')]")
    @ElementName("button_Individuals_Individual_Basics_photoSelectImage")
    @Webelementname(name = "button_Individuals_Individual_Basics_photoSelectImage")
    public WebElement button_Individuals_Individual_Basics_photoSelectImage;

    @FindBy(xpath = "//app-create-individuals//div[contains(text(),'Organization ')]//parent::div//parent::div//angular2-multiselect")
    @ElementName("button_Individuals_Individual_Basics_Organization")
    @Webelementname(name = "button_Individuals_Individual_Basics_Organization")
    public WebElement button_Individuals_Individual_Basics_Organization;

    @FindBy(xpath = "//app-create-individuals//div[contains(text(),'Organization ')]//parent::div//parent::div//angular2-multiselect//input[@placeholder='Search']")
    @ElementName("text_Individuals_Individual_Basics_Organizationsearchfield")
    @Webelementname(name = "text_Individuals_Individual_Basics_Organizationsearchfield")
    public WebElement text_Individuals_Individual_Basics_Organizationsearchfield;

    @FindBy(xpath = "//app-create-individuals//div[contains(text(),'Gender ')]//parent::div//parent::div//mat-select")
    @ElementName("button_Individuals_Individual_Basics_Gender")
    @Webelementname(name = "button_Individuals_Individual_Basics_Gender")
    public WebElement button_Individuals_Individual_Basics_Gender;
}
