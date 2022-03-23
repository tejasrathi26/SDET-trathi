package smoke_and_sanity_tests.entrata_pricing;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.dashboard_tab.pricing_subtab.PricingDashboard;

import static org.junit.Assert.assertTrue;

public class ShouldLoadPricingDashboardWhenSelectedSmokeIT extends BaseBrowserTest {

    public ShouldLoadPricingDashboardWhenSelectedSmokeIT() { super("rmpricing");}

    @Test
    public void ShouldLoadPricingDashboardWhenSelectedSmokeIT() {

        EntrataNavBar nav = new EntrataNavBar(driver);
        PricingDashboard pd = new PricingDashboard(driver);

        assertTrue("Unable to click Pricing", nav.clickPricingTab());
        assertTrue("Unable to click Pricing filters", pd.clickFilters());
        assertTrue("Unable to click Clear Properties", pd.clickClearProperties());
        assertTrue("Unable to click Add Properties", pd.clickAddProperties());
        assertTrue("Unable to click add 'Second Property'", pd.clickAddPropertyName());
        assertTrue("Unable to click Unit Status", pd.clickUnitStatusDropdown());
        assertTrue("Unable to click All Available in Unit Status", pd.clickUnitStatusAllAvailable());
        assertTrue("Unable to click Publish Status", pd.clickPublishStatusDropdown());
        assertTrue("Unable to click all in Publish Status", pd.clickPublishStatusAll());
        assertTrue("Unable to click Save button", pd.clickSaveFiltersButton());
        assertTrue("Unable to find property on Pricing dashboard", pd.findPricingDashboardPropertyName());

    }

}
