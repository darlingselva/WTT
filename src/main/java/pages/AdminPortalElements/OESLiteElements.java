package pages.AdminPortalElements;

import base.Webelementname;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pageobjectconfiguration.ElementName;

public class OESLiteElements {

    WebDriver driver;
    public OESLiteElements(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);  // Initialize WebElements using PageFactory
    }

    @FindBy(xpath = "//ngx-mat-select-search//input[@type='text']")
    @ElementName("text_OESlite_common_optionpopupwindow_searchfield")
    @Webelementname(name = "text_OESlite_common_optionpopupwindow_searchfield")
    public WebElement text_OESlite_common_optionpopupwindow_searchfield;

    @FindBy(xpath = "(//app-events-preview//app-oes-lite-subevents//mat-tab-group//mat-tab-header)[1]")
    @ElementName("tab_OESlite_common_subeventsheader")
    @Webelementname(name = "tab_OESlite_common_subeventsheader")
    public WebElement tab_OESlite_common_subeventsheader;

    @FindBy(xpath = "(//app-events-preview//app-oes-lite-subevents//mat-tab-group//mat-tab-header)[2]")
    @ElementName("tab_OESlite_common_subeventsroundsheader")
    @Webelementname(name = "tab_OESlite_common_subeventsroundsheader")
    public WebElement tab_OESlite_common_subeventsroundsheader;

    @FindBy(xpath = "(//app-events-preview//app-oes-lite-subevents//mat-tab-group//mat-tab-header)[1]//div[@class='mat-tab-label-content' and text()='Reports']")
    @ElementName("tab_OESlite_common_subeventsheader_reports")
    @Webelementname(name = "tab_OESlite_common_subeventsheader_reports")
    public WebElement tab_OESlite_common_subeventsheader_reports;

    @FindBy(xpath = "//app-events-preview//app-oes-lite-subevents//button//span[contains(text(),'Actions')]")
    @ElementName("button_OESlite_common_subeventsrounds_action")
    @Webelementname(name = "button_OESlite_common_subeventsrounds_action")
    public WebElement button_OESlite_common_subeventsrounds_action;

    @FindBy(xpath = "//div[@class='mat-menu-content']//button[text()='Import Records']")
    @ElementName("button_OESlite_common_subeventsrounds_action_ImportRecords")
    @Webelementname(name = "button_OESlite_common_subeventsrounds_action_ImportRecords")
    public WebElement button_OESlite_common_subeventsrounds_action_ImportRecords;

    @FindBy(xpath = "//div[@class='mat-menu-content']//button[text()='Export as Excel']")
    @ElementName("button_OESlite_common_subeventsrounds_action_ExportasExcel")
    @Webelementname(name = "button_OESlite_common_subeventsrounds_action_ExportasExcel")
    public WebElement button_OESlite_common_subeventsrounds_action_ExportasExcel;

    @FindBy(xpath = "//div[@class='mat-menu-content']//button[text()='Export as PDF']")
    @ElementName("button_OESlite_common_subeventsrounds_action_ExportasPDF")
    @Webelementname(name = "button_OESlite_common_subeventsrounds_action_ExportasPDF")
    public WebElement button_OESlite_common_subeventsrounds_action_ExportasPDF;

    @FindBy(xpath = "//div[@class='mat-menu-content']//button[text()='Delete Entries']")
    @ElementName("button_OESlite_common_subeventsrounds_action_DeleteEntries")
    @Webelementname(name = "button_OESlite_common_subeventsrounds_action_DeleteEntries")
    public WebElement button_OESlite_common_subeventsrounds_action_DeleteEntries;

    @FindBy(xpath = "//div[@class='mat-menu-content']//button[text()='Rollback to Draft']")
    @ElementName("button_OESlite_common_subeventsrounds_action_RollbacktoDraft")
    @Webelementname(name = "button_OESlite_common_subeventsrounds_action_RollbacktoDraft")
    public WebElement button_OESlite_common_subeventsrounds_action_RollbacktoDraft;

    @FindBy(xpath = "//mat-dialog-container//button[text()='Download Import Template']")
    @ElementName("button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_DownloadImportTemplate")
    @Webelementname(name = "button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_DownloadImportTemplate")
    public WebElement button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_DownloadImportTemplate;


    @FindBy(xpath = "//mat-dialog-container//button[text()='Download Para Event Import Template']")
    @ElementName("button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_DownloadParaEventImportTemplate")
    @Webelementname(name = "button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_DownloadParaEventImportTemplate")
    public WebElement button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_DownloadParaEventImportTemplate;

    @FindBy(xpath = "//mat-dialog-container//label[text()=' Choose File (.xlsx) ']")
    @ElementName("file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile")
    @Webelementname(name = "file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile")
    public WebElement file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile;

    @FindBy(xpath = "//mat-dialog-container//b[text()='Skip All']//following-sibling::input[@type='checkbox']")
    @ElementName("checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll")
    @Webelementname(name = "checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll")
    public WebElement checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll;

    @FindBy(xpath = "//mat-dialog-container//b[text()='Draw Size']//following-sibling::input[@type='checkbox']")
    @ElementName("checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_DrawSize")
    @Webelementname(name = "checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_DrawSize")
    public WebElement checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_DrawSize;

    @FindBy(xpath = "//mat-dialog-container//b[text()='AER']//following-sibling::input[@type='checkbox']")
    @ElementName("checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_AER")
    @Webelementname(name = "checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_AER")
    public WebElement checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_AER;

    @FindBy(xpath = "//mat-dialog-container//b[text()='NER']//following-sibling::input[@type='checkbox']")
    @ElementName("checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_NER")
    @Webelementname(name = "checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_NER")
    public WebElement checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_NER;

    @FindBy(xpath = "//mat-dialog-container//b[text()='WTT']//following-sibling::input[@type='checkbox']")
    @ElementName("checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_WTT")
    @Webelementname(name = "checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_WTT")
    public WebElement checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_WTT;

    @FindBy(xpath = "//mat-dialog-container//b[text()='WYN']//following-sibling::input[@type='checkbox']")
    @ElementName("checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_WYN")
    @Webelementname(name = "checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_WYN")
    public WebElement checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_WYN;

    @FindBy(xpath = "//mat-dialog-container//b[text()='QUAL']//following-sibling::input[@type='checkbox']")
    @ElementName("checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_QUAL")
    @Webelementname(name = "checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_QUAL")
    public WebElement checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_QUAL;


    @FindBy(xpath = "//mat-dialog-container//b[text()='CWR']//following-sibling::input[@type='checkbox']")
    @ElementName("checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_CWR")
    @Webelementname(name = "checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_CWR")
    public WebElement checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_CWR;


    @FindBy(xpath = "//mat-dialog-container//b[text()='PDR']//following-sibling::input[@type='checkbox']")
    @ElementName("checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_PDR")
    @Webelementname(name = "checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_PDR")
    public WebElement checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_PDR;


    @FindBy(xpath = "//mat-dialog-container//b[text()='HOST_NER']//following-sibling::input[@type='checkbox']")
    @ElementName("checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_HOST_NER")
    @Webelementname(name = "checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_HOST_NER")
    public WebElement checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_HOST_NER;

    @FindBy(xpath = "//mat-dialog-container//b[text()='HOST_NER_TotalPairs']//following-sibling::input[@type='checkbox']")
    @ElementName("checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_HOST_NER_TotalPairs")
    @Webelementname(name = "checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_HOST_NER_TotalPairs")
    public WebElement checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_HOST_NER_TotalPairs;

    @FindBy(xpath = "//mat-dialog-container//b[text()='HOST_NER_MIXPairs']//following-sibling::input[@type='checkbox']")
    @ElementName("checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_HOST_NER_MIXPairs")
    @Webelementname(name = "checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_HOST_NER_MIXPairs")
    public WebElement checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_HOST_NER_MIXPairs;

    @FindBy(xpath = "//mat-dialog-container//button//span[contains(text(),'Import Records')]")
    @ElementName("button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords")
    @Webelementname(name = "button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords")
    public WebElement button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords;

    @FindBy(xpath = "//mat-dialog-container//button//span[contains(text(),'Cancel')]")
    @ElementName("button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_Cancel")
    @Webelementname(name = "button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_Cancel")
    public WebElement button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_Cancel;

//common fields report tabs
    @FindBy(xpath = "//app-events-preview//app-oes-lite-subevents//span[text()='Sort By:']//parent::div//parent::div//mat-select[@placeholder='Select Field']")
    @ElementName("button_OESlite_reports_EntriesCountPerSubEvent_SortBysortfields")
    @Webelementname(name = "button_OESlite_reports_EntriesCountPerSubEvent_SortBysortfields")
    public WebElement button_OESlite_reports_common_SortBysortfields;

    @FindBy(xpath = "(//app-events-preview//app-oes-lite-subevents//span[text()='Sort By:']//parent::div//parent::div//mat-select)[2]")
    @ElementName("button_OESlite_reports_EntriesCountPerSubEvent_SortByorderby")
    @Webelementname(name = "button_OESlite_reports_EntriesCountPerSubEvent_SortByorderby")
    public WebElement button_OESlite_reports_common_SortByorderby;

    @FindBy(xpath = "//app-events-preview//app-oes-lite-subevents//input[@type='search']")
    @ElementName("tab_OESlite_reports_common_searchfield")
    @Webelementname(name = "tab_OESlite_reports_common_searchfield")
    public WebElement tab_OESlite_reports_common_searchfield;

    @FindBy(xpath = "//app-events-preview//app-oes-lite-subevents//mat-select[@placeholder='Select Visible Fields']")
    @ElementName("button_OESlite_common_SelectVisibleFields")
    @Webelementname(name = "button_OESlite_common_SelectVisibleFields")
    public WebElement button_OESlite_common_SelectVisibleFields;

    @FindBy(xpath = "//app-events-preview//app-oes-lite-subevents//button[@mattooltip='Download as Excel']")
    @ElementName("button_OESlite_reports_EntriesCountPerSubEvent_DownloadasExcel")
    @Webelementname(name = "button_OESlite_reports_EntriesCountPerSubEvent_DownloadasExcel")
    public WebElement button_OESlite_common_DownloadasExcel;

    @FindBy(xpath = "//app-events-preview//app-oes-lite-subevents//button[@mattooltip='Download as PDF']")
    @ElementName("button_OESlite_reports_EntriesCountPerSubEvent_DownloadasPDF")
    @Webelementname(name = "button_OESlite_reports_EntriesCountPerSubEvent_DownloadasPDF")
    public WebElement button_OESlite_common_DownloadasPDF;


    @FindBy(xpath = "//app-events-preview//app-oes-lite-subevents//table//tbody")
    @ElementName("table_OESlite_reports_EntriesCountPerSubEvent_table")
    @Webelementname(name = "table_OESlite_reports_EntriesCountPerSubEvent_table")
    public WebElement table_OESlite_reports_common_table;

 //specific elements for report tabs

    @FindBy(xpath = "(//app-events-preview//app-oes-lite-subevents//mat-tab-group//mat-tab-header)[2]//div[@class='mat-tab-label-content' and text()='Entries Count Per Sub-Event']")
    @ElementName("tab_OESlite_reports_EntriesCountPerSubEvent")
    @Webelementname(name = "tab_OESlite_reports_EntriesCountPerSubEvent")
    public WebElement tab_OESlite_reports_EntriesCountPerSubEvent;

    @FindBy(xpath = "//app-events-preview//app-oes-lite-subevents//div[text()='Sub Event']//parent::div//parent::div//mat-select")
    @ElementName("button_OESlite_reports_EntriesCountPerSubEvent_SubEvent")
    @Webelementname(name = "button_OESlite_reports_EntriesCountPerSubEvent_SubEvent")
    public WebElement button_OESlite_reports_EntriesCountPerSubEvent_SubEvent;

//    @FindBy(xpath = "//app-events-preview//app-oes-lite-subevents//span[text()='Sort By:']//parent::div//parent::div//mat-select[@placeholder='Select Field']")
//    @ElementName("button_OESlite_reports_EntriesCountPerSubEvent_SortBysortfields")
//    @Webelementname(name = "button_OESlite_reports_EntriesCountPerSubEvent_SortBysortfields")
//    public WebElement button_OESlite_reports_EntriesCountPerSubEvent_SortBysortfields;
//
//    @FindBy(xpath = "(//app-events-preview//app-oes-lite-subevents//span[text()='Sort By:']//parent::div//parent::div//mat-select)[2]")
//    @ElementName("button_OESlite_reports_EntriesCountPerSubEvent_SortByorderby")
//    @Webelementname(name = "button_OESlite_reports_EntriesCountPerSubEvent_SortByorderby")
//    public WebElement button_OESlite_reports_EntriesCountPerSubEvent_SortByorderby;

//    @FindBy(xpath = "//app-events-preview//app-oes-lite-subevents//mat-select[@placeholder='Select Visible Fields']")
//    @ElementName("button_OESlite_reports_EntriesCountPerSubEvent_SelectVisibleFields")
//    @Webelementname(name = "button_OESlite_reports_EntriesCountPerSubEvent_SelectVisibleFields")
//    public WebElement button_OESlite_reports_EntriesCountPerSubEvent_SelectVisibleFields;


//    @FindBy(xpath = "//app-events-preview//app-oes-lite-subevents//button[@mattooltip='Download as Excel']")
//    @ElementName("button_OESlite_reports_EntriesCountPerSubEvent_DownloadasExcel")
//    @Webelementname(name = "button_OESlite_reports_EntriesCountPerSubEvent_DownloadasExcel")
//    public WebElement button_OESlite_reports_EntriesCountPerSubEvent_DownloadasExcel;
//
//    @FindBy(xpath = "//app-events-preview//app-oes-lite-subevents//button[@mattooltip='Download as PDF']")
//    @ElementName("button_OESlite_reports_EntriesCountPerSubEvent_DownloadasPDF")
//    @Webelementname(name = "button_OESlite_reports_EntriesCountPerSubEvent_DownloadasPDF")
//    public WebElement button_OESlite_reports_EntriesCountPerSubEvent_DownloadasPDF;
//
//
//    @FindBy(xpath = "//app-events-preview//app-oes-lite-subevents//table//tbody")
//    @ElementName("table_OESlite_reports_EntriesCountPerSubEvent_table")
//    @Webelementname(name = "table_OESlite_reports_EntriesCountPerSubEvent_table")
//    public WebElement table_OESlite_reports_EntriesCountPerSubEvent_table;

    @FindBy(xpath = "(//app-events-preview//app-oes-lite-subevents//mat-tab-group//mat-tab-header)[2]//div[@class='mat-tab-label-content' and text()='Entries Count per Member Association per Sub-Event']")
    @ElementName("tab_OESlite_reports_EntriesCountperMemberAssociationperSubEvent")
    @Webelementname(name = "tab_OESlite_reports_EntriesCountperMemberAssociationperSubEvent")
    public WebElement tab_OESlite_reports_EntriesCountperMemberAssociationperSubEvent;

    @FindBy(xpath = "//app-events-preview//app-oes-lite-subevents//div[text()='Organization']//parent::div//parent::div//mat-select")
    @ElementName("button_OESlite_reports_EntriesCountperMemberAssociationperSubEvent_Organization")
    @Webelementname(name = "button_OESlite_reports_EntriesCountperMemberAssociationperSubEvent_Organization")
    public WebElement button_OESlite_reports_EntriesCountperMemberAssociationperSubEvent_Organization;

//    @FindBy(xpath = "//app-events-preview//app-oes-lite-subevents//span[text()='Sort By:']//parent::div//parent::div//mat-select[@placeholder='Select Field']")
//    @ElementName("button_OESlite_reports_EntriesCountperMemberAssociationperSubEvent_SortBysortfields")
//    @Webelementname(name = "button_OESlite_reports_EntriesCountperMemberAssociationperSubEvent_SortBysortfields")
//    public WebElement button_OESlite_reports_EntriesCountperMemberAssociationperSubEvent_SortBysortfields;
//
//    @FindBy(xpath = "(//app-events-preview//app-oes-lite-subevents//span[text()='Sort By:']//parent::div//parent::div//mat-select)[2]")
//    @ElementName("button_OESlite_reports_EntriesCountperMemberAssociationperSubEvent_SortByorderby")
//    @Webelementname(name = "button_OESlite_reports_EntriesCountperMemberAssociationperSubEvent_SortByorderby")
//    public WebElement button_OESlite_reports_EntriesCountperMemberAssociationperSubEvent_SortByorderby;


    @FindBy(xpath = "(//app-events-preview//app-oes-lite-subevents//mat-tab-group//mat-tab-header)[2]//div[@class='mat-tab-label-content' and text()='Player Entries by Sub-Event']")
    @ElementName("tab_OESlite_reports_PlayerEntriesbySubEvent")
    @Webelementname(name = "tab_OESlite_reports_PlayerEntriesbySubEvent")
    public WebElement tab_OESlite_reports_PlayerEntriesbySubEvent;


    @FindBy(xpath = "//app-events-preview//app-oes-lite-subevents//div[text()='Name']//parent::div//mat-select")
    @ElementName("button_OESlite_reports_PlayerEntriesbySubEvent_Name")
    @Webelementname(name = "button_OESlite_reports_PlayerEntriesbySubEvent_Name")
    public WebElement button_OESlite_reports_PlayerEntriesbySubEvent_Name;

    @FindBy(xpath = "//app-events-preview//app-oes-lite-subevents//div[text()='Organization']//parent::div//mat-select")
    @ElementName("button_OESlite_reports_PlayerEntriesbySubEvent_Organization")
    @Webelementname(name = "button_OESlite_reports_PlayerEntriesbySubEvent_Organization")
    public WebElement button_OESlite_reports_PlayerEntriesbySubEvent_Organization;

    @FindBy(xpath = "//app-events-preview//app-oes-lite-subevents//div[text()='Singles']//parent::div//mat-select")
    @ElementName("button_OESlite_reports_PlayerEntriesbySubEvent_Singles")
    @Webelementname(name = "button_OESlite_reports_PlayerEntriesbySubEvent_Singles")
    public WebElement button_OESlite_reports_PlayerEntriesbySubEvent_Singles;

    @FindBy(xpath = "//app-events-preview//app-oes-lite-subevents//div[text()='Doubles']//parent::div//mat-select")
    @ElementName("button_OESlite_reports_PlayerEntriesbySubEvent_Doubles")
    @Webelementname(name = "button_OESlite_reports_PlayerEntriesbySubEvent_Doubles")
    public WebElement button_OESlite_reports_PlayerEntriesbySubEvent_Doubles;

    @FindBy(xpath = "//app-events-preview//app-oes-lite-subevents//div[text()='Mixed Doubles']//parent::div//mat-select")
    @ElementName("button_OESlite_reports_PlayerEntriesbySubEvent_MixedDoubles")
    @Webelementname(name = "button_OESlite_reports_PlayerEntriesbySubEvent_MixedDoubles")
    public WebElement button_OESlite_reports_PlayerEntriesbySubEvent_MixedDoubles;

    @FindBy(xpath = "//app-events-preview//app-oes-lite-subevents//div[text()='Teams']//parent::div//mat-select")
    @ElementName("button_OESlite_reports_PlayerEntriesbySubEvent_Teams")
    @Webelementname(name = "button_OESlite_reports_PlayerEntriesbySubEvent_Teams")
    public WebElement button_OESlite_reports_PlayerEntriesbySubEvent_Teams;


    @FindBy(xpath = "(//app-events-preview//app-oes-lite-subevents//mat-tab-group//mat-tab-header)[2]//div[@class='mat-tab-label-content' and text()='Player Entry Report']")
    @ElementName("tab_OESlite_reports_PlayerEntryReport")
    @Webelementname(name = "tab_OESlite_reports_PlayerEntryReport")
    public WebElement tab_OESlite_reports_PlayerEntryReport;

    @FindBy(xpath = "//app-events-preview//app-oes-lite-subevents//div[text()='SubEvent']//parent::div//mat-select")
    @ElementName("button_OESlite_reports_PlayerEntryReport_SubEvent")
    @Webelementname(name = "button_OESlite_reports_PlayerEntryReport_SubEvent")
    public WebElement button_OESlite_reports_PlayerEntryReport_SubEvent;

    @FindBy(xpath = "//app-events-preview//app-oes-lite-subevents//div[text()='EntryDrawName']//parent::div//mat-select")
    @ElementName("button_OESlite_reports_PlayerEntryReport_EntryDrawName")
    @Webelementname(name = "button_OESlite_reports_PlayerEntryReport_EntryDrawName")
    public WebElement button_OESlite_reports_PlayerEntryReport_EntryDrawName;

    @FindBy(xpath = "//app-events-preview//app-oes-lite-subevents//div[text()='EntryQuotaType']//parent::div//mat-select")
    @ElementName("button_OESlite_reports_PlayerEntryReport_EntryQuotaType")
    @Webelementname(name = "button_OESlite_reports_PlayerEntryReport_EntryQuotaType")
    public WebElement button_OESlite_reports_PlayerEntryReport_EntryQuotaType;


}