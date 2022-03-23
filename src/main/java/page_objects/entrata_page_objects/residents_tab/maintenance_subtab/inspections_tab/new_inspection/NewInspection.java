package page_objects.entrata_page_objects.residents_tab.maintenance_subtab.inspections_tab.new_inspection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class NewInspection extends BasePage {

    private final By MODAL_INSPECTION_CONTAINER = By.id("modal_container0");
    private final By INSPECTION_STATUS_BOX = By.xpath("//*[@id=\"start-inspection-container\"]/div/div[1]");
    private final By SIGN_HERE_BUTTON = By.cssSelector("a[onclick*='Sign this Inspection']");
    private final By SIGN_THIS_INSPECTION_POPUP = By.id("small_modal");
    private final By CLOSE_NOT_STARTED_AND_IN_PROGRESS_INSPECTION_BUTTON = By.cssSelector("body > div.modal-large.responsive-large-dialog > div.modal-head > div.header-action-icons > i");

    public NewInspection(WebDriver driver) {
        super(driver);
    }

    public boolean clickCloseInspectionButton() { return clickElement(CLOSE_NOT_STARTED_AND_IN_PROGRESS_INSPECTION_BUTTON); }

    public boolean verifyNewInspectionHasBeenStarted(){
        return confirmElementIsVisible(MODAL_INSPECTION_CONTAINER);
    }

    public boolean verifyInspectionHasNotStartedStatus() { return confirmElementContainsText(INSPECTION_STATUS_BOX, "Not Started"); }

    public boolean clickSignHere() { return clickElement(SIGN_HERE_BUTTON); }

    public boolean confirmSignThisInspectionPopUpAppears() { return confirmElementIsVisible(SIGN_THIS_INSPECTION_POPUP); }

}