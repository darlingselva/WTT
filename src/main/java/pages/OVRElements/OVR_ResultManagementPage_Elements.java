package pages.OVRElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pageobjectconfiguration.ElementName;

public class OVR_ResultManagementPage_Elements {
    WebDriver driver;
    public OVR_ResultManagementPage_Elements(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//app-result-management//div[@class='border treeViewScroll']//ul[@class='tree mt-1']")
    @ElementName("list_OVR_resultmanagement_eventslist")
    public WebElement list_OVR_resultmanagement_eventslist;

//    @FindBy(xpath = "//b[contains(text(),'Matches')]//parent::div//parent::div//parent::div//table//tbody")
//    @ElementName("table_OVR_resultmanagement_matchtable")
//    public WebElement table_OVR_resultmanagement_matchtable;

    @FindBy(xpath = "//*[@id='table-scroll-fixed']//table//tbody")
    @ElementName("table_OVR_resultmanagement_matchtable")
    public WebElement table_OVR_resultmanagement_matchtable;

    @FindBy(xpath = "//app-final-match-result//button[@aria-label='Close' and @type='button']")
    @ElementName("button_OVR_resultmanagement_editresultpopup_close")
    public WebElement button_OVR_resultmanagement_editresultpopup_close;

    @FindBy(xpath = "//app-final-match-result//b[contains(text(),'Change Status')]")
    @ElementName("button_OVR_resultmanagement_editresultpopup_ChangeStatus")
    public WebElement button_OVR_resultmanagement_editresultpopup_ChangeStatus;

    @FindBy(xpath = "//app-final-match-result//button[contains(text(),'Reset & Save') and @type='button']")
    @ElementName("button_OVR_resultmanagement_editresultpopup_ResetSave")
    public WebElement button_OVR_resultmanagement_editresultpopup_ResetSave;

    @FindBy(xpath = "//app-final-match-result//button[@type='button']//span[contains(text(),'Winner & Save')]")
    @ElementName("button_OVR_resultmanagement_editresultpopup_WinnerSave")
    public WebElement button_OVR_resultmanagement_editresultpopup_WinnerSave;

    @FindBy(xpath = "//app-final-match-result//span[contains(text(),' Best Of ')]//parent::button")
    @ElementName("text_OVR_resultmanagement_editresultpopup_bestof")
    public WebElement text_OVR_resultmanagement_editresultpopup_bestof;

    @FindBy(xpath = "//app-final-match-result//tbody")
    @ElementName("table_OVR_resultmanagement_editresultpopup_games")
    public WebElement table_OVR_resultmanagement_editresultpopup_games;


}
