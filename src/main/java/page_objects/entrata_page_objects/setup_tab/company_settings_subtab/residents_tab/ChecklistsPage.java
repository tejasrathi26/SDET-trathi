package page_objects.entrata_page_objects.setup_tab.company_settings_subtab.residents_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;
import utils.RandomGenerator;

public class ChecklistsPage extends BasePage {
    public ChecklistsPage(WebDriver driver) {super(driver);}{ }
    RandomGenerator randomGenerator = new RandomGenerator();

    private final By CHECKLIST_TAB = By.xpath("//*[@id=\"li_nav_residents_checklists_setupxxx\"]");
    private final By ADD_CHECKLIST = By.linkText("Add Checklist");
    private final By CHECKLIST_NAME_FIELD = By.cssSelector("input[name='checklist[name]']");
    private final By OVERLAY = By.className("loading-overlay");
    private final By CHECKLIST_TYPE_DROPDOWN = By.id("checklist_triggers");
    private final By DESCRIPTION_FIELD = By.cssSelector("input[name = 'checklist[description]']");
    private final By STUDENT_OCCUPANCY_CHECKBOX = By.id("occupancy_types_ids_10");
    private final By TASK_TITLE = By.cssSelector("input[name = 'checklist_items[0][item_title]']");
    private final By ACTION_DROPDOWN = By.id("checklist_items_checklist_item_type_id_0");
    private final By SAVE_BUTTON = By.id("requirement_submit");
    private final By SUCCESS_MESSAGE = By.cssSelector("p[class='alert success slim']");
    private final String CHECKLIST_NAME = randomGenerator.randomName();
    private final String SELECTOR_FORMAT = String.format("//*[contains(text(), '%s')]",CHECKLIST_NAME);
    private final By ADDED_CHECKLIST = By.xpath(SELECTOR_FORMAT);



    public boolean clickChecklistTab(){waitForOverlay(OVERLAY); return clickElement(CHECKLIST_TAB);}
    public boolean clickAddChecklist(){return clickElement(ADD_CHECKLIST);}
    public boolean verifyNameFieldIsVisible(){return confirmElementIsVisible(CHECKLIST_NAME_FIELD);}
    public boolean enterChecklistName(){return sendKeysToElement(CHECKLIST_NAME_FIELD,CHECKLIST_NAME);}
    public boolean selectMoveInChecklistType(){return selectElementByValue(CHECKLIST_TYPE_DROPDOWN,"5");}
    public boolean enterChecklistDescription(){return sendKeysToElement(DESCRIPTION_FIELD,randomGenerator.randomName());}
    public boolean clickStudentOccupancy(){return clickElement(STUDENT_OCCUPANCY_CHECKBOX);}
    public boolean enterTaskTitle(){return sendKeysToElement(TASK_TITLE,randomGenerator.randomName());}
    public boolean selectWrittenResponseAction(){return selectElementByValue(ACTION_DROPDOWN,"3");}
    public boolean clickSaveButton(){return clickElement(SAVE_BUTTON);}
    public String checkSuccessMessage(){return getElementText(SUCCESS_MESSAGE);}
    public boolean confirmAddedChecklist(){return confirmElementIsVisible(ADDED_CHECKLIST);}
}
