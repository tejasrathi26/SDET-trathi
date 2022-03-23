package page_objects.entrata_page_objects.residents_tab.charges_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class PostRecurringChargesPage extends BasePage {
    public PostRecurringChargesPage(WebDriver driver){
        super(driver);}

    private final By APPLY_BUTTON = By.cssSelector("a[onclick='changeDate()']");

    public boolean verifyApplyButtonPresent() {return confirmElementIsVisible(APPLY_BUTTON,waitTimes.LONG_WAIT);}
}
