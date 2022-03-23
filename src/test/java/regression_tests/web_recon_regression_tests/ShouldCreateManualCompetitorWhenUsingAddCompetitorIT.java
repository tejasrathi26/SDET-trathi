package regression_tests.web_recon_regression_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.FirstLevelNavigation;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.PropertyListPage;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.property_tab.PropertyNavigation;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.property_tab.competitors_tab.CompetitorSettings;

import static org.junit.Assert.assertTrue;

public class ShouldCreateManualCompetitorWhenUsingAddCompetitorIT extends BaseBrowserTest {

    public ShouldCreateManualCompetitorWhenUsingAddCompetitorIT(){
        super("rmpricing");
    }

    @Test
    public void ShouldCreateManualCompetitorWhenUsingAddCompetitorIT() {

        EntrataNavBar entrataNavigation = new EntrataNavBar(driver);
        PropertyListPage propertyList = new PropertyListPage(driver);
        FirstLevelNavigation propertySettingsNavigation = new FirstLevelNavigation(driver);
        PropertyNavigation propertyNavigation = new PropertyNavigation(driver);
        CompetitorSettings competitorSettings = new CompetitorSettings(driver);

        assertTrue("Unable to click Setup button",entrataNavigation.clickSetupButton());
        assertTrue("Unable to click Properties button",entrataNavigation.clickPropertiesButton());
        assertTrue("Unable to select Battlefield Park Apartments", propertyList.clickPropertyBattlefieldPark());
        assertTrue("Unable to click Property tab", propertySettingsNavigation.clickPropertyTab());
        assertTrue("Unable to click Competitors tab", propertyNavigation.clickCompetitorsTab());
        assertTrue("Unable to find Competitor List", competitorSettings.findCompetitorList());
        assertTrue("Unable to find Selected Competitors ", competitorSettings.waitForOverlayAndFindSelectedCompetitors());
        assertTrue("Unable to click Add Competitors button", competitorSettings.clickAddCompetitor());
        assertTrue("Unable to add Competitor Name", competitorSettings.addCompetitorName());
        assertTrue("Unable to add Competitor Address", competitorSettings.addCompetitorAddress());
        assertTrue("Unable to add Competitor City", competitorSettings.addCompetitorCity());
        assertTrue("Unable to click Competitor State dropdown", competitorSettings.clickCompetitorState());
        assertTrue("Unable to click UT in Competitor State dropdown", competitorSettings.clickCompetitorStateUT());
        assertTrue("Unable to add Competitor Zip Code", competitorSettings.addCompetitorZipCode());
        assertTrue("Unable to click add competitor Save button", competitorSettings.clickAddCompetitorSaveButton());
        assertTrue("Unable to find add competitor save message", competitorSettings.findAddCompetitorSaveMessage());

    }

}
