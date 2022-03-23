package page_objects.entrata_page_objects.setup_tab.property_settings_subtab.property_tab.floorplans_and_units;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class FloorPlansAndUnitsNavigation extends BasePage {

    private final By FLOORPLANS_SUBTAB = By.id("property_floorplansxxx");


    public FloorPlansAndUnitsNavigation(WebDriver driver) {
        super(driver);
    }
    public boolean clickFloorplansSubtab() {return clickElement(FLOORPLANS_SUBTAB); }


}

