package smoke_and_sanity_tests.client_admin_tests.client_admin_task_management;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.help_icon.ContactSupportPopup;
import page_objects.entrata_page_objects.help_icon.TicketsPage;

import static org.junit.Assert.assertTrue;

public class Validate_Tickets_Link_In_EntrataIT extends BaseBrowserTest {
    public Validate_Tickets_Link_In_EntrataIT(){
        super("avantic");
    }

    @Test
    public void shouldCheckTicketsLinkInEntrata_whenClickedOn(){
        EntrataNavBar nav = new EntrataNavBar(driver);
        TicketsPage ticketsPage = new TicketsPage(driver);
        assertTrue("unable to click help icon",nav.clickHelp());
        assertTrue("unable to click tickets link",nav.clickTicketsLink());
        assertTrue("unable to click active tab", ticketsPage.clickActiveTab());
        assertTrue("unable to click verification required tab", ticketsPage.clickVerificationRequiredTab());
        assertTrue("unable to click resolved tab", ticketsPage.clickResolvedTab());
        assertTrue("unable to click inbox tab", ticketsPage.clickInboxTab());
        assertTrue("unable to click contact support", ticketsPage.clickContactSupport());

    }
    @Test
    public void shouldCheckCreateTicketLink_whenClickedOn(){
        EntrataNavBar nav = new EntrataNavBar(driver);
        ContactSupportPopup contactSupportPopup = new ContactSupportPopup(driver);
        assertTrue("unable to click help icon",nav.clickHelp());
        assertTrue("unable to click create a support ticket",nav.clickCreateASupportTicket());
        assertTrue("unable to find subject line", contactSupportPopup.findSubjectLine());

    }
}
