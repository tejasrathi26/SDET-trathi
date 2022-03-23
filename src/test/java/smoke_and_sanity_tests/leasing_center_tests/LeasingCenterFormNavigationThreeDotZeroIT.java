package smoke_and_sanity_tests.leasing_center_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.dashboard_tab.leasing_center_subtab.LeadForm;
import page_objects.entrata_page_objects.dashboard_tab.leasing_center_subtab.OtherForm;
import page_objects.entrata_page_objects.dashboard_tab.leasing_center_subtab.ResidentForm;
import page_objects.entrata_page_objects.dashboard_tab.leasing_center_subtab.WorkOrderForm;

import static org.junit.Assert.assertTrue;

public class LeasingCenterFormNavigationThreeDotZeroIT extends BaseBrowserTest {


    public LeasingCenterFormNavigationThreeDotZeroIT() {
        super("village");
    }

    @Test
    public void VerifyLeasingCenterFormsNavigationAndLoadingOfExpectedData() { //Test Case ID: 2230403
        EntrataNavBar dashboardNav = new EntrataNavBar(driver);
        assertTrue("Failed to click on Leasing Center Tab",dashboardNav.clickLeasingCenterTab());
        LeadForm leadTab = new LeadForm(driver);
        assertTrue("Failed to find Lead Form", leadTab.findLeadForm());
        assertTrue("Failed to click on Form Selector Dropdown", leadTab.clickFormSelectorDropdown());
        assertTrue("Failed to find Work Order Tab Dropdown", leadTab.findWorkOrderTab());
        assertTrue("Failed to find Resident Tab Dropdown", leadTab.findResidentTab());
        assertTrue("Failed to find Other Tab Dropdown", leadTab.findOtherTab());
        assertTrue("Failed to find Guest Card Details", leadTab.findGuestCardDetails());
        assertTrue("Failed to find Required Info Tab", leadTab.findRequiredInfoTab());
        assertTrue("Failed to find Floor Plans And Units Tab", leadTab.findFloorPlansAndUnitsTab());
        assertTrue("Failed to find Benefit Selling Tab", leadTab.findBenefitSellingTab());
        assertTrue("Failed to find Qualifications Tab", leadTab.findQualificationsTab());
        assertTrue("Failed to find Appointment Tab", leadTab.findAppointmentTab());
        assertTrue("Failed to find Additional Notes Tab", leadTab.findAdditionalNotesTab());
        assertTrue("Failed to find Reset Form Link", leadTab.findResetFormLink());
        assertTrue("Failed to find Property Selector Dropdown", leadTab.findPropertySelectorDropdown());
        assertTrue("Failed to find Reset Form Link", leadTab.findResetFormLink());
        assertTrue("Failed to find Property Selector Dropdown", leadTab.findPropertySelectorDropdown());
        assertTrue("Failed to find Property Details", leadTab.findPropertyDetails());
        assertTrue("Failed to find Greetings", leadTab.findGreetings());
        assertTrue("Failed to find Benefit Selling", leadTab.findBenefitSelling());
        assertTrue("Failed to find Qualification Requirements And Policies", leadTab.findQualificationRequirementsAndPolicies());
        assertTrue("Failed to find Amenities", leadTab.findAmenities());
        assertTrue("Failed to find Utilities", leadTab.findUtilities());
        assertTrue("Failed to find Lead Activity ( If Existing Lead )", leadTab.findLeadActivityIfExistingLead());
        assertTrue("Failed to find General information", leadTab.findGeneralInformation());
        assertTrue("Failed to find Contact Information", leadTab.findContactInformation());
        assertTrue("Failed to find Hours", leadTab.findHours());
        assertTrue("Failed to find Property Customization", leadTab.findPropertyCustomization());
        assertTrue("Failed to click on Form Selector Dropdown", leadTab.clickFormSelectorDropdown());
        WorkOrderForm workOrderTab = new WorkOrderForm(driver);
        assertTrue("Failed to click on Work Order Tab Dropdown", workOrderTab.clickWorkOrderTabDropdown());
        assertTrue("Failed to find Work Order Details", workOrderTab.findWorkOrderDetails());
        assertTrue("Failed to find Resident Info Tab", workOrderTab.findResidentInfoTab());
        assertTrue("Failed to find Add Work Order Tab", workOrderTab.findAddWorkOrderTab());
        assertTrue("Failed to find Edit Existing Work Order Tab", workOrderTab.findEditExistingWorkOrderTab());
        assertTrue("Failed to find Additional Info Tab", workOrderTab.findAdditionalInfoTab());
        assertTrue("Failed to find Property Selector Dropdown in Work Order Tab", leadTab.findPropertySelectorDropdown());
        assertTrue("Failed to find Property Details in Work Order Tab", workOrderTab.findPropertyDetailsInWorkOrderTab());
        assertTrue("Failed to find Greetings in Work Order Tab", leadTab.findGreetings());
        assertTrue("Failed to find Maintenance and Emergency Protocol", workOrderTab.findMaintenanceAndEmergencyProtocol());
        assertTrue("Failed to find Work Order History", workOrderTab.findWorkOrderHistory());
        assertTrue("Failed to find Call History", workOrderTab.findCallHistory());
        assertTrue("Failed to find General information", leadTab.findGeneralInformation());
        assertTrue("Failed to find Contact Information", leadTab.findContactInformation());
        assertTrue("Failed to find Hours", leadTab.findHours());
        assertTrue("Failed to find Property Customization", leadTab.findPropertyCustomization());
        assertTrue("Failed to click on Form Selector Dropdown", leadTab.clickFormSelectorDropdown());
        ResidentForm residentTab = new ResidentForm(driver);
        assertTrue("Failed to click on Resident Form Dropdown", residentTab.clickResidentTabDropdown());
        assertTrue("Failed to find Resident Details", residentTab.findResidentDetails());
        assertTrue("Failed to find Resident Info Tab", residentTab.findResidentResidentInfoTab());
        assertTrue("Failed to find Submit Message Tab", residentTab.findResidentSubmitMessageTab());
        assertTrue("Failed to find Property Selector Dropdown",leadTab.findPropertySelectorDropdown());
        assertTrue("Failed to find Property Details in Resident Tab", workOrderTab.findPropertyDetailsInWorkOrderTab());
        assertTrue("Failed to find Resident Complaint Issue Protocol", residentTab.findResidentComplaintIssueProtocol());
        assertTrue("Failed to find Resident Activity in Residents Tab", residentTab.findResidentActivity());
        assertTrue("Failed to find Resident Payment Information", residentTab.findResidentPaymentInformation());
        assertTrue("Failed to find General information", leadTab.findGeneralInformation());
        assertTrue("Failed to find Contact Information", leadTab.findContactInformation());
        assertTrue("Failed to find Hours", leadTab.findHours());
        assertTrue("Failed to find Property Customization", leadTab.findPropertyCustomization());
        assertTrue("Failed to click on Form Selector Dropdown", leadTab.clickFormSelectorDropdown());
        OtherForm otherTab = new OtherForm(driver);
        assertTrue("Failed to click on Other Tab Dropdown", otherTab.clickOtherTabDropdown());
        assertTrue("Failed to find Other Details", otherTab.findOtherDetails());
        assertTrue("Failed to find Basic Info Tab", otherTab.findOtherBasicInfoTab());
        assertTrue("Failed to find Submit Message Tab", otherTab.findOtherSubmitMessage());
        assertTrue("Failed to find Property Selector Dropdown",leadTab.findPropertySelectorDropdown());
        assertTrue("Failed to find Property Details in Other Tab", workOrderTab.findPropertyDetailsInWorkOrderTab());
        assertTrue("Failed to find General Vendor Protocol", otherTab.findGeneralVendorProtocol());
        assertTrue("Failed to find General Solicitor Protocol", otherTab.findGeneralSolicitorProtocol());
        assertTrue("Failed to find Market Survey Protocol", otherTab.findMarketSurveyProtocol());
        assertTrue("Failed to find Test Calls Protocol", otherTab.findTestCallsProtocol());
        assertTrue("Failed to find General information", leadTab.findGeneralInformation());
        assertTrue("Failed to find Contact Information", leadTab.findContactInformation());
        assertTrue("Failed to find Hours", leadTab.findHours());
        assertTrue("Failed to find Property Customization", leadTab.findPropertyCustomization());
    }
}