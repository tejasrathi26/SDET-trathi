package smoke_and_sanity_tests.resident_portal_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;

import page_objects.resident_portal_page_objects.ResidentPortalLandingPage;


import static base_tests.SitesEnum.RESIDENTPORTAL;
import static org.junit.Assert.assertTrue;

public class ResidentPortalLoginTestIT extends BaseBrowserTest {

    public ResidentPortalLoginTestIT() {
        super("hogwartz", RESIDENTPORTAL, "kathimack_test.lcl@r.com", "Password1");
    }


    //manual test 2418682

    @Test
    public void residentPortalLogin() {

        ResidentPortalLandingPage resPortalLanding = new ResidentPortalLandingPage(driver);
        assertTrue("Failed to verify Landing Page in Resident Portal.", resPortalLanding.residentInitialsAreVisibleAtTopRightCorner() );

    }
}
