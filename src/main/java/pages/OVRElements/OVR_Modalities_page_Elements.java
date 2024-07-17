package pages.OVRElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OVR_Modalities_page_Elements {

    WebDriver driver;

    public OVR_Modalities_page_Elements(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//app-modality//div[@class='treeViewScroll']//ul[@class='tree mt-2']")
    public WebElement text_OVR_Modalities_eventlist;

    @FindBy(id = "isMainDraw")
    public WebElement checkbox_OVR_Modalities_Knockout_maindraw;

    @FindBy(id = "autoDraw")
    public WebElement radio_OVR_Modalities_Knockout_autoDraw;

    @FindBy(id = "liveDraw")
    public WebElement radio_OVR_Modalities_Knockout_liveDraw;

    @FindBy(xpath = "//label[text()='Selection Mode']//following-sibling::ejs-dropdownlist")
    public WebElement dropdown_OVR_Modalities_Knockout_SelectionMode;

    @FindBy(xpath = "//button[contains(text(),'Publish')]")
    public WebElement button_OVR_Modalities_Knockout_Publish;

    @FindBy(xpath = "//button[contains(text(),'Push to On-Premise')]")
    public WebElement button_OVR_Modalities_Knockout_PushtoOnPremise;

    @FindBy(xpath = "//button[contains(text(),'Export Athletes List')]")
    public WebElement button_OVR_Modalities_Knockout_ExportAthletesList;

    @FindBy(xpath = "//button[contains(text(),'Export Athletes List')]//following-sibling::input[@type='file']")
    public WebElement button_OVR_Modalities_Knockout_choosefile;

    @FindBy(xpath = "//button[contains(text(),'Import Draw List')]")
    public WebElement button_OVR_Modalities_Knockout_ImportDrawList;

    @FindBy(xpath = "//a[contains(text(),'Back')]")
    public WebElement button_OVR_Modalities_Knockout_Back;

    @FindBy(xpath = "//label[text()='Winner of Phase']//following-sibling::ejs-dropdownlist")
    public WebElement dropdown_OVR_Modalities_Knockout_WinnerofPhase;

    @FindBy(xpath = "//label[text()='Winner of Unit']//following-sibling::ejs-dropdownlist")
    public WebElement dropdown_OVR_Modalities_Knockout_WinnerofUnit;

    @FindBy(xpath = "(//label[contains(text(),'Seed')]//following-sibling::input[@type='text'])[1]")
    public WebElement text_OVR_Modalities_Knockout_Filterby_Seed;

    @FindBy(xpath = "(//label[contains(text(),'Bk Number')]//following-sibling::input[@type='text'])[1]")
    public WebElement text_OVR_Modalities_Knockout_Filterby_BkNumber;

    @FindBy(xpath = "//label[contains(text(),'Rk in Group')]//following-sibling::ejs-multiselect")
    public WebElement dropdown_OVR_Modalities_Knockout_Filterby_RkinGroup;

    @FindBy(xpath = "//button[contains(text(),'Assign Seeds')]")
    public WebElement button_OVR_Modalities_Knockout_Filterby_AssignSeeds;

    @FindBy(xpath = "//b[contains(text(),'Draw')]//following-sibling::input[@type='text']")
    public WebElement text_OVR_Modalities_Knockout_Draw_Draw;

    @FindBy(xpath = "//b[contains(text(),'Draw')]//following-sibling::button[@type='button' and contains(text(),'Add Qualifiers')]")
    public WebElement button_OVR_Modalities_Knockout_Draw_AddQualifiers;

    @FindBy(xpath = "//label[text()=' Add']//parent::div//input[@type='checkbox']")
    public WebElement checkbox_OVR_Modalities_Knockout_Draw_Add;

    @FindBy(xpath = "//label[text()='From Seed']//following-sibling::input[@type='text']")
    public WebElement text_OVR_Modalities_Knockout_Draw_FromSeed;

    @FindBy(xpath = "(//button[text()=' Draw '])[1]")
    public WebElement button_OVR_Modalities_Knockout_Draw_Draw;

    @FindBy(xpath = "//button[contains(text(),'Clear')]")
    public WebElement button_OVR_Modalities_Knockout_Draw_Clear;

    @FindBy(xpath = "//button[contains(text(),'Progression')]")
    public WebElement button_OVR_Modalities_Knockout_Draw_Progression;

    @FindBy(xpath = "//button[contains(text(),'Remove Qualifier')]")
    public WebElement button_OVR_Modalities_Knockout_Draw_RemoveQualifier;

    @FindBy(xpath = "//button[contains(text(),'Brackets Definition')]")
    public WebElement button_OVR_Modalities_Knockout_Draw_BracketsDefinition;

    @FindBy(xpath = "//b[text()='Byes']//following-sibling::button[contains(text(),'Add')]")
    public WebElement button_OVR_Modalities_Knockout_Byes_Add;

    @FindBy(xpath = "//b[text()='Byes']//following-sibling::button[contains(text(),'Delete')]")
    public WebElement button_OVR_Modalities_Knockout_Byes_Delete;

    //sudha


    // MODALITIES MODULE => +button elements

    @FindBy(xpath = "//label[@class='tree_label' and @for='M.SINGLES-----------']")
    public WebElement button_MS_sub_event_Modalities;

    @FindBy(xpath = "//label[@class='tree_label' and @for='W.SINGLES-----------']")
    public WebElement button_WS_subevent_Modalities;

    @FindBy(xpath = "//label[@class='tree_label' and @for='M.DOUBLES-----------']")
    public WebElement button_MD_subevent_Modalities;

    @FindBy(xpath = "//label[@class='tree_label' and @for='W.DOUBLES-----------']")
    public WebElement button_WD_subevent_Modalities;

    //Subevent names

    @FindBy(xpath = "//span[text()=\"Men's Singles\"]")
    public  WebElement text_MS_Subevent;

    @FindBy(xpath = "//span[text()=\"Women's Singles\"]")
    public WebElement text_WS_Subevent;

    @FindBy (xpath = "//span[text()=\"Men's Doubles\"]")
    public WebElement text_MD_Subevent;

    @FindBy (xpath = "//span[text()=\"Women's Doubles\"]")
    public WebElement text_WD_Subevent;

    @FindBy(xpath = "//span[text()=\"Women's Doubles\"]")
    public WebElement text_XD_Subevent;

    //Dropdown Arrow

    @FindBy (xpath = "//span[text()=\"Women's Singles\"]/parent::li/div/a")
    public WebElement button_dropdown_subevent;

    @FindBy (xpath = "//div[@class='dropdown-menu show']//div//a[normalize-space()='Create/Update Phase']")
    public WebElement text_subevent_createPhase;

    @FindBy(xpath = "//div[@class='dropdown-menu show']//div//a[normalize-space()='Create/Update Modality']")
    public WebElement text_subevent_updatemodality;

    @FindBy(xpath = "//div[@class='dropdown-menu show']//div//a[normalize-space()='Load Modality']")
    public WebElement text_subevent_Loadmodality;

    @FindBy(xpath = "//div[@class='dropdown-menu show']//div//a[normalize-space()='Remove Progression']")
    public WebElement text_subevent_Removeprogression;

    @FindBy(xpath = "//div[@class='dropdown-menu show']//div//a[normalize-space()='Pools']")
    public WebElement text_subevent_pools;

    //Event ID-3561
    //MODALITIES MODULE

    @FindBy(xpath = "//a[@class='modality-icon active']")
    public WebElement text_Modalities_module;

    @FindBy(xpath = "//span[text()=\"U15 Boys Singles\"]")
    public WebElement text_BS_U15_subevent;

    @FindBy(xpath = "//span[text()=\"U15 Boys Singles\"]/parent::li/div/a")
    public WebElement button_U15Subevent_dropdown;

    @FindBy(xpath = "//div[@class='dropdown-menu show']//div//a[normalize-space()='Load Modality']")
    public WebElement text_U15Subevent_Loadmodality;

    @FindBy(xpath = "//label[@for='add-edit-loadModality-3-radiobutton-id']")
    public WebElement button_KO16_Bo5;

    @FindBy(xpath = "//label[@for='add-edit-loadModality-4-radiobutton-id']")
    public WebElement button_Ko32_Bo5;

    @FindBy(xpath = "//label[@for='add-edit-loadModality-5-radiobutton-id']")
    public WebElement button_KO64_Bo5;

    @FindBy(xpath = "//label[@for='add-edit-loadModality-12-radiobutton-id']")
    public WebElement button_KO32_Bo7;

    @FindBy(xpath = "//button[normalize-space()='Load Modality']")
    public WebElement button_loadModality;

    @FindBy(xpath = "//label[@class='tree_label' and @for='M.SINGLES--------U15']")
    public WebElement button_sub_event_U15;

    @FindBy(xpath = "//label[@for='M.SINGLES--------U15.8FNL']")
    public WebElement button_U15Subevent_R16;

    @FindBy(xpath = "//span[text()='U15 Boys Singles - Round of 16']/parent::li/p/small/a")
    public WebElement text_drawKO_U15;

    @FindBy(xpath = "//label[normalize-space()='Main Draw']")
    public WebElement button_Maindraw_U15;

    @FindBy(xpath = "//label[normalize-space()='Live Draw']")
    public WebElement button_Livedraw_U15;

    @FindBy(xpath = "//button[text()=' Assign Seeds ']")
    public WebElement button_Assignseeds_U15;

    @FindBy(xpath = "//button[@title='Draw athletes by seed in KO phase']")
    public WebElement button_Draw_U15;

    @FindBy(xpath = "//div[@id='draw_athletes']//button[normalize-space()='Yes']")
    public WebElement button_Yes_Draw_U15;

    @FindBy(xpath = "//div[@id='draw_athletes']//button[normalize-space()='No']")
    public WebElement button_No_draw_U15;

    @FindBy(xpath = "//button[normalize-space()='Add']")
    public WebElement button_Add_byes_U15;

    @FindBy(xpath = "//button[@title='Delete Byes of the Draw']")
    public WebElement button_Delete_byes_U15;

    @FindBy(xpath = "//button[normalize-space()='Publish']")
    public WebElement button_Publish_U15;

    @FindBy(xpath = "//a[normalize-space()='Back']")
    public WebElement button_Back_U15;

    @FindBy(xpath = "//div[@id='update_status']//button[normalize-space()='No']")
    public WebElement button_StartList_U15;

    //sudha end

//load modality

    @FindBy(xpath = "//button[contains(text(),'Load Modality')]")
    public WebElement button_OVR_Modalities_LoadModality_Loadmodality;

    @FindBy(xpath = "//button[contains(text(),'Cancel')]")
    public WebElement button_OVR_Modalities_LoadModality_Cancel;

    @FindBy(xpath = "(//app-confirmation-popup//div[@class='modal-body']//div[contains(@class,'text-center')])[1]")
    public WebElement text_OVR_Modalities_popup_Body;

    @FindBy(xpath = "(//app-confirmation-popup//div[@class='modal-body']//div[contains(@class,'text-center')]//button[contains(text(),'Yes')])[1]")
    public WebElement button_OVR_Modalities_popup_Yes;

    @FindBy(xpath = "(//app-confirmation-popup//div[@class='modal-body']//div[contains(@class,'text-center')]//button[contains(text(),'No')])[1]")
    public WebElement button_OVR_Modalities_popup_No;








}
