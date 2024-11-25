package StepDefinition.OVRLite.Adminportal;

import io.cucumber.java.en.Given;

import static PreDefinedstepdefinitions.Predefinedstepdefinitions.*;
import static PreDefinedstepdefinitions.Predefinedstepdefinitions.click_on_element;


public class AdminportalLiteSnippet {

    @Given("^To Verify the Para Mobility Code option page$")
    public static void To_Verify_the_Para_Mobility_Code_option_page() throws Exception {

        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_admin_para_ParaMobilityCode");
        element_visiability("AdminPortalElements/Admin_para_page_Elements/button_admin_para_ParaMobilityCode_createParaMobilityCode");
        element_visiability("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        element_visiability("AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaMobilityCode");


    }

    @Given("^To Verify the Create Para Mobility Code button in the Para Mobility Code option page$")
    public static void To_Verify_the_Create_Para_Mobility_Code_button_in_the_Para_Mobility_Code_option_page() throws Exception {

        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_admin_para_ParaMobilityCode");
        Jclick_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_ParaMobilityCode_createParaMobilityCode");

        element_visiability("AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaMobilityCode_createParaMobilityCode_Name");
        element_visiability("AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaMobilityCode_createParaMobilityCode_Code");
        element_visiability("AdminPortalElements/Admin_para_page_Elements/toggle_admin_para_ParaMobilityCode_createParaMobilityCode_Active");
        element_visiability("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");
        element_visiability("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Cancel");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Cancel");



    }

    @Given("^To Verify the Create Para Mobility Code using positive values$")
    public static void To_Verify_the_Create_Para_Mobility_Code_using_positive_values() throws Exception {

        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_admin_para_ParaMobilityCode");
        Jclick_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_ParaMobilityCode_createParaMobilityCode");
        String name="Test_name_active";
        String code="Test_code_active";
        enterthevalueintotheelement(name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaMobilityCode_createParaMobilityCode_Name");
        enterthevalueintotheelement(code,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaMobilityCode_createParaMobilityCode_Code");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");
        AdminportalSearchthevalueintothetable(name,"table_admin_para_ParaMobilityCode");
        AdminportalSearchthevalueintothetable(code,"table_admin_para_ParaMobilityCode");

    }

    @Given("^Create Para Mobility Code without enter the name fields$")
    public static void CreateParaMobilityCodewithoutenterthenamefields() throws Exception {

        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_admin_para_ParaMobilityCode");
        Jclick_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_ParaMobilityCode_createParaMobilityCode");
        enterthevalueintotheelement("Testcode","AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaMobilityCode_createParaMobilityCode_Code");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");
        Verifytheactualandexceptedvalues("MANDATORY FIELDS REQUIRED\n"+"\n" +"Name cannot be empty","AdminPortalElements/Admin_login_page_Elements/text_Admin_login_error_alert");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Cancel");


    }

    @Given("^Create Para Mobility Code without enter the code fields$")
    public static void CreateParaMobilityCodewithoutenterthecodefields() throws Exception {

        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_admin_para_ParaMobilityCode");
        Jclick_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_ParaMobilityCode_createParaMobilityCode");
        enterthevalueintotheelement("Testname","AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaMobilityCode_createParaMobilityCode_Name");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");
        Verifytheactualandexceptedvalues("MANDATORY FIELDS REQUIRED\n"+"\n" +"Code cannot be empty","AdminPortalElements/Admin_login_page_Elements/text_Admin_login_error_alert");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Cancel");

    }

    @Given("^Create Para Mobility Code disable Action toggle$")
    public static void CreateParaMobilityCodedisableActiontoggle() throws Exception {

        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_admin_para_ParaMobilityCode");
        Jclick_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_ParaMobilityCode_createParaMobilityCode");
        String name="Test_name_deactive";
        String code="Test_code_deactive";
        enterthevalueintotheelement(name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaMobilityCode_createParaMobilityCode_Name");
        enterthevalueintotheelement(code,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaMobilityCode_createParaMobilityCode_Code");
        Jclick_on_element("AdminPortalElements/Admin_para_page_Elements/toggle_admin_para_ParaMobilityCode_createParaMobilityCode_Active");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");
        AdminportalSearchthevalueintothetable(name,"table_admin_para_ParaMobilityCode");
        AdminportalSearchthevalueintothetable(code,"table_admin_para_ParaMobilityCode");

    }

    @Given("^Create Para Mobility Code cancel the popup window$")
    public static void CreateParaMobilityCodecancelthepopupwindow() throws Exception {

        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_admin_para_ParaMobilityCode");
        Jclick_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_ParaMobilityCode_createParaMobilityCode");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Cancel");
        element_visiability("AdminPortalElements/Admin_para_page_Elements/text_admin_para_header");
        Verifytheactualandexceptedvalues("Para Mobility Code","AdminPortalElements/Admin_para_page_Elements/text_admin_para_header");

    }

    @Given("^test$")
    public static void test() throws Exception {

        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_admin_para_ParaMobilityCode");
//        Jclick_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_ParaMobilityCode_createParaMobilityCode");
        String name="Wheelchair Ramps";
        String code="Test_code_active";
//        enterthevalueintotheelement(name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaMobilityCode_createParaMobilityCode_Name");
//        enterthevalueintotheelement(code,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaMobilityCode_createParaMobilityCode_Code");
//        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");
      //  AdminportalSearchthevalueintothetable(name,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaMobilityCode");
        Adminportaloptionontable("Edit",name,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaMobilityCode");
    }
}
