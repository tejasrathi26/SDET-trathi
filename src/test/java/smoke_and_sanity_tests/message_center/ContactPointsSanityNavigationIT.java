package smoke_and_sanity_tests.message_center;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.FirstLevelNavigation;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.communication_tab.CommunicationNav;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.communication_tab.contact_points.ContactPointsSettingsApplicants;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.communication_tab.contact_points.ContactPointsSettingsLeads;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.communication_tab.contact_points.ContactPointsSettingsRenewalsAndModifications;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.communication_tab.contact_points.ContactPointsSettingsResidents;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.property_tab.general.PropertySetup;

import static junit.framework.Assert.assertTrue;

public class ContactPointsSanityNavigationIT extends BaseBrowserTest {


    public ContactPointsSanityNavigationIT() { super("dittmarcompany"); }

    @Test
    public void shouldDisplayContactPointsCategories_whenInContactPointsSectionsSanityNavigation() {
//2255513 - Verify all the tabs for Contact points email. / 2236178 - To validate user can see default listed events in Renewals & Lease Modification section of contact p

        EntrataNavBar useEntrataNavBar = new EntrataNavBar(driver);
        assertTrue("Unable to navigate to the Company Level Settings!", useEntrataNavBar.clickSetupButton());

        PropertySetup clickingPropertySetup = new PropertySetup(driver);
        assertTrue("Unable to navigate to the property settings page!", useEntrataNavBar.clickPropertiesButton());
        assertTrue("Unable to select the \"Cavalier Court\" Property!", clickingPropertySetup.selectCavalierCourtProperty());

        FirstLevelNavigation firstLevelNavigation = new FirstLevelNavigation(driver);
        assertTrue("Unable to navigate to the Property Communication Settings!", firstLevelNavigation.clickCommunicationTab());

        CommunicationNav communicationNav = new CommunicationNav(driver);
        assertTrue("Failed to find the Contact Points Leads Settings!", communicationNav.clickContactPoints());

        ContactPointsSettingsLeads cPSettingsLeads = new ContactPointsSettingsLeads(driver);
        assertTrue("Unable to locate the 'Status Changes' section of Contact Points>Leads!", cPSettingsLeads.locateStatusChangesContactPointsEvents());
        assertTrue("Unable to locate the 'Quotes' section of Contact Points>Leads!", cPSettingsLeads.locateQuotesContactPointsEvents());
        assertTrue("Unable to locate the 'Appointments' section of Contact Points>Leads!", cPSettingsLeads.locateAppointmentsContactPointsEvents());
        assertTrue("Unable to locate the 'Incoming Contact' section of Contact Points>Leads!", cPSettingsLeads.locateIncomingContactContactPointsEvents());
        assertTrue("Unable to locate the 'Other' section of Contact Points>Leads!", cPSettingsLeads.locateOtherContactPointsEvents());

        ContactPointsSettingsApplicants useContactPointSettingsApplicants = new ContactPointsSettingsApplicants(driver);
        assertTrue("Unable to navigate to the Contact Points Settings>Applicants tab!", useContactPointSettingsApplicants.contactPointsSettingsApplicants());
        assertTrue("Unable to locate the 'Status Changes' section of Contact Points>Applicants!", useContactPointSettingsApplicants.locateStatusChangesContactPointsEventsApplicants());
        assertTrue("Unable to locate the 'Appointments' section of Contact Points>Applicants!", useContactPointSettingsApplicants.locateAppointmentsContactPointsEventsApplicants());
        assertTrue("Unable to locate the 'Incoming Contact' section of Contact Points>Applicants!", useContactPointSettingsApplicants.locateIncomingContactContactPointsEventsApplicants());
        assertTrue("Unable to locate the 'Other' section of Contact Points>Applicants!", useContactPointSettingsApplicants.locateOtherContactPointsEventsApplicants());

        ContactPointsSettingsResidents useContactPointsSettingsResidents = new ContactPointsSettingsResidents(driver);
        assertTrue("Unable to view the Contact Points Residents Settings!", useContactPointsSettingsResidents.contactPointsSettingsResidents());
        assertTrue("Unable to locate the 'Status Changes' section of Contact Points>Residents!", useContactPointsSettingsResidents.locateStatusChangesContactPointsEventsResidents());
        assertTrue("Unable to locate the 'Appointments' section of Contact Points>Residents!", useContactPointsSettingsResidents.locateAppointmentsContactPointsEventsResidents());
        assertTrue("Unable to locate the 'Incoming Contact' section of Contact Points>Residents!", useContactPointsSettingsResidents.locateIncomingContactContactPointsEventsResidents());
        assertTrue("Unable to locate the 'Resident Portal' section of Contact Points>Residents!", useContactPointsSettingsResidents.locateResidentPortalContactPointsEventsResidents());
        assertTrue("Unable to locate the 'Other' section of Contact Points>Residents!", useContactPointsSettingsResidents.locateOtherContactPointsEventsResidents());

//Start of Test Case: 2236178 - To validate user can see default listed events in Renewals & Lease Modification section of contact p
        ContactPointsSettingsRenewalsAndModifications useContactPointsRenewalsAndModifications = new ContactPointsSettingsRenewalsAndModifications(driver);
        assertTrue("Unable to click and view the Contact Points \"Renewals & Lease Modifications\" Settings!", useContactPointsRenewalsAndModifications.contactPointsSettingsRenewalsAndModifications());
        assertTrue("Unable to click and view the Contact Points \"Renewal Lease Start\" in the \"Renewals & Lease Modifications\" section!", useContactPointsRenewalsAndModifications.clickContactPointLeaseRenewalStart());
        assertTrue("Unable to click the \"Close\" button in the \"Renewals & Lease Modifications\" contact point setup section!", useContactPointsRenewalsAndModifications.closeFromContactPointSetupButton());


    }
}
