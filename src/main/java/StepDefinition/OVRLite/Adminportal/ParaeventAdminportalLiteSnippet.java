package StepDefinition.OVRLite.Adminportal;

import StepDefinition.AdminPortal.EventCreationSnippet;
import base.Commonmethods;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static PreDefinedstepdefinitions.Predefinedstepdefinitions.*;
import static PreDefinedstepdefinitions.Predefinedstepdefinitions.click_on_element;
import static base.DriverInitialisation.driver;

public class ParaeventAdminportalLiteSnippet {

    public static String paraplayer_eventid= EventCreationSnippet.eventid;
    public static WebDriverWait wait1 = new WebDriverWait(driver, 60);
    public static Commonmethods base = new Commonmethods(driver, wait1);

    @Given("^enable Is Para Event toggle button in the Core step page Event creation process$")
    public static void enableIsParaEventtogglebuttonintheCoresteppageEventcreationprocess() throws Exception {

        click_on_element("AdminPortalElements/EventcreationElements/tab_event");
        base.wait(4);
        clearthevalueintotheelement("AdminPortalElements/EventcreationElements/text_event_searchfield");
        enterthevalueintotheelement(paraplayer_eventid,"AdminPortalElements/EventcreationElements/text_event_searchfield");
        click_on_element("AdminPortalElements/EventcreationElements/button_event_searchfieldicon");
        base.wait(3);
        click_on_element("AdminPortalElements/EventcreationElements/button_event_tablesearchedeventedit");
        base.wait(3);
        clickonenableordisablebutton("Enable","AdminPortalElements/EventcreationElements/toggle_event_creation_core_IsParaEvent");
        base.wait(2);
        click_on_element("AdminPortalElements/EventcreationElements/button_event_update");
        base.wait(3);
        element_visiability("AdminPortalElements/EventcreationElements/text1_event_eventdeails");

    }

    @Given("^enable Is Para Event toggle button in the Core step page and Verify Hospitality tab Event creation process$")
    public static void enableIsParaEventtogglebuttonintheCoresteppageandVerifyHospitalitytabEventcreationprocess() throws Exception {

        click_on_element("AdminPortalElements/EventcreationElements/tab_event");
        base.wait(4);
        clearthevalueintotheelement("AdminPortalElements/EventcreationElements/text_event_searchfield");
        enterthevalueintotheelement(paraplayer_eventid,"AdminPortalElements/EventcreationElements/text_event_searchfield");
        click_on_element("AdminPortalElements/EventcreationElements/button_event_searchfieldicon");
        base.wait(3);
        click_on_element("AdminPortalElements/EventcreationElements/button_event_tablesearchedeventedit");
        base.wait(3);
        clickonenableordisablebutton("Enable","AdminPortalElements/EventcreationElements/toggle_event_creation_core_IsParaEvent");
        base.wait(2);
        getthefield("AdminPortalElements/EventcreationElements/tab_event_creation_Hospitality");
        base.scrollToView(webElement);
        base.wait(2);
        click_on_element("AdminPortalElements/EventcreationElements/tab_event_creation_Hospitality");
        base.wait(1);
        click_on_element("AdminPortalElements/EventcreationElements/button_event_creation_Hospitality_AddNew");
        base.wait(1);
        element_visiability("AdminPortalElements/EventcreationElements/button_event_creation_Hospitality_AddHospitalityInformation_ParaAccessibilityRoomType");



    }

    @Given("^Para Accessibility Room Type dropdown in the Hospitality tab Event creation process$")
    public static void ParaAccessibilityRoomTypedropdownintheHospitalitytabEventcreationprocess() throws Exception {

        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_admin_para_ParaRoomType");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_ParaRoomType_createParaRoomType");
        String type="testtype";
        type=type+base.randomvalue(100);
        enterthevalueintotheelement(type,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaRoomType_createParaRoomType_Type");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");


        click_on_element("AdminPortalElements/EventcreationElements/tab_event");
        base.wait(4);
        clearthevalueintotheelement("AdminPortalElements/EventcreationElements/text_event_searchfield");
        enterthevalueintotheelement(paraplayer_eventid,"AdminPortalElements/EventcreationElements/text_event_searchfield");
        click_on_element("AdminPortalElements/EventcreationElements/button_event_searchfieldicon");
        base.wait(3);
        click_on_element("AdminPortalElements/EventcreationElements/button_event_tablesearchedeventedit");
        base.wait(3);
        clickonenableordisablebutton("Enable","AdminPortalElements/EventcreationElements/toggle_event_creation_core_IsParaEvent");
        base.wait(2);

        getthefield("AdminPortalElements/EventcreationElements/tab_event_creation_Hospitality");
        base.scrollToView(webElement);
        base.wait(2);

        click_on_element("AdminPortalElements/EventcreationElements/tab_event_creation_Hospitality");
        base.wait(1);
        click_on_element("AdminPortalElements/EventcreationElements/button_event_creation_Hospitality_AddNew");
        base.wait(1);
        click_on_element("AdminPortalElements/EventcreationElements/button_event_creation_Hospitality_AddHospitalityInformation_ParaAccessibilityRoomType");

        checklistvalues(type,"AdminPortalElements/EventcreationElements/text_event_creation_Hospitality_AddHospitalityInformation_ParaAccessibilityRoomTypelist");
        click_on_element("AdminPortalElements/EventcreationElements/button_event_creation_common_popupwindow_Cancel");



        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_admin_para_ParaRoomType");

        driver.switchTo().alert().accept();
        base.wait(2);

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(type,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(type,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaRoomType");

        Adminportaloptionontable("Delete","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaRoomType");
        base.wait(2);
        driver.switchTo().alert().accept();
        base.wait(2);

    }

    @Given("^enable Is Para Event toggle button in the Core step page and verify Review tab Event creation process$")
    public static void enableIsParaEventtogglebuttonintheCoresteppageandverifyReviewtabEventcreationprocess() throws Exception {

        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_admin_para_ParaRoomType");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_ParaRoomType_createParaRoomType");
        String type="testtype";
        type=type+base.randomvalue(100);
        enterthevalueintotheelement(type,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaRoomType_createParaRoomType_Type");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");


        click_on_element("AdminPortalElements/EventcreationElements/tab_event");
        base.wait(4);
        clearthevalueintotheelement("AdminPortalElements/EventcreationElements/text_event_searchfield");
        enterthevalueintotheelement(paraplayer_eventid,"AdminPortalElements/EventcreationElements/text_event_searchfield");
        click_on_element("AdminPortalElements/EventcreationElements/button_event_searchfieldicon");
        base.wait(3);
        click_on_element("AdminPortalElements/EventcreationElements/button_event_tablesearchedeventedit");
        base.wait(3);
        clickonenableordisablebutton("Enable","AdminPortalElements/EventcreationElements/toggle_event_creation_core_IsParaEvent");
        base.wait(2);
        //click_on_element("AdminPortalElements/EventcreationElements/tab_event_creation_Hospitality");
        getthefield("AdminPortalElements/EventcreationElements/tab_event_creation_Hospitality");
        base.scrollToView(webElement);
        click_on_element("AdminPortalElements/EventcreationElements/tab_event_creation_Hospitality");
        base.wait(1);
        click_on_element("AdminPortalElements/EventcreationElements/button_event_creation_Hospitality_AddNew");
        base.wait(1);
       // click_on_element("AdminPortalElements/EventcreationElements/button_event_creation_Hospitality_AddHospitalityInformation_ParaAccessibilityRoomType");

        click_on_element("AdminPortalElements/EventcreationElements/button_event_creation_Hospitality_AddHospitalityInformation_Profile");
        click_on_element("AdminPortalElements/EventcreationElements/checkbox_event_creation_Hospitality_AddHospitalityInformation_ProfileCoach");
        //click_on_element("AdminPortalElements/EventcreationElements/checkbox_event_creation_Hospitality_AddHospitalityInformation_ProfileUparrowicon");

        click_on_element("AdminPortalElements/EventcreationElements/button_event_creation_Hospitality_AddHospitalityInformation_Accommodation");
        enterthevalueintotheelement("Grand Chola 5* (India)","AdminPortalElements/EventcreationElements/bartext_event_creation_Hospitality_AddHospitalityInformation_Accommodationsearch");
        Jclick_on_element("AdminPortalElements/EventcreationElements/checkbox_event_creation_Hospitality_AddHospitalityInformation_Accommodationsearchresult");

        click_on_element("AdminPortalElements/EventcreationElements/button_event_creation_Hospitality_AddHospitalityInformation_RoomType");
        enterthevalueintotheelement("Single","AdminPortalElements/EventcreationElements/bartext_event_creation_Hospitality_AddHospitalityInformation_RoomTypesearch");
        Jclick_on_element("AdminPortalElements/EventcreationElements/checkbox_event_creation_Hospitality_AddHospitalityInformation_RoomTypesearchresult");

        click_on_element("AdminPortalElements/EventcreationElements/button_event_creation_Hospitality_AddHospitalityInformation_ParaAccessibilityRoomType");
        enterthevalueintotheelement(type,"AdminPortalElements/EventcreationElements/text_event_creation_Hospitality_AddHospitalityInformation_ParaAccessibilityRoomTypesearchfield");
        Jclick_on_element("AdminPortalElements/EventcreationElements/checkbox_event_creation_Hospitality_AddHospitalityInformation_ParaAccessibilityRoomType");


        click_on_element("AdminPortalElements/EventcreationElements/button_event_creation_common_popupwindow_proceed");

       // click_on_element("AdminPortalElements/EventcreationElements/button_event_update");
        //base.wait(3);
        //element_visiability("AdminPortalElements/EventcreationElements/text1_event_eventdeails");

        getthefield("AdminPortalElements/EventcreationElements/tab_event_creation_Review");
        base.scrollToView(webElement);
        click_on_element("AdminPortalElements/EventcreationElements/tab_event_creation_Review");

        getthefield("AdminPortalElements/EventcreationElements/text_event_creation_review_ParaAccessibilityRoomType");
        base.scrollToView(webElement);
        getthefield("AdminPortalElements/EventcreationElements/table_event_creation_review_Hospitality");
        List<WebElement> rowsNumber=webElement.findElements(By.tagName("tr"));
        int rowcount=rowsNumber.size();
        System.out.println("row_count="+rowcount);

        String value=driver.findElement(By.xpath("(//td[@data-label='Para Accessibility Room Type'])["+rowcount+"]//app-fetcher-value//span")).getText();

        Verifytheactualandexceptedvalueswithoutcasesensitivewithstringvalue(type,value);
        //Verifytheactualandexceptedvalueswithoutcasesensitive(type,"AdminPortalElements/EventcreationElements/text_event_creation_review_ParaAccessibilityRoomType");


        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_admin_para_ParaRoomType");
        driver.switchTo().alert().accept();

        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_admin_para_ParaRoomType");
        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(type,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(type,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaRoomType");

        Adminportaloptionontable("Delete","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaRoomType");
        base.wait(2);
        driver.switchTo().alert().accept();
        base.wait(2);


    }

    @Given("^enable Is Para Event toggle button in the Core step page and verify create the Event$")
    public static void enableIsParaEventtogglebuttonintheCoresteppageandverifycreatetheEvent() throws Exception {

        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_admin_para_ParaRoomType");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_ParaRoomType_createParaRoomType");
        String type="testtype";
        type=type+base.randomvalue(100);
        enterthevalueintotheelement(type,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaRoomType_createParaRoomType_Type");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");


        click_on_element("AdminPortalElements/EventcreationElements/tab_event");
        base.wait(4);
        clearthevalueintotheelement("AdminPortalElements/EventcreationElements/text_event_searchfield");
        enterthevalueintotheelement(paraplayer_eventid,"AdminPortalElements/EventcreationElements/text_event_searchfield");
        click_on_element("AdminPortalElements/EventcreationElements/button_event_searchfieldicon");
        base.wait(3);
        click_on_element("AdminPortalElements/EventcreationElements/button_event_tablesearchedeventedit");
        base.wait(3);
        clickonenableordisablebutton("Enable","AdminPortalElements/EventcreationElements/toggle_event_creation_core_IsParaEvent");
        base.wait(2);
        //click_on_element("AdminPortalElements/EventcreationElements/tab_event_creation_Hospitality");
        getthefield("AdminPortalElements/EventcreationElements/tab_event_creation_Hospitality");
        base.scrollToView(webElement);
        click_on_element("AdminPortalElements/EventcreationElements/tab_event_creation_Hospitality");
        base.wait(1);
        click_on_element("AdminPortalElements/EventcreationElements/button_event_creation_Hospitality_AddNew");
        base.wait(1);
        // click_on_element("AdminPortalElements/EventcreationElements/button_event_creation_Hospitality_AddHospitalityInformation_ParaAccessibilityRoomType");

        click_on_element("AdminPortalElements/EventcreationElements/button_event_creation_Hospitality_AddHospitalityInformation_Profile");
        click_on_element("AdminPortalElements/EventcreationElements/checkbox_event_creation_Hospitality_AddHospitalityInformation_ProfileCoach");
        //click_on_element("AdminPortalElements/EventcreationElements/checkbox_event_creation_Hospitality_AddHospitalityInformation_ProfileUparrowicon");

        click_on_element("AdminPortalElements/EventcreationElements/button_event_creation_Hospitality_AddHospitalityInformation_Accommodation");
        enterthevalueintotheelement("Grand Chola 5* (India)","AdminPortalElements/EventcreationElements/bartext_event_creation_Hospitality_AddHospitalityInformation_Accommodationsearch");
        Jclick_on_element("AdminPortalElements/EventcreationElements/checkbox_event_creation_Hospitality_AddHospitalityInformation_Accommodationsearchresult");

        click_on_element("AdminPortalElements/EventcreationElements/button_event_creation_Hospitality_AddHospitalityInformation_RoomType");
        enterthevalueintotheelement("Single","AdminPortalElements/EventcreationElements/bartext_event_creation_Hospitality_AddHospitalityInformation_RoomTypesearch");
        Jclick_on_element("AdminPortalElements/EventcreationElements/checkbox_event_creation_Hospitality_AddHospitalityInformation_RoomTypesearchresult");

        click_on_element("AdminPortalElements/EventcreationElements/button_event_creation_Hospitality_AddHospitalityInformation_ParaAccessibilityRoomType");
        enterthevalueintotheelement(type,"AdminPortalElements/EventcreationElements/text_event_creation_Hospitality_AddHospitalityInformation_ParaAccessibilityRoomTypesearchfield");
        Jclick_on_element("AdminPortalElements/EventcreationElements/checkbox_event_creation_Hospitality_AddHospitalityInformation_ParaAccessibilityRoomType");


        click_on_element("AdminPortalElements/EventcreationElements/button_event_creation_common_popupwindow_proceed");

        click_on_element("AdminPortalElements/EventcreationElements/button_event_update");
        base.wait(3);
        element_visiability("AdminPortalElements/EventcreationElements/text1_event_eventdeails");


        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_admin_para_ParaRoomType");
        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(type,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(type,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaRoomType");

        Adminportaloptionontable("Delete","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaRoomType");
        base.wait(2);
        driver.switchTo().alert().accept();
        base.wait(2);

    }

    @Given("^Edit the Para Accessibility Room Type dropdown values in the Hospitality tab for created event$")
    public static void EdittheParaAccessibilityRoomTypedropdownvaluesintheHospitalitytabforcreatedevent() throws Exception {

        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_admin_para_ParaRoomType");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_ParaRoomType_createParaRoomType");
        String type="testtype";
        type=type+base.randomvalue(100);
        enterthevalueintotheelement(type,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaRoomType_createParaRoomType_Type");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");


        click_on_element("AdminPortalElements/EventcreationElements/tab_event");
        base.wait(4);
        clearthevalueintotheelement("AdminPortalElements/EventcreationElements/text_event_searchfield");
        enterthevalueintotheelement(paraplayer_eventid,"AdminPortalElements/EventcreationElements/text_event_searchfield");
        click_on_element("AdminPortalElements/EventcreationElements/button_event_searchfieldicon");
        base.wait(3);
        click_on_element("AdminPortalElements/EventcreationElements/button_event_tablesearchedeventedit");
        base.wait(3);
        clickonenableordisablebutton("Enable","AdminPortalElements/EventcreationElements/toggle_event_creation_core_IsParaEvent");
        base.wait(2);
        getthefield("AdminPortalElements/EventcreationElements/tab_event_creation_Hospitality");
        base.scrollToView(webElement);
        base.wait(2);
        click_on_element("AdminPortalElements/EventcreationElements/tab_event_creation_Hospitality");
        base.wait(1);
        click_on_element("AdminPortalElements/EventcreationElements/button_event_creation_Hospitality_AddNew");
        base.wait(1);
        click_on_element("AdminPortalElements/EventcreationElements/button_event_creation_Hospitality_AddHospitalityInformation_ParaAccessibilityRoomType");

        checklistvalues(type,"AdminPortalElements/EventcreationElements/text_event_creation_Hospitality_AddHospitalityInformation_ParaAccessibilityRoomTypelist");
        click_on_element("AdminPortalElements/EventcreationElements/button_event_creation_common_popupwindow_Cancel");

        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_admin_para_ParaRoomType");
        driver.switchTo().alert().accept();
        base.wait(2);

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(type,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(type,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaRoomType");

        Adminportaloptionontable("Delete","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaRoomType");
        base.wait(2);
        driver.switchTo().alert().accept();
        base.wait(2);

    }

    @Given("^Edit the Para Accessibility Room Type dropdown values in the Hospitality tab and verify Review tab for created event$")
    public static void EdittheParaAccessibilityRoomTypedropdownvaluesintheHospitalitytabandverifyReviewtabforcreatedevent() throws Exception {

        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_admin_para_ParaRoomType");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_ParaRoomType_createParaRoomType");
        String type="testtype";
        type=type+base.randomvalue(100);
        enterthevalueintotheelement(type,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaRoomType_createParaRoomType_Type");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");


        click_on_element("AdminPortalElements/EventcreationElements/tab_event");
        base.wait(4);
        clearthevalueintotheelement("AdminPortalElements/EventcreationElements/text_event_searchfield");
        enterthevalueintotheelement(paraplayer_eventid,"AdminPortalElements/EventcreationElements/text_event_searchfield");
        click_on_element("AdminPortalElements/EventcreationElements/button_event_searchfieldicon");
        base.wait(3);
        click_on_element("AdminPortalElements/EventcreationElements/button_event_tablesearchedeventedit");
        base.wait(3);
        clickonenableordisablebutton("Enable","AdminPortalElements/EventcreationElements/toggle_event_creation_core_IsParaEvent");
        base.wait(2);
        //click_on_element("AdminPortalElements/EventcreationElements/tab_event_creation_Hospitality");
        getthefield("AdminPortalElements/EventcreationElements/tab_event_creation_Hospitality");
        base.scrollToView(webElement);
        click_on_element("AdminPortalElements/EventcreationElements/tab_event_creation_Hospitality");
        base.wait(1);
        click_on_element("AdminPortalElements/EventcreationElements/button_event_creation_Hospitality_AddNew");
        base.wait(1);
        // click_on_element("AdminPortalElements/EventcreationElements/button_event_creation_Hospitality_AddHospitalityInformation_ParaAccessibilityRoomType");

        click_on_element("AdminPortalElements/EventcreationElements/button_event_creation_Hospitality_AddHospitalityInformation_Profile");
        click_on_element("AdminPortalElements/EventcreationElements/checkbox_event_creation_Hospitality_AddHospitalityInformation_ProfileCoach");
        //click_on_element("AdminPortalElements/EventcreationElements/checkbox_event_creation_Hospitality_AddHospitalityInformation_ProfileUparrowicon");

        click_on_element("AdminPortalElements/EventcreationElements/button_event_creation_Hospitality_AddHospitalityInformation_Accommodation");
        enterthevalueintotheelement("Grand Chola 5* (India)","AdminPortalElements/EventcreationElements/bartext_event_creation_Hospitality_AddHospitalityInformation_Accommodationsearch");
        Jclick_on_element("AdminPortalElements/EventcreationElements/checkbox_event_creation_Hospitality_AddHospitalityInformation_Accommodationsearchresult");

        click_on_element("AdminPortalElements/EventcreationElements/button_event_creation_Hospitality_AddHospitalityInformation_RoomType");
        enterthevalueintotheelement("Single","AdminPortalElements/EventcreationElements/bartext_event_creation_Hospitality_AddHospitalityInformation_RoomTypesearch");
        Jclick_on_element("AdminPortalElements/EventcreationElements/checkbox_event_creation_Hospitality_AddHospitalityInformation_RoomTypesearchresult");

        click_on_element("AdminPortalElements/EventcreationElements/button_event_creation_Hospitality_AddHospitalityInformation_ParaAccessibilityRoomType");
        enterthevalueintotheelement(type,"AdminPortalElements/EventcreationElements/text_event_creation_Hospitality_AddHospitalityInformation_ParaAccessibilityRoomTypesearchfield");
        Jclick_on_element("AdminPortalElements/EventcreationElements/checkbox_event_creation_Hospitality_AddHospitalityInformation_ParaAccessibilityRoomType");


        click_on_element("AdminPortalElements/EventcreationElements/button_event_creation_common_popupwindow_proceed");

        // click_on_element("AdminPortalElements/EventcreationElements/button_event_update");
        //base.wait(3);
        //element_visiability("AdminPortalElements/EventcreationElements/text1_event_eventdeails");

        getthefield("AdminPortalElements/EventcreationElements/tab_event_creation_Review");
        base.scrollToView(webElement);
        click_on_element("AdminPortalElements/EventcreationElements/tab_event_creation_Review");

        getthefield("AdminPortalElements/EventcreationElements/text_event_creation_review_ParaAccessibilityRoomType");
        base.scrollToView(webElement);

        getthefield("AdminPortalElements/EventcreationElements/table_event_creation_review_Hospitality");
        List<WebElement> rowsNumber=webElement.findElements(By.tagName("tr"));
        int rowcount=rowsNumber.size();
        System.out.println("row_count="+rowcount);

        String value=driver.findElement(By.xpath("(//td[@data-label='Para Accessibility Room Type'])["+rowcount+"]//app-fetcher-value//span")).getText();

        Verifytheactualandexceptedvalueswithoutcasesensitivewithstringvalue(type,value);
        //Verifytheactualandexceptedvalueswithoutcasesensitive(type,"AdminPortalElements/EventcreationElements/text_event_creation_review_ParaAccessibilityRoomType");


        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_admin_para_ParaRoomType");
        driver.switchTo().alert().accept();
        base.wait(2);

        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_admin_para_ParaRoomType");
        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(type,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(type,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaRoomType");

        Adminportaloptionontable("Delete","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaRoomType");
        base.wait(2);
        driver.switchTo().alert().accept();
        base.wait(2);

    }

    @Given("^Edit the Para Accessibility Room Type dropdown values in the Hospitality tab and verify update tab for created event$")
    public static void EdittheParaAccessibilityRoomTypedropdownvaluesintheHospitalitytabandverifyupdatetabforcreatedevent() throws Exception {

        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_admin_para_ParaRoomType");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_ParaRoomType_createParaRoomType");
        String type="testtype";
        type=type+base.randomvalue(100);
        enterthevalueintotheelement(type,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaRoomType_createParaRoomType_Type");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");


        click_on_element("AdminPortalElements/EventcreationElements/tab_event");
        base.wait(4);
        clearthevalueintotheelement("AdminPortalElements/EventcreationElements/text_event_searchfield");
        enterthevalueintotheelement(paraplayer_eventid,"AdminPortalElements/EventcreationElements/text_event_searchfield");
        click_on_element("AdminPortalElements/EventcreationElements/button_event_searchfieldicon");
        base.wait(3);
        click_on_element("AdminPortalElements/EventcreationElements/button_event_tablesearchedeventedit");
        base.wait(3);
        clickonenableordisablebutton("Enable","AdminPortalElements/EventcreationElements/toggle_event_creation_core_IsParaEvent");
        base.wait(2);
        //click_on_element("AdminPortalElements/EventcreationElements/tab_event_creation_Hospitality");
        getthefield("AdminPortalElements/EventcreationElements/tab_event_creation_Hospitality");
        base.scrollToView(webElement);
        click_on_element("AdminPortalElements/EventcreationElements/tab_event_creation_Hospitality");
        base.wait(1);
        click_on_element("AdminPortalElements/EventcreationElements/button_event_creation_Hospitality_AddNew");
        base.wait(1);
        // click_on_element("AdminPortalElements/EventcreationElements/button_event_creation_Hospitality_AddHospitalityInformation_ParaAccessibilityRoomType");

        click_on_element("AdminPortalElements/EventcreationElements/button_event_creation_Hospitality_AddHospitalityInformation_Profile");
        click_on_element("AdminPortalElements/EventcreationElements/checkbox_event_creation_Hospitality_AddHospitalityInformation_ProfileCoach");
        //click_on_element("AdminPortalElements/EventcreationElements/checkbox_event_creation_Hospitality_AddHospitalityInformation_ProfileUparrowicon");

        click_on_element("AdminPortalElements/EventcreationElements/button_event_creation_Hospitality_AddHospitalityInformation_Accommodation");
        enterthevalueintotheelement("Grand Chola 5* (India)","AdminPortalElements/EventcreationElements/bartext_event_creation_Hospitality_AddHospitalityInformation_Accommodationsearch");
        Jclick_on_element("AdminPortalElements/EventcreationElements/checkbox_event_creation_Hospitality_AddHospitalityInformation_Accommodationsearchresult");

        click_on_element("AdminPortalElements/EventcreationElements/button_event_creation_Hospitality_AddHospitalityInformation_RoomType");
        enterthevalueintotheelement("Single","AdminPortalElements/EventcreationElements/bartext_event_creation_Hospitality_AddHospitalityInformation_RoomTypesearch");
        Jclick_on_element("AdminPortalElements/EventcreationElements/checkbox_event_creation_Hospitality_AddHospitalityInformation_RoomTypesearchresult");

        click_on_element("AdminPortalElements/EventcreationElements/button_event_creation_Hospitality_AddHospitalityInformation_ParaAccessibilityRoomType");
        enterthevalueintotheelement(type,"AdminPortalElements/EventcreationElements/text_event_creation_Hospitality_AddHospitalityInformation_ParaAccessibilityRoomTypesearchfield");
        Jclick_on_element("AdminPortalElements/EventcreationElements/checkbox_event_creation_Hospitality_AddHospitalityInformation_ParaAccessibilityRoomType");


        click_on_element("AdminPortalElements/EventcreationElements/button_event_creation_common_popupwindow_proceed");

        click_on_element("AdminPortalElements/EventcreationElements/button_event_update");
        base.wait(3);
        element_visiability("AdminPortalElements/EventcreationElements/text1_event_eventdeails");


        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_admin_para_ParaRoomType");
        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(type,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(type,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaRoomType");

        Adminportaloptionontable("Delete","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaRoomType");
        base.wait(2);
        driver.switchTo().alert().accept();
        base.wait(2);

    }




}
