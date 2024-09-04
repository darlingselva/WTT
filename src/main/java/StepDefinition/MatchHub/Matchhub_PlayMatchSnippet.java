package StepDefinition.MatchHub;

import base.Commonmethods;
import base.DriverInitialisation;
import io.cucumber.java.en.Given;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import pages.MatchHubElements.Matchhub_Home_Elements;
import pages.OVRElements.OVR_SchedulePage_Elements;

import java.util.ArrayList;
import java.util.List;

public class Matchhub_PlayMatchSnippet extends DriverInitialisation {

    Commonmethods base = new Commonmethods(driver, wait);
    Matchhub_Home_Elements mHub =  PageFactory.initElements(driver,Matchhub_Home_Elements.class);
    @Given("Umpire selects {string} and selects {string} and Plays {string}")
    public  void playMatchInMatchHub(String tableNo, String subEvent, String bestOf) throws Exception {
        //Matchhub_Home_Elements mHub =  PageFactory.initElements(driver,Matchhub_Home_Elements.class);
        Commonmethods base=new Commonmethods(driver,wait);

        base.wait(1);
        driver.findElement(By.xpath("//button[normalize-space()='Table "+tableNo+"']")).click();
        mHub.MH_TableEnt.click();
        base.wait(1);
        driver.findElement(By.xpath("//td[@class='event' and text()=\""+subEvent+"\"]")).click();
        mHub.MH_matchStart.click();
        base.wait(1);
        mHub.MH_startWarmup.click();
        base.wait(1);
        mHub.MH_cnfmBtn.click();
        base.wait(1);
        mHub.MH_strtMatch.click();
        base.wait(1);
        int a=Integer.parseInt(bestOf);
        int bestOfM= a-1;
        for(int i=1; i<=bestOfM; i++){
            if(i == 1){
                base.wait(1);
                mHub.MH_p2AddCard.click();
                mHub.MH_pyellowbtn.click();
                base.wait(1);
                mHub.MH_p1AddCard.click();
                mHub.MH_timeout.click();
                base.wait(5);
                mHub.MH_closeTOut.click();
                base.wait(1);
            } else if (i==3){
                base.wait(1);
                mHub.MH_p2AddCard.click();
                mHub.MH_pYellowRed1Btn.click();
                base.wait(1);
                mHub.MH_p1AddCard.click();
                mHub.MH_pYellowRed1Btn.click();
                base.wait(1);
            }
            if(i == 1){
                for(int j=1; j<=11; j++){
                    base.wait(1);
                    mHub.MH_strtOfPlay.click();
                    base.wait(1);
                    mHub.MH_p1AddPoint.click();
                    base.wait(1);
                    if(j==1) {
                        for (int k = 1; k <= 4; k++) {
                            mHub.MH_strtOfPlay.click();
                            base.wait(1);
                            mHub.MH_p2AddPoint.click();
                            base.wait(1);
                        }
                    }
                }
            } else if (i==2){
                mHub.MH_p1AddCard.click();
                mHub.MH_pyellowbtn.click();
                base.wait(1);
            } else if(i==3){
                for(int j=1; j<=10; j++){
                    base.wait(1);
                    mHub.MH_strtOfPlay.click();
                    base.wait(1);
                    mHub.MH_p1AddPoint.click();
                    base.wait(1);
                    if(j==1) {
                        for (int k = 1; k <= 4; k++) {
                            mHub.MH_strtOfPlay.click();
                            base.wait(1);
                            mHub.MH_p2AddPoint.click();
                            base.wait(1);
                        }
                    }
                }
            }
            if (i == 2 || i == 4){
                for(int j=1; j<=11; j++){
                    base.wait(1);
                    mHub.MH_strtOfPlay.click();
                    base.wait(1);
                    mHub.MH_p2AddPoint.click();
                    base.wait(1);
                    if(j==1) {
                        for (int k = 1; k <= 4; k++) {
                            mHub.MH_strtOfPlay.click();
                            base.wait(1);
                            mHub.MH_p1AddPoint.click();
                            base.wait(1);
                        }
                    }
                }
            }
            if(i != 5){
                mHub.MH_nextGame.click();
                base.wait(1);
            }
        }
        for(int j=1; j<=11; j++){
            if(j==6){
                mHub.MH_Decconfirm.click();
                base.wait(1);
            }
            base.wait(1);
            mHub.MH_strtOfPlay.click();
            base.wait(1);
            mHub.MH_p1AddPoint.click();
            base.wait(1);
            if(j==1) {
                for (int k = 1; k <= 4; k++) {
                    mHub.MH_strtOfPlay.click();
                    base.wait(1);
                    mHub.MH_p2AddPoint.click();
                    base.wait(1);
                }
            }
        }
        mHub.MH_confirm.click();
    }

    @Given("play the match")
    public  void play_match() throws Exception {
        //Matchhub_Home_Elements mHub =  PageFactory.initElements(driver,Matchhub_Home_Elements.class);
        //Commonmethods base=new Commonmethods(driver,wait);

        base.wait(1);
        //driver.findElement(By.xpath("//button[normalize-space()='Table "+tableNo+"']")).click();
       // mHub.MH_TableEnt.click();
        //base.wait(1);
        //driver.findElement(By.xpath("//td[@class='event' and text()=\""+subEvent+"\"]")).click();
       // mHub.MH_matchStart.click();
        String bestOf=mHub.text_matchhub_scoreboard_bestof.getText();
        String[] bestOf1=bestOf.split(" ");
        //int a=Integer.parseInt(bestOf);
        int a=Integer.parseInt(bestOf1[2].toString());
        int bestOfM= a-1;
        base.wait(1);
        mHub.MH_startWarmup.click();
        base.wait(1);
        mHub.MH_cnfmBtn.click();
        base.wait(1);
        mHub.MH_strtMatch.click();
        base.wait(1);
//        String bestOf=mHub.text_matchhub_scoreboard_bestof.getText();
//        String[] bestOf1=bestOf.split(" ");
//        //int a=Integer.parseInt(bestOf);
//        int a=Integer.parseInt(bestOf1[2].toString());
//        int bestOfM= a-1;
        for(int i=1; i<=bestOfM; i++){
            if(i == 1){
                base.wait(1);
                mHub.MH_p2AddCard.click();
                mHub.MH_pyellowbtn.click();
                base.wait(1);
                mHub.MH_p1AddCard.click();
                mHub.MH_timeout.click();
                base.wait(5);
                mHub.MH_closeTOut.click();
                base.wait(1);
            } else if (i==3){
                base.wait(1);
                mHub.MH_p2AddCard.click();
                mHub.MH_pYellowRed1Btn.click();
                base.wait(1);
                mHub.MH_p1AddCard.click();
                mHub.MH_pYellowRed1Btn.click();
                base.wait(1);
            }
            if(i == 1){
                for(int j=1; j<=11; j++){
                    base.wait(1);
                    mHub.MH_strtOfPlay.click();
                    base.wait(1);
                    mHub.MH_p1AddPoint.click();
                    base.wait(1);
                    if(j==1) {
                        for (int k = 1; k <= 4; k++) {
                            mHub.MH_strtOfPlay.click();
                            base.wait(1);
                            mHub.MH_p2AddPoint.click();
                            base.wait(1);
                        }
                    }
                }
            } else if (i==2){
                mHub.MH_p1AddCard.click();
                mHub.MH_pyellowbtn.click();
                base.wait(1);
            } else if(i==3){
                for(int j=1; j<=10; j++){
                    base.wait(1);
                    mHub.MH_strtOfPlay.click();
                    base.wait(1);
                    mHub.MH_p1AddPoint.click();
                    base.wait(1);
                    if(j==1) {
                        for (int k = 1; k <= 4; k++) {
                            mHub.MH_strtOfPlay.click();
                            base.wait(1);
                            mHub.MH_p2AddPoint.click();
                            base.wait(1);
                        }
                    }
                }
            }
            if (i == 2 || i == 4){
                for(int j=1; j<=11; j++){
                    base.wait(1);
                    mHub.MH_strtOfPlay.click();
                    base.wait(1);
                    mHub.MH_p2AddPoint.click();
                    base.wait(1);
                    if(j==1) {
                        for (int k = 1; k <= 4; k++) {
                            mHub.MH_strtOfPlay.click();
                            base.wait(1);
                            mHub.MH_p1AddPoint.click();
                            base.wait(1);
                        }
                    }
                }
            }
            if(i != 5){
                mHub.MH_nextGame.click();
                base.wait(1);
            }
        }
        for(int j=1; j<=11; j++){
            if(j==6){
                mHub.MH_Decconfirm.click();
                base.wait(1);
            }
            base.wait(1);
            mHub.MH_strtOfPlay.click();
            base.wait(1);
            mHub.MH_p1AddPoint.click();
            base.wait(1);
            if(j==1) {
                for (int k = 1; k <= 4; k++) {
                    mHub.MH_strtOfPlay.click();
                    base.wait(1);
                    mHub.MH_p2AddPoint.click();
                    base.wait(1);
                }
            }
        }
        mHub.MH_confirm.click();
    }

    @Given("play the matches in the match hub")
    public void playMatchInMatchHub()throws Exception{
        Alert alert;
        base.wait(2);
        List<WebElement> table_list=mHub.list_matchhub_tablelist.findElements(By.xpath("div"));
        System.out.println("table count="+table_list.size());
        base.wait(2);
        if(table_list.size()>8){
            for (int i=0;i<4;i++){
                base.wait(2);
                driver.findElement(By.xpath("//div[@id='div-tables']//div["+ (i+1) +"]//button")).click();
                //table_list.get(i).findElement(By.xpath("//button")).click();
                base.wait(1);
                mHub.MH_TableEnt.click();
                base.wait(1);
                WebElement firstmatch=driver.findElement(By.xpath("//div[@id='results_div']//tr[1]"));
                base.wait(2);
                firstmatch.click();
                base.wait(1);
                mHub.MH_matchStart.click();
                base.wait(2);
                play_match();
                base.wait(3);
                mHub.button_matchhub_table_back.click();
                base.wait(3);
                try {
                    alert = driver.switchTo().alert();
                    base.wait(1);
                    alert.accept();
                    base.wait(3);
                }
                catch (NoAlertPresentException e1){
                    System.out.println("No alert is present");
                }
            }
        }
        else if(table_list.size()>4){
            for (int i=0;i<4;i++){
                base.wait(2);
                table_list.get(i).click();
            }
        }
        else if(table_list.size()>2){
            for (int i=0;i<2;i++){
                base.wait(2);
                table_list.get(i).click();
            }
        }
        else if(table_list.size()>1){
            for (int i=0;i<1;i++){
                base.wait(2);
                table_list.get(i).click();
            }
        }
        else if(table_list.size()==1){
            table_list.get(0).click();

        }



    }
}