package StepDefinition.OVR;

import base.Commonmethods;
import base.DriverInitialisation;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import pages.OVRElements.OVR_Home_page_Elements;
import pages.OVRElements.OVR_Modalities_page_Elements;
import pages.OVRElements.OVR_SchedulePage_Elements;
import pages.OVRElements.OVR_login_page_Elements;

import java.text.DateFormat;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.*;

public class OVR_ModalitiesSnippet extends DriverInitialisation {

    OVR_Modalities_page_Elements OVR_Modalities = PageFactory.initElements(driver, OVR_Modalities_page_Elements.class);

    OVR_login_page_Elements OVR_login_page = PageFactory.initElements(driver, OVR_login_page_Elements.class);

    OVR_Home_page_Elements OVR_Home = PageFactory.initElements(driver, OVR_Home_page_Elements.class);

    OVR_SchedulePage_Elements ovrSch =  PageFactory.initElements(driver,OVR_SchedulePage_Elements.class);
    Commonmethods base = new Commonmethods(driver, wait);

    Actions act = new Actions(driver);

    public static int event_list_index;

    public static HashMap<Integer, String> Subevent_list;

    public static HashMap<Integer, String> Subevent_rounds;

    public static int pool_Number_of_group=0;

    public static WebElement particular_event_element;
    @When("^create draw for subevent of '(.*)' operation '(.*)' Round of '(.*)'$")
    public void create_draw(String Subeventname, String operation, String Roundcategories) throws Exception{
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='spinner-bg']//div[@class='spinner-image']")));
        OVR_Home.button_OVR_Homepage_RightMenu_modality.click();
        //base.wait(2);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='spinner-image']")));
        List<WebElement> Event_list=OVR_Modalities.text_OVR_Modalities_eventlist.findElements(By.xpath("//span[contains(@id,'Event')]"));
        System.out.println("Size="+Event_list.size());
        for (int i=0;i<Event_list.size();i++){
            base.wait(1);
            System.out.println(i);
            String eventname=OVR_Modalities.text_OVR_Modalities_eventlist.findElement(By.xpath("//span[contains(@id,'Event"+i+"')]")).getText();
            //String eventname=OVR_Modalities.text_OVR_Modalities_eventlist.findElement(By.xpath("//li["+i+"]//span[contains(@class,'tree-label')]")).getText();
            System.out.println(eventname);
               if(eventname.equals(Subeventname)){
                System.out.println("listnumber="+i);
                event_list_index=i;
                break;
            }

        }
        base.wait(2);
        WebElement Dynamic_event_element=OVR_Modalities.text_OVR_Modalities_eventlist.findElement(By.xpath("//span[contains(@id,'Event"+event_list_index+"')]"));
        Dynamic_event_element.click();
        String Dynamic_event_name=Dynamic_event_element.getText();
        if(Subeventname.equals(Dynamic_event_name)) {
            base.wait(3);
            //WebElement DropdownElement=particular_event_element.findElement(By.xpath("//a[@id='dropdownMenuButton']//img"));
            WebElement DropdownElement=OVR_Modalities.text_OVR_Modalities_eventlist.findElement(By.xpath("//span[contains(@id,'Event"+event_list_index+"')]//parent::li//a[@id='dropdownMenuButton']"));
            base.wait(3);
            base.jclick(DropdownElement);
            base.wait(3);
            switch (operation) {

                case "Create/Update Phase":
                    OVR_Modalities.text_OVR_Modalities_eventlist.findElement(By.xpath("//span[contains(@id,'Event"+event_list_index+"')]//parent::li//a[contains(text(),'Create/Update Phase')]")).click();
                   // particular_event_element.findElement(By.xpath("//a[contains(text(),'Create/Update Phase')]")).click();
                    base.wait(1);

                    break;
                case "Create/Update Modality":
                    OVR_Modalities.text_OVR_Modalities_eventlist.findElement(By.xpath("//span[contains(@id,'Event"+event_list_index+"')]//parent::li//a[contains(text(),'Create/Update Phase')]")).click();

                    //particular_event_element.findElement(By.xpath("//a[contains(text(),'Create/Update Modality")).click();
                    base.wait(1);
                    break;
                case "Load Modality":
                    OVR_Modalities.text_OVR_Modalities_eventlist.findElement(By.xpath("//span[contains(@id,'Event"+event_list_index+"')]//parent::li//a[contains(text(),'Load Modality')]")).click();

                   // particular_event_element.findElement(By.xpath("//a[contains(text(),'Load Modality]")).click();
                    base.wait(3);

                    switch (Roundcategories) {

                        case "KO16 Direct KO Bo5":
                        WebElement Round_of_16_Element = driver.findElement(By.xpath("//*[@id='update_modality']/tbody/tr[4]/td[1]/div/label"));
                        Round_of_16_Element.click();
                        base.wait(3);
                        OVR_Modalities.button_OVR_Modalities_LoadModality_Loadmodality.click();
                        base.wait(7);
                        WebElement top_extended_button_element=OVR_Modalities.text_OVR_Modalities_eventlist.findElement(By.xpath("//span[contains(@id,'Event"+event_list_index+"')]//parent::li//label"));
                        base.jclick(top_extended_button_element);
                        base.wait(2);
                        WebElement bottom_extended_button_element= OVR_Modalities.text_OVR_Modalities_eventlist.findElement(By.xpath("//span[contains(@id,'Event"+event_list_index+"')]//parent::li//span[contains(text(),'16') and contains(@id,'Phase')]//parent::li//label"));
                        base.jclick(bottom_extended_button_element);
                        base.wait(5);
                        WebElement Knockout_element= OVR_Modalities.text_OVR_Modalities_eventlist.findElement(By.xpath("//span[contains(@id,'Event"+event_list_index+"')]//parent::li//span[contains(text(),'16') and contains(@id,'Phase')]//parent::li//a[contains(text(),'Draw Knockout (KO)')]"));
                        base.jclick(Knockout_element);
                        base.wait(5);
                        break;
                    }

                    break;
                case "Remove Progression":
                    OVR_Modalities.text_OVR_Modalities_eventlist.findElement(By.xpath("//span[contains(@id,'Event"+event_list_index+"')]//parent::li//a[contains(text(),'Remove Progression')]")).click();

                   // particular_event_element.findElement(By.xpath("//a[contains(text(),'Remove Progression')]")).click();
                    base.wait(1);
                    break;
                case "Pools":
                    OVR_Modalities.text_OVR_Modalities_eventlist.findElement(By.xpath("//span[contains(@id,'Event"+event_list_index+"')]//parent::li//a[contains(text(),'Pools')]")).click();

                    //particular_event_element.findElement(By.xpath("//a[contains(text(),'Pools")).click();
                    base.wait(1);
                    break;

            }

            OVR_Modalities.button_OVR_Modalities_Knockout_Filterby_AssignSeeds.click();
            base.wait(1);
            OVR_Modalities.button_OVR_Modalities_Knockout_Draw_Draw.click();

            //Alert alert = driver.switchTo().alert();
            //OVR_Modalities.text_OVR_Modalities_popup_Body.getText();
            //Assert.assertEquals("Do you want to create a draw?",OVR_Modalities.text_OVR_Modalities_popup_Body.getText().trim());
            base.wait(1);
            //alert.accept();
            OVR_Modalities.button_OVR_Modalities_popup_Yes.click();
            base.wait(3);
            OVR_Modalities.button_OVR_Modalities_Knockout_Byes_Add.click();
            base.wait(1);
            //Assert.assertEquals("Do you want to assign all the byes?",OVR_Modalities.text_OVR_Modalities_popup_Body.getText().trim());
            //alert.accept();
            OVR_Modalities.button_OVR_Modalities_popup_Yes.click();
            base.wait(3);
            OVR_Modalities.button_OVR_Modalities_Knockout_Publish.click();
            base.wait(5);
            OVR_Modalities.button_OVR_Modalities_Knockout_Back.click();
            base.wait(2);
            //Assert.assertEquals("Do you want to pass the status StartList?",OVR_Modalities.text_OVR_Modalities_popup_Body.getText().trim());
            base.wait(2);
            //alert.accept();
            OVR_Modalities.button_OVR_Modalities_popup_Yes.click();
            base.wait(2);

        }
        else {
            Assert.fail("Sub-Event not available");
        }

    }


    @When("^create draw for subevents operation '(.*)'$")
    public void create_draw_for_subevents(String operation) throws Exception{
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='spinner-bg']//div[@class='spinner-image']")));
        OVR_Home.button_OVR_Homepage_RightMenu_modality.click();
        //base.wait(2);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='spinner-image']")));
        List<WebElement> Event_list=OVR_Modalities.text_OVR_Modalities_eventlist.findElements(By.xpath("//span[contains(@id,'Event')]"));
        System.out.println("Size="+Event_list.size());
        for (int i=0;i<Event_list.size();i++) {
            base.wait(1);
            System.out.println(i);
            String eventname = OVR_Modalities.text_OVR_Modalities_eventlist.findElement(By.xpath("//span[contains(@id,'Event" + i + "')]")).getText();
            //String eventname=OVR_Modalities.text_OVR_Modalities_eventlist.findElement(By.xpath("//li["+i+"]//span[contains(@class,'tree-label')]")).getText();
            System.out.println(eventname);
            event_list_index = i;
            Subevent_list=new HashMap<Integer,String>();
            Subevent_list.put(i,eventname);
//            if(eventname.equals(Subeventname)){
//                System.out.println("listnumber="+i);
//                event_list_index=i;
//                break;
//            }


            base.wait(2);
            WebElement Dynamic_event_element = OVR_Modalities.text_OVR_Modalities_eventlist.findElement(By.xpath("//span[contains(@id,'Event" + event_list_index + "')]"));
            Dynamic_event_element.click();
            String Dynamic_event_name = Dynamic_event_element.getText();
            //  if(Subeventname.equals(Dynamic_event_name)) {
            base.wait(3);
            //WebElement DropdownElement=particular_event_element.findElement(By.xpath("//a[@id='dropdownMenuButton']//img"));
            WebElement DropdownElement = OVR_Modalities.text_OVR_Modalities_eventlist.findElement(By.xpath("//span[contains(@id,'Event" + event_list_index + "')]//parent::li//a[@id='dropdownMenuButton']"));
            base.wait(3);
            base.jclick(DropdownElement);
            base.wait(3);
            switch (operation) {

                case "Create/Update Phase":
                    OVR_Modalities.text_OVR_Modalities_eventlist.findElement(By.xpath("//span[contains(@id,'Event" + event_list_index + "')]//parent::li//a[contains(text(),'Create/Update Phase')]")).click();
                    // particular_event_element.findElement(By.xpath("//a[contains(text(),'Create/Update Phase')]")).click();
                    base.wait(1);

                    break;
                case "Create/Update Modality":
                    OVR_Modalities.text_OVR_Modalities_eventlist.findElement(By.xpath("//span[contains(@id,'Event" + event_list_index + "')]//parent::li//a[contains(text(),'Create/Update Phase')]")).click();

                    //particular_event_element.findElement(By.xpath("//a[contains(text(),'Create/Update Modality")).click();
                    base.wait(1);
                    break;
                case "Load Modality":
                    OVR_Modalities.text_OVR_Modalities_eventlist.findElement(By.xpath("//span[contains(@id,'Event" + event_list_index + "')]//parent::li//a[contains(text(),'Load Modality')]")).click();

                    // particular_event_element.findElement(By.xpath("//a[contains(text(),'Load Modality]")).click();
                    base.wait(3);

                    break;
                case "Remove Progression":
                    OVR_Modalities.text_OVR_Modalities_eventlist.findElement(By.xpath("//span[contains(@id,'Event" + event_list_index + "')]//parent::li//a[contains(text(),'Remove Progression')]")).click();

                    // particular_event_element.findElement(By.xpath("//a[contains(text(),'Remove Progression')]")).click();
                    base.wait(1);
                    break;
                case "Pools":
                    OVR_Modalities.text_OVR_Modalities_eventlist.findElement(By.xpath("//span[contains(@id,'Event" + event_list_index + "')]//parent::li//a[contains(text(),'Pools')]")).click();

                    //particular_event_element.findElement(By.xpath("//a[contains(text(),'Pools")).click();
                    base.wait(1);
                    break;

            }



            //}
//        else {
//            Assert.fail("Sub-Event not available");
//        }
        }

    }

    @When("^get the subevents from modality$")
    public void getsubevents() throws Exception{
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='spinner-bg']//div[@class='spinner-image']")));
        OVR_Home.button_OVR_Homepage_RightMenu_modality.click();
        base.wait(2);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='spinner-image']")));
        List<WebElement> Event_list=OVR_Modalities.text_OVR_Modalities_eventlist.findElements(By.xpath("//span[contains(@id,'Event')]"));
        System.out.println("Size="+Event_list.size());

        Subevent_list = new HashMap<Integer, String>();
        for (int i=0;i<Event_list.size();i++) {
            //base.wait(1);
            System.out.println(i);
            String eventname = OVR_Modalities.text_OVR_Modalities_eventlist.findElement(By.xpath("//span[contains(@id,'Event" + i + "')]")).getText();
            //String eventname=OVR_Modalities.text_OVR_Modalities_eventlist.findElement(By.xpath("//li["+i+"]//span[contains(@class,'tree-label')]")).getText();
            System.out.println(eventname);
            event_list_index = i;

            Subevent_list.put(i, eventname);
//            if(eventname.equals(Subeventname)){
//                System.out.println("listnumber="+i);
//                event_list_index=i;
//                break;
//            }


            //base.wait(2);
//            WebElement Dynamic_event_element = OVR_Modalities.text_OVR_Modalities_eventlist.findElement(By.xpath("//span[contains(@id,'Event" + event_list_index + "')]"));
//            Dynamic_event_element.click();
//            String Dynamic_event_name = Dynamic_event_element.getText();
        }

        for(Map.Entry m : Subevent_list.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

        System.out.println("Sub_event_count="+Subevent_list.size());
    }

    @When("^create draw using load modality functionality round of '(.*)'$")
    public void load_modality(String Roundcategories) throws Exception {

       // for (Map.Entry m : Subevent_list.entrySet())
        for (int i=0;i<Subevent_list.size();i++) {
                event_list_index = i;
            base.wait(2);
            WebElement Dynamic_event_element = OVR_Modalities.text_OVR_Modalities_eventlist.findElement(By.xpath("//span[contains(@id,'Event" + event_list_index + "')]"));

           // WebElement Dynamic_event_element = OVR_Modalities.text_OVR_Modalities_eventlist.findElement(By.xpath("//span[contains(@id,'Event" + m.getKey() + "')]"));
            Dynamic_event_element.click();
            String Dynamic_event_name = Dynamic_event_element.getText();
            //  if(Subeventname.equals(Dynamic_event_name)) {
            base.wait(3);
            //WebElement DropdownElement=particular_event_element.findElement(By.xpath("//a[@id='dropdownMenuButton']//img"));
            WebElement DropdownElement = OVR_Modalities.text_OVR_Modalities_eventlist.findElement(By.xpath("//span[contains(@id,'Event" + event_list_index + "')]//parent::li//a[@id='dropdownMenuButton']"));
           // WebElement DropdownElement = OVR_Modalities.text_OVR_Modalities_eventlist.findElement(By.xpath("//span[contains(@id,'Event" + m.getKey() + "')]//parent::li//a[@id='dropdownMenuButton']"));

            base.wait(3);
            base.jclick(DropdownElement);
            base.wait(3);

            switch (Roundcategories) {

                case "KO16 Direct KO Bo5":
                    OVR_Modalities.text_OVR_Modalities_eventlist.findElement(By.xpath("//span[contains(@id,'Event" + event_list_index + "')]//parent::li//a[contains(text(),'Load Modality')]")).click();
                    //OVR_Modalities.text_OVR_Modalities_eventlist.findElement(By.xpath("//span[contains(@id,'Event" + m.getKey() + "')]//parent::li//a[contains(text(),'Load Modality')]")).click();

                    // particular_event_element.findElement(By.xpath("//a[contains(text(),'Load Modality]")).click();
                    base.wait(3);
                    WebElement Round_of_16_Element = driver.findElement(By.xpath("//*[@id='update_modality']/tbody/tr[4]/td[1]/div/label"));
                    Round_of_16_Element.click();
                    base.wait(3);
                    OVR_Modalities.button_OVR_Modalities_LoadModality_Loadmodality.click();
                    base.wait(7);
                   WebElement top_extended_button_element = OVR_Modalities.text_OVR_Modalities_eventlist.findElement(By.xpath("//span[contains(@id,'Event" + event_list_index + "')]//parent::li//label"));
                   // WebElement top_extended_button_element = OVR_Modalities.text_OVR_Modalities_eventlist.findElement(By.xpath("//span[contains(@id,'Event" + m.getKey() + "')]//parent::li//label"));

                    base.jclick(top_extended_button_element);
                    base.wait(2);
                   WebElement bottom_extended_button_element = OVR_Modalities.text_OVR_Modalities_eventlist.findElement(By.xpath("//span[contains(@id,'Event" + event_list_index + "')]//parent::li//span[contains(text(),'16') and contains(@id,'Phase')]//parent::li//label"));
                    // WebElement bottom_extended_button_element = OVR_Modalities.text_OVR_Modalities_eventlist.findElement(By.xpath("//span[contains(@id,'Event" + m.getKey() + "')]//parent::li//span[contains(text(),'16') and contains(@id,'Phase')]//parent::li//label"));

                    base.jclick(bottom_extended_button_element);
                    base.wait(5);
                    WebElement Knockout_element = OVR_Modalities.text_OVR_Modalities_eventlist.findElement(By.xpath("//span[contains(@id,'Event" + event_list_index + "')]//parent::li//span[contains(text(),'16') and contains(@id,'Phase')]//parent::li//a[contains(text(),'Draw Knockout (KO)')]"));
                   // WebElement Knockout_element = OVR_Modalities.text_OVR_Modalities_eventlist.findElement(By.xpath("//span[contains(@id,'Event" + m.getKey() + "')]//parent::li//span[contains(text(),'16') and contains(@id,'Phase')]//parent::li//a[contains(text(),'Draw Knockout (KO)')]"));

                    base.jclick(Knockout_element);
                    base.wait(5);
                    break;

            }
                List<WebElement> Player_entries_list =OVR_Modalities.table_OVR_Modalities_Knockout_playerlist.findElements(By.tagName("tr"));
              int player_entries_count=Player_entries_list.size();
              System.out.println("player entry count="+player_entries_count);

              if(player_entries_count>1) {
                  OVR_Modalities.button_OVR_Modalities_Knockout_Filterby_AssignSeeds.click();
                  base.wait(1);
                  OVR_Modalities.button_OVR_Modalities_Knockout_Draw_Draw.click();

                  //Alert alert = driver.switchTo().alert();
                  //OVR_Modalities.text_OVR_Modalities_popup_Body.getText();
                  //Assert.assertEquals("Do you want to create a draw?",OVR_Modalities.text_OVR_Modalities_popup_Body.getText().trim());
                  base.wait(1);
                  //alert.accept();
                  OVR_Modalities.button_OVR_Modalities_popup_Yes.click();
                  base.wait(3);
                  OVR_Modalities.button_OVR_Modalities_Knockout_Byes_Add.click();
                  base.wait(1);
                  //Assert.assertEquals("Do you want to assign all the byes?",OVR_Modalities.text_OVR_Modalities_popup_Body.getText().trim());
                  //alert.accept();
                  OVR_Modalities.button_OVR_Modalities_popup_Yes.click();
                  base.wait(3);
                  OVR_Modalities.button_OVR_Modalities_Knockout_Publish.click();
                  base.wait(5);
                  OVR_Modalities.button_OVR_Modalities_Knockout_Back.click();
                  base.wait(2);
                  //Assert.assertEquals("Do you want to pass the status StartList?",OVR_Modalities.text_OVR_Modalities_popup_Body.getText().trim());
                  base.wait(2);
                  //alert.accept();
                  OVR_Modalities.button_OVR_Modalities_popup_Yes.click();
                  base.wait(2);
              }
              else{
                  base.wait(4);
                  OVR_Modalities.button_OVR_Modalities_Knockout_Back.click();
                  base.wait(4);
                  OVR_Modalities.button_OVR_Modalities_popup_No1.click();
                  base.wait(4);
                  OVR_Modalities.button_OVR_Modalities_popup_No.click();
                  base.wait(4);
              }

            base.wait(4);
        }
    }

    @When("^create draw for youth event using load modality functionality round of '(.*)'$")
    public void load_modality_youthevent(String Roundcategories) throws Exception {
        base.wait(2);
        //wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='spinner-bg']//div[@class='spinner-image']")));
        base.scrollToView(OVR_Home.button_OVR_Homepage_RightMenu_modality);
        base.wait(2);
        base.jclick(OVR_Home.button_OVR_Homepage_RightMenu_modality);
        //OVR_Home.button_OVR_Homepage_RightMenu_modality.click();
        base.wait(2);

        // for (Map.Entry m : Subevent_list.entrySet())
        for (int i=0;i<Subevent_list.size();i++) {
            event_list_index = i;
            base.wait(2);
            WebElement Dynamic_event_element = OVR_Modalities.text_OVR_Modalities_eventlist.findElement(By.xpath("//span[contains(@id,'Event" + event_list_index + "')]"));

            // WebElement Dynamic_event_element = OVR_Modalities.text_OVR_Modalities_eventlist.findElement(By.xpath("//span[contains(@id,'Event" + m.getKey() + "')]"));
            Dynamic_event_element.click();
            String Dynamic_event_name = Dynamic_event_element.getText();
            //  if(Subeventname.equals(Dynamic_event_name)) {
            base.wait(3);
            //WebElement DropdownElement=particular_event_element.findElement(By.xpath("//a[@id='dropdownMenuButton']//img"));
            WebElement DropdownElement = OVR_Modalities.text_OVR_Modalities_eventlist.findElement(By.xpath("//span[contains(@id,'Event" + event_list_index + "')]//parent::li//a[@id='dropdownMenuButton']"));
            // WebElement DropdownElement = OVR_Modalities.text_OVR_Modalities_eventlist.findElement(By.xpath("//span[contains(@id,'Event" + m.getKey() + "')]//parent::li//a[@id='dropdownMenuButton']"));

            base.wait(3);
            base.jclick(DropdownElement);
            base.wait(3);

            switch (Roundcategories) {

                case "KO16 Direct KO Bo5":
                    OVR_Modalities.text_OVR_Modalities_eventlist.findElement(By.xpath("//span[contains(@id,'Event" + event_list_index + "')]//parent::li//a[contains(text(),'Load Modality')]")).click();
                    //OVR_Modalities.text_OVR_Modalities_eventlist.findElement(By.xpath("//span[contains(@id,'Event" + m.getKey() + "')]//parent::li//a[contains(text(),'Load Modality')]")).click();

                    // particular_event_element.findElement(By.xpath("//a[contains(text(),'Load Modality]")).click();
                    base.wait(3);
                    WebElement Round_of_16_Element = driver.findElement(By.xpath("//*[@id='update_modality']/tbody/tr[4]/td[1]/div/label"));
                    Round_of_16_Element.click();
                    base.wait(3);
                    OVR_Modalities.button_OVR_Modalities_LoadModality_Loadmodality.click();
                    base.wait(3);
                    if(OVR_Modalities.button_OVR_Modalities_popup_Yes.isDisplayed()) {
                        base.wait(2);
                        OVR_Modalities.button_OVR_Modalities_popup_Yes.click();
                    }
                    base.wait(7);
                    WebElement top_extended_button_element = OVR_Modalities.text_OVR_Modalities_eventlist.findElement(By.xpath("//span[contains(@id,'Event" + event_list_index + "')]//parent::li//label"));
                    // WebElement top_extended_button_element = OVR_Modalities.text_OVR_Modalities_eventlist.findElement(By.xpath("//span[contains(@id,'Event" + m.getKey() + "')]//parent::li//label"));

                    base.jclick(top_extended_button_element);
                    base.wait(2);
                    WebElement bottom_extended_button_element = OVR_Modalities.text_OVR_Modalities_eventlist.findElement(By.xpath("//span[contains(@id,'Event" + event_list_index + "')]//parent::li//span[contains(text(),'16') and contains(@id,'Phase')]//parent::li//label"));
                    // WebElement bottom_extended_button_element = OVR_Modalities.text_OVR_Modalities_eventlist.findElement(By.xpath("//span[contains(@id,'Event" + m.getKey() + "')]//parent::li//span[contains(text(),'16') and contains(@id,'Phase')]//parent::li//label"));

                    base.jclick(bottom_extended_button_element);
                    base.wait(5);
                    WebElement Knockout_element = OVR_Modalities.text_OVR_Modalities_eventlist.findElement(By.xpath("//span[contains(@id,'Event" + event_list_index + "')]//parent::li//span[contains(text(),'16') and contains(@id,'Phase')]//parent::li//a[contains(text(),'Draw Knockout (KO)')]"));
                    // WebElement Knockout_element = OVR_Modalities.text_OVR_Modalities_eventlist.findElement(By.xpath("//span[contains(@id,'Event" + m.getKey() + "')]//parent::li//span[contains(text(),'16') and contains(@id,'Phase')]//parent::li//a[contains(text(),'Draw Knockout (KO)')]"));

                    base.jclick(Knockout_element);
                    base.wait(5);
                    break;

            }
            List<WebElement> Player_entries_list =OVR_Modalities.table_OVR_Modalities_Knockout_playerlist.findElements(By.tagName("tr"));
            int player_entries_count=Player_entries_list.size();
            System.out.println("player entry count="+player_entries_count);

            if(player_entries_count>1) {
                base.wait(1);
                OVR_Modalities.dropdown_OVR_Modalities_Knockout_Filterby_RkinGroup.click();
                base.wait(1);
                OVR_Modalities.dropdownoption_OVR_Modalities_Knockout_Filterby_RkinGroup_1.click();
                base.wait(1);
                OVR_Modalities.dropdown_OVR_Modalities_Knockout_Filterby_RkinGroup.click();
                base.wait(1);
                OVR_Modalities.dropdownoption_OVR_Modalities_Knockout_Filterby_RkinGroup_2.click();
                base.wait(1);
                OVR_Modalities.button_OVR_Modalities_Knockout_Filterby_AssignSeeds.click();
                base.wait(1);
                OVR_Modalities.button_OVR_Modalities_Knockout_Draw_Draw.click();

                //Alert alert = driver.switchTo().alert();
                //OVR_Modalities.text_OVR_Modalities_popup_Body.getText();
                //Assert.assertEquals("Do you want to create a draw?",OVR_Modalities.text_OVR_Modalities_popup_Body.getText().trim());
                base.wait(1);
                //alert.accept();
                OVR_Modalities.button_OVR_Modalities_popup_Yes.click();
                base.wait(3);
                OVR_Modalities.button_OVR_Modalities_Knockout_Byes_Add.click();
                base.wait(1);
                //Assert.assertEquals("Do you want to assign all the byes?",OVR_Modalities.text_OVR_Modalities_popup_Body.getText().trim());
                //alert.accept();
                OVR_Modalities.button_OVR_Modalities_popup_Yes.click();
                base.wait(3);
                OVR_Modalities.button_OVR_Modalities_Knockout_Publish.click();
                base.wait(5);
                OVR_Modalities.button_OVR_Modalities_Knockout_Back.click();
                base.wait(2);
                //Assert.assertEquals("Do you want to pass the status StartList?",OVR_Modalities.text_OVR_Modalities_popup_Body.getText().trim());
                base.wait(2);
                //alert.accept();
                OVR_Modalities.button_OVR_Modalities_popup_Yes.click();
                base.wait(2);
            }
            else{
                base.wait(4);
                OVR_Modalities.button_OVR_Modalities_Knockout_Back.click();
                base.wait(4);
                OVR_Modalities.button_OVR_Modalities_popup_No1.click();
                base.wait(4);
                OVR_Modalities.button_OVR_Modalities_popup_No.click();
                base.wait(4);
            }

            base.wait(4);
        }
    }

    @When("^create draw using pool functionality$")
    public void create_pool_standing() throws Exception {
        System.out.println("Sub_event_count="+Subevent_list.size());
        for (int i=0;i<Subevent_list.size();i++) {
            event_list_index = i;
            base.wait(2);
            WebElement Dynamic_event_element = OVR_Modalities.text_OVR_Modalities_eventlist.findElement(By.xpath("//span[contains(@id,'Event" + event_list_index + "')]"));

            // WebElement Dynamic_event_element = OVR_Modalities.text_OVR_Modalities_eventlist.findElement(By.xpath("//span[contains(@id,'Event" + m.getKey() + "')]"));
            Dynamic_event_element.click();
            String Dynamic_event_name = Dynamic_event_element.getText();
            //  if(Subeventname.equals(Dynamic_event_name)) {
            base.wait(3);
            //WebElement DropdownElement=particular_event_element.findElement(By.xpath("//a[@id='dropdownMenuButton']//img"));
            WebElement DropdownElement = OVR_Modalities.text_OVR_Modalities_eventlist.findElement(By.xpath("//span[contains(@id,'Event" + event_list_index + "')]//parent::li//a[@id='dropdownMenuButton']"));
            // WebElement DropdownElement = OVR_Modalities.text_OVR_Modalities_eventlist.findElement(By.xpath("//span[contains(@id,'Event" + m.getKey() + "')]//parent::li//a[@id='dropdownMenuButton']"));

            base.wait(3);
            base.jclick(DropdownElement);
            base.wait(3);

            OVR_Modalities.text_OVR_Modalities_eventlist.findElement(By.xpath("//span[contains(@id,'Event" + event_list_index + "')]//parent::li//a[contains(text(),'Pools')]")).click();
            base.wait(3);


            //String player_entries_count=OVR_Modalities.text_OVR_Modalities_pool_Entries.getText();
            String player_entries_count=OVR_Modalities.text_OVR_Modalities_pool_Entries.getAttribute("value");
            base.wait(3);
            int player_entries_count_1=Integer.parseInt(player_entries_count);
            System.out.println("player_entries_count="+player_entries_count_1);

            if(player_entries_count_1!=0){

                if (player_entries_count_1 % 2 == 0) {
//                    OVR_Modalities.text_OVR_Modalities_pool_GroupPriority.clear();
//                    base.wait(1);
//                    OVR_Modalities.text_OVR_Modalities_pool_GroupPriority.sendKeys("4");
//                    base.wait(1);
//                    OVR_Modalities.text_OVR_Modalities_pool_Bestof.sendKeys("5");
//                    base.wait(1);
                    OVR_Modalities.button_OVR_Modalities_pool_AssignSeeds.click();
                    base.wait(3);
                    base.jclick(OVR_Modalities.radio_OVR_Modalities_pool_AssignSeeds_All);
                    base.wait(1);
                    OVR_Modalities.button_OVR_Modalities_pool_AssignSeeds_Assign.click();
                    base.wait(3);
                    OVR_Modalities.text_OVR_Modalities_pool_GroupPriority.clear();
                    base.wait(1);
                    OVR_Modalities.text_OVR_Modalities_pool_GroupPriority.sendKeys("4");
                    base.wait(1);
                    OVR_Modalities.text_OVR_Modalities_pool_Bestof.sendKeys("5");
                    base.wait(1);
                    OVR_Modalities.button_OVR_Modalities_pool_CreatePools.click();
                    base.wait(6);
                    List<WebElement> number_of_groups=OVR_Modalities.table_OVR_Modalities_pool_grouptable.findElements(By.tagName("tr"));
                    pool_Number_of_group=number_of_groups.size();
                    System.out.println("number_of_groups="+pool_Number_of_group);
                    OVR_Modalities.button_OVR_Modalities_pool_AssignSeeds.click();
                    base.wait(3);
                    //OVR_Modalities.radio_OVR_Modalities_pool_AssignSeeds_All.click();
                    base.jclick(OVR_Modalities.radio_OVR_Modalities_pool_AssignSeeds_All);
                    base.wait(1);
                    OVR_Modalities.button_OVR_Modalities_pool_AssignSeeds_Assign.click();
                    base.wait(3);
                    OVR_Modalities.button_OVR_Modalities_pool_DrawPools.click();
                    base.wait(5);
                    OVR_Modalities.button_OVR_Modalities_popup_Yes.click();
                    base.wait(5);
                }
                else {
//                    OVR_Modalities.text_OVR_Modalities_pool_GroupPriority.sendKeys("3");
//                    base.wait(1);
//                    OVR_Modalities.text_OVR_Modalities_pool_Bestof.sendKeys("5");
//                    base.wait(1);
                    OVR_Modalities.button_OVR_Modalities_pool_AssignSeeds.click();
                    base.wait(3);
                    base.jclick(OVR_Modalities.radio_OVR_Modalities_pool_AssignSeeds_All);
                    base.wait(1);
                    OVR_Modalities.button_OVR_Modalities_pool_AssignSeeds_Assign.click();
                    base.wait(3);
                    OVR_Modalities.text_OVR_Modalities_pool_GroupPriority.clear();
                    base.wait(1);
                    OVR_Modalities.text_OVR_Modalities_pool_GroupPriority.sendKeys("3");
                    base.wait(1);
                    OVR_Modalities.text_OVR_Modalities_pool_Bestof.sendKeys("5");
                    base.wait(1);
                    OVR_Modalities.button_OVR_Modalities_pool_CreatePools.click();
                    base.wait(8);
                    List<WebElement> number_of_groups=OVR_Modalities.table_OVR_Modalities_pool_grouptable.findElements(By.tagName("tr"));
                    pool_Number_of_group=number_of_groups.size();
                    System.out.println("number_of_groups="+pool_Number_of_group);
                    OVR_Modalities.button_OVR_Modalities_pool_AssignSeeds.click();
                    base.wait(3);
                    //OVR_Modalities.radio_OVR_Modalities_pool_AssignSeeds_All.click();
                    base.jclick(OVR_Modalities.radio_OVR_Modalities_pool_AssignSeeds_All);
                    base.wait(1);
                    OVR_Modalities.button_OVR_Modalities_pool_AssignSeeds_Assign.click();
                    base.wait(3);
                    OVR_Modalities.button_OVR_Modalities_pool_DrawPools.click();
                    base.wait(3);
                    OVR_Modalities.button_OVR_Modalities_popup_Yes.click();
                    base.wait(5);
                }
                base.wait(2);
                OVR_Modalities.button_OVR_Modalities_pool_Publish.click();
                base.wait(1);
                //OVR_Modalities.button_OVR_Modalities_pool_Back.click();
                base.jclick(OVR_Modalities.button_OVR_Modalities_pool_Back);
                base.wait(2);

                WebElement top_extended_button_element = OVR_Modalities.text_OVR_Modalities_eventlist.findElement(By.xpath("//span[contains(@id,'Event" + event_list_index + "')]//parent::li//label"));
                // WebElement top_extended_button_element = OVR_Modalities.text_OVR_Modalities_eventlist.findElement(By.xpath("//span[contains(@id,'Event" + m.getKey() + "')]//parent::li//label"));

                base.jclick(top_extended_button_element);
                base.wait(2);
                WebElement bottom_extended_button_element = OVR_Modalities.text_OVR_Modalities_eventlist.findElement(By.xpath("//span[contains(@id,'Event" + event_list_index + "')]//parent::li//span[contains(text(),'Group " + pool_Number_of_group + "') and contains(@id,'Phase')]//parent::li//label"));
                // WebElement bottom_extended_button_element = OVR_Modalities.text_OVR_Modalities_eventlist.findElement(By.xpath("//span[contains(@id,'Event" + m.getKey() + "')]//parent::li//span[contains(text(),'16') and contains(@id,'Phase')]//parent::li//label"));

                base.jclick(bottom_extended_button_element);
                base.wait(5);
                WebElement Draw_Pools = OVR_Modalities.text_OVR_Modalities_eventlist.findElement(By.xpath("//span[contains(@id,'Event" + event_list_index + "')]//parent::li//span[contains(text(),'Group " + pool_Number_of_group + "') and contains(@id,'Phase')]//parent::li//a[contains(text(),'Draw Pools')]"));
                Draw_Pools.click();
                base.wait(5);
                base.jclick(OVR_Modalities.radio_OVR_Modalities_pool_DrawPools_OptionA);
                base.wait(2);
                OVR_Modalities.button_OVR_Modalities_pool_DrawPools_Draw.click();
                base.wait(5);
//                OVR_Modalities.button_OVR_Modalities_pool_DrawPools_Draw.click();
//                base.wait(2);
                if(OVR_Modalities.checkbox_OVR_Modalities_pool_DrawPools_DrawAll.isSelected()) {
                    base.wait(1);
                }
                else {
                    base.wait(1);
                    //OVR_Modalities.checkbox_OVR_Modalities_pool_DrawPools_DrawAll.click();
                    base.jclick(OVR_Modalities.checkbox_OVR_Modalities_pool_DrawPools_DrawAll);
                }
                base.wait(2);
                OVR_Modalities.button_OVR_Modalities_pool_DrawPools_Save.click();
                base.wait(5);
                OVR_Modalities.button_OVR_Modalities_popup_Yes.click();
                base.wait(2);


            }
            else {
                base.wait(2);
                OVR_Modalities.button_OVR_Modalities_pool_Back.click();
            }

        }

        base.wait(4);

    }

    @When("^get the round of matches for pool standing$")
    public void get_rounds_matches_pools_standing() throws Exception {
        base.wait(3);
        ovrSch.OVR_ScheduleBtn.click();
        base.wait(2);
        ovrSch.OVR_CrtScheduleBtn.click();
        base.wait(2);
        ovrSch.OVR_SelectUnit.click();
        base.wait(6);

        Subevent_rounds=new HashMap<Integer,String>();
        List<WebElement> event_schedule_table_list;

        for(int i=1;i<100;i++){
           String roundname="R"+ i +"";
            base.wait(1);
            ovrSch.text_OVR_scedule_selectunit_select_unit.clear();
            base.wait(1);
            ovrSch.text_OVR_scedule_selectunit_select_unit.sendKeys(roundname);
            base.wait(4);
            List<WebElement> subevent_list_scedule=ovrSch.list_OVR_scedule_selectunit_subevents.findElements(By.tagName("li"));

            if (subevent_list_scedule.size()!=0){
                Subevent_rounds.put(i,roundname);
            }
            else if(subevent_list_scedule.size()==0){
                base.wait(1);
                ovrSch.button_OVR_scedule_selectunit_closebutton.click();
                break;
            }
            else{
                base.wait(1);
                ovrSch.button_OVR_scedule_selectunit_closebutton.click();

                break;
            }



        }

        base.wait(3);

        event_schedule_table_list=ovrSch.table_OVR_scedule_table.findElements(By.tagName("tr"));

        System.out.println("number of schedule="+event_schedule_table_list.size());
        for (int j=0;j<event_schedule_table_list.size();j++){
            base.wait(1);
            event_schedule_table_list.get(j).click();
            //base.jclick(event_schedule_table_list.get(j));
            base.wait(1);
            ovrSch.button_OVR_scedule_RemoveSelectedLine.click();
            base.wait(2);
            ovrSch.button_OVR_scedule_RemoveSelectedLine_confirmation_yes.click();
            base.wait(2);
        }

        for(Map.Entry m : Subevent_rounds.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }



    }

    @When("^schedule the pool standing matches$")
    public void schedule_pool_standing_matches() throws Exception {
        List<WebElement> event_schedule_table_list;
        String first_subevent_endtime = "null";
        String second_subevent_endtime = "null";
        String third_subevent_endtime = "null";
//        HashMap<Integer, String> dateValue_hashmap;
//        dateValue_hashmap=new HashMap<Integer, String>();
        HashMap<Integer, String> subevent_endtime_hashmap;
        subevent_endtime_hashmap=new HashMap<Integer, String>();
        int Starttime_temp = 0;
        int first_subevent_endtime_hour_int=0;
        int second_subevent_endtime_hour_int=0;
        int k=0;
        String dateValue="null";
        String s;
        Date date;
        Format formatter;
        Calendar calendar = Calendar.getInstance();
        LinkedList<String> dateValue_hashmap=new LinkedList<String>();
        base.wait(3);
        ovrSch.OVR_ScheduleBtn.click();
        base.wait(2);

        for (int i=1;i<Subevent_rounds.size()+1;i++){


//            ovrSch.OVR_ScheduleBtn.click();
//            base.wait(2);

            ovrSch.OVR_CrtScheduleBtn.click();
            base.wait(2);
            ovrSch.OVR_SelectUnit.click();
            base.wait(6);


            ovrSch.text_OVR_scedule_selectunit_select_unit.clear();
            base.wait(1);
            ovrSch.text_OVR_scedule_selectunit_select_unit.sendKeys(Subevent_rounds.get(i));
            base.wait(4);
            List<WebElement> subevent_list_scedule=ovrSch.list_OVR_scedule_selectunit_subevents.findElements(By.tagName("li"));
            base.wait(1);

            System.out.println("sub event count="+subevent_list_scedule.size());
            for (int j=0;j<subevent_list_scedule.size();j++){
                base.wait(1);
                //subevent_list_scedule.get(i).findElement(By.xpath("//input[@type='checkbox' and @id='event" + j + "']")).click();
                //base.jclick(subevent_list_scedule.get(i).findElement(By.xpath("//input[@type='checkbox' and @id='event" + j + "']")));
                //ovrSch.list_OVR_scedule_selectunit_subevents.findElement(By.xpath("//input[@type='checkbox' and @id='event" + j + "']"));
                //subevent_list_scedule.get(i).findElement(By.xpath("//label[@for='event" + j + "']//input[@type='checkbox']")).click();
                try {
                    base.jclick(subevent_list_scedule.get(i).findElement(By.xpath("//label[@for='event" + j + "']//input[@type='checkbox']")));
                }
                catch (NoSuchElementException exception){
                    break;
                }
                base.wait(3);
            }
            base.jclick(ovrSch.checkbox_OVR_scedule_selectunit_subevents_matches_selectedall);
            //ovrSch.checkbox_OVR_scedule_selectunit_subevents_matches_selectedall.click();
            base.wait(1);
            ovrSch.button_OVR_scedule_selectunit_AddUnits.click();
            base.wait(6);

            event_schedule_table_list=ovrSch.table_OVR_scedule_table.findElements(By.tagName("tr"));

            System.out.println("number of schedule="+event_schedule_table_list.size());

            for (int j=0;j<event_schedule_table_list.size();j++) {

                base.wait(1);
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("HH");
                formatter = new SimpleDateFormat("dd/MM/yyyy");
                LocalDateTime now = LocalDateTime.now();

                base.wait(1);
                base.doubleClick(event_schedule_table_list.get(j).findElement(By.xpath("//td[contains(@aria-label,'Start Date')]")));
                base.wait(1);
                event_schedule_table_list.get(j).findElement(By.xpath("//input[@name='startDate']")).clear();
                base.wait(1);
                if(i==1){
                    //dateValue_hashmap.put(i-1, dtf.format(now));
                    dateValue_hashmap.add(dtf.format(now));
                    event_schedule_table_list.get(j).findElement(By.xpath("//input[@name='startDate']")).sendKeys(dateValue_hashmap.getLast());
                    base.wait(1);
                    Starttime_temp = Integer.parseInt(dtf1.format(now)) + 1;
                    String Starttime_temp1 = String.valueOf(Starttime_temp);
                    String Starttime = Starttime_temp1 + ":" + "00";
                    subevent_endtime_hashmap.put(i-1,Starttime);
                    event_schedule_table_list.get(j).findElement(By.xpath("//input[@name='startTime']")).clear();
                    base.wait(1);
                    event_schedule_table_list.get(j).findElement(By.xpath("//input[@name='startTime']")).sendKeys(Starttime);
                    base.wait(1);
                }
                else {

                    System.out.println("first_subevent_endtime_array="+subevent_endtime_hashmap.get(i-2));
                    System.out.println("second_subevent_endtime_array="+subevent_endtime_hashmap.get(i-1));

                    String[] first_subevent_endtime_array=subevent_endtime_hashmap.get(i-2).split(":");
                    first_subevent_endtime_hour_int=Integer.parseInt(first_subevent_endtime_array[0]);
                    String[] second_subevent_endtime_array=subevent_endtime_hashmap.get(i-1).split(":");
                    second_subevent_endtime_hour_int=Integer.parseInt(second_subevent_endtime_array[0]);
                    if(first_subevent_endtime_hour_int>second_subevent_endtime_hour_int){
                        //calendar.add(Calendar.DATE, i-1);
                        k=k+1;
                        calendar.add(Calendar.DATE, k);
                        date = calendar.getTime();
                        dateValue = formatter.format(date);
                        //dateValue_hashmap.put(i, dateValue);
                        dateValue_hashmap.add(dateValue);
                        event_schedule_table_list.get(j).findElement(By.xpath("//input[@name='startDate']")).sendKeys(dateValue_hashmap.getLast());
                        base.wait(1);
                        event_schedule_table_list.get(j).findElement(By.xpath("//input[@name='startTime']")).clear();
                        base.wait(1);
                        event_schedule_table_list.get(j).findElement(By.xpath("//input[@name='startTime']")).sendKeys(subevent_endtime_hashmap.get(i-1));
                        base.wait(1);
                    }
                    else {
                        //System.out.println("first_date="+dateValue_hashmap.get(i-2));
                        event_schedule_table_list.get(j).findElement(By.xpath("//input[@name='startDate']")).sendKeys(dateValue_hashmap.getLast());
                        base.wait(1);
                        event_schedule_table_list.get(j).findElement(By.xpath("//input[@name='startTime']")).clear();
                        base.wait(1);
                        event_schedule_table_list.get(j).findElement(By.xpath("//input[@name='startTime']")).sendKeys(subevent_endtime_hashmap.get(i-1));
                        base.wait(1);
                    }

                }

                base.wait(1);
                base.scrollToView(event_schedule_table_list.get(j).findElement(By.xpath("//input[@name='duration']//parent::span//input")));
                base.wait(1);
                base.jclick(event_schedule_table_list.get(j).findElement(By.xpath("//input[@name='duration']//parent::span//input")));
                base.wait(1);
                event_schedule_table_list.get(j).findElement(By.xpath("//input[@name='duration']//parent::span//input")).clear();
                base.wait(1);
                event_schedule_table_list.get(j).findElement(By.xpath("//input[@name='duration']//parent::span//input")).sendKeys("30");
                base.wait(1);
                event_schedule_table_list.get(j).findElement(By.xpath("//input[@name='duration']//parent::span//input")).sendKeys(Keys.ENTER);
                base.wait(9);
                WebElement endtime = driver.findElement(By.xpath("//th//div//span[text()='End Time']"));
                base.wait(3);
                base.scrollToView(endtime);
                base.wait(9);
                driver.switchTo().defaultContent();
                base.wait(3);
                WebElement subevent_endtime_element = driver.findElement(By.xpath("//ejs-grid//div[@class='e-gridcontent']//tbody//tr[" + (j + 1) + "]//td[19]"));
                String subevent_endtime;
                try {
                    subevent_endtime =subevent_endtime_element.getText();
                    subevent_endtime_hashmap.put(i,subevent_endtime );
                } catch (StaleElementReferenceException e) {
                    subevent_endtime = event_schedule_table_list.get(j - 1).findElement(By.cssSelector("td:nth-child(19)")).getText();
                    subevent_endtime_hashmap.put(i,subevent_endtime );
                }
                base.wait(1);
                System.out.println("first_subevent_endtime=" + subevent_endtime_hashmap.get(i));
                base.wait(3);
/*
//linestart
                if(i==1) {

                    base.wait(1);
                    base.doubleClick(event_schedule_table_list.get(j).findElement(By.xpath("//td[contains(@aria-label,'Start Date')]")));
                    base.wait(1);
                    event_schedule_table_list.get(j).findElement(By.xpath("//input[@name='startDate']")).clear();
                    base.wait(1);
                    event_schedule_table_list.get(j).findElement(By.xpath("//input[@name='startDate']")).sendKeys(dtf.format(now));
                    base.wait(1);
                    //base.doubleClick(event_schedule_table_list.get(0).findElement(By.xpath("//td[contains(@aria-label,'Start Time')]")));
                    base.wait(1);
                     Starttime_temp = Integer.parseInt(dtf1.format(now)) + 1;
                    String Starttime_temp1 = String.valueOf(Starttime_temp);
                    String Starttime = Starttime_temp1 + ":" + "00";
                    event_schedule_table_list.get(j).findElement(By.xpath("//input[@name='startTime']")).clear();
                    base.wait(1);
                    event_schedule_table_list.get(j).findElement(By.xpath("//input[@name='startTime']")).sendKeys(Starttime);
                    base.wait(1);
                    //base.doubleClick( event_schedule_table_list.get(0).findElement(By.xpath("//td[contains(@aria-label,'Duration')]")));
                    base.wait(1);
                    base.scrollToView(event_schedule_table_list.get(j).findElement(By.xpath("//input[@name='duration']//parent::span//input")));
                    //act.moveToElement(event_schedule_table_list.get(0).findElement(By.xpath("//input[@name='duration']"))).click().perform();
                    //base.clickElement(event_schedule_table_list.get(0).findElement(By.xpath("//input[@name='duration']")));
                    base.wait(1);
                    // base.jclick(event_schedule_table_list.get(0).findElement(By.xpath("//input[@name='duration']")));
                    base.jclick(event_schedule_table_list.get(j).findElement(By.xpath("//input[@name='duration']//parent::span//input")));
                    //event_schedule_table_list.get(0).findElement(By.xpath("//input[@name='duration']")).click();
                    base.wait(1);
                    //   event_schedule_table_list.get(0).findElement(By.xpath("//input[@name='duration']")).clear();
                    event_schedule_table_list.get(j).findElement(By.xpath("//input[@name='duration']//parent::span//input")).clear();
                    base.wait(1);
                    // event_schedule_table_list.get(0).findElement(By.xpath("//input[@name='duration']")).sendKeys("30");
                    event_schedule_table_list.get(j).findElement(By.xpath("//input[@name='duration']//parent::span//input")).sendKeys("30");
                    base.wait(1);
                    event_schedule_table_list.get(j).findElement(By.xpath("//input[@name='duration']//parent::span//input")).sendKeys(Keys.ENTER);
                    base.wait(9);
                    //driver.navigate().refresh();
                    //base.wait(9);
                    WebElement endtime = driver.findElement(By.xpath("//th//div//span[text()='End Time']"));
                    base.wait(3);
                    base.scrollToView(endtime);
                    base.wait(9);
                    // WebElement subevent_endtime_element=event_schedule_table_list.get(0).findElement(By.xpath("//td[contains(@aria-label,'End Time')]"));
                    //base.scrollToView(subevent_endtime_element);
                    // base.wait(7);
                    //String first_subevent_endtime=subevent_endtime_element.getText();
                    driver.switchTo().defaultContent();
                    base.wait(3);
                    WebElement subevent_endtime_element = driver.findElement(By.xpath("//ejs-grid//div[@class='e-gridcontent']//tbody//tr[" + (j + 1) + "]//td[19]"));

                    try {
                        first_subevent_endtime = subevent_endtime_element.getText();
                        //first_subevent_endtime=event_schedule_table_list.get(0).findElement(By.cssSelector("//td[contains(@aria-label,'End Time')]")).getText();
                    } catch (StaleElementReferenceException e) {
                        first_subevent_endtime = event_schedule_table_list.get(j - 1).findElement(By.cssSelector("td:nth-child(19)")).getText();
                    }
                    base.wait(1);
                    System.out.println("first_subevent_endtime=" + first_subevent_endtime);
                    base.wait(3);
                }
                else if(i==2) {
                     //Starttime_temp = Integer.parseInt(dtf1.format(now));
                    String[] first_subevent_endtime_array=first_subevent_endtime.split(":");
                     first_subevent_endtime_hour_int=Integer.parseInt(first_subevent_endtime_array[0]);

                    if (Starttime_temp>first_subevent_endtime_hour_int) {
                        base.wait(1);
                        base.doubleClick(event_schedule_table_list.get(j).findElement(By.xpath("//td[contains(@aria-label,'Start Date')]")));
                        base.wait(1);
                        event_schedule_table_list.get(j).findElement(By.xpath("//input[@name='startDate']")).clear();
                        base.wait(1);
                        calendar.add(Calendar.DATE, 1);
                        date = calendar.getTime();
                        dateValue = formatter.format(date);

                        event_schedule_table_list.get(j).findElement(By.xpath("//input[@name='startDate']")).sendKeys(dateValue);
                        base.wait(1);
                        //base.doubleClick(event_schedule_table_list.get(0).findElement(By.xpath("//td[contains(@aria-label,'Start Time')]")));
                        base.wait(1);
//                    int Starttime_temp = Integer.parseInt(dtf1.format(now)) + 1;
//                    String Starttime_temp1 = String.valueOf(Starttime_temp);
//                    String Starttime = Starttime_temp1 + ":" + "00";
                        event_schedule_table_list.get(j).findElement(By.xpath("//input[@name='startTime']")).clear();
                        base.wait(1);
                        event_schedule_table_list.get(j).findElement(By.xpath("//input[@name='startTime']")).sendKeys(first_subevent_endtime);
                        base.wait(1);
                        //base.doubleClick( event_schedule_table_list.get(0).findElement(By.xpath("//td[contains(@aria-label,'Duration')]")));
                        base.wait(1);
                        base.scrollToView(event_schedule_table_list.get(j).findElement(By.xpath("//input[@name='duration']//parent::span//input")));
                        //act.moveToElement(event_schedule_table_list.get(0).findElement(By.xpath("//input[@name='duration']"))).click().perform();
                        //base.clickElement(event_schedule_table_list.get(0).findElement(By.xpath("//input[@name='duration']")));
                        base.wait(1);
                        // base.jclick(event_schedule_table_list.get(0).findElement(By.xpath("//input[@name='duration']")));
                        base.jclick(event_schedule_table_list.get(j).findElement(By.xpath("//input[@name='duration']//parent::span//input")));
                        //event_schedule_table_list.get(0).findElement(By.xpath("//input[@name='duration']")).click();
                        base.wait(1);
                        //   event_schedule_table_list.get(0).findElement(By.xpath("//input[@name='duration']")).clear();
                        event_schedule_table_list.get(j).findElement(By.xpath("//input[@name='duration']//parent::span//input")).clear();
                        base.wait(1);
                        // event_schedule_table_list.get(0).findElement(By.xpath("//input[@name='duration']")).sendKeys("30");
                        event_schedule_table_list.get(j).findElement(By.xpath("//input[@name='duration']//parent::span//input")).sendKeys("30");
                        base.wait(1);
                        event_schedule_table_list.get(j).findElement(By.xpath("//input[@name='duration']//parent::span//input")).sendKeys(Keys.ENTER);
                        base.wait(9);
                        //driver.navigate().refresh();
                        //base.wait(9);
                        WebElement endtime = driver.findElement(By.xpath("//th//div//span[text()='End Time']"));
                        base.wait(3);
                        base.scrollToView(endtime);
                        base.wait(9);
                        // WebElement subevent_endtime_element=event_schedule_table_list.get(0).findElement(By.xpath("//td[contains(@aria-label,'End Time')]"));
                        //base.scrollToView(subevent_endtime_element);
                        // base.wait(7);
                        //String first_subevent_endtime=subevent_endtime_element.getText();
                        driver.switchTo().defaultContent();
                        base.wait(3);
                        WebElement subevent_endtime_element = driver.findElement(By.xpath("//ejs-grid//div[@class='e-gridcontent']//tbody//tr[" + (j + 1) + "]//td[19]"));

                        try {
                            second_subevent_endtime = subevent_endtime_element.getText();
                            //first_subevent_endtime=event_schedule_table_list.get(0).findElement(By.cssSelector("//td[contains(@aria-label,'End Time')]")).getText();
                        } catch (StaleElementReferenceException e) {
                            second_subevent_endtime = event_schedule_table_list.get(j - 1).findElement(By.cssSelector("td:nth-child(19)")).getText();
                        }
                        base.wait(1);
                        System.out.println("first_subevent_endtime=" + second_subevent_endtime);
                        base.wait(3);

                    }
                    else {

                        base.wait(1);
                        base.doubleClick(event_schedule_table_list.get(j).findElement(By.xpath("//td[contains(@aria-label,'Start Date')]")));
                        base.wait(1);
                        event_schedule_table_list.get(j).findElement(By.xpath("//input[@name='startDate']")).clear();
                        base.wait(1);
                        dateValue=dtf.format(now);
                        event_schedule_table_list.get(j).findElement(By.xpath("//input[@name='startDate']")).sendKeys(dateValue);
                        base.wait(1);
                        //base.doubleClick(event_schedule_table_list.get(0).findElement(By.xpath("//td[contains(@aria-label,'Start Time')]")));
                        base.wait(1);
//                    int Starttime_temp = Integer.parseInt(dtf1.format(now)) + 1;
//                    String Starttime_temp1 = String.valueOf(Starttime_temp);
//                    String Starttime = Starttime_temp1 + ":" + "00";
                        event_schedule_table_list.get(j).findElement(By.xpath("//input[@name='startTime']")).clear();
                        base.wait(1);
                        event_schedule_table_list.get(j).findElement(By.xpath("//input[@name='startTime']")).sendKeys(first_subevent_endtime);
                        base.wait(1);
                        //base.doubleClick( event_schedule_table_list.get(0).findElement(By.xpath("//td[contains(@aria-label,'Duration')]")));
                        base.wait(1);
                        base.scrollToView(event_schedule_table_list.get(j).findElement(By.xpath("//input[@name='duration']//parent::span//input")));
                        //act.moveToElement(event_schedule_table_list.get(0).findElement(By.xpath("//input[@name='duration']"))).click().perform();
                        //base.clickElement(event_schedule_table_list.get(0).findElement(By.xpath("//input[@name='duration']")));
                        base.wait(1);
                        // base.jclick(event_schedule_table_list.get(0).findElement(By.xpath("//input[@name='duration']")));
                        base.jclick(event_schedule_table_list.get(j).findElement(By.xpath("//input[@name='duration']//parent::span//input")));
                        //event_schedule_table_list.get(0).findElement(By.xpath("//input[@name='duration']")).click();
                        base.wait(1);
                        //   event_schedule_table_list.get(0).findElement(By.xpath("//input[@name='duration']")).clear();
                        event_schedule_table_list.get(j).findElement(By.xpath("//input[@name='duration']//parent::span//input")).clear();
                        base.wait(1);
                        // event_schedule_table_list.get(0).findElement(By.xpath("//input[@name='duration']")).sendKeys("30");
                        event_schedule_table_list.get(j).findElement(By.xpath("//input[@name='duration']//parent::span//input")).sendKeys("30");
                        base.wait(1);
                        event_schedule_table_list.get(j).findElement(By.xpath("//input[@name='duration']//parent::span//input")).sendKeys(Keys.ENTER);
                        base.wait(9);
                        //driver.navigate().refresh();
                        //base.wait(9);
                        WebElement endtime = driver.findElement(By.xpath("//th//div//span[text()='End Time']"));
                        base.wait(3);
                        base.scrollToView(endtime);
                        base.wait(9);
                        // WebElement subevent_endtime_element=event_schedule_table_list.get(0).findElement(By.xpath("//td[contains(@aria-label,'End Time')]"));
                        //base.scrollToView(subevent_endtime_element);
                        // base.wait(7);
                        //String first_subevent_endtime=subevent_endtime_element.getText();
                        driver.switchTo().defaultContent();
                        base.wait(3);
                        WebElement subevent_endtime_element = driver.findElement(By.xpath("//ejs-grid//div[@class='e-gridcontent']//tbody//tr[" + (j + 1) + "]//td[19]"));

                        try {
                            second_subevent_endtime = subevent_endtime_element.getText();
                            //first_subevent_endtime=event_schedule_table_list.get(0).findElement(By.cssSelector("//td[contains(@aria-label,'End Time')]")).getText();
                        } catch (StaleElementReferenceException e) {
                            second_subevent_endtime = event_schedule_table_list.get(j - 1).findElement(By.cssSelector("td:nth-child(19)")).getText();
                        }
                        base.wait(1);
                        System.out.println("second_subevent_endtime=" + second_subevent_endtime);
                        base.wait(3);

                    }
                }
                else if(i==3){

                    String[] second_subevent_endtime_array=second_subevent_endtime.split(":");
                    int second_subevent_endtime_hour_int=Integer.parseInt(second_subevent_endtime_array[0]);
                    if (first_subevent_endtime_hour_int>second_subevent_endtime_hour_int) {
                        base.wait(1);
                        base.doubleClick(event_schedule_table_list.get(j).findElement(By.xpath("//td[contains(@aria-label,'Start Date')]")));
                        base.wait(1);
                        event_schedule_table_list.get(j).findElement(By.xpath("//input[@name='startDate']")).clear();
                        base.wait(1);
                        if(dateValue.equals(dtf.format(now))){
                            calendar.add(Calendar.DATE, 1);
                            date = calendar.getTime();
                            dateValue = formatter.format(date);
                            event_schedule_table_list.get(j).findElement(By.xpath("//input[@name='startDate']")).sendKeys(dateValue);
                            base.wait(1);
                        }
                        else{
                            calendar.add(Calendar.DATE, 2);
                            date = calendar.getTime();
                            dateValue = formatter.format(date);
                            event_schedule_table_list.get(j).findElement(By.xpath("//input[@name='startDate']")).sendKeys(dateValue);
                            base.wait(1);
                        }

                        base.wait(1);
//                    int Starttime_temp = Integer.parseInt(dtf1.format(now)) + 1;
//                    String Starttime_temp1 = String.valueOf(Starttime_temp);
//                    String Starttime = Starttime_temp1 + ":" + "00";
                        event_schedule_table_list.get(j).findElement(By.xpath("//input[@name='startTime']")).clear();
                        base.wait(1);
                        event_schedule_table_list.get(j).findElement(By.xpath("//input[@name='startTime']")).sendKeys(second_subevent_endtime);
                        base.wait(1);
                        //base.doubleClick( event_schedule_table_list.get(0).findElement(By.xpath("//td[contains(@aria-label,'Duration')]")));
                        base.wait(1);
                        base.scrollToView(event_schedule_table_list.get(j).findElement(By.xpath("//input[@name='duration']//parent::span//input")));
                        //act.moveToElement(event_schedule_table_list.get(0).findElement(By.xpath("//input[@name='duration']"))).click().perform();
                        //base.clickElement(event_schedule_table_list.get(0).findElement(By.xpath("//input[@name='duration']")));
                        base.wait(1);
                        // base.jclick(event_schedule_table_list.get(0).findElement(By.xpath("//input[@name='duration']")));
                        base.jclick(event_schedule_table_list.get(j).findElement(By.xpath("//input[@name='duration']//parent::span//input")));
                        //event_schedule_table_list.get(0).findElement(By.xpath("//input[@name='duration']")).click();
                        base.wait(1);
                        //   event_schedule_table_list.get(0).findElement(By.xpath("//input[@name='duration']")).clear();
                        event_schedule_table_list.get(j).findElement(By.xpath("//input[@name='duration']//parent::span//input")).clear();
                        base.wait(1);
                        // event_schedule_table_list.get(0).findElement(By.xpath("//input[@name='duration']")).sendKeys("30");
                        event_schedule_table_list.get(j).findElement(By.xpath("//input[@name='duration']//parent::span//input")).sendKeys("30");
                        base.wait(1);
                        event_schedule_table_list.get(j).findElement(By.xpath("//input[@name='duration']//parent::span//input")).sendKeys(Keys.ENTER);
                        base.wait(9);
                        //driver.navigate().refresh();
                        //base.wait(9);
                        WebElement endtime = driver.findElement(By.xpath("//th//div//span[text()='End Time']"));
                        base.wait(3);
                        base.scrollToView(endtime);
                        base.wait(9);
                        // WebElement subevent_endtime_element=event_schedule_table_list.get(0).findElement(By.xpath("//td[contains(@aria-label,'End Time')]"));
                        //base.scrollToView(subevent_endtime_element);
                        // base.wait(7);
                        //String first_subevent_endtime=subevent_endtime_element.getText();
                        driver.switchTo().defaultContent();
                        base.wait(3);
                        WebElement subevent_endtime_element = driver.findElement(By.xpath("//ejs-grid//div[@class='e-gridcontent']//tbody//tr[" + (j + 1) + "]//td[19]"));

                        try {
                            third_subevent_endtime = subevent_endtime_element.getText();
                            //first_subevent_endtime=event_schedule_table_list.get(0).findElement(By.cssSelector("//td[contains(@aria-label,'End Time')]")).getText();
                        } catch (StaleElementReferenceException e) {
                            third_subevent_endtime = event_schedule_table_list.get(j - 1).findElement(By.cssSelector("td:nth-child(19)")).getText();
                        }
                        base.wait(1);
                        System.out.println("third_subevent_endtime=" + third_subevent_endtime);
                        base.wait(3);

                    }
                    else {
                        base.wait(1);
                        base.doubleClick(event_schedule_table_list.get(j).findElement(By.xpath("//td[contains(@aria-label,'Start Date')]")));
                        base.wait(1);
                        event_schedule_table_list.get(j).findElement(By.xpath("//input[@name='startDate']")).clear();
                        base.wait(1);
                        if(dateValue.equals(dtf.format(now))){
                            event_schedule_table_list.get(j).findElement(By.xpath("//input[@name='startDate']")).sendKeys(dateValue);
                            base.wait(1);
                        }
                        else{
                            calendar.add(Calendar.DATE, 1);
                            date = calendar.getTime();
                            dateValue = formatter.format(date);
                            event_schedule_table_list.get(j).findElement(By.xpath("//input[@name='startDate']")).sendKeys(dateValue);
                            base.wait(1);
                        }

                        base.wait(1);
//                    int Starttime_temp = Integer.parseInt(dtf1.format(now)) + 1;
//                    String Starttime_temp1 = String.valueOf(Starttime_temp);
//                    String Starttime = Starttime_temp1 + ":" + "00";
                        event_schedule_table_list.get(j).findElement(By.xpath("//input[@name='startTime']")).clear();
                        base.wait(1);
                        event_schedule_table_list.get(j).findElement(By.xpath("//input[@name='startTime']")).sendKeys(second_subevent_endtime);
                        base.wait(1);
                        //base.doubleClick( event_schedule_table_list.get(0).findElement(By.xpath("//td[contains(@aria-label,'Duration')]")));
                        base.wait(1);
                        base.scrollToView(event_schedule_table_list.get(j).findElement(By.xpath("//input[@name='duration']//parent::span//input")));
                        //act.moveToElement(event_schedule_table_list.get(0).findElement(By.xpath("//input[@name='duration']"))).click().perform();
                        //base.clickElement(event_schedule_table_list.get(0).findElement(By.xpath("//input[@name='duration']")));
                        base.wait(1);
                        // base.jclick(event_schedule_table_list.get(0).findElement(By.xpath("//input[@name='duration']")));
                        base.jclick(event_schedule_table_list.get(j).findElement(By.xpath("//input[@name='duration']//parent::span//input")));
                        //event_schedule_table_list.get(0).findElement(By.xpath("//input[@name='duration']")).click();
                        base.wait(1);
                        //   event_schedule_table_list.get(0).findElement(By.xpath("//input[@name='duration']")).clear();
                        event_schedule_table_list.get(j).findElement(By.xpath("//input[@name='duration']//parent::span//input")).clear();
                        base.wait(1);
                        // event_schedule_table_list.get(0).findElement(By.xpath("//input[@name='duration']")).sendKeys("30");
                        event_schedule_table_list.get(j).findElement(By.xpath("//input[@name='duration']//parent::span//input")).sendKeys("30");
                        base.wait(1);
                        event_schedule_table_list.get(j).findElement(By.xpath("//input[@name='duration']//parent::span//input")).sendKeys(Keys.ENTER);
                        base.wait(9);
                        //driver.navigate().refresh();
                        //base.wait(9);
                        WebElement endtime = driver.findElement(By.xpath("//th//div//span[text()='End Time']"));
                        base.wait(3);
                        base.scrollToView(endtime);
                        base.wait(9);
                        // WebElement subevent_endtime_element=event_schedule_table_list.get(0).findElement(By.xpath("//td[contains(@aria-label,'End Time')]"));
                        //base.scrollToView(subevent_endtime_element);
                        // base.wait(7);
                        //String first_subevent_endtime=subevent_endtime_element.getText();
                        driver.switchTo().defaultContent();
                        base.wait(3);
                        WebElement subevent_endtime_element = driver.findElement(By.xpath("//ejs-grid//div[@class='e-gridcontent']//tbody//tr[" + (j + 1) + "]//td[19]"));

                        try {
                            third_subevent_endtime = subevent_endtime_element.getText();
                            //first_subevent_endtime=event_schedule_table_list.get(0).findElement(By.cssSelector("//td[contains(@aria-label,'End Time')]")).getText();
                        } catch (StaleElementReferenceException e) {
                            third_subevent_endtime = event_schedule_table_list.get(j - 1).findElement(By.cssSelector("td:nth-child(19)")).getText();
                        }
                        base.wait(1);
                        System.out.println("third_subevent_endtime=" + third_subevent_endtime);
                        base.wait(3);
                    }

                }
                //line_end */
            }
            base.wait(3);
            //ovrSch.OVR_CreateScdl.click();
            base.jclick(ovrSch.OVR_CreateScdl);
            base.wait(3);
            ovrSch.button_OVR_scedule_RemoveSelectedLine_confirmation_yes1.click();
            base.wait(8);
            ovrSch.OVR_Schedule_createtab.click();
            base.wait(8);
        }

        base.wait(8);
        ovrSch.button_OVR_scedule_Listtab.click();
        base.wait(10);

        /*
        for (int j=0;j<event_schedule_table_list.size();j++){
            base.wait(1);
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("HH:mm");
            LocalDateTime now = LocalDateTime.now();
            event_schedule_table_list.get(j).findElement(By.xpath("//input[@name='startDate']")).sendKeys(dtf.format(now));
            base.wait(1);
            event_schedule_table_list.get(j).findElement(By.xpath("//input[@name='startTime']")).sendKeys(dtf1.format(now));
            base.wait(1);
            event_schedule_table_list.get(j).findElement(By.xpath("//input[@name='duration']")).sendKeys("30");
            base.wait(1);
            event_schedule_table_list.get(j).findElement(By.xpath("//td[19]")).getText();

        }
        */

        System.out.println("date hashmap size="+dateValue_hashmap.size());
        base.jclick(ovrSch.button_OVR_scedule_Listtab_ShowAdvancedfilters);
        //ovrSch.button_OVR_scedule_Listtab_ShowAdvancedfilters.click();
        base.wait(3);
        ovrSch.button_OVR_scedule_Listtab_ShowAdvancedfilters_Scheduled.click();
        base.wait(3);
        ovrSch.text_OVR_scedule_Listtab_ShowAdvancedfilters_optionpopupdropdown_inputfield.sendKeys("N");
        base.wait(3);
        ovrSch.text_OVR_scedule_Listtab_ShowAdvancedfilters_optionpopupdropdown_inputfield.sendKeys(Keys.ENTER);
        base.wait(8);
        WebElement firstelementfromtable=driver.findElement(By.xpath("(//span[contains(text(),'Description')]//ancestor::ejs-grid//table[@class='e-table']//tbody)[2]//tr[1]//td[1]"));
        base.jclick(firstelementfromtable);
        base.wait(5);
        //firstelementfromtable.sendKeys(Keys.CONTROL+"A");
        act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
        base.wait(6);
        ovrSch.button_OVR_scedule_Listtab_Publish.click();
        base.wait(8);

        ovrSch.button_OVR_scedule_Boardtab.click();
        base.wait(8);
        ovrSch.button_OVR_scedule_Boardtab_Showfilters.click();
        base.wait(2);

       // dateValue_hashmap.add("27/08/2024");
       // dateValue_hashmap.add("28/08/2024");

       System.out.println("date hashmap size="+dateValue_hashmap.size());


       for (int x=0;x<dateValue_hashmap.size();x++){
           base.wait(3);
           ovrSch.button_OVR_scedule_Boardtab_Days.click();
           base.wait(3);
//           Select dropdown=new Select(ovrSch.dropdown_OVR_scedule_Listtab_Days);
//           base.wait(2);
           String v_date_str = dateValue_hashmap.get(x);
           DateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy");
           String d_temp = null;
           Date dTemp;
           try {
               dTemp = formatter1.parse(v_date_str);
               formatter=new SimpleDateFormat("dd-MMM-yy");
               d_temp=formatter.format(dTemp);
               System.out.println("val : " + d_temp);
           } catch (ParseException ex) {
           }
           //dropdown.selectByVisibleText(dateValue_hashmap.get(x));
           //dropdown.selectByVisibleText(d_temp);
           ovrSch.text_OVR_scedule_Boardtab_Days.sendKeys(d_temp);
           base.wait(2);
           ovrSch.text_OVR_scedule_Boardtab_Days.sendKeys(Keys.ENTER);
           base.wait(8);
           WebElement firstelementfromtable1=driver.findElement(By.xpath("//div[contains(text(),'Start Time ')]//ancestor::div[@class='d-grid']//tbody//td[1]"));
           base.jclick(firstelementfromtable1);
           base.wait(5);
           //firstelementfromtable.sendKeys(Keys.CONTROL+"A");
           act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
           base.wait(6);
           ovrSch.OVR_ShowScheProp_Board.click();
           base.wait(1);
           ovrSch.OVR_StatusDD_Board.click();
           base.wait(1);
           ovrSch.OVR_SelStartList_Board.click();
           base.wait(1);
           ovrSch.OVR_UpdateBtn_Board.click();
           base.wait(8);
          // ovrSch.button_OVR_scedule_Listtab_Publish.click();
          // base.wait(2);

       }

        base.wait(2);
    }


    @When("^schedule the main draw matches for youthevent$")
    public void schedule_main_draw_matches_youthevents() throws Exception {
        List<WebElement> event_schedule_table_list;
        String first_subevent_endtime = "null";
        String second_subevent_endtime = "null";
        String third_subevent_endtime = "null";
//        HashMap<Integer, String> dateValue_hashmap;
//        dateValue_hashmap=new HashMap<Integer, String>();
        HashMap<Integer, String> subevent_endtime_hashmap;
        subevent_endtime_hashmap=new HashMap<Integer, String>();
        int Starttime_temp = 0;
        int first_subevent_endtime_hour_int=0;
        int second_subevent_endtime_hour_int=0;
        int k=0;
        String dateValue="null";
        String s;
        Date date;
        Format formatter;
        Calendar calendar = Calendar.getInstance();
        LinkedList<String> dateValue_hashmap=new LinkedList<String>();
        base.wait(3);
        ovrSch.OVR_ScheduleBtn.click();
        base.wait(2);



        //for (int i=1;i<Subevent_rounds.size()+1;i++){
        for (int i=0;i<Subevent_list.size();i++){


//            ovrSch.OVR_ScheduleBtn.click();
//            base.wait(2);

                ovrSch.OVR_CrtScheduleBtn.click();
                base.wait(2);
                ovrSch.OVR_SelectUnit.click();
                base.wait(6);


                ovrSch.text_OVR_scedule_selectunit_select_unit.clear();
                base.wait(1);
                ovrSch.text_OVR_scedule_selectunit_select_unit.sendKeys(Subevent_list.get(i));
                base.wait(4);
                List<WebElement> subevent_list_scedule=ovrSch.list_OVR_scedule_selectunit_subevents.findElements(By.tagName("li"));
                base.wait(1);

                System.out.println("sub event count="+subevent_list_scedule.size());
                for (int j=0;j<subevent_list_scedule.size();j++){
                    base.wait(1);
                    //subevent_list_scedule.get(i).findElement(By.xpath("//input[@type='checkbox' and @id='event" + j + "']")).click();
                    //base.jclick(subevent_list_scedule.get(i).findElement(By.xpath("//input[@type='checkbox' and @id='event" + j + "']")));
                    //ovrSch.list_OVR_scedule_selectunit_subevents.findElement(By.xpath("//input[@type='checkbox' and @id='event" + j + "']"));
                    //subevent_list_scedule.get(i).findElement(By.xpath("//label[@for='event" + j + "']//input[@type='checkbox']")).click();
                    try {
                        base.jclick(subevent_list_scedule.get(i).findElement(By.xpath("//label[@for='event" + j + "']//input[@type='checkbox']")));
                    }
                    catch (NoSuchElementException exception){
                        break;
                    }
                    base.wait(3);
                }
                base.jclick(ovrSch.checkbox_OVR_scedule_selectunit_subevents_matches_selectedall);
                //ovrSch.checkbox_OVR_scedule_selectunit_subevents_matches_selectedall.click();
                base.wait(1);
                ovrSch.button_OVR_scedule_selectunit_AddUnits.click();
                base.wait(6);

                event_schedule_table_list=ovrSch.table_OVR_scedule_table.findElements(By.tagName("tr"));

                System.out.println("number of schedule="+event_schedule_table_list.size());

                for (int j=0;j<event_schedule_table_list.size();j++) {

                    base.wait(1);
                    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("HH");
                    formatter = new SimpleDateFormat("dd/MM/yyyy");
                    LocalDateTime now = LocalDateTime.now();

                    base.wait(1);
                    base.doubleClick(event_schedule_table_list.get(j).findElement(By.xpath("//td[contains(@aria-label,'Start Date')]")));
                    base.wait(1);
                    event_schedule_table_list.get(j).findElement(By.xpath("//input[@name='startDate']")).clear();
                    base.wait(1);
                    if(i==0){
                        //dateValue_hashmap.put(i-1, dtf.format(now));
                        dateValue_hashmap.add(dtf.format(now));
                        event_schedule_table_list.get(j).findElement(By.xpath("//input[@name='startDate']")).sendKeys(dateValue_hashmap.getLast());
                        base.wait(1);
                        Starttime_temp = Integer.parseInt(dtf1.format(now)) + 1;
                        String Starttime_temp1 = String.valueOf(Starttime_temp);
                        String Starttime = Starttime_temp1 + ":" + "00";
                        subevent_endtime_hashmap.put(i-1,Starttime);
                        event_schedule_table_list.get(j).findElement(By.xpath("//input[@name='startTime']")).clear();
                        base.wait(1);
                        event_schedule_table_list.get(j).findElement(By.xpath("//input[@name='startTime']")).sendKeys(Starttime);
                        base.wait(1);
                    }
                    else {

                        System.out.println("first_subevent_endtime_array="+subevent_endtime_hashmap.get(i-2));
                        System.out.println("second_subevent_endtime_array="+subevent_endtime_hashmap.get(i-1));

                        String[] first_subevent_endtime_array=subevent_endtime_hashmap.get(i-2).split(":");
                        first_subevent_endtime_hour_int=Integer.parseInt(first_subevent_endtime_array[0]);
                        String[] second_subevent_endtime_array=subevent_endtime_hashmap.get(i-1).split(":");
                        second_subevent_endtime_hour_int=Integer.parseInt(second_subevent_endtime_array[0]);
                        if(first_subevent_endtime_hour_int>second_subevent_endtime_hour_int){
                            //calendar.add(Calendar.DATE, i-1);
                            k=k+1;
                            calendar.add(Calendar.DATE, k);
                            date = calendar.getTime();
                            dateValue = formatter.format(date);
                            //dateValue_hashmap.put(i, dateValue);
                            dateValue_hashmap.add(dateValue);
                            event_schedule_table_list.get(j).findElement(By.xpath("//input[@name='startDate']")).sendKeys(dateValue_hashmap.getLast());
                            base.wait(1);
                            event_schedule_table_list.get(j).findElement(By.xpath("//input[@name='startTime']")).clear();
                            base.wait(1);
                            event_schedule_table_list.get(j).findElement(By.xpath("//input[@name='startTime']")).sendKeys(subevent_endtime_hashmap.get(i-1));
                            base.wait(1);
                        }
                        else {
                          //  System.out.println("first_date="+dateValue_hashmap.get(i-2));
                            event_schedule_table_list.get(j).findElement(By.xpath("//input[@name='startDate']")).sendKeys(dateValue_hashmap.getLast());
                            base.wait(1);
                            event_schedule_table_list.get(j).findElement(By.xpath("//input[@name='startTime']")).clear();
                            base.wait(1);
                            event_schedule_table_list.get(j).findElement(By.xpath("//input[@name='startTime']")).sendKeys(subevent_endtime_hashmap.get(i-1));
                            base.wait(1);
                        }

                    }

                    base.wait(1);
                    base.scrollToView(event_schedule_table_list.get(j).findElement(By.xpath("//input[@name='duration']//parent::span//input")));
                    base.wait(1);
                    base.jclick(event_schedule_table_list.get(j).findElement(By.xpath("//input[@name='duration']//parent::span//input")));
                    base.wait(1);
                    event_schedule_table_list.get(j).findElement(By.xpath("//input[@name='duration']//parent::span//input")).clear();
                    base.wait(1);
                    event_schedule_table_list.get(j).findElement(By.xpath("//input[@name='duration']//parent::span//input")).sendKeys("30");
                    base.wait(1);
                    event_schedule_table_list.get(j).findElement(By.xpath("//input[@name='duration']//parent::span//input")).sendKeys(Keys.ENTER);
                    base.wait(9);
                    WebElement endtime = driver.findElement(By.xpath("//th//div//span[text()='End Time']"));
                    base.wait(3);
                    base.scrollToView(endtime);
                    base.wait(9);
                    driver.switchTo().defaultContent();
                    base.wait(3);
                    WebElement subevent_endtime_element = driver.findElement(By.xpath("//ejs-grid//div[@class='e-gridcontent']//tbody//tr[" + (j + 1) + "]//td[19]"));
                    String subevent_endtime;
                    try {
                        subevent_endtime =subevent_endtime_element.getText();
                        subevent_endtime_hashmap.put(i,subevent_endtime );
                    } catch (StaleElementReferenceException e) {
                        subevent_endtime = event_schedule_table_list.get(j - 1).findElement(By.cssSelector("td:nth-child(19)")).getText();
                        subevent_endtime_hashmap.put(i,subevent_endtime );
                    }
                    base.wait(1);
                    System.out.println("first_subevent_endtime=" + subevent_endtime_hashmap.get(i));
                    base.wait(3);

                }
                base.wait(3);
                //ovrSch.OVR_CreateScdl.click();
                base.jclick(ovrSch.OVR_CreateScdl);
                base.wait(3);
                ovrSch.button_OVR_scedule_RemoveSelectedLine_confirmation_yes1.click();
                base.wait(13);
                base.jclick( ovrSch.OVR_Schedule_createtab);
                //ovrSch.OVR_Schedule_createtab.click();
                base.wait(8);
        }



        base.wait(8);
        ovrSch.button_OVR_scedule_Listtab.click();
        base.wait(12);


        System.out.println("date hashmap size="+dateValue_hashmap.size());
        base.jclick(ovrSch.button_OVR_scedule_Listtab_ShowAdvancedfilters);
        //ovrSch.button_OVR_scedule_Listtab_ShowAdvancedfilters.click();
        base.wait(3);
        ovrSch.button_OVR_scedule_Listtab_ShowAdvancedfilters_Scheduled.click();
        base.wait(3);
        ovrSch.text_OVR_scedule_Listtab_ShowAdvancedfilters_optionpopupdropdown_inputfield.sendKeys("N");
        base.wait(3);
        ovrSch.text_OVR_scedule_Listtab_ShowAdvancedfilters_optionpopupdropdown_inputfield.sendKeys(Keys.ENTER);
        base.wait(8);
        WebElement firstelementfromtable=driver.findElement(By.xpath("(//span[contains(text(),'Description')]//ancestor::ejs-grid//table[@class='e-table']//tbody)[2]//tr[1]//td[1]"));
        base.jclick(firstelementfromtable);
        base.wait(5);
        //firstelementfromtable.sendKeys(Keys.CONTROL+"A");
        act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
        base.wait(8);
        ovrSch.button_OVR_scedule_Listtab_Publish.click();
        base.wait(10);

        ovrSch.button_OVR_scedule_Boardtab.click();
        base.wait(8);
        base.wait(4);
        ovrSch.button_OVR_scedule_Boardtab_Showfilters.click();
        base.wait(3);
        base.jclick(ovrSch.button_OVR_scedule_Boardtab_ShowAdvancedfilters);
        base.wait(3);
        ovrSch.button_OVR_scedule_Boardtab_Days.click();
        base.wait(3);


         //dateValue_hashmap.add("04/09/2024");
         //dateValue_hashmap.add("28/08/2024");

        System.out.println("date hashmap size="+dateValue_hashmap.size());


        for (int x=0;x<dateValue_hashmap.size();x++){

//           Select dropdown=new Select(ovrSch.dropdown_OVR_scedule_Listtab_Days);
//           base.wait(2);
            String v_date_str = dateValue_hashmap.get(x);
            DateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy");
            String d_temp = null;
            Date dTemp;
            try {
                dTemp = formatter1.parse(v_date_str);
                formatter=new SimpleDateFormat("dd-MMM-yy");
                d_temp=formatter.format(dTemp);
                System.out.println("val : " + d_temp);
            } catch (ParseException ex) {
            }
            //dropdown.selectByVisibleText(dateValue_hashmap.get(x));
            //dropdown.selectByVisibleText(d_temp);

            ovrSch.text_OVR_scedule_Boardtab_Days.sendKeys(d_temp);
            base.wait(2);
            ovrSch.text_OVR_scedule_Boardtab_Days.sendKeys(Keys.ENTER);
            base.wait(12);
            ovrSch.button_OVR_scedule_Boardtab_ShowAdvancedfilters_Status.click();
            base.wait(3);
            ovrSch.text_OVR_scedule_Listtab_ShowAdvancedfilters_optionpopupdropdown_inputfield.sendKeys("Scheduled");
            base.wait(6);
            ovrSch.text_OVR_scedule_Boardtab_Days.sendKeys(Keys.ENTER);
            base.wait(12);
            WebElement firstelementfromtable1=driver.findElement(By.xpath("//div[contains(text(),'Start Time ')]//ancestor::div[@class='d-grid']//tbody//td[1]"));
            base.jclick(firstelementfromtable1);
            base.wait(8);
            //firstelementfromtable.sendKeys(Keys.CONTROL+"A");
            act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
            base.wait(8);
            base.jclick(ovrSch.OVR_ShowScheProp_Board);
            //ovrSch.OVR_ShowScheProp_Board.click();
            base.wait(7);
            //ovrSch.OVR_StatusDD_Board.click();
            base.scrollToView(ovrSch.OVR_StatusDD_Board2);
            base.wait(6);
            base.doubleClick(ovrSch.OVR_StatusDD_Board2);
            base.wait(6);
            ovrSch.OVR_SelStartList_Board1.click();
            base.wait(6);
            ovrSch.OVR_UpdateBtn_Board1.click();
            base.wait(8);
            try {
                OVR_Modalities.button_OVR_Modalities_popup_Yes.click();
                base.wait(2);
            }
            catch (NoSuchElementException e2){
                System.out.println("Championship match pop up not appear");
            }
            // ovrSch.button_OVR_scedule_Listtab_Publish.click();
            // base.wait(2);

        }

        base.wait(2);
    }


    public static void main(String[] args) throws ParseException {
        String url1 = "https://ovr-sim-uat.azurewebsites.net/events";
        String[] url2=url1.split(".net/");
        String newurl = url2[0]+".net/matchhub/umpires/landing.html";
        //String newurl="https://ovr-sim-uat.azurewebsites.net/matchhub/umpires/landing.html";
        System.out.println(newurl);

    }

}
