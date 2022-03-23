package page_objects.resident_portal_page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class ResidentPortalMakePaymentPage extends BasePage {
    public ResidentPortalMakePaymentPage(WebDriver driver) {super(driver);}

    //Variables
    private final By PAGE_LABEL_TOP_RIGHT_CORNER = By.cssSelector(".egojplo2");

    //Methods

    public boolean makeAPaymentPageLabelUpperRightCorner() { return confirmElementIsVisible(PAGE_LABEL_TOP_RIGHT_CORNER, waitTimes.DEFAULT_WAIT);
    }
}
