package page_objects.entrata_page_objects.residents_tab.all_residents_subtab.resident_profile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class FinancialMoveOutPage extends BasePage {
    public FinancialMoveOutPage(WebDriver driver){
        super(driver);}
    private final By MOVE_OUT_REASON_DROPDOWN = By.id("move_out_reason_list_item_id");

    public boolean confirmMoveOutReasonDropdown(){return confirmElementIsVisible(MOVE_OUT_REASON_DROPDOWN);}
}
