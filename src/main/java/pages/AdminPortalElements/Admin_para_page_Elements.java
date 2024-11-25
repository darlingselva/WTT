package pages.AdminPortalElements;

import base.Webelementname;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pageobjectconfiguration.ElementName;

public class Admin_para_page_Elements {

    WebDriver driver;
    public Admin_para_page_Elements(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);  // Initialize WebElements using PageFactory
    }


    @FindBy(xpath = "//app-list//div[@class='ittf_category_key mob-header ng-star-inserted']//span")
    @ElementName("text_admin_para_header")
    @Webelementname(name = "text_admin_para_header")
    public WebElement text_admin_para_header;

    @FindBy(xpath = "//button[contains(text(),'Paralympic Class')]")
    @ElementName("button_admin_para_ParalympicClasses_createParalympicClass")
    @Webelementname(name = "button_admin_para_ParalympicClasses_createParalympicClass")
    public WebElement button_admin_para_ParalympicClasses_createParalympicClass;

    @FindBy(xpath = "//mat-dialog-container//div[contains(text(),'Paralympic Class Name')]//parent::div//input[@type='text']")
    @ElementName("text_admin_para_ParalympicClasses_createParalympicClass_ParalympicClassName")
    @Webelementname(name = "text_admin_para_ParalympicClasses_createParalympicClass_ParalympicClassName")
    public WebElement text_admin_para_ParalympicClasses_createParalympicClass_ParalympicClassName;

    @FindBy(xpath = "//mat-dialog-container//div[contains(text(),'Description')]//parent::div//input[@type='text']")
    @ElementName("text_admin_para_ParalympicClasses_createParalympicClass_Description")
    @Webelementname(name = "text_admin_para_ParalympicClasses_createParalympicClass_Description")
    public WebElement text_admin_para_ParalympicClasses_createParalympicClass_Description;

    @FindBy(xpath = "//mat-dialog-container//div[contains(text(),'Class Id')]//parent::div//input[@type='text']")
    @ElementName("text_admin_para_ParalympicClasses_createParalympicClass_ClassId")
    @Webelementname(name = "text_admin_para_ParalympicClasses_createParalympicClass_ClassId")
    public WebElement text_admin_para_ParalympicClasses_createParalympicClass_ClassId;

    @FindBy(xpath = "//mat-dialog-container//div[contains(text(),'Impairment Group')]//parent::div//angular2-multiselect")
    @ElementName("dropdown_admin_para_ParalympicClasses_createParalympicClass_ImpairmentGroup")
    @Webelementname(name = "dropdown_admin_para_ParalympicClasses_createParalympicClass_ImpairmentGroup")
    public WebElement dropdown_admin_para_ParalympicClasses_createParalympicClass_ImpairmentGroup;

    @FindBy(xpath = "//mat-dialog-container//div[contains(text(),'Impairment Group')]//parent::div//input[@placeholder='Search']")
    @ElementName("text_admin_para_ParalympicClasses_createParalympicClass_ImpairmentGroup_searchfield")
    @Webelementname(name = "text_admin_para_ParalympicClasses_createParalympicClass_ImpairmentGroup_searchfield")
    public WebElement text_admin_para_ParalympicClasses_createParalympicClass_ImpairmentGroup_searchfield;

    @FindBy(xpath = "//mat-dialog-container//div[contains(text(),'Active')]//parent::div//input[@type='checkbox']")
    @ElementName("toggle_admin_para_ParalympicClasses_createParalympicClass_Active")
    @Webelementname(name = "toggle_admin_para_ParalympicClasses_createParalympicClass_Active")
    public WebElement toggle_admin_para_ParalympicClasses_createParalympicClass_Active;

    @FindBy(xpath = "//span[contains(text(),'Paralympic Class')]//ancestor::app-list//th[contains(text(),'Name')]//ancestor::table//tbody")
    @ElementName("table_admin_para_ParalympicClasses")
    @Webelementname(name = "table_admin_para_ParalympicClasses")
    public WebElement table_admin_para_ParalympicClasses;

    @FindBy(xpath = "//mat-dialog-container//span[contains(text(),'Cancel')]//parent::button")
    @ElementName("button_admin_para_common_popupwindow_Cancel")
    @Webelementname(name = "button_admin_para_common_popupwindow_Cancel")
    public WebElement button_admin_para_common_popupwindow_Cancel;

    @FindBy(xpath = "//mat-dialog-container//span[contains(text(),'Save')]//parent::button")
    @ElementName("button_admin_para_common_popupwindow_Save")
    @Webelementname(name = "button_admin_para_common_popupwindow_Save")
    public WebElement button_admin_para_common_popupwindow_Save;

    @FindBy(xpath = "//input[@placeholder='Search by Name']")
    @ElementName("text_admin_para_common_popupwindow_Searchbar")
    @Webelementname(name = "text_admin_para_common_popupwindow_Searchbar")
    public WebElement text_admin_para_common_popupwindow_Searchbar;

    @FindBy(xpath = "//button[@class='search-btn']")
    @ElementName("button_admin_para_common_popupwindow_Searchicon")
    @Webelementname(name = "button_admin_para_common_popupwindow_Searchicon")
    public WebElement button_admin_para_common_popupwindow_Searchicon;


    @FindBy(xpath = "//button[contains(text(),'Para Mobility Code')]")
    @ElementName("button_admin_para_ParaMobilityCode_createParaMobilityCode")
    @Webelementname(name = "button_admin_para_ParaMobilityCode_createParaMobilityCode")
    public WebElement button_admin_para_ParaMobilityCode_createParaMobilityCode;

    @FindBy(xpath = "//mat-dialog-container//div[contains(text(),'Name')]//parent::div//input[@type='text']")
    @ElementName("text_admin_para_ParaMobilityCode_createParaMobilityCode_Name")
    @Webelementname(name = "text_admin_para_ParaMobilityCode_createParaMobilityCode_Name")
    public WebElement text_admin_para_ParaMobilityCode_createParaMobilityCode_Name;

    @FindBy(xpath = "//mat-dialog-container//div[contains(text(),'Code')]//parent::div//input[@type='text']")
    @ElementName("text_admin_para_ParaMobilityCode_createParaMobilityCode_Code")
    @Webelementname(name = "text_admin_para_ParaMobilityCode_createParaMobilityCode_Code")
    public WebElement text_admin_para_ParaMobilityCode_createParaMobilityCode_Code;

    @FindBy(xpath = "//mat-dialog-container//div[contains(text(),'Active')]//parent::div//input[@type='checkbox']")
    @ElementName("toggle_admin_para_ParaMobilityCode_createParaMobilityCode_Active")
    @Webelementname(name = "toggle_admin_para_ParaMobilityCode_createParaMobilityCode_Active")
    public WebElement toggle_admin_para_ParaMobilityCode_createParaMobilityCode_Active;

    @FindBy(xpath = "//span[contains(text(),'Para Mobility Code')]//ancestor::app-list//th[contains(text(),'Name')]//ancestor::table//tbody")
    @ElementName("table_admin_para_ParaMobilityCode")
    @Webelementname(name = "table_admin_para_ParaMobilityCode")
    public WebElement table_admin_para_ParaMobilityCode;


    @FindBy(xpath = "//button[contains(text(),'Para Classification Status')]")
    @ElementName("button_admin_para_ParaClassificationStatus_createParaClassificationStatus")
    @Webelementname(name = "button_admin_para_ParaClassificationStatus_createParaClassificationStatus")
    public WebElement button_admin_para_ParaClassificationStatus_createParaClassificationStatus;

    @FindBy(xpath = "//mat-dialog-container//div[contains(text(),'Name')]//parent::div//input[@type='text']")
    @ElementName("text_admin_para_ParaClassificationStatus_createParaClassificationStatus_Name")
    @Webelementname(name = "text_admin_para_ParaClassificationStatus_createParaClassificationStatus_Name")
    public WebElement text_admin_para_ParaClassificationStatus_createParaClassificationStatus_Name;

    @FindBy(xpath = "//mat-dialog-container//div[contains(text(),'Code')]//parent::div//input[@type='text']")
    @ElementName("text_admin_para_ParaClassificationStatus_createParaClassificationStatus_Code")
    @Webelementname(name = "text_admin_para_ParaClassificationStatus_createParaClassificationStatus_Code")
    public WebElement text_admin_para_ParaClassificationStatus_createParaClassificationStatus_Code;

    @FindBy(xpath = "//mat-dialog-container//div[contains(text(),'Active')]//parent::div//input[@type='checkbox']")
    @ElementName("toggle_admin_para_ParaClassificationStatus_createParaClassificationStatus_Active")
    @Webelementname(name = "toggle_admin_para_ParaClassificationStatus_createParaClassificationStatus_Active")
    public WebElement toggle_admin_para_ParaClassificationStatus_createParaClassificationStatus_Active;

    @FindBy(xpath = "//span[contains(text(),'Para Classification Status')]//ancestor::app-list//th[contains(text(),'Name')]//ancestor::table//tbody")
    @ElementName("table_admin_para_ParaClassificationStatus")
    @Webelementname(name = "table_admin_para_ParaClassificationStatus")
    public WebElement table_admin_para_ParaClassificationStatus;


    @FindBy(xpath = "//button[contains(text(),'Para Impairment Group')]")
    @ElementName("button_admin_para_ParaImpairmentGroups_create_ParaImpairmentGroup")
    @Webelementname(name = "button_admin_para_ParaImpairmentGroups_create_ParaImpairmentGroup")
    public WebElement button_admin_para_ParaImpairmentGroups_create_ParaImpairmentGroup;

    @FindBy(xpath = "//mat-dialog-container//div[contains(text(),'Name')]//parent::div//input[@type='text']")
    @ElementName("text_admin_para_ParaImpairmentGroups_create_ParaImpairmentGroup_Name")
    @Webelementname(name = "text_admin_para_ParaImpairmentGroups_create_ParaImpairmentGroup_Name")
    public WebElement text_admin_para_ParaImpairmentGroups_create_ParaImpairmentGroup_Name;

    @FindBy(xpath = "//mat-dialog-container//div[contains(text(),'Code')]//parent::div//input[@type='text']")
    @ElementName("text_admin_para_ParaImpairmentGroups_create_ParaImpairmentGroup_Code")
    @Webelementname(name = "text_admin_para_ParaImpairmentGroups_create_ParaImpairmentGroup_Code")
    public WebElement text_admin_para_ParaImpairmentGroups_create_ParaImpairmentGroup_Code;

    @FindBy(xpath = "//mat-dialog-container//div[contains(text(),'Active')]//parent::div//input[@type='checkbox']")
    @ElementName("toggle_admin_para_ParaImpairmentGroups_create_ParaImpairmentGroup_Active")
    @Webelementname(name = "toggle_admin_para_ParaImpairmentGroups_create_ParaImpairmentGroup_Active")
    public WebElement toggle_admin_para_ParaImpairmentGroups_create_ParaImpairmentGroup_Active;

    @FindBy(xpath = "//span[contains(text(),'Para Impairment Group')]//ancestor::app-list//th[contains(text(),'Name')]//ancestor::table//tbody")
    @ElementName("table_admin_para_ParaImpairmentGroups")
    @Webelementname(name = "table_admin_para_ParaImpairmentGroups")
    public WebElement table_admin_para_ParaImpairmentGroups;

    @FindBy(xpath = "//button[contains(text(),'Para Room Type')]")
    @ElementName("button_admin_para_ParaRoomType_createParaRoomType")
    @Webelementname(name = "button_admin_para_ParaRoomType_createParaRoomType")
    public WebElement button_admin_para_ParaRoomType_createParaRoomType;

    @FindBy(xpath = "//mat-dialog-container//div[contains(text(),'Type')]//parent::div//parent::div//input[@type='text']")
    @ElementName("text_admin_para_ParaRoomType_createParaRoomType_Type")
    @Webelementname(name = "text_admin_para_ParaRoomType_createParaRoomType_Type")
    public WebElement text_admin_para_ParaRoomType_createParaRoomType_Type;

    @FindBy(xpath = "//mat-dialog-container//div[contains(text(),'Active')]//parent::div//input[@type='checkbox']")
    @ElementName("toggle_admin_para_ParaRoomType_createParaRoomType_Active")
    @Webelementname(name = "toggle_admin_para_ParaRoomType_createParaRoomType_Active")
    public WebElement toggle_admin_para_ParaRoomType_createParaRoomType_Active;

    @FindBy(xpath = "//span[contains(text(),'Para Room Type')]//ancestor::app-list//th[contains(text(),'Type')]//ancestor::table//tbody")
    @ElementName("table_admin_para_ParaRoomType")
    @Webelementname(name = "table_admin_para_ParaRoomType")
    public WebElement table_admin_para_ParaRoomType;
}
