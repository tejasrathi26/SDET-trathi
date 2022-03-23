package page_objects.entrata_page_objects.setup_tab.property_settings_subtab.property_tab.competitors_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class CompetitorSettings extends BasePage {

    public CompetitorSettings(WebDriver driver) {
        super(driver);
    }

    private final By COMPETITOR_SETTINGS_OVERLAY = By.cssSelector(".loading-overlay.bg-img-medium");
    private final By COMPETITORS_SELECTED_COMPETITORS = By.cssSelector(".valign-middle.text-707070.font12.align-left");
    private final By COMPETITORS_COMPETITOR_LIST = By.cssSelector(".margin5-top.left.competitor_list_label");
    private final By ADD_COMPETITOR_BUTTON = By.cssSelector(".test.button.action.add_competitor.width-auto i.add");
    private final By COMPETITOR_NAME_FIELD = By.id("property_competitors[property_name]");
    private final By COMPETITOR_ADDRESS_FIELD = By.id("property_competitors[street_line1]");
    private final By COMPETITOR_CITY_FIELD = By.id("property_competitors[city]");
    private final By COMPETITOR_STATE_DROPDOWN = By.id("property_competitors[state]");
    private final By COMPETITOR_STATE_DROPDOWN_UTAH = By.xpath("//select//option[text()='UT']");
    private final By COMPETITOR_ZIP_CODE_FIELD = By.id("property_competitors[postal_code]");
    private final By ADD_COMPETITOR_SAVE_BUTTON = By.cssSelector(".form-submit");
    private final By COMPETITOR_SAVED_MESSAGE = By.xpath("//*[contains(text(), 'Competitor data added Successfully.')]");


    private void competitorSettingsOverlay() { waitForOverlay(COMPETITOR_SETTINGS_OVERLAY);}

    public boolean waitForOverlayAndFindSelectedCompetitors() {
        competitorSettingsOverlay();
        return confirmElementIsVisible(COMPETITORS_SELECTED_COMPETITORS);
    }

    public boolean findCompetitorList() { return confirmElementIsVisible(COMPETITORS_COMPETITOR_LIST, waitTimes.LONG_WAIT); }

    public boolean clickAddCompetitor() {
        maximizeWindow();
        return clickElement(ADD_COMPETITOR_BUTTON);
    }

    public boolean addCompetitorName() { return sendKeysToElement(COMPETITOR_NAME_FIELD, "The Place"); }

    public boolean addCompetitorAddress() { return sendKeysToElement(COMPETITOR_ADDRESS_FIELD, "12 Center Street"); }

    public boolean addCompetitorCity() { return sendKeysToElement(COMPETITOR_CITY_FIELD, "Provo"); }

    public boolean clickCompetitorState() { return clickElement(COMPETITOR_STATE_DROPDOWN); }

    public boolean clickCompetitorStateUT() { return clickElement(COMPETITOR_STATE_DROPDOWN_UTAH); }

    public boolean addCompetitorZipCode() { return sendKeysToElement(COMPETITOR_ZIP_CODE_FIELD, "84663"); }

    public boolean clickAddCompetitorSaveButton() { return clickElement(ADD_COMPETITOR_SAVE_BUTTON); }

    public boolean findAddCompetitorSaveMessage() { return confirmElementIsVisible(COMPETITOR_SAVED_MESSAGE); }

}
