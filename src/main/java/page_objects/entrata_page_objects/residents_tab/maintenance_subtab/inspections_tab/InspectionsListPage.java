package page_objects.entrata_page_objects.residents_tab.maintenance_subtab.inspections_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;


public class InspectionsListPage extends BasePage {

    private final By INSPECTIONS_TAB = By.cssSelector("a[href*='/?module=inspections'");
    private final By INSPECTIONS_LISTINGS = By.id("inspection_listing");
    private final By INSPECTIONS_TAB_OVERLAY = By.xpath("//*[@id=\"body\"]/div[1]");
    private final By ASSIGN_BTN = By.id("assign_inspection_button");
    private final By ASSIGN_INSPECTION_DROP_DOWN_LIST = By.id("assign_bulk_inspected_by");
    private final By SAVE_BUTTON_ASSIGN_INSPECTION = By.xpath("//*[@id=\"assign_inspection_form\"]/fieldset/div[2]/div/input");
    private final By INSPECTIONS_MODAL = By.id("div-view-listing");
    private final By FIRST_INSPECTIONS_LISTING = By.xpath("//*[@id=\"property-1\"]/tr[1]");
    private final By VIEW_ALL_INSPECTIONS = By.id("view_inspections");


    public InspectionsListPage(WebDriver driver) {
        super(driver);
    }

    public boolean confirmViewAllInspectionsExists() { return confirmElementIsVisible(VIEW_ALL_INSPECTIONS); }

    public boolean clickFirstInspection() { return clickElement(FIRST_INSPECTIONS_LISTING); }

    public boolean confirmSuccessMessage() { return confirmElementContainsText(INSPECTIONS_MODAL, " inspection(s) assigned/updated "); }

    public boolean clickSaveButtonFromAssignInspection() { return clickElement(SAVE_BUTTON_ASSIGN_INSPECTION); }

    public boolean selectGaneshD1FromAssignableDropDown() { return selectElementByIndex(ASSIGN_INSPECTION_DROP_DOWN_LIST,1); }

    public boolean clickAssignBtn() { return clickElement(ASSIGN_BTN); }

    public boolean clickInspectionsTab() { return clickElement(INSPECTIONS_TAB); }

    public boolean waitForInspectionsOverlay() {
        waitForOverlay(INSPECTIONS_TAB_OVERLAY);
        return confirmElementIsVisible(INSPECTIONS_LISTINGS);}

}