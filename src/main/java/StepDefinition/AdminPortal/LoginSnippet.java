package StepDefinition.AdminPortal;

import base.DriverInitialisation;
import io.cucumber.java.en.Given;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.Assert;
import StepDefinition.TestClass;
import base.Commonmethods;
import pages.AdminPortalElements.Admin_login_page_Elements;
import pages.AdminPortalElements.EventcreationElements;
import pages.OVRElements.OVR_login_page_Elements;
import util.AnnotationProcessor;
import util.TestDataReader;

public class LoginSnippet extends DriverInitialisation {

	//private static final Logger LOG = LogManager.getLogger(LoginSnippet.class);
	static String Admin_Prop= System.getenv("Admin_Prop");


	@Given("^Login the admin Application$")
	public static void login() throws Exception {

		Admin_login_page_Elements admin =  PageFactory.initElements(driver,Admin_login_page_Elements.class);

		//Commonmethods.properties_file="Adminportal";
		Commonmethods.properties_file=Admin_Prop;
		String url=base.Commonmethods.getvaluefrompropertiesfile("url");
		driver.get(url);
		WebDriverWait wait1 = new WebDriverWait(driver,60);
		Commonmethods base=new Commonmethods(driver,wait1);
		base.Sendkey(admin.ittf_username, Commonmethods.getvaluefrompropertiesfile("admin.valid.username"));
		//base.Sendkey(AnnotationProcessor.get_the_element("ittf_username"), Commonmethods.getvaluefrompropertiesfile("admin.username"));
		base.Sendkey(admin.ittf_password, Commonmethods.getvaluefrompropertiesfile("admin.valid.password"));;
		base.click(admin.ittf_Sign_button);
		//LOG.info("login");



		Assert.assertEquals("ITTF-Admin Center", driver.getTitle());
		base.wait(2);


		base.takescreenshoot("loginpage");



	}

	@Given("^launch the Admin Application$")
	public static void lanuch_login() throws Exception {
		Admin_login_page_Elements admin =  PageFactory.initElements(driver,Admin_login_page_Elements.class);
		//Commonmethods.properties_file="OVR";
		Commonmethods.properties_file=Admin_Prop;
		String url=base.Commonmethods.getvaluefrompropertiesfile("url");
		driver.get(url);
		WebDriverWait wait1 = new WebDriverWait(driver,60);
		Commonmethods base=new Commonmethods(driver,wait1);

	}

	@Given("^enter the Admin username '(.*)'$")
	public static void Admin_login_enter_username(String username) throws Exception {
		Admin_login_page_Elements admin =  PageFactory.initElements(driver,Admin_login_page_Elements.class);
		Commonmethods.properties_file=Admin_Prop;
		String username1=base.Commonmethods.getvaluefrompropertiesfile(username);
		WebDriverWait wait1 = new WebDriverWait(driver,60);
		Commonmethods base=new Commonmethods(driver,wait1);
		//base.Sendkey(admin.ittf_username, username);
		base.Sendkey(admin.ittf_username, username1);

	}

	@Given("^enter the Admin password '(.*)'$")
	public static void Admin_login_enter_password(String password) throws Exception {
		Admin_login_page_Elements admin =  PageFactory.initElements(driver,Admin_login_page_Elements.class);
		Commonmethods.properties_file=Admin_Prop;
		String password1=base.Commonmethods.getvaluefrompropertiesfile(password);
		WebDriverWait wait1 = new WebDriverWait(driver,60);
		Commonmethods base=new Commonmethods(driver,wait1);
		base.Sendkey(admin.ittf_password, password1);

	}

	@Given("^Click on the Admin login button$")
	public static void Admin_clickonloginbutton() throws Exception {
		Admin_login_page_Elements admin =  PageFactory.initElements(driver,Admin_login_page_Elements.class);
		WebDriverWait wait1 = new WebDriverWait(driver,60);
		Commonmethods base=new Commonmethods(driver,wait1);
		base.click(admin.ittf_Sign_button);
	}

	@Given("^Excepted results Admin positive scenarios$")
	public static void Admin_login_positive_scenarios() throws Exception {
		Admin_login_page_Elements admin =  PageFactory.initElements(driver,Admin_login_page_Elements.class);
		//Commonmethods.properties_file="Admin_Prop";
		Commonmethods.properties_file=Admin_Prop;
		String url=base.Commonmethods.getvaluefrompropertiesfile("url");
		WebDriverWait wait1 = new WebDriverWait(driver,60);
		Commonmethods base=new Commonmethods(driver,wait1);
		base.wait(5);
		//Assert.assertEquals("https://ovr-sim-uat.azurewebsites.net/discipline", driver.getCurrentUrl());
		Assert.assertEquals(url.replace("login","list/individuals"), driver.getCurrentUrl());
		base.wait(2);

	}

	@Given("^Excepted results Admin negative scenarios$")
	public static void Admin_login_negative_scenarios() throws Exception {
		Admin_login_page_Elements admin =  PageFactory.initElements(driver,Admin_login_page_Elements.class);
		WebDriverWait wait1 = new WebDriverWait(driver,60);
		Commonmethods base=new Commonmethods(driver,wait1);
		base.wait(2);
		String erroralert=admin.text_Admin_login_error_alert.getText();
		System.out.println("erroralert="+erroralert);
		Assert.assertEquals("INVALID CREDENTIAL\n" +
				"\n" +
				"Something was wrong.Check your Username and Password" ,erroralert);

	}

	@Given("^Excepted results Admin negative scenarios2$")
	public static void Admin_login_negative_scenarios2() throws Exception {
		Admin_login_page_Elements admin =  PageFactory.initElements(driver,Admin_login_page_Elements.class);
		WebDriverWait wait1 = new WebDriverWait(driver,60);
		Commonmethods base=new Commonmethods(driver,wait1);
		base.wait(2);
		String erroralert=admin.text_Admin_login_error_alert.getText();
		System.out.println("erroralert="+erroralert);
		Assert.assertEquals("Enter Username and Password" ,erroralert);

	}





}
