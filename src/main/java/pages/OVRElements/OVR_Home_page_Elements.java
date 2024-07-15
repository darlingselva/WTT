package pages.OVRElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OVR_Home_page_Elements {

    WebDriver driver;

    public OVR_Home_page_Elements(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@class='theme-switch']//a")
    public WebElement button_OVR_Homepage_SwitchEvent;

    @FindBy(xpath = "(//div[@id='discipineSwitchModal']//table)[1]//tbody")
    public WebElement button_OVR_Homepage_SwitchEvent_ITTF;

    @FindBy(xpath = "(//div[@id='discipineSwitchModal']//table)[2]//tbody")
    public WebElement button_OVR_Homepage_SwitchEvent_WTT;

}
