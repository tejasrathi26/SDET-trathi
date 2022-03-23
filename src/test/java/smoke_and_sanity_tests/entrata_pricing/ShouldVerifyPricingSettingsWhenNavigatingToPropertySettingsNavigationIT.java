package smoke_and_sanity_tests.entrata_pricing;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.FirstLevelNavigation;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.PropertyListPage;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.pricing_tab.PricingNav;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.pricing_tab.optimization_subtab.OptimizationNav;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.pricing_tab.optimization_subtab.definition_subtab.DefinitionSettings;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.pricing_tab.optimization_subtab.influencers_subtab.InfluencersSettings;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.pricing_tab.optimization_subtab.operations_subtab.OperationsSettings;

import static org.junit.Assert.assertTrue;

public class ShouldVerifyPricingSettingsWhenNavigatingToPropertySettingsNavigationIT extends BaseBrowserTest {

    public ShouldVerifyPricingSettingsWhenNavigatingToPropertySettingsNavigationIT() { super("rmpricing");}

    @Test
    public void ShouldVerifyPricingSettingsWhenNavigatingToPropertySettingsNavigationIT() {

        EntrataNavBar entrataNavigation = new EntrataNavBar(driver);
        PropertyListPage propertyList = new PropertyListPage(driver);
        FirstLevelNavigation propertySettings = new FirstLevelNavigation(driver);
        PricingNav pricingNavigation = new PricingNav(driver);
        OptimizationNav optimizationNavigation = new OptimizationNav(driver);
        InfluencersSettings influencersSettings = new InfluencersSettings(driver);
        OperationsSettings operationsSettings = new OperationsSettings(driver);
        DefinitionSettings definitionSettings = new DefinitionSettings(driver);

        assertTrue("Unable to click Setup button",entrataNavigation.clickSetupButton());
        assertTrue("Unable to click Properties button",entrataNavigation.clickPropertiesButton());
        assertTrue("Unable to select Battlefield Park Apartments", propertyList.clickPropertyBattlefieldPark());
        assertTrue("Unable to click Pricing tab", propertySettings.clickPricingTab());
        assertTrue("Unable to click Optimization tab", pricingNavigation.clickOptimizationTab());
        assertTrue("Unable to click Influencers tab", optimizationNavigation.clickInfluencersTab());
        assertTrue("Unable to find Edit Rent Constraints", influencersSettings.findEditRentConstraints());
        assertTrue("Unable to find Edit Expiration Management", influencersSettings.findEditExpirationButton());
        assertTrue("Unable to find Edit Sustainable Occupancy", influencersSettings.findEditSustainableOccupancyButton());
        assertTrue("Unable to find Edit Anchor Rent", influencersSettings.findEditAnchorRentButton());
        assertTrue("Unable to find Edit Analytics", influencersSettings.findEditAnalyticsButton());
        assertTrue("Unable to click Operations tab", optimizationNavigation.clickOperationsTab());
        assertTrue("Unable to find Edit Reason Codes", operationsSettings.findEditReasonCodes());
        assertTrue("Unable to find Edit Publishing Constraints", operationsSettings.findEditPublishingConstraints());
        assertTrue("Unable to find Edit Optimization", operationsSettings.findEditOptimization());
        assertTrue("Unable to click Definition tab", optimizationNavigation.clickDefinitionTab());
        assertTrue("Unable to find Edit Pricing", definitionSettings.findEditPricing());

    }

}
