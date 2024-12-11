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

    @FindBy(xpath = "//app-create-individuals//input[@name='searchText']")
    @ElementName("text_Individuals_Individual_tablesearchfield")
    @Webelementname(name = "text_Individuals_Individual_tablesearchfield")
    public WebElement text_Individuals_Individual_tablesearchfield;

    @FindBy(xpath = "//mat-dialog-container//button//span[contains(text(),'Proceed')]")
    @ElementName("button_Individuals_Individual_popupwindow_Proceed")
    @Webelementname(name = "button_Individuals_Individual_popupwindow_Proceed")
    public WebElement button_Individuals_Individual_popupwindow_Proceed;

    @FindBy(xpath = "//mat-dialog-container//button//span[contains(text(),'Cancel')]")
    @ElementName("button_Individuals_Individual_popupwindow_Cancel")
    @Webelementname(name = "button_Individuals_Individual_popupwindow_Cancel")
    public WebElement button_Individuals_Individual_popupwindow_Cancel;

    @FindBy(xpath = "//ngx-mat-select-search//input[@type='text']")
    @ElementName("text_Individuals_Individual_popupwindow_searchwindowsearchfield")
    @Webelementname(name = "text_Individuals_Individual_popupwindow_searchwindowsearchfield")
    public WebElement text_Individuals_Individual_popupwindow_searchwindowsearchfield;

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

    @FindBy(xpath = "//app-create-individuals//div[contains(text(),'Nationality ')]//parent::div//parent::div//angular2-multiselect")
    @ElementName("button_Individuals_Individual_Basics_Nationality")
    @Webelementname(name = "button_Individuals_Individual_Basics_Nationality")
    public WebElement button_Individuals_Individual_Basics_Nationality;

    @FindBy(xpath = "//app-create-individuals//div[contains(text(),'Nationality ')]//parent::div//parent::div//angular2-multiselect//input[@placeholder='Search']")
    @ElementName("text_Individuals_Individual_Basics_Nationalitysearchfield")
    @Webelementname(name = "text_Individuals_Individual_Basics_Nationalitysearchfield")
    public WebElement text_Individuals_Individual_Basics_Nationalitysearchfield;

    @FindBy(xpath = "//app-create-individuals//div[contains(text(),'BirthDate')]//parent::div//parent::div//input[@placeholder='Choose a date']")
    @ElementName("button_Individuals_Individual_Basics_BirthDate")
    @Webelementname(name = "button_Individuals_Individual_Basics_BirthDate")
    public WebElement button_Individuals_Individual_Basics_BirthDate;


    @FindBy(xpath = "//app-create-individuals//div[contains(text(),'DeathDate ')]//parent::div//parent::div//input[@placeholder='Choose a date']")
    @ElementName("button_Individuals_Individual_Basics_DeathDate")
    @Webelementname(name = "button_Individuals_Individual_Basics_DeathDate")
    public WebElement button_Individuals_Individual_Basics_DeathDate;

    @FindBy(xpath = "//app-create-individuals//div[contains(text(),'Is Master ')]//parent::div//parent::div//mat-slide-toggle")
    @ElementName("toggle_Individuals_Individual_Basics_IsMaster")
    @Webelementname(name = "toggle_Individuals_Individual_Basics_IsMaster")
    public WebElement toggle_Individuals_Individual_Basics_IsMaster;

    @FindBy(xpath = "//app-create-individuals//div[contains(text(),'Is Para Player ')]//parent::div//parent::div//mat-slide-toggle")
    @ElementName("toggle_Individuals_Individual_Basics_IsParaPlayer")
    @Webelementname(name = "toggle_Individuals_Individual_Basics_IsParaPlayer")
    public WebElement toggle_Individuals_Individual_Basics_IsParaPlayer;

    @FindBy(xpath = "//app-create-individuals//div[contains(text(),'Active ')]//parent::div//parent::div//mat-slide-toggle")
    @ElementName("toggle_Individuals_Individual_Basics_Active")
    @Webelementname(name = "toggle_Individuals_Individual_Basics_Active")
    public WebElement toggle_Individuals_Individual_Basics_Active;

    @FindBy(xpath = "//app-create-individuals//div[contains(text(),'Address1')]//parent::div//parent::div//input")
    @ElementName("text_Individuals_Individual_Basics_Address1")
    @Webelementname(name = "text_Individuals_Individual_Basics_Address1")
    public WebElement text_Individuals_Individual_Basics_Address1;

    @FindBy(xpath = "//app-create-individuals//div[contains(text(),'Passport Type')]//parent::div//parent::div//input")
    @ElementName("text_Individuals_Individual_Basics_PassportType")
    @Webelementname(name = "text_Individuals_Individual_Basics_PassportType")
    public WebElement text_Individuals_Individual_Basics_PassportType;

    @FindBy(xpath = "//app-create-individuals//div[contains(text(),'Address2')]//parent::div//parent::div//input")
    @ElementName("text_Individuals_Individual_Basics_Address2")
    @Webelementname(name = "text_Individuals_Individual_Basics_Address2")
    public WebElement text_Individuals_Individual_Basics_Address2;

    @FindBy(xpath = "//app-create-individuals//div[contains(text(),'Full Name (as in Passport)')]//parent::div//parent::div//input")
    @ElementName("text_Individuals_Individual_Basics_FullNameasinPassport")
    @Webelementname(name = "text_Individuals_Individual_Basics_FullNameasinPassport")
    public WebElement text_Individuals_Individual_Basics_FullNameasinPassport;

    @FindBy(xpath = "//app-create-individuals//div[contains(text(),'Address3')]//parent::div//parent::div//input")
    @ElementName("text_Individuals_Individual_Basics_Address3")
    @Webelementname(name = "text_Individuals_Individual_Basics_Address3")
    public WebElement text_Individuals_Individual_Basics_Address3;

    @FindBy(xpath = "//app-create-individuals//div[contains(text(),'Passport Number')]//parent::div//parent::div//input")
    @ElementName("text_Individuals_Individual_Basics_PassportNumber")
    @Webelementname(name = "text_Individuals_Individual_Basics_PassportNumber")
    public WebElement text_Individuals_Individual_Basics_PassportNumber;

    @FindBy(xpath = "//app-create-individuals//div[contains(text(),'City')]//parent::div//parent::div//input")
    @ElementName("text_Individuals_Individual_Basics_City")
    @Webelementname(name = "text_Individuals_Individual_Basics_City")
    public WebElement text_Individuals_Individual_Basics_City;

    @FindBy(xpath = "//app-create-individuals//div[contains(text(),'Issued On')]//parent::div//parent::div//input")
    @ElementName("text_Individuals_Individual_Basics_IssuedOn")
    @Webelementname(name = "text_Individuals_Individual_Basics_IssuedOn")
    public WebElement text_Individuals_Individual_Basics_IssuedOn;

    @FindBy(xpath = "//app-create-individuals//div[contains(text(),'State/Province/County')]//parent::div//parent::div//input")
    @ElementName("text_Individuals_Individual_Basics_StateProvinceCounty")
    @Webelementname(name = "text_Individuals_Individual_Basics_StateProvinceCounty")
    public WebElement text_Individuals_Individual_Basics_StateProvinceCounty;

    @FindBy(xpath = "//app-create-individuals//div[contains(text(),'Expires On')]//parent::div//parent::div//input")
    @ElementName("text_Individuals_Individual_Basics_ExpiresOn")
    @Webelementname(name = "text_Individuals_Individual_Basics_ExpiresOn")
    public WebElement text_Individuals_Individual_Basics_ExpiresOn;

    @FindBy(xpath = "//app-create-individuals//div[contains(text(),'Residing Country')]//parent::div//parent::div//angular2-multiselect")
    @ElementName("button_Individuals_Individual_Basics_ResidingCountry")
    @Webelementname(name = "button_Individuals_Individual_Basics_ResidingCountry")
    public WebElement button_Individuals_Individual_Basics_ResidingCountry;

    @FindBy(xpath = "//app-create-individuals//div[contains(text(),'Residing Country')]//parent::div//parent::div//input[@placeholder='Search']")
    @ElementName("text_Individuals_Individual_Basics_ResidingCountrysearchfield")
    @Webelementname(name = "text_Individuals_Individual_Basics_ResidingCountrysearchfield")
    public WebElement text_Individuals_Individual_Basics_ResidingCountrysearchfield;

    @FindBy(xpath = "//app-create-individuals//div[contains(text(),'Office Location')]//parent::div//parent::div//angular2-multiselect")
    @ElementName("button_Individuals_Individual_Basics_OfficeLocation")
    @Webelementname(name = "button_Individuals_Individual_Basics_OfficeLocation")
    public WebElement button_Individuals_Individual_Basics_OfficeLocation;

    @FindBy(xpath = "//app-create-individuals//div[contains(text(),'Office Location')]//parent::div//parent::div//input[@placeholder='Search']")
    @ElementName("text_Individuals_Individual_Basics_OfficeLocationsearchfield")
    @Webelementname(name = "text_Individuals_Individual_Basics_OfficeLocationsearchfield")
    public WebElement text_Individuals_Individual_Basics_OfficeLocationsearchfield;

    @FindBy(xpath = "//app-create-individuals//div[contains(text(),'Postcode')]//parent::div//parent::div//input")
    @ElementName("text_Individuals_Individual_Basics_Postcode")
    @Webelementname(name = "text_Individuals_Individual_Basics_Postcode")
    public WebElement text_Individuals_Individual_Basics_Postcode;

    @FindBy(xpath = "//app-create-individuals//div[contains(text(),'Passport Copy')]//parent::div//parent::div//label[@class='file_upload_button']")
    @ElementName("button_Individuals_Individual_Basics_PassportCopy")
    @Webelementname(name = "button_Individuals_Individual_Basics_PassportCopy")
    public WebElement button_Individuals_Individual_Basics_PassportCopy;

    @FindBy(xpath = "//app-create-individuals//div[contains(text(),'Firstname')]//parent::div//parent::div//input")
    @ElementName("text_Individuals_Individual_Basics_Firstname")
    @Webelementname(name = "text_Individuals_Individual_Basics_Firstname")
    public WebElement text_Individuals_Individual_Basics_Firstname;

    @FindBy(xpath = "//app-create-individuals//div[contains(text(),'Lastname')]//parent::div//parent::div//input")
    @ElementName("text_Individuals_Individual_Basics_Lastname")
    @Webelementname(name = "text_Individuals_Individual_Basics_Lastname")
    public WebElement text_Individuals_Individual_Basics_Lastname;

    @FindBy(xpath = "//div[contains(text(),'2: Names')]")
    @ElementName("button_Individuals_Individual_Names")
    @Webelementname(name = "button_Individuals_Individual_Names")
    public WebElement button_Individuals_Individual_Names;

    @FindBy(xpath = "//app-create-individuals//span[contains(text(),'Names')]//following-sibling::button[contains(text(),'Add New')]")
    @ElementName("button_Individuals_Individual_Names_AddNew")
    @Webelementname(name = "button_Individuals_Individual_Names_AddNew")
    public WebElement button_Individuals_Individual_Names_AddNew;

    @FindBy(xpath = "//mat-dialog-container//div[contains(text(),'Initials')]//parent::div//parent::div//mat-select")
    @ElementName("button_Individuals_Individual_Names_AddNew_Initials")
    @Webelementname(name = "button_Individuals_Individual_Names_AddNew_Initials")
    public WebElement button_Individuals_Individual_Names_AddNew_Initials;

    @FindBy(xpath = "//mat-dialog-container//div[contains(text(),'Given Name')]//parent::div//parent::div//input")
    @ElementName("text_Individuals_Individual_Names_AddNew_GivenName")
    @Webelementname(name = "text_Individuals_Individual_Names_AddNew_GivenName")
    public WebElement text_Individuals_Individual_Names_AddNew_GivenName;


    @FindBy(xpath = "//mat-dialog-container//div[contains(text(),'Family Name')]//parent::div//parent::div//input")
    @ElementName("text_Individuals_Individual_Names_AddNew_FamilyName")
    @Webelementname(name = "text_Individuals_Individual_Names_AddNew_FamilyName")
    public WebElement text_Individuals_Individual_Names_AddNew_FamilyName;

    @FindBy(xpath = "//mat-dialog-container//div[contains(text(),'Language')]//parent::div//parent::div//angular2-multiselect")
    @ElementName("button_Individuals_Individual_Names_AddNew_Language")
    @Webelementname(name = "button_Individuals_Individual_Names_AddNew_Language")
    public WebElement button_Individuals_Individual_Names_AddNew_Language;

    @FindBy(xpath = "//mat-dialog-container//div[contains(text(),'Language')]//parent::div//parent::div//input[@placeholder='Search']")
    @ElementName("text_Individuals_Individual_Names_AddNew_Languagesearchfield")
    @Webelementname(name = "text_Individuals_Individual_Names_AddNew_Languagesearchfield")
    public WebElement text_Individuals_Individual_Names_AddNew_Languagesearchfield;

    @FindBy(xpath = "//mat-dialog-container//div[contains(text(),'Active')]//parent::div//parent::div//mat-slide-toggle")
    @ElementName("toggle_Individuals_Individual_Names_AddNew_Active")
    @Webelementname(name = "toggle_Individuals_Individual_Names_AddNew_Active")
    public WebElement toggle_Individuals_Individual_Names_AddNew_Active;

    @FindBy(xpath = "//app-create-individuals//table//tbody")
    @ElementName("table_Individuals_Individual_Names")
    @Webelementname(name = "table_Individuals_Individual_Names")
    public WebElement table_Individuals_Individual_Names;

    @FindBy(xpath = "//div[contains(text(),'3: Additional')]")
    @ElementName("button_Individuals_Individual_Additional")
    @Webelementname(name = "button_Individuals_Individual_Additional")
    public WebElement button_Individuals_Individual_Additional;

    @FindBy(xpath = "//app-create-individuals//div[contains(text(),'Joined Year ')]//parent::div//parent::div//mat-select")
    @ElementName("button_Individuals_Individual_Additional_JoinedYear")
    @Webelementname(name = "button_Individuals_Individual_Additional_JoinedYear")
    public WebElement button_Individuals_Individual_Additional_JoinedYear;

    @FindBy(xpath = "//div[contains(text(),'4: Contacts')]")
    @ElementName("button_Individuals_Individual_Contacts")
    @Webelementname(name = "button_Individuals_Individual_Contacts")
    public WebElement button_Individuals_Individual_Contacts;

    @FindBy(xpath = "//app-create-individuals//span[contains(text(),'Emails')]//following-sibling::button[contains(text(),'Add New')]")
    @ElementName("button_Individuals_Individual_Contacts_Emails_addnew")
    @Webelementname(name = "button_Individuals_Individual_Contacts_Emails_addnew")
    public WebElement button_Individuals_Individual_Contacts_Emails_addnew;

    @FindBy(xpath = "//mat-dialog-container//div[contains(text(),'Email Category')]//parent::div//parent::div//angular2-multiselect")
    @ElementName("button_Individuals_Individual_Contacts_Emails_addnew_EmailCategory")
    @Webelementname(name = "button_Individuals_Individual_Contacts_Emails_addnew_EmailCategory")
    public WebElement button_Individuals_Individual_Contacts_Emails_addnew_EmailCategory;

    @FindBy(xpath = "//mat-dialog-container//div[contains(text(),'Email Category')]//parent::div//parent::div//input[@placeholder='Search']")
    @ElementName("text_Individuals_Individual_Contacts_Emails_addnew_EmailCategorysearchfield")
    @Webelementname(name = "text_Individuals_Individual_Contacts_Emails_addnew_EmailCategorysearchfield")
    public WebElement text_Individuals_Individual_Contacts_Emails_addnew_EmailCategorysearchfield;

    @FindBy(xpath = "//mat-dialog-container//div[text()='Email']//parent::div//parent::div//input")
    @ElementName("text_Individuals_Individual_Contacts_Emails_addnew_Email")
    @Webelementname(name = "text_Individuals_Individual_Contacts_Emails_addnew_Email")
    public WebElement text_Individuals_Individual_Contacts_Emails_addnew_Email;

    @FindBy(xpath = "//mat-dialog-container//div[text()='Is Active']//parent::div//parent::div//mat-slide-toggle")
    @ElementName("toggle_Individuals_Individual_Contacts_Emails_addnew_IsActive")
    @Webelementname(name = "toggle_Individuals_Individual_Contacts_Emails_addnew_IsActive")
    public WebElement toggle_Individuals_Individual_Contacts_Emails_addnew_IsActive;

    @FindBy(xpath = "//mat-dialog-container//div[text()='Show in Directory']//parent::div//parent::div//mat-slide-toggle")
    @ElementName("toggle_Individuals_Individual_Contacts_Emails_addnew_ShowinDirectory")
    @Webelementname(name = "toggle_Individuals_Individual_Contacts_Emails_addnew_ShowinDirectory")
    public WebElement toggle_Individuals_Individual_Contacts_Emails_addnew_ShowinDirectory;

    @FindBy(xpath = "//app-create-individuals//th[contains(text(),'Email Category')]//ancestor::table//tbody")
    @ElementName("table_Individuals_Individual_Contacts_Emails_table")
    @Webelementname(name = "table_Individuals_Individual_Contacts_Emails_table")
    public WebElement table_Individuals_Individual_Contacts_Emails_table;

    @FindBy(xpath = "//app-create-individuals//span[contains(text(),'Contact Numbers')]//following-sibling::button[contains(text(),'Add New')]")
    @ElementName("button_Individuals_Individual_Contacts_ContactNumbers_addnew")
    @Webelementname(name = "button_Individuals_Individual_Contacts_ContactNumbers_addnew")
    public WebElement button_Individuals_Individual_Contacts_ContactNumbers_addnew;

    @FindBy(xpath = "//mat-dialog-container//div[contains(text(),'Contact No Medium Type')]//parent::div//parent::div//angular2-multiselect")
    @ElementName("button_Individuals_Individual_Contacts_ContactNumbers_addnew_ContactNoMediumType")
    @Webelementname(name = "button_Individuals_Individual_Contacts_ContactNumbers_addnew_ContactNoMediumType")
    public WebElement button_Individuals_Individual_Contacts_ContactNumbers_addnew_ContactNoMediumType;

    @FindBy(xpath = "//mat-dialog-container//div[contains(text(),'Contact No Medium Type')]//parent::div//parent::div//input[@placeholder='Search']")
    @ElementName("text_Individuals_Individual_Contacts_ContactNumbers_addnew_ContactNoMediumTypesearchfield")
    @Webelementname(name = "text_Individuals_Individual_Contacts_ContactNumbers_addnew_ContactNoMediumTypesearchfield")
    public WebElement text_Individuals_Individual_Contacts_ContactNumbers_addnew_ContactNoMediumTypesearchfield;

    @FindBy(xpath = "//mat-dialog-container//div[contains(text(),'Contact No.')]//parent::div//parent::div//input")
    @ElementName("text_Individuals_Individual_Contacts_ContactNumbers_addnew_ContactNo")
    @Webelementname(name = "text_Individuals_Individual_Contacts_ContactNumbers_addnew_ContactNo")
    public WebElement text_Individuals_Individual_Contacts_ContactNumbers_addnew_ContactNo;

    @FindBy(xpath = "//mat-dialog-container//div[contains(text(),'Is Active')]//parent::div//parent::div//mat-slide-toggle")
    @ElementName("toggle_Individuals_Individual_Contacts_ContactNumbers_addnew_IsActive")
    @Webelementname(name = "toggle_Individuals_Individual_Contacts_ContactNumbers_addnew_IsActive")
    public WebElement toggle_Individuals_Individual_Contacts_ContactNumbers_addnew_IsActive;

    @FindBy(xpath = "//mat-dialog-container//div[contains(text(),'Show in Directory')]//parent::div//parent::div//mat-slide-toggle")
    @ElementName("toggle_Individuals_Individual_Contacts_ContactNumbers_addnew_ShowinDirectory")
    @Webelementname(name = "toggle_Individuals_Individual_Contacts_ContactNumbers_addnew_ShowinDirectory")
    public WebElement toggle_Individuals_Individual_Contacts_ContactNumbers_addnew_ShowinDirectory;

    @FindBy(xpath = "//app-create-individuals//th[contains(text(),'Contact No Medium Type')]//ancestor::table//tbody")
    @ElementName("table_Individuals_Individual_Contacts_ContactNumbers_table")
    @Webelementname(name = "table_Individuals_Individual_Contacts_ContactNumbers_table")
    public WebElement table_Individuals_Individual_Contacts_ContactNumbers_table;

    @FindBy(xpath = "//div[contains(text(),'5: Profiles')]")
    @ElementName("button_Individuals_Individual_Profiles")
    @Webelementname(name = "button_Individuals_Individual_Profiles")
    public WebElement button_Individuals_Individual_Profiles;

    @FindBy(xpath = "//app-create-individuals//span[contains(text(),'Individual Profile')]//following-sibling::button[contains(text(),'Add New')]")
    @ElementName("button_Individuals_Individual_Profiles_IndividualProfile_addnew")
    @Webelementname(name = "button_Individuals_Individual_Profiles_IndividualProfile_addnew")
    public WebElement button_Individuals_Individual_Profiles_IndividualProfile_addnew;

    @FindBy(xpath = "//mat-dialog-container//div[contains(text(),'Profile Type')]//parent::div//parent::div//angular2-multiselect")
    @ElementName("button_Individuals_Individual_Profiles_IndividualProfile_addnew_ProfileType")
    @Webelementname(name = "button_Individuals_Individual_Profiles_IndividualProfile_addnew_ProfileType")
    public WebElement button_Individuals_Individual_Profiles_IndividualProfile_addnew_ProfileType;

    @FindBy(xpath = "//mat-dialog-container//div[contains(text(),'Profile Type')]//parent::div//parent::div//input[@type='text']")
    @ElementName("text_Individuals_Individual_Profiles_IndividualProfile_addnew_ProfileTypesearchfield")
    @Webelementname(name = "text_Individuals_Individual_Profiles_IndividualProfile_addnew_ProfileTypesearchfield")
    public WebElement text_Individuals_Individual_Profiles_IndividualProfile_addnew_ProfileTypesearchfield;

    @FindBy(xpath = "//mat-dialog-container//div[contains(text(),'Profile Group')]//parent::div//parent::div//angular2-multiselect")
    @ElementName("button_Individuals_Individual_Profiles_IndividualProfile_addnew_ProfileGroup")
    @Webelementname(name = "button_Individuals_Individual_Profiles_IndividualProfile_addnew_ProfileGroup")
    public WebElement button_Individuals_Individual_Profiles_IndividualProfile_addnew_ProfileGroup;

    @FindBy(xpath = "//mat-dialog-container//div[contains(text(),'Profile Group')]//parent::div//parent::div//input[@type='text']")
    @ElementName("text_Individuals_Individual_Profiles_IndividualProfile_addnew_ProfileGroupsearchfield")
    @Webelementname(name = "text_Individuals_Individual_Profiles_IndividualProfile_addnew_ProfileGroupsearchfield")
    public WebElement text_Individuals_Individual_Profiles_IndividualProfile_addnew_ProfileGroupsearchfield;
    @FindBy(xpath = "//mat-dialog-container//div[contains(text(),'Organization')]//parent::div//parent::div//angular2-multiselect")
    @ElementName("button_Individuals_Individual_Profiles_IndividualProfile_addnew_Organization")
    @Webelementname(name = "button_Individuals_Individual_Profiles_IndividualProfile_addnew_Organization")
    public WebElement button_Individuals_Individual_Profiles_IndividualProfile_addnew_Organization;

    @FindBy(xpath = "//mat-dialog-container//div[contains(text(),'Organization')]//parent::div//parent::div//input[@type='text']")
    @ElementName("text_Individuals_Individual_Profiles_IndividualProfile_addnew_Organizationsearchfield")
    @Webelementname(name = "text_Individuals_Individual_Profiles_IndividualProfile_addnew_Organizationsearchfield")
    public WebElement text_Individuals_Individual_Profiles_IndividualProfile_addnew_Organizationsearchfield;
    @FindBy(xpath = "//mat-dialog-container//div[contains(text(),'Linked Individual')]//parent::div//parent::div//angular2-multiselect")
    @ElementName("button_Individuals_Individual_Profiles_IndividualProfile_addnew_LinkedIndividual")
    @Webelementname(name = "button_Individuals_Individual_Profiles_IndividualProfile_addnew_LinkedIndividual")
    public WebElement button_Individuals_Individual_Profiles_IndividualProfile_addnew_LinkedIndividual;

    @FindBy(xpath = "//mat-dialog-container//div[contains(text(),'Linked Individual')]//parent::div//parent::div//input[@type='text']")
    @ElementName("text_Individuals_Individual_Profiles_IndividualProfile_addnew_LinkedIndividualsearchfield")
    @Webelementname(name = "text_Individuals_Individual_Profiles_IndividualProfile_addnew_LinkedIndividualsearchfield")
    public WebElement text_Individuals_Individual_Profiles_IndividualProfile_addnew_LinkedIndividualsearchfield;

    @FindBy(xpath = "//mat-dialog-container//div[contains(text(),'Start Date')]//parent::div//parent::div//input")
    @ElementName("text_Individuals_Individual_Profiles_IndividualProfile_addnew_StartDate")
    @Webelementname(name = "text_Individuals_Individual_Profiles_IndividualProfile_addnew_StartDate")
    public WebElement text_Individuals_Individual_Profiles_IndividualProfile_addnew_StartDate;

    @FindBy(xpath = "//mat-dialog-container//div[contains(text(),'End Date')]//parent::div//parent::div//input")
    @ElementName("text_Individuals_Individual_Profiles_IndividualProfile_addnew_EndDate")
    @Webelementname(name = "text_Individuals_Individual_Profiles_IndividualProfile_addnew_EndDate")
    public WebElement text_Individuals_Individual_Profiles_IndividualProfile_addnew_EndDate;

    @FindBy(xpath = "//mat-dialog-container//div[contains(text(),'Email')]//parent::div//parent::div//input")
    @ElementName("text_Individuals_Individual_Profiles_IndividualProfile_addnew_Email")
    @Webelementname(name = "text_Individuals_Individual_Profiles_IndividualProfile_addnew_Email")
    public WebElement text_Individuals_Individual_Profiles_IndividualProfile_addnew_Email;

    @FindBy(xpath = "//mat-dialog-container//div[contains(text(),'Phone Number(With Country Code)')]//parent::div//parent::div//input")
    @ElementName("text_Individuals_Individual_Profiles_IndividualProfile_addnew_PhoneNumberWithCountryCode")
    @Webelementname(name = "text_Individuals_Individual_Profiles_IndividualProfile_addnew_PhoneNumberWithCountryCode")
    public WebElement text_Individuals_Individual_Profiles_IndividualProfile_addnew_PhoneNumberWithCountryCode;

    @FindBy(xpath = "//mat-dialog-container//div[contains(text(),'Whatsapp Number(With Country Code)')]//parent::div//parent::div//input")
    @ElementName("text_Individuals_Individual_Profiles_IndividualProfile_addnew_WhatsappNumberWithCountryCode")
    @Webelementname(name = "text_Individuals_Individual_Profiles_IndividualProfile_addnew_WhatsappNumberWithCountryCode")
    public WebElement text_Individuals_Individual_Profiles_IndividualProfile_addnew_WhatsappNumberWithCountryCode;

    @FindBy(xpath = "//mat-dialog-container//div[contains(text(),'Twitter Link')]//parent::div//parent::div//input")
    @ElementName("text_Individuals_Individual_Profiles_IndividualProfile_addnew_TwitterLink")
    @Webelementname(name = "text_Individuals_Individual_Profiles_IndividualProfile_addnew_TwitterLink")
    public WebElement text_Individuals_Individual_Profiles_IndividualProfile_addnew_TwitterLink;

    @FindBy(xpath = "//mat-dialog-container//div[contains(text(),'Facebook Link')]//parent::div//parent::div//input")
    @ElementName("text_Individuals_Individual_Profiles_IndividualProfile_addnew_FacebookLink")
    @Webelementname(name = "text_Individuals_Individual_Profiles_IndividualProfile_addnew_FacebookLink")
    public WebElement text_Individuals_Individual_Profiles_IndividualProfile_addnew_FacebookLink;

    @FindBy(xpath = "//mat-dialog-container//div[contains(text(),'Linkedin Link')]//parent::div//parent::div//input")
    @ElementName("text_Individuals_Individual_Profiles_IndividualProfile_addnew_LinkedinLink")
    @Webelementname(name = "text_Individuals_Individual_Profiles_IndividualProfile_addnew_LinkedinLink")
    public WebElement text_Individuals_Individual_Profiles_IndividualProfile_addnew_LinkedinLink;

    @FindBy(xpath = "//mat-dialog-container//div[contains(text(),'WeChat Link')]//parent::div//parent::div//input")
    @ElementName("text_Individuals_Individual_Profiles_IndividualProfile_addnew_WeChatLink")
    @Webelementname(name = "text_Individuals_Individual_Profiles_IndividualProfile_addnew_WeChatLink")
    public WebElement text_Individuals_Individual_Profiles_IndividualProfile_addnew_WeChatLink;

    @FindBy(xpath = "//mat-dialog-container//div[contains(text(),'Telegram Link')]//parent::div//parent::div//input")
    @ElementName("text_Individuals_Individual_Profiles_IndividualProfile_addnew_TelegramLink")
    @Webelementname(name = "text_Individuals_Individual_Profiles_IndividualProfile_addnew_TelegramLink")
    public WebElement text_Individuals_Individual_Profiles_IndividualProfile_addnew_TelegramLink;

    @FindBy(xpath = "//mat-dialog-container//div[contains(text(),'QR Tag')]//parent::div//parent::div//input")
    @ElementName("text_Individuals_Individual_Profiles_IndividualProfile_addnew_QRTag")
    @Webelementname(name = "text_Individuals_Individual_Profiles_IndividualProfile_addnew_QRTag")
    public WebElement text_Individuals_Individual_Profiles_IndividualProfile_addnew_QRTag;

    @FindBy(xpath = "//app-create-individuals//table//tbody")
    @ElementName("table_Individuals_Individual_Profiles_IndividualProfile_table")
    @Webelementname(name = "table_Individuals_Individual_Profiles_IndividualProfile_table")
    public WebElement table_Individuals_Individual_Profiles_IndividualProfile_table;

    @FindBy(xpath = "//div[contains(text(),'6: Eligibility')]")
    @ElementName("button_Individuals_Individual_Eligibility")
    @Webelementname(name = "button_Individuals_Individual_Eligibility")
    public WebElement button_Individuals_Individual_Eligibility;

    @FindBy(xpath = "//app-create-individuals//div[contains(text(),'GrandFather Eligibility ')]//parent::div//parent::div//mat-slide-toggle")
    @ElementName("toggle_Individuals_Individual_Eligibility_GrandFatherEligibility")
    @Webelementname(name = "toggle_Individuals_Individual_Eligibility_GrandFatherEligibility")
    public WebElement toggle_Individuals_Individual_Eligibility_GrandFatherEligibility;


    @FindBy(xpath = "//app-create-individuals//div[contains(text(),'Olympic Eligibility')]//parent::div//parent::div//mat-slide-toggle")
    @ElementName("toggle_Individuals_Individual_Eligibility_OlympicEligibility")
    @Webelementname(name = "toggle_Individuals_Individual_Eligibility_OlympicEligibility")
    public WebElement toggle_Individuals_Individual_Eligibility_OlympicEligibility;

    @FindBy(xpath = "//app-create-individuals//div[contains(text(),'Team Eligibility ')]//parent::div//parent::div//mat-slide-toggle")
    @ElementName("toggle_Individuals_Individual_Eligibility_TeamEligibility")
    @Webelementname(name = "toggle_Individuals_Individual_Eligibility_TeamEligibility")
    public WebElement toggle_Individuals_Individual_Eligibility_TeamEligibility;

    @FindBy(xpath = "//app-create-individuals//div[contains(text(),'WorldTitle Eligibility ')]//parent::div//parent::div//mat-slide-toggle")
    @ElementName("toggle_Individuals_Individual_Eligibility_WorldTitleEligibility")
    @Webelementname(name = "toggle_Individuals_Individual_Eligibility_WorldTitleEligibility")
    public WebElement toggle_Individuals_Individual_Eligibility_WorldTitleEligibility;


    @FindBy(xpath = "//app-create-individuals//div[contains(text(),'WTT Eligibility ')]//parent::div//parent::div//mat-slide-toggle")
    @ElementName("toggle_Individuals_Individual_Eligibility_WTTEligibility")
    @Webelementname(name = "toggle_Individuals_Individual_Eligibility_WTTEligibility")
    public WebElement toggle_Individuals_Individual_Eligibility_WTTEligibility;

    @FindBy(xpath = "//app-create-individuals//div[contains(text(),'Active ')]//parent::div//parent::div//mat-slide-toggle")
    @ElementName("toggle_Individuals_Individual_Eligibility_Active")
    @Webelementname(name = "toggle_Individuals_Individual_Eligibility_Active")
    public WebElement toggle_Individuals_Individual_Eligibility_Active;

    @FindBy(xpath = "//div[contains(text(),'7: Membership')]")
    @ElementName("button_Individuals_Individual_Membership")
    @Webelementname(name = "button_Individuals_Individual_Membership")
    public WebElement button_Individuals_Individual_Membership;

    @FindBy(xpath = "//app-create-individuals//span[contains(text(),'Membership')]//parent::div//button[contains(text(),'Add New')]")
    @ElementName("button_Individuals_Individual_Membership_AddNew")
    @Webelementname(name = "button_Individuals_Individual_Membership_AddNew")
    public WebElement button_Individuals_Individual_Membership_AddNew;

    @FindBy(xpath = "//app-create-individuals//input[@type='search']")
    @ElementName("text_Individuals_Individual_Membership_searchfield")
    @Webelementname(name = "text_Individuals_Individual_Membership_searchfield")
    public WebElement text_Individuals_Individual_Membership_searchfield;

    @FindBy(xpath = "//mat-dialog-container//div[contains(text(),'Membership')]//parent::div//parent::div//angular2-multiselect")
    @ElementName("button_Individuals_Individual_Membership_AddNew_Membership")
    @Webelementname(name = "button_Individuals_Individual_Membership_AddNew_Membership")
    public WebElement button_Individuals_Individual_Membership_AddNew_Membership;

    @FindBy(xpath = "//mat-dialog-container//div[contains(text(),'Membership')]//parent::div//parent::div//input[@type='text']")
    @ElementName("text_Individuals_Individual_Membership_AddNew_Membershipsearchfield")
    @Webelementname(name = "text_Individuals_Individual_Membership_AddNew_Membershipsearchfield")
    public WebElement text_Individuals_Individual_Membership_AddNew_Membershipsearchfield;

    @FindBy(xpath = "//mat-dialog-container//div[contains(text(),'Active From')]//parent::div//parent::div//input")
    @ElementName("text_Individuals_Individual_Membership_AddNew_ActiveFrom")
    @Webelementname(name = "text_Individuals_Individual_Membership_AddNew_ActiveFrom")
    public WebElement text_Individuals_Individual_Membership_AddNew_ActiveFrom;

    @FindBy(xpath = "//mat-dialog-container//div[contains(text(),'Expires On')]//parent::div//parent::div//input")
    @ElementName("text_Individuals_Individual_Membership_AddNew_ExpiresOn")
    @Webelementname(name = "text_Individuals_Individual_Membership_AddNew_ExpiresOn")
    public WebElement text_Individuals_Individual_Membership_AddNew_ExpiresOn;

    @FindBy(xpath = "//mat-dialog-container//div[contains(text(),'Active')]//parent::div//parent::div//mat-slide-toggle")
    @ElementName("toggle_Individuals_Individual_Membership_AddNew_Active")
    @Webelementname(name = "toggle_Individuals_Individual_Membership_AddNew_Active")
    public WebElement toggle_Individuals_Individual_Membership_AddNew_Active;


    @FindBy(xpath = "//div[contains(text(),'8: Player Profile')]")
    @ElementName("button_Individuals_Individual_PlayerProfile")
    @Webelementname(name = "button_Individuals_Individual_PlayerProfile")
    public WebElement button_Individuals_Individual_PlayerProfile;

    @FindBy(xpath = "//app-create-individuals//div[contains(text(),'Current Out Of Competition Start Date ')]//parent::div//parent::div//input")
    @ElementName("text_Individuals_Individual_PlayerProfile_CurrentOutOfCompetitionStartDate")
    @Webelementname(name = "text_Individuals_Individual_PlayerProfile_CurrentOutOfCompetitionStartDate")
    public WebElement text_Individuals_Individual_PlayerProfile_CurrentOutOfCompetitionStartDate;


    @FindBy(xpath = "//app-create-individuals//div[contains(text(),'Protected Ranking Activation Date ')]//parent::div//parent::div//input")
    @ElementName("text_Individuals_Individual_PlayerProfile_ProtectedRankingActivationDate")
    @Webelementname(name = "text_Individuals_Individual_PlayerProfile_ProtectedRankingActivationDate")
    public WebElement text_Individuals_Individual_PlayerProfile_ProtectedRankingActivationDate;


    @FindBy(xpath = "//app-create-individuals//div[contains(text(),'Protected Ranking Period In Months ')]//parent::div//parent::div//input")
    @ElementName("text_Individuals_Individual_PlayerProfile_ProtectedRankingPeriodInMonths")
    @Webelementname(name = "text_Individuals_Individual_PlayerProfile_ProtectedRankingPeriodInMonths")
    public WebElement text_Individuals_Individual_PlayerProfile_ProtectedRankingPeriodInMonths;

    @FindBy(xpath = "//app-create-individuals//div[contains(text(),'Protected Ranking No Of Events ')]//parent::div//parent::div//input")
    @ElementName("text_Individuals_Individual_PlayerProfile_ProtectedRankingNoOfEvents")
    @Webelementname(name = "text_Individuals_Individual_PlayerProfile_ProtectedRankingNoOfEvents")
    public WebElement text_Individuals_Individual_PlayerProfile_ProtectedRankingNoOfEvents;

    @FindBy(xpath = "//app-create-individuals//div[contains(text(),'Protected Ranking Remaining No Of Months ')]//parent::div//parent::div//input")
    @ElementName("text_Individuals_Individual_PlayerProfile_ProtectedRankingRemainingNoOfMonths")
    @Webelementname(name = "text_Individuals_Individual_PlayerProfile_ProtectedRankingRemainingNoOfMonths")
    public WebElement text_Individuals_Individual_PlayerProfile_ProtectedRankingRemainingNoOfMonths;

    @FindBy(xpath = "//app-create-individuals//div[contains(text(),'Protected Ranking Points ')]//parent::div//parent::div//input")
    @ElementName("text_Individuals_Individual_PlayerProfile_ProtectedRankingPoints")
    @Webelementname(name = "text_Individuals_Individual_PlayerProfile_ProtectedRankingPoints")
    public WebElement text_Individuals_Individual_PlayerProfile_ProtectedRankingPoints;

    @FindBy(xpath = "//app-create-individuals//div[contains(text(),'Number Of Zero Point Penalties Incurred ')]//parent::div//parent::div//input")
    @ElementName("text_Individuals_Individual_PlayerProfile_NumberOfZeroPointPenaltiesIncurred")
    @Webelementname(name = "text_Individuals_Individual_PlayerProfile_NumberOfZeroPointPenaltiesIncurred")
    public WebElement text_Individuals_Individual_PlayerProfile_NumberOfZeroPointPenaltiesIncurred;

    @FindBy(xpath = "//app-create-individuals//div[contains(text(),'Penalty Point Incurrent Ranking Week ')]//parent::div//parent::div//input")
    @ElementName("text_Individuals_Individual_PlayerProfile_PenaltyPointIncurrentRankingWeek")
    @Webelementname(name = "text_Individuals_Individual_PlayerProfile_PenaltyPointIncurrentRankingWeek")
    public WebElement text_Individuals_Individual_PlayerProfile_PenaltyPointIncurrentRankingWeek;

    @FindBy(xpath = "//app-create-individuals//div[contains(text(),'Penalty Point Incurrent Ranking Month ')]//parent::div//parent::div//input")
    @ElementName("text_Individuals_Individual_PlayerProfile_PenaltyPointIncurrentRankingMonth")
    @Webelementname(name = "text_Individuals_Individual_PlayerProfile_PenaltyPointIncurrentRankingMonth")
    public WebElement text_Individuals_Individual_PlayerProfile_PenaltyPointIncurrentRankingMonth;

    @FindBy(xpath = "//app-create-individuals//div[contains(text(),'Penalty Point Incurrent Ranking Year ')]//parent::div//parent::div//input")
    @ElementName("text_Individuals_Individual_PlayerProfile_PenaltyPointIncurrentRankingYear")
    @Webelementname(name = "text_Individuals_Individual_PlayerProfile_PenaltyPointIncurrentRankingYear")
    public WebElement text_Individuals_Individual_PlayerProfile_PenaltyPointIncurrentRankingYear;


    @FindBy(xpath = "//app-create-individuals//div[contains(text(),'Hand ')]//parent::div//parent::div//input")
    @ElementName("text_Individuals_Individual_PlayerProfile_Hand")
    @Webelementname(name = "text_Individuals_Individual_PlayerProfile_Hand")
    public WebElement text_Individuals_Individual_PlayerProfile_Hand;

    @FindBy(xpath = "//app-create-individuals//div[contains(text(),'Grip')]//parent::div//parent::div//input")
    @ElementName("text_Individuals_Individual_PlayerProfile_Grip")
    @Webelementname(name = "text_Individuals_Individual_PlayerProfile_Grip")
    public WebElement text_Individuals_Individual_PlayerProfile_Grip;

    @FindBy(xpath = "//app-create-individuals//div[contains(text(),'Zero Point Penalty Expiry Date ')]//parent::div//parent::div//input")
    @ElementName("text_Individuals_Individual_PlayerProfile_ZeroPointPenaltyExpiryDate")
    @Webelementname(name = "text_Individuals_Individual_PlayerProfile_ZeroPointPenaltyExpiryDate")
    public WebElement text_Individuals_Individual_PlayerProfile_ZeroPointPenaltyExpiryDate;

    @FindBy(xpath = "//app-create-individuals//div[contains(text(),'Protected Ranking ')]//parent::div//parent::div//mat-slide-toggle")
    @ElementName("toggle_Individuals_Individual_PlayerProfile_ProtectedRanking")
    @Webelementname(name = "toggle_Individuals_Individual_PlayerProfile_ProtectedRanking")
    public WebElement toggle_Individuals_Individual_PlayerProfile_ProtectedRanking;


    @FindBy(xpath = "//div[contains(text(),'9: Medical Information')]")
    @ElementName("button_Individuals_Individual_MedicalInformation")
    @Webelementname(name = "button_Individuals_Individual_MedicalInformation")
    public WebElement button_Individuals_Individual_MedicalInformation;


    @FindBy(xpath = "//app-create-individuals//div[contains(text(),'Status')]//parent::div//parent::div//mat-select")
    @ElementName("button_Individuals_Individual_MedicalInformation_Status")
    @Webelementname(name = "button_Individuals_Individual_MedicalInformation_Status")
    public WebElement button_Individuals_Individual_MedicalInformation_Status;

    @FindBy(xpath = "//app-create-individuals//div[contains(text(),'No of Vaccination ')]//parent::div//parent::div//mat-select")
    @ElementName("button_Individuals_Individual_MedicalInformation_NoofVaccination")
    @Webelementname(name = "button_Individuals_Individual_MedicalInformation_NoofVaccination")
    public WebElement button_Individuals_Individual_MedicalInformation_NoofVaccination;

    @FindBy(xpath = "//app-create-individuals//div[contains(text(),'Date of Last Vaccination ')]//parent::div//parent::div//input")
    @ElementName("text_Individuals_Individual_MedicalInformation_DateofLastVaccination")
    @Webelementname(name = "text_Individuals_Individual_MedicalInformation_DateofLastVaccination")
    public WebElement text_Individuals_Individual_MedicalInformation_DateofLastVaccination;

    @FindBy(xpath = "//app-create-individuals//div[contains(text(),'Certificate ')]//parent::div//parent::div//label[@class='file_upload_button']")
    @ElementName("file_Individuals_Individual_MedicalInformation_Certificate")
    @Webelementname(name = "file_Individuals_Individual_MedicalInformation_Certificate")
    public WebElement file_Individuals_Individual_MedicalInformation_Certificate;

    @FindBy(xpath = "//div[contains(text(),'10: Documents')]")
    @ElementName("button_Individuals_Individual_Documents")
    @Webelementname(name = "button_Individuals_Individual_Documents")
    public WebElement button_Individuals_Individual_Documents;

    @FindBy(xpath = "//app-create-individuals//span[contains(text(),'Documents')]//parent::div//button[contains(text(),'Add New')]")
    @ElementName("button_Individuals_Individual_Documents_AddNew")
    @Webelementname(name = "button_Individuals_Individual_Documents_AddNew")
    public WebElement button_Individuals_Individual_Documents_AddNew;


    @FindBy(xpath = "//app-create-individuals//input[@name='searchText']")
    @ElementName("text_Individuals_Individual_Documents_searchfield")
    @Webelementname(name = "text_Individuals_Individual_Documents_searchfield")
    public WebElement text_Individuals_Individual_Documents_searchfield;


    @FindBy(xpath = "//app-create-individuals//table//tbody")
    @ElementName("table_Individuals_Individual_Documents_table")
    @Webelementname(name = "table_Individuals_Individual_Documents_table")
    public WebElement table_Individuals_Individual_Documents_table;

    @FindBy(xpath = "//mat-dialog-container//div[contains(text(),'Document Title')]//parent::div//parent::div//input")
    @ElementName("text_Individuals_Individual_Documents_AddNew_DocumentTitle")
    @Webelementname(name = "text_Individuals_Individual_Documents_AddNew_DocumentTitle")
    public WebElement text_Individuals_Individual_Documents_AddNew_DocumentTitle;

    @FindBy(xpath = "//mat-dialog-container//div[contains(text(),'Valid From')]//parent::div//parent::div//input")
    @ElementName("text_Individuals_Individual_Documents_AddNew_ValidFrom")
    @Webelementname(name = "text_Individuals_Individual_Documents_AddNew_ValidFrom")
    public WebElement text_Individuals_Individual_Documents_AddNew_ValidFrom;

    @FindBy(xpath = "//mat-dialog-container//div[contains(text(),'Valid To')]//parent::div//parent::div//input")
    @ElementName("text_Individuals_Individual_Documents_AddNew_ValidTo")
    @Webelementname(name = "text_Individuals_Individual_Documents_AddNew_ValidTo")
    public WebElement text_Individuals_Individual_Documents_AddNew_ValidTo;

    @FindBy(xpath = "//mat-dialog-container//div[contains(text(),'Place')]//parent::div//parent::div//input")
    @ElementName("text_Individuals_Individual_Documents_AddNew_Place")
    @Webelementname(name = "text_Individuals_Individual_Documents_AddNew_Place")
    public WebElement text_Individuals_Individual_Documents_AddNew_Place;

    @FindBy(xpath = "//mat-dialog-container//div[contains(text(),'Version')]//parent::div//parent::div//input")
    @ElementName("text_Individuals_Individual_Documents_AddNew_Version")
    @Webelementname(name = "text_Individuals_Individual_Documents_AddNew_Version")
    public WebElement text_Individuals_Individual_Documents_AddNew_Version;

    @FindBy(xpath = "//mat-dialog-container//div[contains(text(),'Notes')]//parent::div//parent::div//textarea")
    @ElementName("text_Individuals_Individual_Documents_AddNew_Notes")
    @Webelementname(name = "text_Individuals_Individual_Documents_AddNew_Notes")
    public WebElement text_Individuals_Individual_Documents_AddNew_Notes;

    @FindBy(xpath = "//mat-dialog-container//div[contains(text(),'Document Type')]//parent::div//parent::div//mat-select")
    @ElementName("button_Individuals_Individual_Documents_AddNew_DocumentType")
    @Webelementname(name = "button_Individuals_Individual_Documents_AddNew_DocumentType")
    public WebElement button_Individuals_Individual_Documents_AddNew_DocumentType;

    @FindBy(xpath = "//mat-dialog-container//div[contains(text(),'Active')]//parent::div//parent::div//mat-slide-toggle")
    @ElementName("toggle_Individuals_Individual_Documents_AddNew_Active")
    @Webelementname(name = "toggle_Individuals_Individual_Documents_AddNew_Active")
    public WebElement toggle_Individuals_Individual_Documents_AddNew_Active;

    @FindBy(xpath = "//mat-dialog-container//div[contains(text(),'Public Document')]//parent::div//parent::div//mat-slide-toggle")
    @ElementName("toggle_Individuals_Individual_Documents_AddNew_PublicDocument")
    @Webelementname(name = "toggle_Individuals_Individual_Documents_AddNew_PublicDocument")
    public WebElement toggle_Individuals_Individual_Documents_AddNew_PublicDocument;

    @FindBy(xpath = "//mat-dialog-container//div[contains(text(),'Document')]//parent::div//parent::div//label[@class='file_upload_button']")
    @ElementName("file_Individuals_Individual_Documents_AddNew_Document")
    @Webelementname(name = "file_Individuals_Individual_Documents_AddNew_Document")
    public WebElement file_Individuals_Individual_Documents_AddNew_Document;

    @FindBy(xpath = "//div[contains(text(),'12: Review')]")
    @ElementName("button_Individuals_Individual_Review")
    @Webelementname(name = "button_Individuals_Individual_Review")
    public WebElement button_Individuals_Individual_Review;

    @FindBy(xpath = "//app-create-individuals//div[contains(text(),'Photo')]//parent::div//parent::div//img")
    @ElementName("text_Individuals_Individual_Review_Photo")
    @Webelementname(name = "text_Individuals_Individual_Review_Photo")
    public WebElement text_Individuals_Individual_Review_BasicInformation_Photo;

    @FindBy(xpath = "//app-create-individuals//div[contains(text(),'Organization ')]//parent::div//parent::div//app-fetcher-value//span")
    @ElementName("text_Individuals_Individual_Review_Organization")
    @Webelementname(name = "text_Individuals_Individual_Review_Organization")
    public WebElement text_Individuals_Individual_Review_BasicInformation_Organization;

    @FindBy(xpath = "//app-create-individuals//div[contains(text(),'Gender')]//parent::div//parent::div//app-gender")
    @ElementName("text_Individuals_Individual_Review_Gender")
    @Webelementname(name = "text_Individuals_Individual_Review_Gender")
    public WebElement text_Individuals_Individual_Review_BasicInformation_Gender;

    @FindBy(xpath = "//app-create-individuals//div[contains(text(),'Nationality ')]//parent::div//parent::div//app-fetcher-value//span")
    @ElementName("text_Individuals_Individual_Review_Nationality")
    @Webelementname(name = "text_Individuals_Individual_Review_Nationality")
    public WebElement text_Individuals_Individual_Review_BasicInformation_Nationality;

    @FindBy(xpath = "//app-create-individuals//div[contains(text(),'BirthDate')]//parent::div//parent::div//app-dateparse//span//span")
    @ElementName("text_Individuals_Individual_Review_BirthDate")
    @Webelementname(name = "text_Individuals_Individual_Review_BirthDate")
    public WebElement text_Individuals_Individual_Review_BasicInformation_BirthDate;

    @FindBy(xpath = "//app-create-individuals//div[contains(text(),'DeathDate ')]//parent::div//parent::div//app-dateparse//span//span")
    @ElementName("text_Individuals_Individual_Review_DeathDate")
    @Webelementname(name = "text_Individuals_Individual_Review_DeathDate")
    public WebElement text_Individuals_Individual_Review_BasicInformation_DeathDate;

    @FindBy(xpath = "//app-create-individuals//div[contains(text(),'Is Master ')]//parent::div//parent::div//app-form-field-value//span//span//span//span")
    @ElementName("text_Individuals_Individual_Review_IsMaster")
    @Webelementname(name = "text_Individuals_Individual_Review_IsMaster")
    public WebElement text_Individuals_Individual_Review_BasicInformation_IsMaster;

    @FindBy(xpath = "//app-create-individuals//div[contains(text(),'Is Para Player ')]//parent::div//parent::div//app-form-field-value//span//span//span//span")
    @ElementName("text_Individuals_Individual_Review_IsParaPlayer")
    @Webelementname(name = "text_Individuals_Individual_Review_IsParaPlayer")
    public WebElement text_Individuals_Individual_Review_BasicInformation_IsParaPlayer;

    @FindBy(xpath = "(//app-create-individuals//app-inner-sub-view)[1]//div[contains(text(),'Active ')]//parent::div//parent::div//app-form-field-value//span//span//span//span")
    @ElementName("text_Individuals_Individual_Review_BasicInformation_Active")
    @Webelementname(name = "text_Individuals_Individual_Review_BasicInformation_Active")
    public WebElement text_Individuals_Individual_Review_BasicInformation_Active;

    @FindBy(xpath = "//app-create-individuals//div[contains(text(),'Location Information')]//parent::div//following-sibling::div//app-inner-sub-view//div[contains(text(),'Address1 ')]//parent::div//parent::div//app-form-field-value//span//span//span//span")
    @ElementName("text_Individuals_Individual_Review_LocationInformation_LocationInformation")
    @Webelementname(name = "text_Individuals_Individual_Review_LocationInformation_LocationInformation")
    public WebElement text_Individuals_Individual_Review_LocationInformation_LocationInformation;

    @FindBy(xpath = "//app-create-individuals//div[contains(text(),'Location Information')]//parent::div//following-sibling::div//app-inner-sub-view//div[contains(text(),'Address2 ')]//parent::div//parent::div//app-form-field-value//span//span//span//span")
    @ElementName("text_Individuals_Individual_Review_LocationInformation_Address2")
    @Webelementname(name = "text_Individuals_Individual_Review_LocationInformation_Address2")
    public WebElement text_Individuals_Individual_Review_LocationInformation_Address2;

    @FindBy(xpath = "//app-create-individuals//div[contains(text(),'Location Information')]//parent::div//following-sibling::div//app-inner-sub-view//div[contains(text(),'Address3 ')]//parent::div//parent::div//app-form-field-value//span//span//span//span")
    @ElementName("text_Individuals_Individual_Review_LocationInformation_Address3")
    @Webelementname(name = "text_Individuals_Individual_Review_LocationInformation_Address3")
    public WebElement text_Individuals_Individual_Review_LocationInformation_Address3;

    @FindBy(xpath = "//app-create-individuals//div[contains(text(),'Location Information')]//parent::div//following-sibling::div//app-inner-sub-view//div[contains(text(),'City ')]//parent::div//parent::div//app-form-field-value//span//span//span//span")
    @ElementName("text_Individuals_Individual_Review_LocationInformation_City")
    @Webelementname(name = "text_Individuals_Individual_Review_LocationInformation_City")
    public WebElement text_Individuals_Individual_Review_LocationInformation_City;

    @FindBy(xpath = "//app-create-individuals//div[contains(text(),'Location Information')]//parent::div//following-sibling::div//app-inner-sub-view//div[contains(text(),'State/Province/County ')]//parent::div//parent::div//app-form-field-value//span//span//span//span")
    @ElementName("text_Individuals_Individual_Review_LocationInformation_StateProvinceCounty")
    @Webelementname(name = "text_Individuals_Individual_Review_LocationInformation_StateProvinceCounty")
    public WebElement text_Individuals_Individual_Review_LocationInformation_StateProvinceCounty;

    @FindBy(xpath = "//app-create-individuals//div[contains(text(),'Location Information')]//parent::div//following-sibling::div//app-inner-sub-view//div[contains(text(),'State/County Code ')]//parent::div//parent::div//app-form-field-value//span//span//span//span")
    @ElementName("text_Individuals_Individual_Review_LocationInformation_StateCountyCode")
    @Webelementname(name = "text_Individuals_Individual_Review_LocationInformation_StateCountyCode")
    public WebElement text_Individuals_Individual_Review_LocationInformation_StateCountyCode;

    @FindBy(xpath = "//app-create-individuals//div[contains(text(),'Location Information')]//parent::div//following-sibling::div//app-inner-sub-view//div[contains(text(),'Residing Country ')]//parent::div//parent::div//app-form-field-value//span//span//span//span")
    @ElementName("text_Individuals_Individual_Review_LocationInformation_ResidingCountry")
    @Webelementname(name = "text_Individuals_Individual_Review_LocationInformation_ResidingCountry")
    public WebElement text_Individuals_Individual_Review_LocationInformation_ResidingCountry;


    @FindBy(xpath = "//app-create-individuals//div[contains(text(),'Location Information')]//parent::div//following-sibling::div//app-inner-sub-view//div[contains(text(),'Office Location ')]//parent::div//parent::div//app-form-field-value//span//span//span//span")
    @ElementName("text_Individuals_Individual_Review_LocationInformation_OfficeLocation")
    @Webelementname(name = "text_Individuals_Individual_Review_LocationInformation_OfficeLocation")
    public WebElement text_Individuals_Individual_Review_LocationInformation_OfficeLocation;


    @FindBy(xpath = "//app-create-individuals//div[contains(text(),'Location Information')]//parent::div//following-sibling::div//app-inner-sub-view//div[contains(text(),'Postcode ')]//parent::div//parent::div//app-form-field-value//span//span//span//span")
    @ElementName("text_Individuals_Individual_Review_LocationInformation_Postcode")
    @Webelementname(name = "text_Individuals_Individual_Review_LocationInformation_Postcode")
    public WebElement text_Individuals_Individual_Review_LocationInformation_Postcode;

    @FindBy(xpath = "//app-create-individuals//div[contains(text(),'Passport Information')]//parent::div//following-sibling::div//app-inner-sub-view//div[contains(text(),'Passport Type ')]//parent::div//parent::div//app-form-field-value//span//span//span//span")
    @ElementName("text_Individuals_Individual_Review_PassportInformation_PassportType")
    @Webelementname(name = "text_Individuals_Individual_Review_PassportInformation_PassportType")
    public WebElement text_Individuals_Individual_Review_PassportInformation_PassportType;

    @FindBy(xpath = "//app-create-individuals//div[contains(text(),'Passport Information')]//parent::div//following-sibling::div//app-inner-sub-view//div[contains(text(),'Full Name (as in Passport) ')]//parent::div//parent::div//app-form-field-value//span//span//span//span")
    @ElementName("text_Individuals_Individual_Review_PassportInformation_FullNameasinPassport")
    @Webelementname(name = "text_Individuals_Individual_Review_PassportInformation_FullNameasinPassport")
    public WebElement text_Individuals_Individual_Review_PassportInformation_FullNameasinPassport;

    @FindBy(xpath = "//app-create-individuals//div[contains(text(),'Passport Information')]//parent::div//following-sibling::div//app-inner-sub-view//div[contains(text(),'Passport Number ')]//parent::div//parent::div//app-form-field-value//span//span//span//span")
    @ElementName("text_Individuals_Individual_Review_PassportInformation_PassportNumber")
    @Webelementname(name = "text_Individuals_Individual_Review_PassportInformation_PassportNumber")
    public WebElement text_Individuals_Individual_Review_PassportInformation_PassportNumber;

    @FindBy(xpath = "//app-create-individuals//div[contains(text(),'Passport Information')]//parent::div//following-sibling::div//app-inner-sub-view//div[contains(text(),'Issued On ')]//parent::div//parent::div//app-dateparse//span//span")
    @ElementName("text_Individuals_Individual_Review_PassportInformation_IssuedOn")
    @Webelementname(name = "text_Individuals_Individual_Review_PassportInformation_IssuedOn")
    public WebElement text_Individuals_Individual_Review_PassportInformation_IssuedOn;

    @FindBy(xpath = "//app-create-individuals//div[contains(text(),'Passport Information')]//parent::div//following-sibling::div//app-inner-sub-view//div[contains(text(),'Expires On ')]//parent::div//parent::div//app-dateparse//span//span")
    @ElementName("text_Individuals_Individual_Review_PassportInformation_ExpiresOn")
    @Webelementname(name = "text_Individuals_Individual_Review_PassportInformation_ExpiresOn")
    public WebElement text_Individuals_Individual_Review_PassportInformation_ExpiresOn;

    @FindBy(xpath = "//app-create-individuals//div[contains(text(),'Passport Information')]//parent::div//following-sibling::div//app-inner-sub-view//div[contains(text(),'Passport Copy')]//parent::div//parent::div//app-form-field-value//img")
    @ElementName("img_Individuals_Individual_Review_PassportInformation_PassportCopy")
    @Webelementname(name = "img_Individuals_Individual_Review_PassportInformation_PassportCopy")
    public WebElement img_Individuals_Individual_Review_PassportInformation_PassportCopy;

    @FindBy(xpath = "//app-create-individuals//div[contains(text(),'Emergency Contact Information')]//parent::div//following-sibling::div//app-inner-sub-view//div[contains(text(),'Firstname')]//parent::div//parent::div//app-form-field-value//span//span//span//span")
    @ElementName("text_Individuals_Individual_Review_EmergencyContactInformation_Firstname")
    @Webelementname(name = "text_Individuals_Individual_Review_EmergencyContactInformation_Firstname")
    public WebElement text_Individuals_Individual_Review_EmergencyContactInformation_Firstname;

    @FindBy(xpath = "//app-create-individuals//div[contains(text(),'Emergency Contact Information')]//parent::div//following-sibling::div//app-inner-sub-view//div[contains(text(),'Lastname ')]//parent::div//parent::div//app-form-field-value//span//span//span//span")
    @ElementName("text_Individuals_Individual_Review_EmergencyContactInformation_Lastname")
    @Webelementname(name = "text_Individuals_Individual_Review_EmergencyContactInformation_Lastname")
    public WebElement text_Individuals_Individual_Review_EmergencyContactInformation_Lastname;

    @FindBy(xpath = "//app-create-individuals//div[contains(text(),'Translation Information')]//following-sibling::common_sub_table_view//table//tbody")
    @ElementName("table_Individuals_Individual_Review_TranslationInformation_table")
    @Webelementname(name = "table_Individuals_Individual_Review_TranslationInformation_table")
    public WebElement table_Individuals_Individual_Review_TranslationInformation_table;

    @FindBy(xpath = "//app-create-individuals//div[contains(text(),'Additional Information')]//parent::div//following-sibling::div//app-inner-sub-view//div[contains(text(),'Joined Year ')]//parent::div//parent::div//app-form-field-value//span//span//span//span")
    @ElementName("text_Individuals_Individual_Review_AdditionalInformation_JoinedYear")
    @Webelementname(name = "text_Individuals_Individual_Review_AdditionalInformation_JoinedYear")
    public WebElement text_Individuals_Individual_Review_AdditionalInformation_JoinedYear;

    @FindBy(xpath = "//app-create-individuals//div[text()='Contact Information']//following-sibling::div//following-sibling::common_sub_table_view//table//tbody")
    @ElementName("table_Individuals_Individual_Review_ContactInformation_table")
    @Webelementname(name = "table_Individuals_Individual_Review_ContactInformation_table")
    public WebElement table_Individuals_Individual_Review_ContactInformation_table;

    @FindBy(xpath = "//app-create-individuals//div[text()='Contact Number']//parent::div//following-sibling::common_sub_table_view//table//tbody")
    @ElementName("table_Individuals_Individual_Review_ContactNumber_table")
    @Webelementname(name = "table_Individuals_Individual_Review_ContactNumber_table")
    public WebElement table_Individuals_Individual_Review_ContactNumber_table;

    @FindBy(xpath = "(//app-create-individuals//div[text()='Profile Information']//following-sibling::common_sub_table_view//table//tbody)[1]")
    @ElementName("table_Individuals_Individual_Review_ProfileInformation_table")
    @Webelementname(name = "table_Individuals_Individual_Review_ProfileInformation_table")
    public WebElement table_Individuals_Individual_Review_ProfileInformation_table;

    @FindBy(xpath = "(//app-create-individuals//div[text()='Document']//following-sibling::common_sub_table_view//table//tbody)[1]")
    @ElementName("table_Individuals_Individual_Review_Document_table")
    @Webelementname(name = "table_Individuals_Individual_Review_Document_table")
    public WebElement table_Individuals_Individual_Review_Document_table;

    @FindBy(xpath = "//app-create-individuals//div[text()='Eligibility Information']//following-sibling::app-inner-sub-view//div[contains(text(),'GrandFather Eligibility')]//parent::div//parent::div//app-form-field-value//span//span//span//span")
    @ElementName("text_Individuals_Individual_Review_EligibilityInformation_Eligibility")
    @Webelementname(name = "text_Individuals_Individual_Review_EligibilityInformation_Eligibility")
    public WebElement text_Individuals_Individual_Review_EligibilityInformation_Eligibility;

    @FindBy(xpath = "//app-create-individuals//div[text()='Eligibility Information']//following-sibling::app-inner-sub-view//div[contains(text(),'Olympic Eligibility')]//parent::div//parent::div//app-form-field-value//span//span//span//span")
    @ElementName("text_Individuals_Individual_Review_EligibilityInformation_OlympicEligibility")
    @Webelementname(name = "text_Individuals_Individual_Review_EligibilityInformation_OlympicEligibility")
    public WebElement text_Individuals_Individual_Review_EligibilityInformation_OlympicEligibility;

    @FindBy(xpath = "//app-create-individuals//div[text()='Eligibility Information']//following-sibling::app-inner-sub-view//div[contains(text(),'Team Eligibility')]//parent::div//parent::div//app-form-field-value//span//span//span//span")
    @ElementName("text_Individuals_Individual_Review_EligibilityInformation_TeamEligibility")
    @Webelementname(name = "text_Individuals_Individual_Review_EligibilityInformation_TeamEligibility")
    public WebElement text_Individuals_Individual_Review_EligibilityInformation_TeamEligibility;

    @FindBy(xpath = "//app-create-individuals//div[text()='Eligibility Information']//following-sibling::app-inner-sub-view//div[contains(text(),'WorldTitle Eligibility')]//parent::div//parent::div//app-form-field-value//span//span//span//span")
    @ElementName("text_Individuals_Individual_Review_EligibilityInformation_WorldTitleEligibility")
    @Webelementname(name = "text_Individuals_Individual_Review_EligibilityInformation_WorldTitleEligibility")
    public WebElement text_Individuals_Individual_Review_EligibilityInformation_WorldTitleEligibility;

    @FindBy(xpath = "//app-create-individuals//div[text()='Eligibility Information']//following-sibling::app-inner-sub-view//div[contains(text(),'WTT Eligibility')]//parent::div//parent::div//app-form-field-value//span//span//span//span")
    @ElementName("text_Individuals_Individual_Review_EligibilityInformation_WTTEligibility")
    @Webelementname(name = "text_Individuals_Individual_Review_EligibilityInformation_WTTEligibility")
    public WebElement text_Individuals_Individual_Review_EligibilityInformation_WTTEligibility;

    @FindBy(xpath = "//app-create-individuals//div[text()='Eligibility Information']//following-sibling::app-inner-sub-view//div[contains(text(),'Active')]//parent::div//parent::div//app-form-field-value//span//span//span//span")
    @ElementName("text_Individuals_Individual_Review_EligibilityInformation_Active")
    @Webelementname(name = "text_Individuals_Individual_Review_EligibilityInformation_Active")
    public WebElement text_Individuals_Individual_Review_EligibilityInformation_Active;

    @FindBy(xpath = "//app-create-individuals//div[text()='Player Profile']//following-sibling::app-inner-sub-view//div[text()='Current Out Of Competition Start Date ']//parent::div//parent::div//app-dateparse//span//span")
    @ElementName("text_Individuals_Individual_Review_PlayerProfile_CurrentOutOfCompetitionStartDate")
    @Webelementname(name = "text_Individuals_Individual_Review_PlayerProfile_CurrentOutOfCompetitionStartDate")
    public WebElement text_Individuals_Individual_Review_PlayerProfile_CurrentOutOfCompetitionStartDate;

    @FindBy(xpath = "//app-create-individuals//div[text()='Player Profile']//following-sibling::app-inner-sub-view//div[text()='Protected Ranking Activation Date ']//parent::div//parent::div//app-dateparse//span//span")
    @ElementName("text_Individuals_Individual_Review_PlayerProfile_ProtectedRankingActivationDate")
    @Webelementname(name = "text_Individuals_Individual_Review_PlayerProfile_ProtectedRankingActivationDate")
    public WebElement text_Individuals_Individual_Review_PlayerProfile_ProtectedRankingActivationDate;

    @FindBy(xpath = "//app-create-individuals//div[text()='Player Profile']//following-sibling::app-inner-sub-view//div[text()='Protected Ranking ']//parent::div//parent::div//app-form-field-value//span//span//span//span")
    @ElementName("text_Individuals_Individual_Review_PlayerProfile_ProtectedRanking")
    @Webelementname(name = "text_Individuals_Individual_Review_PlayerProfile_ProtectedRanking")
    public WebElement text_Individuals_Individual_Review_PlayerProfile_ProtectedRanking;

    @FindBy(xpath = "//app-create-individuals//div[text()='Player Profile']//following-sibling::app-inner-sub-view//div[text()='Protected Ranking Period In Months ']//parent::div//parent::div//app-form-field-value//span//span//span//span")
    @ElementName("text_Individuals_Individual_Review_PlayerProfile_ProtectedRankingPeriodInMonths")
    @Webelementname(name = "text_Individuals_Individual_Review_PlayerProfile_ProtectedRankingPeriodInMonths")
    public WebElement text_Individuals_Individual_Review_PlayerProfile_ProtectedRankingPeriodInMonths;

    @FindBy(xpath = "//app-create-individuals//div[text()='Player Profile']//following-sibling::app-inner-sub-view//div[text()='Protected Ranking No Of Events ']//parent::div//parent::div//app-form-field-value//span//span//span//span")
    @ElementName("text_Individuals_Individual_Review_PlayerProfile_ProtectedRankingNoOfEvents")
    @Webelementname(name = "text_Individuals_Individual_Review_PlayerProfile_ProtectedRankingNoOfEvents")
    public WebElement text_Individuals_Individual_Review_PlayerProfile_ProtectedRankingNoOfEvents;

    @FindBy(xpath = "//app-create-individuals//div[text()='Player Profile']//following-sibling::app-inner-sub-view//div[text()='Protected Ranking Remaining No Of Months ']//parent::div//parent::div//app-form-field-value//span//span//span//span")
    @ElementName("text_Individuals_Individual_Review_PlayerProfile_ProtectedRankingRemainingNoOfMonths")
    @Webelementname(name = "text_Individuals_Individual_Review_PlayerProfile_ProtectedRankingRemainingNoOfMonths")
    public WebElement text_Individuals_Individual_Review_PlayerProfile_ProtectedRankingRemainingNoOfMonths;

    @FindBy(xpath = "//app-create-individuals//div[text()='Player Profile']//following-sibling::app-inner-sub-view//div[text()='Protected Ranking Points ']//parent::div//parent::div//app-form-field-value//span//span//span//span")
    @ElementName("text_Individuals_Individual_Review_PlayerProfile_ProtectedRankingPoints")
    @Webelementname(name = "text_Individuals_Individual_Review_PlayerProfile_ProtectedRankingPoints")
    public WebElement text_Individuals_Individual_Review_PlayerProfile_ProtectedRankingPoints;

    @FindBy(xpath = "//app-create-individuals//div[text()='Player Profile']//following-sibling::app-inner-sub-view//div[text()='Number Of Zero Point Penalties Incurred ']//parent::div//parent::div//app-form-field-value//span//span//span//span")
    @ElementName("text_Individuals_Individual_Review_PlayerProfile_NumberOfZeroPointPenaltiesIncurred")
    @Webelementname(name = "text_Individuals_Individual_Review_PlayerProfile_NumberOfZeroPointPenaltiesIncurred")
    public WebElement text_Individuals_Individual_Review_PlayerProfile_NumberOfZeroPointPenaltiesIncurred;

    @FindBy(xpath = "//app-create-individuals//div[text()='Player Profile']//following-sibling::app-inner-sub-view//div[text()='Penalty Point Incurrent Ranking Week ']//parent::div//parent::div//app-form-field-value//span//span//span//span")
    @ElementName("text_Individuals_Individual_Review_PlayerProfile_PenaltyPointIncurrentRankingWeek")
    @Webelementname(name = "text_Individuals_Individual_Review_PlayerProfile_PenaltyPointIncurrentRankingWeek")
    public WebElement text_Individuals_Individual_Review_PlayerProfile_PenaltyPointIncurrentRankingWeek;

    @FindBy(xpath = "//app-create-individuals//div[text()='Player Profile']//following-sibling::app-inner-sub-view//div[text()='Penalty Point Incurrent Ranking Month ']//parent::div//parent::div//app-form-field-value//span//span//span//span")
    @ElementName("text_Individuals_Individual_Review_PlayerProfile_PenaltyPointIncurrentRankingMonth")
    @Webelementname(name = "text_Individuals_Individual_Review_PlayerProfile_PenaltyPointIncurrentRankingMonth")
    public WebElement text_Individuals_Individual_Review_PlayerProfile_PenaltyPointIncurrentRankingMonth;

    @FindBy(xpath = "//app-create-individuals//div[text()='Player Profile']//following-sibling::app-inner-sub-view//div[text()='Penalty Point Incurrent Ranking Year ']//parent::div//parent::div//app-form-field-value//span//span//span//span")
    @ElementName("text_Individuals_Individual_Review_PlayerProfile_PenaltyPointIncurrentRankingYear")
    @Webelementname(name = "text_Individuals_Individual_Review_PlayerProfile_PenaltyPointIncurrentRankingYear")
    public WebElement text_Individuals_Individual_Review_PlayerProfile_PenaltyPointIncurrentRankingYear;

    @FindBy(xpath = "//app-create-individuals//div[text()='Player Profile']//following-sibling::app-inner-sub-view//div[text()='Hand ']//parent::div//parent::div//app-form-field-value//span//span//span//span")
    @ElementName("text_Individuals_Individual_Review_PlayerProfile_Hand")
    @Webelementname(name = "text_Individuals_Individual_Review_PlayerProfile_Hand")
    public WebElement text_Individuals_Individual_Review_PlayerProfile_Hand;

    @FindBy(xpath = "//app-create-individuals//div[text()='Player Profile']//following-sibling::app-inner-sub-view//div[text()='Grip ']//parent::div//parent::div//app-form-field-value//span//span//span//span")
    @ElementName("text_Individuals_Individual_Review_PlayerProfile_Grip")
    @Webelementname(name = "text_Individuals_Individual_Review_PlayerProfile_Grip")
    public WebElement text_Individuals_Individual_Review_PlayerProfile_Grip;

    @FindBy(xpath = "//app-create-individuals//div[text()='Player Profile']//following-sibling::app-inner-sub-view//div[text()='Zero Point Penalty Expiry Date ']//parent::div//parent::div//app-dateparse//span//span")
    @ElementName("text_Individuals_Individual_Review_PlayerProfile_ZeroPointPenaltyExpiryDate")
    @Webelementname(name = "text_Individuals_Individual_Review_PlayerProfile_ZeroPointPenaltyExpiryDate")
    public WebElement text_Individuals_Individual_Review_PlayerProfile_ZeroPointPenaltyExpiryDate;

    @FindBy(xpath = "//app-create-individuals//div[text()='Medical Information']//following-sibling::app-inner-sub-view//div[text()='Status ']//parent::div//parent::div//app-form-field-value//span//span//span//span")
    @ElementName("text_Individuals_Individual_Review_MedicalInformation_Status")
    @Webelementname(name = "text_Individuals_Individual_Review_MedicalInformation_Status")
    public WebElement text_Individuals_Individual_Review_MedicalInformation_Status;

    @FindBy(xpath = "//app-create-individuals//div[text()='Medical Information']//following-sibling::app-inner-sub-view//div[text()='No of Vaccination ']//parent::div//parent::div//app-form-field-value//span//span//span//span")
    @ElementName("text_Individuals_Individual_Review_MedicalInformation_NoofVaccination")
    @Webelementname(name = "text_Individuals_Individual_Review_MedicalInformation_NoofVaccination")
    public WebElement text_Individuals_Individual_Review_MedicalInformation_NoofVaccination;

    @FindBy(xpath = "//app-create-individuals//div[text()='Medical Information']//following-sibling::app-inner-sub-view//div[text()='Certificate ']//parent::div//parent::div//app-form-field-value//span//span//span//span")
    @ElementName("text_Individuals_Individual_Review_MedicalInformation_Certificate")
    @Webelementname(name = "text_Individuals_Individual_Review_MedicalInformation_Certificate")
    public WebElement text_Individuals_Individual_Review_MedicalInformation_Certificate;

    @FindBy(xpath = "//app-create-individuals//div[text()='Medical Information']//following-sibling::app-inner-sub-view//div[text()='Date of Last Vaccination ']//parent::div//parent::div//app-dateparse//span//span")
    @ElementName("text_Individuals_Individual_Review_MedicalInformation_DateofLastVaccination")
    @Webelementname(name = "text_Individuals_Individual_Review_MedicalInformation_DateofLastVaccination")
    public WebElement text_Individuals_Individual_Review_MedicalInformation_DateofLastVaccination;


















}
