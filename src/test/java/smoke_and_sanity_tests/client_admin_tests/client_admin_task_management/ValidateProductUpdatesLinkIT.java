package smoke_and_sanity_tests.client_admin_tests.client_admin_task_management;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.help_icon.ContactSupportPopup;
import page_objects.entrata_page_objects.help_icon.ProductUpdatesPage;

import static org.junit.Assert.assertTrue;

public class ValidateProductUpdatesLinkIT extends BaseBrowserTest {
    public ValidateProductUpdatesLinkIT(){
        super("avantic");
    }
    @Test
    public void shouldValidateProductUpdatesLink_whenLinkIsClicked(){
        EntrataNavBar nav = new EntrataNavBar(driver);
        ProductUpdatesPage productUpdatesPage = new ProductUpdatesPage(driver);
        ContactSupportPopup contactSupportPopup = new ContactSupportPopup(driver);
        assertTrue("unable to click help icon",nav.clickHelp());
        assertTrue("unable to click product updates",nav.clickProductUpdates());
        assertTrue("unable to click calendar tab", productUpdatesPage.clickCalendar());
        assertTrue("unable to click Coming Soon tab", productUpdatesPage.clickComingSoon());
        assertTrue("unable to find release dropdown", productUpdatesPage.findUpcomingReleaseDropdown());
        assertTrue("unable to click past updates tab", productUpdatesPage.clickPastUpdates());
        assertTrue("unable to find all updates tab", productUpdatesPage.findAllUpdatesTab());
        assertTrue("unable to find release note quick search", productUpdatesPage.findReleaseNotesSearch());
        assertTrue("unable to click contact support", productUpdatesPage.clickContactSupport());
        assertTrue("unable to find subject line field",contactSupportPopup.findSubjectLine());


    }
}
