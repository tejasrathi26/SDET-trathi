package page_objects.entrata_page_objects.dashboard_tab.my_dashboard_subtab.residents_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class NotProgressingResidentsSubtab extends BasePage {
    public NotProgressingResidentsSubtab(WebDriver driver) { super(driver); }

    private final By FIRST_NOT_PROGRESSING_ENTRY_CONTACT_DROPDOWN = By.xpath("//div[text()='\n" +
            "Contact']");
    //Contact Options Selectors
    private final By NOT_PROGRESSING_SEND_AN_EMAIL_WHATS_NEXT_OPTION = By.id("follow_up");
    //Overlay Selector
    private final By LOADING_OVERLAY = By.cssSelector("div[class='loading-overlay bg-img-medium']");

    public boolean clickNotProgressingDropdownFirstEntry() {waitForPotentialOverlayNotProgressingSubtab(); return clickElement(FIRST_NOT_PROGRESSING_ENTRY_CONTACT_DROPDOWN);}
    //Contact Options Click Methods
    public boolean clickNotProgressingSendAnEmailWhatsNextOption() {waitForPotentialOverlayNotProgressingSubtab(); return clickElement(NOT_PROGRESSING_SEND_AN_EMAIL_WHATS_NEXT_OPTION);}
    //Overlay Method
    private void waitForPotentialOverlayNotProgressingSubtab() { waitForOverlay(LOADING_OVERLAY);}
}
