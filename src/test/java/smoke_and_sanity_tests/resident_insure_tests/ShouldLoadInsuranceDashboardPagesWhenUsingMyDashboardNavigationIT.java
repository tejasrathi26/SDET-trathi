package smoke_and_sanity_tests.resident_insure_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.dashboard_tab.my_dashboard_subtab.MyDashboardNav;
import page_objects.entrata_page_objects.dashboard_tab.my_dashboard_subtab.residents_tab.InsuranceSubTab;

import static org.junit.Assert.assertTrue;

public class ShouldLoadInsuranceDashboardPagesWhenUsingMyDashboardNavigationIT extends BaseBrowserTest {

    public ShouldLoadInsuranceDashboardPagesWhenUsingMyDashboardNavigationIT() { super("ri");}

    @Test
    public void ShouldLoadInsuranceDashboardPagesWhenUsingMyDashboardNavigationIT() {

        MyDashboardNav myDashboardNav = new MyDashboardNav(driver);
        InsuranceSubTab insuranceSubTab = new InsuranceSubTab(driver);

        assertTrue("Unable to click Residents tab",myDashboardNav.clickResidentsTab());
        assertTrue("Unable to click Insurance tab",myDashboardNav.clickInsuranceTab());
        assertTrue("Unable to click Add/Update tab", insuranceSubTab.clickAddUpdate());
        assertTrue("Unable to find Add/Update page", insuranceSubTab.findAddUpdatePage());
        assertTrue("Unable to click Verify tab", insuranceSubTab.clickVerify());
        assertTrue("Unable to find Verify page", insuranceSubTab.findVerifyPage());
        assertTrue("Unable to click Match tab", insuranceSubTab.clickMatch());
        assertTrue("Unable to find Match page", insuranceSubTab.findMatchPage());
        assertTrue("Unable to click Expiring Soon tab", insuranceSubTab.clickExpiringSoon());
        assertTrue("Unable to find Expiring Soon page", insuranceSubTab.findExpiringSoonPage());

    }

}
