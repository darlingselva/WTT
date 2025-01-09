package StepDefinition.OVRLite.Adminportal;

import PreDefinedstepdefinitions.Predefinedstepdefinitions;
import base.Commonmethods;
import io.cucumber.java.en.Given;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.AdminPortalElements.Admin_Individuals_page_Elements;
import pages.AdminPortalElements.EventcreationElements;
import util.Fileuploadrobotclass;
import util.TestDataReader;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

import static PreDefinedstepdefinitions.Predefinedstepdefinitions.*;
import static PreDefinedstepdefinitions.Predefinedstepdefinitions.deselectlistactionvalue;
import static base.DriverInitialisation.driver;

public class ParaIndividualsAdminportalLiteSnippet {

    public static WebDriverWait wait1 = new WebDriverWait(driver, 60);
    public static Commonmethods base = new Commonmethods(driver, wait1);

    public static String Individualsid="218859";
    public static String Individualsname;

    @Given("^Admin portal Individuals creation$")
    public static void Adminportal_Individuals_creation() throws Exception {
        //LoginSnippet.login();
        Admin_Individuals_page_Elements event =  PageFactory.initElements(driver,Admin_Individuals_page_Elements.class);
        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_Individuals_Individuals");
        base.wait(6);
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_CreateIndividual");
        base.wait(3);

        WebElement b;
        TestDataReader.tetsdatareader("Individuals_Creation.xlsx" , "IndividualsCreation");
        for(int i=0;i<TestDataReader.TestheaderArray.length;i++) {
            String[] a=TestDataReader.TestheaderArray[i].toString().split("_");
            switch(a[0].toString()) {
                case "tab":
                    b=(WebElement) Admin_Individuals_page_Elements.class.getField(TestDataReader.TestheaderArray[i].toString()).get(event);
                    base.checkelementvisibility(b);
                    base.wait(3);
                    b.click();
                    base.wait(1);
                    break;
                case "button":
                    try {
                        b=(WebElement) Admin_Individuals_page_Elements.class.getField(TestDataReader.TestheaderArray[i].toString()).get(event);
                        base.checkelementvisibility(b);
                        base.wait(1);
                        b.click();
                        base.wait(1);
                    }
                    catch(Exception e) {
                        b=(WebElement) Admin_Individuals_page_Elements.class.getField(TestDataReader.TestheaderArray[i].toString()).get(event);
                        base.checkelementvisibility(b);
                        base.wait(1);
                        base.jclick(b);
                        base.wait(1);
                    }
                    break;
                case "text":
                    if(TestDataReader.TestheaderArray[i].toString().equals("text_event_core_tab_creation_EventName")) {

                        b=(WebElement) Admin_Individuals_page_Elements.class.getField(TestDataReader.TestheaderArray[i].toString()).get(event);
                        base.checkelementvisibility(b);
                        b.clear();
                        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
                        StringBuilder sb = new StringBuilder();
                        Random random = new Random();
                        int length = 7;
                        for(int k = 0; k < length; k++) {
                            int index = random.nextInt(alphabet.length());
                            char randomChar = alphabet.charAt(index);
                            sb.append(randomChar);
                        }

                        String randomString = sb.toString();
//                        eventname=TestDataReader.TestdataArray[i].toString()+randomString;
                        Individualsname=TestDataReader.TestdataArray[i].toString()+randomString;

//                        System.out.println("event name="+eventname);
                        System.out.println("event name="+Individualsname);

//                        b.sendKeys(eventname);
                        b.sendKeys(Individualsname);

                        base.wait(1);

                    }
                    else {
                        b=(WebElement) Admin_Individuals_page_Elements.class.getField(TestDataReader.TestheaderArray[i].toString()).get(event);
                        base.checkelementvisibility(b);
                        b.clear();
                        b.sendKeys(TestDataReader.TestdataArray[i].toString());
                        base.wait(1);
                    }
                    break;
                case "textsearchbar":
                    b=(WebElement) Admin_Individuals_page_Elements.class.getField(TestDataReader.TestheaderArray[i].toString()).get(event);
                    base.checkelementvisibility(b);
                    b.clear();
                    b.sendKeys(TestDataReader.TestdataArray[i].toString());
                    base.wait(6);
                    break;
                case "textarea":
                    b=(WebElement) Admin_Individuals_page_Elements.class.getField(TestDataReader.TestheaderArray[i].toString()).get(event);
                    base.checkelementvisibility(b);
                    b.clear();
                    b.sendKeys(TestDataReader.TestdataArray[i].toString());
                    base.wait(1);
                    break;
                case "searchtext":
                    b=(WebElement) Admin_Individuals_page_Elements.class.getField(TestDataReader.TestheaderArray[i].toString()).get(event);
                    base.checkelementvisibility(b);
                    b.sendKeys(TestDataReader.TestdataArray[i].toString());
                    base.wait(2);
                    b.sendKeys(Keys.ENTER);
                    base.wait(1);
                    break;
                case "toggle":
                    try {
                        b=(WebElement) Admin_Individuals_page_Elements.class.getField(TestDataReader.TestheaderArray[i].toString()).get(event);
                        base.checkelementvisibility(b);
                        b.click();
                        base.wait(1);
                    }
                    catch(Exception e) {
                        b=(WebElement) Admin_Individuals_page_Elements.class.getField(TestDataReader.TestheaderArray[i].toString()).get(event);
                        base.checkelementvisibility(b);
                        base.jclick(b);
                        base.wait(1);
                    }
                    break;
                case "checkbox":
                    b=(WebElement) Admin_Individuals_page_Elements.class.getField(TestDataReader.TestheaderArray[i].toString()).get(event);
                    base.checkelementvisibility(b);
                    base.jclick(b);
                    base.wait(1);
                    break;
                case "bartext":
                    b=(WebElement) Admin_Individuals_page_Elements.class.getField(TestDataReader.TestheaderArray[i].toString()).get(event);
                    base.checkelementvisibility(b);
                    b.clear();
                    b.sendKeys(TestDataReader.TestdataArray[i].toString());
                    base.wait(1);
                    break;
                case "date":

                    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyy, HH:mm:ss");
                    if(a[a.length-1].contains("Start")) {
                        b=(WebElement) Admin_Individuals_page_Elements.class.getField(TestDataReader.TestheaderArray[i].toString()).get(event);
                        base.checkelementvisibility(b);
                        LocalDateTime now = LocalDateTime.now();
                        String date_var=dtf.format(now).toString();
                        b.sendKeys(date_var);
                    }
                    else if(a[a.length-1].contains("End")) {
                        b=(WebElement) Admin_Individuals_page_Elements.class.getField(TestDataReader.TestheaderArray[i].toString()).get(event);
                        base.checkelementvisibility(b);
                        LocalDateTime now = LocalDateTime.now().plusDays(1);
                        String date_var=dtf.format(now).toString();
                        b.sendKeys(date_var);
                    }
                    else if(a[a.length-1].contains("From")) {
                        b=(WebElement) Admin_Individuals_page_Elements.class.getField(TestDataReader.TestheaderArray[i].toString()).get(event);
                        base.checkelementvisibility(b);
                        LocalDateTime now = LocalDateTime.now();
                        String date_var=dtf.format(now).toString();
                        b.sendKeys(date_var);
                    }
                    else if(a[a.length-1].contains("To")) {
                        b=(WebElement) Admin_Individuals_page_Elements.class.getField(TestDataReader.TestheaderArray[i].toString()).get(event);
                        base.checkelementvisibility(b);
                        LocalDateTime now = LocalDateTime.now().plusDays(1);
                        String date_var=dtf.format(now).toString();
                        b.sendKeys(date_var);
                    }
                    else {
                        b=(WebElement) Admin_Individuals_page_Elements.class.getField(TestDataReader.TestheaderArray[i].toString()).get(event);
                        base.checkelementvisibility(b);
                        LocalDateTime now = LocalDateTime.now();
                        String date_var=dtf.format(now).toString();
                        b.sendKeys(date_var);
                    }
                    break;

                case "filebutton":
                    try {
                        b=(WebElement) Admin_Individuals_page_Elements.class.getField(TestDataReader.TestheaderArray[i].toString()).get(event);
                        base.checkelementvisibility(b);
                        b.click();
                        base.wait(3);
                        Fileuploadrobotclass.fileuploadmethod(TestDataReader.TestdataArray[i].toString());
                        base.wait(3);
                    }
                    catch(Exception e) {
                        b=(WebElement) Admin_Individuals_page_Elements.class.getField(TestDataReader.TestheaderArray[i].toString()).get(event);
                        base.checkelementvisibility(b);
                        base.jclick(b);
                        base.wait(3);
                        Fileuploadrobotclass.fileuploadmethod(TestDataReader.TestdataArray[i].toString());
                        base.wait(3);
                    }

                default:
                    break;
            }


        }

        base.wait(5);
        base.jclick(event.button_Individuals_Individual_Create);
        base.wait(30);
        //      String eventsuccesspopmessage=event.text1_event_successpopupmessage.getText();
        //
        //		Assert.assertEquals(eventsuccesspopmessage, "Event Added Successfully");

        base.wait(3);

        try {
            if(event.text1_Individuals_Individualsdeails.isDisplayed()==true) {
                String tempeventid=event.text1_Individuals_Individualsdeails.getText();

                String[] tempsubeventid1=tempeventid.toString().split("#");

//                eventid=tempsubeventid1[1].toString();
                Individualsid=tempsubeventid1[1].toString();

//                System.out.println("event id="+eventid);
                System.out.println("event id="+Individualsid);

                base.takescreenshoot("eventcreation");
            }
            else {
                base.takescreenshoot("Individualcreationerror");

                Individualsid="218939";
            }
        }
        catch(NoSuchElementException e) {
            base.takescreenshoot("Individualcreationerror");
            Individualsid="218939";

        }
        catch(Exception e) {
            base.takescreenshoot("Individualcreationerror");
            Individualsid="218939";
            //e.printStackTrace();
        }
        base.wait(3);
        //admin.ittf_logout_button.click();





    }

    @Given("^Para Player toggle button in the Individuals module$")
    public static void ParaPlayertogglebuttonintheIndividualsmodule() throws Exception {
        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_Individuals_Individuals");
        base.wait(4);
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_CreateIndividual");
        base.wait(4);
        element_visiability("AdminPortalElements/Admin_Individuals_page_Elements/toggle_Individuals_Individual_Basics_IsParaPlayer");
    }

    @Given("^Enable the Para Player toggle button$")
    public static void EnabletheParaPlayertogglebutton() throws Exception{
        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_Individuals_Individuals");
        base.wait(4);
        clearthevalueintotheelement("AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_searchfields");
        enterthevalueintotheelement(Individualsid,"AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_searchfields");
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_searchfieldsicon");
        base.wait(4);
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_table_edit");
        base.wait(3);
        clickonenableordisablebutton("Enable","AdminPortalElements/Admin_Individuals_page_Elements/toggle_Individuals_Individual_Basics_IsParaPlayer");
        base.wait(2);
        element_visiability("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ParaInformation");
        base.wait(2);
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_Update");
        base.wait(6);
        element_visiability("AdminPortalElements/Admin_Individuals_page_Elements/text1_Individuals_Individualsdeails");
    }

    @Given("^Disable the Is Para Player toggle button$")
    public static void DisabletheIsParaPlayertogglebutton() throws Exception{

        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_Individuals_Individuals");
        base.wait(4);
        clearthevalueintotheelement("AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_searchfields");
        enterthevalueintotheelement(Individualsid,"AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_searchfields");
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_searchfieldsicon");
        base.wait(4);
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_table_edit");
        base.wait(3);
        clickonenableordisablebutton("Disable","AdminPortalElements/Admin_Individuals_page_Elements/toggle_Individuals_Individual_Basics_IsParaPlayer");
        base.wait(2);
        element_invisiability("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ParaInformation");
        base.wait(2);
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_Update");
        base.wait(6);
        element_visiability("AdminPortalElements/Admin_Individuals_page_Elements/text1_Individuals_Individualsdeails");

    }

    @Given("^Para Information step in individual creation process$")
    public static void ParaInformationstepinindividualcreationprocess() throws Exception{
        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_Individuals_Individuals");
        base.wait(4);
        clearthevalueintotheelement("AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_searchfields");
        enterthevalueintotheelement(Individualsid,"AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_searchfields");
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_searchfieldsicon");
        base.wait(4);
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_table_edit");
        base.wait(3);
        clickonenableordisablebutton("Enable","AdminPortalElements/Admin_Individuals_page_Elements/toggle_Individuals_Individual_Basics_IsParaPlayer");
        base.wait(2);
        element_visiability("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ParaInformation");
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ParaInformation");
        element_visiability("AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_PTTId");
        element_visiability("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ParalympicClass");
        element_visiability("AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_ImpairmentGroup");
        element_visiability("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ClassificationStatus");
        element_visiability("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_MobilityCode");
        element_visiability("AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_WheelchairWidth");
        element_visiability("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ReviewYear");
        element_visiability("AdminPortalElements/Admin_Individuals_page_Elements/toggle_Individuals_Individual_UseSecondWheelchair");
        element_visiability("AdminPortalElements/Admin_Individuals_page_Elements/toggle_Individuals_Individual_BallPickerNeeded");
        element_visiability("AdminPortalElements/Admin_Individuals_page_Elements/toggle_Individuals_Individual_IsActive");

        base.wait(2);
    }

    @Given("^Impairment Group dropdown field in Para Information step in individual creation process$")
    public static void ImpairmentGroupdropdownfieldinParaInformationstepinindividualcreationprocess() throws Exception{

        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_admin_para_ParaImpairmentGroups");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_ParaImpairmentGroups_create_ParaImpairmentGroup");
        String ParaImpairmentGroups_name="cd";
        String ParaImpairmentGroups_code="cd";
        ParaImpairmentGroups_name=ParaImpairmentGroups_name+base.randomvalue(10);
        //ParaImpairmentGroups_code=ParaImpairmentGroups_code+base.randomvalue(10);
        ParaImpairmentGroups_code=ParaImpairmentGroups_name;
        enterthevalueintotheelement(ParaImpairmentGroups_name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaImpairmentGroups_create_ParaImpairmentGroup_Name");
        enterthevalueintotheelement(ParaImpairmentGroups_code,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaImpairmentGroups_create_ParaImpairmentGroup_Code");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");



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
        selectlistactionvalue(ParaImpairmentGroups_name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParalympicClasses_createParalympicClass_ImpairmentGroup_list");
        enterthevalueintotheelement(Class_Id,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParalympicClasses_createParalympicClass_ClassId");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");

        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_Individuals_Individuals");
        base.wait(4);
        clearthevalueintotheelement("AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_searchfields");
        enterthevalueintotheelement(Individualsid,"AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_searchfields");
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_searchfieldsicon");
        base.wait(4);
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_table_edit");
        base.wait(3);
        clickonenableordisablebutton("Enable","AdminPortalElements/Admin_Individuals_page_Elements/toggle_Individuals_Individual_Basics_IsParaPlayer");
        base.wait(2);
        element_visiability("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ParaInformation");
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ParaInformation");
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ParalympicClass");
        selectlistactionvalue(Paralympic_Class_Name,"AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ParalympicClass");
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ImpairmentGroup");
        checklistvalues(ParaImpairmentGroups_name,"AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_ImpairmentGrouplist");

        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_admin_para_ParalympicClasses");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(Paralympic_Class_Name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(Paralympic_Class_Name,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParalympicClasses");

        Adminportaloptionontable("Delete","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParalympicClasses");
        base.wait(2);
        driver.switchTo().alert().accept();
        base.wait(2);

        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_admin_para_ParaImpairmentGroups");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(ParaImpairmentGroups_name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(ParaImpairmentGroups_name,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaImpairmentGroups");

        Adminportaloptionontable("Delete","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaImpairmentGroups");
        base.wait(2);
        driver.switchTo().alert().accept();
        base.wait(2);


    }

    @Given("^Paralympic Class dropdown field in Para Information step in individual creation process$")
    public static void ParalympicClassdropdownfieldinParaInformationstepinindividualcreationprocess() throws Exception{




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

        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_Individuals_Individuals");
        base.wait(4);
        clearthevalueintotheelement("AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_searchfields");
        enterthevalueintotheelement(Individualsid,"AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_searchfields");
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_searchfieldsicon");
        base.wait(4);
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_table_edit");
        base.wait(3);
        clickonenableordisablebutton("Enable","AdminPortalElements/Admin_Individuals_page_Elements/toggle_Individuals_Individual_Basics_IsParaPlayer");
        base.wait(2);
        element_visiability("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ParaInformation");
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ParaInformation");
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ParalympicClass");
        //selectlistactionvalue(Paralympic_Class_Name,"AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ParalympicClass");
        checklistvalues(Paralympic_Class_Name,"AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_ParalympicClasslist");


        //click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_admin_para_ParaImpairmentGroups");


        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_admin_para_ParalympicClasses");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(Paralympic_Class_Name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(Paralympic_Class_Name,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParalympicClasses");

        Adminportaloptionontable("Delete","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParalympicClasses");
        base.wait(2);
        driver.switchTo().alert().accept();
        base.wait(2);



    }

    @Given("^Classification Status dropdown field in Para Information step in individual creation process$")
    public static void ClassificationStatusdropdownfieldinParaInformationstepinindividualcreationprocess() throws Exception{

        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_admin_para_ParaClassificationStatus");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_ParaClassificationStatus_createParaClassificationStatus");
        String name="testname";
        String code="cd";
        name=name+base.randomvalue(100);
        code=code+base.randomvalue(10);
        enterthevalueintotheelement(name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaClassificationStatus_createParaClassificationStatus_Name");
        enterthevalueintotheelement(code,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_ParaClassificationStatus_createParaClassificationStatus_Code");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Save");

        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_Individuals_Individuals");
        base.wait(4);
        clearthevalueintotheelement("AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_searchfields");
        enterthevalueintotheelement(Individualsid,"AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_searchfields");
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_searchfieldsicon");
        base.wait(4);
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_table_edit");
        base.wait(3);
        clickonenableordisablebutton("Enable","AdminPortalElements/Admin_Individuals_page_Elements/toggle_Individuals_Individual_Basics_IsParaPlayer");
        base.wait(2);
        element_visiability("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ParaInformation");
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ParaInformation");
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ClassificationStatus");
        //selectlistactionvalue(Paralympic_Class_Name,"AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ParalympicClass");
        checklistvalues(code,"AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_ClassificationStatuslist");

        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_admin_para_ParaClassificationStatus");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(name,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaClassificationStatus");

        Adminportaloptionontable("Delete","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaClassificationStatus");
        base.wait(2);
        driver.switchTo().alert().accept();
        base.wait(2);


    }

    @Given("^Mobility Code dropdown field in Para Information step in individual creation process$")
    public static void MobilityCodedropdownfieldinParaInformationstepinindividualcreationprocess() throws Exception{

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

        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_Individuals_Individuals");
        base.wait(4);
        clearthevalueintotheelement("AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_searchfields");
        enterthevalueintotheelement(Individualsid,"AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_searchfields");
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_searchfieldsicon");
        base.wait(4);
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_table_edit");
        base.wait(3);
        clickonenableordisablebutton("Enable","AdminPortalElements/Admin_Individuals_page_Elements/toggle_Individuals_Individual_Basics_IsParaPlayer");
        base.wait(2);
        element_visiability("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ParaInformation");
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ParaInformation");
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_MobilityCode");
        //selectlistactionvalue(Paralympic_Class_Name,"AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ParalympicClass");
        checklistvalues(code,"AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_MobilityCodelist");



        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_admin_para_ParaMobilityCode");

        clearthevalueintotheelement("AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        enterthevalueintotheelement(name,"AdminPortalElements/Admin_para_page_Elements/text_admin_para_common_popupwindow_Searchbar");
        click_on_element("AdminPortalElements/Admin_para_page_Elements/button_admin_para_common_popupwindow_Searchicon");
        AdminportalSearchthevalueintothetable(name,"AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaMobilityCode");

        Adminportaloptionontable("Delete","AdminPortalElements/Admin_para_page_Elements/table_admin_para_ParaMobilityCode");
        base.wait(2);
        driver.switchTo().alert().accept();
        base.wait(2);
    }

    @Given("^Para Information step in individual creation process for Positive fields$")
    public static void ParaInformationstepinindividualcreationprocessforPositivefields() throws Exception{

        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_Individuals_Individuals");
        base.wait(4);
        clearthevalueintotheelement("AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_searchfields");
        enterthevalueintotheelement(Individualsid,"AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_searchfields");
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_searchfieldsicon");
        base.wait(4);
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_table_edit");
        base.wait(3);
        clickonenableordisablebutton("Enable","AdminPortalElements/Admin_Individuals_page_Elements/toggle_Individuals_Individual_Basics_IsParaPlayer");
        base.wait(2);
        element_visiability("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ParaInformation");
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ParaInformation");
        clearthevalueintotheelement("AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_PTTId");

        enterthevalueintotheelement("1456","AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_PTTId");

        click_on_elementisavailable("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ParalympicClasslistclear");

        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ParalympicClass");
        selectlistactionvalue("NE","AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ParalympicClass");

        click_on_elementisavailable("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ImpairmentGroupclear");
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_ImpairmentGroup");
        selectlistactionoption(1,"AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_ImpairmentGrouplist");

        click_on_elementisavailable("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ClassificationStatusclear");
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ClassificationStatus");
        selectlistactionoption(1,"AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_ClassificationStatuslist");

        click_on_elementisavailable("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_MobilityCodeclear");
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_MobilityCode");
        selectlistactionoption(1,"AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_MobilityCodelist");

        clearthevalueintotheelement("AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_WheelchairWidth");

        enterthevalueintotheelement("12","AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_WheelchairWidth");
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ReviewYear");
        enterthevalueintotheelement("1995","AdminPortalElements/Admin_Individuals_page_Elements/searchtext_multiselectionpopup_searchfield");
        //getthefield("AdminPortalElements/Admin_Individuals_page_Elements/searchtext_multiselectionpopup_searchfield");
        webElement.sendKeys(Keys.ENTER);

        base.wait(4);
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/toggle_Individuals_Individual_UseSecondWheelchair");
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/toggle_Individuals_Individual_BallPickerNeeded");

        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_Update");
        base.wait(6);
        element_visiability("AdminPortalElements/Admin_Individuals_page_Elements/text1_Individuals_Individualsdeails");


    }

    @Given("^Para Information step in individual creation process for Positive fields in Review step$")
    public static void ParaInformationstepinindividualcreationprocessforPositivefieldsinReviewstep() throws Exception{

        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_Individuals_Individuals");
        base.wait(4);
        clearthevalueintotheelement("AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_searchfields");
        enterthevalueintotheelement(Individualsid,"AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_searchfields");
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_searchfieldsicon");
        base.wait(4);
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_table_edit");
        base.wait(3);
        clickonenableordisablebutton("Enable","AdminPortalElements/Admin_Individuals_page_Elements/toggle_Individuals_Individual_Basics_IsParaPlayer");
        base.wait(2);
        element_visiability("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ParaInformation");
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ParaInformation");
        clearthevalueintotheelement("AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_PTTId");

        enterthevalueintotheelement("1456","AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_PTTId");

        click_on_elementisavailable("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ParalympicClasslistclear");
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ParalympicClass");
        selectlistactionvalue("C11","AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ParalympicClass");

        click_on_elementisavailable("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ImpairmentGroupclear");
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_ImpairmentGroup");
        selectlistactionoption(1,"AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_ImpairmentGrouplist");

        click_on_elementisavailable("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ClassificationStatusclear");
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ClassificationStatus");
        selectlistactionoption(2,"AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_ClassificationStatuslist");


        click_on_elementisavailable("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_MobilityCodeclear");
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_MobilityCode");
        selectlistactionoption(2,"AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_MobilityCodelist");
        clearthevalueintotheelement("AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_WheelchairWidth");
        enterthevalueintotheelement("12","AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_WheelchairWidth");
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ReviewYear");
        enterthevalueintotheelement("1995","AdminPortalElements/Admin_Individuals_page_Elements/searchtext_multiselectionpopup_searchfield");
        //getthefield("AdminPortalElements/Admin_Individuals_page_Elements/searchtext_multiselectionpopup_searchfield");
        webElement.sendKeys(Keys.ENTER);

        base.wait(4);
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/toggle_Individuals_Individual_UseSecondWheelchair");
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/toggle_Individuals_Individual_BallPickerNeeded");

        base.wait(2);

        Jclick_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_Review");
        base.wait(1);
        Verifytheactualandexceptedvalues("Yes","AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_Review_BasicInformation_IsParaPlayer");

    }

    @Given("^Para Information step in individual creation process for Positive fields in Review step Then create the Individuals$")
    public static void ParaInformationstepinindividualcreationprocessforPositivefieldsinReviewstepThencreatetheIndividuals() throws Exception{

        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_Individuals_Individuals");
        base.wait(4);
        clearthevalueintotheelement("AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_searchfields");
        enterthevalueintotheelement(Individualsid,"AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_searchfields");
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_searchfieldsicon");
        base.wait(4);
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_table_edit");
        base.wait(3);
        clickonenableordisablebutton("Enable","AdminPortalElements/Admin_Individuals_page_Elements/toggle_Individuals_Individual_Basics_IsParaPlayer");
        base.wait(2);
        element_visiability("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ParaInformation");
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ParaInformation");
        clearthevalueintotheelement("AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_PTTId");

        enterthevalueintotheelement("1456","AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_PTTId");

        click_on_elementisavailable("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ParalympicClasslistclear");
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ParalympicClass");
        selectlistactionvalue("C11","AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ParalympicClass");

        click_on_elementisavailable("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ImpairmentGroupclear");
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_ImpairmentGroup");
        selectlistactionoption(1,"AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_ImpairmentGrouplist");

        click_on_elementisavailable("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ClassificationStatusclear");
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ClassificationStatus");
        selectlistactionoption(2,"AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_ClassificationStatuslist");


        click_on_elementisavailable("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_MobilityCodeclear");
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_MobilityCode");
        selectlistactionoption(2,"AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_MobilityCodelist");

        clearthevalueintotheelement("AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_WheelchairWidth");

        enterthevalueintotheelement("12","AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_WheelchairWidth");
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ReviewYear");
        enterthevalueintotheelement("1995","AdminPortalElements/Admin_Individuals_page_Elements/searchtext_multiselectionpopup_searchfield");
        //getthefield("AdminPortalElements/Admin_Individuals_page_Elements/searchtext_multiselectionpopup_searchfield");
        webElement.sendKeys(Keys.ENTER);

        base.wait(4);
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/toggle_Individuals_Individual_UseSecondWheelchair");
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/toggle_Individuals_Individual_BallPickerNeeded");

        base.wait(2);

        Jclick_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_Review");
        base.wait(2);
        Verifytheactualandexceptedvalues("Yes","AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_Review_BasicInformation_IsParaPlayer");

        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_Update");
        base.wait(6);
        element_visiability("AdminPortalElements/Admin_Individuals_page_Elements/text1_Individuals_Individualsdeails");
    }

    @Given("^Para Information step in individual creation process proceed for positive values of fill the Mandatory fields$")
    public static void ParaInformationstepinindividualcreationprocessproceedforpositivevaluesoffilltheMandatoryfields() throws Exception{

        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_Individuals_Individuals");
        base.wait(4);
        clearthevalueintotheelement("AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_searchfields");
        enterthevalueintotheelement(Individualsid,"AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_searchfields");
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_searchfieldsicon");
        base.wait(4);
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_table_edit");
        base.wait(3);
        clickonenableordisablebutton("Enable","AdminPortalElements/Admin_Individuals_page_Elements/toggle_Individuals_Individual_Basics_IsParaPlayer");
        base.wait(2);
        element_visiability("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ParaInformation");
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ParaInformation");
        clearthevalueintotheelement("AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_PTTId");

        enterthevalueintotheelement("1456","AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_PTTId");

        click_on_elementisavailable("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ParalympicClasslistclear");
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ParalympicClass");
        selectlistactionvalue("C10","AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ParalympicClass");

        click_on_elementisavailable("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ImpairmentGroupclear");
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_ImpairmentGroup");
        selectlistactionoption(1,"AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_ImpairmentGrouplist");

        click_on_elementisavailable("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ClassificationStatusclear");
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ClassificationStatus");
        selectlistactionoption(3,"AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_ClassificationStatuslist");


        base.wait(2);

//        Jclick_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_Review");
//        base.wait(2);
//        Verifytheactualandexceptedvalues("Yes","AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_Review_BasicInformation_IsParaPlayer");

        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_Update");
        base.wait(6);
        element_visiability("AdminPortalElements/Admin_Individuals_page_Elements/text1_Individuals_Individualsdeails");

    }

    @Given("^Para Information step in individual creation process proceed for positive values of fill the Mandatory fields in Review step$")
    public static void ParaInformationstepinindividualcreationprocessproceedforpositivevaluesoffilltheMandatoryfieldsinReviewstep() throws Exception{

        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_Individuals_Individuals");
        base.wait(4);
        clearthevalueintotheelement("AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_searchfields");
        enterthevalueintotheelement(Individualsid,"AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_searchfields");
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_searchfieldsicon");
        base.wait(4);
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_table_edit");
        base.wait(3);
        clickonenableordisablebutton("Enable","AdminPortalElements/Admin_Individuals_page_Elements/toggle_Individuals_Individual_Basics_IsParaPlayer");
        base.wait(2);
        element_visiability("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ParaInformation");
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ParaInformation");
        clearthevalueintotheelement("AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_PTTId");

        enterthevalueintotheelement("1456","AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_PTTId");

        click_on_elementisavailable("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ParalympicClasslistclear");
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ParalympicClass");
        selectlistactionvalue("C9","AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ParalympicClass");

        click_on_elementisavailable("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ImpairmentGroupclear");
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_ImpairmentGroup");
        selectlistactionoption(1,"AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_ImpairmentGrouplist");

        click_on_elementisavailable("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ClassificationStatusclear");
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ClassificationStatus");
        selectlistactionoption(4,"AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_ClassificationStatuslist");


        base.wait(2);

        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_Update");
        base.wait(6);
        element_visiability("AdminPortalElements/Admin_Individuals_page_Elements/text1_Individuals_Individualsdeails");

    }

    @Given("^Para Information step in individual creation process proceed for positive values of fill the all Mandatory fields and validated values in Review step Then create the Individuals$")
    public static void ParaInformationstepinindividualcreationprocessproceedforpositivevaluesoffilltheallMandatoryfieldsandvalidatedvaluesinReviewstepThencreatetheIndividuals() throws Exception{

        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_Individuals_Individuals");
        base.wait(4);
        clearthevalueintotheelement("AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_searchfields");
        enterthevalueintotheelement(Individualsid,"AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_searchfields");
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_searchfieldsicon");
        base.wait(4);
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_table_edit");
        base.wait(3);
        clickonenableordisablebutton("Enable","AdminPortalElements/Admin_Individuals_page_Elements/toggle_Individuals_Individual_Basics_IsParaPlayer");
        base.wait(2);
        element_visiability("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ParaInformation");
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ParaInformation");
        clearthevalueintotheelement("AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_PTTId");

        enterthevalueintotheelement("1456","AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_PTTId");

        click_on_elementisavailable("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ParalympicClasslistclear");
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ParalympicClass");
        selectlistactionvalue("C9","AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ParalympicClass");

        click_on_elementisavailable("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ImpairmentGroupclear");
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_ImpairmentGroup");
        selectlistactionoption(1,"AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_ImpairmentGrouplist");

        click_on_elementisavailable("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ClassificationStatusclear");
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ClassificationStatus");
        selectlistactionoption(4,"AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_ClassificationStatuslist");


        base.wait(2);

        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_Update");
        base.wait(6);
        element_visiability("AdminPortalElements/Admin_Individuals_page_Elements/text1_Individuals_Individualsdeails");

//        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_Update");
//        base.wait(6);
//        element_visiability("AdminPortalElements/Admin_Individuals_page_Elements/text1_Individuals_Individualsdeails");

    }

    @Given("^Para Information step in individual creation process proceed for positive values of without fill the Mandatory fields$")
    public static void ParaInformationstepinindividualcreationprocessproceedforpositivevaluesofwithoutfilltheMandatoryfields() throws Exception{

        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_Individuals_Individuals");
        base.wait(4);
        clearthevalueintotheelement("AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_searchfields");
        enterthevalueintotheelement(Individualsid,"AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_searchfields");
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_searchfieldsicon");
        base.wait(4);
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_table_edit");
        base.wait(3);
        clickonenableordisablebutton("Enable","AdminPortalElements/Admin_Individuals_page_Elements/toggle_Individuals_Individual_Basics_IsParaPlayer");
        base.wait(2);
        element_visiability("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ParaInformation");
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ParaInformation");

        clearthevalueintotheelement("AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_PTTId");
        // click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ParalympicClass");
//        //selectlistactionvalue("NE","AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ParalympicClass");
       // deselectlistactionvalue("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ParalympicClass");
        click_on_elementisavailable("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ParalympicClasslistclear");


        //click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ImpairmentGroup");
        click_on_elementisavailable("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ImpairmentGroupclear");
        //deselectlistactionvalue1("//app-create-individuals//div[contains(text(),'Impairment Group ')]//parent::div//parent::div//angular2-multiselect");

       // click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ClassificationStatus");
        click_on_elementisavailable("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ClassificationStatusclear");

        click_on_elementisavailable("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_MobilityCodeclear");
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_MobilityCode");
        selectlistactionoption(1,"AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_MobilityCodelist");

        clearthevalueintotheelement("AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_WheelchairWidth");

        enterthevalueintotheelement("12","AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_WheelchairWidth");
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ReviewYear");
        enterthevalueintotheelement("1995","AdminPortalElements/Admin_Individuals_page_Elements/searchtext_multiselectionpopup_searchfield");
        //getthefield("AdminPortalElements/Admin_Individuals_page_Elements/searchtext_multiselectionpopup_searchfield");
        webElement.sendKeys(Keys.ENTER);

        base.wait(4);
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/toggle_Individuals_Individual_UseSecondWheelchair");
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/toggle_Individuals_Individual_BallPickerNeeded");

        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_Update");
        base.wait(6);

        Verifytheactualandexceptedvalues("MANDATORY FIELDS REQUIRED\n" +
                "\n" +
                "PTT Id , Paralympic Class, Classification Status cannot be empty","AdminPortalElements/Admin_login_page_Elements/text_Admin_login_error_alert");
    }

    @Given("^Para Information step in individual creation process proceed for positive values  of fill the all fields$")
    public static void ParaInformationstepinindividualcreationprocessproceedforpositivevaluesoffilltheallfields() throws Exception{
        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_Individuals_Individuals");
        base.wait(4);
        clearthevalueintotheelement("AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_searchfields");
        enterthevalueintotheelement(Individualsid,"AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_searchfields");
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_searchfieldsicon");
        base.wait(4);
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_table_edit");
        base.wait(3);
        clickonenableordisablebutton("Enable","AdminPortalElements/Admin_Individuals_page_Elements/toggle_Individuals_Individual_Basics_IsParaPlayer");
        base.wait(2);
        element_visiability("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ParaInformation");
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ParaInformation");
        clearthevalueintotheelement("AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_PTTId");

        enterthevalueintotheelement("1456","AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_PTTId");

        click_on_elementisavailable("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ParalympicClasslistclear");

        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ParalympicClass");
        selectlistactionvalue("NE","AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ParalympicClass");

        click_on_elementisavailable("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ImpairmentGroupclear");
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_ImpairmentGroup");
        selectlistactionoption(1,"AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_ImpairmentGrouplist");

        click_on_elementisavailable("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ClassificationStatusclear");
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ClassificationStatus");
        selectlistactionoption(1,"AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_ClassificationStatuslist");

        click_on_elementisavailable("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_MobilityCodeclear");
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_MobilityCode");
        selectlistactionoption(1,"AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_MobilityCodelist");

        clearthevalueintotheelement("AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_WheelchairWidth");

        enterthevalueintotheelement("12","AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_WheelchairWidth");
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ReviewYear");
        enterthevalueintotheelement("1995","AdminPortalElements/Admin_Individuals_page_Elements/searchtext_multiselectionpopup_searchfield");
        //getthefield("AdminPortalElements/Admin_Individuals_page_Elements/searchtext_multiselectionpopup_searchfield");
        webElement.sendKeys(Keys.ENTER);

        base.wait(4);
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/toggle_Individuals_Individual_UseSecondWheelchair");
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/toggle_Individuals_Individual_BallPickerNeeded");

        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_Update");
        base.wait(6);
        element_visiability("AdminPortalElements/Admin_Individuals_page_Elements/text1_Individuals_Individualsdeails");

    }

    @Given("^Para Information step in individual creation process proceed for positive values of fill the all fields and validated values in Review step$")
    public static void ParaInformationstepinindividualcreationprocessproceedforpositivevaluesoffilltheallfieldsandvalidatedvaluesinReviewstep() throws Exception{
        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_Individuals_Individuals");
        base.wait(4);
        clearthevalueintotheelement("AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_searchfields");
        enterthevalueintotheelement(Individualsid,"AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_searchfields");
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_searchfieldsicon");
        base.wait(4);
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_table_edit");
        base.wait(3);
        clickonenableordisablebutton("Enable","AdminPortalElements/Admin_Individuals_page_Elements/toggle_Individuals_Individual_Basics_IsParaPlayer");
        base.wait(2);
        element_visiability("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ParaInformation");
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ParaInformation");
        clearthevalueintotheelement("AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_PTTId");

        enterthevalueintotheelement("1456","AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_PTTId");

        click_on_elementisavailable("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ParalympicClasslistclear");

        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ParalympicClass");
        selectlistactionvalue("NE","AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ParalympicClass");

        click_on_elementisavailable("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ImpairmentGroupclear");
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_ImpairmentGroup");
        selectlistactionoption(1,"AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_ImpairmentGrouplist");

        click_on_elementisavailable("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ClassificationStatusclear");
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ClassificationStatus");
        selectlistactionoption(1,"AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_ClassificationStatuslist");

        click_on_elementisavailable("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_MobilityCodeclear");
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_MobilityCode");
        selectlistactionoption(1,"AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_MobilityCodelist");

        clearthevalueintotheelement("AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_WheelchairWidth");

        enterthevalueintotheelement("12","AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_WheelchairWidth");
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ReviewYear");
        enterthevalueintotheelement("1995","AdminPortalElements/Admin_Individuals_page_Elements/searchtext_multiselectionpopup_searchfield");
        //getthefield("AdminPortalElements/Admin_Individuals_page_Elements/searchtext_multiselectionpopup_searchfield");
        webElement.sendKeys(Keys.ENTER);

        base.wait(4);
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/toggle_Individuals_Individual_UseSecondWheelchair");
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/toggle_Individuals_Individual_BallPickerNeeded");

//        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_Update");
//        base.wait(6);
//        element_visiability("AdminPortalElements/Admin_Individuals_page_Elements/text1_Individuals_Individualsdeails");

        Jclick_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_Review");
        base.wait(1);
        Verifytheactualandexceptedvalues("Yes","AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_Review_BasicInformation_IsParaPlayer");

    }

    @Given("^Para Information step in individual creation process proceed for positive values of fill the all fields and validated values in Review step Then create the Individuals$")
    public static void ParaInformationstepinindividualcreationprocessproceedforpositivevaluesoffilltheallfieldsandvalidatedvaluesinReviewstepThencreatetheIndividuals() throws Exception{
        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_Individuals_Individuals");
        base.wait(4);
        clearthevalueintotheelement("AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_searchfields");
        enterthevalueintotheelement(Individualsid,"AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_searchfields");
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_searchfieldsicon");
        base.wait(4);
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_table_edit");
        base.wait(3);
        clickonenableordisablebutton("Enable","AdminPortalElements/Admin_Individuals_page_Elements/toggle_Individuals_Individual_Basics_IsParaPlayer");
        base.wait(2);
        element_visiability("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ParaInformation");
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ParaInformation");
        clearthevalueintotheelement("AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_PTTId");

        enterthevalueintotheelement("1456","AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_PTTId");

        click_on_elementisavailable("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ParalympicClasslistclear");

        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ParalympicClass");
        selectlistactionvalue("NE","AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ParalympicClass");

        click_on_elementisavailable("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ImpairmentGroupclear");
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_ImpairmentGroup");
        selectlistactionoption(1,"AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_ImpairmentGrouplist");

        click_on_elementisavailable("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ClassificationStatusclear");
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ClassificationStatus");
        selectlistactionoption(1,"AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_ClassificationStatuslist");

        click_on_elementisavailable("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_MobilityCodeclear");
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_MobilityCode");
        selectlistactionoption(1,"AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_MobilityCodelist");

        clearthevalueintotheelement("AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_WheelchairWidth");

        enterthevalueintotheelement("12","AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_WheelchairWidth");
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ReviewYear");
        enterthevalueintotheelement("1995","AdminPortalElements/Admin_Individuals_page_Elements/searchtext_multiselectionpopup_searchfield");
        //getthefield("AdminPortalElements/Admin_Individuals_page_Elements/searchtext_multiselectionpopup_searchfield");
        webElement.sendKeys(Keys.ENTER);

        base.wait(4);
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/toggle_Individuals_Individual_UseSecondWheelchair");
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/toggle_Individuals_Individual_BallPickerNeeded");

//        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_Update");
//        base.wait(6);
//        element_visiability("AdminPortalElements/Admin_Individuals_page_Elements/text1_Individuals_Individualsdeails");

        Jclick_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_Review");
        base.wait(1);
        Verifytheactualandexceptedvalues("Yes","AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_Review_BasicInformation_IsParaPlayer");

                click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_Update");
        base.wait(6);
        element_visiability("AdminPortalElements/Admin_Individuals_page_Elements/text1_Individuals_Individualsdeails");
    }

    @Given("^Edit Para Information step in individual creation process proceed for positive values of fill the Mandatory fields$")
    public static void EditParaInformationstepinindividualcreationprocessproceedforpositivevaluesoffilltheMandatoryfields() throws Exception{
        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_Individuals_Individuals");
        base.wait(4);
        clearthevalueintotheelement("AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_searchfields");
        enterthevalueintotheelement(Individualsid,"AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_searchfields");
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_searchfieldsicon");
        base.wait(4);
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_table_edit");
        base.wait(3);
        clickonenableordisablebutton("Enable","AdminPortalElements/Admin_Individuals_page_Elements/toggle_Individuals_Individual_Basics_IsParaPlayer");
        base.wait(2);
        element_visiability("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ParaInformation");
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ParaInformation");
        clearthevalueintotheelement("AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_PTTId");

        enterthevalueintotheelement("1456","AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_PTTId");

        click_on_elementisavailable("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ParalympicClasslistclear");
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ParalympicClass");
        selectlistactionvalue("C10","AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ParalympicClass");

        click_on_elementisavailable("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ImpairmentGroupclear");
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_ImpairmentGroup");
        selectlistactionoption(1,"AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_ImpairmentGrouplist");

        click_on_elementisavailable("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ClassificationStatusclear");
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ClassificationStatus");
        selectlistactionoption(3,"AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_ClassificationStatuslist");


        base.wait(2);

//        Jclick_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_Review");
//        base.wait(2);
//        Verifytheactualandexceptedvalues("Yes","AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_Review_BasicInformation_IsParaPlayer");

        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_Update");
        base.wait(6);
        element_visiability("AdminPortalElements/Admin_Individuals_page_Elements/text1_Individuals_Individualsdeails");

    }

    @Given("^Edit Para Information step in individual creation process proceed for positive values of fill the Mandatory fields and validated values in Review step$")
    public static void EditParaInformationstepinindividualcreationprocessproceedforpositivevaluesoffilltheMandatoryfieldsandvalidatedvaluesinReviewstep() throws Exception{
        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_Individuals_Individuals");
        base.wait(4);
        clearthevalueintotheelement("AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_searchfields");
        enterthevalueintotheelement(Individualsid,"AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_searchfields");
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_searchfieldsicon");
        base.wait(4);
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_table_edit");
        base.wait(3);
        clickonenableordisablebutton("Enable","AdminPortalElements/Admin_Individuals_page_Elements/toggle_Individuals_Individual_Basics_IsParaPlayer");
        base.wait(2);
        element_visiability("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ParaInformation");
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ParaInformation");
        clearthevalueintotheelement("AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_PTTId");

        enterthevalueintotheelement("1456","AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_PTTId");

        click_on_elementisavailable("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ParalympicClasslistclear");
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ParalympicClass");
        selectlistactionvalue("C10","AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ParalympicClass");

        click_on_elementisavailable("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ImpairmentGroupclear");
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_ImpairmentGroup");
        selectlistactionoption(1,"AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_ImpairmentGrouplist");

        click_on_elementisavailable("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ClassificationStatusclear");
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ClassificationStatus");
        selectlistactionoption(3,"AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_ClassificationStatuslist");


        base.wait(2);

        Jclick_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_Review");
        base.wait(2);
        Verifytheactualandexceptedvalues("Yes","AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_Review_BasicInformation_IsParaPlayer");

//        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_Update");
//        base.wait(6);
//        element_visiability("AdminPortalElements/Admin_Individuals_page_Elements/text1_Individuals_Individualsdeails");

    }

    @Given("^Edit Para Information step in individual creation process proceed for positive values of fill the all Mandatory fields and validated values in Review step Then create the Individuals$")
    public static void EditParaInformationstepinindividualcreationprocessproceedforpositivevaluesoffilltheallMandatoryfieldsandvalidatedvaluesinReviewstepThencreatetheIndividuals() throws Exception{

        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_Individuals_Individuals");
        base.wait(4);
        clearthevalueintotheelement("AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_searchfields");
        enterthevalueintotheelement(Individualsid,"AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_searchfields");
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_searchfieldsicon");
        base.wait(4);
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_table_edit");
        base.wait(3);
        clickonenableordisablebutton("Enable","AdminPortalElements/Admin_Individuals_page_Elements/toggle_Individuals_Individual_Basics_IsParaPlayer");
        base.wait(2);
        element_visiability("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ParaInformation");
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ParaInformation");
        clearthevalueintotheelement("AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_PTTId");

        enterthevalueintotheelement("1456","AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_PTTId");

        click_on_elementisavailable("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ParalympicClasslistclear");
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ParalympicClass");
        selectlistactionvalue("C10","AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ParalympicClass");

        click_on_elementisavailable("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ImpairmentGroupclear");
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_ImpairmentGroup");
        selectlistactionoption(1,"AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_ImpairmentGrouplist");

        click_on_elementisavailable("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ClassificationStatusclear");
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ClassificationStatus");
        selectlistactionoption(3,"AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_ClassificationStatuslist");


        base.wait(2);

        Jclick_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_Review");
        base.wait(2);
        Verifytheactualandexceptedvalues("Yes","AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_Review_BasicInformation_IsParaPlayer");

        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_Update");
        base.wait(6);
        element_visiability("AdminPortalElements/Admin_Individuals_page_Elements/text1_Individuals_Individualsdeails");

    }

    @Given("^Edit Para Information step in individual creation process proceed for positive values of without fill the Mandatory fields$")
    public static void EditParaInformationstepinindividualcreationprocessproceedforpositivevaluesofwithoutfilltheMandatoryfields() throws Exception{

        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_Individuals_Individuals");
        base.wait(4);
        clearthevalueintotheelement("AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_searchfields");
        enterthevalueintotheelement(Individualsid,"AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_searchfields");
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_searchfieldsicon");
        base.wait(4);
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_table_edit");
        base.wait(3);
        clickonenableordisablebutton("Enable","AdminPortalElements/Admin_Individuals_page_Elements/toggle_Individuals_Individual_Basics_IsParaPlayer");
        base.wait(2);
        element_visiability("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ParaInformation");
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ParaInformation");

        clearthevalueintotheelement("AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_PTTId");
        // click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ParalympicClass");
//        //selectlistactionvalue("NE","AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ParalympicClass");
        // deselectlistactionvalue("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ParalympicClass");
        click_on_elementisavailable("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ParalympicClasslistclear");


        //click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ImpairmentGroup");
        click_on_elementisavailable("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ImpairmentGroupclear");
        //deselectlistactionvalue1("//app-create-individuals//div[contains(text(),'Impairment Group ')]//parent::div//parent::div//angular2-multiselect");

        // click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ClassificationStatus");
        click_on_elementisavailable("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ClassificationStatusclear");

        click_on_elementisavailable("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_MobilityCodeclear");
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_MobilityCode");
        selectlistactionoption(1,"AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_MobilityCodelist");

        clearthevalueintotheelement("AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_WheelchairWidth");

        enterthevalueintotheelement("12","AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_WheelchairWidth");
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ReviewYear");
        enterthevalueintotheelement("1995","AdminPortalElements/Admin_Individuals_page_Elements/searchtext_multiselectionpopup_searchfield");
        //getthefield("AdminPortalElements/Admin_Individuals_page_Elements/searchtext_multiselectionpopup_searchfield");
        webElement.sendKeys(Keys.ENTER);

        base.wait(4);
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/toggle_Individuals_Individual_UseSecondWheelchair");
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/toggle_Individuals_Individual_BallPickerNeeded");

        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_Update");
        base.wait(6);

        Verifytheactualandexceptedvalues("MANDATORY FIELDS REQUIRED\n" +
                "\n" +
                "PTT Id , Paralympic Class, Classification Status cannot be empty","AdminPortalElements/Admin_login_page_Elements/text_Admin_login_error_alert");
    }

    @Given("^delete Individuals from the datatable$")
    public static void deleteIndividualsfromthedatatable() throws Exception{

        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_Individuals_Individuals");
        base.wait(4);
        clearthevalueintotheelement("AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_searchfields");
        enterthevalueintotheelement(Individualsid,"AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_searchfields");
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_searchfieldsicon");
        base.wait(4);
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_table_delete");

    }

    @Given("^Verify the search field in Individuals page$")
    public static void VerifythesearchfieldinIndividualspage() throws Exception{

        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_Individuals_Individuals");
        base.wait(4);
        clearthevalueintotheelement("AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_searchfields");
        enterthevalueintotheelement(Individualsid,"AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_searchfields");
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_searchfieldsicon");
        base.wait(4);
        AdminportalSearchthevalueintothetable(Individualsid,"AdminPortalElements/Admin_Individuals_page_Elements/table_Individuals_Individual");

    }

    @Given("^Para Information in individual Next button$")
    public static void ParaInformationinindividualNextbutton() throws Exception{

        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_Individuals_Individuals");
        base.wait(4);
        clearthevalueintotheelement("AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_searchfields");
        enterthevalueintotheelement(Individualsid,"AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_searchfields");
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_searchfieldsicon");
        base.wait(4);
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_table_edit");
        base.wait(3);
        clickonenableordisablebutton("Enable","AdminPortalElements/Admin_Individuals_page_Elements/toggle_Individuals_Individual_Basics_IsParaPlayer");
        base.wait(2);
        element_visiability("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ParaInformation");
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ParaInformation");
        base.wait(1);
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_Next");
        base.wait(1);
        element_visiability("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_Documents_AddNew");



    }

    @Given("^Para Information in individual Back button$")
    public static void ParaInformationinindividualBackbutton() throws Exception{

        click_on_element("AdminPortalElements/Admin_menu_page_Elements/button_Individuals_Individuals");
        base.wait(4);
        clearthevalueintotheelement("AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_searchfields");
        enterthevalueintotheelement(Individualsid,"AdminPortalElements/Admin_Individuals_page_Elements/text_Individuals_Individual_searchfields");
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_searchfieldsicon");
        base.wait(4);
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_table_edit");
        base.wait(3);
        clickonenableordisablebutton("Enable","AdminPortalElements/Admin_Individuals_page_Elements/toggle_Individuals_Individual_Basics_IsParaPlayer");
        base.wait(2);
        element_visiability("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ParaInformation");
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_ParaInformation");
        base.wait(1);
        click_on_element("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_Back");
        base.wait(1);
        element_visiability("AdminPortalElements/Admin_Individuals_page_Elements/button_Individuals_Individual_MedicalInformation_Status");
    }




























}
