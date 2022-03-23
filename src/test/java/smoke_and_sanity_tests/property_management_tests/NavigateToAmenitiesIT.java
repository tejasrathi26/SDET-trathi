package smoke_and_sanity_tests.property_management_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.pricing_tab.amenities.AmenitiesNavigation;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.FirstLevelNavigation;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.PropertyListPage;
import static org.junit.Assert.assertTrue;

public class NavigateToAmenitiesIT extends BaseBrowserTest {

    public NavigateToAmenitiesIT() {
        super("avantic");
    }

    @Test //Test Case #2251249 (stop at "property" amenities subtab)
    public void shouldNavigateToAmenities_whenTabsAreClicked() {

        EntrataNavBar navBar = new EntrataNavBar(driver);
        assertTrue("failed to click setup tab", navBar.clickSetupButton());
        assertTrue("failed to select property", navBar.clickPropertiesButton());

        PropertyListPage propList = new PropertyListPage(driver);
        assertTrue("failed to select property", propList.selectFirstPropertyFromList());

        FirstLevelNavigation propNav = new FirstLevelNavigation(driver);
        assertTrue("failed to click pricing tab", propNav.clickPricingTab());

        AmenitiesNavigation amenNav = new AmenitiesNavigation(driver);
        assertTrue("failed to click amenities subtab",amenNav.clickPropertyPricingAmenitiesTab());
        assertTrue("failed to click property amenities tab", amenNav.clickPropertyAmenitiesTab());
    }
}

