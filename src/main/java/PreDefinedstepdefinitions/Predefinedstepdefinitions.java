package PreDefinedstepdefinitions;

import base.CommonPaths;
import base.Commonmethods;
import base.DriverInitialisation;
import base.Webelementname;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Predefinedstepdefinitions extends DriverInitialisation {

    public static WebElement webElement=null;

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
                        webElement= (WebElement) field.get(obj);  // Return the actual WebElement
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Given("^click on element '(.*)'$")
    public void element_on_element(String Webelement_name)throws Exception{
        getthefield(Webelement_name);
        WebDriverWait wait1 = new WebDriverWait(driver,60);
        Commonmethods base=new Commonmethods(driver,wait1);
        base.wait(2);
        webElement.click();
    }

    @Given("^element visiability '(.*)'$")
    public void element_visiability(String Webelement_name)throws Exception{
        getthefield(Webelement_name);
        WebDriverWait wait1 = new WebDriverWait(driver,60);
        Commonmethods base=new Commonmethods(driver,wait1);
        base.wait(2);
        base.checkelementvisibility(webElement);
        //webElement.isDisplayed();
    }
}