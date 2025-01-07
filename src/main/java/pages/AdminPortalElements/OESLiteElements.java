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

    @FindBy(xpath = "((//app-events-preview//app-oes-lite-subevents//mat-tab-group//mat-tab-header)[1]//div[@class='mat-tab-label-content'])[1]")
    @ElementName("tab_OESlite_common_subeventsheaderfirsttab")
    @Webelementname(name = "tab_OESlite_common_subeventsheaderfirsttab")
    public WebElement tab_OESlite_common_subeventsheaderfirsttab;

    @FindBy(xpath = "(((//app-events-preview//app-oes-lite-subevents//mat-tab-group//mat-tab-header)[1]//div[@class='mat-tab-label-content' and contains(text(),'Doubles')]))[1]")
    @ElementName("tab_OESlite_common_subeventsheaderfirsttabofdoubles")
    @Webelementname(name = "tab_OESlite_common_subeventsheaderfirsttabofdoubles")
    public WebElement tab_OESlite_common_subeventsheaderfirsttabofdoubles;

    @FindBy(xpath = "((//app-events-preview//app-oes-lite-subevents//mat-tab-group//mat-tab-header)[1]//div[@class='mat-tab-label-content' and contains(text(),'Mixed Doubles')])")
    @ElementName("tab_OESlite_common_subeventsheadermixeddoubles")
    @Webelementname(name = "tab_OESlite_common_subeventsheadermixeddoubles")
    public WebElement tab_OESlite_common_subeventsheadermixeddoubles;

    @FindBy(xpath = "(((//app-events-preview//app-oes-lite-subevents//mat-tab-group//mat-tab-header)[1]//div[@class='mat-tab-label-content' and contains(text(),'Teams')]))[1]")
    @ElementName("tab_OESlite_common_subeventsheaderfirsttabofteams")
    @Webelementname(name = "tab_OESlite_common_subeventsheaderfirsttabofteams")
    public WebElement tab_OESlite_common_subeventsheaderfirsttabofteams;

    @FindBy(xpath = "(//app-events-preview//app-oes-lite-subevents//mat-tab-group//mat-tab-header)[2]")
    @ElementName("tab_OESlite_common_subeventsroundsheader")
    @Webelementname(name = "tab_OESlite_common_subeventsroundsheader")
    public WebElement tab_OESlite_common_subeventsroundsheader;

    @FindBy(xpath = "(//app-events-preview//app-oes-lite-subevents//mat-tab-group//mat-tab-header)[2]//div[@class='mat-tab-label-content' and text()='Main Draw']")
    @ElementName("tab_OESlite_common_subeventsroundsheaderMainDrawtab")
    @Webelementname(name = "tab_OESlite_common_subeventsroundsheaderMainDrawtab")
    public WebElement tab_OESlite_common_subeventsroundsheaderMainDrawtab;

    @FindBy(xpath = "(//app-events-preview//app-oes-lite-subevents//mat-tab-group//mat-tab-header)[2]//div[@class='mat-tab-label-content' and text()='Qualification Draw']")
    @ElementName("tab_OESlite_common_subeventsroundsheaderQualificationDrawtab")
    @Webelementname(name = "tab_OESlite_common_subeventsroundsheaderQualificationDrawtab")
    public WebElement tab_OESlite_common_subeventsroundsheaderQualificationDrawtab;

    @FindBy(xpath = "(//app-events-preview//app-oes-lite-subevents//mat-tab-group//mat-tab-header)[2]//div[@class='mat-tab-label-content' and text()='Waiting List']")
    @ElementName("tab_OESlite_common_subeventsroundsheaderWaitingListtab")
    @Webelementname(name = "tab_OESlite_common_subeventsroundsheaderWaitingListtab")
    public WebElement tab_OESlite_common_subeventsroundsheaderWaitingListtab;


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

    @FindBy(xpath = "//div[@class='mat-menu-content']//button[text()='Mark as Published']")
    @ElementName("button_OESlite_common_subeventsrounds_action_MarkasPublished")
    @Webelementname(name = "button_OESlite_common_subeventsrounds_action_MarkasPublished")
    public WebElement button_OESlite_common_subeventsrounds_action_MarkasPublished;

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

    @FindBy(xpath = "//mat-dialog-container//b[text()='WC']//following-sibling::input[@type='checkbox']")
    @ElementName("checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_WC")
    @Webelementname(name = "checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_WC")
    public WebElement checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_WC;

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
    @ElementName("button_OESlite_reports_common_SortBysortfields")
    @Webelementname(name = "button_OESlite_reports_common_SortBysortfields")
    public WebElement button_OESlite_reports_common_SortBysortfields;

    @FindBy(xpath = "(//app-events-preview//app-oes-lite-subevents//span[text()='Sort By:']//parent::div//parent::div//mat-select)[2]")
    @ElementName("button_OESlite_reports_common_SortByorderby")
    @Webelementname(name = "button_OESlite_reports_common_SortByorderby")
    public WebElement button_OESlite_reports_common_SortByorderby;

    @FindBy(xpath = "//div[@class='cdk-overlay-pane']/div//div//mat-option//span[text()='ASC']")
    @ElementName("button_OESlite_reports_common_SortByorderby_ASC")
    @Webelementname(name = "button_OESlite_reports_common_SortByorderby_ASC")
    public WebElement button_OESlite_reports_common_SortByorderby_ASC;

    @FindBy(xpath = "//div[@class='cdk-overlay-pane']/div//div//mat-option//span[text()='DESC']")
    @ElementName("button_OESlite_reports_common_SortByorderby_DESC")
    @Webelementname(name = "button_OESlite_reports_common_SortByorderby_DESC")
    public WebElement button_OESlite_reports_common_SortByorderby_DESC;


    @FindBy(xpath = "//app-events-preview//app-oes-lite-subevents//input[@type='search']")
    @ElementName("text_OESlite_reports_common_searchfield")
    @Webelementname(name = "text_OESlite_reports_common_searchfield")
    public WebElement text_OESlite_reports_common_searchfield;

    @FindBy(xpath = "//app-events-preview//app-oes-lite-subevents//mat-select[@placeholder='Select Visible Fields']")
    @ElementName("button_OESlite_common_SelectVisibleFields")
    @Webelementname(name = "button_OESlite_common_SelectVisibleFields")
    public WebElement button_OESlite_common_SelectVisibleFields;

    @FindBy(xpath = "//app-events-preview//app-oes-lite-subevents//button[@mattooltip='Download as Excel']")
    @ElementName("button_OESlite_common_DownloadasExcel")
    @Webelementname(name = "button_OESlite_common_DownloadasExcel")
    public WebElement button_OESlite_common_DownloadasExcel;

    @FindBy(xpath = "//app-events-preview//app-oes-lite-subevents//button[@mattooltip='Download as PDF']")
    @ElementName("button_OESlite_common_DownloadasPDF")
    @Webelementname(name = "button_OESlite_common_DownloadasPDF")
    public WebElement button_OESlite_common_DownloadasPDF;


    @FindBy(xpath = "//app-events-preview//app-oes-lite-subevents//table//tbody")
    @ElementName("table_OESlite_reports_EntriesCountPerSubEvent_table")
    @Webelementname(name = "table_OESlite_reports_EntriesCountPerSubEvent_table")
    public WebElement table_OESlite_reports_EntriesCountPerSubEvent_table;

    @FindBy(xpath = "//app-events-preview//app-oes-lite-subevents//table//tbody")
    @ElementName("table_OESlite_reports_common_table")
    @Webelementname(name = "table_OESlite_reports_common_table")
    public WebElement table_OESlite_reports_common_table;

    @FindBy(xpath = "//app-events-preview//app-oes-lite-subevents//table//tbody//td[1]")
    @ElementName("table_OESlite_reports_common_tablefirstrowfirtcolumndata")
    @Webelementname(name = "table_OESlite_reports_common_tablefirstrowfirtcolumndata")
    public WebElement table_OESlite_reports_common_tablefirstrowfirtcolumndata;

    @FindBy(xpath = "//app-events-preview//app-oes-lite-subevents//table//tbody//td[1]//div[@class='empty-text']")
    @ElementName("table_OESlite_reports_common_nodataavailable")
    @Webelementname(name = "table_OESlite_reports_common_nodataavailable")
    public WebElement table_OESlite_reports_common_nodataavailable;

    @FindBy(xpath = "//app-events-preview//img[@class='report-filter-icon']")
    @ElementName("button_OESlite_reports_common_clearfilter")
    @Webelementname(name = "button_OESlite_reports_common_clearfilter")
    public WebElement button_OESlite_reports_common_clearfilter;

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

    @FindBy(xpath = "//ngx-mat-select-search//parent::div")
    @ElementName("container_OESlite_reports_commonpopupwindow")
    @Webelementname(name = "container_OESlite_reports_commonpopupwindow")
    public WebElement container_OESlite_reports_commonpopupwindow;

    @FindBy(xpath = "//ngx-mat-select-search//input[@type='text']")
    @ElementName("text_OESlite_reports_commonpopupwindowsearchfield")
    @Webelementname(name = "text_OESlite_reports_commonpopupwindowsearchfield")
    public WebElement text_OESlite_reports_commonpopupwindowsearchfield;

    @FindBy(xpath = "//div[@class='cdk-overlay-pane']/div//div")
    @ElementName("container_OESlite_reports_commonpopupwindow1")
    @Webelementname(name = "container_OESlite_reports_commonpopupwindow1")
    public WebElement container_OESlite_reports_commonpopupwindow1;

    @FindBy(xpath = "//app-events-preview//app-oes-lite-subevents")
    @ElementName("frame_common_OESlite")
    @Webelementname(name = "frame_common_OESlite")
    public WebElement frame_common_OESlite;


}
