package smoke_and_sanity_tests.resident_portal_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.resident_portal_page_objects.ResidentPortalLandingPage;
import page_objects.resident_portal_page_objects.ResidentPortalMakePaymentPage;
import page_objects.resident_portal_page_objects.ResidentPortalPaymentsPage;

import static base_tests.SitesEnum.RESIDENTPORTAL;
import static org.junit.Assert.assertTrue;


public class MakePaymentFromPaymentsModuleIT extends BaseBrowserTest {
    public MakePaymentFromPaymentsModuleIT() {
        super("hogwartz", RESIDENTPORTAL, "kathimack_test.lcl@r.com", "Password1");
    }

    //manual test 3250757

    @Test
    public void ableToAccessMakePaymentFromPaymentModule() {
        ResidentPortalLandingPage landingPage = new ResidentPortalLandingPage(driver);
        assertTrue("Failed to open hamburger 'Main Menu'.", landingPage.clickHamburgerMenu());
        assertTrue("Failed to click on the Payments module in the main menu", landingPage.clickPaymentsFromMainMenu());

        ResidentPortalPaymentsPage paymentsPage = new ResidentPortalPaymentsPage(driver);
        assertTrue("Failed to click on 'Make Payment' button", paymentsPage.clickMakePaymentButton());

        ResidentPortalMakePaymentPage makePaymentPage = new ResidentPortalMakePaymentPage(driver);
        assertTrue("Failed to see page label 'Make a Payment'.", makePaymentPage.makeAPaymentPageLabelUpperRightCorner());
    }


}
