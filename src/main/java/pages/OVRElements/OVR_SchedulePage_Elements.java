package pages.OVRElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageobjectconfiguration.ElementName;

public class OVR_SchedulePage_Elements {

    @FindBy(xpath = "//a[@href='/schedule']")
    @ElementName("OVR_ScheduleBtn")
    public WebElement OVR_ScheduleBtn;
    @FindBy(xpath = "//b[contains(text(),'Create')]")
    @ElementName("OVR_Schedule_createtab")
    public WebElement OVR_Schedule_createtab;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm ml-4 p-0']")
    @ElementName("OVR_CrtScheduleBtn")
    public WebElement OVR_CrtScheduleBtn;

    @FindBy(xpath = "(//a[@data-target='#select_unit'])[last()]")
    @ElementName("OVR_SelectUnit")
    public WebElement OVR_SelectUnit;

    @FindBy(xpath = "//button[normalize-space()='Add Units']")
    @ElementName("OVR_AddUnits")
    public WebElement OVR_AddUnits;

    @FindBy(xpath = "(//table[@class='e-table']/tbody/tr/td)[6]")
    @ElementName("OVR_StartDate")
    public WebElement OVR_StartDate;

    @FindBy(xpath = "//span[@aria-label='select']")
    @ElementName("OVR_Calender")
    public WebElement OVR_Calender;

    @FindBy(xpath = "//button[normalize-space()='Today']")
    @ElementName("OVR_TdyDate")
    public WebElement OVR_TdyDate;

    @FindBy(xpath = "//input[contains(@id,'duration')]")
    @ElementName("OVR_Duration")
    public WebElement OVR_Duration;

    @FindBy(xpath = "//a[contains(text(),'Create Schedule')]")
    @ElementName("OVR_CreateScdl")
    public WebElement OVR_CreateScdl;

    @FindBy(xpath = "(//button[@type='button'][normalize-space()='Yes'])[4]")
    @ElementName("OVR_YesBtn")
    public WebElement OVR_YesBtn;

    @FindBy(xpath = "//input[@id='startTime_input']")
    @ElementName("OVR_StartTime")
    public WebElement OVR_StartTime;

    @FindBy(xpath = "//b[text()='Board']")
    @ElementName("OVR_BoardTab")
    public WebElement OVR_BoardTab;

    @FindBy(xpath = "//label[@for='btnControl']//img")
    @ElementName("OVR_ShowFil")
    public WebElement OVR_ShowFil;

    @FindBy(xpath = "//label[normalize-space()='Days']/parent::div//ejs-dropdownlist[contains(@id,'ej2_dropdownlist_')]")
    @ElementName("OVR_SelectDayDD_Board")
    public WebElement OVR_SelectDayDD_Board;

    @FindBy(xpath = "(//div[contains(@id,'ej2_dropdownlist')]//li)[last()]")
    @ElementName("OVR_SelectDate_Board")
    public WebElement OVR_SelectDate_Board;

    @FindBy(xpath = "//button[normalize-space()='Publish']")
    @ElementName("OVR_PublishBtn_Board")
    public WebElement OVR_PublishBtn_Board;

    @FindBy(xpath = "//button[@title='Show Schedule Properties']")
    @ElementName("OVR_ShowScheProp_Board")
    public WebElement OVR_ShowScheProp_Board;

    @FindBy(xpath = "//label[normalize-space()='Status']/parent::div//ejs-dropdownlist[contains(@id,'ej2_dropdownlist_')]")
    @ElementName("OVR_StatusDD_Board")
    public WebElement OVR_StatusDD_Board;

    @FindBy(xpath = "//div[@class='modal-content']//label[normalize-space()='Status']/parent::div//ejs-dropdownlist[contains(@id,'ej2_dropdownlist_')]//span")
    @ElementName("OVR_StatusDD_Board1")
    public WebElement OVR_StatusDD_Board1;

    @FindBy(xpath = "//li[@data-value='Start List']")
    @ElementName("OVR_SelStartList_Board")
    public WebElement OVR_SelStartList_Board;

    @FindBy(xpath = "//div[@class='e-content e-dropdownbase']//li[@data-value='Start List']")
    @ElementName("OVR_SelStartList_Board1")
    public WebElement OVR_SelStartList_Board1;

    @FindBy(xpath = "//button[normalize-space()='Update']")
    @ElementName("OVR_UpdateBtn_Board")
    public WebElement OVR_UpdateBtn_Board;

    @FindBy(xpath = "//div[@class='modal-content']//button[normalize-space()='Update']")
    @ElementName("OVR_UpdateBtn_Board1")
    public WebElement OVR_UpdateBtn_Board1;

    @FindBy(xpath = "//ejs-dropdownlist[@id='to']")
    @ElementName("OVR_ToTable")
    public WebElement OVR_ToTable;

    @FindBy(xpath = "//ejs-dropdownlist[@id='from']")
    @ElementName("OVR_fromTable")
    public WebElement OVR_fromTable;

    @FindBy(xpath = "//a[contains(@class,'unit-icon')]")
    @ElementName("OVR_unitsBoard")
    public WebElement OVR_unitsBoard;

    @FindBy(xpath = "//label[text()='Day']/parent::div/div/ejs-dropdownlist")
    @ElementName("OVR_unitsDayDD")
    public WebElement OVR_unitsDayDD;

    @FindBy(xpath = "(//ul[@id='ddlelement_options']/li)[last()-1]")
    @ElementName("OVR_unitsSelDate")
    public WebElement OVR_unitsSelDate;

    @FindBy(xpath = "//div[@id='select_unit']//ejs-dropdownlist")
    @ElementName("dropdown_OVR_scedule_selectunit_date")
    public WebElement dropdown_OVR_scedule_selectunit_date;

    @FindBy(xpath = "//input[@id='showAllCheck' and @type='checkbox']")
    @ElementName("checkbox_OVR_scedule_selectunit_all")
    public WebElement checkbox_OVR_scedule_selectunit_all;

    @FindBy(xpath = "//div[@id='select_unit']//input[@id='searchText' and @type='text']")
    @ElementName("text_OVR_scedule_selectunit_select_unit")
    public WebElement text_OVR_scedule_selectunit_select_unit;

    @FindBy(xpath = "//div[@id='select_unit']//ul[@class='tree']")
    @ElementName("list_OVR_scedule_selectunit_subevents")
    public WebElement list_OVR_scedule_selectunit_subevents;

    @FindBy(xpath = "//div[@id='select_unit']//label[@for='allSelectCheck']//parent::div//input[@type='checkbox' and @id='allSelectCheck']")
    @ElementName("checkbox_OVR_scedule_selectunit_subevents_matches_selectedall")
    public WebElement checkbox_OVR_scedule_selectunit_subevents_matches_selectedall;

    @FindBy(xpath = "//div[@id='select_unit']//label[@for='allSelectCheck']//ancestor::ul")
    @ElementName("list_OVR_scedule_selectunit_subevents_matches")
    public WebElement list_OVR_scedule_selectunit_subevents_matches;

    @FindBy(xpath = "//div[@id='select_unit']//button[contains(text(),'Add Units')]")
    @ElementName("button_OVR_scedule_selectunit_AddUnits")
    public WebElement button_OVR_scedule_selectunit_AddUnits;

    @FindBy(xpath = "//div[@id='select_unit']//button[contains(text(),'Cancel')]")
    @ElementName("button_OVR_scedule_selectunit_Cancel")
    public WebElement button_OVR_scedule_selectunit_Cancel;

    @FindBy(xpath = "//div[@id='select_unit']//button[@class='close btn' and @type='button']")
    @ElementName("button_OVR_scedule_selectunit_closebutton")
    public WebElement button_OVR_scedule_selectunit_closebutton;

    @FindBy(xpath = "//ejs-grid//div[@class='e-gridcontent']//tbody")
    @ElementName("table_OVR_scedule_table")
    public WebElement table_OVR_scedule_table;

    @FindBy(xpath = "//button[@title='Remove Selected Line']")
    @ElementName("button_OVR_scedule_RemoveSelectedLine")
    public WebElement button_OVR_scedule_RemoveSelectedLine;

    @FindBy(xpath = "(//h5[contains(text(),'Confirmation')])[2]//parent::div//parent::div[@class='modal-content']//button[contains(text(),'Yes')]")
    @ElementName("button_OVR_scedule_RemoveSelectedLine_confirmation_yes")
    public WebElement button_OVR_scedule_RemoveSelectedLine_confirmation_yes;

    @FindBy(xpath = "(//h5[contains(text(),'Confirmation')]//parent::div//parent::div[@class='modal-content']//button[contains(text(),'Yes')])[1]")
    @ElementName("button_OVR_scedule_RemoveSelectedLine_confirmation_yes1")
    public WebElement button_OVR_scedule_RemoveSelectedLine_confirmation_yes1;

    @FindBy(xpath = "(//h5[contains(text(),'Confirmation')])[2]//parent::div//parent::div[@class='modal-content']//button[contains(text(),'No')]")
    @ElementName("button_OVR_scedule_RemoveSelectedLine_confirmation_No")
    public WebElement button_OVR_scedule_RemoveSelectedLine_confirmation_No;

    @FindBy(xpath = "//b[contains(text(),'Board')]")
    @ElementName("button_OVR_scedule_Boardtab")
    public WebElement button_OVR_scedule_Boardtab;

    @FindBy(xpath = "//b[contains(text(),'List')]")
    @ElementName("button_OVR_scedule_Listtab")
    public WebElement button_OVR_scedule_Listtab;

    @FindBy(xpath = "//label[contains(text(),'Days') and @for='filterDay']//following-sibling::ejs-dropdownlist//span")
    @ElementName("button_OVR_scedule_Listtab_Days")
    public WebElement button_OVR_scedule_Listtab_Days;

    @FindBy(xpath = "//div[contains(@id,'ej2_dropdownlist')]//ul")
    @ElementName("dropdown_OVR_scedule_Listtab_Days")
    public WebElement dropdown_OVR_scedule_Listtab_Days;

    @FindBy(xpath = "//div[contains(@id,'ej2_dropdownlist')]//input[@type='text']")
    @ElementName("text_OVR_scedule_Listtab_Days")
    public WebElement text_OVR_scedule_Listtab_Days;

    @FindBy(xpath = "(//span[contains(text(),'Description')]//ancestor::ejs-grid//table[@class='e-table']//tbody)[1]")
    @ElementName("table_OVR_scedule_Listtab_matchsceduledlist")
    public WebElement table_OVR_scedule_Listtab_matchsceduledlist;

    @FindBy(xpath = "(//span[contains(text(),'Description')]//ancestor::ejs-grid//table[@class='e-table']//tbody)[2]")
    @ElementName("table_OVR_scedule_Listtab_matchsceduledlist1")
    public WebElement table_OVR_scedule_Listtab_matchsceduledlist1;

    @FindBy(xpath = "//button[contains(text(),' Publish ')]")
    @ElementName("button_OVR_scedule_Listtab_Publish")
    public WebElement button_OVR_scedule_Listtab_Publish;

    @FindBy(xpath = "//label[contains(text(),'Show Advanced filters')]//parent::div//input[@type='checkbox' and @id='isShowAdvancedfilter']")
    @ElementName("button_OVR_scedule_Listtab_ShowAdvancedfilters")
    public WebElement button_OVR_scedule_Listtab_ShowAdvancedfilters;

    @FindBy(xpath = "//label[contains(text(),'Scheduled')]//parent::div//ejs-dropdownlist//span")
    @ElementName("button_OVR_scedule_Listtab_ShowAdvancedfilters_Scheduled")
    public WebElement button_OVR_scedule_Listtab_ShowAdvancedfilters_Scheduled;

    @FindBy(xpath = "//span[@class='e-filter-parent']//input[@type='text']")
    @ElementName("text_OVR_scedule_Listtab_ShowAdvancedfilters_optionpopupdropdown_inputfield")
    public WebElement text_OVR_scedule_Listtab_ShowAdvancedfilters_optionpopupdropdown_inputfield;


    @FindBy(xpath = "//span[contains(text(),'Show filters')]//parent::div//img")
    @ElementName("button_OVR_scedule_Boardtab_Showfilters")
    public WebElement button_OVR_scedule_Boardtab_Showfilters;

    @FindBy(xpath = "//label[contains(text(),'Days') and @for='filterDay']//following-sibling::ejs-dropdownlist//span")
    @ElementName("button_OVR_scedule_Boardtab_Days")
    public WebElement button_OVR_scedule_Boardtab_Days;

    @FindBy(xpath = "//div[contains(@id,'ej2_dropdownlist')]//input[@type='text']")
    @ElementName("text_OVR_scedule_Boardtab_Days")
    public WebElement text_OVR_scedule_Boardtab_Days;

    @FindBy(xpath = "//label[contains(text(),'Show Advanced filters')]//parent::div//input[@type='checkbox' and @id='isShowAdvancedfilter']")
    @ElementName("button_OVR_scedule_Listtab_ShowAdvancedfilters")
    public WebElement button_OVR_scedule_Boardtab_ShowAdvancedfilters;

    @FindBy(xpath = "//label[contains(text(),'Scheduled')]//parent::div//ejs-dropdownlist//span")
    @ElementName("button_OVR_scedule_Listtab_ShowAdvancedfilters_Scheduled")
    public WebElement button_OVR_scedule_Boardtab_ShowAdvancedfilters_Scheduled;

    @FindBy(xpath = "//label[contains(text(),'Status')]//parent::div//ejs-dropdownlist//span")
    @ElementName("button_OVR_scedule_Listtab_ShowAdvancedfilters_Status")
    public WebElement button_OVR_scedule_Boardtab_ShowAdvancedfilters_Status;


}