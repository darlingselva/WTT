package StepDefinition.OVR;

import base.DriverInitialisation;
import io.cucumber.java.en.Given;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.Assert;

import base.Commonmethods;
import pages.OVRElements.OVR_login_page_Elements;

public class OVR_LoginSnippet extends DriverInitialisation {
	@Given("^Login the OVR Application$")
	public static void OVR_login() throws Exception {
		OVR_login_page_Elements OVR_Login =  PageFactory.initElements(driver,OVR_login_page_Elements.class);
		String OVR_Prop= System.getenv("OVR_Prop");
		//Commonmethods.properties_file="OVR";
		Commonmethods.properties_file=OVR_Prop;
		String url=base.Commonmethods.getvaluefrompropertiesfile("url");
		driver.get(url);
		WebDriverWait wait1 = new WebDriverWait(driver,60);
		Commonmethods base=new Commonmethods(driver,wait1);
		base.Sendkey(OVR_Login.text_OVR_Login_username, Commonmethods.getvaluefrompropertiesfile("OVR.username"));
		base.Sendkey(OVR_Login.text_OVR_Login_password, Commonmethods.getvaluefrompropertiesfile("OVR.password"));;
		base.click(OVR_Login.button_OVR_Login_login);



		//Assert.assertEquals("ITTF-Admin Center", driver.getTitle());
		base.wait(2);
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		base.takescreenshoot();

	}

	@Given("^launch the OVR Application$")
	public static void lanuch_login() throws Exception {
		OVR_login_page_Elements OVR_Login =  PageFactory.initElements(driver,OVR_login_page_Elements.class);
		String OVR_Prop= System.getenv("OVR_Prop");
		//Commonmethods.properties_file="OVR";
		Commonmethods.properties_file=OVR_Prop;
		String url=base.Commonmethods.getvaluefrompropertiesfile("url");
		driver.get(url);
		WebDriverWait wait1 = new WebDriverWait(driver,60);
		Commonmethods base=new Commonmethods(driver,wait1);
//		base.Sendkey(OVR_Login.text_OVR_Login_username, Commonmethods.getvaluefrompropertiesfile("OVR.username"));
//		base.Sendkey(OVR_Login.text_OVR_Login_password, Commonmethods.getvaluefrompropertiesfile("OVR.password"));;
//		base.click(OVR_Login.button_OVR_Login_login);
//
//
//
//		//Assert.assertEquals("ITTF-Admin Center", driver.getTitle());
//		base.wait(2);
//		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	//	base.takescreenshoot();

	}

	@Given("^enter the OVR username '(.*)' and password '(.*)'$")
	public static void OVR_login_username_password(String username,String password) throws Exception {
		OVR_login_page_Elements OVR_Login =  PageFactory.initElements(driver,OVR_login_page_Elements.class);
//		Commonmethods.properties_file="OVR";
//		String url=base.Commonmethods.getvaluefrompropertiesfile("url");
//		driver.get(url);
		WebDriverWait wait1 = new WebDriverWait(driver,60);
		Commonmethods base=new Commonmethods(driver,wait1);
		base.Sendkey(OVR_Login.text_OVR_Login_username, username);
		base.Sendkey(OVR_Login.text_OVR_Login_password, password);;
//		base.click(OVR_Login.button_OVR_Login_login);
//
//
//
//		//Assert.assertEquals("ITTF-Admin Center", driver.getTitle());
//		base.wait(2);
//		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		//base.takescreenshoot();

	}
	@Given("^enter the OVR username '(.*)'$")
	public static void OVR_login_enter_username(String username) throws Exception {
		OVR_login_page_Elements OVR_Login =  PageFactory.initElements(driver,OVR_login_page_Elements.class);
//		Commonmethods.properties_file="OVR";
//		String url=base.Commonmethods.getvaluefrompropertiesfile("url");
//		driver.get(url);
		WebDriverWait wait1 = new WebDriverWait(driver,60);
		Commonmethods base=new Commonmethods(driver,wait1);
		base.Sendkey(OVR_Login.text_OVR_Login_username, username);

	}

	@Given("^enter the OVR password '(.*)'$")
	public static void OVR_login_enter_password(String password) throws Exception {
		OVR_login_page_Elements OVR_Login =  PageFactory.initElements(driver,OVR_login_page_Elements.class);
//		Commonmethods.properties_file="OVR";
//		String url=base.Commonmethods.getvaluefrompropertiesfile("url");
//		driver.get(url);
		WebDriverWait wait1 = new WebDriverWait(driver,60);
		Commonmethods base=new Commonmethods(driver,wait1);
		base.Sendkey(OVR_Login.text_OVR_Login_password, password);

	}

	@Given("^Click on the OVR login button$")
	public static void OVR_clickonloginbutton() throws Exception {
		OVR_login_page_Elements OVR_Login =  PageFactory.initElements(driver,OVR_login_page_Elements.class);
		WebDriverWait wait1 = new WebDriverWait(driver,60);
		Commonmethods base=new Commonmethods(driver,wait1);
		base.click(OVR_Login.button_OVR_Login_login);
	}

	@Given("^Excepted results OVR positive scenarios$")
	public static void OVR_login_positive_scenarios() throws Exception {
		OVR_login_page_Elements OVR_Login =  PageFactory.initElements(driver,OVR_login_page_Elements.class);
		String OVR_Prop= System.getenv("OVR_Prop");
		//Commonmethods.properties_file="OVR";
		Commonmethods.properties_file=OVR_Prop;
		String url=base.Commonmethods.getvaluefrompropertiesfile("url");
		WebDriverWait wait1 = new WebDriverWait(driver,60);
		Commonmethods base=new Commonmethods(driver,wait1);
		base.wait(5);
		//Assert.assertEquals("https://ovr-sim-uat.azurewebsites.net/discipline", driver.getCurrentUrl());
		Assert.assertEquals(url.replace("login","discipline"), driver.getCurrentUrl());
		base.wait(2);

	}

	@Given("^Excepted results OVR negative scenarios$")
	public static void OVR_login_negative_scenarios() throws Exception {
		OVR_login_page_Elements OVR_Login =  PageFactory.initElements(driver,OVR_login_page_Elements.class);
		WebDriverWait wait1 = new WebDriverWait(driver,60);
		Commonmethods base=new Commonmethods(driver,wait1);
		base.wait(2);
		String erroralert=OVR_Login.text_OVR_login_error_alert.getText();
		System.out.println("erroralert="+erroralert);
		Assert.assertEquals("The Username or Password you have entered is invalid.\nPlease try again" ,erroralert);

	}

	@Given("^Excepted results OVR negative scenarios without username and password$")
	public static void OVR_login_negative_scenarios_without_username_password() throws Exception {
		OVR_login_page_Elements OVR_Login =  PageFactory.initElements(driver,OVR_login_page_Elements.class);
		WebDriverWait wait1 = new WebDriverWait(driver,60);
		Commonmethods base=new Commonmethods(driver,wait1);
		base.wait(2);
		String username_bordercolor=OVR_Login.text_OVR_Login_username.getCssValue("border-color");
		String password_bordercolor=OVR_Login.text_OVR_Login_password.getCssValue("border-color");
		System.out.println("username_bordercolor="+username_bordercolor);
		System.out.println("password_bordercolor="+password_bordercolor);
		Assert.assertEquals("rgb(220, 53, 69)",username_bordercolor);
		Assert.assertEquals("rgb(220, 53, 69)",password_bordercolor);

	}

	@Given("^Excepted results OVR negative scenarios without username$")
	public static void OVR_login_negative_scenarios_without_username() throws Exception {
		OVR_login_page_Elements OVR_Login =  PageFactory.initElements(driver,OVR_login_page_Elements.class);
		WebDriverWait wait1 = new WebDriverWait(driver,60);
		Commonmethods base=new Commonmethods(driver,wait1);
		base.wait(2);
		String username_bordercolor=OVR_Login.text_OVR_Login_username.getCssValue("border-color");
		//String password_bordercolor=OVR_Login.text_OVR_Login_password.getCssValue("border-color");
		System.out.println("username_bordercolor="+username_bordercolor);
		//System.out.println("password_bordercolor="+password_bordercolor);
		Assert.assertEquals("rgb(220, 53, 69)",username_bordercolor);
		//Assert.assertEquals("rgb(220, 53, 69)",password_bordercolor);

	}

	@Given("^Excepted results OVR negative scenarios without password$")
	public static void OVR_login_negative_scenarios_without_password() throws Exception {
		OVR_login_page_Elements OVR_Login =  PageFactory.initElements(driver,OVR_login_page_Elements.class);
		WebDriverWait wait1 = new WebDriverWait(driver,60);
		Commonmethods base=new Commonmethods(driver,wait1);
		base.wait(2);
		//String username_bordercolor=OVR_Login.text_OVR_Login_username.getCssValue("border-color");
		String password_bordercolor=OVR_Login.text_OVR_Login_password.getCssValue("border-color");
		//System.out.println("username_bordercolor="+username_bordercolor);
		System.out.println("password_bordercolor="+password_bordercolor);
		//Assert.assertEquals("rgb(220, 53, 69)",username_bordercolor);
		Assert.assertEquals("rgb(220, 53, 69)",password_bordercolor);

	}


}
