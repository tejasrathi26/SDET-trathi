package smoke_and_sanity_tests.entrata_pricing.web_recon;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.FirstLevelNavigation;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.PropertyListPage;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.property_tab.PropertyNavigation;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.property_tab.competitors_tab.CompetitorSettings;

import static org.junit.Assert.assertTrue;

public class ShouldVerifyCompetitorSettingsWhenUsingPropertySettingsNavigationIT extends BaseBrowserTest {

    public ShouldVerifyCompetitorSettingsWhenUsingPropertySettingsNavigationIT() { super("rmpricing");}

    @Test
    public void ShouldVerifyCompetitorSettingsWhenUsingPropertySettingsNavigationIT() {

        EntrataNavBar entrataNavigation = new EntrataNavBar(driver);
        PropertyListPage propertyList = new PropertyListPage(driver);
        FirstLevelNavigation propertySettings = new FirstLevelNavigation(driver);
        PropertyNavigation propertyNavigation = new PropertyNavigation(driver);
        CompetitorSettings competitorSettings = new CompetitorSettings(driver);

        assertTrue("Unable to click Setup button",entrataNavigation.clickSetupButton());
        assertTrue("Unable to click Properties button",entrataNavigation.clickPropertiesButton());
        assertTrue("Unable to select Battlefield Park Apartments", propertyList.clickPropertyBattlefieldPark());
        assertTrue("Unable to click Property tab", propertySettings.clickPropertyTab());
        assertTrue("Unable to click Competitors tab", propertyNavigation.clickCompetitorsTab());
        assertTrue("Unable to find Competitor List", competitorSettings.findCompetitorList());
        assertTrue("Unable to find Selected Competitors ", competitorSettings.waitForOverlayAndFindSelectedCompetitors());

    }


}
