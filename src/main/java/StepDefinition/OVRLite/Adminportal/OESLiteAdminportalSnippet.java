package StepDefinition.OVRLite.Adminportal;

import StepDefinition.AdminPortal.EventCreationSnippet;
import base.Commonmethods;
import io.cucumber.java.an.E;
import io.cucumber.java.en.Given;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.Fileuploadrobotclass;
import util.TestDataReader;

import static PreDefinedstepdefinitions.Predefinedstepdefinitions.*;
import static base.DriverInitialisation.driver;

public class OESLiteAdminportalSnippet {

    public static String OESlit_eventid= EventCreationSnippet.eventid;
    public static WebDriverWait wait1 = new WebDriverWait(driver, 60);
    public static Commonmethods base = new Commonmethods(driver, wait1);

    @Given("^Enable OES toggle button in the Online Entry System step for Event creation process$")
    public static void EnableOEStogglebuttonintheOnlineEntrySystemstepforEventcreationprocess() throws Exception {

        click_on_element("AdminPortalElements/EventcreationElements/tab_event");
        base.wait(4);
        clearthevalueintotheelement("AdminPortalElements/EventcreationElements/text_event_searchfield");
        enterthevalueintotheelement(OESlit_eventid,"AdminPortalElements/EventcreationElements/text_event_searchfield");
        click_on_element("AdminPortalElements/EventcreationElements/button_event_searchfieldicon");
        base.wait(3);
        click_on_element("AdminPortalElements/EventcreationElements/button_event_tablesearchedeventedit");
        base.wait(3);
//        clickonenableordisablebutton("Enable","AdminPortalElements/EventcreationElements/toggle_event_creation_core_ShowOrganizerinOES");
//        base.wait(2);


        getthefield("AdminPortalElements/EventcreationElements/tab_event_creation_OnlineEntrySystem");
        base.scrollToView(webElement);
        base.wait(1);
        click_on_element("AdminPortalElements/EventcreationElements/tab_event_creation_OnlineEntrySystem");

        element_visiability("AdminPortalElements/EventcreationElements/toggle_event_creation_OnlineEntrySystem_EnableOES1");
        Verifytheactualandexceptedvalues("If not enabled, will be considered as OES Lite Event","AdminPortalElements/EventcreationElements/text_event_creation_OnlineEntrySystem_EnableOES1");


    }

    @Given("^the disable Enable OES toggle button in the Online Entry System step for Event creation process$")
    public static void thedisableEnableOEStogglebuttonintheOnlineEntrySystemstepforEventcreationprocess() throws Exception {

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

    }

    @Given("^the disable Enable OES toggle button in the Online Entry System step and create the event$")
    public static void thedisableEnableOEStogglebuttonintheOnlineEntrySystemstepandcreatetheevent() throws Exception {

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
    }

    @Given("^the OES Lite option tab$")
    public static void theOESLiteoptiontab()throws Exception{

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

        element_visiability("AdminPortalElements/EventcreationElements/tab_event_OESLite");


    }

    @Given("^the OES Lite option tab options$")
    public static void theOESLiteoptiontaboptions()throws Exception{

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

        element_visiability("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheader");
        element_visiability("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheader_reports");


    }

    //@WTT_OVR_Lite_Admin_Portal_TS139
    @Given("^OES Lite option tab for subevent wise options$")
    public static void OESLiteoptiontabforsubeventwiseoptions()throws Exception{
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

        click_on_element("AdminPortalElements/EventcreationElements/tab_OESlite_common_subeventsheaderfirsttab");

        element_visiability("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheader");
        element_visiability("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
    }

    //@WTT_OVR_Lite_Admin_Portal_TS140
    @Given("^OES Lite option tab for subevent wise Main draw tab Action dropdown options before the import the entries$")
    public static void OESLiteoptiontabforsubeventwiseMaindrawtabActiondropdownoptionsbeforetheimporttheentries()throws Exception{

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

        click_on_element("AdminPortalElements/EventcreationElements/tab_OESlite_common_subeventsheaderfirsttab");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        element_visiability("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");


    }


    //@WTT_OVR_Lite_Admin_Portal_TS141
    @Given("^OES Lite option tab for subevent wise Main draw tab before the import the entries and verify the import records action$")
    public static void OESLiteoptiontabforsubeventwiseMaindrawtabbeforetheimporttheentriesandverifytheimportrecordsaction()throws Exception{

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

        click_on_element("AdminPortalElements/EventcreationElements/tab_OESlite_common_subeventsheaderfirsttab");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        element_visiability("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_DownloadImportTemplate");
        element_visiability("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_DownloadParaEventImportTemplate");
        element_visiability("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        element_visiability("AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
       // element_visiability("AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_Cancel");





    }



        @Given("^OES Lite option tab for subevent wise Main draw tab before the import the entries and verify the import records action step1 validation Download Import Template$")
    public static void OESLiteoptiontabforsubeventwiseMaindrawtabbeforetheimporttheentriesandverifytheimportrecordsactionstep1validationDownloadImportTemplate()throws Exception{

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

            click_on_element("AdminPortalElements/EventcreationElements/tab_OESlite_common_subeventsheaderfirsttab");

            click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
            base.wait(1);

            click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
            base.wait(1);
            click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

            click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_DownloadImportTemplate");
            click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_Cancel");

        }

    @Given("^OES Lite option tab for subevent wise Main draw tab before the import the entries and verify the import records action step1 validation Download Para Event Import Template$")
    public static void OESLiteoptiontabforsubeventwiseMaindrawtabbeforetheimporttheentriesandverifytheimportrecordsactionstep1validationDownloadParaEventImportTemplate()throws Exception{

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

        click_on_element("AdminPortalElements/EventcreationElements/tab_OESlite_common_subeventsheaderfirsttab");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_DownloadParaEventImportTemplate");
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_Cancel");

    }

    @Given("^OES Lite option tab for subevent wise Main draw tab before the import the entries and verify the import records action step 2 validation upload file$")
    public static void OESLiteoptiontabforsubeventwiseMaindrawtabbeforetheimporttheentriesandverifytheimportrecordsactionstep2validationuploadfile()throws Exception{

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

        click_on_element("AdminPortalElements/EventcreationElements/tab_OESlite_common_subeventsheaderfirsttab");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(8);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_Cancel");

    }

    @Given("^OES Lite option tab for subevent wise Main draw tab before the import the entries and verify the import records action step 3 validation Skip Restrictions$")
    public static void OESLiteoptiontabforsubeventwiseMaindrawtabbeforetheimporttheentriesandverifytheimportrecordsactionstep3validationSkipRestrictions()throws Exception{

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

        click_on_element("AdminPortalElements/EventcreationElements/tab_OESlite_common_subeventsheaderfirsttab");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
       // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_Cancel");

    }

    @Given("^OES Lite option tab for subevent wise Main draw tab before the import the entries and verify the import records action achieve all the three steps upload the valid file$")
    public static void OESLiteoptiontabforsubeventwiseMaindrawtabbeforetheimporttheentriesandverifytheimportrecordsactionachieveallthethreestepsuploadthevalidfile()throws Exception{

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

        click_on_element("AdminPortalElements/EventcreationElements/tab_OESlite_common_subeventsheaderfirsttab");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_DeleteEntries");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(4);



    }

    @Given("^OES Lite option tab for subevent wise Main draw tab before the import the entries and verify the import records action achieve all the three steps upload the invalid file$")
    public static void OESLiteoptiontabforsubeventwiseMaindrawtabbeforetheimporttheentriesandverifytheimportrecordsactionachieveallthethreestepsuploadtheinvalidfile()throws Exception{


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

        click_on_element("AdminPortalElements/EventcreationElements/tab_OESlite_common_subeventsheaderfirsttab");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template_invalid_format.xlsx");
        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);

        Verifytheactualandexceptedvalues("ERROR\n" +
                "\n" +
                "Status should not be empty\n" +
                "DrawType should not be empty\n" +
                "EntryType should not be empty","AdminPortalElements/Admin_login_page_Elements/text_Admin_login_error_alert");


    }

    @Given("^OES Lite option tab for subevent wise Main draw tab before the import the entries and verify the import records action achieve all the three steps upload the valid file and select Skip All checkbox$")
    public static void OESLiteoptiontabforsubeventwiseMaindrawtabbeforetheimporttheentriesandverifytheimportrecordsactionachieveallthethreestepsuploadthevalidfileandselectSkipAllcheckbox()throws Exception{

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

        click_on_element("AdminPortalElements/EventcreationElements/tab_OESlite_common_subeventsheaderfirsttab");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_DeleteEntries");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(4);


    }

    @Given("^OES Lite option tab for subevent wise Main draw tab before the import the entries and verify the import records action achieve all the three steps upload the valid file and select Draw Size checkbox$")
    public static void OESLiteoptiontabforsubeventwiseMaindrawtabbeforetheimporttheentriesandverifytheimportrecordsactionachieveallthethreestepsuploadthevalidfileandselectDrawSizecheckbox()throws Exception{

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

        click_on_element("AdminPortalElements/EventcreationElements/tab_OESlite_common_subeventsheaderfirsttab");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_DrawSize");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_DeleteEntries");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(4);

    }

    @Given("^OES Lite option tab for subevent wise Main draw tab before the import the entries and verify the import records action achieve all the three steps upload the valid file and select AER checkbox$")
    public static void OESLiteoptiontabforsubeventwiseMaindrawtabbeforetheimporttheentriesandverifytheimportrecordsactionachieveallthethreestepsuploadthevalidfileandselectAERcheckbox()throws Exception{

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

        click_on_element("AdminPortalElements/EventcreationElements/tab_OESlite_common_subeventsheaderfirsttab");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_AER");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_DeleteEntries");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(4);


    }

    @Given("^OES Lite option tab for subevent wise Main draw tab before the import the entries and verify the import records action achieve all the three steps upload the valid file and select NER checkbox$")
    public static void OESLiteoptiontabforsubeventwiseMaindrawtabbeforetheimporttheentriesandverifytheimportrecordsactionachieveallthethreestepsuploadthevalidfileandselectNERcheckbox()throws Exception{

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

        click_on_element("AdminPortalElements/EventcreationElements/tab_OESlite_common_subeventsheaderfirsttab");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_NER");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_DeleteEntries");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(4);

    }

    @Given("^OES Lite option tab for subevent wise Main draw tab before the import the entries and verify the import records action achieve all the three steps upload the valid file and select WC checkbox$")
    public static void OESLiteoptiontabforsubeventwiseMaindrawtabbeforetheimporttheentriesandverifytheimportrecordsactionachieveallthethreestepsuploadthevalidfileandselectWCcheckbox()throws Exception{

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

        click_on_element("AdminPortalElements/EventcreationElements/tab_OESlite_common_subeventsheaderfirsttab");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_WC");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_DeleteEntries");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(4);

    }

    @Given("^OES Lite option tab for subevent wise Main draw tab before the import the entries and verify the import records action achieve all the three steps upload the valid file and select WTT checkbox$")
    public static void OESLiteoptiontabforsubeventwiseMaindrawtabbeforetheimporttheentriesandverifytheimportrecordsactionachieveallthethreestepsuploadthevalidfileandselecdWTTcheckbox()throws Exception{

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

        click_on_element("AdminPortalElements/EventcreationElements/tab_OESlite_common_subeventsheaderfirsttab");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_WTT");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_DeleteEntries");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(4);

    }

    @Given("^OES Lite option tab for subevent wise Main draw tab before the import the entries and verify the import records action achieve all the three steps upload the valid file and select WYN checkbox$")
    public static void OESLiteoptiontabforsubeventwiseMaindrawtabbeforetheimporttheentriesandverifytheimportrecordsactionachieveallthethreestepsuploadthevalidfileandselectWYNcheckbox()throws Exception{

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

        click_on_element("AdminPortalElements/EventcreationElements/tab_OESlite_common_subeventsheaderfirsttab");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_WYN");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_DeleteEntries");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(4);
    }

    @Given("^OES Lite option tab for subevent wise Main draw tab before the import the entries and verify the import records action achieve all the three steps upload the valid file and select QUAL checkbox$")
    public static void OESLiteoptiontabforsubeventwiseMaindrawtabbeforetheimporttheentriesandverifytheimportrecordsactionachieveallthethreestepsuploadthevalidfileandselectQUALcheckbox()throws Exception{

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

        click_on_element("AdminPortalElements/EventcreationElements/tab_OESlite_common_subeventsheaderfirsttab");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_QUAL");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_DeleteEntries");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(4);

    }

    @Given("^OES Lite option tab for subevent wise Main draw tab before the import the entries and verify the import records action achieve all the three steps upload the valid file and select CWR checkbox$")
    public static void OESLiteoptiontabforsubeventwiseMaindrawtabbeforetheimporttheentriesandverifytheimportrecordsactionachieveallthethreestepsuploadthevalidfileandselectCWRcheckbox()throws Exception{

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

        click_on_element("AdminPortalElements/EventcreationElements/tab_OESlite_common_subeventsheaderfirsttab");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_CWR");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_DeleteEntries");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(4);

    }

    @Given("^OES Lite option tab for subevent wise Main draw tab before the import the entries and verify the import records action achieve all the three steps upload the valid file and select PDR checkbox$")
    public static void OESLiteoptiontabforsubeventwiseMaindrawtabbeforetheimporttheentriesandverifytheimportrecordsactionachieveallthethreestepsuploadthevalidfileandselectPDRcheckbox()throws Exception{

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

        click_on_element("AdminPortalElements/EventcreationElements/tab_OESlite_common_subeventsheaderfirsttab");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_PDR");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_DeleteEntries");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(4);

    }

    @Given("^OES Lite option tab for subevent wise Main draw tab before the import the entries and verify the import records action achieve all the three steps upload the valid file and select HOSTNER checkbox$")
    public static void OESLiteoptiontabforsubeventwiseMaindrawtabbeforetheimporttheentriesandverifytheimportrecordsactionachieveallthethreestepsuploadthevalidfileandselectHOSTNERcheckbox()throws Exception{

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

        click_on_element("AdminPortalElements/EventcreationElements/tab_OESlite_common_subeventsheaderfirsttab");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_HOST_NER");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_DeleteEntries");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(4);

    }

    @Given("^OES Lite option tab for subevent wise Main draw tab before the import the entries and verify the import records action achieve all the three steps upload the valid file and select HOSTNERTotalPairs checkbox$")
    public static void OESLiteoptiontabforsubeventwiseMaindrawtabbeforetheimporttheentriesandverifytheimportrecordsactionachieveallthethreestepsuploadthevalidfileandselectHOSTNERTotalPairscheckbox()throws Exception{

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

        click_on_element("AdminPortalElements/EventcreationElements/tab_OESlite_common_subeventsheaderfirsttab");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_HOST_NER_TotalPairs");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_DeleteEntries");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(4);

    }

    @Given("^OES Lite option tab for subevent wise Main draw tab before the import the entries and verify the import records action achieve all the three steps upload the valid file and select HOSTNERMIXPairs checkbox$")
    public static void OESLiteoptiontabforsubeventwiseMaindrawtabbeforetheimporttheentriesandverifytheimportrecordsactionachieveallthethreestepsuploadthevalidfileandselectHOSTNERMIXPairscheckbox()throws Exception{

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

        click_on_element("AdminPortalElements/EventcreationElements/tab_OESlite_common_subeventsheaderfirsttab");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_HOST_NER_MIXPairs");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_DeleteEntries");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(4);

    }

    @Given("^OES Lite option tab for subevent wise Waiting List tab Action dropdown options before the import the entries$")
    public static void OESLiteoptiontabforsubeventwiseWaitingListtabActiondropdownoptionsbeforetheimporttheentries()throws Exception{

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

        click_on_element("AdminPortalElements/EventcreationElements/tab_OESlite_common_subeventsheaderfirsttab");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        element_visiability("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

    }

    @Given("^OES Lite option tab for subevent wise Waiting List tab before the import the entries and verify the import records action$")
    public static void OESLiteoptiontabforsubeventwiseWaitingListtabbeforetheimporttheentriesandverifytheimportrecordsaction()throws Exception{

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

        click_on_element("AdminPortalElements/EventcreationElements/tab_OESlite_common_subeventsheaderfirsttab");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_Cancel");

    }

    @Given("^OES Lite option tab for subevent wise Waiting List tab before the import the entries and verify the import records action step1 validation Download Import Template$")
    public static void OESLiteoptiontabforsubeventwiseWaitingListtabbeforetheimporttheentriesandverifytheimportrecordsactionstep1validationDownloadImportTemplate()throws Exception{

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

        click_on_element("AdminPortalElements/EventcreationElements/tab_OESlite_common_subeventsheaderfirsttab");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_DownloadImportTemplate");
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_Cancel");


    }

    @Given("^OES Lite option tab for subevent wise Waiting List tab before the import the entries and verify the import records action step1 validation Download Para Event Import Template$")
    public static void OESLiteoptiontabforsubeventwiseWaitingListtabbeforetheimporttheentriesandverifytheimportrecordsactionstep1validationDownloadParaEventImportTemplate()throws Exception{

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

        click_on_element("AdminPortalElements/EventcreationElements/tab_OESlite_common_subeventsheaderfirsttab");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_DownloadParaEventImportTemplate");
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_Cancel");


    }

    @Given("^OES Lite option tab for subevent wise Waiting List tab before the import the entries and verify the import records action step 2 validation upload file$")
    public static void OESLiteoptiontabforsubeventwiseWaitingListtabbeforetheimporttheentriesandverifytheimportrecordsactionstep2validationuploadfile()throws Exception{

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

        click_on_element("AdminPortalElements/EventcreationElements/tab_OESlite_common_subeventsheaderfirsttab");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(8);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_Cancel");

    }

    @Given("^OES Lite option tab for subevent wise Waiting List tab before the import the entries and verify the import records action step 3 validation Skip Restrictions$")
    public static void OESLiteoptiontabforsubeventwiseWaitingListtabbeforetheimporttheentriesandverifytheimportrecordsactionstep3validationSkipRestrictions()throws Exception{

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

        click_on_element("AdminPortalElements/EventcreationElements/tab_OESlite_common_subeventsheaderfirsttab");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_Cancel");

    }

    @Given("^OES Lite option tab for subevent wise Waiting List tab before the import the entries and verify the import records action achieve all the three steps upload the valid file$")
    public static void OESLiteoptiontabforsubeventwiseWaitingListtabbeforetheimporttheentriesandverifytheimportrecordsactionachieveallthethreestepsuploadthevalidfile()throws Exception{

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

        click_on_element("AdminPortalElements/EventcreationElements/tab_OESlite_common_subeventsheaderfirsttab");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_DeleteEntries");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(4);
    }

    @Given("^OES Lite option tab for subevent wise Waiting List tab before the import the entries and verify the import records action achieve all the three steps upload the invalid file$")
    public static void OESLiteoptiontabforsubeventwiseWaitingListtabbeforetheimporttheentriesandverifytheimportrecordsactionachieveallthethreestepsuploadtheinvalidfile()throws Exception{

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

        click_on_element("AdminPortalElements/EventcreationElements/tab_OESlite_common_subeventsheaderfirsttab");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template_invalid_format.xlsx");
        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);

        Verifytheactualandexceptedvalues("ERROR\n" +
                "\n" +
                "Status should not be empty\n" +
                "DrawType should not be empty\n" +
                "EntryType should not be empty","AdminPortalElements/Admin_login_page_Elements/text_Admin_login_error_alert");

    }

    @Given("^OES Lite option tab for subevent wise Waiting List tab before the import the entries and verify the import records action achieve all the three steps upload the valid file and select Skip All checkbox$")
    public static void OESLiteoptiontabforsubeventwiseWaitingListtabbeforetheimporttheentriesandverifytheimportrecordsactionachieveallthethreestepsuploadthevalidfileandselectSkipAllcheckbox()throws Exception{

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

        click_on_element("AdminPortalElements/EventcreationElements/tab_OESlite_common_subeventsheaderfirsttab");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_DeleteEntries");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(4);
    }

    @Given("^OES Lite option tab for subevent wise Waiting List tab before the import the entries and verify the import records action achieve all the three steps upload the valid file and select Draw Size checkbox$")
    public static void OESLiteoptiontabforsubeventwiseWaitingListtabbeforetheimporttheentriesandverifytheimportrecordsactionachieveallthethreestepsuploadthevalidfileandselectDrawSizecheckbox()throws Exception{

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

        click_on_element("AdminPortalElements/EventcreationElements/tab_OESlite_common_subeventsheaderfirsttab");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_DrawSize");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_DeleteEntries");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(4);

    }

    @Given("^OES Lite option tab for subevent wise Waiting List tab before the import the entries and verify the import records action achieve all the three steps upload the valid file and select AER checkbox$")
    public static void OESLiteoptiontabforsubeventwiseWaitingListtabbeforetheimporttheentriesandverifytheimportrecordsactionachieveallthethreestepsuploadthevalidfileandselectAERcheckbox()throws Exception{

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

        click_on_element("AdminPortalElements/EventcreationElements/tab_OESlite_common_subeventsheaderfirsttab");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_AER");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_DeleteEntries");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(4);

    }

    @Given("^OES Lite option tab for subevent wise Waiting List tab before the import the entries and verify the import records action achieve all the three steps upload the valid file and select NER checkbox$")
    public static void OESLiteoptiontabforsubeventwiseWaitingListtabbeforetheimporttheentriesandverifytheimportrecordsactionachieveallthethreestepsuploadthevalidfileandselectNERcheckbox()throws Exception{

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

        click_on_element("AdminPortalElements/EventcreationElements/tab_OESlite_common_subeventsheaderfirsttab");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_NER");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_DeleteEntries");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(4);

    }

    @Given("^OES Lite option tab for subevent wise Waiting List tab before the import the entries and verify the import records action achieve all the three steps upload the valid file and select WC checkbox$")
    public static void OESLiteoptiontabforsubeventwiseWaitingListtabbeforetheimporttheentriesandverifytheimportrecordsactionachieveallthethreestepsuploadthevalidfileandselectWCcheckbox()throws Exception{

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

        click_on_element("AdminPortalElements/EventcreationElements/tab_OESlite_common_subeventsheaderfirsttab");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_WC");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_DeleteEntries");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(4);

    }

    @Given("^OES Lite option tab for subevent wise Waiting List tab before the import the entries and verify the import records action achieve all the three steps upload the valid file and select WTT checkbox$")
    public static void OESLiteoptiontabforsubeventwiseWaitingListtabbeforetheimporttheentriesandverifytheimportrecordsactionachieveallthethreestepsuploadthevalidfileandselectWTTcheckbox()throws Exception{

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

        click_on_element("AdminPortalElements/EventcreationElements/tab_OESlite_common_subeventsheaderfirsttab");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_WTT");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_DeleteEntries");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(4);

    }

    @Given("^OES Lite option tab for subevent wise Waiting List tab before the import the entries and verify the import records action achieve all the three steps upload the valid file and select WYN checkbox$")
    public static void OESLiteoptiontabforsubeventwiseWaitingListtabbeforetheimporttheentriesandverifytheimportrecordsactionachieveallthethreestepsuploadthevalidfileandselectWYNcheckbox()throws Exception{

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

        click_on_element("AdminPortalElements/EventcreationElements/tab_OESlite_common_subeventsheaderfirsttab");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_WYN");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_DeleteEntries");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(4);

    }

    @Given("^OES Lite option tab for subevent wise Waiting List tab before the import the entries and verify the import records action achieve all the three steps upload the valid file and select QUAL checkbox$")
    public static void OESLiteoptiontabforsubeventwiseWaitingListtabbeforetheimporttheentriesandverifytheimportrecordsactionachieveallthethreestepsuploadthevalidfileandselectQUALcheckbox()throws Exception{

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

        click_on_element("AdminPortalElements/EventcreationElements/tab_OESlite_common_subeventsheaderfirsttab");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_QUAL");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_DeleteEntries");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(4);

    }

    @Given("^OES Lite option tab for subevent wise Waiting List tab before the import the entries and verify the import records action achieve all the three steps upload the valid file and select CWR checkbox$")
    public static void OESLiteoptiontabforsubeventwiseWaitingListtabbeforetheimporttheentriesandverifytheimportrecordsactionachieveallthethreestepsuploadthevalidfileandselectCWRcheckbox()throws Exception{

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

        click_on_element("AdminPortalElements/EventcreationElements/tab_OESlite_common_subeventsheaderfirsttab");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_CWR");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_DeleteEntries");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(4);

    }

    @Given("^OES Lite option tab for subevent wise Waiting List tab before the import the entries and verify the import records action achieve all the three steps upload the valid file and select PDR checkbox$")
    public static void OESLiteoptiontabforsubeventwiseWaitingListtabbeforetheimporttheentriesandverifytheimportrecordsactionachieveallthethreestepsuploadthevalidfileandselectPDRcheckbox()throws Exception{

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

        click_on_element("AdminPortalElements/EventcreationElements/tab_OESlite_common_subeventsheaderfirsttab");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_PDR");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_DeleteEntries");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(4);

    }

    @Given("^OES Lite option tab for subevent wise Waiting List tab before the import the entries and verify the import records action achieve all the three steps upload the valid file and select HOSTNER checkbox$")
    public static void OESLiteoptiontabforsubeventwiseWaitingListtabbeforetheimporttheentriesandverifytheimportrecordsactionachieveallthethreestepsuploadthevalidfileandselectHOSTNERcheckbox()throws Exception{

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

        click_on_element("AdminPortalElements/EventcreationElements/tab_OESlite_common_subeventsheaderfirsttab");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_HOST_NER");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_DeleteEntries");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(4);

    }

    @Given("^OES Lite option tab for subevent wise Waiting List tab before the import the entries and verify the import records action achieve all the three steps upload the valid file and select HOSTNERTotalPairs checkbox$")
    public static void OESLiteoptiontabforsubeventwiseWaitingListtabbeforetheimporttheentriesandverifytheimportrecordsactionachieveallthethreestepsuploadthevalidfileandselectHOSTNERTotalPairscheckbox()throws Exception{

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

        click_on_element("AdminPortalElements/EventcreationElements/tab_OESlite_common_subeventsheaderfirsttab");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_HOST_NER_TotalPairs");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_DeleteEntries");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(4);

    }

    @Given("^OES Lite option tab for subevent wise Waiting List tab before the import the entries and verify the import records action achieve all the three steps upload the valid file and select HOSTNERMIXPairs checkbox$")
    public static void OESLiteoptiontabforsubeventwiseWaitingListtabbeforetheimporttheentriesandverifytheimportrecordsactionachieveallthethreestepsuploadthevalidfileandselectHOSTNERMIXPairscheckbox()throws Exception{

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

        click_on_element("AdminPortalElements/EventcreationElements/tab_OESlite_common_subeventsheaderfirsttab");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_HOST_NER_MIXPairs");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_DeleteEntries");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(4);

    }

    @Given("^OES Lite option tab for subevent wise Main draw tab Action dropdown options after the import the entries$")
    public static void OESLiteoptiontabforsubeventwiseMaindrawtabActiondropdownoptionsaftertheimporttheentries()throws Exception{

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

        click_on_element("AdminPortalElements/EventcreationElements/tab_OESlite_common_subeventsheaderfirsttab");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);

        element_visiability("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");
        element_visiability("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ExportasExcel");
        element_visiability("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ExportasPDF");
        element_visiability("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_DeleteEntries");
      //  element_visiability("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_RollbacktoDraft");


    }

    @Given("^OES Lite option tab for subevent wise Main draw tab After the import the entries and verify the import records action$")
    public static void OESLiteoptiontabforsubeventwiseMaindrawtabAftertheimporttheentriesandverifytheimportrecordsaction()throws Exception{

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

        click_on_element("AdminPortalElements/EventcreationElements/tab_OESlite_common_subeventsheaderfirsttab");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        element_visiability("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_DownloadImportTemplate");
        element_visiability("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_DownloadParaEventImportTemplate");
        element_visiability("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        element_visiability("AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // element_visiability("AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_Cancel");


    }

    @Given("^OES Lite option tab for subevent wise Main draw tab After the import the entries and verify the import records action step1 validation Download Import Template$")
    public static void OESLiteoptiontabforsubeventwiseMaindrawtabAftertheimporttheentriesandverifytheimportrecordsactionstep1validationDownloadImportTemplate()throws Exception{

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

        click_on_element("AdminPortalElements/EventcreationElements/tab_OESlite_common_subeventsheaderfirsttab");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_DownloadImportTemplate");
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_Cancel");

    }

    @Given("^OES Lite option tab for subevent wise Main draw tab After the import the entries and verify the import records action step1 validation Download Para Event Import Template$")
    public static void OESLiteoptiontabforsubeventwiseMaindrawtabAftertheimporttheentriesandverifytheimportrecordsactionstep1validationDownloadParaEventImportTemplate()throws Exception{

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

        click_on_element("AdminPortalElements/EventcreationElements/tab_OESlite_common_subeventsheaderfirsttab");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_DownloadParaEventImportTemplate");
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_Cancel");

    }

    @Given("^OES Lite option tab for subevent wise Main draw tab After the import the entries and verify the import records action step2 validation upload file$")
    public static void OESLiteoptiontabforsubeventwiseMaindrawtabAftertheimporttheentriesandverifytheimportrecordsactionstep2validationuploadfile()throws Exception{

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

        click_on_element("AdminPortalElements/EventcreationElements/tab_OESlite_common_subeventsheaderfirsttab");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(8);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_Cancel");

    }

    @Given("^OES Lite option tab for subevent wise Main draw tab After the import the entries and verify the import records action step3 validation Skip Restrictions$")
    public static void OESLiteoptiontabforsubeventwiseMaindrawtabAftertheimporttheentriesandverifytheimportrecordsactionstep3validationSkipRestrictions()throws Exception{

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

        click_on_element("AdminPortalElements/EventcreationElements/tab_OESlite_common_subeventsheaderfirsttab");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_Cancel");

    }

    @Given("^OES Lite option tab for subevent wise Main draw tab After the import the entries and verify the import records action achieve all the three steps upload the valid file$")
    public static void OESLiteoptiontabforsubeventwiseMaindrawtabAftertheimporttheentriesandverifytheimportrecordsactionachieveallthethreestepsuploadthevalidfile()throws Exception{

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

        click_on_element("AdminPortalElements/EventcreationElements/tab_OESlite_common_subeventsheaderfirsttab");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

    }

    @Given("^OES Lite option tab for subevent wise Main draw tab After the import the entries and verify the import records action achieve all the three steps upload the invalid file$")
    public static void OESLiteoptiontabforsubeventwiseMaindrawtabAftertheimporttheentriesandverifytheimportrecordsactionachieveallthethreestepsuploadtheinvalidfile()throws Exception{

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

        click_on_element("AdminPortalElements/EventcreationElements/tab_OESlite_common_subeventsheaderfirsttab");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template_invalid_format.xlsx");
        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);

        Verifytheactualandexceptedvalues("ERROR\n" +
                "\n" +
                "Status should not be empty\n" +
                "DrawType should not be empty\n" +
                "EntryType should not be empty","AdminPortalElements/Admin_login_page_Elements/text_Admin_login_error_alert");



    }

    @Given("^OES Lite option tab for subevent wise Main draw tab After the import the entries and verify the import records action achieve all the three steps upload the valid file and select Skip All checkbox$")
    public static void OESLiteoptiontabforsubeventwiseMaindrawtabAftertheimporttheentriesandverifytheimportrecordsactionachieveallthethreestepsuploadthevalidfileandselectSkipAllcheckbox()throws Exception{

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

        click_on_element("AdminPortalElements/EventcreationElements/tab_OESlite_common_subeventsheaderfirsttab");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

    }

    @Given("^OES Lite option tab for subevent wise Main draw tab After the import the entries and verify the import records action achieve all the three steps upload the valid file and select Draw Size checkbox$")
    public static void OESLiteoptiontabforsubeventwiseMaindrawtabAftertheimporttheentriesandverifytheimportrecordsactionachieveallthethreestepsuploadthevalidfileandselectDrawSizecheckbox()throws Exception{

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

        click_on_element("AdminPortalElements/EventcreationElements/tab_OESlite_common_subeventsheaderfirsttab");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_DrawSize");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

    }

    @Given("^OES Lite option tab for subevent wise Main draw tab After the import the entries and verify the import records action achieve all the three steps upload the valid file and select AER checkbox$")
    public static void OESLiteoptiontabforsubeventwiseMaindrawtabAftertheimporttheentriesandverifytheimportrecordsactionachieveallthethreestepsuploadthevalidfileandselectAERcheckbox()throws Exception{

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

        click_on_element("AdminPortalElements/EventcreationElements/tab_OESlite_common_subeventsheaderfirsttab");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_AER");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

    }

    @Given("^OES Lite option tab for subevent wise Main draw tab After the import the entries and verify the import records action achieve all the three steps upload the valid file and select NER checkbox$")
    public static void OESLiteoptiontabforsubeventwiseMaindrawtabAftertheimporttheentriesandverifytheimportrecordsactionachieveallthethreestepsuploadthevalidfileandselectNERcheckbox()throws Exception{

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

        click_on_element("AdminPortalElements/EventcreationElements/tab_OESlite_common_subeventsheaderfirsttab");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_NER");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

    }

    @Given("^OES Lite option tab for subevent wise Main draw tab After the import the entries and verify the import records action achieve all the three steps upload the valid file and select WC checkbox$")
    public static void OESLiteoptiontabforsubeventwiseMaindrawtabAftertheimporttheentriesandverifytheimportrecordsactionachieveallthethreestepsuploadthevalidfileandselectWCcheckbox()throws Exception{

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

        click_on_element("AdminPortalElements/EventcreationElements/tab_OESlite_common_subeventsheaderfirsttab");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_WC");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

    }

    @Given("^OES Lite option tab for subevent wise Main draw tab After the import the entries and verify the import records action achieve all the three steps upload the valid file and select WTT checkbox$")
    public static void OESLiteoptiontabforsubeventwiseMaindrawtabAftertheimporttheentriesandverifytheimportrecordsactionachieveallthethreestepsuploadthevalidfileandselectWTTcheckbox()throws Exception{

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

        click_on_element("AdminPortalElements/EventcreationElements/tab_OESlite_common_subeventsheaderfirsttab");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_WTT");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

    }

    @Given("^OES Lite option tab for subevent wise Main draw tab After the import the entries and verify the import records action achieve all the three steps upload the valid file and select WYN checkbox$")
    public static void OESLiteoptiontabforsubeventwiseMaindrawtabAftertheimporttheentriesandverifytheimportrecordsactionachieveallthethreestepsuploadthevalidfileandselectWYNcheckbox()throws Exception{

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

        click_on_element("AdminPortalElements/EventcreationElements/tab_OESlite_common_subeventsheaderfirsttab");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_WYN");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

    }

    @Given("^OES Lite option tab for subevent wise Main draw tab After the import the entries and verify the import records action achieve all the three steps upload the valid file and select QUAL checkbox$")
    public static void OESLiteoptiontabforsubeventwiseMaindrawtabAftertheimporttheentriesandverifytheimportrecordsactionachieveallthethreestepsuploadthevalidfileandselectQUALcheckbox()throws Exception{

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

        click_on_element("AdminPortalElements/EventcreationElements/tab_OESlite_common_subeventsheaderfirsttab");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_QUAL");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

    }

    @Given("^OES Lite option tab for subevent wise Main draw tab After the import the entries and verify the import records action achieve all the three steps upload the valid file and select CWR checkbox$")
    public static void OESLiteoptiontabforsubeventwiseMaindrawtabAftertheimporttheentriesandverifytheimportrecordsactionachieveallthethreestepsuploadthevalidfileandselectCWRcheckbox()throws Exception{

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

        click_on_element("AdminPortalElements/EventcreationElements/tab_OESlite_common_subeventsheaderfirsttab");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_CWR");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

    }

    @Given("^OES Lite option tab for subevent wise Main draw tab After the import the entries and verify the import records action achieve all the three steps upload the valid file and select PDR checkbox$")
    public static void OESLiteoptiontabforsubeventwiseMaindrawtabAftertheimporttheentriesandverifytheimportrecordsactionachieveallthethreestepsuploadthevalidfileandselectPDRcheckbox()throws Exception{

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

        click_on_element("AdminPortalElements/EventcreationElements/tab_OESlite_common_subeventsheaderfirsttab");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_PDR");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

    }

    @Given("^OES Lite option tab for subevent wise Main draw tab After the import the entries and verify the import records action achieve all the three steps upload the valid file and select HOSTNER checkbox$")
    public static void OESLiteoptiontabforsubeventwiseMaindrawtabAftertheimporttheentriesandverifytheimportrecordsactionachieveallthethreestepsuploadthevalidfileandselectHOSTNERcheckbox()throws Exception{

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

        click_on_element("AdminPortalElements/EventcreationElements/tab_OESlite_common_subeventsheaderfirsttab");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_HOST_NER");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

    }

    @Given("^OES Lite option tab for subevent wise Main draw tab After the import the entries and verify the import records action achieve all the three steps upload the valid file and select HOSTNERTotalPairs checkbox$")
    public static void OESLiteoptiontabforsubeventwiseMaindrawtabAftertheimporttheentriesandverifytheimportrecordsactionachieveallthethreestepsuploadthevalidfileandselectHOSTNERTotalPairscheckbox()throws Exception{

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

        click_on_element("AdminPortalElements/EventcreationElements/tab_OESlite_common_subeventsheaderfirsttab");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_HOST_NER_TotalPairs");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

    }

    @Given("^OES Lite option tab for subevent wise Main draw tab After the import the entries and verify the import records action achieve all the three steps upload the valid file and select HOSTNERMIXPairs checkbox$")
    public static void OESLiteoptiontabforsubeventwiseMaindrawtabAftertheimporttheentriesandverifytheimportrecordsactionachieveallthethreestepsuploadthevalidfileandselectHOSTNERMIXPairscheckbox()throws Exception{

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

        click_on_element("AdminPortalElements/EventcreationElements/tab_OESlite_common_subeventsheaderfirsttab");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_HOST_NER_MIXPairs");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

    }

    @Given("^OES Lite option tab for subevent wise Waiting List tab Action dropdown options After the import the entries$")
    public static void OESLiteoptiontabforsubeventwiseWaitingListtabActiondropdownoptionsAftertheimporttheentries()throws Exception{

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

        click_on_element("AdminPortalElements/EventcreationElements/tab_OESlite_common_subeventsheaderfirsttab");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);

        element_visiability("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");
        element_visiability("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ExportasExcel");
        element_visiability("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ExportasPDF");
        element_visiability("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_DeleteEntries");
        //  element_visiability("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_RollbacktoDraft");

    }

    @Given("^OES Lite option tab for subevent wise Waiting List tab After the import the entries and verify the import records action$")
    public static void OESLiteoptiontabforsubeventwiseWaitingListtabAftertheimporttheentriesandverifytheimportrecordsaction()throws Exception{

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

        click_on_element("AdminPortalElements/EventcreationElements/tab_OESlite_common_subeventsheaderfirsttab");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        element_visiability("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_DownloadImportTemplate");
        element_visiability("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_DownloadParaEventImportTemplate");
        element_visiability("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        element_visiability("AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // element_visiability("AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_Cancel");
    }

    @Given("^OES Lite option tab for subevent wise Waiting List tab After the import the entries and verify the import records action step1 validation  Download Import Template$")
    public static void OESLiteoptiontabforsubeventwiseWaitingListtabAftertheimporttheentriesandverifytheimportrecordsactionstep1validationDownloadImportTemplate()throws Exception{

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

        click_on_element("AdminPortalElements/EventcreationElements/tab_OESlite_common_subeventsheaderfirsttab");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_DownloadImportTemplate");
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_Cancel");
    }

    @Given("^OES Lite option tab for subevent wise Waiting List tab After the import the entries and verify the import records action step1 validation  Download Para Event Import Template$")
    public static void OESLiteoptiontabforsubeventwiseWaitingListtabAftertheimporttheentriesandverifytheimportrecordsactionstep1validationDownloadParaEventImportTemplate()throws Exception{

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

        click_on_element("AdminPortalElements/EventcreationElements/tab_OESlite_common_subeventsheaderfirsttab");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_DownloadParaEventImportTemplate");
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_Cancel");
    }

    @Given("^OES Lite option tab for subevent wise Waiting List tab After the import the entries and verify the import records action step2 validation upload file$")
    public static void OESLiteoptiontabforsubeventwiseWaitingListtabAftertheimporttheentriesandverifytheimportrecordsactionstep2validationuploadfile()throws Exception{

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

        click_on_element("AdminPortalElements/EventcreationElements/tab_OESlite_common_subeventsheaderfirsttab");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(8);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_Cancel");
    }

    @Given("^OES Lite option tab for subevent wise Waiting List tab After the import the entries and verify the import records action step3 validation Skip Restrictions$")
    public static void OESLiteoptiontabforsubeventwiseWaitingListtabAftertheimporttheentriesandverifytheimportrecordsactionstep3validationSkipRestrictions()throws Exception{

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

        click_on_element("AdminPortalElements/EventcreationElements/tab_OESlite_common_subeventsheaderfirsttab");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_Cancel");
    }

    @Given("^OES Lite option tab for subevent wise Waiting List tab After the import the entries and verify the import records action achieve all the three steps upload the valid file$")
    public static void OESLiteoptiontabforsubeventwiseWaitingListtabAftertheimporttheentriesandverifytheimportrecordsactionachieveallthethreestepsuploadthevalidfile()throws Exception{

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

        click_on_element("AdminPortalElements/EventcreationElements/tab_OESlite_common_subeventsheaderfirsttab");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");
    }

    @Given("^OES Lite option tab for subevent wise Waiting List tab After the import the entries and verify the import records action achieve all the three steps upload the invalid file$")
    public static void OESLiteoptiontabforsubeventwiseWaitingListtabAftertheimporttheentriesandverifytheimportrecordsactionachieveallthethreestepsuploadtheinvalidfile()throws Exception{

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

        click_on_element("AdminPortalElements/EventcreationElements/tab_OESlite_common_subeventsheaderfirsttab");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template_invalid_format.xlsx");
        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);

        Verifytheactualandexceptedvalues("ERROR\n" +
                "\n" +
                "Status should not be empty\n" +
                "DrawType should not be empty\n" +
                "EntryType should not be empty","AdminPortalElements/Admin_login_page_Elements/text_Admin_login_error_alert");
    }

    @Given("^OES Lite option tab for subevent wise Waiting List tab After the import the entries and verify the import records action achieve all the three steps upload the valid file and select Skip All checkbox$")
    public static void OESLiteoptiontabforsubeventwiseWaitingListtabAftertheimporttheentriesandverifytheimportrecordsactionachieveallthethreestepsuploadthevalidfileandselectSkipAllcheckbox()throws Exception{

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

        click_on_element("AdminPortalElements/EventcreationElements/tab_OESlite_common_subeventsheaderfirsttab");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

    }

    @Given("^OES Lite option tab for subevent wise Waiting List tab After the import the entries and verify the import records action achieve all the three steps upload the valid file and select Draw Size checkbox$")
    public static void OESLiteoptiontabforsubeventwiseWaitingListtabAftertheimporttheentriesandverifytheimportrecordsactionachieveallthethreestepsuploadthevalidfileandselectDrawSizecheckbox()throws Exception{

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

        click_on_element("AdminPortalElements/EventcreationElements/tab_OESlite_common_subeventsheaderfirsttab");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_DrawSize");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

    }

    @Given("^OES Lite option tab for subevent wise Waiting List tab After the import the entries and verify the import records action achieve all the three steps upload the valid file and select AER checkbox$")
    public static void OESLiteoptiontabforsubeventwiseWaitingListtabAftertheimporttheentriesandverifytheimportrecordsactionachieveallthethreestepsuploadthevalidfileandselectAERcheckbox()throws Exception{

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

        click_on_element("AdminPortalElements/EventcreationElements/tab_OESlite_common_subeventsheaderfirsttab");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_AER");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

    }

    @Given("^OES Lite option tab for subevent wise Waiting List tab After the import the entries and verify the import records action achieve all the three steps upload the valid file and select NER checkbox$")
    public static void OESLiteoptiontabforsubeventwiseWaitingListtabAftertheimporttheentriesandverifytheimportrecordsactionachieveallthethreestepsuploadthevalidfileandselectNERcheckbox()throws Exception{

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

        click_on_element("AdminPortalElements/EventcreationElements/tab_OESlite_common_subeventsheaderfirsttab");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_NER");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

    }

    @Given("^OES Lite option tab for subevent wise Waiting List tab After the import the entries and verify the import records action achieve all the three steps upload the valid file and select WC checkbox$")
    public static void OESLiteoptiontabforsubeventwiseWaitingListtabAftertheimporttheentriesandverifytheimportrecordsactionachieveallthethreestepsuploadthevalidfileandselectWCcheckbox()throws Exception{

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

        click_on_element("AdminPortalElements/EventcreationElements/tab_OESlite_common_subeventsheaderfirsttab");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_WC");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

    }

    @Given("^OES Lite option tab for subevent wise Waiting List tab After the import the entries and verify the import records action achieve all the three steps upload the valid file and select WTT checkbox$")
    public static void OESLiteoptiontabforsubeventwiseWaitingListtabAftertheimporttheentriesandverifytheimportrecordsactionachieveallthethreestepsuploadthevalidfileandselectWTTcheckbox()throws Exception{

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

        click_on_element("AdminPortalElements/EventcreationElements/tab_OESlite_common_subeventsheaderfirsttab");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_WTT");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

    }

    @Given("^OES Lite option tab for subevent wise Waiting List tab After the import the entries and verify the import records action achieve all the three steps upload the valid file and select WYN checkbox$")
    public static void OESLiteoptiontabforsubeventwiseWaitingListtabAftertheimporttheentriesandverifytheimportrecordsactionachieveallthethreestepsuploadthevalidfileandselectWYNcheckbox()throws Exception{

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

        click_on_element("AdminPortalElements/EventcreationElements/tab_OESlite_common_subeventsheaderfirsttab");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_WYN");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

    }

    @Given("^OES Lite option tab for subevent wise Waiting List tab After the import the entries and verify the import records action achieve all the three steps upload the valid file and select QUAL checkbox$")
    public static void OESLiteoptiontabforsubeventwiseWaitingListtabAftertheimporttheentriesandverifytheimportrecordsactionachieveallthethreestepsuploadthevalidfileandselectQUALcheckbox()throws Exception{

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

        click_on_element("AdminPortalElements/EventcreationElements/tab_OESlite_common_subeventsheaderfirsttab");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_QUAL");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

    }

    @Given("^OES Lite option tab for subevent wise Waiting List tab After the import the entries and verify the import records action achieve all the three steps upload the valid file and select CWR checkbox$")
    public static void OESLiteoptiontabforsubeventwiseWaitingListtabAftertheimporttheentriesandverifytheimportrecordsactionachieveallthethreestepsuploadthevalidfileandselectCWRcheckbox()throws Exception{

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

        click_on_element("AdminPortalElements/EventcreationElements/tab_OESlite_common_subeventsheaderfirsttab");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_CWR");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

    }

    @Given("^OES Lite option tab for subevent wise Waiting List tab After the import the entries and verify the import records action achieve all the three steps upload the valid file and select PDR checkbox$")
    public static void OESLiteoptiontabforsubeventwiseWaitingListtabAftertheimporttheentriesandverifytheimportrecordsactionachieveallthethreestepsuploadthevalidfileandselectPDRcheckbox()throws Exception{

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

        click_on_element("AdminPortalElements/EventcreationElements/tab_OESlite_common_subeventsheaderfirsttab");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_PDR");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

    }

    @Given("^OES Lite option tab for subevent wise Waiting List tab After the import the entries and verify the import records action achieve all the three steps upload the valid file and select HOSTNER checkbox$")
    public static void OESLiteoptiontabforsubeventwiseWaitingListtabAftertheimporttheentriesandverifytheimportrecordsactionachieveallthethreestepsuploadthevalidfileandselectHOSTNERcheckbox()throws Exception{

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

        click_on_element("AdminPortalElements/EventcreationElements/tab_OESlite_common_subeventsheaderfirsttab");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_HOST_NER");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

    }

    @Given("^OES Lite option tab for subevent wise Waiting List tab After the import the entries and verify the import records action achieve all the three steps upload the valid file and select HOSTNERTotalPairs checkbox$")
    public static void OESLiteoptiontabforsubeventwiseWaitingListtabAftertheimporttheentriesandverifytheimportrecordsactionachieveallthethreestepsuploadthevalidfileandselectHOSTNERTotalPairscheckbox()throws Exception{

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

        click_on_element("AdminPortalElements/EventcreationElements/tab_OESlite_common_subeventsheaderfirsttab");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_HOST_NER_TotalPairs");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

    }

    @Given("^OES Lite option tab for subevent wise Waiting List tab After the import the entries and verify the import records action achieve all the three steps upload the valid file and select HOSTNERMIXPairs checkbox$")
    public static void OESLiteoptiontabforsubeventwiseWaitingListtabAftertheimporttheentriesandverifytheimportrecordsactionachieveallthethreestepsuploadthevalidfileandselectHOSTNERMIXPairscheckbox()throws Exception{

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

        click_on_element("AdminPortalElements/EventcreationElements/tab_OESlite_common_subeventsheaderfirsttab");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_HOST_NER_MIXPairs");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

    }

    @Given("^OES Lite option tab for subevent wise Main draw tab After the import the entries and verify the Export as Excel action$")
    public static void OESLiteoptiontabforsubeventwiseMaindrawtabAftertheimporttheentriesandverifytheExportasExcelaction()throws Exception{

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

        click_on_element("AdminPortalElements/EventcreationElements/tab_OESlite_common_subeventsheaderfirsttab");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ExportasExcel");
        base.wait(5);

    }

    @Given("^OES Lite option tab for subevent wise Main draw tab After the import the entries and verify the Delete entries action$")
    public static void OESLiteoptiontabforsubeventwiseMaindrawtabAftertheimporttheentriesandverifytheDeleteentriesaction()throws Exception{

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

        click_on_element("AdminPortalElements/EventcreationElements/tab_OESlite_common_subeventsheaderfirsttab");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_DeleteEntries");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(5);

    }

    @Given("^OES Lite option tab for subevent wise Main draw tab After the import the entries and verify the Mark as publish action$")
    public static void OESLiteoptiontabforsubeventwiseMaindrawtabAftertheimporttheentriesandverifytheMarkaspublishaction()throws Exception{

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

        click_on_element("AdminPortalElements/EventcreationElements/tab_OESlite_common_subeventsheaderfirsttab");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderMainDrawtab");
        base.wait(1);



        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        //rollbacktodraft

        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_RollbacktoDraft");
        base.wait(5);

        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_MarkasPublished");
        base.wait(5);

    }

    @Given("^OES Lite option tab for subevent wise Waiting List tab After the import the entries and verify the Export as Excel action$")
    public static void OESLiteoptiontabforsubeventwiseWaitingListtabAftertheimporttheentriesandverifytheExportasExcelaction()throws Exception{

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

        click_on_element("AdminPortalElements/EventcreationElements/tab_OESlite_common_subeventsheaderfirsttab");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ExportasExcel");
        base.wait(5);

    }

    @Given("^OES Lite option tab for subevent wise Waiting List tab After the import the entries and verify the Delete entries action$")
    public static void OESLiteoptiontabforsubeventwiseWaitingListtabAftertheimporttheentriesandverifytheDeleteentriesaction()throws Exception{

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

        click_on_element("AdminPortalElements/EventcreationElements/tab_OESlite_common_subeventsheaderfirsttab");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);


        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_DeleteEntries");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(5);

    }

    @Given("^OES Lite option tab for subevent wise Waiting List tab After the import the entries and verify the Mark as publish action$")
    public static void OESLiteoptiontabforsubeventwiseWaitingListtabAftertheimporttheentriesandverifytheMarkaspublishaction()throws Exception{

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

        click_on_element("AdminPortalElements/EventcreationElements/tab_OESlite_common_subeventsheaderfirsttab");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);



        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecords");

        click_on_element("AdminPortalElements/OESLiteElements/file_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step2uploadfile");
        Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(4);

        click_on_element("AdminPortalElements/OESLiteElements/checkbox_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step3_SkipAll");
        // Fileuploadrobotclass.fileuploadmethod("PLE_Singles_Template.xlsx");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_ImportRecordspopwindow_step4_importrecords");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(30);
        element_visiability("AdminPortalElements/OESLiteElements/table_OESlite_reports_common_table");

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsroundsheaderWaitingListtab");
        base.wait(1);

        //rollbacktodraft

        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_RollbacktoDraft");
        base.wait(5);

        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action");
        base.wait(1);
        click_on_element("AdminPortalElements/OESLiteElements/button_OESlite_common_subeventsrounds_action_MarkasPublished");
        base.wait(5);

    }

    @Given("^OES Lite option tab for Report tab$")
    public static void OESLiteoptiontabforReporttab()throws Exception{

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

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheader_reports");
        base.wait(3);

        element_visiability("AdminPortalElements/OESLiteElements/tab_OESlite_reports_EntriesCountPerSubEvent");

    }

    @Given("^OES Lite option tab for Report tab options$")
    public static void OESLiteoptiontabforReporttaboptions()throws Exception{

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

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheader_reports");
        base.wait(3);

        element_visiability("AdminPortalElements/OESLiteElements/tab_OESlite_reports_EntriesCountPerSubEvent");

        element_visiability("AdminPortalElements/OESLiteElements/tab_OESlite_reports_EntriesCountperMemberAssociationperSubEvent");
        element_visiability("AdminPortalElements/OESLiteElements/tab_OESlite_reports_PlayerEntriesbySubEvent");
        element_visiability("AdminPortalElements/OESLiteElements/tab_OESlite_reports_PlayerEntryReport");



    }

    @Given("^OES Lite reports tab for Entries Count Per SubEvent subtab$")
    public static void OESLitereportstabforEntriesCountPerSubEventsubtab()throws Exception{

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

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheader_reports");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_reports_EntriesCountPerSubEvent");
        base.wait(2);
        element_visiability("AdminPortalElements/OESLiteElements/button_OESlite_reports_EntriesCountPerSubEvent_SubEvent");

    }

    @Given("^OES Lite report tab for Entries Count Per SubEvent subtab options$")
    public static void OESLitereporttabforEntriesCountPerSubEventsubtaboptions()throws Exception{

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

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_common_subeventsheader_reports");
        base.wait(3);

        click_on_element("AdminPortalElements/OESLiteElements/tab_OESlite_reports_EntriesCountPerSubEvent");
        base.wait(2);

        element_visiability("AdminPortalElements/OESLiteElements/button_OESlite_reports_EntriesCountPerSubEvent_SubEvent");
        element_visiability("AdminPortalElements/OESLiteElements/button_OESlite_reports_common_SortBysortfields");
        element_visiability("AdminPortalElements/OESLiteElements/button_OESlite_reports_common_SortByorderby");
        element_visiability("AdminPortalElements/OESLiteElements/text_OESlite_reports_common_searchfield");
        element_visiability("AdminPortalElements/OESLiteElements/button_OESlite_common_SelectVisibleFields");
        element_visiability("AdminPortalElements/OESLiteElements/button_OESlite_common_DownloadasExcel");
        element_visiability("AdminPortalElements/OESLiteElements/button_OESlite_common_DownloadasPDF");
        element_visiability("AdminPortalElements/OESLiteElements/button_OESlite_reports_common_clearfilter");



    }

    @Given("^OES Lite reporttab for Entries Count Per SubEvent subtab and Verify the Sub Event dropdown options$")
    public static void OESLitereporttabforEntriesCountPerSubEventsubtabandVerifytheSubEventdropdownoptions()throws Exception{

    }

    @Given("^OES Lite reporttab for Entries Count Per SubEvent subtab and Verify the Sub Event dropdown functionality$")
    public static void OESLitereporttabforEntriesCountPerSubEventsubtabandVerifytheSubEventdropdownfunctionality()throws Exception{

    }

    @Given("^OES Lite reporttab for Entries Count Per SubEvent subtab and Verify the Clear the filter button functionality$")
    public static void OESLitereporttabforEntriesCountPerSubEventsubtabandVerifytheClearthefilterbuttonfunctionality()throws Exception{

    }

    @Given("^OES Lite reporttab for Entries Count Per SubEvent subtab and Verify the Sort By dropdown functionality options$")
    public static void OESLitereporttabforEntriesCountPerSubEventsubtabandVerifytheSortBydropdownfunctionalityoptions()throws Exception{

    }

    @Given("^OES Lite reporttab for Entries Count Per SubEvent subtab and Verify the order By dropdown functionality$")
    public static void OESLitereporttabforEntriesCountPerSubEventsubtabandVerifytheorderBydropdownfunctionality()throws Exception{

    }

    @Given("^OES Lite reporttab for Entries Count Per SubEvent subtab and Verify the Sort By dropdown functionality select the subevent option and Order By dropdown functionality select the ASC option$")
    public static void OESLitereporttabforEntriesCountPerSubEventsubtabandVerifytheSortBydropdownfunctionalityselectthesubeventoptionandOrderBydropdownfunctionalityselecttheASCoption()throws Exception{

    }

    @Given("^OES Lite reporttab for Entries Count Per SubEvent subtab and Verify the Sort By dropdown functionality select the subevent option and Order By dropdown functionality select the DESC option$")
    public static void OESLitereporttabforEntriesCountPerSubEventsubtabandVerifytheSortBydropdownfunctionalityselectthesubeventoptionandOrderBydropdownfunctionalityselecttheDESCoption()throws Exception{

    }

    @Given("^OES Lite reporttab for Entries Count Per SubEvent subtab and Verify the Sort By dropdown functionality select the subeventcode option and Order By dropdown functionality select the ASC option$")
    public static void OESLitereporttabforEntriesCountPerSubEventsubtabandVerifytheSortBydropdownfunctionalityselectthesubeventcodeoptionandOrderBydropdownfunctionalityselecttheASCoption()throws Exception{

    }

    @Given("^OES Lite reporttab for Entries Count Per SubEvent subtab and Verify the Sort By dropdown functionality select the subeventcode option and Order By dropdown functionality select the DESC option$")
    public static void OESLitereporttabforEntriesCountPerSubEventsubtabandVerifytheSortBydropdownfunctionalityselectthesubeventcodeoptionandOrderBydropdownfunctionalityselecttheDESCoption()throws Exception{

    }

    @Given("^OES Lite reporttab for Entries Count Per SubEvent subtab and Verify the Sort By dropdown functionality select the total option and Order By dropdown functionality select the ASC option$")
    public static void OESLitereporttabforEntriesCountPerSubEventsubtabandVerifytheSortBydropdownfunctionalityselectthetotaloptionandOrderBydropdownfunctionalityselecttheASCoption()throws Exception{

    }

    @Given("^OES Lite reporttab for Entries Count Per SubEvent subtab and Verify the Sort By dropdown functionality select the total option and Order By dropdown functionality select the DESC option$")
    public static void OESLitereporttabforEntriesCountPerSubEventsubtabandVerifytheSortBydropdownfunctionalityselectthetotaloptionandOrderBydropdownfunctionalityselecttheDESCoption()throws Exception{

    }

    @Given("^OES Lite Reports tab for Entries Count Per SubEvent subtab and Verify the Search field functionality given valid data$")
    public static void OESLiteReportstabforEntriesCountPerSubEventsubtabandVerifytheSearchfieldfunctionalitygivenvaliddata()throws Exception{

    }

    @Given("^OES Lite Reports tab for Entries Count Per SubEvent subtab and Verify the Search field functionality given invalid data$")
    public static void OESLiteReportstabforEntriesCountPerSubEventsubtabandVerifytheSearchfieldfunctionalitygiveninvaliddata()throws Exception{

    }

    @Given("^OES Lite reporttab for Entries Count Per SubEvent subtab and Verify the Visibility column field selection dropdown options$")
    public static void OESLitereporttabforEntriesCountPerSubEventsubtabandVerifytheVisibilitycolumnfieldselectiondropdownoptions()throws Exception{

    }

    @Given("^OES Lite reporttab for Entries Count Per SubEvent subtab and Verify the Visibility column field selection dropdown using subevent option$")
    public static void OESLitereporttabforEntriesCountPerSubEventsubtabandVerifytheVisibilitycolumnfieldselectiondropdownusingsubeventoption()throws Exception{

    }

    @Given("^OES Lite reporttab for Entries Count Per SubEvent subtab and Verify the Visibility column field selection dropdown using subeventcode option$")
    public static void OESLitereporttabforEntriesCountPerSubEventsubtabandVerifytheVisibilitycolumnfieldselectiondropdownusingsubeventcodeoption()throws Exception{

    }

    @Given("^OES Lite reporttab for Entries Count Per SubEvent subtab and Verify the Visibility column field selection dropdown using total option$")
    public static void OESLitereporttabforEntriesCountPerSubEventsubtabandVerifytheVisibilitycolumnfieldselectiondropdownusingtotaloption()throws Exception{

    }

    @Given("^OES Lite reporttab for Entries Count Per SubEvent subtab and Verify the Visibility column field selection dropdown using all option$")
    public static void OESLitereporttabforEntriesCountPerSubEventsubtabandVerifytheVisibilitycolumnfieldselectiondropdownusingalloption()throws Exception{

    }

    @Given("^OES Lite reporttab for Entries Count Per SubEvent subtab and Verify the export the excel$")
    public static void OESLitereporttabforEntriesCountPerSubEventsubtabandVerifytheexporttheexcel()throws Exception{

    }

    @Given("^OES Lite reporttab for Entries Count Per SubEvent subtab and Verify the export the PDF$")
    public static void OESLitereporttabforEntriesCountPerSubEventsubtabandVerifytheexportthePDF()throws Exception{

    }

    @Given("^OES Lite report tab for Entries Count per Member Association per SubEvent subtab$")
    public static void OESLitereporttabforEntriesCountperMemberAssociationperSubEventsubtab()throws Exception{

    }

    @Given("^OES Lite report tab for Entries Count per Member Association per SubEvent subtab options$")
    public static void OESLitereporttabforEntriesCountperMemberAssociationperSubEventsubtaboptions()throws Exception{

    }

    @Given("^OES Lite report tab for Entries Count per Member Association per SubEvent subtab and Verify the Organization dropdown options$")
    public static void OESLitereporttabforEntriesCountperMemberAssociationperSubEventsubtabandVerifytheOrganizationdropdownoptions()throws Exception{

    }

    @Given("^OES Lite report tab for Entries Count per Member Association per SubEvent  subtab and Verify the Organization dropdown functionality$")
    public static void OESLitereporttabforEntriesCountperMemberAssociationperSubEventsubtabandVerifytheOrganizationdropdownfunctionality()throws Exception{

    }

    @Given("^OES Lite report tab for Entries Count per Member Association per SubEvent subtab and Verify the Clear the filter dropdown functionality$")
    public static void OESLitereporttabforEntriesCountperMemberAssociationperSubEventsubtabandVerifytheClearthefilterdropdownfunctionality()throws Exception{

    }

    @Given("^OES Lite report tab for Entries Count per Member Association per SubEvent subtab and Verify the Sort By dropdown functionality options$")
    public static void OESLitereporttabforEntriesCountperMemberAssociationperSubEventsubtabandVerifytheSortBydropdownfunctionalityoptions()throws Exception{

    }

    @Given("^OES Lite report tab for Entries Count per Member Association per SubEvent subtab and Verify the order By dropdown functionality$")
    public static void OESLitereporttabforEntriesCountperMemberAssociationperSubEventsubtabandVerifytheorderBydropdownfunctionality()throws Exception{

    }

    @Given("^OES Lite report tab for Entries Count per Member Association per SubEvent subtab and Verify the Sort By dropdown functionality select the Organization option and Order By dropdown functionality select the ASC option$")
    public static void OESLitereporttabforEntriesCountperMemberAssociationperSubEventsubtabandVerifytheSortBydropdownfunctionalityselecttheOrganizationoptionandOrderBydropdownfunctionalityselecttheASCoption()throws Exception{

    }

    @Given("^OES Lite report tab for Entries Count per Member Association per SubEvent subtab and Verify the Sort By dropdown functionality select the Organization option and Order By dropdown functionality select the DESC option$")
    public static void OESLitereporttabforEntriesCountperMemberAssociationperSubEventsubtabandVerifytheSortBydropdownfunctionalityselecttheOrganizationoptionandOrderBydropdownfunctionalityselecttheDESCoption()throws Exception{

    }

    @Given("^OES Lite report tab for Entries Count per Member Association per SubEvent subtab and Verify the Sort By dropdown functionality select the OrgCode option and Order By dropdown functionality select the ASC option$")
    public static void OESLitereporttabforEntriesCountperMemberAssociationperSubEventsubtabandVerifytheSortBydropdownfunctionalityselecttheOrgCodeoptionandOrderBydropdownfunctionalityselecttheASCoption()throws Exception{

    }

    @Given("^OES Lite report tab for Entries Count per Member Association per SubEvent subtab and Verify the Sort By dropdown functionality select the OrgCode option and Order By dropdown functionality select the DESC option$")
    public static void OESLitereporttabforEntriesCountperMemberAssociationperSubEventsubtabandVerifytheSortBydropdownfunctionalityselecttheOrgCodeoptionandOrderBydropdownfunctionalityselecttheDESCoption()throws Exception{

    }

    @Given("^OES Lite report tab for Entries Count per Member Association per SubEvent subtab and Verify the Sort By dropdown functionality select the RepresentingOrgCode option and Order by dropdown functionality select the ASC option$")
    public static void OESLitereporttabforEntriesCountperMemberAssociationperSubEventsubtabandVerifytheSortBydropdownfunctionalityselecttheRepresentingOrgCodeoptionandOrderbydropdownfunctionalityselecttheASCoption()throws Exception{

    }

    @Given("^OES Lite report tab for Entries Count per Member Association per SubEvent subtab and Verify the Sort By dropdown functionality select the RepresentingOrgCode option and Order By dropdown functionality select the DESC option$")
    public static void OESLitereporttabforEntriesCountperMemberAssociationperSubEventsubtabandVerifytheSortBydropdownfunctionalityselecttheRepresentingOrgCodeoptionandOrderBydropdownfunctionalityselecttheDESCoption()throws Exception{

    }

    @Given("^OES Lite report tab for Entries Count per Member Association per SubEvent subtab and Verify the Sort By dropdown functionality select the WomensS option RepresentingOrgCode dropdown functionality select the ASC option$")
    public static void OESLitereporttabforEntriesCountperMemberAssociationperSubEventsubtabandVerifytheSortBydropdownfunctionalityselecttheWomensSoptionRepresentingOrgCodedropdownfunctionalityselecttheASCoption()throws Exception{

    }

    @Given("^OES Lite report tab for Entries Count per Member Association per SubEvent subtab and Verify the Sort By dropdown functionality select the WomensS option and Order By dropdown functionality select the DESC option$")
    public static void OESLitereporttabforEntriesCountperMemberAssociationperSubEventsubtabandVerifytheSortBydropdownfunctionalityselecttheWomensSoptionandOrderBydropdownfunctionalityselecttheDESCoption()throws Exception{

    }

    @Given("^OES Lite report tab for Entries Count per Member Association per SubEvent subtab and Verify the Search field functionality given valid data$")
    public static void OESLitereporttabforEntriesCountperMemberAssociationperSubEventsubtabandVerifytheSearchfieldfunctionalitygivenvaliddata()throws Exception{

    }

    @Given("^OES Lite report tab for Entries Count per Member Association per SubEvent subtab and Verify the Search field functionality given invalid data$")
    public static void OESLitereporttabforEntriesCountperMemberAssociationperSubEventsubtabandVerifytheSearchfieldfunctionalitygiveninvaliddata()throws Exception{

    }

    @Given("^OES Lite report tab for Entries Count per Member Association per SubEvent subtab and Verify the Visibility column field selection dropdown options$")
    public static void OESLitereporttabforEntriesCountperMemberAssociationperSubEventsubtabandVerifytheVisibilitycolumnfieldselectiondropdownoptions()throws Exception{

    }

    @Given("^OES Lite report tab for Entries Count per Member Association per SubEvent subtab and Verify the Visibility column field selection dropdown using Organization option$")
    public static void OESLitereporttabforEntriesCountperMemberAssociationperSubEventsubtabandVerifytheVisibilitycolumnfieldselectiondropdownusingOrganizationoption()throws Exception{

    }

    @Given("^OES Lite report tab for Entries Count per Member Association per SubEvent subtab and Verify the Visibility column field selection dropdown using OrgCode option$")
    public static void OESLitereporttabforEntriesCountperMemberAssociationperSubEventsubtabandVerifytheVisibilitycolumnfieldselectiondropdownusingOrgCodeoption()throws Exception{

    }

    @Given("^OES Lite report tab for Entries Count per Member Association per SubEvent subtab and Verify the Visibility column field selection dropdown using RepresentingOrgCode option$")
    public static void OESLitereporttabforEntriesCountperMemberAssociationperSubEventsubtabandVerifytheVisibilitycolumnfieldselectiondropdownusingRepresentingOrgCodeoption()throws Exception{

    }

    @Given("^OES Lite report tab for Entries Count per Member Association per SubEvent subtab and Verify the Visibility column field selection dropdown using WomensS option$")
    public static void OESLitereporttabforEntriesCountperMemberAssociationperSubEventsubtabandVerifytheVisibilitycolumnfieldselectiondropdownusingWomensSoption()throws Exception{

    }

    @Given("^OES Lite report tab for Entries Count per Member Association per SubEvent subtab and Verify the Visibility column field selection dropdown using all option$")
    public static void OESLitereporttabforEntriesCountperMemberAssociationperSubEventsubtabandVerifytheVisibilitycolumnfieldselectiondropdownusingalloption()throws Exception{

    }

    @Given("^OES Lite report tab for Entries Count per Member Association per SubEvent subtab and Verify the export the excel$")
    public static void OESLitereporttabforEntriesCountperMemberAssociationperSubEventsubtabandVerifytheexporttheexcel()throws Exception{

    }

    @Given("^OES Lite report tab for Entries Count per Member Association per SubEvent subtab and Verify the export the PDF$")
    public static void OESLitereporttabforEntriesCountperMemberAssociationperSubEventsubtabandVerifytheexportthePDF()throws Exception{

    }

    @Given("^OES Lite reports tab for Player Entries by SubEvent subtab$")
    public static void OESLitereportstabforPlayerEntriesbySubEventsubtab()throws Exception{

    }

    @Given("^OES Lite report tab for Player Entries by SubEvent subtab options$")
    public static void OESLitereporttabforPlayerEntriesbySubEventsubtaboptions()throws Exception{

    }

    @Given("^OES Lite report tab for Player Entries by SubEvent subtab and Verify the Name dropdown options$")
    public static void OESLitereporttabforPlayerEntriesbySubEventsubtabandVerifytheNamedropdownoptions()throws Exception{

    }

    @Given("^OES Lite report tab for Player Entries by SubEvent subtab and Verify the Name dropdown functionality$")
    public static void OESLitereporttabforPlayerEntriesbySubEventsubtabandVerifytheNamedropdownfunctionality()throws Exception{

    }

    @Given("^OES Lite report tab for Player Entries by SubEvent subtab and Verify the Organization dropdown options$")
    public static void OESLitereporttabforPlayerEntriesbySubEventsubtabandVerifytheOrganizationdropdownoptions()throws Exception{

    }

    @Given("^OES Lite report tab for Player Entries by SubEvent subtab and Verify the Organization dropdown functionality$")
    public static void OESLitereporttabforPlayerEntriesbySubEventsubtabandVerifytheOrganizationdropdownfunctionality()throws Exception{

    }

    @Given("^OES Lite report tab for Player Entries by SubEvent subtab and Verify the Singles dropdown options$")
    public static void OESLitereporttabforPlayerEntriesbySubEventsubtabandVerifytheSinglesdropdownoptions()throws Exception{

    }

    @Given("^OES Lite report tab for Player Entries by SubEvent subtab and Verify the Singles dropdown functionality$")
    public static void OESLitereporttabforPlayerEntriesbySubEventsubtabandVerifytheSinglesdropdownfunctionality()throws Exception{

    }

    @Given("^OES Lite report tab for Player Entries by SubEvent subtab and Verify the Doubles dropdown options$")
    public static void OESLitereporttabforPlayerEntriesbySubEventsubtabandVerifytheDoublesdropdownoptions()throws Exception{

    }

    @Given("^OES Lite report tab for Player Entries by SubEvent subtab and Verify the Doubles dropdown functionality$")
    public static void OESLitereporttabforPlayerEntriesbySubEventsubtabandVerifytheDoublesdropdownfunctionality()throws Exception{

    }

    @Given("^OES Lite report tab for Player Entries by SubEvent subtab and Verify the Mixed Doubles dropdown options$")
    public static void OESLitereporttabforPlayerEntriesbySubEventsubtabandVerifytheMixedDoublesdropdownoptions()throws Exception{

    }

    @Given("^OES Lite report tab for Player Entries by SubEvent subtab and Verify the Mixed Doubles dropdown functionality$")
    public static void OESLitereporttabforPlayerEntriesbySubEventsubtabandVerifytheMixedDoublesdropdownfunctionality()throws Exception{

    }

    @Given("^OES Lite report tab for Player Entries by SubEvent subtab and Verify the Teams dropdown options$")
    public static void OESLitereporttabforPlayerEntriesbySubEventsubtabandVerifytheTeamsdropdownoptions()throws Exception{

    }

    @Given("^OES Lite report tab for Player Entries by SubEvent subtab and Verify the Teams dropdown functionality$")
    public static void OESLitereporttabforPlayerEntriesbySubEventsubtabandVerifytheTeamsdropdownfunctionality()throws Exception{

    }

    @Given("^OES Lite report tab for Player Entries by SubEvent subtab and Verify the Clear the filter button functionality$")
    public static void OESLitereporttabforPlayerEntriesbySubEventsubtabandVerifytheClearthefilterbuttonfunctionality()throws Exception{

    }

    @Given("^OES Lite report tab for Player Entries by SubEvent subtab and Verify the Sort By dropdown functionality options$")
    public static void OESLitereporttabforPlayerEntriesbySubEventsubtabandVerifytheSortBydropdownfunctionalityoptions()throws Exception{

    }

    @Given("^OES Lite report tab for Player Entries by SubEvent subtab and Verify the order By dropdown functionality$")
    public static void OESLitereporttabforPlayerEntriesbySubEventsubtabandVerifytheorderBydropdownfunctionality()throws Exception{

    }

    @Given("^OES Lite report tab for Player Entries by SubEvent subtab and Verify the Sort By dropdown functionality select the Name option and Order By dropdown functionality select the ASC option$")
    public static void OESLitereporttabforPlayerEntriesbySubEventsubtabandVerifytheSortBydropdownfunctionalityselecttheNameoptionandOrderBydropdownfunctionalityselecttheASCoption()throws Exception{

    }

    @Given("^OES Lite report tab for Player Entries by SubEvent subtab and Verify the Sort By dropdown functionality select the Name option and Order By dropdown functionality select the DESC option$")
    public static void OESLitereporttabforPlayerEntriesbySubEventsubtabandVerifytheSortBydropdownfunctionalityselecttheNameoptionandOrderBydropdownfunctionalityselecttheDESCoption()throws Exception{

    }

    @Given("^OES Lite report tab for Player Entries by SubEvent subtab and Verify the Sort By dropdown functionality select the Organization option and Order By dropdown functionality select the ASC option$")
    public static void OESLitereporttabforPlayerEntriesbySubEventsubtabandVerifytheSortBydropdownfunctionalityselecttheOrganizationoptionandOrderBydropdownfunctionalityselecttheASCoption()throws Exception{

    }

    @Given("^OES Lite report tab for Player Entries by SubEvent subtab and Verify the Sort By dropdown functionality select the Organization option and Order By dropdown functionality select the DESC option$")
    public static void OESLitereporttabforPlayerEntriesbySubEventsubtabandVerifytheSortBydropdownfunctionalityselecttheOrganizationoptionandOrderBydropdownfunctionalityselecttheDESCoption()throws Exception{

    }

    @Given("^OES Lite report tab for Player Entries by SubEvent subtab and Verify the Sort By dropdown functionality select the OrgCode option and Order By dropdown functionality select the ASC option$")
    public static void OESLitereporttabforPlayerEntriesbySubEventsubtabandVerifytheSortBydropdownfunctionalityselecttheOrgCodeoptionandOrderBydropdownfunctionalityselecttheASCoption()throws Exception{

    }

    @Given("^OES Lite report tab for Player Entries by SubEvent subtab and Verify the Sort By dropdown functionality select the OrgCode option and Order By dropdown functionality select the DESC option$")
    public static void OESLitereporttabforPlayerEntriesbySubEventsubtabandVerifytheSortBydropdownfunctionalityselecttheOrgCodeoptionandOrderBydropdownfunctionalityselecttheDESCoption()throws Exception{

    }

    @Given("^OES Lite report tab for Player Entries by SubEvent subtab and Verify the Sort By dropdown functionality select the Representing OrgCode option and Order By dropdown functionality select the ASC option$")
    public static void OESLitereporttabforPlayerEntriesbySubEventsubtabandVerifytheSortBydropdownfunctionalityselecttheRepresentingOrgCodeoptionandOrderBydropdownfunctionalityselecttheASCoption()throws Exception{

    }

    @Given("^OES Lite report tab for Player Entries by SubEvent subtab and Verify the Sort By dropdown functionality select the Representing OrgCode option and Order By dropdown functionality select the DESC option$")
    public static void OESLitereporttabforPlayerEntriesbySubEventsubtabandVerifytheSortBydropdownfunctionalityselecttheRepresentingOrgCodeoptionandOrderBydropdownfunctionalityselecttheDESCoption()throws Exception{

    }

    @Given("^OES Lite report tab for Player Entries by SubEvent subtab and Verify the Sort By dropdown functionality select the Singles option and Order By dropdown$")
    public static void OESLitereporttabforPlayerEntriesbySubEventsubtabandVerifytheSortBydropdownfunctionalityselecttheSinglesoptionandOrderBydropdown()throws Exception{

    }

    @Given("^OES Lite report tab for Player Entries by SubEvent subtab and Verify the Sort By dropdown functionality select the Singles option and Order By dropdown functionality select the DESC option$")
    public static void OESLitereporttabforPlayerEntriesbySubEventsubtabandVerifytheSortBydropdownfunctionalityselecttheSinglesoptionandOrderBydropdownfunctionalityselecttheDESCoption()throws Exception{

    }

    @Given("^OES Lite report tab for Player Entries by SubEvent subtab and Verify the Sort By dropdown functionality select the Doubles option and Order By dropdown functionality select the ASC option$")
    public static void OESLitereporttabforPlayerEntriesbySubEventsubtabandVerifytheSortBydropdownfunctionalityselecttheDoublesoptionandOrderBydropdownfunctionalityselecttheASCoption()throws Exception{

    }

    @Given("^OES Lite report tab for Player Entries by SubEvent subtab and Verify the Sort By dropdown functionality select the Doubles option and Order By dropdown functionality select the DESC option$")
    public static void OESLitereporttabforPlayerEntriesbySubEventsubtabandVerifytheSortBydropdownfunctionalityselecttheDoublesoptionandOrderBydropdownfunctionalityselecttheDESCoption()throws Exception{

    }

    @Given("^OES Lite report tab for Player Entries by SubEvent subtab and Verify the Sort By dropdown functionality select the Mixed Doubles option and Order By dropdown functionality select the ASC option$")
    public static void OESLitereporttabforPlayerEntriesbySubEventsubtabandVerifytheSortBydropdownfunctionalityselecttheMixedDoublesoptionandOrderBydropdownfunctionalityselecttheASCoption()throws Exception{

    }

    @Given("^OES Lite report tab for Player Entries by SubEvent subtab and Verify the Sort By dropdown functionality select the Mixed Doubles option and Order By dropdown functionality select the DESC option$")
    public static void OESLitereporttabforPlayerEntriesbySubEventsubtabandVerifytheSortBydropdownfunctionalityselecttheMixedDoublesoptionandOrderBydropdownfunctionalityselecttheDESCoption()throws Exception{

    }

    @Given("^OES Lite report tab for Player Entries by SubEvent subtab and Verify the Sort By dropdown functionality select the Teams option and Order By dropdown functionality select the ASC option$")
    public static void OESLitereporttabforPlayerEntriesbySubEventsubtabandVerifytheSortBydropdownfunctionalityselecttheTeamsoptionandOrderBydropdownfunctionalityselecttheASCoption()throws Exception{

    }

    @Given("^OES Lite report tab for Player Entries by SubEvent subtab and Verify the Sort By dropdown functionality select the Teams option and Order By dropdown functionality select the DESC option$")
    public static void OESLitereporttabforPlayerEntriesbySubEventsubtabandVerifytheSortBydropdownfunctionalityselecttheTeamsoptionandOrderBydropdownfunctionalityselecttheDESCoption()throws Exception{

    }

    @Given("^OES Lite report tab for Player Entries by SubEvent subtab and Verify the Search field functionality given valid data$")
    public static void OESLitereporttabforPlayerEntriesbySubEventsubtabandVerifytheSearchfieldfunctionalitygivenvaliddata()throws Exception{

    }

    @Given("^OES Lite report tab for Player Entries by SubEvent subtab and Verify the Search field functionality given invalid data$")
    public static void OESLitereporttabforPlayerEntriesbySubEventsubtabandVerifytheSearchfieldfunctionalitygiveninvaliddata()throws Exception{

    }

    @Given("^OES Lite report tab for Player Entries by SubEvent subtab and Verify the Visibility column field selection dropdown options$")
    public static void OESLitereporttabforPlayerEntriesbySubEventsubtabandVerifytheVisibilitycolumnfieldselectiondropdownoptions()throws Exception{

    }
























}
