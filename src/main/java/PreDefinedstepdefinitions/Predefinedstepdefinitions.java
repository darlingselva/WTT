package PreDefinedstepdefinitions;

import base.CommonPaths;
import base.Commonmethods;
import base.DriverInitialisation;
import base.Webelementname;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import io.cucumber.java.en.Given;
import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Predefinedstepdefinitions extends DriverInitialisation {

    public static WebElement webElement=null;

    public static WebElement combinedwebElement=null;

    public static String webElementvalue=null;

    public static int search_valued_table_key=0;
    public static String Value=null;

    public static  int numberofdata = 0;
    public static void getthefield(String Webelement_name)throws Exception {

        WebDriverWait wait1 = new WebDriverWait(driver,60);
        Commonmethods base=new Commonmethods(driver,wait1);
        base.wait(2);

        String[] a=Webelement_name.split("/");

        String parentfoldername=a[0].toString();
        String Class_name=a[1].toString();
        String classpath="pages."+parentfoldername+"."+Class_name;
        String Webelement_name1=a[2].toString();

        Class<?> clazz = Class.forName(classpath);
        //Object instance = clazz.getDeclaredConstructor().newInstance();

        Constructor<?> constructor = clazz.getConstructor(WebDriver.class);

        Object obj = constructor.newInstance(driver);

        //webElement= (WebElement) clazz.getField(Webelement_name1).get(instance);

        //Field field=clazz.getField(Webelement_name1);

        //webElement= (WebElement) clazz.getField(Webelement_name1).get(obj);

        //webElement= (WebElement) field.get(obj);



        // Set up WebDriver (assuming ChromeDriver here)

        //driver.get("https://ittf-admin-uat-2-web-aucgfagaada3gbc4.southeastasia-01.azurewebsites.net/#/login");

        // Initialize the LoginPage object
        //  LoginPage loginPage = new LoginPage(driver);

        // Use the getFieldByString method to get elements dynamically by their 'name' or 'id'
//        WebElement usernameField = loginPage.getFieldByString("username");  // Can use either name or id
//        WebElement passwordField = loginPage.getFieldByString("password");  // Same here
//        WebElement loginButton = loginPage.getFieldByString("loginButton");

        try {
            for (Field field : obj.getClass().getDeclaredFields()) {
                if (field.isAnnotationPresent(Webelementname.class)) {
                    Webelementname fieldAttribute = field.getAnnotation(Webelementname.class);

                    // Check if the identifier matches either name or id
                    if (fieldAttribute.name().equals(Webelement_name1)) {
                        field.setAccessible(true);  // Make the field accessible via reflection
                        webElement= (WebElement) field.get(obj);   // Return the actual WebElement
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void getthefieldvalue(String Webelement_name)throws Exception {

//        WebDriverWait wait1 = new WebDriverWait(driver,60);
//        Commonmethods base=new Commonmethods(driver,wait1);
//        base.wait(2);

        String[] a=Webelement_name.split("/");

        String parentfoldername=a[0].toString();
        String Class_name=a[1].toString();
        String classpath="pages."+parentfoldername+"."+Class_name;
        String Webelement_name1=a[2].toString();

        Class<?> clazz = Class.forName(classpath);
        //Object instance = clazz.getDeclaredConstructor().newInstance();

        Constructor<?> constructor = clazz.getConstructor(WebDriver.class);

        Object obj = constructor.newInstance(driver);

        //webElement= (WebElement) clazz.getField(Webelement_name1).get(instance);

        //Field field=clazz.getField(Webelement_name1);

        //webElement= (WebElement) clazz.getField(Webelement_name1).get(obj);

        //webElement= (WebElement) field.get(obj);



        // Set up WebDriver (assuming ChromeDriver here)

        //driver.get("https://ittf-admin-uat-2-web-aucgfagaada3gbc4.southeastasia-01.azurewebsites.net/#/login");

        // Initialize the LoginPage object
        //  LoginPage loginPage = new LoginPage(driver);

        // Use the getFieldByString method to get elements dynamically by their 'name' or 'id'
//        WebElement usernameField = loginPage.getFieldByString("username");  // Can use either name or id
//        WebElement passwordField = loginPage.getFieldByString("password");  // Same here
//        WebElement loginButton = loginPage.getFieldByString("loginButton");

        try {
            for (Field field : obj.getClass().getDeclaredFields()) {
                if (field.isAnnotationPresent(Webelementname.class)) {
                    Webelementname fieldAttribute = field.getAnnotation(Webelementname.class);

                    // Check if the identifier matches either name or id
                    if (fieldAttribute.name().equals(Webelement_name1)) {
                        field.setAccessible(true);  // Make the field accessible via reflection
                       // webElementvalue= field.getAnnotations();  // Return the actual WebElement
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Given("^combined on webelement '(.*)' adding string '(.*)'$")
    public static void combined_on_webelement(String Webelement_name,String addstring)throws Exception{
        getthefield(Webelement_name);
        WebDriverWait wait1 = new WebDriverWait(driver,60);
        Commonmethods base=new Commonmethods(driver,wait1);
        // base.scrollToView(webElement);
        combinedwebElement=webElement.findElement(By.xpath(addstring));
        webElement=combinedwebElement;
        System.out.println(webElement.toString());
        base.wait(2);

    }
    @Given("^click on element '(.*)'$")
    public static void click_on_element(String Webelement_name)throws Exception{
        getthefield(Webelement_name);
        WebDriverWait wait1 = new WebDriverWait(driver,60);
        Commonmethods base=new Commonmethods(driver,wait1);
       // base.scrollToView(webElement);
        base.wait(2);
        webElement.click();
    }


    @Given("^click on element is available'(.*)'$")
    public static void click_on_elementisavailable(String Webelement_name)throws Exception{
        try {
            getthefield(Webelement_name);
            WebDriverWait wait1 = new WebDriverWait(driver, 60);
            Commonmethods base = new Commonmethods(driver, wait1);
            base.wait(2);
            webElement.click();
        }
        catch(NoSuchElementException E){
            System.out.println("element is not available");
        }
    }

    @Given("^element visiability '(.*)'$")
    public static void element_visiability(String Webelement_name)throws Exception{
        getthefield(Webelement_name);
        WebDriverWait wait1 = new WebDriverWait(driver,60);
        Commonmethods base=new Commonmethods(driver,wait1);
        base.wait(2);
        base.checkelementvisibility(webElement);
        //webElement.isDisplayed();
    }

    @Given("^element invisiability '(.*)'$")
    public static void element_invisiability(String Webelement_name)throws Exception{
        getthefield(Webelement_name);
        WebDriverWait wait1 = new WebDriverWait(driver,60);
        Commonmethods base=new Commonmethods(driver,wait1);
        base.wait(2);
        //base.checkelementvisibility(webElement);
        //webElement.isDisplayed();
        try {
            if (webElement.isDisplayed()) {
                Assert.fail("element is visiable condition of invisiability");
            } else {
                System.out.println("elements is invisiability");
            }
        }
        catch (NoSuchElementException e){
            System.out.println("elements is invisiability");
        }
    }


    @Given("^jclick on element '(.*)'$")
    public static void Jclick_on_element(String Webelement_name)throws Exception{
        getthefield(Webelement_name);
        WebDriverWait wait1 = new WebDriverWait(driver,60);
        Commonmethods base=new Commonmethods(driver,wait1);
        base.wait(2);
        base.jclick(webElement);

    }

    @Given("^enter the value '(.*)' into '(.*)'$")
    public static void enterthevalueintotheelement(String value,String Webelement_name)throws Exception{
        getthefield(Webelement_name);
        WebDriverWait wait1 = new WebDriverWait(driver,60);
        Commonmethods base=new Commonmethods(driver,wait1);
        base.wait(2);
        webElement.sendKeys(value);
    }

    @Given("^Verify the actual value '(.*)' into excepted value'(.*)'$")
    public static void Verifytheactualandexceptedvalues(String value,String Webelement_name)throws Exception{
        getthefield(Webelement_name);
        WebDriverWait wait1 = new WebDriverWait(driver,60);
        Commonmethods base=new Commonmethods(driver,wait1);
        base.wait(2);
        String execepted_value=webElement.getText().toString();
        base.wait(2);
        Assert.assertEquals(execepted_value,value);
    }

    @Given("^Verify the actual value '(.*)' into excepted value without case sensitive '(.*)'$")
    public static void Verifytheactualandexceptedvalueswithoutcasesensitive(String value,String Webelement_name)throws Exception{
        getthefield(Webelement_name);
        WebDriverWait wait1 = new WebDriverWait(driver,60);
        Commonmethods base=new Commonmethods(driver,wait1);
        base.wait(2);
        String execepted_value=webElement.getText().toString();


        if (execepted_value.equalsIgnoreCase(value)) {
            System.out.println("matched");
        } else {
            Assert.fail();
        }

        base.wait(2);
       // Assert.assertEquals(execepted_value,value);

    }

    @Given("^Admin portal Search the value '(.*)' into the table '(.*)'$")
    public static void AdminportalSearchthevalueintothetable(String Expectedvalue,String Webelement_name)throws Exception {
        getthefield(Webelement_name);
        WebDriverWait wait1 = new WebDriverWait(driver, 60);
        Commonmethods base = new Commonmethods(driver, wait1);
        base.wait(2);

        int numberofrow = 0;

        List<WebElement> tableRows;

        tableRows = webElement.findElements(By.tagName("tr"));
        // List<WebElement> tableRows = webElement.findElements(By.xpath("//tr"));
        driver.navigate().refresh();
        base.wait(5);
        tableRows = webElement.findElements(By.tagName("tr"));
        numberofrow = tableRows.size();
        System.out.println("number of row=" + numberofrow);
        for (int i = 0; i < numberofrow; i++) {
            List<WebElement> rowdata = tableRows.get(i).findElements(By.tagName("td"));
            numberofdata = rowdata.size();

        }
        System.out.println("number of data=" + numberofdata);

        List<String> tablevaluelist = new ArrayList<>();

        //HashMap<Integer, String> tablevaluehashmap = new HashMap<>();

        Multimap<Integer, String> tablevaluehashmap = ArrayListMultimap.create();
        WebElement temp_webelement;
        String Actualvalue = null;

        if (numberofrow>=1) {
              for (int j = 0; j < numberofrow; j++) {
                for (int k = 0; k < numberofdata; k++) {

                    try {

                        Actualvalue = webElement.findElement(By.xpath("//tr[" + (j + 1) + "]//td[" + (k + 1) + "]//div//span//span//span")).getText();

                        //temp_webelement = webElement.findElement(By.xpath("//tr[" + (j + 1) + "]//td[" + (k + 1) + "]//div//span//span//span"));
                        //temp_webelement=rowdata.get(j).findElement(By.xpath("//div//span//span//span"));
                        //Actualvalue = temp_webelement.getText();
                        //tablevaluelist.add(Actualvalue);
                        tablevaluehashmap.put(j, Actualvalue);

                    } catch (NoSuchElementException e) {
                        try {

                            Actualvalue = webElement.findElement(By.xpath("//tr[" + (j + 1) + "]//td[" + (k + 1) + "]//div//span//span")).getText();

                            //temp_webelement = webElement.findElement(By.xpath("//tr[" + (j + 1) + "]//td[" + (k + 1) + "]//div//span//span"));
                            //temp_webelement=rowdata.get(j).findElement(By.xpath("//div//span//span//span"));
//                            Actualvalue = temp_webelement.getText();
                            //tablevaluelist.add(Actualvalue);
                            tablevaluehashmap.put(j, Actualvalue);
                        } catch (NoSuchElementException e1) {
                            System.out.println("not interactable");
                        }

                    }

                    //System.out.println(Actualvalue);
                }

        }

            System.out.println(tablevaluehashmap);
            System.out.println(Expectedvalue);
            if(tablevaluehashmap.containsValue(Expectedvalue))
            {
                for (Map.Entry<Integer, String> e : tablevaluehashmap.entries())
                {
                String value1 = e.getValue();
                if (value1.equals(Expectedvalue)) {
                    System.out.println("value founded");
                    search_valued_table_key = e.getKey();
                }
               }
            }
            else {
                Assert.fail("value not founded");
            }
        }
       else
        {
            Assert.fail("value not founded");
        }


//        System.out.println("List elements: " + tablevaluelist);
//        if(tablevaluelist.contains(Expectedvalue)) {
//            System.out.println("value founded");
//        }
//        else {
//            Assert.fail("value not founded");
//        }


        //System.out.println("Key="+search_valued_table_key);
    }

    @Given("^Admin portal action option '(.*)' into the table '(.*)'$")
    public static void Adminportaloptionontable(String action_option,String Webelement_name)throws Exception{
        getthefield(Webelement_name);
        WebDriverWait wait1 = new WebDriverWait(driver, 60);
        Commonmethods base = new Commonmethods(driver, wait1);
        base.wait(2);
        WebElement temp_webelement;

        temp_webelement = webElement.findElement(By.xpath("//tr[" + ( search_valued_table_key+ 1) + "]//td["+numberofdata+"]//button[@mattooltip='"+action_option+"']"));
        temp_webelement.click();



    }


    @Given("^Admin portal action option '(.*)' with matched value '(.*)' into the table '(.*)'$")
    public static void Adminportaloptionontable(String action_option,String Expectedvalue,String Webelement_name)throws Exception{
        getthefield(Webelement_name);
        WebDriverWait wait1 = new WebDriverWait(driver, 60);
        Commonmethods base = new Commonmethods(driver, wait1);
        base.wait(2);
        WebElement temp_webelement1;


        int numberofrow= 0;
        int numberofdata = 0;
        List<WebElement> tableRows;

        tableRows = webElement.findElements(By.tagName("tr"));
        // List<WebElement> tableRows = webElement.findElements(By.xpath("//tr"));
        driver.navigate().refresh();
        base.wait(5);
        tableRows = webElement.findElements(By.tagName("tr"));
        numberofrow = tableRows.size();
        System.out.println("number of row=" + numberofrow);
        for (int i = 0; i < numberofrow - 1; i++) {
            List<WebElement> rowdata = tableRows.get(i).findElements(By.tagName("td"));
            numberofdata = rowdata.size();

        }
        System.out.println("number of data=" + numberofdata);

        List<String> tablevaluelist = new ArrayList<>();

        //HashMap<Integer, String> tablevaluehashmap = new HashMap<>();

        Multimap<Integer, String> tablevaluehashmap = ArrayListMultimap.create();

        for (int j = 0; j < numberofrow; j++) {
            for (int k=0;k<numberofdata ; k++) {
                WebElement temp_webelement;
                String Actualvalue = null;
                try {
                    temp_webelement = webElement.findElement(By.xpath("//tr[" + (j + 1) + "]//td[" + (k + 1) + "]//div//span//span//span"));
                    //temp_webelement=rowdata.get(j).findElement(By.xpath("//div//span//span//span"));
                    Actualvalue = temp_webelement.getText();
                    tablevaluelist.add(Actualvalue);
                    tablevaluehashmap.put(j,Actualvalue);

                } catch (NoSuchElementException e) {
                    try {
                        temp_webelement = webElement.findElement(By.xpath("//tr[" + (j + 1) + "]//td[" + (k + 1) + "]//div//span//span"));
                        //temp_webelement=rowdata.get(j).findElement(By.xpath("//div//span//span//span"));
                        Actualvalue = temp_webelement.getText();
                        tablevaluelist.add(Actualvalue);
                        tablevaluehashmap.put(j,Actualvalue);
                    }
                    catch (NoSuchElementException e1){
                        System.out.println("not interactable");
                    }

                }

                System.out.println(Actualvalue);
            }
        }
        System.out.println("List elements: " + tablevaluelist);
        if(tablevaluelist.contains(Expectedvalue)) {
            System.out.println("value founded");
        }
        else {
            Assert.fail("value not founded");
        }

        System.out.println(tablevaluehashmap);
        for (Map.Entry<Integer, String> e : tablevaluehashmap.entries()) {
            String value1 = e.getValue();
            if(value1.equals(Expectedvalue)){
                search_valued_table_key = e.getKey();
            }
        }
        System.out.println("Key="+search_valued_table_key);


        temp_webelement1 = webElement.findElement(By.xpath("//tr[" + ( search_valued_table_key+ 1) + "]//td[4]//button[@mattooltip='"+action_option+"']"));
//        temp_webelement1.click();
        base.jclick(temp_webelement1);
        base.wait(10);



    }

    @Given("^clear the value into '(.*)'$")
    public static void clearthevalueintotheelement(String Webelement_name)throws Exception{
        getthefield(Webelement_name);
        WebDriverWait wait1 = new WebDriverWait(driver,60);
        Commonmethods base=new Commonmethods(driver,wait1);
        base.wait(2);
        webElement.clear();
    }

    @Given("^delete the value into '(.*)'$")
    public static void deletethevalueintotheelement(String Webelement_name)throws Exception{
        getthefield(Webelement_name);
        WebDriverWait wait1 = new WebDriverWait(driver,60);
        Commonmethods base=new Commonmethods(driver,wait1);
        base.wait(2);
        webElement.sendKeys(Keys.CONTROL + "a");

    }

    @Given("^Jclear the value into '(.*)'$")
    public static void Jclearthevalueintotheelement(String Webelement_name)throws Exception{
        getthefield(Webelement_name);
        WebDriverWait wait1 = new WebDriverWait(driver,60);
        Commonmethods base=new Commonmethods(driver,wait1);
        base.wait(2);
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].value=''",webElement);

    }

    @Given("^get the value from '(.*)'$")
    public static void getthevaluefromelement(String Webelement_name)throws Exception{
        getthefield(Webelement_name);
        WebDriverWait wait1 = new WebDriverWait(driver,60);
        Commonmethods base=new Commonmethods(driver,wait1);
        base.wait(2);
        Value=webElement.getText();
        System.out.println("value of webelement="+Value);

    }


    @Given("^Select dropdown based on index '(.*)' from '(.*)'$")
    public static void Selectdropdownbasedonindex(int index,String Webelement_name)throws Exception{
        getthefield(Webelement_name);
        Select dropdown = new Select(webElement);
        dropdown.selectByIndex(index);
    }

    @Given("^select action option '(.*)' from list '(.*)'$")
    public static void selectlistactionoption(int index,String Webelement_name)throws Exception{
        getthefield(Webelement_name);
        List<WebElement> list;

        list=webElement.findElements(By.tagName("li"));
        System.out.println("number of list="+list.size());
        WebElement temp_webelement=webElement.findElement(By.xpath("li["+index+"]//input[@type='checkbox']"));
        //WebElement temp_webelement=list.get(index).findElement(By.xpath("//input[@type='checkbox']"));
        WebDriverWait wait1 = new WebDriverWait(driver,60);
        Commonmethods base=new Commonmethods(driver,wait1);
        base.wait(2);
        base.jclick(temp_webelement);
    }

    @Given("^select action with value '(.*)' from list '(.*)'$")
    public static void selectlistactionvalue(String value,String Webelement_name)throws Exception{
        getthefield(Webelement_name);
        List<WebElement> list;

        list=webElement.findElements(By.tagName("li"));
        System.out.println("number of list="+list.size());
        WebElement temp_webelement=webElement.findElement(By.xpath("//label[contains(text(),'"+value+"')]//parent::li//input[@type='checkbox']"));

        //WebElement temp_webelement=list.get(index).findElement(By.xpath("//input[@type='checkbox']"));
        WebDriverWait wait1 = new WebDriverWait(driver,60);
        Commonmethods base=new Commonmethods(driver,wait1);
        base.wait(2);
        base.jclick(temp_webelement);
    }

    @Given("^deselect action from list '(.*)'$")
    public static void deselectlistactionvalue(String Webelement_name)throws Exception{
        WebDriverWait wait1 = new WebDriverWait(driver,60);
        Commonmethods base=new Commonmethods(driver,wait1);
        getthefield(Webelement_name);
        List<WebElement> list;
        base.wait(1);
        base.scrollToView(webElement);



//        WebElement temp_webelement1=driver.findElement(By.xpath("//app-create-individuals//div[contains(text(),'Impairment Group ')]//parent::div//parent::div//angular2-multiselect//li[1]"));
//        System.out.println("classattributes1="+temp_webelement1.getAttribute("class"));
        list=webElement.findElements(By.tagName("li"));
        System.out.println("number of list="+list.size());
        for(int i=1;i<=list.size();i++){

//            String xpath1="//li["+i+"]";
//            System.out.println(xpath1);
            String classattributes=webElement.findElement(By.xpath("//li["+i+"]")).getAttribute("class");
//            WebElement temp_webelement1=webElement.findElement(By.xpath(xpath1));
//            base.scrollToView(temp_webelement1);
//            base.wait(1);
//            String classattributes=temp_webelement1.getAttribute("class");
            System.out.println(classattributes);
            if(classattributes.equals("pure-checkbox ng-star-inserted selected-item")){
                System.out.println("inside1");
                base.wait(2);

                WebElement temp_webelement=webElement.findElement(By.xpath("//li["+i+"]//input[@type='checkbox']"));
                base.wait(1);
                base.jclick(temp_webelement);
                break;
            }
        }

    }

    @Given("^deselect action from list for xpath '(.*)'$")
    public static void deselectlistactionvalue1(String Xpath)throws Exception{
        WebDriverWait wait1 = new WebDriverWait(driver,60);
        Commonmethods base=new Commonmethods(driver,wait1);
        //getthefield(Webelement_name);
        List<WebElement> list;
        base.wait(1);
        webElement=driver.findElement(By.xpath(Xpath));
        base.scrollToView(webElement);

//        WebElement temp_webelement1=driver.findElement(By.xpath("//app-create-individuals//div[contains(text(),'Impairment Group ')]//parent::div//parent::div//angular2-multiselect//li[1]"));
//        System.out.println("classattributes1="+temp_webelement1.getAttribute("class"));
        list=webElement.findElements(By.tagName("li"));
        System.out.println("number of list="+list.size());
        for(int i=1;i<=list.size();i++){

            String xpath1="//li["+i+"]";
            System.out.println(xpath1);
            //String classattributes=webElement.findElement(By.xpath("//li['"+i+"']")).getAttribute("class");
            WebElement temp_webelement1=webElement.findElement(By.xpath(xpath1));
            base.scrollToView(temp_webelement1);
            base.wait(1);
            String classattributes=temp_webelement1.getAttribute("class");
            System.out.println(classattributes);
            if(classattributes.equals("pure-checkbox ng-star-inserted selected-item")){
                System.out.println("inside1");
                base.wait(2);

                WebElement temp_webelement=webElement.findElement(By.xpath("//li["+i+"]//input[@type='checkbox']"));
                base.wait(1);
                base.jclick(temp_webelement);
                break;
            }
        }

    }

    @Given("^check the value '(.*)' from list '(.*)'$")
    public static void checklistvalues(String excpectedvalue,String Webelement_name)throws Exception {
        getthefield(Webelement_name);
        System.out.println("excepted value="+excpectedvalue);
        List<WebElement> list;
        String valueforlist=null;



        Multimap<Integer, String> valueoflistMap = ArrayListMultimap.create();

        list=webElement.findElements(By.tagName("li"));
        System.out.println("number of list="+list.size());



        for (int i=0;i<list.size();i++){
            //valueforlist=list.get(i).findElement(By.xpath("//label")).getText().toString();
            valueforlist=webElement.findElement(By.xpath("li["+(i+1)+"]//label")).getText();
            //valueoflist.add(valueforlist);
            //System.out.println(valueforlist);
            valueoflistMap.put(i,valueforlist);
        }

        System.out.println(valueoflistMap);
        String capsexcpectedvalue= StringUtils.capitalize(excpectedvalue);
        if(valueoflistMap.containsValue(capsexcpectedvalue))
        {
            for (Map.Entry<Integer, String> e : valueoflistMap.entries())
            {
                String value1 = e.getValue();
                if (value1.equals(capsexcpectedvalue)) {
                    System.out.println("value founded");
                }

            }
        }
        else if(valueoflistMap.containsValue(excpectedvalue)){
            for (Map.Entry<Integer, String> e : valueoflistMap.entries())
            {
                String value1 = e.getValue();
                if (value1.equals(excpectedvalue)) {
                    System.out.println("value founded");
                }

            }
        }
        else {
            Assert.fail("value not founded");
        }
    }


    @Given("^click on enabled button '(.*)'$")
    public static void clickonenablebutton(String Webelement_name)throws Exception{
        getthefield(Webelement_name);
        WebDriverWait wait1 = new WebDriverWait(driver,60);
        Commonmethods base=new Commonmethods(driver,wait1);
        base.wait(2);
        String button_action=null;
        if(webElement.isEnabled()){
            System.out.println("button is enable");
            button_action="Enable";
        }
        else {
            webElement.click();

        }

    }

    @Given("^click on enabled button to disable '(.*)'$")
    public static void clickonenableintodisablebutton(String Webelement_name)throws Exception{
        getthefield(Webelement_name);
        WebDriverWait wait1 = new WebDriverWait(driver,60);
        Commonmethods base=new Commonmethods(driver,wait1);
        base.wait(2);
        if(webElement.isEnabled()){
            webElement.click();
        }
        else {

            System.out.println("button is disenable");
        }

    }

    @Given("^click on enabled or disable button '(.*)' and '(.*)'$")
    public static void clickonenableordisablebutton(String action,String Webelement_name)throws Exception{
        getthefield(Webelement_name);
        WebDriverWait wait1 = new WebDriverWait(driver,60);
        Commonmethods base=new Commonmethods(driver,wait1);
        base.wait(2);
        String button_action=null;

        WebElement temp_webelement=webElement.findElement(By.tagName("input"));
        System.out.println(temp_webelement.toString());
        String toggle_button_state=temp_webelement.getAttribute("aria-checked");

        //if(webElement.isEnabled()||webElement.isSelected()){
            if(toggle_button_state.equals("true")){
            System.out.println("button is enable");
            button_action="Enable";
        }
        else {
            System.out.println("button is Disable");
            button_action = "Disable";

        }

        switch (action){
            case "Enable":

//                if(webElement.isEnabled()){
//                    System.out.println("button is already enable");
//                }
//                else {
//                    webElement.click();
//                }
                if (button_action.equals("Enable")){
                    System.out.println("button is already enable");
                }
                else {
                    webElement.click();
                }

                break;
            case "Disable":
//                if(webElement.isEnabled()){
//                    webElement.click();
//                }
//                else {
//                    System.out.println("button is already disenable");
//                }

                if (button_action.equals("Disable")){
                    System.out.println("button is already Disable");
                }
                else {
                    webElement.click();
                }
                break;
            default:
                break;
        }

    }

public static void main(String[] args){
    String s1 = "Hello";
    String s2 = "hello1";

    if (s1.equalsIgnoreCase(s2)) {
        System.out.println("pass");
    } else {
        System.out.println("fail");
    }
}


    }