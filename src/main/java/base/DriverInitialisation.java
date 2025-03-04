package base;

import java.io.FileInputStream;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.remote.DesiredCapabilities;



public class DriverInitialisation {

	public static WebDriver driver;
	public static WebDriverWait wait;
	public static Properties prop;
	public static EventFiringWebDriver e_driver;

	public static String properties_file1="WTT_App_Config";
	public static ResourceBundle resource1;



	public DriverInitialisation() {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(CommonPaths.Configuration_path + "WTT_App_Config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void initialization() {


		String browserName = prop.getProperty("browser");
		//resource1=ResourceBundle.getBundle(properties_file1);
		//String browserName = base.Commonmethods.getvaluefrompropertiesfile("browser");
		//String browserName = resource1.getObject("browser").toString();


		//String url=base.Commonmethods.getvaluefrompropertiesfile("url");
		if (browserName.equals("chrome")) {
			//			System.setProperty("webdriver.chrome.driver",
			//					System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
			//System.setProperty("webdriver.chrome.driver",CommonPaths.driver_path+"chromedriver.exe");

			//driver = new ChromeDriver();
			driver= WebDriverManager.chromedriver().create();
		}
		else if (browserName.equals("firefox")) {
//			System.getProperty("webdriver.gecko.driver",CommonPaths.driver_path+"geckodriver.exe");
//			DesiredCapabilities capabilities = DesiredCapabilities.firefox();
//			capabilities.setCapability("marionette",true);
//			driver= new FirefoxDriver(capabilities);
			driver=WebDriverManager.firefoxdriver().create();
		}
		else if (browserName.equals("edge")) {
//			System.getProperty("webdriver.gecko.driver",CommonPaths.driver_path+"geckodriver.exe");
//			DesiredCapabilities capabilities = DesiredCapabilities.firefox();
//			capabilities.setCapability("marionette",true);
//			driver= new FirefoxDriver(capabilities);
			driver=WebDriverManager.edgedriver().create();
		}
		else if (browserName.equals("safari")) {
//			System.getProperty("webdriver.gecko.driver",CommonPaths.driver_path+"geckodriver.exe");
//			DesiredCapabilities capabilities = DesiredCapabilities.firefox();
//			capabilities.setCapability("marionette",true);
//			driver= new FirefoxDriver(capabilities);
			driver=WebDriverManager.safaridriver().create();
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		wait=new WebDriverWait(driver, 30);
		//driver.get(prop.getProperty("url"));
		//driver.get(url);
	}
}