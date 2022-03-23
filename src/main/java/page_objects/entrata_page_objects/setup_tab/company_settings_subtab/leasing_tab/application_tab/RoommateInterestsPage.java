package page_objects.entrata_page_objects.setup_tab.company_settings_subtab.leasing_tab.application_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;
import utils.RandomGenerator;

public class RoommateInterestsPage extends BasePage {

    public RoommateInterestsPage(WebDriver driver){
        super(driver);}
    RandomGenerator randomGenerator = new RandomGenerator();

    private final By ADD_QUESTION = By.linkText("Add Question");
    private final By QUESTION_TYPE_DROPDOWN = By.cssSelector("select[name = 'roommate_interest[roommate_interest_category_id]']");
    private final By CANCEL_BUTTON = By.linkText("Cancel");
    private final By INTEREST_QUESTION_TITLE= By.cssSelector("input[name='roommate_interest[question]']");
    private final By SINGLE_SELECT_RADIO_BUTTON = By.cssSelector("#input_type_1");
    private final By OPTION_ONE = By.id("roommate_inerest_option");
    private final By SAVE_BUTTON = By.cssSelector("input[value='Save']");
    private final String RANDOM_NAME = randomGenerator.randomName();
    private final String FORMAT_ONE = String.format("//*[contains(text(), '%s')]",RANDOM_NAME);
    private final By SUCCESS_MESSAGE= By.cssSelector("p[class = 'alert success slim']");
    private final By ADDED_QUESTION = By.xpath(FORMAT_ONE);


    public boolean clickAddQuestion(){return clickElement(ADD_QUESTION);}
    public boolean confirmVisibilityOfQuestionTypeDropdown(){return confirmElementIsVisible(QUESTION_TYPE_DROPDOWN);}
    public boolean selectPersonalityQuestionType(){return selectElementByValue(QUESTION_TYPE_DROPDOWN,"4");}
    public boolean enterInterestQuestionTitle(){return sendKeysToElement(INTEREST_QUESTION_TITLE,RANDOM_NAME);}
    public boolean clickSingleSelectButton(){return clickElement(SINGLE_SELECT_RADIO_BUTTON);}
    public boolean clickCancelButton(){return clickElement(CANCEL_BUTTON);}
    public boolean enterOptionOne(){return sendKeysToElement(OPTION_ONE,randomGenerator.randomName());}
    public boolean clickSaveButton(){return clickElement(SAVE_BUTTON);}
    public String checkSuccessMessage(){return getElementText(SUCCESS_MESSAGE);}
    public boolean checkAddedQuestion(){
        scrollDownToBottomOfPage();
        return confirmElementIsVisible(ADDED_QUESTION);}
}
