package page_objects.entrata_page_objects.tools_tab.reputation_subtab.google_Q_A_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class AnsweredSubtab extends BasePage {

    //Constructor
    public AnsweredSubtab(WebDriver driver) {
        super(driver);
    }

    //Answered Sub-tab Locator
    private final By ANSWERED_SUB_TAB_LOCATOR = By.id("answered");

    //Unanswered tab should load by default.
    private final By ANSWERED_PROPERTY_FILTER = By.className("selector-body");

    //Unanswered tab Filters by Past Locators
    private final By ANSWERED_SEVEN_DAYS_FILTER = By.cssSelector("li[val='7 days']");
    private final By ANSWERED_THIRTY_DAYS_FILTER = By.cssSelector("li[val='30 days']");
    private final By ANSWERED_NINETY_DAYS_FILTER = By.cssSelector("li[val='90 days']");
    private final By ANSWERED_SIX_MONTHS_FILTER = By.cssSelector("li[val='180 days']");
    private final By ANSWERED_ONE_YEAR_FILTER = By.cssSelector("li[val='365 days']");
    private final By ANSWERED_ALL_FILTER = By.cssSelector("li[val='all']");

    //METHODS
    public boolean selectAnsweredSubtabInGoogleQATab() {
        return clickElement(ANSWERED_SUB_TAB_LOCATOR);
    }

    //Property Filter Methods
    public boolean findPropertyFilterInAnsweredSubTab() {
        return confirmElementIsVisible(ANSWERED_PROPERTY_FILTER);
    }

    //Past Filter Methods
    public boolean findSevenDayFilterInAnsweredSubTab() {
        return confirmElementIsVisible(ANSWERED_SEVEN_DAYS_FILTER);
    }

    public boolean findThirtyDayFilterInAnsweredSubTab() {
        return confirmElementIsVisible(ANSWERED_THIRTY_DAYS_FILTER);
    }

    public boolean findNinetyDayFilterInAnsweredSubTab() {
        return confirmElementIsVisible(ANSWERED_NINETY_DAYS_FILTER);
    }

    public boolean findSixMonthFilterInAnsweredSubTab() {
        return confirmElementIsVisible(ANSWERED_SIX_MONTHS_FILTER);
    }

    public boolean findOneYearFilterInAnsweredSubTab() {
        return confirmElementIsVisible(ANSWERED_ONE_YEAR_FILTER);
    }

    public boolean findAllFilterInAnsweredSubTab() {
        return confirmElementIsVisible(ANSWERED_ALL_FILTER);
    }

}
