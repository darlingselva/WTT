package StepDefinition.OVRLite.Adminportal;

import base.Commonmethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.WebDriverWait;

import static PreDefinedstepdefinitions.Predefinedstepdefinitions.*;


public class ParaAdminportalLiteSnippet {


//    static Random random = new Random();
//
//    static int rand = random.nextInt(100);
//
//   public static String randomnumber=String.valueOf(rand);

    public static WebDriverWait wait1 = new WebDriverWait(driver, 60);
    public static Commonmethods base = new Commonmethods(driver, wait1);


    //Para_Mobility_Code_scenario
    @Given("^To Verify the Para Mobility Code option page$")
    public static void To_Verify_the_Para_Mobility_Code_option_page() throws Exception {

        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_admin_para_ParaMobilityCode");
        Verifytheactualandexceptedvalues("Para Mobility Code","AdminPortalElements/Admin_para_page_Elements/text_admin_para_header");
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

        String name="testname";
        String code="cd";
        name=name+base.randomvalue(100);
        code=code+base.randomvalue(10);
        enterthevalueintotheelement(name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaMobilityCode_createParaMobilityCode_Name");
        enterthevalueintotheelement(code,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaMobilityCode_createParaMobilityCode_Code");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");
        //click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Cancel");
        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(name,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaMobilityCode");
        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(code,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(code,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaMobilityCode");

        Adminportaloptionontable("Delete","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaMobilityCode");
        base.wait(2);
        driver.switchTo().alert().accept();
        base.wait(2);
     //   Verifytheactualandexceptedvalues("Para Mobility Code has been deleted","AdminPortalElements/Admin_login_page_Elements/text_Admin_login_error_alert");

    }

    @Given("^Create Para Mobility Code without enter the name fields$")
    public static void CreateParaMobilityCodewithoutenterthenamefields() throws Exception {

        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_admin_para_ParaMobilityCode");
        Jclick_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_ParaMobilityCode_createParaMobilityCode");
        enterthevalueintotheelement("cd","AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaMobilityCode_createParaMobilityCode_Code");
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
//        String name="Test_name_deactive";
//        String code="Test_code_deactive";

        String name="testname";
        String code="cd";
        name=name+"disable"+base.randomvalue(100);
        code=code+"d"+base.randomvalue(10);
        enterthevalueintotheelement(name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaMobilityCode_createParaMobilityCode_Name");
        enterthevalueintotheelement(code,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaMobilityCode_createParaMobilityCode_Code");
        Jclick_on_element("AdminPortalElements/Admin_para_page_Elements/toggle_admin_para_ParaMobilityCode_createParaMobilityCode_Active");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");
        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(name,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaMobilityCode");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(code,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(code,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaMobilityCode");

        Adminportaloptionontable("Delete","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaMobilityCode");
        base.wait(2);
        driver.switchTo().alert().accept();
        base.wait(2);
    //    Verifytheactualandexceptedvalues("Para Mobility Code has been deleted","AdminPortalElements/Admin_login_page_Elements/text_Admin_login_error_alert");

    }

    @Given("^Create Para Mobility Code cancel the popup window$")
    public static void CreateParaMobilityCodecancelthepopupwindow() throws Exception {

        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_admin_para_ParaMobilityCode");
        Jclick_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_ParaMobilityCode_createParaMobilityCode");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Cancel");
        element_visiability("AdminPortalElements/Admin_para_page_Elements/text_admin_para_header");
        Verifytheactualandexceptedvalues("Para Mobility Code","AdminPortalElements/Admin_para_page_Elements/text_admin_para_header");

    }

    @Given("^Edit Para Mobility Code from data table$")
    public static void EditParaMobilityCodefromdata_table() throws Exception {

        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_admin_para_ParaMobilityCode");
        Jclick_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_ParaMobilityCode_createParaMobilityCode");

        String name="testname";
        String code="cd";
        name=name+base.randomvalue(100);
        code=code+base.randomvalue(10);
        enterthevalueintotheelement(name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaMobilityCode_createParaMobilityCode_Name");
        enterthevalueintotheelement(code,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaMobilityCode_createParaMobilityCode_Code");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(name,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaMobilityCode");

        Adminportaloptionontable("Edit","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaMobilityCode");
        element_visiability("AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaMobilityCode_createParaMobilityCode_Name");
        element_visiability("AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaMobilityCode_createParaMobilityCode_Code");
        element_visiability("AdminPortalElements/Admin_para_page_Elements/toggle_admin_para_ParaMobilityCode_createParaMobilityCode_Active");
        element_visiability("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");
        element_visiability("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Cancel");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Cancel");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(name,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaMobilityCode");


        Adminportaloptionontable("Delete","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaMobilityCode");
        base.wait(2);
        driver.switchTo().alert().accept();
        base.wait(2);
     //   Verifytheactualandexceptedvalues("Para Mobility Code has been deleted","AdminPortalElements/Admin_login_page_Elements/text_Admin_login_error_alert");
    }
    @Given("^Edit Para Mobility Code from data table using edit name field$")
    public static void EditParaMobilityCodefromdatatableusingeditnamefield() throws Exception {

        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_admin_para_ParaMobilityCode");
        Jclick_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_ParaMobilityCode_createParaMobilityCode");

        String name="testname";
        String code="cd";
        name=name+base.randomvalue(100);
        code=code+base.randomvalue(10);
        enterthevalueintotheelement(name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaMobilityCode_createParaMobilityCode_Name");
        enterthevalueintotheelement(code,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaMobilityCode_createParaMobilityCode_Code");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(name,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaMobilityCode");

        Adminportaloptionontable("Edit","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaMobilityCode");
        name=name+"Edit"+base.randomvalue(100);
        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaMobilityCode_createParaMobilityCode_Name");
        enterthevalueintotheelement(name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaMobilityCode_createParaMobilityCode_Name");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(name,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaMobilityCode");

        Adminportaloptionontable("Delete","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaMobilityCode");
        base.wait(2);
        driver.switchTo().alert().accept();
        base.wait(2);
       // Verifytheactualandexceptedvalues("Para Mobility Code has been deleted","AdminPortalElements/Admin_login_page_Elements/text_Admin_login_error_alert");


    }

    @Given("^Edit Para Mobility Code from data table using edit Code  field$")
    public static void EditParaMobilityCodefromdatatableusingeditCodefield() throws Exception {

        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_admin_para_ParaMobilityCode");
        Jclick_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_ParaMobilityCode_createParaMobilityCode");

        String name="testname";
        String code="cd";
        name=name+base.randomvalue(100);
        code=code+base.randomvalue(10);
        enterthevalueintotheelement(name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaMobilityCode_createParaMobilityCode_Name");
        enterthevalueintotheelement(code,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaMobilityCode_createParaMobilityCode_Code");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(code,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(code,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaMobilityCode");

        Adminportaloptionontable("Edit","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaMobilityCode");
        code=code+"E"+base.randomvalue(10);
        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaMobilityCode_createParaMobilityCode_Code");
        enterthevalueintotheelement(code,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaMobilityCode_createParaMobilityCode_Code");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(code,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(code,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaMobilityCode");

        Adminportaloptionontable("Delete","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaMobilityCode");
        base.wait(2);
        driver.switchTo().alert().accept();
        base.wait(2);
       // Verifytheactualandexceptedvalues("Para Mobility Code has been deleted","AdminPortalElements/Admin_login_page_Elements/text_Admin_login_error_alert");

    }

    @Given("^Edit Para Mobility Code from data table using edit both name and Code  field$")
    public static void EditParaMobilityCodefromdatatableusingeditbothnameandCodefield() throws Exception {

        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_admin_para_ParaMobilityCode");
        Jclick_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_ParaMobilityCode_createParaMobilityCode");

        String name="testname";
        String code="c";
        name=name+base.randomvalue(100);
        code=code+base.randomvalue(10);
        enterthevalueintotheelement(name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaMobilityCode_createParaMobilityCode_Name");
        enterthevalueintotheelement(code,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaMobilityCode_createParaMobilityCode_Code");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(name,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaMobilityCode");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(code,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(code,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaMobilityCode");

        Adminportaloptionontable("Edit","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaMobilityCode");
        name=name+"Edit"+base.randomvalue(100);
        code=code+"E"+base.randomvalue(10);

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaMobilityCode_createParaMobilityCode_Name");
        enterthevalueintotheelement(name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaMobilityCode_createParaMobilityCode_Name");
        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaMobilityCode_createParaMobilityCode_Code");
        enterthevalueintotheelement(code,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaMobilityCode_createParaMobilityCode_Code");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(name,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaMobilityCode");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(code,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(code,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaMobilityCode");

        Adminportaloptionontable("Delete","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaMobilityCode");
        base.wait(2);
        driver.switchTo().alert().accept();
        base.wait(2);
      //  Verifytheactualandexceptedvalues("Para Mobility Code has been deleted","AdminPortalElements/Admin_login_page_Elements/text_Admin_login_error_alert");
    }

    @Given("^Edit Para Mobility Code from data table using edit Active status$")
    public static void EditParaMobilityCodefromdatatableusingeditActivestatus() throws Exception {

        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_admin_para_ParaMobilityCode");
        Jclick_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_ParaMobilityCode_createParaMobilityCode");

        String name="testname";
        String code="cd";
        name=name+base.randomvalue(100);
        code=code+base.randomvalue(10);
        enterthevalueintotheelement(name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaMobilityCode_createParaMobilityCode_Name");
        enterthevalueintotheelement(code,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaMobilityCode_createParaMobilityCode_Code");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(name,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaMobilityCode");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(code,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(code,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaMobilityCode");


        Adminportaloptionontable("Edit","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaMobilityCode");
        Jclick_on_element("AdminPortalElements/Admin_para_page_Elements/toggle_admin_para_ParaMobilityCode_createParaMobilityCode_Active");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(name,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaMobilityCode");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(code,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(code,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaMobilityCode");

        Adminportaloptionontable("Delete","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaMobilityCode");
        base.wait(2);
        driver.switchTo().alert().accept();
        base.wait(2);
       // Verifytheactualandexceptedvalues("Para Mobility Code has been deleted","AdminPortalElements/Admin_login_page_Elements/text_Admin_login_error_alert");

    }


    @Given("^Edit Para Mobility Code from data table using empty value for name field$")
    public static void EditParaMobilityCodefromdatatableusingemptyvaluefornamefield() throws Exception {

        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_admin_para_ParaMobilityCode");
        Jclick_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_ParaMobilityCode_createParaMobilityCode");

        String name="testname";
        String code="cd";
        name=name+base.randomvalue(100);
        code=code+base.randomvalue(10);
        enterthevalueintotheelement(name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaMobilityCode_createParaMobilityCode_Name");
        enterthevalueintotheelement(code,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaMobilityCode_createParaMobilityCode_Code");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(name,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaMobilityCode");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(code,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(code,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaMobilityCode");

        Adminportaloptionontable("Edit","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaMobilityCode");
//        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaMobilityCode_createParaMobilityCode_Name");
        Jclearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaMobilityCode_createParaMobilityCode_Name");
        getthevaluefromelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaMobilityCode_createParaMobilityCode_Name");

        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");



        Verifytheactualandexceptedvalues("MANDATORY FIELDS REQUIRED\n"+"\n" +"Name cannot be empty","AdminPortalElements/Admin_login_page_Elements/text_Admin_login_error_alert");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Cancel");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(name,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaMobilityCode");

        Adminportaloptionontable("Delete","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaMobilityCode");
        base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(2);
      //  Verifytheactualandexceptedvalues("Para Mobility Code has been deleted","AdminPortalElements/Admin_login_page_Elements/text_Admin_login_error_alert");

    }

    @Given("^Edit Para Mobility Code from data table using empty value for Code field$")
    public static void EditParaMobilityCodefromdatatableusingemptyvalueforCodefield() throws Exception {

        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_admin_para_ParaMobilityCode");
        Jclick_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_ParaMobilityCode_createParaMobilityCode");

        String name="testname";
        String code="cd";
        name=name+base.randomvalue(100);
        code=code+base.randomvalue(10);
        enterthevalueintotheelement(name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaMobilityCode_createParaMobilityCode_Name");
        enterthevalueintotheelement(code,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaMobilityCode_createParaMobilityCode_Code");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(name,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaMobilityCode");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(code,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(code,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaMobilityCode");

        Adminportaloptionontable("Edit","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaMobilityCode");
        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaMobilityCode_createParaMobilityCode_Code");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");
        Verifytheactualandexceptedvalues("MANDATORY FIELDS REQUIRED\n"+"\n" +"Code cannot be empty","AdminPortalElements/Admin_login_page_Elements/text_Admin_login_error_alert");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Cancel");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(name,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaMobilityCode");

        Adminportaloptionontable("Delete","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaMobilityCode");
        base.wait(2);
        driver.switchTo().alert().accept();
        base.wait(2);
      //  Verifytheactualandexceptedvalues("Para Mobility Code has been deleted","AdminPortalElements/Admin_login_page_Elements/text_Admin_login_error_alert");
    }

    @Given("^Edit Para Mobility Code from data table using empty value for both Name and Code field$")
    public static void EditParaMobilityCodefromdatatableusingemptyvalueforbothNameandCodefield() throws Exception {

        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_admin_para_ParaMobilityCode");
        Jclick_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_ParaMobilityCode_createParaMobilityCode");
        String name="testname";
        String code="cd";
        name=name+base.randomvalue(100);
        code=code+base.randomvalue(10);
        enterthevalueintotheelement(name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaMobilityCode_createParaMobilityCode_Name");
        enterthevalueintotheelement(code,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaMobilityCode_createParaMobilityCode_Code");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(name,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaMobilityCode");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(code,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(code,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaMobilityCode");

        Adminportaloptionontable("Edit","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaMobilityCode");
        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaMobilityCode_createParaMobilityCode_Name");
        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaMobilityCode_createParaMobilityCode_Code");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");
        Verifytheactualandexceptedvalues("MANDATORY FIELDS REQUIRED\n"+"\n" +"Name, Code cannot be empty","AdminPortalElements/Admin_login_page_Elements/text_Admin_login_error_alert");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Cancel");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(name,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaMobilityCode");

        Adminportaloptionontable("Delete","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaMobilityCode");
        base.wait(2);
        driver.switchTo().alert().accept();
        base.wait(2);
       // Verifytheactualandexceptedvalues("Para Mobility Code has been deleted","AdminPortalElements/Admin_login_page_Elements/text_Admin_login_error_alert");
    }

    @Given("^Edit Para Mobility Code from data table click on cancel button$")
    public static void EditParaMobilityCodefromdatatableclickoncancelbutton() throws Exception {

        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_admin_para_ParaMobilityCode");
        Jclick_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_ParaMobilityCode_createParaMobilityCode");
        String name="testname";
        String code="cd";
        name=name+base.randomvalue(100);
        code=code+base.randomvalue(10);
        enterthevalueintotheelement(name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaMobilityCode_createParaMobilityCode_Name");
        enterthevalueintotheelement(code,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaMobilityCode_createParaMobilityCode_Code");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(name,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaMobilityCode");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(code,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(code,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaMobilityCode");

        Adminportaloptionontable("Edit","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaMobilityCode");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Cancel");
        element_visiability("AdminPortalElements/Admin_para_page_Elements/text_admin_para_header");
        Verifytheactualandexceptedvalues("Para Mobility Code","AdminPortalElements/Admin_para_page_Elements/text_admin_para_header");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(name,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaMobilityCode");

        Adminportaloptionontable("Delete","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaMobilityCode");
        base.wait(2);
        driver.switchTo().alert().accept();
        base.wait(2);
     //   Verifytheactualandexceptedvalues("Para Mobility Code has been deleted","AdminPortalElements/Admin_login_page_Elements/text_Admin_login_error_alert");
    }

    @Given("^search field in the Para Mobility Code data table$")
    public static void searchfieldintheParaMobilityCodedatatable() throws Exception {

        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_admin_para_ParaMobilityCode");
        Jclick_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_ParaMobilityCode_createParaMobilityCode");
        String name="testname";
        String code="cd";
        name=name+base.randomvalue(100);
        code=code+base.randomvalue(10);
        enterthevalueintotheelement(name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaMobilityCode_createParaMobilityCode_Name");
        enterthevalueintotheelement(code,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaMobilityCode_createParaMobilityCode_Code");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(name,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaMobilityCode");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(code,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(code,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaMobilityCode");

        Adminportaloptionontable("Delete","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaMobilityCode");
        base.wait(2);
        driver.switchTo().alert().accept();
        base.wait(2);
      //  Verifytheactualandexceptedvalues("Para Mobility Code has been deleted","AdminPortalElements/Admin_login_page_Elements/text_Admin_login_error_alert");

    }

    @Given("^Delete Para Mobility Code from data table$")
    public static void DeleteParaMobilityCodefromdatatable() throws Exception {

        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_admin_para_ParaMobilityCode");
        Jclick_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_ParaMobilityCode_createParaMobilityCode");
        String name="testname";
        String code="cd";
        name=name+base.randomvalue(100);
        code=code+base.randomvalue(10);
        enterthevalueintotheelement(name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaMobilityCode_createParaMobilityCode_Name");
        enterthevalueintotheelement(code,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaMobilityCode_createParaMobilityCode_Code");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(name,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaMobilityCode");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(code,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(code,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaMobilityCode");

        Adminportaloptionontable("Delete","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaMobilityCode");
        base.wait(2);
        driver.switchTo().alert().accept();
        base.wait(2);
       // Verifytheactualandexceptedvalues("Para Mobility Code has been deleted","AdminPortalElements/Admin_login_page_Elements/text_Admin_login_error_alert");

    }




    @Given("^test$")
    public static void test() throws Exception {

        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_admin_para_ParaMobilityCode");
//        Jclick_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_ParaMobilityCode_createParaMobilityCode");
        String name="Wheelchair Rampssss";
        String code="WCHR";

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(name,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaMobilityCode");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(code,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(code,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaMobilityCode");

    }

    //Para_Classification_Status

    @Given("^Para Classification Status option page$")
    public static void ParaClassificationStatusoptionpage() throws Exception {

        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_admin_para_ParaClassificationStatus");
        Verifytheactualandexceptedvalues("Para Classification Status","AdminPortalElements/Admin_para_page_Elements/text_admin_para_header");
        element_visiability("AdminPortalElements/Admin_para_page_Elements/button_admin_para_ParaClassificationStatus_createParaClassificationStatus");
        element_visiability("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        element_visiability("AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaClassificationStatus");

    }

    @Given("^Create Para Classification Status button in the Para Classification Status option page$")
    public static void CreateParaClassificationStatusbuttonintheParaClassificationStatusoptionpage() throws Exception {
        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_admin_para_ParaClassificationStatus");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_ParaClassificationStatus_createParaClassificationStatus");
        element_visiability("AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaClassificationStatus_createParaClassificationStatus_Name");
        element_visiability("AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaClassificationStatus_createParaClassificationStatus_Code");
        element_visiability("AdminPortalElements/Admin_para_page_Elements/toggle_admin_para_ParaClassificationStatus_createParaClassificationStatus_Active");
        element_visiability("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");
        element_visiability("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Cancel");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Cancel");

    }

    @Given("^Create Para Classification Status using positive values$")
    public static void CreateParaClassificationStatususingpositivevalues() throws Exception {
        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_admin_para_ParaClassificationStatus");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_ParaClassificationStatus_createParaClassificationStatus");
        String name="testname";
        String code="cd";
        name=name+base.randomvalue(100);
        code=code+base.randomvalue(10);
        enterthevalueintotheelement(name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaClassificationStatus_createParaClassificationStatus_Name");
        enterthevalueintotheelement(code,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaClassificationStatus_createParaClassificationStatus_Code");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(name,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaClassificationStatus");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(code,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(code,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaClassificationStatus");


        Adminportaloptionontable("Delete","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaClassificationStatus");
        base.wait(2);
        driver.switchTo().alert().accept();
        base.wait(2);
      //  Verifytheactualandexceptedvalues("Para Mobility Code has been deleted","AdminPortalElements/Admin_login_page_Elements/text_Admin_login_error_alert");

    }

    @Given("^Create Para Classification Status without enter the name fields$")
    public static void CreateParaClassificationStatuswithoutenterthenamefields() throws Exception {
        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_admin_para_ParaClassificationStatus");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_ParaClassificationStatus_createParaClassificationStatus");
        String name = "testname";
        String code = "cd";
        name = name + base.randomvalue(100);
        code = code + base.randomvalue(10);
        enterthevalueintotheelement(code,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaClassificationStatus_createParaClassificationStatus_Code");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");

        Verifytheactualandexceptedvalues("MANDATORY FIELDS REQUIRED\n"+"\n" +"Name cannot be empty","AdminPortalElements/Admin_login_page_Elements/text_Admin_login_error_alert");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Cancel");

    }

    @Given("^Create Para Classification Status without enter the code fields$")
    public static void CreateParaClassificationStatuswithoutenterthecodefields() throws Exception {
        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_admin_para_ParaClassificationStatus");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_ParaClassificationStatus_createParaClassificationStatus");
        String name = "testname";
        String code = "cd";
        name = name + base.randomvalue(100);
        code = code + base.randomvalue(10);
        enterthevalueintotheelement(name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaClassificationStatus_createParaClassificationStatus_Name");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");

        Verifytheactualandexceptedvalues("MANDATORY FIELDS REQUIRED\n"+"\n" +"Code cannot be empty","AdminPortalElements/Admin_login_page_Elements/text_Admin_login_error_alert");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Cancel");
    }


    @Given("^Create Para Classification Status disable Action toggle$")
    public static void CreateParaClassificationStatusdisableActiontoggle() throws Exception {
        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_admin_para_ParaClassificationStatus");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_ParaClassificationStatus_createParaClassificationStatus");
        String name = "testname";
        String code = "cd";
        name = name + base.randomvalue(100);
        code = code + base.randomvalue(10);
        enterthevalueintotheelement(name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaClassificationStatus_createParaClassificationStatus_Name");
        enterthevalueintotheelement(code,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaClassificationStatus_createParaClassificationStatus_Code");
        //Jclick_on_element("AdminPortalElements/Admin_para_page_Elements/toggle_admin_para_ParaClassificationStatus_createParaClassificationStatus_Active");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(name,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaClassificationStatus");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(code,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(code,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaClassificationStatus");

        Adminportaloptionontable("Delete","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaClassificationStatus");
        base.wait(2);
        driver.switchTo().alert().accept();
        base.wait(2);

    }

    @Given("^Create Para Classification Status cancel the popup window$")
    public static void CreateParaClassificationStatuscancelthepopupwindow() throws Exception {
        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_admin_para_ParaClassificationStatus");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_ParaClassificationStatus_createParaClassificationStatus");
        String name = "testname";
        String code = "cd";
        name = name + base.randomvalue(100);
        code = code + base.randomvalue(10);
        enterthevalueintotheelement(name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaClassificationStatus_createParaClassificationStatus_Name");
        enterthevalueintotheelement(code,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaClassificationStatus_createParaClassificationStatus_Code");
        Jclick_on_element("AdminPortalElements/Admin_para_page_Elements/toggle_admin_para_ParaClassificationStatus_createParaClassificationStatus_Active");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Cancel");
        Verifytheactualandexceptedvalues("Para Classification Status","AdminPortalElements/Admin_para_page_Elements/text_admin_para_header");
    }

    @Given("^Edit Para Classification Status from data table$")
    public static void EditParaClassificationStatusfromdatatable() throws Exception {
        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_admin_para_ParaClassificationStatus");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_ParaClassificationStatus_createParaClassificationStatus");
        String name = "testname";
        String code = "cd";
        name = name + base.randomvalue(100);
        code = code + base.randomvalue(10);
        enterthevalueintotheelement(name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaClassificationStatus_createParaClassificationStatus_Name");
        enterthevalueintotheelement(code,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaClassificationStatus_createParaClassificationStatus_Code");
        //Jclick_on_element("AdminPortalElements/Admin_para_page_Elements/toggle_admin_para_ParaClassificationStatus_createParaClassificationStatus_Active");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(name,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaClassificationStatus");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(code,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(code,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaClassificationStatus");

        Adminportaloptionontable("Edit","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaClassificationStatus");
        base.wait(2);

        element_visiability("AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaClassificationStatus_createParaClassificationStatus_Name");
        element_visiability("AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaClassificationStatus_createParaClassificationStatus_Code");
        element_visiability("AdminPortalElements/Admin_para_page_Elements/toggle_admin_para_ParaClassificationStatus_createParaClassificationStatus_Active");
        element_visiability("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");
        element_visiability("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Cancel");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Cancel");

        Adminportaloptionontable("Delete","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaClassificationStatus");
        base.wait(2);
        driver.switchTo().alert().accept();
        base.wait(2);

    }
    @Given("^Edit Para Classification Status from data table using edit name field$")
    public static void EditParaClassificationStatusfromdatatableusingeditnamefield () throws Exception {
        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_admin_para_ParaClassificationStatus");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_ParaClassificationStatus_createParaClassificationStatus");
        String name = "testname";
        String code = "cd";
        name = name + base.randomvalue(100);
        code = code + base.randomvalue(10);
        enterthevalueintotheelement(name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaClassificationStatus_createParaClassificationStatus_Name");
        enterthevalueintotheelement(code,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaClassificationStatus_createParaClassificationStatus_Code");
       // Jclick_on_element("AdminPortalElements/Admin_para_page_Elements/toggle_admin_para_ParaClassificationStatus_createParaClassificationStatus_Active");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(name,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaClassificationStatus");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(code,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(code,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaClassificationStatus");

        Adminportaloptionontable("Edit","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaClassificationStatus");
        base.wait(2);
        name=name+"Edit"+base.randomvalue(100);
        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaClassificationStatus_createParaClassificationStatus_Name");
        enterthevalueintotheelement(name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaClassificationStatus_createParaClassificationStatus_Name");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(name,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaClassificationStatus");

        Adminportaloptionontable("Delete","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaClassificationStatus");
        base.wait(2);
        driver.switchTo().alert().accept();
        base.wait(2);


    }

    @Given("^Edit Para Classification Status from data table using edit Code  field$")
    public static void EditParaClassificationStatusfromdatatableusingeditCodefield() throws Exception {
        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_admin_para_ParaClassificationStatus");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_ParaClassificationStatus_createParaClassificationStatus");
        String name = "testname";
        String code = "c";
        name = name + base.randomvalue(100);
        code = code + base.randomvalue(10);
        enterthevalueintotheelement(name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaClassificationStatus_createParaClassificationStatus_Name");
        enterthevalueintotheelement(code,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaClassificationStatus_createParaClassificationStatus_Code");
        //Jclick_on_element("AdminPortalElements/Admin_para_page_Elements/toggle_admin_para_ParaClassificationStatus_createParaClassificationStatus_Active");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(name,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaClassificationStatus");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(code,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(code,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaClassificationStatus");

        Adminportaloptionontable("Edit","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaClassificationStatus");
        base.wait(2);
        code=code+"E"+base.randomvalue(100);
        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaClassificationStatus_createParaClassificationStatus_Code");
        enterthevalueintotheelement(code,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaClassificationStatus_createParaClassificationStatus_Code");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(code,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(code,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaClassificationStatus");

        Adminportaloptionontable("Delete","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaClassificationStatus");
        base.wait(2);
        driver.switchTo().alert().accept();
        base.wait(2);


    }

    @Given("^Edit Para Classification Status from data table using edit both name and Code  field$")
    public static void EditParaClassificationStatusfromdatatableusingeditbothnameandCodefield() throws Exception {

        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_admin_para_ParaClassificationStatus");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_ParaClassificationStatus_createParaClassificationStatus");
        String name = "testname";
        String code = "c";
        name = name + base.randomvalue(100);
        code = code + base.randomvalue(10);
        enterthevalueintotheelement(name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaClassificationStatus_createParaClassificationStatus_Name");
        enterthevalueintotheelement(code,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaClassificationStatus_createParaClassificationStatus_Code");
        //Jclick_on_element("AdminPortalElements/Admin_para_page_Elements/toggle_admin_para_ParaClassificationStatus_createParaClassificationStatus_Active");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(name,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaClassificationStatus");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(code,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(code,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaClassificationStatus");

        Adminportaloptionontable("Edit","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaClassificationStatus");
        base.wait(2);
        name=name+"Edit"+base.randomvalue(100);
        code=code+"E"+base.randomvalue(100);
        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaClassificationStatus_createParaClassificationStatus_Name");
        enterthevalueintotheelement(name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaClassificationStatus_createParaClassificationStatus_Name");
        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaClassificationStatus_createParaClassificationStatus_Code");
        enterthevalueintotheelement(code,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaClassificationStatus_createParaClassificationStatus_Code");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(name,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaClassificationStatus");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(code,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(code,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaClassificationStatus");

        Adminportaloptionontable("Delete","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaClassificationStatus");
        base.wait(2);
        driver.switchTo().alert().accept();
        base.wait(2);

    }

    @Then("^Edit Para Classification Status from data table using edit Active status$")
    public static void EditParaClassificationStatusfromdatatableusingeditActivestatus() throws Exception {

        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_admin_para_ParaClassificationStatus");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_ParaClassificationStatus_createParaClassificationStatus");
        String name = "testname";
        String code = "c";
        name = name + base.randomvalue(100);
        code = code + base.randomvalue(10);
        enterthevalueintotheelement(name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaClassificationStatus_createParaClassificationStatus_Name");
        enterthevalueintotheelement(code,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaClassificationStatus_createParaClassificationStatus_Code");
        //Jclick_on_element("AdminPortalElements/Admin_para_page_Elements/toggle_admin_para_ParaClassificationStatus_createParaClassificationStatus_Active");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(name,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaClassificationStatus");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(code,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(code,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaClassificationStatus");
        Adminportaloptionontable("Edit","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaClassificationStatus");
        base.wait(2);
        Jclick_on_element("AdminPortalElements/Admin_para_page_Elements/toggle_admin_para_ParaClassificationStatus_createParaClassificationStatus_Active");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable("No","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaClassificationStatus");

        Adminportaloptionontable("Delete","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaClassificationStatus");
        base.wait(2);
        driver.switchTo().alert().accept();
        base.wait(2);

    }

    @Then("^Edit Para Classification Status from data table using empty value for name field$")
    public static void EditParaClassificationStatusfromdatatableusingemptyvaluefornamefield() throws Exception {

        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_admin_para_ParaClassificationStatus");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_ParaClassificationStatus_createParaClassificationStatus");
        String name = "testname";
        String code = "c";
        name = name + base.randomvalue(100);
        code = code + base.randomvalue(10);
        enterthevalueintotheelement(name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaClassificationStatus_createParaClassificationStatus_Name");
        enterthevalueintotheelement(code,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaClassificationStatus_createParaClassificationStatus_Code");
        //Jclick_on_element("AdminPortalElements/Admin_para_page_Elements/toggle_admin_para_ParaClassificationStatus_createParaClassificationStatus_Active");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(name,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaClassificationStatus");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(code,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(code,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaClassificationStatus");
        Adminportaloptionontable("Edit","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaClassificationStatus");
        base.wait(2);

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaClassificationStatus_createParaClassificationStatus_Name");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");

        Verifytheactualandexceptedvalues("MANDATORY FIELDS REQUIRED\n"+"\n" +"Name cannot be empty","AdminPortalElements/Admin_login_page_Elements/text_Admin_login_error_alert");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Cancel");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(name,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaClassificationStatus");

        Adminportaloptionontable("Delete","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaClassificationStatus");
        base.wait(2);
        driver.switchTo().alert().accept();
        base.wait(2);

    }

    @Then("^Edit Para Classification Status from data table using empty value for Code field$")
    public static void EditParaClassificationStatusfromdatatableusingemptyvalueforCodefield() throws Exception {

        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_admin_para_ParaClassificationStatus");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_ParaClassificationStatus_createParaClassificationStatus");
        String name = "testname";
        String code = "c";
        name = name + base.randomvalue(100);
        code = code + base.randomvalue(10);
        enterthevalueintotheelement(name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaClassificationStatus_createParaClassificationStatus_Name");
        enterthevalueintotheelement(code,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaClassificationStatus_createParaClassificationStatus_Code");
        //Jclick_on_element("AdminPortalElements/Admin_para_page_Elements/toggle_admin_para_ParaClassificationStatus_createParaClassificationStatus_Active");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(name,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaClassificationStatus");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(code,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(code,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaClassificationStatus");
        Adminportaloptionontable("Edit","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaClassificationStatus");
        base.wait(2);

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaClassificationStatus_createParaClassificationStatus_Code");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");

        Verifytheactualandexceptedvalues("MANDATORY FIELDS REQUIRED\n"+"\n" +"Code cannot be empty","AdminPortalElements/Admin_login_page_Elements/text_Admin_login_error_alert");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Cancel");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(name,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaClassificationStatus");

        Adminportaloptionontable("Delete","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaClassificationStatus");
        base.wait(2);
        driver.switchTo().alert().accept();
        base.wait(2);

    }

    @Then("^Edit Para Classification Status from data table using empty value for both Name and Code field$")
    public static void EditParaClassificationStatusfromdatatableusingemptyvalueforbothNameandCodefield() throws Exception {

        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_admin_para_ParaClassificationStatus");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_ParaClassificationStatus_createParaClassificationStatus");
        String name = "testname";
        String code = "c";
        name = name + base.randomvalue(100);
        code = code + base.randomvalue(10);
        enterthevalueintotheelement(name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaClassificationStatus_createParaClassificationStatus_Name");
        enterthevalueintotheelement(code,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaClassificationStatus_createParaClassificationStatus_Code");
        //Jclick_on_element("AdminPortalElements/Admin_para_page_Elements/toggle_admin_para_ParaClassificationStatus_createParaClassificationStatus_Active");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(name,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaClassificationStatus");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(code,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(code,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaClassificationStatus");
        Adminportaloptionontable("Edit","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaClassificationStatus");
        base.wait(2);

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaClassificationStatus_createParaClassificationStatus_Name");
        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaClassificationStatus_createParaClassificationStatus_Code");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");

        Verifytheactualandexceptedvalues("MANDATORY FIELDS REQUIRED\n"+"\n" +"Name, Code cannot be empty","AdminPortalElements/Admin_login_page_Elements/text_Admin_login_error_alert");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Cancel");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(name,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaClassificationStatus");

        Adminportaloptionontable("Delete","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaClassificationStatus");
        base.wait(2);
        driver.switchTo().alert().accept();
        base.wait(2);

    }

    @Then("^Edit Para Classification Status from data table click on cancel button$")
    public static void EditParaClassificationStatusfromdatatableclickoncancelbutton() throws Exception {
        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_admin_para_ParaClassificationStatus");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_ParaClassificationStatus_createParaClassificationStatus");
        String name = "testname";
        String code = "c";
        name = name + base.randomvalue(100);
        code = code + base.randomvalue(10);
        enterthevalueintotheelement(name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaClassificationStatus_createParaClassificationStatus_Name");
        enterthevalueintotheelement(code,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaClassificationStatus_createParaClassificationStatus_Code");
        //Jclick_on_element("AdminPortalElements/Admin_para_page_Elements/toggle_admin_para_ParaClassificationStatus_createParaClassificationStatus_Active");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(name,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaClassificationStatus");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(code,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(code,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaClassificationStatus");
        Adminportaloptionontable("Edit","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaClassificationStatus");
        base.wait(2);

        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Cancel");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(name,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaClassificationStatus");

        Adminportaloptionontable("Delete","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaClassificationStatus");
        base.wait(2);
        driver.switchTo().alert().accept();
        base.wait(2);
    }


    @Then("^search field in the Para Classification Status data table$")
    public static void searchfieldintheParaClassificationStatusdatatable() throws Exception {

        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_admin_para_ParaClassificationStatus");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_ParaClassificationStatus_createParaClassificationStatus");
        String name = "testname";
        String code = "c";
        name = name + base.randomvalue(100);
        code = code + base.randomvalue(10);
        enterthevalueintotheelement(name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaClassificationStatus_createParaClassificationStatus_Name");
        enterthevalueintotheelement(code,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaClassificationStatus_createParaClassificationStatus_Code");
        //Jclick_on_element("AdminPortalElements/Admin_para_page_Elements/toggle_admin_para_ParaClassificationStatus_createParaClassificationStatus_Active");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(name,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaClassificationStatus");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(code,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(code,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaClassificationStatus");

        Adminportaloptionontable("Delete","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaClassificationStatus");
        base.wait(2);
        driver.switchTo().alert().accept();
        base.wait(2);

    }

    @Then("^Delete Para Classification Status from data table$")
    public static void DeleteParaClassificationStatusfromdatatable() throws Exception {

        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_admin_para_ParaClassificationStatus");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_ParaClassificationStatus_createParaClassificationStatus");
        String name = "testname";
        String code = "c";
        name = name + base.randomvalue(100);
        code = code + base.randomvalue(10);
        enterthevalueintotheelement(name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaClassificationStatus_createParaClassificationStatus_Name");
        enterthevalueintotheelement(code,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaClassificationStatus_createParaClassificationStatus_Code");
        //Jclick_on_element("AdminPortalElements/Admin_para_page_Elements/toggle_admin_para_ParaClassificationStatus_createParaClassificationStatus_Active");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(name,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaClassificationStatus");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(code,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(code,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaClassificationStatus");

        Adminportaloptionontable("Delete","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaClassificationStatus");
        base.wait(2);
        driver.switchTo().alert().accept();
        base.wait(2);

    }

    @Then("^Para Impairment Groups option page$")
    public static void ParaImpairmentGroupsoptionpage() throws Exception {

        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_admin_para_ParaImpairmentGroups");
        Verifytheactualandexceptedvalues("Para Impairment Group","AdminPortalElements/Admin_para_page_Elements/text_admin_para_header");
        element_visiability("AdminPortalElements/Admin_para_page_Elements/button_admin_para_ParaImpairmentGroups_create_ParaImpairmentGroup");
        element_visiability("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        element_visiability("AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaImpairmentGroups");
    }

    @Then("^Create Para Impairment Groups button in the Para Impairment Groups option page$")
    public static void CreateParaImpairmentGroupsbuttonintheParaImpairmentGroupsoptionpage() throws Exception {
        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_admin_para_ParaImpairmentGroups");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_ParaImpairmentGroups_create_ParaImpairmentGroup");
        element_visiability("AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaImpairmentGroups_create_ParaImpairmentGroup_Name");
        element_visiability("AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaImpairmentGroups_create_ParaImpairmentGroup_Code");
        element_visiability("AdminPortalElements/Admin_para_page_Elements/toggle_admin_para_ParaImpairmentGroups_create_ParaImpairmentGroup_Active");
        element_visiability("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");
        element_visiability("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Cancel");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Cancel");

    }

    @Then("^Create Para Impairment Groups using positive values$")
    public static void CreateParaImpairmentGroupsusingpositivevalues() throws Exception {

        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_admin_para_ParaImpairmentGroups");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_ParaImpairmentGroups_create_ParaImpairmentGroup");
        String name="testname";
        String code="cd";
        name=name+base.randomvalue(100);
        code=code+base.randomvalue(10);
        enterthevalueintotheelement(name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaImpairmentGroups_create_ParaImpairmentGroup_Name");
        enterthevalueintotheelement(code,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaImpairmentGroups_create_ParaImpairmentGroup_Code");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(name,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaImpairmentGroups");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(code,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(code,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaImpairmentGroups");


        Adminportaloptionontable("Delete","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaImpairmentGroups");
        base.wait(2);
        driver.switchTo().alert().accept();
        base.wait(2);

    }

    @Then("^Create Para Impairment Groups without enter the name fields$")
    public static void CreateParaImpairmentGroupswithoutenterthenamefields() throws Exception {

        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_admin_para_ParaImpairmentGroups");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_ParaImpairmentGroups_create_ParaImpairmentGroup");
        String name="testname";
        String code="cd";
        name=name+base.randomvalue(100);
        code=code+base.randomvalue(10);
        enterthevalueintotheelement(code,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaImpairmentGroups_create_ParaImpairmentGroup_Code");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");

        Verifytheactualandexceptedvalues("MANDATORY FIELDS REQUIRED\n"+"\n" +"Name cannot be empty","AdminPortalElements/Admin_login_page_Elements/text_Admin_login_error_alert");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Cancel");

    }

    @Then("^Create Para Impairment Groups without enter the code fields$")
    public static void CreateParaImpairmentGroupswithoutenterthecodefields() throws Exception {

        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_admin_para_ParaImpairmentGroups");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_ParaImpairmentGroups_create_ParaImpairmentGroup");
        String name="testname";
        String code="cd";
        name=name+base.randomvalue(100);
        code=code+base.randomvalue(10);
        enterthevalueintotheelement(name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaImpairmentGroups_create_ParaImpairmentGroup_Name");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");

        Verifytheactualandexceptedvalues("MANDATORY FIELDS REQUIRED\n"+"\n" +"Code cannot be empty","AdminPortalElements/Admin_login_page_Elements/text_Admin_login_error_alert");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Cancel");
    }

    @Then("^Create Para Impairment Groups disable Action toggle$")
    public static void CreateParaImpairmentGroupsdisableActiontoggle() throws Exception {

        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_admin_para_ParaImpairmentGroups");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_ParaImpairmentGroups_create_ParaImpairmentGroup");
        String name="testname";
        String code="cd";
        name=name+base.randomvalue(100);
        code=code+base.randomvalue(10);
        enterthevalueintotheelement(name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaImpairmentGroups_create_ParaImpairmentGroup_Name");
        enterthevalueintotheelement(code,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaImpairmentGroups_create_ParaImpairmentGroup_Code");
        Jclick_on_element("AdminPortalElements/Admin_para_page_Elements/toggle_admin_para_ParaImpairmentGroups_create_ParaImpairmentGroup_Active");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(name,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaImpairmentGroups");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(code,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(code,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaImpairmentGroups");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable("No","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaImpairmentGroups");

        Adminportaloptionontable("Delete","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaImpairmentGroups");
        base.wait(2);
        driver.switchTo().alert().accept();
        base.wait(2);
    }

    @Then("^Create Para Impairment Groups cancel the popup window$")
    public static void CreateParaImpairmentGroupscancelthepopupwindow() throws Exception {

        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_admin_para_ParaImpairmentGroups");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_ParaImpairmentGroups_create_ParaImpairmentGroup");
        String name="testname";
        String code="cd";
        name=name+base.randomvalue(100);
        code=code+base.randomvalue(10);
        enterthevalueintotheelement(name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaImpairmentGroups_create_ParaImpairmentGroup_Name");
        enterthevalueintotheelement(code,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaImpairmentGroups_create_ParaImpairmentGroup_Code");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Cancel");

        element_visiability("AdminPortalElements/Admin_para_page_Elements/text_admin_para_header");
        Verifytheactualandexceptedvalues("Para Impairment Group","AdminPortalElements/Admin_para_page_Elements/text_admin_para_header");


    }

    @Then("^Edit Para Impairment Groups from data table$")
    public static void EditParaImpairmentGroupsfromdatatable() throws Exception {

        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_admin_para_ParaImpairmentGroups");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_ParaImpairmentGroups_create_ParaImpairmentGroup");
        String name="testname";
        String code="cd";
        name=name+base.randomvalue(100);
        code=code+base.randomvalue(10);
        enterthevalueintotheelement(name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaImpairmentGroups_create_ParaImpairmentGroup_Name");
        enterthevalueintotheelement(code,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaImpairmentGroups_create_ParaImpairmentGroup_Code");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(name,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaImpairmentGroups");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(code,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(code,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaImpairmentGroups");


        Adminportaloptionontable("Edit","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaImpairmentGroups");

        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_ParaImpairmentGroups_create_ParaImpairmentGroup");
        element_visiability("AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaImpairmentGroups_create_ParaImpairmentGroup_Name");
        element_visiability("AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaImpairmentGroups_create_ParaImpairmentGroup_Code");
        element_visiability("AdminPortalElements/Admin_para_page_Elements/toggle_admin_para_ParaImpairmentGroups_create_ParaImpairmentGroup_Active");
        element_visiability("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");
        element_visiability("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Cancel");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Cancel");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(name,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaImpairmentGroups");

        Adminportaloptionontable("Delete","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaImpairmentGroups");
        base.wait(2);
        driver.switchTo().alert().accept();
        base.wait(2);


    }

    @Then("^Edit Para Impairment Groups from data table using edit name field$")
    public static void EditParaImpairmentGroupsfromdatatableusingeditnamefield() throws Exception {

        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_admin_para_ParaImpairmentGroups");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_ParaImpairmentGroups_create_ParaImpairmentGroup");
        String name="testname";
        String code="cd";
        name=name+base.randomvalue(100);
        code=code+base.randomvalue(10);
        enterthevalueintotheelement(name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaImpairmentGroups_create_ParaImpairmentGroup_Name");
        enterthevalueintotheelement(code,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaImpairmentGroups_create_ParaImpairmentGroup_Code");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(name,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaImpairmentGroups");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(code,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(code,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaImpairmentGroups");

        name=name+"E"+base.randomvalue(100);

        Adminportaloptionontable("Edit","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaImpairmentGroups");
        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaImpairmentGroups_create_ParaImpairmentGroup_Name");
        enterthevalueintotheelement(name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaImpairmentGroups_create_ParaImpairmentGroup_Name");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(name,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaImpairmentGroups");

        Adminportaloptionontable("Delete","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaImpairmentGroups");
        base.wait(2);
        driver.switchTo().alert().accept();
        base.wait(2);

    }

    @Then("^Edit Para Impairment Groups from data table using edit Code field$")
    public static void EditParaImpairmentGroupsfromdatatableusingeditCodefield() throws Exception {
        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_admin_para_ParaImpairmentGroups");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_ParaImpairmentGroups_create_ParaImpairmentGroup");
        String name="testname";
        String code="c";
        name=name+base.randomvalue(100);
        code=code+base.randomvalue(10);
        enterthevalueintotheelement(name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaImpairmentGroups_create_ParaImpairmentGroup_Name");
        enterthevalueintotheelement(code,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaImpairmentGroups_create_ParaImpairmentGroup_Code");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(name,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaImpairmentGroups");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(code,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(code,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaImpairmentGroups");

        code=code+"E"+base.randomvalue(10);

        Adminportaloptionontable("Edit","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaImpairmentGroups");
        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaImpairmentGroups_create_ParaImpairmentGroup_Code");
        enterthevalueintotheelement(code,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaImpairmentGroups_create_ParaImpairmentGroup_Code");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(code,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(code,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaImpairmentGroups");

        Adminportaloptionontable("Delete","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaImpairmentGroups");
        base.wait(2);
        driver.switchTo().alert().accept();
        base.wait(2);
    }

    @Then("^Edit Para Impairment Groups from data table using edit both name and Code  field$")
    public static void EditParaImpairmentGroupsfromdatatableusingeditbothnameandCodefield() throws Exception {

        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_admin_para_ParaImpairmentGroups");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_ParaImpairmentGroups_create_ParaImpairmentGroup");
        String name="testname";
        String code="c";
        name=name+base.randomvalue(100);
        code=code+base.randomvalue(10);
        enterthevalueintotheelement(name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaImpairmentGroups_create_ParaImpairmentGroup_Name");
        enterthevalueintotheelement(code,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaImpairmentGroups_create_ParaImpairmentGroup_Code");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(name,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaImpairmentGroups");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(code,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(code,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaImpairmentGroups");

        code=code+"E"+base.randomvalue(10);
        name=name+"E"+base.randomvalue(100);

        Adminportaloptionontable("Edit","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaImpairmentGroups");
        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaImpairmentGroups_create_ParaImpairmentGroup_Name");
        enterthevalueintotheelement(name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaImpairmentGroups_create_ParaImpairmentGroup_Name");
        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaImpairmentGroups_create_ParaImpairmentGroup_Code");
        enterthevalueintotheelement(code,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaImpairmentGroups_create_ParaImpairmentGroup_Code");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(name,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaImpairmentGroups");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(code,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(code,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaImpairmentGroups");

        Adminportaloptionontable("Delete","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaImpairmentGroups");
        base.wait(2);
        driver.switchTo().alert().accept();
        base.wait(2);
    }

    @Then("^Edit Para Impairment Groups from data table using edit Active status$")
    public static void EditParaImpairmentGroupsfromdatatableusingeditActivestatus() throws Exception {

        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_admin_para_ParaImpairmentGroups");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_ParaImpairmentGroups_create_ParaImpairmentGroup");
        String name="testname";
        String code="c";
        name=name+base.randomvalue(100);
        code=code+base.randomvalue(10);
        enterthevalueintotheelement(name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaImpairmentGroups_create_ParaImpairmentGroup_Name");
        enterthevalueintotheelement(code,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaImpairmentGroups_create_ParaImpairmentGroup_Code");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(name,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaImpairmentGroups");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(code,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(code,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaImpairmentGroups");

        Adminportaloptionontable("Edit","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaImpairmentGroups");
        Jclick_on_element("AdminPortalElements/Admin_para_page_Elements/toggle_admin_para_ParaImpairmentGroups_create_ParaImpairmentGroup_Active");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable("No","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaImpairmentGroups");

        Adminportaloptionontable("Delete","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaImpairmentGroups");
        base.wait(2);
        driver.switchTo().alert().accept();
        base.wait(2);

    }

    @Then("^Edit Para Impairment Groups from data table using empty value for name field$")
    public static void EditParaImpairmentGroupsfromdatatableusingemptyvaluefornamefield() throws Exception {

        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_admin_para_ParaImpairmentGroups");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_ParaImpairmentGroups_create_ParaImpairmentGroup");
        String name="testname";
        String code="c";
        name=name+base.randomvalue(100);
        code=code+base.randomvalue(10);
        enterthevalueintotheelement(name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaImpairmentGroups_create_ParaImpairmentGroup_Name");
        enterthevalueintotheelement(code,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaImpairmentGroups_create_ParaImpairmentGroup_Code");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(name,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaImpairmentGroups");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(code,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(code,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaImpairmentGroups");

        Adminportaloptionontable("Edit","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaImpairmentGroups");
        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaImpairmentGroups_create_ParaImpairmentGroup_Name");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");

        Verifytheactualandexceptedvalues("MANDATORY FIELDS REQUIRED\n"+"\n" +"Name cannot be empty","AdminPortalElements/Admin_login_page_Elements/text_Admin_login_error_alert");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Cancel");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(name,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaImpairmentGroups");

        Adminportaloptionontable("Delete","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaImpairmentGroups");
        base.wait(2);
        driver.switchTo().alert().accept();
        base.wait(2);

    }


    @Then("^Edit Para Impairment Groups from data table using empty value for Code field$")
    public static void EditParaImpairmentGroupsfromdatatableusingemptyvalueforCodefield() throws Exception {

        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_admin_para_ParaImpairmentGroups");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_ParaImpairmentGroups_create_ParaImpairmentGroup");
        String name="testname";
        String code="c";
        name=name+base.randomvalue(100);
        code=code+base.randomvalue(10);
        enterthevalueintotheelement(name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaImpairmentGroups_create_ParaImpairmentGroup_Name");
        enterthevalueintotheelement(code,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaImpairmentGroups_create_ParaImpairmentGroup_Code");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(name,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaImpairmentGroups");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(code,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(code,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaImpairmentGroups");

        Adminportaloptionontable("Edit","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaImpairmentGroups");
        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaImpairmentGroups_create_ParaImpairmentGroup_Code");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");

        Verifytheactualandexceptedvalues("MANDATORY FIELDS REQUIRED\n"+"\n" +"Code cannot be empty","AdminPortalElements/Admin_login_page_Elements/text_Admin_login_error_alert");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Cancel");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(name,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaImpairmentGroups");

        Adminportaloptionontable("Delete","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaImpairmentGroups");
        base.wait(2);
        driver.switchTo().alert().accept();
        base.wait(2);

    }

    @Then("^Edit Para Impairment Groups from data table using empty value for both Name and Code field$")
    public static void EditParaImpairmentGroupsfromdatatableusingemptyvalueforbothNameandCodefield() throws Exception {

        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_admin_para_ParaImpairmentGroups");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_ParaImpairmentGroups_create_ParaImpairmentGroup");
        String name="testname";
        String code="c";
        name=name+base.randomvalue(100);
        code=code+base.randomvalue(10);
        enterthevalueintotheelement(name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaImpairmentGroups_create_ParaImpairmentGroup_Name");
        enterthevalueintotheelement(code,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaImpairmentGroups_create_ParaImpairmentGroup_Code");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(name,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaImpairmentGroups");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(code,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(code,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaImpairmentGroups");

        Adminportaloptionontable("Edit","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaImpairmentGroups");
        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaImpairmentGroups_create_ParaImpairmentGroup_Name");
        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaImpairmentGroups_create_ParaImpairmentGroup_Code");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");

        Verifytheactualandexceptedvalues("MANDATORY FIELDS REQUIRED\n"+"\n" +"Name, Code cannot be empty","AdminPortalElements/Admin_login_page_Elements/text_Admin_login_error_alert");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Cancel");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(name,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaImpairmentGroups");

        Adminportaloptionontable("Delete","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaImpairmentGroups");
        base.wait(2);
        driver.switchTo().alert().accept();
        base.wait(2);

    }

    @Then("^Edit Para Impairment Groups from data table click on cancel button$")
    public static void EditParaImpairmentGroupsfromdatatableclickoncancelbutton() throws Exception {

        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_admin_para_ParaImpairmentGroups");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_ParaImpairmentGroups_create_ParaImpairmentGroup");
        String name="testname";
        String code="c";
        name=name+base.randomvalue(100);
        code=code+base.randomvalue(10);
        enterthevalueintotheelement(name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaImpairmentGroups_create_ParaImpairmentGroup_Name");
        enterthevalueintotheelement(code,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaImpairmentGroups_create_ParaImpairmentGroup_Code");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(name,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaImpairmentGroups");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(code,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(code,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaImpairmentGroups");

        Adminportaloptionontable("Edit","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaImpairmentGroups");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Cancel");

        element_visiability("AdminPortalElements/Admin_para_page_Elements/text_admin_para_header");
        Verifytheactualandexceptedvalues("Para Impairment Group","AdminPortalElements/Admin_para_page_Elements/text_admin_para_header");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(name,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaImpairmentGroups");

        Adminportaloptionontable("Delete","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaImpairmentGroups");
        base.wait(2);
        driver.switchTo().alert().accept();
        base.wait(2);
    }


    @Then("^search field in the Para Impairment Groups data table$")
    public static void searchfieldintheParaImpairmentGroupsdatatable() throws Exception {

        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_admin_para_ParaImpairmentGroups");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_ParaImpairmentGroups_create_ParaImpairmentGroup");
        String name="testname";
        String code="cd";
        name=name+base.randomvalue(100);
        code=code+base.randomvalue(10);
        enterthevalueintotheelement(name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaImpairmentGroups_create_ParaImpairmentGroup_Name");
        enterthevalueintotheelement(code,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaImpairmentGroups_create_ParaImpairmentGroup_Code");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(name,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaImpairmentGroups");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(code,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(code,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaImpairmentGroups");


        Adminportaloptionontable("Delete","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaImpairmentGroups");
        base.wait(2);
        driver.switchTo().alert().accept();
        base.wait(2);

    }


    @Then("^Delete Para Impairment Groups from data table$")
    public static void DeleteParaImpairmentGroupsfromdatatable() throws Exception {

        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_admin_para_ParaImpairmentGroups");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_ParaImpairmentGroups_create_ParaImpairmentGroup");
        String name="testname";
        String code="cd";
        name=name+base.randomvalue(100);
        code=code+base.randomvalue(10);
        enterthevalueintotheelement(name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaImpairmentGroups_create_ParaImpairmentGroup_Name");
        enterthevalueintotheelement(code,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaImpairmentGroups_create_ParaImpairmentGroup_Code");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(name,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaImpairmentGroups");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(code,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(code,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaImpairmentGroups");


        Adminportaloptionontable("Delete","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaImpairmentGroups");
        base.wait(2);
        driver.switchTo().alert().accept();
        base.wait(2);

    }

    @Then("^Para Room Type option page$")
    public static void ParaRoomTypeoptionpage() throws Exception {

        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_admin_para_ParaRoomType");
        element_visiability("AdminPortalElements/Admin_para_page_Elements/button_admin_para_ParaRoomType_createParaRoomType");
        element_visiability("AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaRoomType");
        Verifytheactualandexceptedvalues("Para Room Type","AdminPortalElements/Admin_para_page_Elements/text_admin_para_header");
        element_visiability("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");

    }

    @Then("^Create Para Room Type button in the Para Room Type option page$")
    public static void CreateParaRoomTypebuttonintheParaRoomTypeoptionpage() throws Exception {

        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_admin_para_ParaRoomType");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_ParaRoomType_createParaRoomType");
        element_visiability("AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaRoomType_createParaRoomType_Type");
        element_visiability("AdminPortalElements/Admin_para_page_Elements/toggle_admin_para_ParaRoomType_createParaRoomType_Active");
        element_visiability("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");
        element_visiability("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Cancel");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Cancel");

    }

    @Then("^Create Para Room Type using positive values$")
    public static void CreateParaRoomTypeusingpositivevalues() throws Exception {
        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_admin_para_ParaRoomType");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_ParaRoomType_createParaRoomType");
        String type="testtype";
        type=type+base.randomvalue(100);
        enterthevalueintotheelement(type,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaRoomType_createParaRoomType_Type");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(type,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(type,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaRoomType");

        Adminportaloptionontable("Delete","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaRoomType");
        base.wait(2);
        driver.switchTo().alert().accept();
        base.wait(2);
    }

    @Then("^Create Para Room Type without enter the Type fields$")
    public static void CreateParaRoomTypewithoutentertheTypefields() throws Exception {
        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_admin_para_ParaRoomType");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_ParaRoomType_createParaRoomType");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");

        Verifytheactualandexceptedvalues("MANDATORY FIELDS REQUIRED\n"+"\n" +"Type cannot be empty","AdminPortalElements/Admin_login_page_Elements/text_Admin_login_error_alert");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Cancel");

    }

    @Then("^Create Para Room Type disable Action toggle$")
    public static void CreateParaRoomTypedisableActiontoggle() throws Exception {
        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_admin_para_ParaRoomType");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_ParaRoomType_createParaRoomType");
        String type="testtype";
        type=type+base.randomvalue(100);
        enterthevalueintotheelement(type,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaRoomType_createParaRoomType_Type");
        Jclick_on_element("AdminPortalElements/Admin_para_page_Elements/toggle_admin_para_ParaRoomType_createParaRoomType_Active");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(type,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable("No","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaRoomType");

        Adminportaloptionontable("Delete","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaRoomType");
        base.wait(2);
        driver.switchTo().alert().accept();
        base.wait(2);

    }

    @Then("^Create Para Room Type cancel the popup window$")
    public static void createParaRoomTypecancelthepopupwindow() throws Exception {
        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_admin_para_ParaRoomType");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_ParaRoomType_createParaRoomType");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Cancel");
        Verifytheactualandexceptedvalues("Para Room Type","AdminPortalElements/Admin_para_page_Elements/text_admin_para_header");

    }

    @Then("^Edit Para Room Type from data table$")
    public static void EditParaRoomTypefromdatatable() throws Exception {

        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_admin_para_ParaRoomType");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_ParaRoomType_createParaRoomType");
        String type="testtype";
        type=type+base.randomvalue(100);
        enterthevalueintotheelement(type,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaRoomType_createParaRoomType_Type");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(type,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(type,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaRoomType");

        Adminportaloptionontable("Edit","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaRoomType");

        element_visiability("AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaRoomType_createParaRoomType_Type");
        element_visiability("AdminPortalElements/Admin_para_page_Elements/toggle_admin_para_ParaRoomType_createParaRoomType_Active");
        element_visiability("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");
        element_visiability("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Cancel");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Cancel");
        Verifytheactualandexceptedvalues("Para Room Type","AdminPortalElements/Admin_para_page_Elements/text_admin_para_header");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(type,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(type,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaRoomType");

        Adminportaloptionontable("Delete","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaRoomType");
        base.wait(2);
        driver.switchTo().alert().accept();
        base.wait(2);
    }

    @Then("^Edit Para Room Type from data table using edit Type field$")
    public static void EditParaRoomTypefromdatatableusingeditTypefield() throws Exception {

        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_admin_para_ParaRoomType");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_ParaRoomType_createParaRoomType");
        String type="testtype";
        type=type+base.randomvalue(100);
        enterthevalueintotheelement(type,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaRoomType_createParaRoomType_Type");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(type,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(type,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaRoomType");

        Adminportaloptionontable("Edit","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaRoomType");

        type=type+"E"+base.randomvalue(100);

        enterthevalueintotheelement(type,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaRoomType_createParaRoomType_Type");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(type,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(type,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaRoomType");

        Adminportaloptionontable("Delete","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaRoomType");
        base.wait(2);
        driver.switchTo().alert().accept();
        base.wait(2);
    }

    @Then("^Edit Para Room Type from data table using edit Active status$")
    public static void EditParaRoomTypefromdatatableusingeditActivestatus() throws Exception {

        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_admin_para_ParaRoomType");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_ParaRoomType_createParaRoomType");
        String type="testtype";
        type=type+base.randomvalue(100);
        enterthevalueintotheelement(type,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaRoomType_createParaRoomType_Type");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(type,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(type,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaRoomType");

        Adminportaloptionontable("Edit","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaRoomType");

        Jclick_on_element("AdminPortalElements/Admin_para_page_Elements/toggle_admin_para_ParaRoomType_createParaRoomType_Active");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(type,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable("No","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaRoomType");

        Adminportaloptionontable("Delete","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaRoomType");
        base.wait(2);
        driver.switchTo().alert().accept();
        base.wait(2);

    }

    @Then("^Edit Para Room Type from data table using empty value for Type  field$")
    public static void EditParaRoomTypefromdatatableusingemptyvalueforTypefield() throws Exception {

        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_admin_para_ParaRoomType");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_ParaRoomType_createParaRoomType");
        String type="testtype";
        type=type+base.randomvalue(100);
        enterthevalueintotheelement(type,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaRoomType_createParaRoomType_Type");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(type,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(type,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaRoomType");

        Adminportaloptionontable("Edit","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaRoomType");
        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaRoomType_createParaRoomType_Type");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");

        Verifytheactualandexceptedvalues("MANDATORY FIELDS REQUIRED\n"+"\n" +"Type cannot be empty","AdminPortalElements/Admin_login_page_Elements/text_Admin_login_error_alert");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Cancel");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(type,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(type,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaRoomType");

        Adminportaloptionontable("Delete","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaRoomType");
        base.wait(2);
        driver.switchTo().alert().accept();
        base.wait(2);
    }

    @Then("^Edit Para Room Type from data table click on cancel button$")
    public static void EditParaRoomTypefromdatatableclickoncancelbutton() throws Exception {

        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_admin_para_ParaRoomType");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_ParaRoomType_createParaRoomType");
        String type="testtype";
        type=type+base.randomvalue(100);
        enterthevalueintotheelement(type,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaRoomType_createParaRoomType_Type");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(type,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(type,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaRoomType");

        Adminportaloptionontable("Edit","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaRoomType");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Cancel");
        Verifytheactualandexceptedvalues("Para Room Type","AdminPortalElements/Admin_para_page_Elements/text_admin_para_header");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(type,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(type,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaRoomType");

        Adminportaloptionontable("Delete","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaRoomType");
        base.wait(2);
        driver.switchTo().alert().accept();
        base.wait(2);
    }

    @Then("^search field in the Para Room Type data table$")
    public static void searchfieldintheParaRoomTypedatatable() throws Exception {

        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_admin_para_ParaRoomType");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_ParaRoomType_createParaRoomType");
        String type="testtype";
        type=type+base.randomvalue(100);
        enterthevalueintotheelement(type,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaRoomType_createParaRoomType_Type");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(type,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(type,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaRoomType");

        Adminportaloptionontable("Delete","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaRoomType");
        base.wait(2);
        driver.switchTo().alert().accept();
        base.wait(2);

    }

    @Then("^Delete Para Room Type from data table$")
    public static void DeleteParaRoomTypefromdatatable() throws Exception {

        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_admin_para_ParaRoomType");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_ParaRoomType_createParaRoomType");
        String type="testtype";
        type=type+base.randomvalue(100);
        enterthevalueintotheelement(type,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaRoomType_createParaRoomType_Type");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(type,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(type,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaRoomType");

        Adminportaloptionontable("Delete","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaRoomType");
        base.wait(2);
        driver.switchTo().alert().accept();
        base.wait(2);

    }

    @Then("^Paralympic Classes option page$")
    public static void ParalympicClassesoptionpage() throws Exception {

        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_admin_para_ParalympicClasses");
        Verifytheactualandexceptedvalues("Paralympic Class","AdminPortalElements/Admin_para_page_Elements/text_admin_para_header");
        element_visiability("AdminPortalElements/Admin_para_page_Elements/button_admin_para_ParalympicClasses_createParalympicClass");
        element_visiability("AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParalympicClasses");
        element_visiability("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");

    }

    @Then("^Create Paralympic Classes button in the Paralympic Classes option page$")
    public static void CreateParalympicClassesbuttonintheParalympicClassesoptionpage() throws Exception {
        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_admin_para_ParalympicClasses");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_ParalympicClasses_createParalympicClass");
        element_visiability("AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParalympicClasses_createParalympicClass_ParalympicClassName");
        element_visiability("AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParalympicClasses_createParalympicClass_Description");
        element_visiability("AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParalympicClasses_createParalympicClass_ClassId");
        element_visiability("AdminPortalElements/Admin_para_page_Elements/dropdown_admin_para_ParalympicClasses_createParalympicClass_ImpairmentGroup");
        element_visiability("AdminPortalElements/Admin_para_page_Elements/toggle_admin_para_ParalympicClasses_createParalympicClass_Active");
        element_visiability("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");
        element_visiability("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Cancel");

        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Cancel");
        Verifytheactualandexceptedvalues("Paralympic Class","AdminPortalElements/Admin_para_page_Elements/text_admin_para_header");
    }

    @Then("^Create Paralympic Classes using positive values$")
    public static void CreateParalympicClassesusingpositivevalues() throws Exception {

        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_admin_para_ParalympicClasses");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_ParalympicClasses_createParalympicClass");
        String Paralympic_Class_Name="testParalympicClassName";
        String Description="testDescription";
        String Class_Id="CId";
        Paralympic_Class_Name=Paralympic_Class_Name+base.randomvalue(10);
        Description=Description+base.randomvalue(10);
        Class_Id=Class_Id+base.randomvalue(10);

        enterthevalueintotheelement(Paralympic_Class_Name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParalympicClasses_createParalympicClass_ParalympicClassName");
        enterthevalueintotheelement(Description,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParalympicClasses_createParalympicClass_Description");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/dropdown_admin_para_ParalympicClasses_createParalympicClass_ImpairmentGroup");
        //Selectdropdownbasedonindex(0,"AdminPortalElements/Admin_para_page_Elements/dropdown_admin_para_ParalympicClasses_createParalympicClass_ImpairmentGroup");
        selectlistactionoption(1,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParalympicClasses_createParalympicClass_ImpairmentGroup_list");
        enterthevalueintotheelement(Class_Id,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParalympicClasses_createParalympicClass_ClassId");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");


        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(Paralympic_Class_Name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(Paralympic_Class_Name,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParalympicClasses");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(Paralympic_Class_Name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(Description,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParalympicClasses");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(Paralympic_Class_Name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(Class_Id,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParalympicClasses");

        Adminportaloptionontable("Delete","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParalympicClasses");
        base.wait(2);
        driver.switchTo().alert().accept();
        base.wait(2);

    }

    @Then("^Create Paralympic Classes without enter the Paralympic Class Name fields$")
    public static void CreateParalympicClasseswithoutentertheParalympicClassNamefields() throws Exception {

        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_admin_para_ParalympicClasses");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_ParalympicClasses_createParalympicClass");
        String Paralympic_Class_Name="testParalympicClassName";
        String Description="testDescription";
        String Class_Id="CId";
        Paralympic_Class_Name=Paralympic_Class_Name+base.randomvalue(10);
        Description=Description+base.randomvalue(10);
        Class_Id=Class_Id+base.randomvalue(10);

        enterthevalueintotheelement(Description,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParalympicClasses_createParalympicClass_Description");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/dropdown_admin_para_ParalympicClasses_createParalympicClass_ImpairmentGroup");
        //Selectdropdownbasedonindex(0,"AdminPortalElements/Admin_para_page_Elements/dropdown_admin_para_ParalympicClasses_createParalympicClass_ImpairmentGroup");
        selectlistactionoption(1,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParalympicClasses_createParalympicClass_ImpairmentGroup_list");
        enterthevalueintotheelement(Class_Id,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParalympicClasses_createParalympicClass_ClassId");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");

        Verifytheactualandexceptedvalues("MANDATORY FIELDS REQUIRED\n"+"\n" +"Paralympic Class Name cannot be empty","AdminPortalElements/Admin_login_page_Elements/text_Admin_login_error_alert");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Cancel");

    }

    @Then("^Create Paralympic Classes without select the Impairment Group dropdown field$")
    public static void CreateParalympicClasseswithoutselecttheImpairmentGroupdropdownfield() throws Exception {
        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_admin_para_ParalympicClasses");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_ParalympicClasses_createParalympicClass");
        String Paralympic_Class_Name="testParalympicClassName";
        String Description="testDescription";
        String Class_Id="CId";
        Paralympic_Class_Name=Paralympic_Class_Name+base.randomvalue(10);
        Description=Description+base.randomvalue(10);
        Class_Id=Class_Id+base.randomvalue(10);

        enterthevalueintotheelement(Paralympic_Class_Name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParalympicClasses_createParalympicClass_ParalympicClassName");
        enterthevalueintotheelement(Description,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParalympicClasses_createParalympicClass_Description");

        enterthevalueintotheelement(Class_Id,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParalympicClasses_createParalympicClass_ClassId");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");

        Verifytheactualandexceptedvalues("MANDATORY FIELDS REQUIRED\n"+"\n" +"Impairment Group cannot be empty","AdminPortalElements/Admin_login_page_Elements/text_Admin_login_error_alert");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Cancel");


    }

    @Then("^Create Paralympic Classes Impairment Group dropdown field values$")
    public static void CreateParalympicClassesImpairmentGroupdropdownfieldvalues() throws Exception {

        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_admin_para_ParaImpairmentGroups");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_ParaImpairmentGroups_create_ParaImpairmentGroup");
        String name="testname";
        String code="cd";
        name=name+base.randomvalue(100);
        code=code+base.randomvalue(10);
        enterthevalueintotheelement(name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaImpairmentGroups_create_ParaImpairmentGroup_Name");
        enterthevalueintotheelement(code,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaImpairmentGroups_create_ParaImpairmentGroup_Code");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");

        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_admin_para_ParalympicClasses");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_ParalympicClasses_createParalympicClass");

        click_on_element("AdminPortalElements/Admin_para_page_Elements/dropdown_admin_para_ParalympicClasses_createParalympicClass_ImpairmentGroup");
        //Selectdropdownbasedonindex(0,"AdminPortalElements/Admin_para_page_Elements/dropdown_admin_para_ParalympicClasses_createParalympicClass_ImpairmentGroup");

        checklistvalues(name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParalympicClasses_createParalympicClass_ImpairmentGroup_list");

        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Cancel");
        Verifytheactualandexceptedvalues("Paralympic Class","AdminPortalElements/Admin_para_page_Elements/text_admin_para_header");

        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_admin_para_ParaImpairmentGroups");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(name,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaImpairmentGroups");

        Adminportaloptionontable("Delete","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaImpairmentGroups");
        base.wait(2);
        driver.switchTo().alert().accept();
        base.wait(2);

    }

    @Then("^Create Paralympic Classes without enter the Description fields$")
    public static void CreateParalympicClasseswithoutentertheDescriptionfields() throws Exception {
        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_admin_para_ParalympicClasses");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_ParalympicClasses_createParalympicClass");
        String Paralympic_Class_Name="testParalympicClassName";
        String Description="testDescription";
        String Class_Id="CId";
        Paralympic_Class_Name=Paralympic_Class_Name+base.randomvalue(10);
        Description=Description+base.randomvalue(10);
        Class_Id=Class_Id+base.randomvalue(10);

        enterthevalueintotheelement(Paralympic_Class_Name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParalympicClasses_createParalympicClass_ParalympicClassName");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/dropdown_admin_para_ParalympicClasses_createParalympicClass_ImpairmentGroup");
        //Selectdropdownbasedonindex(0,"AdminPortalElements/Admin_para_page_Elements/dropdown_admin_para_ParalympicClasses_createParalympicClass_ImpairmentGroup");
        selectlistactionoption(1,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParalympicClasses_createParalympicClass_ImpairmentGroup_list");
        enterthevalueintotheelement(Class_Id,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParalympicClasses_createParalympicClass_ClassId");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");

        Verifytheactualandexceptedvalues("MANDATORY FIELDS REQUIRED\n"+"\n" +"Description cannot be empty","AdminPortalElements/Admin_login_page_Elements/text_Admin_login_error_alert");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Cancel");

    }

    @Then("^Create Paralympic Classes without enter the Class Id fields$")
    public static void CreateParalympicClasseswithoutentertheClassIdfields() throws Exception {

        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_admin_para_ParalympicClasses");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_ParalympicClasses_createParalympicClass");
        String Paralympic_Class_Name="testParalympicClassName";
        String Description="testDescription";
        String Class_Id="CId";
        Paralympic_Class_Name=Paralympic_Class_Name+base.randomvalue(10);
        Description=Description+base.randomvalue(10);
        Class_Id=Class_Id+base.randomvalue(10);

        enterthevalueintotheelement(Paralympic_Class_Name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParalympicClasses_createParalympicClass_ParalympicClassName");
        enterthevalueintotheelement(Description,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParalympicClasses_createParalympicClass_Description");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/dropdown_admin_para_ParalympicClasses_createParalympicClass_ImpairmentGroup");
        //Selectdropdownbasedonindex(0,"AdminPortalElements/Admin_para_page_Elements/dropdown_admin_para_ParalympicClasses_createParalympicClass_ImpairmentGroup");
        selectlistactionoption(2,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParalympicClasses_createParalympicClass_ImpairmentGroup_list");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");

        Verifytheactualandexceptedvalues("MANDATORY FIELDS REQUIRED\n"+"\n" +"Class Id cannot be empty","AdminPortalElements/Admin_login_page_Elements/text_Admin_login_error_alert");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Cancel");

    }

    @Then("^Create Paralympic Classes disable Action toggle$")
    public static void CreateParalympicClassesdisableActiontoggle() throws Exception {

        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_admin_para_ParalympicClasses");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_ParalympicClasses_createParalympicClass");
        String Paralympic_Class_Name="testParalympicClassName";
        String Description="testDescription";
        String Class_Id="CId";
        Paralympic_Class_Name=Paralympic_Class_Name+base.randomvalue(10);
        Description=Description+base.randomvalue(10);
        Class_Id=Class_Id+base.randomvalue(10);

        enterthevalueintotheelement(Paralympic_Class_Name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParalympicClasses_createParalympicClass_ParalympicClassName");
        enterthevalueintotheelement(Description,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParalympicClasses_createParalympicClass_Description");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/dropdown_admin_para_ParalympicClasses_createParalympicClass_ImpairmentGroup");
        //Selectdropdownbasedonindex(0,"AdminPortalElements/Admin_para_page_Elements/dropdown_admin_para_ParalympicClasses_createParalympicClass_ImpairmentGroup");
        selectlistactionoption(1,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParalympicClasses_createParalympicClass_ImpairmentGroup_list");
        enterthevalueintotheelement(Class_Id,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParalympicClasses_createParalympicClass_ClassId");
        Jclick_on_element("AdminPortalElements/Admin_para_page_Elements/toggle_admin_para_ParalympicClasses_createParalympicClass_Active");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");


        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(Paralympic_Class_Name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(Paralympic_Class_Name,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParalympicClasses");
        AdminportalSearchthevalueintothetable(Description,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParalympicClasses");
        AdminportalSearchthevalueintothetable(Class_Id,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParalympicClasses");
        AdminportalSearchthevalueintothetable("No","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParalympicClasses");


        Adminportaloptionontable("Delete","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParalympicClasses");
        base.wait(2);
        driver.switchTo().alert().accept();
        base.wait(2);

    }

    @Then("^Create Paralympic Classes cancel the popup window$")
    public static void CreateParalympicClassescancelthepopupwindow() throws Exception {
        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_admin_para_ParalympicClasses");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_ParalympicClasses_createParalympicClass");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Cancel");
        Verifytheactualandexceptedvalues("Paralympic Class","AdminPortalElements/Admin_para_page_Elements/text_admin_para_header");
    }

    @Then("^Edit Paralympic Classes from data table$")
    public static void EditParalympicClassesfromdatatable() throws Exception {

        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_admin_para_ParalympicClasses");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_ParalympicClasses_createParalympicClass");
        String Paralympic_Class_Name="testParalympicClassName";
        String Description="testDescription";
        String Class_Id="CId";
        Paralympic_Class_Name=Paralympic_Class_Name+base.randomvalue(10);
        Description=Description+base.randomvalue(10);
        Class_Id=Class_Id+base.randomvalue(10);

        enterthevalueintotheelement(Paralympic_Class_Name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParalympicClasses_createParalympicClass_ParalympicClassName");
        enterthevalueintotheelement(Description,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParalympicClasses_createParalympicClass_Description");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/dropdown_admin_para_ParalympicClasses_createParalympicClass_ImpairmentGroup");
        //Selectdropdownbasedonindex(0,"AdminPortalElements/Admin_para_page_Elements/dropdown_admin_para_ParalympicClasses_createParalympicClass_ImpairmentGroup");
        selectlistactionoption(1,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParalympicClasses_createParalympicClass_ImpairmentGroup_list");
        enterthevalueintotheelement(Class_Id,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParalympicClasses_createParalympicClass_ClassId");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");


        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(Paralympic_Class_Name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(Paralympic_Class_Name,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParalympicClasses");
        AdminportalSearchthevalueintothetable(Description,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParalympicClasses");
        AdminportalSearchthevalueintothetable(Class_Id,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParalympicClasses");

        Adminportaloptionontable("Edit","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParalympicClasses");

        element_visiability("AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParalympicClasses_createParalympicClass_ParalympicClassName");
        element_visiability("AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParalympicClasses_createParalympicClass_Description");
        element_visiability("AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParalympicClasses_createParalympicClass_ClassId");
        element_visiability("AdminPortalElements/Admin_para_page_Elements/dropdown_admin_para_ParalympicClasses_createParalympicClass_ImpairmentGroup");
        element_visiability("AdminPortalElements/Admin_para_page_Elements/toggle_admin_para_ParalympicClasses_createParalympicClass_Active");
        element_visiability("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");
        element_visiability("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Cancel");

        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Cancel");
        Verifytheactualandexceptedvalues("Paralympic Class","AdminPortalElements/Admin_para_page_Elements/text_admin_para_header");


    }

    @Then("^Edit Paralympic Classes from data table using edit Paralympic Class Name field$")
    public static void EditParalympicClassesfromdatatableusingeditParalympicClassNamefield() throws Exception {

        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_admin_para_ParalympicClasses");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_ParalympicClasses_createParalympicClass");
        String Paralympic_Class_Name="testParalympicClassName";
        String Description="testDescription";
        String Class_Id="CId";
        Paralympic_Class_Name=Paralympic_Class_Name+base.randomvalue(10);
        Description=Description+base.randomvalue(10);
        Class_Id=Class_Id+base.randomvalue(10);

        enterthevalueintotheelement(Paralympic_Class_Name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParalympicClasses_createParalympicClass_ParalympicClassName");
        enterthevalueintotheelement(Description,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParalympicClasses_createParalympicClass_Description");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/dropdown_admin_para_ParalympicClasses_createParalympicClass_ImpairmentGroup");
        //Selectdropdownbasedonindex(0,"AdminPortalElements/Admin_para_page_Elements/dropdown_admin_para_ParalympicClasses_createParalympicClass_ImpairmentGroup");
        selectlistactionoption(1,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParalympicClasses_createParalympicClass_ImpairmentGroup_list");
        enterthevalueintotheelement(Class_Id,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParalympicClasses_createParalympicClass_ClassId");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");


        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(Paralympic_Class_Name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(Paralympic_Class_Name,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParalympicClasses");
        AdminportalSearchthevalueintothetable(Description,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParalympicClasses");
        AdminportalSearchthevalueintothetable(Class_Id,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParalympicClasses");

        Adminportaloptionontable("Edit","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParalympicClasses");

        Paralympic_Class_Name=Paralympic_Class_Name+"E"+base.randomvalue(10);
        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParalympicClasses_createParalympicClass_ParalympicClassName");
        enterthevalueintotheelement(Paralympic_Class_Name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParalympicClasses_createParalympicClass_ParalympicClassName");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(Paralympic_Class_Name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(Paralympic_Class_Name,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParalympicClasses");

        Adminportaloptionontable("Delete","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParalympicClasses");
        base.wait(2);
        driver.switchTo().alert().accept();
        base.wait(2);

    }

    @Then("^Edit Paralympic Classes from data table using edit Impairment Group  field$")
    public static void EditParalympicClassesfromdatatableusingeditImpairmentGroupfield() throws Exception {

        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_admin_para_ParalympicClasses");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_ParalympicClasses_createParalympicClass");
        String Paralympic_Class_Name="testParalympicClassName";
        String Description="testDescription";
        String Class_Id="CId";
        Paralympic_Class_Name=Paralympic_Class_Name+base.randomvalue(10);
        Description=Description+base.randomvalue(10);
        Class_Id=Class_Id+base.randomvalue(10);

        enterthevalueintotheelement(Paralympic_Class_Name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParalympicClasses_createParalympicClass_ParalympicClassName");
        enterthevalueintotheelement(Description,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParalympicClasses_createParalympicClass_Description");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/dropdown_admin_para_ParalympicClasses_createParalympicClass_ImpairmentGroup");
        //Selectdropdownbasedonindex(0,"AdminPortalElements/Admin_para_page_Elements/dropdown_admin_para_ParalympicClasses_createParalympicClass_ImpairmentGroup");
        selectlistactionvalue("PI-ST","AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParalympicClasses_createParalympicClass_ImpairmentGroup_list");
        enterthevalueintotheelement(Class_Id,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParalympicClasses_createParalympicClass_ClassId");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");


        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(Paralympic_Class_Name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(Paralympic_Class_Name,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParalympicClasses");
        AdminportalSearchthevalueintothetable(Description,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParalympicClasses");
        AdminportalSearchthevalueintothetable(Class_Id,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParalympicClasses");
        AdminportalSearchthevalueintothetable("PI-ST","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParalympicClasses");

        Adminportaloptionontable("Edit","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParalympicClasses");

        AdminportalSearchthevalueintothetable("PI-WC","AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParalympicClasses_createParalympicClass_ImpairmentGroup_list");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(Paralympic_Class_Name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable("PI-WC","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParalympicClasses");

        Adminportaloptionontable("Delete","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParalympicClasses");
        base.wait(2);
        driver.switchTo().alert().accept();
        base.wait(2);
    }

    @Then("^Edit Paralympic Classes from data table using edit Description field$")
    public static void EditParalympicClassesfromdatatableusingeditDescriptionfield() throws Exception {

        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_admin_para_ParalympicClasses");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_ParalympicClasses_createParalympicClass");
        String Paralympic_Class_Name="testParalympicClassName";
        String Description="testDescription";
        String Class_Id="CId";
        Paralympic_Class_Name=Paralympic_Class_Name+base.randomvalue(10);
        Description=Description+base.randomvalue(10);
        Class_Id=Class_Id+base.randomvalue(10);

        enterthevalueintotheelement(Paralympic_Class_Name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParalympicClasses_createParalympicClass_ParalympicClassName");
        enterthevalueintotheelement(Description,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParalympicClasses_createParalympicClass_Description");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/dropdown_admin_para_ParalympicClasses_createParalympicClass_ImpairmentGroup");
        //Selectdropdownbasedonindex(0,"AdminPortalElements/Admin_para_page_Elements/dropdown_admin_para_ParalympicClasses_createParalympicClass_ImpairmentGroup");
        selectlistactionvalue("PI-ST","AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParalympicClasses_createParalympicClass_ImpairmentGroup_list");
        enterthevalueintotheelement(Class_Id,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParalympicClasses_createParalympicClass_ClassId");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(Paralympic_Class_Name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(Paralympic_Class_Name,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParalympicClasses");
        AdminportalSearchthevalueintothetable(Description,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParalympicClasses");
        AdminportalSearchthevalueintothetable(Class_Id,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParalympicClasses");
        AdminportalSearchthevalueintothetable("PI-ST","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParalympicClasses");

        Description=Description+"E"+base.randomvalue(10);

        Adminportaloptionontable("Edit","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParalympicClasses");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParalympicClasses_createParalympicClass_Description");
        enterthevalueintotheelement(Description,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParalympicClasses_createParalympicClass_Description");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(Paralympic_Class_Name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(Description,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParalympicClasses");

        Adminportaloptionontable("Delete","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParalympicClasses");
        base.wait(2);
        driver.switchTo().alert().accept();
        base.wait(2);
    }

    @Then("^Edit Paralympic Classes from data table using edit Class Id field$")
    public static void EditParalympicClassesfromdatatableusingeditClassIdfield() throws Exception {

        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_admin_para_ParalympicClasses");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_ParalympicClasses_createParalympicClass");
        String Paralympic_Class_Name="testParalympicClassName";
        String Description="testDescription";
        String Class_Id="C";
        Paralympic_Class_Name=Paralympic_Class_Name+base.randomvalue(10);
        Description=Description+base.randomvalue(10);
        Class_Id=Class_Id+base.randomvalue(10);

        enterthevalueintotheelement(Paralympic_Class_Name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParalympicClasses_createParalympicClass_ParalympicClassName");
        enterthevalueintotheelement(Description,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParalympicClasses_createParalympicClass_Description");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/dropdown_admin_para_ParalympicClasses_createParalympicClass_ImpairmentGroup");
        //Selectdropdownbasedonindex(0,"AdminPortalElements/Admin_para_page_Elements/dropdown_admin_para_ParalympicClasses_createParalympicClass_ImpairmentGroup");
        selectlistactionvalue("PI-ST","AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParalympicClasses_createParalympicClass_ImpairmentGroup_list");
        enterthevalueintotheelement(Class_Id,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParalympicClasses_createParalympicClass_ClassId");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(Paralympic_Class_Name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(Paralympic_Class_Name,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParalympicClasses");
        AdminportalSearchthevalueintothetable(Description,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParalympicClasses");
        AdminportalSearchthevalueintothetable(Class_Id,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParalympicClasses");
        AdminportalSearchthevalueintothetable("PI-ST","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParalympicClasses");


        Class_Id=Class_Id+"E"+base.randomvalue(10);

        Adminportaloptionontable("Edit","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParalympicClasses");


        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParalympicClasses_createParalympicClass_ClassId");
        enterthevalueintotheelement(Class_Id,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParalympicClasses_createParalympicClass_ClassId");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");


        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(Paralympic_Class_Name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(Class_Id,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParalympicClasses");

        Adminportaloptionontable("Delete","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParalympicClasses");
        base.wait(2);
        driver.switchTo().alert().accept();
        base.wait(2);

    }

    @Then("^Edit Paralympic Classes from data table using edit all fields$")
    public static void EditParalympicClassesfromdatatableusingeditallfields() throws Exception {

        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_admin_para_ParalympicClasses");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_ParalympicClasses_createParalympicClass");
        String Paralympic_Class_Name="testParalympicClassName";
        String Description="testDescription";
        String Class_Id="C";
        Paralympic_Class_Name=Paralympic_Class_Name+base.randomvalue(10);
        Description=Description+base.randomvalue(10);
        Class_Id=Class_Id+base.randomvalue(10);

        enterthevalueintotheelement(Paralympic_Class_Name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParalympicClasses_createParalympicClass_ParalympicClassName");
        enterthevalueintotheelement(Description,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParalympicClasses_createParalympicClass_Description");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/dropdown_admin_para_ParalympicClasses_createParalympicClass_ImpairmentGroup");
        //Selectdropdownbasedonindex(0,"AdminPortalElements/Admin_para_page_Elements/dropdown_admin_para_ParalympicClasses_createParalympicClass_ImpairmentGroup");
        selectlistactionvalue("PI-ST","AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParalympicClasses_createParalympicClass_ImpairmentGroup_list");
        enterthevalueintotheelement(Class_Id,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParalympicClasses_createParalympicClass_ClassId");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(Paralympic_Class_Name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(Paralympic_Class_Name,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParalympicClasses");
        AdminportalSearchthevalueintothetable(Description,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParalympicClasses");
        AdminportalSearchthevalueintothetable(Class_Id,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParalympicClasses");
        AdminportalSearchthevalueintothetable("PI-ST","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParalympicClasses");

        Paralympic_Class_Name=Paralympic_Class_Name+"E"+base.randomvalue(10);
        Description=Description+"E"+base.randomvalue(10);
        Class_Id=Class_Id+"E"+base.randomvalue(10);

        Adminportaloptionontable("Edit","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParalympicClasses");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParalympicClasses_createParalympicClass_ParalympicClassName");
        enterthevalueintotheelement(Paralympic_Class_Name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParalympicClasses_createParalympicClass_ParalympicClassName");
        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParalympicClasses_createParalympicClass_Description");
        enterthevalueintotheelement(Description,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParalympicClasses_createParalympicClass_Description");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/dropdown_admin_para_ParalympicClasses_createParalympicClass_ImpairmentGroup");
        //Selectdropdownbasedonindex(0,"AdminPortalElements/Admin_para_page_Elements/dropdown_admin_para_ParalympicClasses_createParalympicClass_ImpairmentGroup");
        selectlistactionvalue("PI-WC","AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParalympicClasses_createParalympicClass_ImpairmentGroup_list");
        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParalympicClasses_createParalympicClass_ClassId");
        enterthevalueintotheelement(Class_Id,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParalympicClasses_createParalympicClass_ClassId");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");


        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(Paralympic_Class_Name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(Paralympic_Class_Name,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParalympicClasses");
        AdminportalSearchthevalueintothetable(Description,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParalympicClasses");
        AdminportalSearchthevalueintothetable(Class_Id,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParalympicClasses");
        AdminportalSearchthevalueintothetable("PI-WC","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParalympicClasses");

        Adminportaloptionontable("Delete","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParalympicClasses");
        base.wait(2);
        driver.switchTo().alert().accept();
        base.wait(2);
    }

    @Then("^Edit Paralympic Classes from data table using edit Active status$")
    public static void EditParalympicClassesfromdatatableusingeditActivestatus() throws Exception {

        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_admin_para_ParalympicClasses");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_ParalympicClasses_createParalympicClass");
        String Paralympic_Class_Name="testParalympicClassName";
        String Description="testDescription";
        String Class_Id="C";
        Paralympic_Class_Name=Paralympic_Class_Name+base.randomvalue(10);
        Description=Description+base.randomvalue(10);
        Class_Id=Class_Id+base.randomvalue(10);

        enterthevalueintotheelement(Paralympic_Class_Name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParalympicClasses_createParalympicClass_ParalympicClassName");
        enterthevalueintotheelement(Description,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParalympicClasses_createParalympicClass_Description");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/dropdown_admin_para_ParalympicClasses_createParalympicClass_ImpairmentGroup");
        //Selectdropdownbasedonindex(0,"AdminPortalElements/Admin_para_page_Elements/dropdown_admin_para_ParalympicClasses_createParalympicClass_ImpairmentGroup");
        selectlistactionvalue("PI-ST","AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParalympicClasses_createParalympicClass_ImpairmentGroup_list");
        enterthevalueintotheelement(Class_Id,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParalympicClasses_createParalympicClass_ClassId");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(Paralympic_Class_Name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(Paralympic_Class_Name,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParalympicClasses");
        AdminportalSearchthevalueintothetable(Description,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParalympicClasses");
        AdminportalSearchthevalueintothetable(Class_Id,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParalympicClasses");
        AdminportalSearchthevalueintothetable("PI-ST","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParalympicClasses");

        Adminportaloptionontable("Edit","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParalympicClasses");

        Jclick_on_element("AdminPortalElements/Admin_para_page_Elements/toggle_admin_para_ParalympicClasses_createParalympicClass_Active");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");


        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(Paralympic_Class_Name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable("No","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParalympicClasses");

        Adminportaloptionontable("Delete","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParalympicClasses");
        base.wait(2);
        driver.switchTo().alert().accept();
        base.wait(2);
    }

    @Then("^Edit Paralympic Classes from data table using empty value for Paralympic Class Name field$")
    public static void EditParalympicClassesfromdatatableusingemptyvalueforParalympicClassNamefield() throws Exception {

        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_admin_para_ParalympicClasses");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_ParalympicClasses_createParalympicClass");
        String Paralympic_Class_Name="testParalympicClassName";
        String Description="testDescription";
        String Class_Id="C";
        Paralympic_Class_Name=Paralympic_Class_Name+base.randomvalue(10);
        Description=Description+base.randomvalue(10);
        Class_Id=Class_Id+base.randomvalue(10);

        enterthevalueintotheelement(Paralympic_Class_Name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParalympicClasses_createParalympicClass_ParalympicClassName");
        enterthevalueintotheelement(Description,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParalympicClasses_createParalympicClass_Description");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/dropdown_admin_para_ParalympicClasses_createParalympicClass_ImpairmentGroup");
        //Selectdropdownbasedonindex(0,"AdminPortalElements/Admin_para_page_Elements/dropdown_admin_para_ParalympicClasses_createParalympicClass_ImpairmentGroup");
        selectlistactionvalue("PI-ST","AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParalympicClasses_createParalympicClass_ImpairmentGroup_list");
        enterthevalueintotheelement(Class_Id,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParalympicClasses_createParalympicClass_ClassId");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(Paralympic_Class_Name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(Paralympic_Class_Name,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParalympicClasses");
        AdminportalSearchthevalueintothetable(Description,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParalympicClasses");
        AdminportalSearchthevalueintothetable(Class_Id,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParalympicClasses");
        AdminportalSearchthevalueintothetable("PI-ST","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParalympicClasses");

        Adminportaloptionontable("Edit","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParalympicClasses");
        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParalympicClasses_createParalympicClass_ParalympicClassName");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");

        Verifytheactualandexceptedvalues("MANDATORY FIELDS REQUIRED\n"+"\n" +"Paralympic Class Name cannot be empty","AdminPortalElements/Admin_login_page_Elements/text_Admin_login_error_alert");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Cancel");
        Verifytheactualandexceptedvalues("Paralympic Class","AdminPortalElements/Admin_para_page_Elements/text_admin_para_header");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(Paralympic_Class_Name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable("No","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParalympicClasses");

        Adminportaloptionontable("Delete","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParalympicClasses");
        base.wait(2);
        driver.switchTo().alert().accept();
        base.wait(2);

    }

    @Then("^Edit Paralympic Classes from data table using empty value for Impairment Group field$")
    public static void EditParalympicClassesfromdatatableusingemptyvalueforImpairmentGroupfield() throws Exception {

        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_admin_para_ParalympicClasses");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_ParalympicClasses_createParalympicClass");
        String Paralympic_Class_Name="testParalympicClassName";
        String Description="testDescription";
        String Class_Id="C";
        Paralympic_Class_Name=Paralympic_Class_Name+base.randomvalue(10);
        Description=Description+base.randomvalue(10);
        Class_Id=Class_Id+base.randomvalue(10);

        enterthevalueintotheelement(Paralympic_Class_Name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParalympicClasses_createParalympicClass_ParalympicClassName");
        enterthevalueintotheelement(Description,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParalympicClasses_createParalympicClass_Description");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/dropdown_admin_para_ParalympicClasses_createParalympicClass_ImpairmentGroup");
        //Selectdropdownbasedonindex(0,"AdminPortalElements/Admin_para_page_Elements/dropdown_admin_para_ParalympicClasses_createParalympicClass_ImpairmentGroup");
        selectlistactionvalue("PI-ST","AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParalympicClasses_createParalympicClass_ImpairmentGroup_list");
        enterthevalueintotheelement(Class_Id,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParalympicClasses_createParalympicClass_ClassId");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(Paralympic_Class_Name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(Paralympic_Class_Name,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParalympicClasses");
        AdminportalSearchthevalueintothetable(Description,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParalympicClasses");
        AdminportalSearchthevalueintothetable(Class_Id,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParalympicClasses");
        AdminportalSearchthevalueintothetable("PI-ST","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParalympicClasses");

        Adminportaloptionontable("Edit","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParalympicClasses");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/dropdown_admin_para_ParalympicClasses_createParalympicClass_ImpairmentGroup");
        //Selectdropdownbasedonindex(0,"AdminPortalElements/Admin_para_page_Elements/dropdown_admin_para_ParalympicClasses_createParalympicClass_ImpairmentGroup");
        selectlistactionvalue("PI-ST","AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParalympicClasses_createParalympicClass_ImpairmentGroup_list");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");

        Verifytheactualandexceptedvalues("MANDATORY FIELDS REQUIRED\n"+"\n" +"Impairment Group cannot be empty","AdminPortalElements/Admin_login_page_Elements/text_Admin_login_error_alert");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Cancel");
        Verifytheactualandexceptedvalues("Paralympic Class","AdminPortalElements/Admin_para_page_Elements/text_admin_para_header");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(Paralympic_Class_Name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(Paralympic_Class_Name,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParalympicClasses");

        Adminportaloptionontable("Delete","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParalympicClasses");
        base.wait(2);
        driver.switchTo().alert().accept();
        base.wait(2);

    }

    @Then("^Edit Paralympic Classes from data table using empty value for Description field$")
    public static void EditParalympicClassesfromdatatableusingemptyvalueforDescriptionfield() throws Exception {

        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_admin_para_ParalympicClasses");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_ParalympicClasses_createParalympicClass");
        String Paralympic_Class_Name="testParalympicClassName";
        String Description="testDescription";
        String Class_Id="C";
        Paralympic_Class_Name=Paralympic_Class_Name+base.randomvalue(10);
        Description=Description+base.randomvalue(10);
        Class_Id=Class_Id+base.randomvalue(10);

        enterthevalueintotheelement(Paralympic_Class_Name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParalympicClasses_createParalympicClass_ParalympicClassName");
        enterthevalueintotheelement(Description,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParalympicClasses_createParalympicClass_Description");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/dropdown_admin_para_ParalympicClasses_createParalympicClass_ImpairmentGroup");
        //Selectdropdownbasedonindex(0,"AdminPortalElements/Admin_para_page_Elements/dropdown_admin_para_ParalympicClasses_createParalympicClass_ImpairmentGroup");
        selectlistactionvalue("PI-ST","AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParalympicClasses_createParalympicClass_ImpairmentGroup_list");
        enterthevalueintotheelement(Class_Id,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParalympicClasses_createParalympicClass_ClassId");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(Paralympic_Class_Name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(Paralympic_Class_Name,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParalympicClasses");
        AdminportalSearchthevalueintothetable(Description,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParalympicClasses");
        AdminportalSearchthevalueintothetable(Class_Id,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParalympicClasses");
        AdminportalSearchthevalueintothetable("PI-ST","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParalympicClasses");



        Adminportaloptionontable("Edit","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParalympicClasses");
        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParalympicClasses_createParalympicClass_Description");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");

        Verifytheactualandexceptedvalues("MANDATORY FIELDS REQUIRED\n"+"\n" +"Description cannot be empty","AdminPortalElements/Admin_login_page_Elements/text_Admin_login_error_alert");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Cancel");
        Verifytheactualandexceptedvalues("Paralympic Class","AdminPortalElements/Admin_para_page_Elements/text_admin_para_header");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(Paralympic_Class_Name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(Paralympic_Class_Name,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParalympicClasses");

        Adminportaloptionontable("Delete","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParalympicClasses");
        base.wait(2);
        driver.switchTo().alert().accept();
        base.wait(2);


    }


    @Then("^Edit Paralympic Classes from data table using empty value for Class Id field$")
    public static void EditParalympicClassesfromdatatableusingemptyvalueforClassIdfield() throws Exception {

        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_admin_para_ParalympicClasses");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_ParalympicClasses_createParalympicClass");
        String Paralympic_Class_Name="testParalympicClassName";
        String Description="testDescription";
        String Class_Id="C";
        Paralympic_Class_Name=Paralympic_Class_Name+base.randomvalue(10);
        Description=Description+base.randomvalue(10);
        Class_Id=Class_Id+base.randomvalue(10);

        enterthevalueintotheelement(Paralympic_Class_Name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParalympicClasses_createParalympicClass_ParalympicClassName");
        enterthevalueintotheelement(Description,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParalympicClasses_createParalympicClass_Description");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/dropdown_admin_para_ParalympicClasses_createParalympicClass_ImpairmentGroup");
        //Selectdropdownbasedonindex(0,"AdminPortalElements/Admin_para_page_Elements/dropdown_admin_para_ParalympicClasses_createParalympicClass_ImpairmentGroup");
        selectlistactionvalue("PI-ST","AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParalympicClasses_createParalympicClass_ImpairmentGroup_list");
        enterthevalueintotheelement(Class_Id,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParalympicClasses_createParalympicClass_ClassId");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(Paralympic_Class_Name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(Paralympic_Class_Name,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParalympicClasses");
        AdminportalSearchthevalueintothetable(Description,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParalympicClasses");
        AdminportalSearchthevalueintothetable(Class_Id,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParalympicClasses");
        AdminportalSearchthevalueintothetable("PI-ST","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParalympicClasses");


        Adminportaloptionontable("Edit","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParalympicClasses");
        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParalympicClasses_createParalympicClass_ClassId");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");

        Verifytheactualandexceptedvalues("MANDATORY FIELDS REQUIRED\n"+"\n" +"Class Id cannot be empty","AdminPortalElements/Admin_login_page_Elements/text_Admin_login_error_alert");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Cancel");
        Verifytheactualandexceptedvalues("Paralympic Class","AdminPortalElements/Admin_para_page_Elements/text_admin_para_header");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(Paralympic_Class_Name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(Paralympic_Class_Name,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParalympicClasses");

        Adminportaloptionontable("Delete","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParalympicClasses");
        base.wait(2);
        driver.switchTo().alert().accept();
        base.wait(2);

    }

    @Then("^Edit Paralympic Classes from data table using empty value for all fields$")
    public static void EditParalympicClassesfromdatatableusingemptyvalueforallfields() throws Exception {

        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_admin_para_ParalympicClasses");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_ParalympicClasses_createParalympicClass");
        String Paralympic_Class_Name="testParalympicClassName";
        String Description="testDescription";
        String Class_Id="C";
        Paralympic_Class_Name=Paralympic_Class_Name+base.randomvalue(10);
        Description=Description+base.randomvalue(10);
        Class_Id=Class_Id+base.randomvalue(10);

        enterthevalueintotheelement(Paralympic_Class_Name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParalympicClasses_createParalympicClass_ParalympicClassName");
        enterthevalueintotheelement(Description,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParalympicClasses_createParalympicClass_Description");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/dropdown_admin_para_ParalympicClasses_createParalympicClass_ImpairmentGroup");
        //Selectdropdownbasedonindex(0,"AdminPortalElements/Admin_para_page_Elements/dropdown_admin_para_ParalympicClasses_createParalympicClass_ImpairmentGroup");
        selectlistactionvalue("PI-ST","AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParalympicClasses_createParalympicClass_ImpairmentGroup_list");
        enterthevalueintotheelement(Class_Id,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParalympicClasses_createParalympicClass_ClassId");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(Paralympic_Class_Name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(Paralympic_Class_Name,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParalympicClasses");
        AdminportalSearchthevalueintothetable(Description,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParalympicClasses");
        AdminportalSearchthevalueintothetable(Class_Id,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParalympicClasses");
        AdminportalSearchthevalueintothetable("PI-ST","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParalympicClasses");


        Adminportaloptionontable("Edit","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParalympicClasses");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParalympicClasses_createParalympicClass_ParalympicClassName");
        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParalympicClasses_createParalympicClass_Description");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/dropdown_admin_para_ParalympicClasses_createParalympicClass_ImpairmentGroup");
        //Selectdropdownbasedonindex(0,"AdminPortalElements/Admin_para_page_Elements/dropdown_admin_para_ParalympicClasses_createParalympicClass_ImpairmentGroup");
        selectlistactionvalue("PI-ST","AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParalympicClasses_createParalympicClass_ImpairmentGroup_list");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/dropdown_admin_para_ParalympicClasses_createParalympicClass_ImpairmentGroup");
        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParalympicClasses_createParalympicClass_ClassId");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");

        Verifytheactualandexceptedvalues("MANDATORY FIELDS REQUIRED\n"+"\n" +"Paralympic Class Name, Impairment Group, Description, Class Id cannot be empty","AdminPortalElements/Admin_login_page_Elements/text_Admin_login_error_alert");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Cancel");
        Verifytheactualandexceptedvalues("Paralympic Class","AdminPortalElements/Admin_para_page_Elements/text_admin_para_header");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(Paralympic_Class_Name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(Paralympic_Class_Name,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParalympicClasses");

        Adminportaloptionontable("Delete","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParalympicClasses");
        base.wait(2);
        driver.switchTo().alert().accept();
        base.wait(2);
    }


    @Then("^Edit Paralympic Classes from data table click on cancel button$")
    public static void EditParalympicClassesfromdatatableclickoncancelbutton() throws Exception {


        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_admin_para_ParalympicClasses");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_ParalympicClasses_createParalympicClass");
        String Paralympic_Class_Name="testParalympicClassName";
        String Description="testDescription";
        String Class_Id="C";
        Paralympic_Class_Name=Paralympic_Class_Name+base.randomvalue(10);
        Description=Description+base.randomvalue(10);
        Class_Id=Class_Id+base.randomvalue(10);

        enterthevalueintotheelement(Paralympic_Class_Name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParalympicClasses_createParalympicClass_ParalympicClassName");
        enterthevalueintotheelement(Description,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParalympicClasses_createParalympicClass_Description");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/dropdown_admin_para_ParalympicClasses_createParalympicClass_ImpairmentGroup");
        //Selectdropdownbasedonindex(0,"AdminPortalElements/Admin_para_page_Elements/dropdown_admin_para_ParalympicClasses_createParalympicClass_ImpairmentGroup");
        selectlistactionvalue("PI-ST","AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParalympicClasses_createParalympicClass_ImpairmentGroup_list");
        enterthevalueintotheelement(Class_Id,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParalympicClasses_createParalympicClass_ClassId");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(Paralympic_Class_Name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(Paralympic_Class_Name,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParalympicClasses");
        AdminportalSearchthevalueintothetable(Description,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParalympicClasses");
        AdminportalSearchthevalueintothetable(Class_Id,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParalympicClasses");
        AdminportalSearchthevalueintothetable("PI-ST","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParalympicClasses");


        Adminportaloptionontable("Edit","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParalympicClasses");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Cancel");
        Verifytheactualandexceptedvalues("Paralympic Class","AdminPortalElements/Admin_para_page_Elements/text_admin_para_header");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(Paralympic_Class_Name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(Paralympic_Class_Name,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParalympicClasses");

        Adminportaloptionontable("Delete","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParalympicClasses");
        base.wait(2);
        driver.switchTo().alert().accept();
        base.wait(2);

    }

    @Then("^search field in the Paralympic Classes data table$")
    public static void searchfieldintheParalympicClassesdatatable() throws Exception {

        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_admin_para_ParalympicClasses");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_ParalympicClasses_createParalympicClass");
        String Paralympic_Class_Name="testParalympicClassName";
        String Description="testDescription";
        String Class_Id="C";
        Paralympic_Class_Name=Paralympic_Class_Name+base.randomvalue(10);
        Description=Description+base.randomvalue(10);
        Class_Id=Class_Id+base.randomvalue(10);

        enterthevalueintotheelement(Paralympic_Class_Name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParalympicClasses_createParalympicClass_ParalympicClassName");
        enterthevalueintotheelement(Description,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParalympicClasses_createParalympicClass_Description");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/dropdown_admin_para_ParalympicClasses_createParalympicClass_ImpairmentGroup");
        //Selectdropdownbasedonindex(0,"AdminPortalElements/Admin_para_page_Elements/dropdown_admin_para_ParalympicClasses_createParalympicClass_ImpairmentGroup");
        selectlistactionvalue("PI-ST","AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParalympicClasses_createParalympicClass_ImpairmentGroup_list");
        enterthevalueintotheelement(Class_Id,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParalympicClasses_createParalympicClass_ClassId");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(Paralympic_Class_Name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(Paralympic_Class_Name,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParalympicClasses");
        AdminportalSearchthevalueintothetable(Description,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParalympicClasses");
        AdminportalSearchthevalueintothetable(Class_Id,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParalympicClasses");
        AdminportalSearchthevalueintothetable("PI-ST","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParalympicClasses");

        Adminportaloptionontable("Delete","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParalympicClasses");
        base.wait(2);
        driver.switchTo().alert().accept();
        base.wait(2);
    }

    @Then("^Delete Paralympic Classes from data table$")
    public static void DeleteParalympicClassesfromdatatable() throws Exception {

        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_admin_para_ParalympicClasses");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_ParalympicClasses_createParalympicClass");
        String Paralympic_Class_Name="testParalympicClassName";
        String Description="testDescription";
        String Class_Id="C";
        Paralympic_Class_Name=Paralympic_Class_Name+base.randomvalue(10);
        Description=Description+base.randomvalue(10);
        Class_Id=Class_Id+base.randomvalue(10);

        enterthevalueintotheelement(Paralympic_Class_Name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParalympicClasses_createParalympicClass_ParalympicClassName");
        enterthevalueintotheelement(Description,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParalympicClasses_createParalympicClass_Description");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/dropdown_admin_para_ParalympicClasses_createParalympicClass_ImpairmentGroup");
        //Selectdropdownbasedonindex(0,"AdminPortalElements/Admin_para_page_Elements/dropdown_admin_para_ParalympicClasses_createParalympicClass_ImpairmentGroup");
        selectlistactionvalue("PI-ST","AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParalympicClasses_createParalympicClass_ImpairmentGroup_list");
        enterthevalueintotheelement(Class_Id,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParalympicClasses_createParalympicClass_ClassId");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(Paralympic_Class_Name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(Paralympic_Class_Name,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParalympicClasses");
        AdminportalSearchthevalueintothetable(Description,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParalympicClasses");
        AdminportalSearchthevalueintothetable(Class_Id,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParalympicClasses");
        AdminportalSearchthevalueintothetable("PI-ST","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParalympicClasses");

        Adminportaloptionontable("Delete","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParalympicClasses");
        base.wait(2);
        driver.switchTo().alert().accept();
        base.wait(2);
    }



    }
