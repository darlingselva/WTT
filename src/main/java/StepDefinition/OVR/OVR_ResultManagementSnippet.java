package StepDefinition.OVR;

import base.Commonmethods;
import base.DriverInitialisation;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import pages.OVRElements.*;

import java.util.*;

public class OVR_ResultManagementSnippet extends DriverInitialisation {

    OVR_Modalities_page_Elements OVR_Modalities = PageFactory.initElements(driver, OVR_Modalities_page_Elements.class);

    OVR_login_page_Elements OVR_login_page = PageFactory.initElements(driver, OVR_login_page_Elements.class);

    OVR_Home_page_Elements OVR_Home = PageFactory.initElements(driver, OVR_Home_page_Elements.class);

    OVR_SchedulePage_Elements ovrSch =  PageFactory.initElements(driver,OVR_SchedulePage_Elements.class);

    OVR_ResultManagementPage_Elements Result_man =  PageFactory.initElements(driver,OVR_ResultManagementPage_Elements.class);

    Commonmethods base = new Commonmethods(driver, wait);

    Actions act = new Actions(driver);

    @When("^update the match result in the result management for '(.*)'$")
    public void update_data_resultmanagement(String roundcategories) throws Exception{
        HashMap<Integer, String> Maindraw_hashmap = new HashMap<Integer, String>();
        ArrayList<String> Maindraw_list;
        base.wait(2);
        OVR_Home.button_OVR_Homepage_RightMenu_result.click();
        if(roundcategories.equals("Group standing")) {
            for (int i = 0; i < OVR_ModalitiesSnippet.Subevent_list.size(); i++) {
                OVR_ModalitiesSnippet.event_list_index = i;
                base.wait(3);
                WebElement Dynamic_event_element = Result_man.list_OVR_resultmanagement_eventslist.findElement(By.xpath("//span[contains(@id,'Event" + OVR_ModalitiesSnippet.event_list_index + "')]"));

                // WebElement Dynamic_event_element = OVR_Modalities.text_OVR_Modalities_eventlist.findElement(By.xpath("//span[contains(@id,'Event" + m.getKey() + "')]"));
                //Dynamic_event_element.click();
                base.jclick(Dynamic_event_element);
                String Dynamic_event_name = Dynamic_event_element.getText();
                //  if(Subeventname.equals(Dynamic_event_name)) {
                base.wait(3);
                try {
                    WebElement top_extended_button_element = Result_man.list_OVR_resultmanagement_eventslist.findElement(By.xpath("//span[contains(@id,'Event" + OVR_ModalitiesSnippet.event_list_index + "')]//parent::li//label"));
                    base.wait(1);
                    base.jclick(top_extended_button_element);
                    base.wait(2);
                    //WebElement match_group=Dynamic_event_element.findElement(By.xpath("//following-sibling::ul"));
                    //WebElement match_group=driver.findElement(By.xpath("//app-result-management//div[@class='border treeViewScroll']//ul[@class='tree mt-1']//following-sibling::ul"));
                    WebElement match_group = Result_man.list_OVR_resultmanagement_eventslist.findElement(By.xpath("//span[contains(@id,'Event" + OVR_ModalitiesSnippet.event_list_index + "')]//following-sibling::ul"));
                    base.wait(1);
                    List<WebElement> match_group_list = match_group.findElements(By.tagName("li"));
                    base.wait(1);
                    System.out.println("match_group_size=" + match_group_list.size());
                    base.wait(1);

                    for (int j = 1; j <= match_group_list.size(); j++) {
                        base.wait(1);
                        //WebElement match_group_element=match_group_list.get(j).findElement(By.xpath("//span"));
                        //WebElement match_group_element=match_group.findElement(By.xpath("//li["+j+"]//span"));
                        WebElement match_group_element = Result_man.list_OVR_resultmanagement_eventslist.findElement(By.xpath("//span[contains(@id,'Event" + OVR_ModalitiesSnippet.event_list_index + "')]//following-sibling::ul//li[" + j + "]//span"));
                        String group_name = match_group_element.getText();

                            if (group_name.contains("Group")) {
                                System.out.println("group name="+group_name);
                                base.jclick(match_group_element);
                                base.wait(2);
                                List<WebElement> match_table = Result_man.table_OVR_resultmanagement_matchtable.findElements(By.tagName("tr"));
                                System.out.println("number of matches=" + match_table.size());
                                base.wait(1);
                                for (int k = 1; k <= match_table.size(); k++) {
                                    base.wait(1);
                                    //System.out.println("k="+k);
                                    //String match_code=match_table.get(k).findElement(By.xpath("//td[2]")).getText();
                                    //String match_code=Result_man.table_OVR_resultmanagement_matchtable.findElement(By.xpath("//tr["+k+"]//td[2]")).getText();
                                    String match_code = driver.findElement(By.xpath("//*[@id='table-scroll-fixed']//table//tbody//tr[" + k + "]//td[2]")).getText();
                                    //String match_status=match_table.get(k).findElement(By.xpath("//td[3]")).getText();
                                    //String match_status=Result_man.table_OVR_resultmanagement_matchtable.findElement(By.xpath("//tr["+k+"]//td[3]")).getText();
                                    String match_status = driver.findElement(By.xpath("//*[@id='table-scroll-fixed']//table//tbody//tr[" + k + "]//td[3]")).getText();
                                    System.out.println("match code=" + match_code + "match status=" + match_status);
                                    base.wait(1);
                                    if (match_status.equals("Start List")) {
                                        base.wait(5);
                                        //WebElement match_edit=match_table.get(k).findElement(By.xpath("//td[1]//a"));
                                        //WebElement match_edit=Result_man.table_OVR_resultmanagement_matchtable.findElement(By.xpath("//tr["+(k)+"]//td[1]//a"));
                                        WebElement match_edit = driver.findElement(By.xpath("//*[@id='table-scroll-fixed']//table//tbody//tr[" + k + "]//td[1]//a"));
                                        //match_edit.click();
                                        base.jclick(match_edit);
                                        base.wait(5);
                                        String game_format = Result_man.text_OVR_resultmanagement_editresultpopup_bestof.getText();
                                        System.out.println("game_format=" + game_format);
                                        base.wait(1);
                                        if (game_format.equals("Best Of 5")) {

                                            for (int x = 2; x < 5; x++) {
                                                base.wait(1);
                                                // WebElement game_cell_element=Result_man.table_OVR_resultmanagement_editresultpopup_games.findElement(By.xpath("//tr[1]//td["+x+"]//input"));
                                                WebElement game_cell_element = driver.findElement(By.xpath("//app-final-match-result//table//tbody//tr[1]//td[" + x + "]//input"));
                                                base.jclick(game_cell_element);
                                                //game_cell_element.click();
                                                base.wait(1);
                                                game_cell_element.clear();
                                                base.wait(1);
                                                game_cell_element.sendKeys("11");
                                                base.wait(1);

                                            }
                                            //Result_man.button_OVR_resultmanagement_editresultpopup_WinnerSave.click();
                                            base.jclick(Result_man.button_OVR_resultmanagement_editresultpopup_WinnerSave);
                                            base.wait(4);
                                            //OVR_Modalities.button_OVR_Modalities_popup_Yes2.click();
                                            base.jclick(OVR_Modalities.button_OVR_Modalities_popup_Yes2);
                                            base.wait(6);

                                        } else if (game_format.equals("Best Of 7")) {

                                            for (int x = 2; x < 7; x++) {
                                                base.wait(1);
                                                // WebElement game_cell_element=Result_man.table_OVR_resultmanagement_editresultpopup_games.findElement(By.xpath("//tr[1]//td["+x+"]//input"));
                                                WebElement game_cell_element = driver.findElement(By.xpath("//app-final-match-result//table//tbody//tr[1]//td[" + x + "]//input"));
                                                game_cell_element.click();
                                                base.wait(1);
                                                game_cell_element.clear();
                                                base.wait(1);
                                                game_cell_element.sendKeys("11");
                                                base.wait(1);

                                            }
                                            Result_man.button_OVR_resultmanagement_editresultpopup_WinnerSave.click();
                                            base.wait(4);
                                            OVR_Modalities.button_OVR_Modalities_popup_Yes2.click();
                                            base.wait(6);

                                        } else {



                                        }
                                        //Result_man.button_OVR_resultmanagement_editresultpopup_close.click();
                                        base.wait(2);
                                    }


                                }

                            }


                    }


                } catch (NoSuchElementException e) {
                    System.out.println("match is not availbale for subevent=" + Dynamic_event_name);
                }


            }

        }

        else if(roundcategories.equals("Main draw")){

            for (int i = 0; i < OVR_ModalitiesSnippet.Subevent_list.size(); i++) {
                Maindraw_list= new ArrayList<String>();
                OVR_ModalitiesSnippet.event_list_index = i;
                base.wait(1);
                WebElement Dynamic_event_element = Result_man.list_OVR_resultmanagement_eventslist.findElement(By.xpath("//span[contains(@id,'Event" + OVR_ModalitiesSnippet.event_list_index + "')]"));
                base.wait(1);
                // WebElement Dynamic_event_element = OVR_Modalities.text_OVR_Modalities_eventlist.findElement(By.xpath("//span[contains(@id,'Event" + m.getKey() + "')]"));
                base.jclick( Dynamic_event_element);
                //Dynamic_event_element.click();
                String Dynamic_event_name = Dynamic_event_element.getText();
                //  if(Subeventname.equals(Dynamic_event_name)) {
                base.wait(3);
                try {
                    WebElement top_extended_button_element = Result_man.list_OVR_resultmanagement_eventslist.findElement(By.xpath("//span[contains(@id,'Event" + OVR_ModalitiesSnippet.event_list_index + "')]//parent::li//label"));
                    base.wait(1);
                    base.jclick(top_extended_button_element);
                    base.wait(2);
                    //WebElement match_group=Dynamic_event_element.findElement(By.xpath("//following-sibling::ul"));
                    //WebElement match_group=driver.findElement(By.xpath("//app-result-management//div[@class='border treeViewScroll']//ul[@class='tree mt-1']//following-sibling::ul"));
                    WebElement match_group = Result_man.list_OVR_resultmanagement_eventslist.findElement(By.xpath("//span[contains(@id,'Event" + OVR_ModalitiesSnippet.event_list_index + "')]//following-sibling::ul"));
                    base.wait(1);
                    List<WebElement> match_group_list = match_group.findElements(By.tagName("li"));
                    base.wait(1);
                    System.out.println("match_group_size=" + match_group_list.size());
                    base.wait(1);

                    for (int j = 1; j <= match_group_list.size(); j++) {
                        base.wait(1);
                        //WebElement match_group_element=match_group_list.get(j).findElement(By.xpath("//span"));
                        //WebElement match_group_element=match_group.findElement(By.xpath("//li["+j+"]//span"));
                        WebElement match_group_element = Result_man.list_OVR_resultmanagement_eventslist.findElement(By.xpath("//span[contains(@id,'Event" + OVR_ModalitiesSnippet.event_list_index + "')]//following-sibling::ul//li[" + j + "]//span"));
                        String group_name = match_group_element.getText();
                        //System.out.println("group name="+group_name);
                        if (group_name.contains("Group") || group_name.contains("Qualifier")) {

                        }
                        else{
                            Maindraw_list.add(group_name);

                        }


                    }
                    System.out.println(Maindraw_list.size());
                    for(int z=(Maindraw_list.size()-1);z>=0;z--){
                        //System.out.println(Maindraw_list.get(x).toString());
                        WebElement match_group_element = Result_man.list_OVR_resultmanagement_eventslist.findElement(By.xpath("//span[contains(@id,'Event" + OVR_ModalitiesSnippet.event_list_index + "')]//following-sibling::ul//span[contains(text(),'"+Maindraw_list.get(z).toString()+"')]"));
                        String group_name = match_group_element.getText();
                        base.wait(1);
                        base.scrollToView(match_group_element);
                        base.wait(1);
                        base.jclick(match_group_element);
                        base.wait(2);
                        List<WebElement> match_table = Result_man.table_OVR_resultmanagement_matchtable.findElements(By.tagName("tr"));
                        System.out.println("number of matches=" + match_table.size());
                        base.wait(1);

                        for (int k = 1; k <= match_table.size(); k++) {
                            base.wait(1);
                            //System.out.println("k="+k);
                            //String match_code=match_table.get(k).findElement(By.xpath("//td[2]")).getText();
                            //String match_code=Result_man.table_OVR_resultmanagement_matchtable.findElement(By.xpath("//tr["+k+"]//td[2]")).getText();
                            String match_code = driver.findElement(By.xpath("//*[@id='table-scroll-fixed']//table//tbody//tr[" + k + "]//td[2]")).getText();
                            //String match_status=match_table.get(k).findElement(By.xpath("//td[3]")).getText();
                            //String match_status=Result_man.table_OVR_resultmanagement_matchtable.findElement(By.xpath("//tr["+k+"]//td[3]")).getText();
                            String match_status = driver.findElement(By.xpath("//*[@id='table-scroll-fixed']//table//tbody//tr[" + k + "]//td[3]")).getText();
                            System.out.println("match code=" + match_code + "match status=" + match_status);
                            base.wait(1);
                            if (match_status.equals("Start List")) {
                                base.wait(5);
                                //WebElement match_edit=match_table.get(k).findElement(By.xpath("//td[1]//a"));
                                //WebElement match_edit=Result_man.table_OVR_resultmanagement_matchtable.findElement(By.xpath("//tr["+(k)+"]//td[1]//a"));
                                WebElement match_edit = driver.findElement(By.xpath("//*[@id='table-scroll-fixed']//table//tbody//tr[" + k + "]//td[1]//a"));
                            try {
                                match_edit.click();
                                //base.jclick(match_edit);
                                base.wait(5);
                                String game_format = Result_man.text_OVR_resultmanagement_editresultpopup_bestof.getText();
                                System.out.println("game_format=" + game_format);
                                base.wait(1);
                                if (game_format.equals("Best Of 5")) {

                                    for (int x = 2; x < 5; x++) {
                                        base.wait(1);
                                        // WebElement game_cell_element=Result_man.table_OVR_resultmanagement_editresultpopup_games.findElement(By.xpath("//tr[1]//td["+x+"]//input"));
                                        WebElement game_cell_element = driver.findElement(By.xpath("//app-final-match-result//table//tbody//tr[1]//td[" + x + "]//input"));
                                        base.jclick(game_cell_element);
                                        //game_cell_element.click();
                                        base.wait(1);
                                        game_cell_element.clear();
                                        base.wait(1);
                                        game_cell_element.sendKeys("11");
                                        base.wait(1);

                                    }
                                    //Result_man.button_OVR_resultmanagement_editresultpopup_WinnerSave.click();
                                    base.jclick(Result_man.button_OVR_resultmanagement_editresultpopup_WinnerSave);
                                    base.wait(4);
                                    //OVR_Modalities.button_OVR_Modalities_popup_Yes2.click();
                                    base.jclick(OVR_Modalities.button_OVR_Modalities_popup_Yes2);
                                    base.wait(6);

                                } else if (game_format.equals("Best Of 7")) {

                                    for (int x = 2; x < 7; x++) {
                                        base.wait(1);
                                        // WebElement game_cell_element=Result_man.table_OVR_resultmanagement_editresultpopup_games.findElement(By.xpath("//tr[1]//td["+x+"]//input"));
                                        WebElement game_cell_element = driver.findElement(By.xpath("//app-final-match-result//table//tbody//tr[1]//td[" + x + "]//input"));
                                        game_cell_element.click();
                                        base.wait(1);
                                        game_cell_element.clear();
                                        base.wait(1);
                                        game_cell_element.sendKeys("11");
                                        base.wait(1);

                                    }
                                    Result_man.button_OVR_resultmanagement_editresultpopup_WinnerSave.click();
                                    base.wait(4);
                                    OVR_Modalities.button_OVR_Modalities_popup_Yes2.click();
                                    base.wait(6);

                                } else {


                                }
                                //Result_man.button_OVR_resultmanagement_editresultpopup_close.click();
                                base.wait(2);
                            }
                            catch (ElementClickInterceptedException e2){
                                System.out.println("edit button not interactive");
                            }

                            }


                        }
                    }


                } catch (NoSuchElementException e) {
                    System.out.println("match is not availbale for subevent=" + Dynamic_event_name);
                }


            }



        }

    }

    public static void main(String[] args){
        for(int i = 10; i >= 0; i--){
            System.out.println(i);
            //System.out.println(10 - i);
        }
    }

}
