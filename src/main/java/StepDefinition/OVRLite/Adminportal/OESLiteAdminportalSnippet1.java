package StepDefinition.OVRLite.Adminportal;

import StepDefinition.AdminPortal.EventCreationSnippet;
import base.Commonmethods;
import io.cucumber.java.an.E;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.Fileuploadrobotclass;
import util.TestDataReader;

import java.util.ArrayList;
import java.util.List;

import static PreDefinedstepdefinitions.Predefinedstepdefinitions.*;
import static base.DriverInitialisation.driver;

public class OESLiteAdminportalSnippet1 {

    public static String OESlit_eventid= EventCreationSnippet.eventid;
    public static WebDriverWait wait1 = new WebDriverWait(driver, 60);
    public static Commonmethods base = new Commonmethods(driver, wait1);

    @Given("^OES Lite report tab for Player Entry Report subtab and Verify the Visibility column field selection dropdown using EntryId option$")
    public static void OESLitereporttabforPlayerEntryReportsubtabandVerifytheVisibilitycolumnfieldselectiondropdownusingEntryIdoption()throws Exception{

                                                                                                                                                                            /*
        click_on_element("AdminPortalElements/EventcreationElements/tab_event");
        base.wait(4);
        clearthevalueintotheelement("AdminPortalElements/EventcreationElements/text_event_searchfield");
        enterthevalueintotheelement(OESlit_eventid,"AdminPortalElements/EventcreationElements/text_event_searchfield");
        click_on_element("AdminPortalElements/EventcreationElements/button_event_searchfieldicon");
        base.wait(3);
        click_on_element("AdminPortalElements/EventcreationElements/button_event_tablesearchedeventedit");
        base.wait(3);

        getthefield("AdminPortalElements/EventcreationElements/tab_event_creation_OnlineEntrySystem");
        base.scrollToView(webElement);
        base.wait(1);
        click_on_element("AdminPortalElements/EventcreationElements/tab_event_creation_OnlineEntrySystem");

        clickonenableordisablebutton("Disable","AdminPortalElements/EventcreationElements/toggle_event_creation_OnlineEntrySystem_EnableOES1");

        click_on_element("AdminPortalElements/EventcreationElements/button_event_update");
        base.wait(3);
        element_visiability("AdminPortalElements/EventcreationElements/text1_event_eventdeails");
*/
        click_on_element("AdminPortalElements/EventcreationElements/tab_event");
        base.wait(4);
        clearthevalueintotheelement("AdminPortalElements/EventcreationElements/text_event_searchfield");
        enterthevalueintotheelement(OESlit_eventid,"AdminPortalElements/EventcreationElements/text_event_searchfield");
        click_on_element("AdminPortalElements/EventcreationElements/button_event_searchfieldicon");
        base.wait(3);
        click_on_element("AdminPortalElements/EventcreationElements/table_event_tableresultrow");
        base.wait(3);

        click_on_element("AdminPortalElements/EventcreationElements/tab_event_OESLite");
        base.wait(2);
/*
        //singles

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttab");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        base.wait(8);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");
        base.wait(3);


        //double

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttabofdoubles");


        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Doubles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttabofdoubles");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Doubles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");
        base.wait(3);


        //mixed double

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheadermixeddoubles");


        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Doubles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheadermixeddoubles");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Doubles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");
        base.wait(3);

      //teams

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttabofteams");


        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Teams_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttabofteams");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Teams_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");
        base.wait(3);
*/

        //reports

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheader_reports");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_reports_PlayerEntryReport");
        base.wait(2);

        String visibilityitem1="EntryId";
        String visibilityitem2="EventId";
        String visibilityitem3="SubEvent Name";
        String visibilityitem4="SubEvent Code";
        String visibilityitem5="ittfid";
        String visibilityitem6="Player GivenName";
        String visibilityitem7="Player FamilyName";
        String visibilityitem8="OrgCode";
        String visibilityitem9="Organization";
        String visibilityitem10="Status";
        String visibilityitem11="Seed";
        String visibilityitem12="Current Ranking";
        String visibilityitem13="Current Ranking Points";
        String visibilityitem14="Is Double Entry";
        String visibilityitem15="Pair Number";
        String visibilityitem16="Pair Name";
        String visibilityitem17="Entry Draw Name";
        String visibilityitem18="Entry Quota Type";
        String visibilityitem19="Cancellation Past Final Deadline";
        String visibilityitem20="Protected Ranking";
        String visibilityitem21="Penalized";
        String visibilityitem22="Zero Point Penalty";
        String visibilityitem23="Created Date & Time (UTC)";





        List<String> exceptedlist = new ArrayList<>();

        exceptedlist.add(visibilityitem1);


        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_SelectVisibleFields");
        base.wait(4);

        selectcheckboxfrompopupwindowcontainer(visibilityitem1,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem2,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem3,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem4,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem5,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem6,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem7,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem8,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem9,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem10,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem11,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem12,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem13,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem14,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem15,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem16,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem17,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem18,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem19,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem20,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem21,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem22,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem23,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");




        //selectcheckboxfrompopupwindowcontainer(visibilityitem1,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");

        enterthevalueintotheelement(visibilityitem1,"AdminPortalElements/OESLiteElements/text_OESlite_reports_commonpopupwindowsearchfield");
        getthefield("AdminPortalElements/OESLiteElements/text_OESlite_reports_commonpopupwindowsearchfield");
        webElement.sendKeys(Keys.ENTER);
        base.wait(4);
        driver.findElement(By.cssSelector(".cdk-overlay-backdrop.cdk-overlay-transparent-backdrop.cdk-overlay-backdrop-showing")).click();

        checktheheadervaluefromwebtable(exceptedlist,"AdminPortalElements/OESLiteElements/frame_common_OESlite");




    }

    @Given("^OES Lite report tab for Player Entry Report subtab and Verify the Visibility column field selection dropdown using EventId option$")
    public static void OESLitereporttabforPlayerEntryReportsubtabandVerifytheVisibilitycolumnfieldselectiondropdownusingEventIdoption()throws Exception{
         /*
        click_on_element("AdminPortalElements/EventcreationElements/tab_event");
        base.wait(4);
        clearthevalueintotheelement("AdminPortalElements/EventcreationElements/text_event_searchfield");
        enterthevalueintotheelement(OESlit_eventid,"AdminPortalElements/EventcreationElements/text_event_searchfield");
        click_on_element("AdminPortalElements/EventcreationElements/button_event_searchfieldicon");
        base.wait(3);
        click_on_element("AdminPortalElements/EventcreationElements/button_event_tablesearchedeventedit");
        base.wait(3);

        getthefield("AdminPortalElements/EventcreationElements/tab_event_creation_OnlineEntrySystem");
        base.scrollToView(webElement);
        base.wait(1);
        click_on_element("AdminPortalElements/EventcreationElements/tab_event_creation_OnlineEntrySystem");

        clickonenableordisablebutton("Disable","AdminPortalElements/EventcreationElements/toggle_event_creation_OnlineEntrySystem_EnableOES1");

        click_on_element("AdminPortalElements/EventcreationElements/button_event_update");
        base.wait(3);
        element_visiability("AdminPortalElements/EventcreationElements/text1_event_eventdeails");
*/
        click_on_element("AdminPortalElements/EventcreationElements/tab_event");
        base.wait(4);
        clearthevalueintotheelement("AdminPortalElements/EventcreationElements/text_event_searchfield");
        enterthevalueintotheelement(OESlit_eventid,"AdminPortalElements/EventcreationElements/text_event_searchfield");
        click_on_element("AdminPortalElements/EventcreationElements/button_event_searchfieldicon");
        base.wait(3);
        click_on_element("AdminPortalElements/EventcreationElements/table_event_tableresultrow");
        base.wait(3);

        click_on_element("AdminPortalElements/EventcreationElements/tab_event_OESLite");
        base.wait(2);
/*
        //singles

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttab");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        base.wait(8);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");
        base.wait(3);


        //double

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttabofdoubles");


        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Doubles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttabofdoubles");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Doubles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");
        base.wait(3);


        //mixed double

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheadermixeddoubles");


        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Doubles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheadermixeddoubles");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Doubles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");
        base.wait(3);

      //teams

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttabofteams");


        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Teams_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttabofteams");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Teams_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");
        base.wait(3);
*/

        //reports

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheader_reports");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_reports_PlayerEntryReport");
        base.wait(2);

        String visibilityitem1="EntryId";
        String visibilityitem2="EventId";
        String visibilityitem3="SubEvent Name";
        String visibilityitem4="SubEvent Code";
        String visibilityitem5="ittfid";
        String visibilityitem6="Player GivenName";
        String visibilityitem7="Player FamilyName";
        String visibilityitem8="OrgCode";
        String visibilityitem9="Organization";
        String visibilityitem10="Status";
        String visibilityitem11="Seed";
        String visibilityitem12="Current Ranking";
        String visibilityitem13="Current Ranking Points";
        String visibilityitem14="Is Double Entry";
        String visibilityitem15="Pair Number";
        String visibilityitem16="Pair Name";
        String visibilityitem17="Entry Draw Name";
        String visibilityitem18="Entry Quota Type";
        String visibilityitem19="Cancellation Past Final Deadline";
        String visibilityitem20="Protected Ranking";
        String visibilityitem21="Penalized";
        String visibilityitem22="Zero Point Penalty";
        String visibilityitem23="Created Date & Time (UTC)";





        List<String> exceptedlist = new ArrayList<>();

        exceptedlist.add(visibilityitem2);


        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_SelectVisibleFields");
        base.wait(4);

        selectcheckboxfrompopupwindowcontainer(visibilityitem1,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem2,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem3,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem4,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem5,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem6,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem7,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem8,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem9,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem10,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem11,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem12,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem13,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem14,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem15,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem16,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem17,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem18,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem19,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem20,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem21,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem22,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem23,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");




        //selectcheckboxfrompopupwindowcontainer(visibilityitem1,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");

        enterthevalueintotheelement(visibilityitem2,"AdminPortalElements/OESLiteElements/text_OESlite_reports_commonpopupwindowsearchfield");
        getthefield("AdminPortalElements/OESLiteElements/text_OESlite_reports_commonpopupwindowsearchfield");
        webElement.sendKeys(Keys.ENTER);
        base.wait(4);
        driver.findElement(By.cssSelector(".cdk-overlay-backdrop.cdk-overlay-transparent-backdrop.cdk-overlay-backdrop-showing")).click();

        checktheheadervaluefromwebtable(exceptedlist,"AdminPortalElements/OESLiteElements/frame_common_OESlite");




    }

    @Given("^OES Lite report tab for Player Entry Report subtab and Verify the Visibility column field selection dropdown using SubEvent Name option$")
    public static void OESLitereporttabforPlayerEntryReportsubtabandVerifytheVisibilitycolumnfieldselectiondropdownusingSubEventNameoption()throws Exception{
         /*
        click_on_element("AdminPortalElements/EventcreationElements/tab_event");
        base.wait(4);
        clearthevalueintotheelement("AdminPortalElements/EventcreationElements/text_event_searchfield");
        enterthevalueintotheelement(OESlit_eventid,"AdminPortalElements/EventcreationElements/text_event_searchfield");
        click_on_element("AdminPortalElements/EventcreationElements/button_event_searchfieldicon");
        base.wait(3);
        click_on_element("AdminPortalElements/EventcreationElements/button_event_tablesearchedeventedit");
        base.wait(3);

        getthefield("AdminPortalElements/EventcreationElements/tab_event_creation_OnlineEntrySystem");
        base.scrollToView(webElement);
        base.wait(1);
        click_on_element("AdminPortalElements/EventcreationElements/tab_event_creation_OnlineEntrySystem");

        clickonenableordisablebutton("Disable","AdminPortalElements/EventcreationElements/toggle_event_creation_OnlineEntrySystem_EnableOES1");

        click_on_element("AdminPortalElements/EventcreationElements/button_event_update");
        base.wait(3);
        element_visiability("AdminPortalElements/EventcreationElements/text1_event_eventdeails");
*/
        click_on_element("AdminPortalElements/EventcreationElements/tab_event");
        base.wait(4);
        clearthevalueintotheelement("AdminPortalElements/EventcreationElements/text_event_searchfield");
        enterthevalueintotheelement(OESlit_eventid,"AdminPortalElements/EventcreationElements/text_event_searchfield");
        click_on_element("AdminPortalElements/EventcreationElements/button_event_searchfieldicon");
        base.wait(3);
        click_on_element("AdminPortalElements/EventcreationElements/table_event_tableresultrow");
        base.wait(3);

        click_on_element("AdminPortalElements/EventcreationElements/tab_event_OESLite");
        base.wait(2);
/*
        //singles

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttab");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        base.wait(8);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");
        base.wait(3);


        //double

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttabofdoubles");


        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Doubles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttabofdoubles");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Doubles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");
        base.wait(3);


        //mixed double

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheadermixeddoubles");


        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Doubles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheadermixeddoubles");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Doubles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");
        base.wait(3);

      //teams

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttabofteams");


        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Teams_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttabofteams");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Teams_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");
        base.wait(3);
*/

        //reports

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheader_reports");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_reports_PlayerEntryReport");
        base.wait(2);

        String visibilityitem1="EntryId";
        String visibilityitem2="EventId";
        String visibilityitem3="SubEvent Name";
        String visibilityitem4="SubEvent Code";
        String visibilityitem5="ittfid";
        String visibilityitem6="Player GivenName";
        String visibilityitem7="Player FamilyName";
        String visibilityitem8="OrgCode";
        String visibilityitem9="Organization";
        String visibilityitem10="Status";
        String visibilityitem11="Seed";
        String visibilityitem12="Current Ranking";
        String visibilityitem13="Current Ranking Points";
        String visibilityitem14="Is Double Entry";
        String visibilityitem15="Pair Number";
        String visibilityitem16="Pair Name";
        String visibilityitem17="Entry Draw Name";
        String visibilityitem18="Entry Quota Type";
        String visibilityitem19="Cancellation Past Final Deadline";
        String visibilityitem20="Protected Ranking";
        String visibilityitem21="Penalized";
        String visibilityitem22="Zero Point Penalty";
        String visibilityitem23="Created Date & Time (UTC)";





        List<String> exceptedlist = new ArrayList<>();

        exceptedlist.add(visibilityitem3);


        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_SelectVisibleFields");
        base.wait(4);

        selectcheckboxfrompopupwindowcontainer(visibilityitem1,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem2,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem3,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem4,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem5,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem6,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem7,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem8,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem9,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem10,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem11,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem12,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem13,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem14,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem15,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem16,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem17,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem18,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem19,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem20,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem21,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem22,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem23,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");




        //selectcheckboxfrompopupwindowcontainer(visibilityitem1,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");

        enterthevalueintotheelement(visibilityitem3,"AdminPortalElements/OESLiteElements/text_OESlite_reports_commonpopupwindowsearchfield");
        getthefield("AdminPortalElements/OESLiteElements/text_OESlite_reports_commonpopupwindowsearchfield");
        webElement.sendKeys(Keys.ENTER);
        base.wait(4);
        driver.findElement(By.cssSelector(".cdk-overlay-backdrop.cdk-overlay-transparent-backdrop.cdk-overlay-backdrop-showing")).click();

        checktheheadervaluefromwebtable(exceptedlist,"AdminPortalElements/OESLiteElements/frame_common_OESlite");


    }

    @Given("^OES Lite report tab for Player Entry Report subtab and Verify the Visibility column field selection dropdown using SubEvent Code option$")
    public static void OESLitereporttabforPlayerEntryReportsubtabandVerifytheVisibilitycolumnfieldselectiondropdownusingSubEventCodeoption()throws Exception{

                                                                                                                                                                            /*
        click_on_element("AdminPortalElements/EventcreationElements/tab_event");
        base.wait(4);
        clearthevalueintotheelement("AdminPortalElements/EventcreationElements/text_event_searchfield");
        enterthevalueintotheelement(OESlit_eventid,"AdminPortalElements/EventcreationElements/text_event_searchfield");
        click_on_element("AdminPortalElements/EventcreationElements/button_event_searchfieldicon");
        base.wait(3);
        click_on_element("AdminPortalElements/EventcreationElements/button_event_tablesearchedeventedit");
        base.wait(3);

        getthefield("AdminPortalElements/EventcreationElements/tab_event_creation_OnlineEntrySystem");
        base.scrollToView(webElement);
        base.wait(1);
        click_on_element("AdminPortalElements/EventcreationElements/tab_event_creation_OnlineEntrySystem");

        clickonenableordisablebutton("Disable","AdminPortalElements/EventcreationElements/toggle_event_creation_OnlineEntrySystem_EnableOES1");

        click_on_element("AdminPortalElements/EventcreationElements/button_event_update");
        base.wait(3);
        element_visiability("AdminPortalElements/EventcreationElements/text1_event_eventdeails");
*/
        click_on_element("AdminPortalElements/EventcreationElements/tab_event");
        base.wait(4);
        clearthevalueintotheelement("AdminPortalElements/EventcreationElements/text_event_searchfield");
        enterthevalueintotheelement(OESlit_eventid,"AdminPortalElements/EventcreationElements/text_event_searchfield");
        click_on_element("AdminPortalElements/EventcreationElements/button_event_searchfieldicon");
        base.wait(3);
        click_on_element("AdminPortalElements/EventcreationElements/table_event_tableresultrow");
        base.wait(3);

        click_on_element("AdminPortalElements/EventcreationElements/tab_event_OESLite");
        base.wait(2);
/*
        //singles

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttab");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        base.wait(8);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");
        base.wait(3);


        //double

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttabofdoubles");


        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Doubles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttabofdoubles");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Doubles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");
        base.wait(3);


        //mixed double

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheadermixeddoubles");


        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Doubles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheadermixeddoubles");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Doubles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");
        base.wait(3);

      //teams

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttabofteams");


        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Teams_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttabofteams");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Teams_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");
        base.wait(3);
*/

        //reports

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheader_reports");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_reports_PlayerEntryReport");
        base.wait(2);

        String visibilityitem1="EntryId";
        String visibilityitem2="EventId";
        String visibilityitem3="SubEvent Name";
        String visibilityitem4="SubEvent Code";
        String visibilityitem5="ittfid";
        String visibilityitem6="Player GivenName";
        String visibilityitem7="Player FamilyName";
        String visibilityitem8="OrgCode";
        String visibilityitem9="Organization";
        String visibilityitem10="Status";
        String visibilityitem11="Seed";
        String visibilityitem12="Current Ranking";
        String visibilityitem13="Current Ranking Points";
        String visibilityitem14="Is Double Entry";
        String visibilityitem15="Pair Number";
        String visibilityitem16="Pair Name";
        String visibilityitem17="Entry Draw Name";
        String visibilityitem18="Entry Quota Type";
        String visibilityitem19="Cancellation Past Final Deadline";
        String visibilityitem20="Protected Ranking";
        String visibilityitem21="Penalized";
        String visibilityitem22="Zero Point Penalty";
        String visibilityitem23="Created Date & Time (UTC)";





        List<String> exceptedlist = new ArrayList<>();

        exceptedlist.add(visibilityitem4);


        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_SelectVisibleFields");
        base.wait(4);

        selectcheckboxfrompopupwindowcontainer(visibilityitem1,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem2,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem3,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem4,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem5,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem6,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem7,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem8,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem9,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem10,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem11,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem12,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem13,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem14,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem15,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem16,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem17,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem18,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem19,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem20,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem21,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem22,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem23,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");




        //selectcheckboxfrompopupwindowcontainer(visibilityitem1,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");

        enterthevalueintotheelement(visibilityitem4,"AdminPortalElements/OESLiteElements/text_OESlite_reports_commonpopupwindowsearchfield");
        getthefield("AdminPortalElements/OESLiteElements/text_OESlite_reports_commonpopupwindowsearchfield");
        webElement.sendKeys(Keys.ENTER);
        base.wait(4);
        driver.findElement(By.cssSelector(".cdk-overlay-backdrop.cdk-overlay-transparent-backdrop.cdk-overlay-backdrop-showing")).click();

        checktheheadervaluefromwebtable(exceptedlist,"AdminPortalElements/OESLiteElements/frame_common_OESlite");


    }

    @Given("^OES Lite report tab for Player Entry Report subtab and Verify the Visibility column field selection dropdown using ittfid option$")
    public static void OESLitereporttabforPlayerEntryReportsubtabandVerifytheVisibilitycolumnfieldselectiondropdownusingittfidoption()throws Exception{

                                                                                                                                                                            /*
        click_on_element("AdminPortalElements/EventcreationElements/tab_event");
        base.wait(4);
        clearthevalueintotheelement("AdminPortalElements/EventcreationElements/text_event_searchfield");
        enterthevalueintotheelement(OESlit_eventid,"AdminPortalElements/EventcreationElements/text_event_searchfield");
        click_on_element("AdminPortalElements/EventcreationElements/button_event_searchfieldicon");
        base.wait(3);
        click_on_element("AdminPortalElements/EventcreationElements/button_event_tablesearchedeventedit");
        base.wait(3);

        getthefield("AdminPortalElements/EventcreationElements/tab_event_creation_OnlineEntrySystem");
        base.scrollToView(webElement);
        base.wait(1);
        click_on_element("AdminPortalElements/EventcreationElements/tab_event_creation_OnlineEntrySystem");

        clickonenableordisablebutton("Disable","AdminPortalElements/EventcreationElements/toggle_event_creation_OnlineEntrySystem_EnableOES1");

        click_on_element("AdminPortalElements/EventcreationElements/button_event_update");
        base.wait(3);
        element_visiability("AdminPortalElements/EventcreationElements/text1_event_eventdeails");
*/
        click_on_element("AdminPortalElements/EventcreationElements/tab_event");
        base.wait(4);
        clearthevalueintotheelement("AdminPortalElements/EventcreationElements/text_event_searchfield");
        enterthevalueintotheelement(OESlit_eventid,"AdminPortalElements/EventcreationElements/text_event_searchfield");
        click_on_element("AdminPortalElements/EventcreationElements/button_event_searchfieldicon");
        base.wait(3);
        click_on_element("AdminPortalElements/EventcreationElements/table_event_tableresultrow");
        base.wait(3);

        click_on_element("AdminPortalElements/EventcreationElements/tab_event_OESLite");
        base.wait(2);
/*
        //singles

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttab");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        base.wait(8);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");
        base.wait(3);


        //double

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttabofdoubles");


        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Doubles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttabofdoubles");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Doubles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");
        base.wait(3);


        //mixed double

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheadermixeddoubles");


        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Doubles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheadermixeddoubles");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Doubles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");
        base.wait(3);

      //teams

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttabofteams");


        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Teams_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttabofteams");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Teams_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");
        base.wait(3);
*/

        //reports

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheader_reports");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_reports_PlayerEntryReport");
        base.wait(2);

        String visibilityitem1="EntryId";
        String visibilityitem2="EventId";
        String visibilityitem3="SubEvent Name";
        String visibilityitem4="SubEvent Code";
        String visibilityitem5="ittfid";
        String visibilityitem6="Player GivenName";
        String visibilityitem7="Player FamilyName";
        String visibilityitem8="OrgCode";
        String visibilityitem9="Organization";
        String visibilityitem10="Status";
        String visibilityitem11="Seed";
        String visibilityitem12="Current Ranking";
        String visibilityitem13="Current Ranking Points";
        String visibilityitem14="Is Double Entry";
        String visibilityitem15="Pair Number";
        String visibilityitem16="Pair Name";
        String visibilityitem17="Entry Draw Name";
        String visibilityitem18="Entry Quota Type";
        String visibilityitem19="Cancellation Past Final Deadline";
        String visibilityitem20="Protected Ranking";
        String visibilityitem21="Penalized";
        String visibilityitem22="Zero Point Penalty";
        String visibilityitem23="Created Date & Time (UTC)";





        List<String> exceptedlist = new ArrayList<>();

        exceptedlist.add(visibilityitem5);


        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_SelectVisibleFields");
        base.wait(4);

        selectcheckboxfrompopupwindowcontainer(visibilityitem1,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem2,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem3,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem4,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem5,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem6,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem7,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem8,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem9,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem10,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem11,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem12,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem13,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem14,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem15,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem16,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem17,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem18,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem19,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem20,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem21,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem22,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem23,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");




        //selectcheckboxfrompopupwindowcontainer(visibilityitem1,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");

        enterthevalueintotheelement(visibilityitem5,"AdminPortalElements/OESLiteElements/text_OESlite_reports_commonpopupwindowsearchfield");
        getthefield("AdminPortalElements/OESLiteElements/text_OESlite_reports_commonpopupwindowsearchfield");
        webElement.sendKeys(Keys.ENTER);
        base.wait(4);
        driver.findElement(By.cssSelector(".cdk-overlay-backdrop.cdk-overlay-transparent-backdrop.cdk-overlay-backdrop-showing")).click();

        checktheheadervaluefromwebtable(exceptedlist,"AdminPortalElements/OESLiteElements/frame_common_OESlite");






    }

    @Given("^OES Lite report tab for Player Entry Report subtab and Verify the Visibility column field selection dropdown using Player GivenName option$")
    public static void OESLitereporttabforPlayerEntryReportsubtabandVerifytheVisibilitycolumnfieldselectiondropdownusingPlayerGivenNameoption()throws Exception{

                                                                                                                                                                            /*
        click_on_element("AdminPortalElements/EventcreationElements/tab_event");
        base.wait(4);
        clearthevalueintotheelement("AdminPortalElements/EventcreationElements/text_event_searchfield");
        enterthevalueintotheelement(OESlit_eventid,"AdminPortalElements/EventcreationElements/text_event_searchfield");
        click_on_element("AdminPortalElements/EventcreationElements/button_event_searchfieldicon");
        base.wait(3);
        click_on_element("AdminPortalElements/EventcreationElements/button_event_tablesearchedeventedit");
        base.wait(3);

        getthefield("AdminPortalElements/EventcreationElements/tab_event_creation_OnlineEntrySystem");
        base.scrollToView(webElement);
        base.wait(1);
        click_on_element("AdminPortalElements/EventcreationElements/tab_event_creation_OnlineEntrySystem");

        clickonenableordisablebutton("Disable","AdminPortalElements/EventcreationElements/toggle_event_creation_OnlineEntrySystem_EnableOES1");

        click_on_element("AdminPortalElements/EventcreationElements/button_event_update");
        base.wait(3);
        element_visiability("AdminPortalElements/EventcreationElements/text1_event_eventdeails");
*/
        click_on_element("AdminPortalElements/EventcreationElements/tab_event");
        base.wait(4);
        clearthevalueintotheelement("AdminPortalElements/EventcreationElements/text_event_searchfield");
        enterthevalueintotheelement(OESlit_eventid,"AdminPortalElements/EventcreationElements/text_event_searchfield");
        click_on_element("AdminPortalElements/EventcreationElements/button_event_searchfieldicon");
        base.wait(3);
        click_on_element("AdminPortalElements/EventcreationElements/table_event_tableresultrow");
        base.wait(3);

        click_on_element("AdminPortalElements/EventcreationElements/tab_event_OESLite");
        base.wait(2);
/*
        //singles

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttab");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        base.wait(8);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");
        base.wait(3);


        //double

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttabofdoubles");


        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Doubles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttabofdoubles");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Doubles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");
        base.wait(3);


        //mixed double

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheadermixeddoubles");


        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Doubles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheadermixeddoubles");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Doubles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");
        base.wait(3);

      //teams

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttabofteams");


        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Teams_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttabofteams");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Teams_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");
        base.wait(3);
*/

        //reports

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheader_reports");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_reports_PlayerEntryReport");
        base.wait(2);

        String visibilityitem1="EntryId";
        String visibilityitem2="EventId";
        String visibilityitem3="SubEvent Name";
        String visibilityitem4="SubEvent Code";
        String visibilityitem5="ittfid";
        String visibilityitem6="Player GivenName";
        String visibilityitem7="Player FamilyName";
        String visibilityitem8="OrgCode";
        String visibilityitem9="Organization";
        String visibilityitem10="Status";
        String visibilityitem11="Seed";
        String visibilityitem12="Current Ranking";
        String visibilityitem13="Current Ranking Points";
        String visibilityitem14="Is Double Entry";
        String visibilityitem15="Pair Number";
        String visibilityitem16="Pair Name";
        String visibilityitem17="Entry Draw Name";
        String visibilityitem18="Entry Quota Type";
        String visibilityitem19="Cancellation Past Final Deadline";
        String visibilityitem20="Protected Ranking";
        String visibilityitem21="Penalized";
        String visibilityitem22="Zero Point Penalty";
        String visibilityitem23="Created Date & Time (UTC)";





        List<String> exceptedlist = new ArrayList<>();

        exceptedlist.add(visibilityitem6);


        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_SelectVisibleFields");
        base.wait(4);

        selectcheckboxfrompopupwindowcontainer(visibilityitem1,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem2,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem3,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem4,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem5,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem6,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem7,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem8,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem9,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem10,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem11,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem12,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem13,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem14,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem15,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem16,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem17,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem18,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem19,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem20,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem21,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem22,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem23,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");




        //selectcheckboxfrompopupwindowcontainer(visibilityitem1,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");

        enterthevalueintotheelement(visibilityitem6,"AdminPortalElements/OESLiteElements/text_OESlite_reports_commonpopupwindowsearchfield");
        getthefield("AdminPortalElements/OESLiteElements/text_OESlite_reports_commonpopupwindowsearchfield");
        webElement.sendKeys(Keys.ENTER);
        base.wait(4);
        driver.findElement(By.cssSelector(".cdk-overlay-backdrop.cdk-overlay-transparent-backdrop.cdk-overlay-backdrop-showing")).click();

        checktheheadervaluefromwebtable(exceptedlist,"AdminPortalElements/OESLiteElements/frame_common_OESlite");


    }

    @Given("^OES Lite report tab for Player Entry Report subtab and Verify the Visibility column field selection dropdown using Player FamilyName option$")
    public static void OESLitereporttabforPlayerEntryReportsubtabandVerifytheVisibilitycolumnfieldselectiondropdownusingPlayerFamilyNameoption()throws Exception{

                                                                                                                                                                            /*
        click_on_element("AdminPortalElements/EventcreationElements/tab_event");
        base.wait(4);
        clearthevalueintotheelement("AdminPortalElements/EventcreationElements/text_event_searchfield");
        enterthevalueintotheelement(OESlit_eventid,"AdminPortalElements/EventcreationElements/text_event_searchfield");
        click_on_element("AdminPortalElements/EventcreationElements/button_event_searchfieldicon");
        base.wait(3);
        click_on_element("AdminPortalElements/EventcreationElements/button_event_tablesearchedeventedit");
        base.wait(3);

        getthefield("AdminPortalElements/EventcreationElements/tab_event_creation_OnlineEntrySystem");
        base.scrollToView(webElement);
        base.wait(1);
        click_on_element("AdminPortalElements/EventcreationElements/tab_event_creation_OnlineEntrySystem");

        clickonenableordisablebutton("Disable","AdminPortalElements/EventcreationElements/toggle_event_creation_OnlineEntrySystem_EnableOES1");

        click_on_element("AdminPortalElements/EventcreationElements/button_event_update");
        base.wait(3);
        element_visiability("AdminPortalElements/EventcreationElements/text1_event_eventdeails");
*/
        click_on_element("AdminPortalElements/EventcreationElements/tab_event");
        base.wait(4);
        clearthevalueintotheelement("AdminPortalElements/EventcreationElements/text_event_searchfield");
        enterthevalueintotheelement(OESlit_eventid,"AdminPortalElements/EventcreationElements/text_event_searchfield");
        click_on_element("AdminPortalElements/EventcreationElements/button_event_searchfieldicon");
        base.wait(3);
        click_on_element("AdminPortalElements/EventcreationElements/table_event_tableresultrow");
        base.wait(3);

        click_on_element("AdminPortalElements/EventcreationElements/tab_event_OESLite");
        base.wait(2);
/*
        //singles

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttab");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        base.wait(8);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");
        base.wait(3);


        //double

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttabofdoubles");


        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Doubles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttabofdoubles");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Doubles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");
        base.wait(3);


        //mixed double

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheadermixeddoubles");


        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Doubles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheadermixeddoubles");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Doubles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");
        base.wait(3);

      //teams

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttabofteams");


        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Teams_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttabofteams");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Teams_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");
        base.wait(3);
*/

        //reports

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheader_reports");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_reports_PlayerEntryReport");
        base.wait(2);

        String visibilityitem1="EntryId";
        String visibilityitem2="EventId";
        String visibilityitem3="SubEvent Name";
        String visibilityitem4="SubEvent Code";
        String visibilityitem5="ittfid";
        String visibilityitem6="Player GivenName";
        String visibilityitem7="Player FamilyName";
        String visibilityitem8="OrgCode";
        String visibilityitem9="Organization";
        String visibilityitem10="Status";
        String visibilityitem11="Seed";
        String visibilityitem12="Current Ranking";
        String visibilityitem13="Current Ranking Points";
        String visibilityitem14="Is Double Entry";
        String visibilityitem15="Pair Number";
        String visibilityitem16="Pair Name";
        String visibilityitem17="Entry Draw Name";
        String visibilityitem18="Entry Quota Type";
        String visibilityitem19="Cancellation Past Final Deadline";
        String visibilityitem20="Protected Ranking";
        String visibilityitem21="Penalized";
        String visibilityitem22="Zero Point Penalty";
        String visibilityitem23="Created Date & Time (UTC)";





        List<String> exceptedlist = new ArrayList<>();

        exceptedlist.add(visibilityitem7);


        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_SelectVisibleFields");
        base.wait(4);

        selectcheckboxfrompopupwindowcontainer(visibilityitem1,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem2,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem3,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem4,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem5,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem6,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem7,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem8,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem9,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem10,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem11,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem12,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem13,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem14,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem15,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem16,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem17,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem18,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem19,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem20,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem21,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem22,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem23,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");




        //selectcheckboxfrompopupwindowcontainer(visibilityitem1,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");

        enterthevalueintotheelement(visibilityitem7,"AdminPortalElements/OESLiteElements/text_OESlite_reports_commonpopupwindowsearchfield");
        getthefield("AdminPortalElements/OESLiteElements/text_OESlite_reports_commonpopupwindowsearchfield");
        webElement.sendKeys(Keys.ENTER);
        base.wait(4);
        driver.findElement(By.cssSelector(".cdk-overlay-backdrop.cdk-overlay-transparent-backdrop.cdk-overlay-backdrop-showing")).click();

        checktheheadervaluefromwebtable(exceptedlist,"AdminPortalElements/OESLiteElements/frame_common_OESlite");


    }

    @Given("^OES Lite report tab for Player Entry Report subtab and Verify the Visibility column field selection dropdown using OrgCode option$")
    public static void OESLitereporttabforPlayerEntryReportsubtabandVerifytheVisibilitycolumnfieldselectiondropdownusingOrgCodeoption()throws Exception{

                                                                                                                                                                            /*
        click_on_element("AdminPortalElements/EventcreationElements/tab_event");
        base.wait(4);
        clearthevalueintotheelement("AdminPortalElements/EventcreationElements/text_event_searchfield");
        enterthevalueintotheelement(OESlit_eventid,"AdminPortalElements/EventcreationElements/text_event_searchfield");
        click_on_element("AdminPortalElements/EventcreationElements/button_event_searchfieldicon");
        base.wait(3);
        click_on_element("AdminPortalElements/EventcreationElements/button_event_tablesearchedeventedit");
        base.wait(3);

        getthefield("AdminPortalElements/EventcreationElements/tab_event_creation_OnlineEntrySystem");
        base.scrollToView(webElement);
        base.wait(1);
        click_on_element("AdminPortalElements/EventcreationElements/tab_event_creation_OnlineEntrySystem");

        clickonenableordisablebutton("Disable","AdminPortalElements/EventcreationElements/toggle_event_creation_OnlineEntrySystem_EnableOES1");

        click_on_element("AdminPortalElements/EventcreationElements/button_event_update");
        base.wait(3);
        element_visiability("AdminPortalElements/EventcreationElements/text1_event_eventdeails");
*/
        click_on_element("AdminPortalElements/EventcreationElements/tab_event");
        base.wait(4);
        clearthevalueintotheelement("AdminPortalElements/EventcreationElements/text_event_searchfield");
        enterthevalueintotheelement(OESlit_eventid,"AdminPortalElements/EventcreationElements/text_event_searchfield");
        click_on_element("AdminPortalElements/EventcreationElements/button_event_searchfieldicon");
        base.wait(3);
        click_on_element("AdminPortalElements/EventcreationElements/table_event_tableresultrow");
        base.wait(3);

        click_on_element("AdminPortalElements/EventcreationElements/tab_event_OESLite");
        base.wait(2);
/*
        //singles

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttab");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        base.wait(8);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");
        base.wait(3);


        //double

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttabofdoubles");


        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Doubles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttabofdoubles");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Doubles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");
        base.wait(3);


        //mixed double

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheadermixeddoubles");


        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Doubles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheadermixeddoubles");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Doubles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");
        base.wait(3);

      //teams

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttabofteams");


        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Teams_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttabofteams");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Teams_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");
        base.wait(3);
*/

        //reports

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheader_reports");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_reports_PlayerEntryReport");
        base.wait(2);

        String visibilityitem1="EntryId";
        String visibilityitem2="EventId";
        String visibilityitem3="SubEvent Name";
        String visibilityitem4="SubEvent Code";
        String visibilityitem5="ittfid";
        String visibilityitem6="Player GivenName";
        String visibilityitem7="Player FamilyName";
        String visibilityitem8="OrgCode";
        String visibilityitem9="Organization";
        String visibilityitem10="Status";
        String visibilityitem11="Seed";
        String visibilityitem12="Current Ranking";
        String visibilityitem13="Current Ranking Points";
        String visibilityitem14="Is Double Entry";
        String visibilityitem15="Pair Number";
        String visibilityitem16="Pair Name";
        String visibilityitem17="Entry Draw Name";
        String visibilityitem18="Entry Quota Type";
        String visibilityitem19="Cancellation Past Final Deadline";
        String visibilityitem20="Protected Ranking";
        String visibilityitem21="Penalized";
        String visibilityitem22="Zero Point Penalty";
        String visibilityitem23="Created Date & Time (UTC)";





        List<String> exceptedlist = new ArrayList<>();

        exceptedlist.add(visibilityitem8);


        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_SelectVisibleFields");
        base.wait(4);

        selectcheckboxfrompopupwindowcontainer(visibilityitem1,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem2,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem3,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem4,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem5,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem6,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem7,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem8,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem9,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem10,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem11,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem12,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem13,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem14,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem15,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem16,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem17,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem18,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem19,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem20,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem21,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem22,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem23,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");




        //selectcheckboxfrompopupwindowcontainer(visibilityitem1,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");

        enterthevalueintotheelement(visibilityitem8,"AdminPortalElements/OESLiteElements/text_OESlite_reports_commonpopupwindowsearchfield");
        getthefield("AdminPortalElements/OESLiteElements/text_OESlite_reports_commonpopupwindowsearchfield");
        webElement.sendKeys(Keys.ENTER);
        base.wait(4);
        driver.findElement(By.cssSelector(".cdk-overlay-backdrop.cdk-overlay-transparent-backdrop.cdk-overlay-backdrop-showing")).click();

        checktheheadervaluefromwebtable(exceptedlist,"AdminPortalElements/OESLiteElements/frame_common_OESlite");


    }

    @Given("^OES Lite report tab for Player Entry Report subtab and Verify the Visibility column field selection dropdown using Organization option$")
    public static void OESLitereporttabforPlayerEntryReportsubtabandVerifytheVisibilitycolumnfieldselectiondropdownusingOrganizationoption()throws Exception{

                                                                                                                                                                            /*
        click_on_element("AdminPortalElements/EventcreationElements/tab_event");
        base.wait(4);
        clearthevalueintotheelement("AdminPortalElements/EventcreationElements/text_event_searchfield");
        enterthevalueintotheelement(OESlit_eventid,"AdminPortalElements/EventcreationElements/text_event_searchfield");
        click_on_element("AdminPortalElements/EventcreationElements/button_event_searchfieldicon");
        base.wait(3);
        click_on_element("AdminPortalElements/EventcreationElements/button_event_tablesearchedeventedit");
        base.wait(3);

        getthefield("AdminPortalElements/EventcreationElements/tab_event_creation_OnlineEntrySystem");
        base.scrollToView(webElement);
        base.wait(1);
        click_on_element("AdminPortalElements/EventcreationElements/tab_event_creation_OnlineEntrySystem");

        clickonenableordisablebutton("Disable","AdminPortalElements/EventcreationElements/toggle_event_creation_OnlineEntrySystem_EnableOES1");

        click_on_element("AdminPortalElements/EventcreationElements/button_event_update");
        base.wait(3);
        element_visiability("AdminPortalElements/EventcreationElements/text1_event_eventdeails");
*/
        click_on_element("AdminPortalElements/EventcreationElements/tab_event");
        base.wait(4);
        clearthevalueintotheelement("AdminPortalElements/EventcreationElements/text_event_searchfield");
        enterthevalueintotheelement(OESlit_eventid,"AdminPortalElements/EventcreationElements/text_event_searchfield");
        click_on_element("AdminPortalElements/EventcreationElements/button_event_searchfieldicon");
        base.wait(3);
        click_on_element("AdminPortalElements/EventcreationElements/table_event_tableresultrow");
        base.wait(3);

        click_on_element("AdminPortalElements/EventcreationElements/tab_event_OESLite");
        base.wait(2);
/*
        //singles

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttab");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        base.wait(8);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");
        base.wait(3);


        //double

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttabofdoubles");


        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Doubles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttabofdoubles");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Doubles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");
        base.wait(3);


        //mixed double

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheadermixeddoubles");


        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Doubles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheadermixeddoubles");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Doubles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");
        base.wait(3);

      //teams

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttabofteams");


        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Teams_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttabofteams");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Teams_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");
        base.wait(3);
*/

        //reports

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheader_reports");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_reports_PlayerEntryReport");
        base.wait(2);

        String visibilityitem1="EntryId";
        String visibilityitem2="EventId";
        String visibilityitem3="SubEvent Name";
        String visibilityitem4="SubEvent Code";
        String visibilityitem5="ittfid";
        String visibilityitem6="Player GivenName";
        String visibilityitem7="Player FamilyName";
        String visibilityitem8="OrgCode";
        String visibilityitem9="Organization";
        String visibilityitem10="Status";
        String visibilityitem11="Seed";
        String visibilityitem12="Current Ranking";
        String visibilityitem13="Current Ranking Points";
        String visibilityitem14="Is Double Entry";
        String visibilityitem15="Pair Number";
        String visibilityitem16="Pair Name";
        String visibilityitem17="Entry Draw Name";
        String visibilityitem18="Entry Quota Type";
        String visibilityitem19="Cancellation Past Final Deadline";
        String visibilityitem20="Protected Ranking";
        String visibilityitem21="Penalized";
        String visibilityitem22="Zero Point Penalty";
        String visibilityitem23="Created Date & Time (UTC)";





        List<String> exceptedlist = new ArrayList<>();

        exceptedlist.add(visibilityitem9);


        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_SelectVisibleFields");
        base.wait(4);

        selectcheckboxfrompopupwindowcontainer(visibilityitem1,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem2,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem3,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem4,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem5,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem6,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem7,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem8,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem9,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem10,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem11,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem12,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem13,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem14,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem15,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem16,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem17,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem18,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem19,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem20,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem21,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem22,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem23,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");




        //selectcheckboxfrompopupwindowcontainer(visibilityitem1,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");

        enterthevalueintotheelement(visibilityitem9,"AdminPortalElements/OESLiteElements/text_OESlite_reports_commonpopupwindowsearchfield");
        getthefield("AdminPortalElements/OESLiteElements/text_OESlite_reports_commonpopupwindowsearchfield");
        webElement.sendKeys(Keys.ENTER);
        base.wait(4);
        driver.findElement(By.cssSelector(".cdk-overlay-backdrop.cdk-overlay-transparent-backdrop.cdk-overlay-backdrop-showing")).click();

        checktheheadervaluefromwebtable(exceptedlist,"AdminPortalElements/OESLiteElements/frame_common_OESlite");


    }

    @Given("^OES Lite report tab for Player Entry Report subtab and Verify the Visibility column field selection dropdown using Status option$")
    public static void OESLitereporttabforPlayerEntryReportsubtabandVerifytheVisibilitycolumnfieldselectiondropdownusingStatusoption()throws Exception{

                                                                                                                                                                            /*
        click_on_element("AdminPortalElements/EventcreationElements/tab_event");
        base.wait(4);
        clearthevalueintotheelement("AdminPortalElements/EventcreationElements/text_event_searchfield");
        enterthevalueintotheelement(OESlit_eventid,"AdminPortalElements/EventcreationElements/text_event_searchfield");
        click_on_element("AdminPortalElements/EventcreationElements/button_event_searchfieldicon");
        base.wait(3);
        click_on_element("AdminPortalElements/EventcreationElements/button_event_tablesearchedeventedit");
        base.wait(3);

        getthefield("AdminPortalElements/EventcreationElements/tab_event_creation_OnlineEntrySystem");
        base.scrollToView(webElement);
        base.wait(1);
        click_on_element("AdminPortalElements/EventcreationElements/tab_event_creation_OnlineEntrySystem");

        clickonenableordisablebutton("Disable","AdminPortalElements/EventcreationElements/toggle_event_creation_OnlineEntrySystem_EnableOES1");

        click_on_element("AdminPortalElements/EventcreationElements/button_event_update");
        base.wait(3);
        element_visiability("AdminPortalElements/EventcreationElements/text1_event_eventdeails");
*/
        click_on_element("AdminPortalElements/EventcreationElements/tab_event");
        base.wait(4);
        clearthevalueintotheelement("AdminPortalElements/EventcreationElements/text_event_searchfield");
        enterthevalueintotheelement(OESlit_eventid,"AdminPortalElements/EventcreationElements/text_event_searchfield");
        click_on_element("AdminPortalElements/EventcreationElements/button_event_searchfieldicon");
        base.wait(3);
        click_on_element("AdminPortalElements/EventcreationElements/table_event_tableresultrow");
        base.wait(3);

        click_on_element("AdminPortalElements/EventcreationElements/tab_event_OESLite");
        base.wait(2);
/*
        //singles

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttab");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        base.wait(8);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");
        base.wait(3);


        //double

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttabofdoubles");


        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Doubles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttabofdoubles");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Doubles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");
        base.wait(3);


        //mixed double

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheadermixeddoubles");


        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Doubles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheadermixeddoubles");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Doubles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");
        base.wait(3);

      //teams

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttabofteams");


        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Teams_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttabofteams");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Teams_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");
        base.wait(3);
*/

        //reports

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheader_reports");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_reports_PlayerEntryReport");
        base.wait(2);

        String visibilityitem1="EntryId";
        String visibilityitem2="EventId";
        String visibilityitem3="SubEvent Name";
        String visibilityitem4="SubEvent Code";
        String visibilityitem5="ittfid";
        String visibilityitem6="Player GivenName";
        String visibilityitem7="Player FamilyName";
        String visibilityitem8="OrgCode";
        String visibilityitem9="Organization";
        String visibilityitem10="Status";
        String visibilityitem11="Seed";
        String visibilityitem12="Current Ranking";
        String visibilityitem13="Current Ranking Points";
        String visibilityitem14="Is Double Entry";
        String visibilityitem15="Pair Number";
        String visibilityitem16="Pair Name";
        String visibilityitem17="Entry Draw Name";
        String visibilityitem18="Entry Quota Type";
        String visibilityitem19="Cancellation Past Final Deadline";
        String visibilityitem20="Protected Ranking";
        String visibilityitem21="Penalized";
        String visibilityitem22="Zero Point Penalty";
        String visibilityitem23="Created Date & Time (UTC)";





        List<String> exceptedlist = new ArrayList<>();

        exceptedlist.add(visibilityitem10);


        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_SelectVisibleFields");
        base.wait(4);

        selectcheckboxfrompopupwindowcontainer(visibilityitem1,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem2,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem3,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem4,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem5,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem6,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem7,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem8,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem9,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem10,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem11,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem12,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem13,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem14,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem15,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem16,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem17,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem18,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem19,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem20,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem21,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem22,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem23,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");




        //selectcheckboxfrompopupwindowcontainer(visibilityitem1,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");

        enterthevalueintotheelement(visibilityitem10,"AdminPortalElements/OESLiteElements/text_OESlite_reports_commonpopupwindowsearchfield");
        getthefield("AdminPortalElements/OESLiteElements/text_OESlite_reports_commonpopupwindowsearchfield");
        webElement.sendKeys(Keys.ENTER);
        base.wait(4);
        driver.findElement(By.cssSelector(".cdk-overlay-backdrop.cdk-overlay-transparent-backdrop.cdk-overlay-backdrop-showing")).click();

        checktheheadervaluefromwebtable(exceptedlist,"AdminPortalElements/OESLiteElements/frame_common_OESlite");


    }

    @Given("^OES Lite report tab for Player Entry Report subtab and Verify the Visibility column field selection dropdown using Seed option$")
    public static void OESLitereporttabforPlayerEntryReportsubtabandVerifytheVisibilitycolumnfieldselectiondropdownusingSeedoption()throws Exception{

                                                                                                                                                                            /*
        click_on_element("AdminPortalElements/EventcreationElements/tab_event");
        base.wait(4);
        clearthevalueintotheelement("AdminPortalElements/EventcreationElements/text_event_searchfield");
        enterthevalueintotheelement(OESlit_eventid,"AdminPortalElements/EventcreationElements/text_event_searchfield");
        click_on_element("AdminPortalElements/EventcreationElements/button_event_searchfieldicon");
        base.wait(3);
        click_on_element("AdminPortalElements/EventcreationElements/button_event_tablesearchedeventedit");
        base.wait(3);

        getthefield("AdminPortalElements/EventcreationElements/tab_event_creation_OnlineEntrySystem");
        base.scrollToView(webElement);
        base.wait(1);
        click_on_element("AdminPortalElements/EventcreationElements/tab_event_creation_OnlineEntrySystem");

        clickonenableordisablebutton("Disable","AdminPortalElements/EventcreationElements/toggle_event_creation_OnlineEntrySystem_EnableOES1");

        click_on_element("AdminPortalElements/EventcreationElements/button_event_update");
        base.wait(3);
        element_visiability("AdminPortalElements/EventcreationElements/text1_event_eventdeails");
*/
        click_on_element("AdminPortalElements/EventcreationElements/tab_event");
        base.wait(4);
        clearthevalueintotheelement("AdminPortalElements/EventcreationElements/text_event_searchfield");
        enterthevalueintotheelement(OESlit_eventid,"AdminPortalElements/EventcreationElements/text_event_searchfield");
        click_on_element("AdminPortalElements/EventcreationElements/button_event_searchfieldicon");
        base.wait(3);
        click_on_element("AdminPortalElements/EventcreationElements/table_event_tableresultrow");
        base.wait(3);

        click_on_element("AdminPortalElements/EventcreationElements/tab_event_OESLite");
        base.wait(2);
/*
        //singles

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttab");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        base.wait(8);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");
        base.wait(3);


        //double

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttabofdoubles");


        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Doubles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttabofdoubles");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Doubles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");
        base.wait(3);


        //mixed double

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheadermixeddoubles");


        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Doubles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheadermixeddoubles");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Doubles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");
        base.wait(3);

      //teams

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttabofteams");


        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Teams_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttabofteams");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Teams_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");
        base.wait(3);
*/

        //reports

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheader_reports");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_reports_PlayerEntryReport");
        base.wait(2);

        String visibilityitem1="EntryId";
        String visibilityitem2="EventId";
        String visibilityitem3="SubEvent Name";
        String visibilityitem4="SubEvent Code";
        String visibilityitem5="ittfid";
        String visibilityitem6="Player GivenName";
        String visibilityitem7="Player FamilyName";
        String visibilityitem8="OrgCode";
        String visibilityitem9="Organization";
        String visibilityitem10="Status";
        String visibilityitem11="Seed";
        String visibilityitem12="Current Ranking";
        String visibilityitem13="Current Ranking Points";
        String visibilityitem14="Is Double Entry";
        String visibilityitem15="Pair Number";
        String visibilityitem16="Pair Name";
        String visibilityitem17="Entry Draw Name";
        String visibilityitem18="Entry Quota Type";
        String visibilityitem19="Cancellation Past Final Deadline";
        String visibilityitem20="Protected Ranking";
        String visibilityitem21="Penalized";
        String visibilityitem22="Zero Point Penalty";
        String visibilityitem23="Created Date & Time (UTC)";





        List<String> exceptedlist = new ArrayList<>();

        exceptedlist.add(visibilityitem11);


        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_SelectVisibleFields");
        base.wait(4);

        selectcheckboxfrompopupwindowcontainer(visibilityitem1,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem2,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem3,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem4,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem5,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem6,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem7,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem8,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem9,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem10,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem11,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem12,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem13,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem14,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem15,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem16,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem17,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem18,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem19,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem20,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem21,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem22,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem23,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");




        //selectcheckboxfrompopupwindowcontainer(visibilityitem1,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");

        enterthevalueintotheelement(visibilityitem11,"AdminPortalElements/OESLiteElements/text_OESlite_reports_commonpopupwindowsearchfield");
        getthefield("AdminPortalElements/OESLiteElements/text_OESlite_reports_commonpopupwindowsearchfield");
        webElement.sendKeys(Keys.ENTER);
        base.wait(4);
        driver.findElement(By.cssSelector(".cdk-overlay-backdrop.cdk-overlay-transparent-backdrop.cdk-overlay-backdrop-showing")).click();

        checktheheadervaluefromwebtable(exceptedlist,"AdminPortalElements/OESLiteElements/frame_common_OESlite");


    }

    @Given("^OES Lite report tab for Player Entry Report subtab and Verify the Visibility column field selection dropdown using Current Ranking option$")
    public static void OESLitereporttabforPlayerEntryReportsubtabandVerifytheVisibilitycolumnfieldselectiondropdownusingCurrentRankingoption()throws Exception{

                                                                                                                                                                            /*
        click_on_element("AdminPortalElements/EventcreationElements/tab_event");
        base.wait(4);
        clearthevalueintotheelement("AdminPortalElements/EventcreationElements/text_event_searchfield");
        enterthevalueintotheelement(OESlit_eventid,"AdminPortalElements/EventcreationElements/text_event_searchfield");
        click_on_element("AdminPortalElements/EventcreationElements/button_event_searchfieldicon");
        base.wait(3);
        click_on_element("AdminPortalElements/EventcreationElements/button_event_tablesearchedeventedit");
        base.wait(3);

        getthefield("AdminPortalElements/EventcreationElements/tab_event_creation_OnlineEntrySystem");
        base.scrollToView(webElement);
        base.wait(1);
        click_on_element("AdminPortalElements/EventcreationElements/tab_event_creation_OnlineEntrySystem");

        clickonenableordisablebutton("Disable","AdminPortalElements/EventcreationElements/toggle_event_creation_OnlineEntrySystem_EnableOES1");

        click_on_element("AdminPortalElements/EventcreationElements/button_event_update");
        base.wait(3);
        element_visiability("AdminPortalElements/EventcreationElements/text1_event_eventdeails");
*/
        click_on_element("AdminPortalElements/EventcreationElements/tab_event");
        base.wait(4);
        clearthevalueintotheelement("AdminPortalElements/EventcreationElements/text_event_searchfield");
        enterthevalueintotheelement(OESlit_eventid,"AdminPortalElements/EventcreationElements/text_event_searchfield");
        click_on_element("AdminPortalElements/EventcreationElements/button_event_searchfieldicon");
        base.wait(3);
        click_on_element("AdminPortalElements/EventcreationElements/table_event_tableresultrow");
        base.wait(3);

        click_on_element("AdminPortalElements/EventcreationElements/tab_event_OESLite");
        base.wait(2);
/*
        //singles

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttab");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        base.wait(8);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");
        base.wait(3);


        //double

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttabofdoubles");


        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Doubles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttabofdoubles");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Doubles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");
        base.wait(3);


        //mixed double

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheadermixeddoubles");


        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Doubles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheadermixeddoubles");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Doubles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");
        base.wait(3);

      //teams

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttabofteams");


        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Teams_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttabofteams");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Teams_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");
        base.wait(3);
*/

        //reports

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheader_reports");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_reports_PlayerEntryReport");
        base.wait(2);

        String visibilityitem1="EntryId";
        String visibilityitem2="EventId";
        String visibilityitem3="SubEvent Name";
        String visibilityitem4="SubEvent Code";
        String visibilityitem5="ittfid";
        String visibilityitem6="Player GivenName";
        String visibilityitem7="Player FamilyName";
        String visibilityitem8="OrgCode";
        String visibilityitem9="Organization";
        String visibilityitem10="Status";
        String visibilityitem11="Seed";
        String visibilityitem12="Current Ranking";
        String visibilityitem13="Current Ranking Points";
        String visibilityitem14="Is Double Entry";
        String visibilityitem15="Pair Number";
        String visibilityitem16="Pair Name";
        String visibilityitem17="Entry Draw Name";
        String visibilityitem18="Entry Quota Type";
        String visibilityitem19="Cancellation Past Final Deadline";
        String visibilityitem20="Protected Ranking";
        String visibilityitem21="Penalized";
        String visibilityitem22="Zero Point Penalty";
        String visibilityitem23="Created Date & Time (UTC)";





        List<String> exceptedlist = new ArrayList<>();

        exceptedlist.add(visibilityitem12);


        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_SelectVisibleFields");
        base.wait(4);

        selectcheckboxfrompopupwindowcontainer(visibilityitem1,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem2,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem3,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem4,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem5,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem6,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem7,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem8,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem9,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem10,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem11,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem12,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem13,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem14,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem15,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem16,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem17,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem18,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem19,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem20,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem21,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem22,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem23,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");




        //selectcheckboxfrompopupwindowcontainer(visibilityitem1,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");

        enterthevalueintotheelement(visibilityitem12,"AdminPortalElements/OESLiteElements/text_OESlite_reports_commonpopupwindowsearchfield");
        getthefield("AdminPortalElements/OESLiteElements/text_OESlite_reports_commonpopupwindowsearchfield");
        webElement.sendKeys(Keys.ENTER);
        base.wait(4);
        driver.findElement(By.cssSelector(".cdk-overlay-backdrop.cdk-overlay-transparent-backdrop.cdk-overlay-backdrop-showing")).click();

        checktheheadervaluefromwebtable(exceptedlist,"AdminPortalElements/OESLiteElements/frame_common_OESlite");


    }

    @Given("^OES Lite report tab for Player Entry Report subtab and Verify the Visibility column field selection dropdown using Current Ranking Points option$")
    public static void OESLitereporttabforPlayerEntryReportsubtabandVerifytheVisibilitycolumnfieldselectiondropdownusingCurrentRankingPointsoption()throws Exception{

                                                                                                                                                                            /*
        click_on_element("AdminPortalElements/EventcreationElements/tab_event");
        base.wait(4);
        clearthevalueintotheelement("AdminPortalElements/EventcreationElements/text_event_searchfield");
        enterthevalueintotheelement(OESlit_eventid,"AdminPortalElements/EventcreationElements/text_event_searchfield");
        click_on_element("AdminPortalElements/EventcreationElements/button_event_searchfieldicon");
        base.wait(3);
        click_on_element("AdminPortalElements/EventcreationElements/button_event_tablesearchedeventedit");
        base.wait(3);

        getthefield("AdminPortalElements/EventcreationElements/tab_event_creation_OnlineEntrySystem");
        base.scrollToView(webElement);
        base.wait(1);
        click_on_element("AdminPortalElements/EventcreationElements/tab_event_creation_OnlineEntrySystem");

        clickonenableordisablebutton("Disable","AdminPortalElements/EventcreationElements/toggle_event_creation_OnlineEntrySystem_EnableOES1");

        click_on_element("AdminPortalElements/EventcreationElements/button_event_update");
        base.wait(3);
        element_visiability("AdminPortalElements/EventcreationElements/text1_event_eventdeails");
*/
        click_on_element("AdminPortalElements/EventcreationElements/tab_event");
        base.wait(4);
        clearthevalueintotheelement("AdminPortalElements/EventcreationElements/text_event_searchfield");
        enterthevalueintotheelement(OESlit_eventid,"AdminPortalElements/EventcreationElements/text_event_searchfield");
        click_on_element("AdminPortalElements/EventcreationElements/button_event_searchfieldicon");
        base.wait(3);
        click_on_element("AdminPortalElements/EventcreationElements/table_event_tableresultrow");
        base.wait(3);

        click_on_element("AdminPortalElements/EventcreationElements/tab_event_OESLite");
        base.wait(2);
/*
        //singles

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttab");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        base.wait(8);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");
        base.wait(3);


        //double

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttabofdoubles");


        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Doubles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttabofdoubles");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Doubles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");
        base.wait(3);


        //mixed double

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheadermixeddoubles");


        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Doubles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheadermixeddoubles");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Doubles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");
        base.wait(3);

      //teams

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttabofteams");


        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Teams_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttabofteams");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Teams_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");
        base.wait(3);
*/

        //reports

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheader_reports");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_reports_PlayerEntryReport");
        base.wait(2);

        String visibilityitem1="EntryId";
        String visibilityitem2="EventId";
        String visibilityitem3="SubEvent Name";
        String visibilityitem4="SubEvent Code";
        String visibilityitem5="ittfid";
        String visibilityitem6="Player GivenName";
        String visibilityitem7="Player FamilyName";
        String visibilityitem8="OrgCode";
        String visibilityitem9="Organization";
        String visibilityitem10="Status";
        String visibilityitem11="Seed";
        String visibilityitem12="Current Ranking";
        String visibilityitem13="Current Ranking Points";
        String visibilityitem14="Is Double Entry";
        String visibilityitem15="Pair Number";
        String visibilityitem16="Pair Name";
        String visibilityitem17="Entry Draw Name";
        String visibilityitem18="Entry Quota Type";
        String visibilityitem19="Cancellation Past Final Deadline";
        String visibilityitem20="Protected Ranking";
        String visibilityitem21="Penalized";
        String visibilityitem22="Zero Point Penalty";
        String visibilityitem23="Created Date & Time (UTC)";





        List<String> exceptedlist = new ArrayList<>();

        exceptedlist.add(visibilityitem13);


        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_SelectVisibleFields");
        base.wait(4);

        selectcheckboxfrompopupwindowcontainer(visibilityitem1,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem2,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem3,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem4,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem5,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem6,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem7,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem8,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem9,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem10,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem11,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem12,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem13,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem14,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem15,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem16,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem17,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem18,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem19,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem20,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem21,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem22,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem23,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");




        //selectcheckboxfrompopupwindowcontainer(visibilityitem1,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");

        enterthevalueintotheelement(visibilityitem13,"AdminPortalElements/OESLiteElements/text_OESlite_reports_commonpopupwindowsearchfield");
        getthefield("AdminPortalElements/OESLiteElements/text_OESlite_reports_commonpopupwindowsearchfield");
        webElement.sendKeys(Keys.ENTER);
        base.wait(4);
        driver.findElement(By.cssSelector(".cdk-overlay-backdrop.cdk-overlay-transparent-backdrop.cdk-overlay-backdrop-showing")).click();

        checktheheadervaluefromwebtable(exceptedlist,"AdminPortalElements/OESLiteElements/frame_common_OESlite");


    }

    @Given("^OES Lite report tab for Player Entry Report subtab and Verify the Visibility column field selection dropdown using Is Double Entry option$")
    public static void OESLitereporttabforPlayerEntryReportsubtabandVerifytheVisibilitycolumnfieldselectiondropdownusingIsDoubleEntryoption()throws Exception{

                                                                                                                                                                            /*
        click_on_element("AdminPortalElements/EventcreationElements/tab_event");
        base.wait(4);
        clearthevalueintotheelement("AdminPortalElements/EventcreationElements/text_event_searchfield");
        enterthevalueintotheelement(OESlit_eventid,"AdminPortalElements/EventcreationElements/text_event_searchfield");
        click_on_element("AdminPortalElements/EventcreationElements/button_event_searchfieldicon");
        base.wait(3);
        click_on_element("AdminPortalElements/EventcreationElements/button_event_tablesearchedeventedit");
        base.wait(3);

        getthefield("AdminPortalElements/EventcreationElements/tab_event_creation_OnlineEntrySystem");
        base.scrollToView(webElement);
        base.wait(1);
        click_on_element("AdminPortalElements/EventcreationElements/tab_event_creation_OnlineEntrySystem");

        clickonenableordisablebutton("Disable","AdminPortalElements/EventcreationElements/toggle_event_creation_OnlineEntrySystem_EnableOES1");

        click_on_element("AdminPortalElements/EventcreationElements/button_event_update");
        base.wait(3);
        element_visiability("AdminPortalElements/EventcreationElements/text1_event_eventdeails");
*/
        click_on_element("AdminPortalElements/EventcreationElements/tab_event");
        base.wait(4);
        clearthevalueintotheelement("AdminPortalElements/EventcreationElements/text_event_searchfield");
        enterthevalueintotheelement(OESlit_eventid,"AdminPortalElements/EventcreationElements/text_event_searchfield");
        click_on_element("AdminPortalElements/EventcreationElements/button_event_searchfieldicon");
        base.wait(3);
        click_on_element("AdminPortalElements/EventcreationElements/table_event_tableresultrow");
        base.wait(3);

        click_on_element("AdminPortalElements/EventcreationElements/tab_event_OESLite");
        base.wait(2);
/*
        //singles

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttab");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        base.wait(8);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");
        base.wait(3);


        //double

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttabofdoubles");


        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Doubles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttabofdoubles");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Doubles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");
        base.wait(3);


        //mixed double

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheadermixeddoubles");


        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Doubles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheadermixeddoubles");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Doubles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");
        base.wait(3);

      //teams

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttabofteams");


        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Teams_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttabofteams");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Teams_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");
        base.wait(3);
*/

        //reports

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheader_reports");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_reports_PlayerEntryReport");
        base.wait(2);

        String visibilityitem1="EntryId";
        String visibilityitem2="EventId";
        String visibilityitem3="SubEvent Name";
        String visibilityitem4="SubEvent Code";
        String visibilityitem5="ittfid";
        String visibilityitem6="Player GivenName";
        String visibilityitem7="Player FamilyName";
        String visibilityitem8="OrgCode";
        String visibilityitem9="Organization";
        String visibilityitem10="Status";
        String visibilityitem11="Seed";
        String visibilityitem12="Current Ranking";
        String visibilityitem13="Current Ranking Points";
        String visibilityitem14="Is Double Entry";
        String visibilityitem15="Pair Number";
        String visibilityitem16="Pair Name";
        String visibilityitem17="Entry Draw Name";
        String visibilityitem18="Entry Quota Type";
        String visibilityitem19="Cancellation Past Final Deadline";
        String visibilityitem20="Protected Ranking";
        String visibilityitem21="Penalized";
        String visibilityitem22="Zero Point Penalty";
        String visibilityitem23="Created Date & Time (UTC)";





        List<String> exceptedlist = new ArrayList<>();

        exceptedlist.add(visibilityitem14);


        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_SelectVisibleFields");
        base.wait(4);

        selectcheckboxfrompopupwindowcontainer(visibilityitem1,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem2,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem3,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem4,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem5,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem6,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem7,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem8,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem9,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem10,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem11,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem12,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem13,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem14,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem15,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem16,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem17,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem18,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem19,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem20,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem21,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem22,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem23,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");




        //selectcheckboxfrompopupwindowcontainer(visibilityitem1,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");

        enterthevalueintotheelement(visibilityitem14,"AdminPortalElements/OESLiteElements/text_OESlite_reports_commonpopupwindowsearchfield");
        getthefield("AdminPortalElements/OESLiteElements/text_OESlite_reports_commonpopupwindowsearchfield");
        webElement.sendKeys(Keys.ENTER);
        base.wait(4);
        driver.findElement(By.cssSelector(".cdk-overlay-backdrop.cdk-overlay-transparent-backdrop.cdk-overlay-backdrop-showing")).click();

        checktheheadervaluefromwebtable(exceptedlist,"AdminPortalElements/OESLiteElements/frame_common_OESlite");


    }

    @Given("^OES Lite report tab for Player Entry Report subtab and Verify the Visibility column field selection dropdown using Pair Number option$")
    public static void OESLitereporttabforPlayerEntryReportsubtabandVerifytheVisibilitycolumnfieldselectiondropdownusingPairNumberoption()throws Exception{

                                                                                                                                                                            /*
        click_on_element("AdminPortalElements/EventcreationElements/tab_event");
        base.wait(4);
        clearthevalueintotheelement("AdminPortalElements/EventcreationElements/text_event_searchfield");
        enterthevalueintotheelement(OESlit_eventid,"AdminPortalElements/EventcreationElements/text_event_searchfield");
        click_on_element("AdminPortalElements/EventcreationElements/button_event_searchfieldicon");
        base.wait(3);
        click_on_element("AdminPortalElements/EventcreationElements/button_event_tablesearchedeventedit");
        base.wait(3);

        getthefield("AdminPortalElements/EventcreationElements/tab_event_creation_OnlineEntrySystem");
        base.scrollToView(webElement);
        base.wait(1);
        click_on_element("AdminPortalElements/EventcreationElements/tab_event_creation_OnlineEntrySystem");

        clickonenableordisablebutton("Disable","AdminPortalElements/EventcreationElements/toggle_event_creation_OnlineEntrySystem_EnableOES1");

        click_on_element("AdminPortalElements/EventcreationElements/button_event_update");
        base.wait(3);
        element_visiability("AdminPortalElements/EventcreationElements/text1_event_eventdeails");
*/
        click_on_element("AdminPortalElements/EventcreationElements/tab_event");
        base.wait(4);
        clearthevalueintotheelement("AdminPortalElements/EventcreationElements/text_event_searchfield");
        enterthevalueintotheelement(OESlit_eventid,"AdminPortalElements/EventcreationElements/text_event_searchfield");
        click_on_element("AdminPortalElements/EventcreationElements/button_event_searchfieldicon");
        base.wait(3);
        click_on_element("AdminPortalElements/EventcreationElements/table_event_tableresultrow");
        base.wait(3);

        click_on_element("AdminPortalElements/EventcreationElements/tab_event_OESLite");
        base.wait(2);
/*
        //singles

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttab");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        base.wait(8);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");
        base.wait(3);


        //double

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttabofdoubles");


        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Doubles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttabofdoubles");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Doubles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");
        base.wait(3);


        //mixed double

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheadermixeddoubles");


        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Doubles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheadermixeddoubles");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Doubles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");
        base.wait(3);

      //teams

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttabofteams");


        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Teams_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttabofteams");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Teams_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");
        base.wait(3);
*/

        //reports

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheader_reports");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_reports_PlayerEntryReport");
        base.wait(2);

        String visibilityitem1="EntryId";
        String visibilityitem2="EventId";
        String visibilityitem3="SubEvent Name";
        String visibilityitem4="SubEvent Code";
        String visibilityitem5="ittfid";
        String visibilityitem6="Player GivenName";
        String visibilityitem7="Player FamilyName";
        String visibilityitem8="OrgCode";
        String visibilityitem9="Organization";
        String visibilityitem10="Status";
        String visibilityitem11="Seed";
        String visibilityitem12="Current Ranking";
        String visibilityitem13="Current Ranking Points";
        String visibilityitem14="Is Double Entry";
        String visibilityitem15="Pair Number";
        String visibilityitem16="Pair Name";
        String visibilityitem17="Entry Draw Name";
        String visibilityitem18="Entry Quota Type";
        String visibilityitem19="Cancellation Past Final Deadline";
        String visibilityitem20="Protected Ranking";
        String visibilityitem21="Penalized";
        String visibilityitem22="Zero Point Penalty";
        String visibilityitem23="Created Date & Time (UTC)";





        List<String> exceptedlist = new ArrayList<>();

        exceptedlist.add(visibilityitem15);


        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_SelectVisibleFields");
        base.wait(4);

        selectcheckboxfrompopupwindowcontainer(visibilityitem1,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem2,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem3,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem4,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem5,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem6,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem7,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem8,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem9,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem10,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem11,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem12,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem13,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem14,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem15,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem16,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem17,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem18,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem19,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem20,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem21,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem22,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem23,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");




        //selectcheckboxfrompopupwindowcontainer(visibilityitem1,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");

        enterthevalueintotheelement(visibilityitem15,"AdminPortalElements/OESLiteElements/text_OESlite_reports_commonpopupwindowsearchfield");
        getthefield("AdminPortalElements/OESLiteElements/text_OESlite_reports_commonpopupwindowsearchfield");
        webElement.sendKeys(Keys.ENTER);
        base.wait(4);
        driver.findElement(By.cssSelector(".cdk-overlay-backdrop.cdk-overlay-transparent-backdrop.cdk-overlay-backdrop-showing")).click();

        checktheheadervaluefromwebtable(exceptedlist,"AdminPortalElements/OESLiteElements/frame_common_OESlite");


    }

    @Given("^OES Lite report tab for Player Entry Report subtab and Verify the Visibility column field selection dropdown using Entry Draw Name option$")
    public static void OESLitereporttabforPlayerEntryReportsubtabandVerifytheVisibilitycolumnfieldselectiondropdownusingEntryDrawNameoption()throws Exception{

                                                                                                                                                                            /*
        click_on_element("AdminPortalElements/EventcreationElements/tab_event");
        base.wait(4);
        clearthevalueintotheelement("AdminPortalElements/EventcreationElements/text_event_searchfield");
        enterthevalueintotheelement(OESlit_eventid,"AdminPortalElements/EventcreationElements/text_event_searchfield");
        click_on_element("AdminPortalElements/EventcreationElements/button_event_searchfieldicon");
        base.wait(3);
        click_on_element("AdminPortalElements/EventcreationElements/button_event_tablesearchedeventedit");
        base.wait(3);

        getthefield("AdminPortalElements/EventcreationElements/tab_event_creation_OnlineEntrySystem");
        base.scrollToView(webElement);
        base.wait(1);
        click_on_element("AdminPortalElements/EventcreationElements/tab_event_creation_OnlineEntrySystem");

        clickonenableordisablebutton("Disable","AdminPortalElements/EventcreationElements/toggle_event_creation_OnlineEntrySystem_EnableOES1");

        click_on_element("AdminPortalElements/EventcreationElements/button_event_update");
        base.wait(3);
        element_visiability("AdminPortalElements/EventcreationElements/text1_event_eventdeails");
*/
        click_on_element("AdminPortalElements/EventcreationElements/tab_event");
        base.wait(4);
        clearthevalueintotheelement("AdminPortalElements/EventcreationElements/text_event_searchfield");
        enterthevalueintotheelement(OESlit_eventid,"AdminPortalElements/EventcreationElements/text_event_searchfield");
        click_on_element("AdminPortalElements/EventcreationElements/button_event_searchfieldicon");
        base.wait(3);
        click_on_element("AdminPortalElements/EventcreationElements/table_event_tableresultrow");
        base.wait(3);

        click_on_element("AdminPortalElements/EventcreationElements/tab_event_OESLite");
        base.wait(2);
/*
        //singles

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttab");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        base.wait(8);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");
        base.wait(3);


        //double

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttabofdoubles");


        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Doubles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttabofdoubles");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Doubles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");
        base.wait(3);


        //mixed double

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheadermixeddoubles");


        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Doubles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheadermixeddoubles");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Doubles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");
        base.wait(3);

      //teams

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttabofteams");


        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Teams_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttabofteams");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Teams_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");
        base.wait(3);
*/

        //reports

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheader_reports");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_reports_PlayerEntryReport");
        base.wait(2);

        String visibilityitem1="EntryId";
        String visibilityitem2="EventId";
        String visibilityitem3="SubEvent Name";
        String visibilityitem4="SubEvent Code";
        String visibilityitem5="ittfid";
        String visibilityitem6="Player GivenName";
        String visibilityitem7="Player FamilyName";
        String visibilityitem8="OrgCode";
        String visibilityitem9="Organization";
        String visibilityitem10="Status";
        String visibilityitem11="Seed";
        String visibilityitem12="Current Ranking";
        String visibilityitem13="Current Ranking Points";
        String visibilityitem14="Is Double Entry";
        String visibilityitem15="Pair Number";
        String visibilityitem16="Pair Name";
        String visibilityitem17="Entry Draw Name";
        String visibilityitem18="Entry Quota Type";
        String visibilityitem19="Cancellation Past Final Deadline";
        String visibilityitem20="Protected Ranking";
        String visibilityitem21="Penalized";
        String visibilityitem22="Zero Point Penalty";
        String visibilityitem23="Created Date & Time (UTC)";





        List<String> exceptedlist = new ArrayList<>();

        exceptedlist.add(visibilityitem17);


        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_SelectVisibleFields");
        base.wait(4);

        selectcheckboxfrompopupwindowcontainer(visibilityitem1,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem2,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem3,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem4,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem5,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem6,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem7,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem8,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem9,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem10,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem11,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem12,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem13,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem14,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem15,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem16,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem17,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem18,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem19,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem20,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem21,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem22,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem23,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");




        //selectcheckboxfrompopupwindowcontainer(visibilityitem1,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");

        enterthevalueintotheelement(visibilityitem17,"AdminPortalElements/OESLiteElements/text_OESlite_reports_commonpopupwindowsearchfield");
        getthefield("AdminPortalElements/OESLiteElements/text_OESlite_reports_commonpopupwindowsearchfield");
        webElement.sendKeys(Keys.ENTER);
        base.wait(4);
        driver.findElement(By.cssSelector(".cdk-overlay-backdrop.cdk-overlay-transparent-backdrop.cdk-overlay-backdrop-showing")).click();

        checktheheadervaluefromwebtable(exceptedlist,"AdminPortalElements/OESLiteElements/frame_common_OESlite");


    }

    @Given("^OES Lite report tab for Player Entry Report subtab and Verify the Visibility column field selection dropdown using Entry Quota Type option$")
    public static void OESLitereporttabforPlayerEntryReportsubtabandVerifytheVisibilitycolumnfieldselectiondropdownusingEntryQuotaTypeoption()throws Exception{

                                                                                                                                                                            /*
        click_on_element("AdminPortalElements/EventcreationElements/tab_event");
        base.wait(4);
        clearthevalueintotheelement("AdminPortalElements/EventcreationElements/text_event_searchfield");
        enterthevalueintotheelement(OESlit_eventid,"AdminPortalElements/EventcreationElements/text_event_searchfield");
        click_on_element("AdminPortalElements/EventcreationElements/button_event_searchfieldicon");
        base.wait(3);
        click_on_element("AdminPortalElements/EventcreationElements/button_event_tablesearchedeventedit");
        base.wait(3);

        getthefield("AdminPortalElements/EventcreationElements/tab_event_creation_OnlineEntrySystem");
        base.scrollToView(webElement);
        base.wait(1);
        click_on_element("AdminPortalElements/EventcreationElements/tab_event_creation_OnlineEntrySystem");

        clickonenableordisablebutton("Disable","AdminPortalElements/EventcreationElements/toggle_event_creation_OnlineEntrySystem_EnableOES1");

        click_on_element("AdminPortalElements/EventcreationElements/button_event_update");
        base.wait(3);
        element_visiability("AdminPortalElements/EventcreationElements/text1_event_eventdeails");
*/
        click_on_element("AdminPortalElements/EventcreationElements/tab_event");
        base.wait(4);
        clearthevalueintotheelement("AdminPortalElements/EventcreationElements/text_event_searchfield");
        enterthevalueintotheelement(OESlit_eventid,"AdminPortalElements/EventcreationElements/text_event_searchfield");
        click_on_element("AdminPortalElements/EventcreationElements/button_event_searchfieldicon");
        base.wait(3);
        click_on_element("AdminPortalElements/EventcreationElements/table_event_tableresultrow");
        base.wait(3);

        click_on_element("AdminPortalElements/EventcreationElements/tab_event_OESLite");
        base.wait(2);
/*
        //singles

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttab");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        base.wait(8);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");
        base.wait(3);


        //double

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttabofdoubles");


        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Doubles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttabofdoubles");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Doubles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");
        base.wait(3);


        //mixed double

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheadermixeddoubles");


        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Doubles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheadermixeddoubles");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Doubles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");
        base.wait(3);

      //teams

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttabofteams");


        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Teams_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttabofteams");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Teams_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");
        base.wait(3);
*/

        //reports

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheader_reports");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_reports_PlayerEntryReport");
        base.wait(2);

        String visibilityitem1="EntryId";
        String visibilityitem2="EventId";
        String visibilityitem3="SubEvent Name";
        String visibilityitem4="SubEvent Code";
        String visibilityitem5="ittfid";
        String visibilityitem6="Player GivenName";
        String visibilityitem7="Player FamilyName";
        String visibilityitem8="OrgCode";
        String visibilityitem9="Organization";
        String visibilityitem10="Status";
        String visibilityitem11="Seed";
        String visibilityitem12="Current Ranking";
        String visibilityitem13="Current Ranking Points";
        String visibilityitem14="Is Double Entry";
        String visibilityitem15="Pair Number";
        String visibilityitem16="Pair Name";
        String visibilityitem17="Entry Draw Name";
        String visibilityitem18="Entry Quota Type";
        String visibilityitem19="Cancellation Past Final Deadline";
        String visibilityitem20="Protected Ranking";
        String visibilityitem21="Penalized";
        String visibilityitem22="Zero Point Penalty";
        String visibilityitem23="Created Date & Time (UTC)";





        List<String> exceptedlist = new ArrayList<>();

        exceptedlist.add(visibilityitem18);


        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_SelectVisibleFields");
        base.wait(4);

        selectcheckboxfrompopupwindowcontainer(visibilityitem1,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem2,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem3,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem4,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem5,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem6,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem7,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem8,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem9,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem10,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem11,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem12,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem13,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem14,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem15,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem16,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem17,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem18,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem19,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem20,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem21,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem22,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem23,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");




        //selectcheckboxfrompopupwindowcontainer(visibilityitem1,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");

        enterthevalueintotheelement(visibilityitem18,"AdminPortalElements/OESLiteElements/text_OESlite_reports_commonpopupwindowsearchfield");
        getthefield("AdminPortalElements/OESLiteElements/text_OESlite_reports_commonpopupwindowsearchfield");
        webElement.sendKeys(Keys.ENTER);
        base.wait(4);
        driver.findElement(By.cssSelector(".cdk-overlay-backdrop.cdk-overlay-transparent-backdrop.cdk-overlay-backdrop-showing")).click();

        checktheheadervaluefromwebtable(exceptedlist,"AdminPortalElements/OESLiteElements/frame_common_OESlite");


    }

    @Given("^OES Lite report tab for Player Entry Report subtab and Verify the Visibility column field selection dropdown using Cancellation Past Final Deadline option$")
    public static void OESLitereporttabforPlayerEntryReportsubtabandVerifytheVisibilitycolumnfieldselectiondropdownusingCancellationPastFinalDeadlineoption()throws Exception{

                                                                                                                                                                            /*
        click_on_element("AdminPortalElements/EventcreationElements/tab_event");
        base.wait(4);
        clearthevalueintotheelement("AdminPortalElements/EventcreationElements/text_event_searchfield");
        enterthevalueintotheelement(OESlit_eventid,"AdminPortalElements/EventcreationElements/text_event_searchfield");
        click_on_element("AdminPortalElements/EventcreationElements/button_event_searchfieldicon");
        base.wait(3);
        click_on_element("AdminPortalElements/EventcreationElements/button_event_tablesearchedeventedit");
        base.wait(3);

        getthefield("AdminPortalElements/EventcreationElements/tab_event_creation_OnlineEntrySystem");
        base.scrollToView(webElement);
        base.wait(1);
        click_on_element("AdminPortalElements/EventcreationElements/tab_event_creation_OnlineEntrySystem");

        clickonenableordisablebutton("Disable","AdminPortalElements/EventcreationElements/toggle_event_creation_OnlineEntrySystem_EnableOES1");

        click_on_element("AdminPortalElements/EventcreationElements/button_event_update");
        base.wait(3);
        element_visiability("AdminPortalElements/EventcreationElements/text1_event_eventdeails");
*/
        click_on_element("AdminPortalElements/EventcreationElements/tab_event");
        base.wait(4);
        clearthevalueintotheelement("AdminPortalElements/EventcreationElements/text_event_searchfield");
        enterthevalueintotheelement(OESlit_eventid,"AdminPortalElements/EventcreationElements/text_event_searchfield");
        click_on_element("AdminPortalElements/EventcreationElements/button_event_searchfieldicon");
        base.wait(3);
        click_on_element("AdminPortalElements/EventcreationElements/table_event_tableresultrow");
        base.wait(3);

        click_on_element("AdminPortalElements/EventcreationElements/tab_event_OESLite");
        base.wait(2);
/*
        //singles

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttab");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        base.wait(8);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");
        base.wait(3);


        //double

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttabofdoubles");


        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Doubles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttabofdoubles");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Doubles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");
        base.wait(3);


        //mixed double

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheadermixeddoubles");


        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Doubles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheadermixeddoubles");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Doubles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");
        base.wait(3);

      //teams

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttabofteams");


        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Teams_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttabofteams");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Teams_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");
        base.wait(3);
*/

        //reports

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheader_reports");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_reports_PlayerEntryReport");
        base.wait(2);

        String visibilityitem1="EntryId";
        String visibilityitem2="EventId";
        String visibilityitem3="SubEvent Name";
        String visibilityitem4="SubEvent Code";
        String visibilityitem5="ittfid";
        String visibilityitem6="Player GivenName";
        String visibilityitem7="Player FamilyName";
        String visibilityitem8="OrgCode";
        String visibilityitem9="Organization";
        String visibilityitem10="Status";
        String visibilityitem11="Seed";
        String visibilityitem12="Current Ranking";
        String visibilityitem13="Current Ranking Points";
        String visibilityitem14="Is Double Entry";
        String visibilityitem15="Pair Number";
        String visibilityitem16="Pair Name";
        String visibilityitem17="Entry Draw Name";
        String visibilityitem18="Entry Quota Type";
        String visibilityitem19="Cancellation Past Final Deadline";
        String visibilityitem20="Protected Ranking";
        String visibilityitem21="Penalized";
        String visibilityitem22="Zero Point Penalty";
        String visibilityitem23="Created Date & Time (UTC)";





        List<String> exceptedlist = new ArrayList<>();

        exceptedlist.add(visibilityitem19);


        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_SelectVisibleFields");
        base.wait(4);

        selectcheckboxfrompopupwindowcontainer(visibilityitem1,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem2,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem3,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem4,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem5,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem6,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem7,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem8,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem9,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem10,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem11,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem12,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem13,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem14,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem15,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem16,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem17,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem18,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem19,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem20,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem21,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem22,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem23,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");




        //selectcheckboxfrompopupwindowcontainer(visibilityitem1,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");

        enterthevalueintotheelement(visibilityitem19,"AdminPortalElements/OESLiteElements/text_OESlite_reports_commonpopupwindowsearchfield");
        getthefield("AdminPortalElements/OESLiteElements/text_OESlite_reports_commonpopupwindowsearchfield");
        webElement.sendKeys(Keys.ENTER);
        base.wait(4);
        driver.findElement(By.cssSelector(".cdk-overlay-backdrop.cdk-overlay-transparent-backdrop.cdk-overlay-backdrop-showing")).click();

        checktheheadervaluefromwebtable(exceptedlist,"AdminPortalElements/OESLiteElements/frame_common_OESlite");


    }

    @Given("^OES Lite report tab for Player Entry Report subtab and Verify the Visibility column field selection dropdown using Protected Ranking option$")
    public static void OESLitereporttabforPlayerEntryReportsubtabandVerifytheVisibilitycolumnfieldselectiondropdownusingProtectedRankingoption()throws Exception{

                                                                                                                                                                            /*
        click_on_element("AdminPortalElements/EventcreationElements/tab_event");
        base.wait(4);
        clearthevalueintotheelement("AdminPortalElements/EventcreationElements/text_event_searchfield");
        enterthevalueintotheelement(OESlit_eventid,"AdminPortalElements/EventcreationElements/text_event_searchfield");
        click_on_element("AdminPortalElements/EventcreationElements/button_event_searchfieldicon");
        base.wait(3);
        click_on_element("AdminPortalElements/EventcreationElements/button_event_tablesearchedeventedit");
        base.wait(3);

        getthefield("AdminPortalElements/EventcreationElements/tab_event_creation_OnlineEntrySystem");
        base.scrollToView(webElement);
        base.wait(1);
        click_on_element("AdminPortalElements/EventcreationElements/tab_event_creation_OnlineEntrySystem");

        clickonenableordisablebutton("Disable","AdminPortalElements/EventcreationElements/toggle_event_creation_OnlineEntrySystem_EnableOES1");

        click_on_element("AdminPortalElements/EventcreationElements/button_event_update");
        base.wait(3);
        element_visiability("AdminPortalElements/EventcreationElements/text1_event_eventdeails");
*/
        click_on_element("AdminPortalElements/EventcreationElements/tab_event");
        base.wait(4);
        clearthevalueintotheelement("AdminPortalElements/EventcreationElements/text_event_searchfield");
        enterthevalueintotheelement(OESlit_eventid,"AdminPortalElements/EventcreationElements/text_event_searchfield");
        click_on_element("AdminPortalElements/EventcreationElements/button_event_searchfieldicon");
        base.wait(3);
        click_on_element("AdminPortalElements/EventcreationElements/table_event_tableresultrow");
        base.wait(3);

        click_on_element("AdminPortalElements/EventcreationElements/tab_event_OESLite");
        base.wait(2);
/*
        //singles

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttab");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        base.wait(8);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");
        base.wait(3);


        //double

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttabofdoubles");


        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Doubles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttabofdoubles");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Doubles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");
        base.wait(3);


        //mixed double

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheadermixeddoubles");


        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Doubles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheadermixeddoubles");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Doubles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");
        base.wait(3);

      //teams

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttabofteams");


        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Teams_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttabofteams");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Teams_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");
        base.wait(3);
*/

        //reports

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheader_reports");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_reports_PlayerEntryReport");
        base.wait(2);

        String visibilityitem1="EntryId";
        String visibilityitem2="EventId";
        String visibilityitem3="SubEvent Name";
        String visibilityitem4="SubEvent Code";
        String visibilityitem5="ittfid";
        String visibilityitem6="Player GivenName";
        String visibilityitem7="Player FamilyName";
        String visibilityitem8="OrgCode";
        String visibilityitem9="Organization";
        String visibilityitem10="Status";
        String visibilityitem11="Seed";
        String visibilityitem12="Current Ranking";
        String visibilityitem13="Current Ranking Points";
        String visibilityitem14="Is Double Entry";
        String visibilityitem15="Pair Number";
        String visibilityitem16="Pair Name";
        String visibilityitem17="Entry Draw Name";
        String visibilityitem18="Entry Quota Type";
        String visibilityitem19="Cancellation Past Final Deadline";
        String visibilityitem20="Protected Ranking";
        String visibilityitem21="Penalized";
        String visibilityitem22="Zero Point Penalty";
        String visibilityitem23="Created Date & Time (UTC)";





        List<String> exceptedlist = new ArrayList<>();

        exceptedlist.add(visibilityitem20);


        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_SelectVisibleFields");
        base.wait(4);

        selectcheckboxfrompopupwindowcontainer(visibilityitem1,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem2,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem3,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem4,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem5,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem6,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem7,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem8,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem9,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem10,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem11,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem12,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem13,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem14,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem15,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem16,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem17,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem18,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem19,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem20,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem21,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem22,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem23,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");




        //selectcheckboxfrompopupwindowcontainer(visibilityitem1,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");

        enterthevalueintotheelement(visibilityitem20,"AdminPortalElements/OESLiteElements/text_OESlite_reports_commonpopupwindowsearchfield");
        getthefield("AdminPortalElements/OESLiteElements/text_OESlite_reports_commonpopupwindowsearchfield");
        webElement.sendKeys(Keys.ENTER);
        base.wait(4);
        driver.findElement(By.cssSelector(".cdk-overlay-backdrop.cdk-overlay-transparent-backdrop.cdk-overlay-backdrop-showing")).click();

        checktheheadervaluefromwebtable(exceptedlist,"AdminPortalElements/OESLiteElements/frame_common_OESlite");


    }


    @Given("^OES Lite report tab for Player Entry Report subtab and Verify the Visibility column field selection dropdown using Penalized option$")
    public static void OESLitereporttabforPlayerEntryReportsubtabandVerifytheVisibilitycolumnfieldselectiondropdownusingPenalizedoption()throws Exception{

                                                                                                                                                                            /*
        click_on_element("AdminPortalElements/EventcreationElements/tab_event");
        base.wait(4);
        clearthevalueintotheelement("AdminPortalElements/EventcreationElements/text_event_searchfield");
        enterthevalueintotheelement(OESlit_eventid,"AdminPortalElements/EventcreationElements/text_event_searchfield");
        click_on_element("AdminPortalElements/EventcreationElements/button_event_searchfieldicon");
        base.wait(3);
        click_on_element("AdminPortalElements/EventcreationElements/button_event_tablesearchedeventedit");
        base.wait(3);

        getthefield("AdminPortalElements/EventcreationElements/tab_event_creation_OnlineEntrySystem");
        base.scrollToView(webElement);
        base.wait(1);
        click_on_element("AdminPortalElements/EventcreationElements/tab_event_creation_OnlineEntrySystem");

        clickonenableordisablebutton("Disable","AdminPortalElements/EventcreationElements/toggle_event_creation_OnlineEntrySystem_EnableOES1");

        click_on_element("AdminPortalElements/EventcreationElements/button_event_update");
        base.wait(3);
        element_visiability("AdminPortalElements/EventcreationElements/text1_event_eventdeails");
*/
        click_on_element("AdminPortalElements/EventcreationElements/tab_event");
        base.wait(4);
        clearthevalueintotheelement("AdminPortalElements/EventcreationElements/text_event_searchfield");
        enterthevalueintotheelement(OESlit_eventid,"AdminPortalElements/EventcreationElements/text_event_searchfield");
        click_on_element("AdminPortalElements/EventcreationElements/button_event_searchfieldicon");
        base.wait(3);
        click_on_element("AdminPortalElements/EventcreationElements/table_event_tableresultrow");
        base.wait(3);

        click_on_element("AdminPortalElements/EventcreationElements/tab_event_OESLite");
        base.wait(2);
/*
        //singles

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttab");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        base.wait(8);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");
        base.wait(3);


        //double

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttabofdoubles");


        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Doubles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttabofdoubles");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Doubles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");
        base.wait(3);


        //mixed double

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheadermixeddoubles");


        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Doubles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheadermixeddoubles");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Doubles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");
        base.wait(3);

      //teams

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttabofteams");


        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Teams_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttabofteams");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Teams_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");
        base.wait(3);
*/

        //reports

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheader_reports");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_reports_PlayerEntryReport");
        base.wait(2);

        String visibilityitem1="EntryId";
        String visibilityitem2="EventId";
        String visibilityitem3="SubEvent Name";
        String visibilityitem4="SubEvent Code";
        String visibilityitem5="ittfid";
        String visibilityitem6="Player GivenName";
        String visibilityitem7="Player FamilyName";
        String visibilityitem8="OrgCode";
        String visibilityitem9="Organization";
        String visibilityitem10="Status";
        String visibilityitem11="Seed";
        String visibilityitem12="Current Ranking";
        String visibilityitem13="Current Ranking Points";
        String visibilityitem14="Is Double Entry";
        String visibilityitem15="Pair Number";
        String visibilityitem16="Pair Name";
        String visibilityitem17="Entry Draw Name";
        String visibilityitem18="Entry Quota Type";
        String visibilityitem19="Cancellation Past Final Deadline";
        String visibilityitem20="Protected Ranking";
        String visibilityitem21="Penalized";
        String visibilityitem22="Zero Point Penalty";
        String visibilityitem23="Created Date & Time (UTC)";





        List<String> exceptedlist = new ArrayList<>();

        exceptedlist.add(visibilityitem21);


        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_SelectVisibleFields");
        base.wait(4);

        selectcheckboxfrompopupwindowcontainer(visibilityitem1,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem2,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem3,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem4,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem5,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem6,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem7,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem8,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem9,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem10,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem11,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem12,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem13,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem14,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem15,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem16,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem17,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem18,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem19,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem20,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem21,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem22,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem23,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");




        //selectcheckboxfrompopupwindowcontainer(visibilityitem1,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");

        enterthevalueintotheelement(visibilityitem21,"AdminPortalElements/OESLiteElements/text_OESlite_reports_commonpopupwindowsearchfield");
        getthefield("AdminPortalElements/OESLiteElements/text_OESlite_reports_commonpopupwindowsearchfield");
        webElement.sendKeys(Keys.ENTER);
        base.wait(4);
        driver.findElement(By.cssSelector(".cdk-overlay-backdrop.cdk-overlay-transparent-backdrop.cdk-overlay-backdrop-showing")).click();

        checktheheadervaluefromwebtable(exceptedlist,"AdminPortalElements/OESLiteElements/frame_common_OESlite");


    }

    @Given("^OES Lite report tab for Player Entry Report subtab and Verify the Visibility column field selection dropdown using Zero Point Penalty option$")
    public static void OESLitereporttabforPlayerEntryReportsubtabandVerifytheVisibilitycolumnfieldselectiondropdownusingZeroPointPenaltyoption()throws Exception{

                                                                                                                                                                            /*
        click_on_element("AdminPortalElements/EventcreationElements/tab_event");
        base.wait(4);
        clearthevalueintotheelement("AdminPortalElements/EventcreationElements/text_event_searchfield");
        enterthevalueintotheelement(OESlit_eventid,"AdminPortalElements/EventcreationElements/text_event_searchfield");
        click_on_element("AdminPortalElements/EventcreationElements/button_event_searchfieldicon");
        base.wait(3);
        click_on_element("AdminPortalElements/EventcreationElements/button_event_tablesearchedeventedit");
        base.wait(3);

        getthefield("AdminPortalElements/EventcreationElements/tab_event_creation_OnlineEntrySystem");
        base.scrollToView(webElement);
        base.wait(1);
        click_on_element("AdminPortalElements/EventcreationElements/tab_event_creation_OnlineEntrySystem");

        clickonenableordisablebutton("Disable","AdminPortalElements/EventcreationElements/toggle_event_creation_OnlineEntrySystem_EnableOES1");

        click_on_element("AdminPortalElements/EventcreationElements/button_event_update");
        base.wait(3);
        element_visiability("AdminPortalElements/EventcreationElements/text1_event_eventdeails");
*/
        click_on_element("AdminPortalElements/EventcreationElements/tab_event");
        base.wait(4);
        clearthevalueintotheelement("AdminPortalElements/EventcreationElements/text_event_searchfield");
        enterthevalueintotheelement(OESlit_eventid,"AdminPortalElements/EventcreationElements/text_event_searchfield");
        click_on_element("AdminPortalElements/EventcreationElements/button_event_searchfieldicon");
        base.wait(3);
        click_on_element("AdminPortalElements/EventcreationElements/table_event_tableresultrow");
        base.wait(3);

        click_on_element("AdminPortalElements/EventcreationElements/tab_event_OESLite");
        base.wait(2);
/*
        //singles

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttab");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        base.wait(8);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");
        base.wait(3);


        //double

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttabofdoubles");


        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Doubles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttabofdoubles");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Doubles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");
        base.wait(3);


        //mixed double

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheadermixeddoubles");


        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Doubles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheadermixeddoubles");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Doubles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");
        base.wait(3);

      //teams

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttabofteams");


        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Teams_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttabofteams");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Teams_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");
        base.wait(3);
*/

        //reports

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheader_reports");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_reports_PlayerEntryReport");
        base.wait(2);

        String visibilityitem1="EntryId";
        String visibilityitem2="EventId";
        String visibilityitem3="SubEvent Name";
        String visibilityitem4="SubEvent Code";
        String visibilityitem5="ittfid";
        String visibilityitem6="Player GivenName";
        String visibilityitem7="Player FamilyName";
        String visibilityitem8="OrgCode";
        String visibilityitem9="Organization";
        String visibilityitem10="Status";
        String visibilityitem11="Seed";
        String visibilityitem12="Current Ranking";
        String visibilityitem13="Current Ranking Points";
        String visibilityitem14="Is Double Entry";
        String visibilityitem15="Pair Number";
        String visibilityitem16="Pair Name";
        String visibilityitem17="Entry Draw Name";
        String visibilityitem18="Entry Quota Type";
        String visibilityitem19="Cancellation Past Final Deadline";
        String visibilityitem20="Protected Ranking";
        String visibilityitem21="Penalized";
        String visibilityitem22="Zero Point Penalty";
        String visibilityitem23="Created Date & Time (UTC)";





        List<String> exceptedlist = new ArrayList<>();

        exceptedlist.add(visibilityitem22);


        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_SelectVisibleFields");
        base.wait(4);

        selectcheckboxfrompopupwindowcontainer(visibilityitem1,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem2,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem3,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem4,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem5,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem6,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem7,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem8,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem9,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem10,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem11,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem12,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem13,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem14,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem15,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem16,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem17,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem18,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem19,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem20,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem21,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem22,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem23,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");




        //selectcheckboxfrompopupwindowcontainer(visibilityitem1,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");

        enterthevalueintotheelement(visibilityitem22,"AdminPortalElements/OESLiteElements/text_OESlite_reports_commonpopupwindowsearchfield");
        getthefield("AdminPortalElements/OESLiteElements/text_OESlite_reports_commonpopupwindowsearchfield");
        webElement.sendKeys(Keys.ENTER);
        base.wait(4);
        driver.findElement(By.cssSelector(".cdk-overlay-backdrop.cdk-overlay-transparent-backdrop.cdk-overlay-backdrop-showing")).click();

        checktheheadervaluefromwebtable(exceptedlist,"AdminPortalElements/OESLiteElements/frame_common_OESlite");


    }


    @Given("^OES Lite report tab for Player Entry Report subtab and Verify the Visibility column field selection dropdown using Created Date Time UTC option$")
    public static void OESLitereporttabforPlayerEntryReportsubtabandVerifytheVisibilitycolumnfieldselectiondropdownusingCreatedDateTimeUTCoption()throws Exception{

                                                                                                                                                                            /*
        click_on_element("AdminPortalElements/EventcreationElements/tab_event");
        base.wait(4);
        clearthevalueintotheelement("AdminPortalElements/EventcreationElements/text_event_searchfield");
        enterthevalueintotheelement(OESlit_eventid,"AdminPortalElements/EventcreationElements/text_event_searchfield");
        click_on_element("AdminPortalElements/EventcreationElements/button_event_searchfieldicon");
        base.wait(3);
        click_on_element("AdminPortalElements/EventcreationElements/button_event_tablesearchedeventedit");
        base.wait(3);

        getthefield("AdminPortalElements/EventcreationElements/tab_event_creation_OnlineEntrySystem");
        base.scrollToView(webElement);
        base.wait(1);
        click_on_element("AdminPortalElements/EventcreationElements/tab_event_creation_OnlineEntrySystem");

        clickonenableordisablebutton("Disable","AdminPortalElements/EventcreationElements/toggle_event_creation_OnlineEntrySystem_EnableOES1");

        click_on_element("AdminPortalElements/EventcreationElements/button_event_update");
        base.wait(3);
        element_visiability("AdminPortalElements/EventcreationElements/text1_event_eventdeails");
*/
        click_on_element("AdminPortalElements/EventcreationElements/tab_event");
        base.wait(4);
        clearthevalueintotheelement("AdminPortalElements/EventcreationElements/text_event_searchfield");
        enterthevalueintotheelement(OESlit_eventid,"AdminPortalElements/EventcreationElements/text_event_searchfield");
        click_on_element("AdminPortalElements/EventcreationElements/button_event_searchfieldicon");
        base.wait(3);
        click_on_element("AdminPortalElements/EventcreationElements/table_event_tableresultrow");
        base.wait(3);

        click_on_element("AdminPortalElements/EventcreationElements/tab_event_OESLite");
        base.wait(2);
/*
        //singles

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttab");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        base.wait(8);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");
        base.wait(3);


        //double

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttabofdoubles");


        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Doubles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttabofdoubles");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Doubles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");
        base.wait(3);


        //mixed double

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheadermixeddoubles");


        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Doubles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheadermixeddoubles");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Doubles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");
        base.wait(3);

      //teams

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttabofteams");


        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Teams_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttabofteams");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Teams_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");
        base.wait(3);
*/

        //reports

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheader_reports");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_reports_PlayerEntryReport");
        base.wait(2);

        String visibilityitem1="EntryId";
        String visibilityitem2="EventId";
        String visibilityitem3="SubEvent Name";
        String visibilityitem4="SubEvent Code";
        String visibilityitem5="ittfid";
        String visibilityitem6="Player GivenName";
        String visibilityitem7="Player FamilyName";
        String visibilityitem8="OrgCode";
        String visibilityitem9="Organization";
        String visibilityitem10="Status";
        String visibilityitem11="Seed";
        String visibilityitem12="Current Ranking";
        String visibilityitem13="Current Ranking Points";
        String visibilityitem14="Is Double Entry";
        String visibilityitem15="Pair Number";
        String visibilityitem16="Pair Name";
        String visibilityitem17="Entry Draw Name";
        String visibilityitem18="Entry Quota Type";
        String visibilityitem19="Cancellation Past Final Deadline";
        String visibilityitem20="Protected Ranking";
        String visibilityitem21="Penalized";
        String visibilityitem22="Zero Point Penalty";
        String visibilityitem23="Created Date & Time (UTC)";





        List<String> exceptedlist = new ArrayList<>();

        exceptedlist.add(visibilityitem23);


        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_SelectVisibleFields");
        base.wait(4);

        selectcheckboxfrompopupwindowcontainer(visibilityitem1,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem2,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem3,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem4,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem5,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem6,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem7,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem8,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem9,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem10,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem11,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem12,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem13,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem14,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem15,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem16,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem17,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem18,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem19,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem20,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem21,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem22,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");
        selectcheckboxfrompopupwindowcontainer(visibilityitem23,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");




        //selectcheckboxfrompopupwindowcontainer(visibilityitem1,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");

        enterthevalueintotheelement(visibilityitem23,"AdminPortalElements/OESLiteElements/text_OESlite_reports_commonpopupwindowsearchfield");
        getthefield("AdminPortalElements/OESLiteElements/text_OESlite_reports_commonpopupwindowsearchfield");
        webElement.sendKeys(Keys.ENTER);
        base.wait(4);
        driver.findElement(By.cssSelector(".cdk-overlay-backdrop.cdk-overlay-transparent-backdrop.cdk-overlay-backdrop-showing")).click();

        checktheheadervaluefromwebtable(exceptedlist,"AdminPortalElements/OESLiteElements/frame_common_OESlite");


    }

    @Given("^OES Lite report tab for Player Entry Report subtab and Verify the Visibility column field selection dropdown using All options$")
    public static void OESLitereporttabforPlayerEntryReportsubtabandVerifytheVisibilitycolumnfieldselectiondropdownusingAlloptions()throws Exception{

                                                                                                                                                                            /*
        click_on_element("AdminPortalElements/EventcreationElements/tab_event");
        base.wait(4);
        clearthevalueintotheelement("AdminPortalElements/EventcreationElements/text_event_searchfield");
        enterthevalueintotheelement(OESlit_eventid,"AdminPortalElements/EventcreationElements/text_event_searchfield");
        click_on_element("AdminPortalElements/EventcreationElements/button_event_searchfieldicon");
        base.wait(3);
        click_on_element("AdminPortalElements/EventcreationElements/button_event_tablesearchedeventedit");
        base.wait(3);

        getthefield("AdminPortalElements/EventcreationElements/tab_event_creation_OnlineEntrySystem");
        base.scrollToView(webElement);
        base.wait(1);
        click_on_element("AdminPortalElements/EventcreationElements/tab_event_creation_OnlineEntrySystem");

        clickonenableordisablebutton("Disable","AdminPortalElements/EventcreationElements/toggle_event_creation_OnlineEntrySystem_EnableOES1");

        click_on_element("AdminPortalElements/EventcreationElements/button_event_update");
        base.wait(3);
        element_visiability("AdminPortalElements/EventcreationElements/text1_event_eventdeails");
*/
        click_on_element("AdminPortalElements/EventcreationElements/tab_event");
        base.wait(4);
        clearthevalueintotheelement("AdminPortalElements/EventcreationElements/text_event_searchfield");
        enterthevalueintotheelement(OESlit_eventid,"AdminPortalElements/EventcreationElements/text_event_searchfield");
        click_on_element("AdminPortalElements/EventcreationElements/button_event_searchfieldicon");
        base.wait(3);
        click_on_element("AdminPortalElements/EventcreationElements/table_event_tableresultrow");
        base.wait(3);

        click_on_element("AdminPortalElements/EventcreationElements/tab_event_OESLite");
        base.wait(2);
/*
        //singles

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttab");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        base.wait(8);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");
        base.wait(3);


        //double

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttabofdoubles");


        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Doubles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttabofdoubles");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Doubles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");
        base.wait(3);


        //mixed double

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheadermixeddoubles");


        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Doubles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheadermixeddoubles");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Doubles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");
        base.wait(3);

      //teams

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttabofteams");


        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Teams_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttabofteams");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Teams_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");
        base.wait(3);
*/

        //reports

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheader_reports");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_reports_PlayerEntryReport");
        base.wait(2);

        String visibilityitem1="EntryId";
        String visibilityitem2="EventId";
        String visibilityitem3="SubEvent Name";
        String visibilityitem4="SubEvent Code";
        String visibilityitem5="ittfid";
        String visibilityitem6="Player GivenName";
        String visibilityitem7="Player FamilyName";
        String visibilityitem8="OrgCode";
        String visibilityitem9="Organization";
        String visibilityitem10="Status";
        String visibilityitem11="Seed";
        String visibilityitem12="Current Ranking";
        String visibilityitem13="Current Ranking Points";
        String visibilityitem14="Is Double Entry";
        String visibilityitem15="Pair Number";
        String visibilityitem16="Pair Name";
        String visibilityitem17="Entry Draw Name";
        String visibilityitem18="Entry Quota Type";
        String visibilityitem19="Cancellation Past Final Deadline";
        String visibilityitem20="Protected Ranking";
        String visibilityitem21="Penalized";
        String visibilityitem22="Zero Point Penalty";
        String visibilityitem23="Created Date & Time (UTC)";





        List<String> exceptedlist = new ArrayList<>();

        exceptedlist.add("EntryId");
        exceptedlist.add("EventId");
        exceptedlist.add("SubEvent Name");
        exceptedlist.add("SubEvent Code");
        exceptedlist.add("ittfid");
        exceptedlist.add("Player GivenName");
        exceptedlist.add("Player FamilyName");
        exceptedlist.add("OrgCode");
        exceptedlist.add("Organization");
        exceptedlist.add("Status");
        exceptedlist.add("Seed");
        exceptedlist.add("Current Ranking");
        exceptedlist.add("Current Ranking Points");
        exceptedlist.add("Is Double Entry");
        exceptedlist.add("Pair Number");
        exceptedlist.add("Pair Name");
        exceptedlist.add("Entry Draw Name");
        exceptedlist.add("Entry Quota Type");
        exceptedlist.add("Cancellation Past Final Deadline");
        exceptedlist.add("Protected Ranking");
        exceptedlist.add("Penalized");
        exceptedlist.add("Zero Point Penalty");
        exceptedlist.add("Created Date & Time (UTC)");


        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_SelectVisibleFields");
        base.wait(4);




        //selectcheckboxfrompopupwindowcontainer(visibilityitem1,"AdminPortalElements/OESLiteElements/container_OESlite_reports_commonpopupwindow");

        checktheheadervaluefromwebtable(exceptedlist,"AdminPortalElements/OESLiteElements/frame_common_OESlite");


    }

    @Given("^OES Lite report tab for Player Entry Report subtab and Verify the export the excel$")
    public static void OESLitereporttabforPlayerEntryReportsubtabandVerifytheexporttheexcel()throws Exception{

                                                                                                                                                                            /*
        click_on_element("AdminPortalElements/EventcreationElements/tab_event");
        base.wait(4);
        clearthevalueintotheelement("AdminPortalElements/EventcreationElements/text_event_searchfield");
        enterthevalueintotheelement(OESlit_eventid,"AdminPortalElements/EventcreationElements/text_event_searchfield");
        click_on_element("AdminPortalElements/EventcreationElements/button_event_searchfieldicon");
        base.wait(3);
        click_on_element("AdminPortalElements/EventcreationElements/button_event_tablesearchedeventedit");
        base.wait(3);

        getthefield("AdminPortalElements/EventcreationElements/tab_event_creation_OnlineEntrySystem");
        base.scrollToView(webElement);
        base.wait(1);
        click_on_element("AdminPortalElements/EventcreationElements/tab_event_creation_OnlineEntrySystem");

        clickonenableordisablebutton("Disable","AdminPortalElements/EventcreationElements/toggle_event_creation_OnlineEntrySystem_EnableOES1");

        click_on_element("AdminPortalElements/EventcreationElements/button_event_update");
        base.wait(3);
        element_visiability("AdminPortalElements/EventcreationElements/text1_event_eventdeails");
*/
        click_on_element("AdminPortalElements/EventcreationElements/tab_event");
        base.wait(4);
        clearthevalueintotheelement("AdminPortalElements/EventcreationElements/text_event_searchfield");
        enterthevalueintotheelement(OESlit_eventid,"AdminPortalElements/EventcreationElements/text_event_searchfield");
        click_on_element("AdminPortalElements/EventcreationElements/button_event_searchfieldicon");
        base.wait(3);
        click_on_element("AdminPortalElements/EventcreationElements/table_event_tableresultrow");
        base.wait(3);

        click_on_element("AdminPortalElements/EventcreationElements/tab_event_OESLite");
        base.wait(2);
/*
        //singles

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttab");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        base.wait(8);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");
        base.wait(3);


        //double

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttabofdoubles");


        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Doubles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttabofdoubles");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Doubles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");
        base.wait(3);


        //mixed double

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheadermixeddoubles");


        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Doubles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheadermixeddoubles");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Doubles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");
        base.wait(3);

      //teams

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttabofteams");


        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Teams_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttabofteams");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Teams_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");
        base.wait(3);
*/

        //reports

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheader_reports");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_reports_PlayerEntryReport");
        base.wait(2);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_DownloadasExcel");
        base.wait(5);
    }

    @Given("^OES Lite report tab for Player Entry Report subtab and Verify the export the PDF$")
    public static void OESLitereporttabforPlayerEntryReportsubtabandVerifytheexportthePDF()throws Exception{

                                                                                                                                                                            /*
        click_on_element("AdminPortalElements/EventcreationElements/tab_event");
        base.wait(4);
        clearthevalueintotheelement("AdminPortalElements/EventcreationElements/text_event_searchfield");
        enterthevalueintotheelement(OESlit_eventid,"AdminPortalElements/EventcreationElements/text_event_searchfield");
        click_on_element("AdminPortalElements/EventcreationElements/button_event_searchfieldicon");
        base.wait(3);
        click_on_element("AdminPortalElements/EventcreationElements/button_event_tablesearchedeventedit");
        base.wait(3);

        getthefield("AdminPortalElements/EventcreationElements/tab_event_creation_OnlineEntrySystem");
        base.scrollToView(webElement);
        base.wait(1);
        click_on_element("AdminPortalElements/EventcreationElements/tab_event_creation_OnlineEntrySystem");

        clickonenableordisablebutton("Disable","AdminPortalElements/EventcreationElements/toggle_event_creation_OnlineEntrySystem_EnableOES1");

        click_on_element("AdminPortalElements/EventcreationElements/button_event_update");
        base.wait(3);
        element_visiability("AdminPortalElements/EventcreationElements/text1_event_eventdeails");
*/
        click_on_element("AdminPortalElements/EventcreationElements/tab_event");
        base.wait(4);
        clearthevalueintotheelement("AdminPortalElements/EventcreationElements/text_event_searchfield");
        enterthevalueintotheelement(OESlit_eventid,"AdminPortalElements/EventcreationElements/text_event_searchfield");
        click_on_element("AdminPortalElements/EventcreationElements/button_event_searchfieldicon");
        base.wait(3);
        click_on_element("AdminPortalElements/EventcreationElements/table_event_tableresultrow");
        base.wait(3);

        click_on_element("AdminPortalElements/EventcreationElements/tab_event_OESLite");
        base.wait(2);
/*
        //singles

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttab");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        base.wait(8);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");
        base.wait(3);


        //double

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttabofdoubles");


        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Doubles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttabofdoubles");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Doubles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");
        base.wait(3);


        //mixed double

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheadermixeddoubles");


        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Doubles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheadermixeddoubles");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Doubles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");
        base.wait(3);

      //teams

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttabofteams");


        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Teams_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheaderfirsttabofteams");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Teams_Template.xlsx");
        base.wait(4);

        clickonenableordisablecheckboxbutton("Enable","AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");
        base.wait(3);
*/

        //reports

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheader_reports");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_reports_PlayerEntryReport");
        base.wait(2);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_DownloadasPDF");
        base.wait(5);
    }

    @Given("^OVR Lite Event action button options$")
    public static void OVRLiteEventactionbuttonoptions()throws Exception{


        click_on_element("AdminPortalElements/EventcreationElements/tab_event");
        base.wait(4);
        clearthevalueintotheelement("AdminPortalElements/EventcreationElements/text_event_searchfield");
        enterthevalueintotheelement(OESlit_eventid,"AdminPortalElements/EventcreationElements/text_event_searchfield");
        click_on_element("AdminPortalElements/EventcreationElements/button_event_searchfieldicon");
        base.wait(3);
        click_on_element("AdminPortalElements/EventcreationElements/button_event_tablesearchedeventedit");
        base.wait(3);

        getthefield("AdminPortalElements/EventcreationElements/tab_event_creation_OnlineEntrySystem");
        base.scrollToView(webElement);
        base.wait(1);
        click_on_element("AdminPortalElements/EventcreationElements/tab_event_creation_OnlineEntrySystem");

        clickonenableordisablebutton("Disable","AdminPortalElements/EventcreationElements/toggle_event_creation_OnlineEntrySystem_EnableOES1");

        click_on_element("AdminPortalElements/EventcreationElements/button_event_update");
        base.wait(3);
        element_visiability("AdminPortalElements/EventcreationElements/text1_event_eventdeails");

        click_on_element("AdminPortalElements/EventcreationElements/tab_event");
        base.wait(4);
        clearthevalueintotheelement("AdminPortalElements/EventcreationElements/text_event_searchfield");
        enterthevalueintotheelement(OESlit_eventid,"AdminPortalElements/EventcreationElements/text_event_searchfield");
        click_on_element("AdminPortalElements/EventcreationElements/button_event_searchfieldicon");
        base.wait(3);
        click_on_element("AdminPortalElements/EventcreationElements/table_event_tableresultrow");
        base.wait(3);

        click_on_element("AdminPortalElements/EventcreationElements/tab_event_OESLite");
        base.wait(2);

        click_on_element("AdminPortalElements/EventcreationElements/button_event_action");
        base.wait(2);

        element_visiability("AdminPortalElements/EventcreationElements/button_event_action_UpdateCDC");

        element_visiability("AdminPortalElements/EventcreationElements/button_event_action_SetStatusasCancelled");
        element_visiability("AdminPortalElements/EventcreationElements/button_event_action_RollbacktoDraftKeepReview");
        element_visiability("AdminPortalElements/EventcreationElements/button_event_action_RollbacktoDraftRemoveReview");
        element_visiability("AdminPortalElements/EventcreationElements/button_event_action_OVRLitePublishEvent");
        element_visiability("AdminPortalElements/EventcreationElements/button_event_action_OVRLitePublishEntries");
        element_visiability("AdminPortalElements/EventcreationElements/button_event_action_CleanupODFStorageLogs");
        element_visiability("AdminPortalElements/EventcreationElements/button_event_action_DownloadODFMessages");


    }

    @Given("^the Update CDC action$")
    public static void theUpdateCDCaction()throws Exception{


        click_on_element("AdminPortalElements/EventcreationElements/tab_event");
        base.wait(4);
        clearthevalueintotheelement("AdminPortalElements/EventcreationElements/text_event_searchfield");
        enterthevalueintotheelement(OESlit_eventid,"AdminPortalElements/EventcreationElements/text_event_searchfield");
        click_on_element("AdminPortalElements/EventcreationElements/button_event_searchfieldicon");
        base.wait(3);
        click_on_element("AdminPortalElements/EventcreationElements/button_event_tablesearchedeventedit");
        base.wait(3);

        getthefield("AdminPortalElements/EventcreationElements/tab_event_creation_OnlineEntrySystem");
        base.scrollToView(webElement);
        base.wait(1);
        click_on_element("AdminPortalElements/EventcreationElements/tab_event_creation_OnlineEntrySystem");

        clickonenableordisablebutton("Disable","AdminPortalElements/EventcreationElements/toggle_event_creation_OnlineEntrySystem_EnableOES1");

        click_on_element("AdminPortalElements/EventcreationElements/button_event_update");
        base.wait(3);
        element_visiability("AdminPortalElements/EventcreationElements/text1_event_eventdeails");

        click_on_element("AdminPortalElements/EventcreationElements/tab_event");
        base.wait(4);
        clearthevalueintotheelement("AdminPortalElements/EventcreationElements/text_event_searchfield");
        enterthevalueintotheelement(OESlit_eventid,"AdminPortalElements/EventcreationElements/text_event_searchfield");
        click_on_element("AdminPortalElements/EventcreationElements/button_event_searchfieldicon");
        base.wait(3);
        click_on_element("AdminPortalElements/EventcreationElements/table_event_tableresultrow");
        base.wait(3);

        click_on_element("AdminPortalElements/EventcreationElements/tab_event_OESLite");
        base.wait(2);

        click_on_element("AdminPortalElements/EventcreationElements/button_event_action");
        base.wait(2);

        click_on_element("AdminPortalElements/EventcreationElements/button_event_action_UpdateCDC");
        base.wait(2);

    }

    @Given("^the Set Status as Cancelled action$")
    public static void theSetStatusasCancelledaction()throws Exception{

        click_on_element("AdminPortalElements/EventcreationElements/tab_event");
        base.wait(4);
        clearthevalueintotheelement("AdminPortalElements/EventcreationElements/text_event_searchfield");
        enterthevalueintotheelement(OESlit_eventid,"AdminPortalElements/EventcreationElements/text_event_searchfield");
        click_on_element("AdminPortalElements/EventcreationElements/button_event_searchfieldicon");
        base.wait(3);
        click_on_element("AdminPortalElements/EventcreationElements/button_event_tablesearchedeventedit");
        base.wait(3);

        getthefield("AdminPortalElements/EventcreationElements/tab_event_creation_OnlineEntrySystem");
        base.scrollToView(webElement);
        base.wait(1);
        click_on_element("AdminPortalElements/EventcreationElements/tab_event_creation_OnlineEntrySystem");

        clickonenableordisablebutton("Disable","AdminPortalElements/EventcreationElements/toggle_event_creation_OnlineEntrySystem_EnableOES1");

        click_on_element("AdminPortalElements/EventcreationElements/button_event_update");
        base.wait(3);
        element_visiability("AdminPortalElements/EventcreationElements/text1_event_eventdeails");

        click_on_element("AdminPortalElements/EventcreationElements/tab_event");
        base.wait(4);
        clearthevalueintotheelement("AdminPortalElements/EventcreationElements/text_event_searchfield");
        enterthevalueintotheelement(OESlit_eventid,"AdminPortalElements/EventcreationElements/text_event_searchfield");
        click_on_element("AdminPortalElements/EventcreationElements/button_event_searchfieldicon");
        base.wait(3);
        click_on_element("AdminPortalElements/EventcreationElements/table_event_tableresultrow");
        base.wait(3);

        click_on_element("AdminPortalElements/EventcreationElements/tab_event_OESLite");
        base.wait(2);

        click_on_element("AdminPortalElements/EventcreationElements/button_event_action");
        base.wait(2);

        click_on_element("AdminPortalElements/EventcreationElements/button_event_action_SetStatusasCancelled");
        base.wait(2);

    }

    @Given("^the Rollback to Draft Keep Review action$")
    public static void theRollbacktoDraftKeepReviewaction()throws Exception{

        click_on_element("AdminPortalElements/EventcreationElements/tab_event");
        base.wait(4);
        clearthevalueintotheelement("AdminPortalElements/EventcreationElements/text_event_searchfield");
        enterthevalueintotheelement(OESlit_eventid,"AdminPortalElements/EventcreationElements/text_event_searchfield");
        click_on_element("AdminPortalElements/EventcreationElements/button_event_searchfieldicon");
        base.wait(3);
        click_on_element("AdminPortalElements/EventcreationElements/button_event_tablesearchedeventedit");
        base.wait(3);

        getthefield("AdminPortalElements/EventcreationElements/tab_event_creation_OnlineEntrySystem");
        base.scrollToView(webElement);
        base.wait(1);
        click_on_element("AdminPortalElements/EventcreationElements/tab_event_creation_OnlineEntrySystem");

        clickonenableordisablebutton("Disable","AdminPortalElements/EventcreationElements/toggle_event_creation_OnlineEntrySystem_EnableOES1");

        click_on_element("AdminPortalElements/EventcreationElements/button_event_update");
        base.wait(3);
        element_visiability("AdminPortalElements/EventcreationElements/text1_event_eventdeails");

        click_on_element("AdminPortalElements/EventcreationElements/tab_event");
        base.wait(4);
        clearthevalueintotheelement("AdminPortalElements/EventcreationElements/text_event_searchfield");
        enterthevalueintotheelement(OESlit_eventid,"AdminPortalElements/EventcreationElements/text_event_searchfield");
        click_on_element("AdminPortalElements/EventcreationElements/button_event_searchfieldicon");
        base.wait(3);
        click_on_element("AdminPortalElements/EventcreationElements/table_event_tableresultrow");
        base.wait(3);

        click_on_element("AdminPortalElements/EventcreationElements/tab_event_OESLite");
        base.wait(2);

        click_on_element("AdminPortalElements/EventcreationElements/button_event_action");
        base.wait(2);

        click_on_element("AdminPortalElements/EventcreationElements/button_event_action_RollbacktoDraftKeepReview");
        base.wait(2);

    }

    @Given("^the Rollback to Draft Remove Review action$")
    public static void theRollbacktoDraftRemoveReviewaction()throws Exception{
        click_on_element("AdminPortalElements/EventcreationElements/tab_event");
        base.wait(4);
        clearthevalueintotheelement("AdminPortalElements/EventcreationElements/text_event_searchfield");
        enterthevalueintotheelement(OESlit_eventid,"AdminPortalElements/EventcreationElements/text_event_searchfield");
        click_on_element("AdminPortalElements/EventcreationElements/button_event_searchfieldicon");
        base.wait(3);
        click_on_element("AdminPortalElements/EventcreationElements/button_event_tablesearchedeventedit");
        base.wait(3);

        getthefield("AdminPortalElements/EventcreationElements/tab_event_creation_OnlineEntrySystem");
        base.scrollToView(webElement);
        base.wait(1);
        click_on_element("AdminPortalElements/EventcreationElements/tab_event_creation_OnlineEntrySystem");

        clickonenableordisablebutton("Disable","AdminPortalElements/EventcreationElements/toggle_event_creation_OnlineEntrySystem_EnableOES1");

        click_on_element("AdminPortalElements/EventcreationElements/button_event_update");
        base.wait(3);
        element_visiability("AdminPortalElements/EventcreationElements/text1_event_eventdeails");

        click_on_element("AdminPortalElements/EventcreationElements/tab_event");
        base.wait(4);
        clearthevalueintotheelement("AdminPortalElements/EventcreationElements/text_event_searchfield");
        enterthevalueintotheelement(OESlit_eventid,"AdminPortalElements/EventcreationElements/text_event_searchfield");
        click_on_element("AdminPortalElements/EventcreationElements/button_event_searchfieldicon");
        base.wait(3);
        click_on_element("AdminPortalElements/EventcreationElements/table_event_tableresultrow");
        base.wait(3);

        click_on_element("AdminPortalElements/EventcreationElements/tab_event_OESLite");
        base.wait(2);

        click_on_element("AdminPortalElements/EventcreationElements/button_event_action");
        base.wait(2);

        click_on_element("AdminPortalElements/EventcreationElements/button_event_action_RollbacktoDraftRemoveReview");
        base.wait(2);
    }

    @Given("^the OVR Lite Publish Event action$")
    public static void theOVRLitePublishEventaction()throws Exception{
        click_on_element("AdminPortalElements/EventcreationElements/tab_event");
        base.wait(4);
        clearthevalueintotheelement("AdminPortalElements/EventcreationElements/text_event_searchfield");
        enterthevalueintotheelement(OESlit_eventid,"AdminPortalElements/EventcreationElements/text_event_searchfield");
        click_on_element("AdminPortalElements/EventcreationElements/button_event_searchfieldicon");
        base.wait(3);
        click_on_element("AdminPortalElements/EventcreationElements/button_event_tablesearchedeventedit");
        base.wait(3);

        getthefield("AdminPortalElements/EventcreationElements/tab_event_creation_OnlineEntrySystem");
        base.scrollToView(webElement);
        base.wait(1);
        click_on_element("AdminPortalElements/EventcreationElements/tab_event_creation_OnlineEntrySystem");

        clickonenableordisablebutton("Disable","AdminPortalElements/EventcreationElements/toggle_event_creation_OnlineEntrySystem_EnableOES1");

        click_on_element("AdminPortalElements/EventcreationElements/button_event_update");
        base.wait(3);
        element_visiability("AdminPortalElements/EventcreationElements/text1_event_eventdeails");

        click_on_element("AdminPortalElements/EventcreationElements/tab_event");
        base.wait(4);
        clearthevalueintotheelement("AdminPortalElements/EventcreationElements/text_event_searchfield");
        enterthevalueintotheelement(OESlit_eventid,"AdminPortalElements/EventcreationElements/text_event_searchfield");
        click_on_element("AdminPortalElements/EventcreationElements/button_event_searchfieldicon");
        base.wait(3);
        click_on_element("AdminPortalElements/EventcreationElements/table_event_tableresultrow");
        base.wait(3);

        click_on_element("AdminPortalElements/EventcreationElements/tab_event_OESLite");
        base.wait(2);

        click_on_element("AdminPortalElements/EventcreationElements/button_event_action");
        base.wait(2);

        click_on_element("AdminPortalElements/EventcreationElements/button_event_action_OVRLitePublishEvent");
        base.wait(2);
    }

    @Given("^the OVR Lite Publish Entries action$")
    public static void theOVRLitePublishEntriesaction()throws Exception{
        click_on_element("AdminPortalElements/EventcreationElements/tab_event");
        base.wait(4);
        clearthevalueintotheelement("AdminPortalElements/EventcreationElements/text_event_searchfield");
        enterthevalueintotheelement(OESlit_eventid,"AdminPortalElements/EventcreationElements/text_event_searchfield");
        click_on_element("AdminPortalElements/EventcreationElements/button_event_searchfieldicon");
        base.wait(3);
        click_on_element("AdminPortalElements/EventcreationElements/button_event_tablesearchedeventedit");
        base.wait(3);

        getthefield("AdminPortalElements/EventcreationElements/tab_event_creation_OnlineEntrySystem");
        base.scrollToView(webElement);
        base.wait(1);
        click_on_element("AdminPortalElements/EventcreationElements/tab_event_creation_OnlineEntrySystem");

        clickonenableordisablebutton("Disable","AdminPortalElements/EventcreationElements/toggle_event_creation_OnlineEntrySystem_EnableOES1");

        click_on_element("AdminPortalElements/EventcreationElements/button_event_update");
        base.wait(3);
        element_visiability("AdminPortalElements/EventcreationElements/text1_event_eventdeails");

        click_on_element("AdminPortalElements/EventcreationElements/tab_event");
        base.wait(4);
        clearthevalueintotheelement("AdminPortalElements/EventcreationElements/text_event_searchfield");
        enterthevalueintotheelement(OESlit_eventid,"AdminPortalElements/EventcreationElements/text_event_searchfield");
        click_on_element("AdminPortalElements/EventcreationElements/button_event_searchfieldicon");
        base.wait(3);
        click_on_element("AdminPortalElements/EventcreationElements/table_event_tableresultrow");
        base.wait(3);

        click_on_element("AdminPortalElements/EventcreationElements/tab_event_OESLite");
        base.wait(2);

        click_on_element("AdminPortalElements/EventcreationElements/button_event_action");
        base.wait(2);

        click_on_element("AdminPortalElements/EventcreationElements/button_event_action_OVRLitePublishEntries");
        base.wait(2);
    }

    @Given("^the Cleanup ODF Storage Logs action$")
    public static void theCleanupODFStorageLogsaction()throws Exception{
        click_on_element("AdminPortalElements/EventcreationElements/tab_event");
        base.wait(4);
        clearthevalueintotheelement("AdminPortalElements/EventcreationElements/text_event_searchfield");
        enterthevalueintotheelement(OESlit_eventid,"AdminPortalElements/EventcreationElements/text_event_searchfield");
        click_on_element("AdminPortalElements/EventcreationElements/button_event_searchfieldicon");
        base.wait(3);
        click_on_element("AdminPortalElements/EventcreationElements/button_event_tablesearchedeventedit");
        base.wait(3);

        getthefield("AdminPortalElements/EventcreationElements/tab_event_creation_OnlineEntrySystem");
        base.scrollToView(webElement);
        base.wait(1);
        click_on_element("AdminPortalElements/EventcreationElements/tab_event_creation_OnlineEntrySystem");

        clickonenableordisablebutton("Disable","AdminPortalElements/EventcreationElements/toggle_event_creation_OnlineEntrySystem_EnableOES1");

        click_on_element("AdminPortalElements/EventcreationElements/button_event_update");
        base.wait(3);
        element_visiability("AdminPortalElements/EventcreationElements/text1_event_eventdeails");

        click_on_element("AdminPortalElements/EventcreationElements/tab_event");
        base.wait(4);
        clearthevalueintotheelement("AdminPortalElements/EventcreationElements/text_event_searchfield");
        enterthevalueintotheelement(OESlit_eventid,"AdminPortalElements/EventcreationElements/text_event_searchfield");
        click_on_element("AdminPortalElements/EventcreationElements/button_event_searchfieldicon");
        base.wait(3);
        click_on_element("AdminPortalElements/EventcreationElements/table_event_tableresultrow");
        base.wait(3);

        click_on_element("AdminPortalElements/EventcreationElements/tab_event_OESLite");
        base.wait(2);

        click_on_element("AdminPortalElements/EventcreationElements/button_event_action");
        base.wait(2);

        click_on_element("AdminPortalElements/EventcreationElements/button_event_action_CleanupODFStorageLogs");
        base.wait(2);
    }

    @Given("^the Clone the event$")
    public static void theClonetheevent()throws Exception{


        click_on_element("AdminPortalElements/EventcreationElements/tab_event");
        base.wait(4);
        clearthevalueintotheelement("AdminPortalElements/EventcreationElements/text_event_searchfield");
        enterthevalueintotheelement(OESlit_eventid,"AdminPortalElements/EventcreationElements/text_event_searchfield");
        click_on_element("AdminPortalElements/EventcreationElements/button_event_searchfieldicon");
        base.wait(3);
        click_on_element("AdminPortalElements/EventcreationElements/button_event_tablesearchedeventedit");
        base.wait(3);

        getthefield("AdminPortalElements/EventcreationElements/tab_event_creation_OnlineEntrySystem");
        base.scrollToView(webElement);
        base.wait(1);
        click_on_element("AdminPortalElements/EventcreationElements/tab_event_creation_OnlineEntrySystem");

        clickonenableordisablebutton("Disable","AdminPortalElements/EventcreationElements/toggle_event_creation_OnlineEntrySystem_EnableOES1");

        click_on_element("AdminPortalElements/EventcreationElements/button_event_update");
        base.wait(3);
        element_visiability("AdminPortalElements/EventcreationElements/text1_event_eventdeails");

        click_on_element("AdminPortalElements/EventcreationElements/tab_event");
        base.wait(4);
        clearthevalueintotheelement("AdminPortalElements/EventcreationElements/text_event_searchfield");
        enterthevalueintotheelement(OESlit_eventid,"AdminPortalElements/EventcreationElements/text_event_searchfield");
        click_on_element("AdminPortalElements/EventcreationElements/button_event_searchfieldicon");
        base.wait(3);
        click_on_element("AdminPortalElements/EventcreationElements/table_event_tableresultrow");
        base.wait(3);

        click_on_element("AdminPortalElements/EventcreationElements/button_event_preview_Clone");
        base.wait(3);

        driver.switchTo().alert().accept();
        base.wait(12);
        click_on_element("AdminPortalElements/EventcreationElements/button_event_update");
        base.wait(3);
        element_visiability("AdminPortalElements/EventcreationElements/text1_event_eventdeails");

    }

    @Given("^the Edit the event$")
    public static void theEdittheevent()throws Exception{

        click_on_element("AdminPortalElements/EventcreationElements/tab_event");
        base.wait(4);
        clearthevalueintotheelement("AdminPortalElements/EventcreationElements/text_event_searchfield");
        enterthevalueintotheelement(OESlit_eventid,"AdminPortalElements/EventcreationElements/text_event_searchfield");
        click_on_element("AdminPortalElements/EventcreationElements/button_event_searchfieldicon");
        base.wait(3);
        click_on_element("AdminPortalElements/EventcreationElements/button_event_tablesearchedeventedit");
        base.wait(3);

        getthefield("AdminPortalElements/EventcreationElements/tab_event_creation_OnlineEntrySystem");
        base.scrollToView(webElement);
        base.wait(1);
        click_on_element("AdminPortalElements/EventcreationElements/tab_event_creation_OnlineEntrySystem");

        clickonenableordisablebutton("Disable","AdminPortalElements/EventcreationElements/toggle_event_creation_OnlineEntrySystem_EnableOES1");

        click_on_element("AdminPortalElements/EventcreationElements/button_event_update");
        base.wait(3);
        element_visiability("AdminPortalElements/EventcreationElements/text1_event_eventdeails");

        click_on_element("AdminPortalElements/EventcreationElements/tab_event");
        base.wait(4);
        clearthevalueintotheelement("AdminPortalElements/EventcreationElements/text_event_searchfield");
        enterthevalueintotheelement(OESlit_eventid,"AdminPortalElements/EventcreationElements/text_event_searchfield");
        click_on_element("AdminPortalElements/EventcreationElements/button_event_searchfieldicon");
        base.wait(3);
        click_on_element("AdminPortalElements/EventcreationElements/table_event_tableresultrow");
        base.wait(3);

        click_on_element("AdminPortalElements/EventcreationElements/button_event_preview_edit");
        base.wait(3);

        click_on_element("AdminPortalElements/EventcreationElements/button_event_update");
        base.wait(3);
        element_visiability("AdminPortalElements/EventcreationElements/text1_event_eventdeails");





    }

}
