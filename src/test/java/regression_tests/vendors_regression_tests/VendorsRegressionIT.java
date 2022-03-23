package regression_tests.vendors_regression_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.accounting_tab.vendors_subtab.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static utils.RandomGenerator.randomName;
import static utils.RandomGenerator.randomNumber;

public class VendorsRegressionIT extends BaseBrowserTest {

    public VendorsRegressionIT() {
        super("avantic");
    }

    @Test
    public void shouldFindVendorFinancials_whenAVendorIsSelectedAndClickFinancialTab() {
        EntrataNavBar navBar = new EntrataNavBar(driver);
        VendorsPage vendorsPage = new VendorsPage(driver);
        VendorsFinancial vendorsFinancial = new VendorsFinancial(driver);
        assertTrue("Could not find Accounting tab.", navBar.hoverAccountingTab());
        assertTrue("Could not select Vendors tab.", navBar.selectVendorsInDropdown());
        assertTrue("Could not close Vendor Filter.", vendorsPage.closeVendorFilter());
        assertTrue("Could not select first listed vendor.", vendorsPage.firstListedVendorClick());
        assertTrue("Could not find the Financial tab.", vendorsFinancial.financialTabVisible());
        assertTrue("Could not click the Financial tab.", vendorsFinancial.financialTabClick());
        assertTrue("Could not find Purchase Orders tab.", vendorsFinancial.purchaseTabVisible());
        assertTrue("Could not find Invoices tab.", vendorsFinancial.invoicesTabVisible());
        assertTrue("Could not click Invoices tab.", vendorsFinancial.invoicesTabClick());
        assertTrue("Could not find Invoice information.", vendorsFinancial.invoicesInfoVisible());
        assertTrue("Could not click Purchase Order tab.", vendorsFinancial.purchaseTabClick());
        assertTrue("Could not find Purchase Order information.", vendorsFinancial.purchaseInfoVisible());
    }

    @Test
    public void shouldAddANewVendor_whenAllMandatoryVendorFieldsAreCompleted() {
        VendorsPage vendorsPage = new VendorsPage(driver);
        AddVendor addVendor = new AddVendor(driver);
        EntrataNavBar navBar = new EntrataNavBar(driver);
        assertTrue("Could not find Accounting tab.", navBar.hoverAccountingTab());
        assertTrue("Could not select Vendors tab.", navBar.selectVendorsInDropdown());
        assertTrue("Could not close Vendor Filter.", vendorsPage.closeVendorFilter());
        assertTrue("Could not select Add New Vendor button.", vendorsPage.addNewVendor());
        assertTrue("Could not enter Business Name.", addVendor.enterBusinessName(randomName()));
        assertTrue("Could not select Vendor Type.", addVendor.selectVendorType("1"));
        assertTrue("Could not select Vendor Entity.", addVendor.selectVendorEntity("567"));
        assertTrue("Could not select Default Payment Terms.", addVendor.selectDefaultPaymentTerms("23058"));
        assertTrue("Could not enter Location Name.", addVendor.enterLocationName(randomName()));
        assertTrue("Could not select Add Properties button.", addVendor.addPropertiesButton());
        assertTrue("Could not select Add All Properties button.", addVendor.addAllProperties());
        assertTrue("Could not select Submit for new vendor.", addVendor.submitNewVendor());
        assertTrue("Could not see the page of the recently added vendor.", addVendor.vendorsPageCheck());
    }

    @Test
    public void shouldAddANewVendorLocation_whenAllMandatoryLocationFieldsAreCompleted() {
        EntrataNavBar navBar = new EntrataNavBar(driver);
        VendorsPage vendorsPage = new VendorsPage(driver);
        AddVendor addVendor = new AddVendor(driver);
        VendorsLocation vendorsLocation = new VendorsLocation(driver);

        assertTrue("Could not find Accounting tab.", navBar.hoverAccountingTab());
        assertTrue("Could not select Vendors tab.", navBar.selectVendorsInDropdown());
        assertTrue("Could not close Vendor filter.", vendorsPage.closeVendorFilter());
        assertTrue("Could not select first listed vendor.", vendorsPage.firstListedVendorClick());
        assertTrue("Could not select vendor's Locations tab.", vendorsLocation.locationsTabClick());
        assertTrue("Could not locate Vendors Location information.", vendorsLocation.locationsInformationVisible());
        assertTrue("Could not select Add Location button.", vendorsLocation.addLocationClick());
        assertTrue("Could not locate Add Vendor Location form.", vendorsLocation.addLocationFormVisible());
        assertTrue("Could not find Vendor Code.", vendorsLocation.vendorCodeVisible());
        assertTrue("Could not find Country.", vendorsLocation.countryVisible());
        assertTrue("Could not find Address Line 1.", vendorsLocation.addressOneVisible());
        assertTrue("Could not find Address Line 2.", vendorsLocation.addressTwoVisible());
        assertTrue("Could not find Address Line 3.", vendorsLocation.addressThreeVisible());
        assertTrue("Could not find City.", vendorsLocation.cityVisible());
        assertTrue("Could not find State.", vendorsLocation.stateVisible());
        assertTrue("Could not find Zip.", vendorsLocation.zipVisible());
        assertTrue("Could not find Duns Number.", vendorsLocation.dunsNumberVisible());
        assertTrue("Could not find This Vendor is Approved for All Property Groups toggle.", vendorsLocation.vendorApprovedAllVendorsToggleVisible());
        assertTrue("Could not find Notes.", vendorsLocation.notesVisible());
        assertTrue("Could not input a Location Name.", vendorsLocation.locationName(randomName()));
        assertTrue("Could not select a Legal Entity.", vendorsLocation.legalEntitySelect());
        assertTrue("Could not select a Remittance Type.", vendorsLocation.remittanceTypeSelect());
        assertEquals("Remittance Name did not match Remittance Type.", vendorsLocation.getRemittanceName(), "Debit Card");
        assertTrue("Could not click the button's container.", vendorsLocation.addPropertiesDivClick());
        assertTrue("Could not select the Add button for adding properties.", addVendor.addPropertiesButton());
        assertTrue("Could not the All Properties button.", addVendor.addAllProperties());
        assertTrue("Could select the Add button to submit new location.", vendorsLocation.submitLocation());
        assertTrue("Could not find green success banner.", vendorsLocation.successBannerCheck());
    }

    @Test
    public void shouldAddANewRemittanceOptionForAVendor_whenAllMandatoryFieldsAreCompleted() {
        EntrataNavBar navBar = new EntrataNavBar(driver);
        VendorsPage vendorsPage = new VendorsPage(driver);
        VendorsLocation vendorsLocation = new VendorsLocation(driver);
        assertTrue("Could not find Accounting tab.", navBar.hoverAccountingTab());
        assertTrue("Could not select Vendors tab.", navBar.selectVendorsInDropdown());
        assertTrue("Could not close Vendor filter.", vendorsPage.closeVendorFilter());
        assertTrue("Could not select first listed vendor.", vendorsPage.firstListedVendorClick());
        assertTrue("Could not select vendor's Locations tab.", vendorsLocation.locationsTabClick());
        assertTrue("Could not select first listed location.", vendorsLocation.firstListedLocationClick());
        assertTrue("Could not find Vendor Location Info.", vendorsLocation.vendorLocationInfoVisible());
        assertTrue("Could not find Remittance Options.", vendorsLocation.remittanceOptionsVisible());
        assertTrue("Could not find Remittance View option.", vendorsLocation.viewRemittanceVisible());
        assertTrue("Could not find Remittance Edit option.", vendorsLocation.editRemittanceVisible());
        assertTrue("Could not find Contacts.", vendorsLocation.contactsVisible());
        assertTrue("Could not find Accounts.", vendorsLocation.accountsVisible());
        assertTrue("Could not find Advanced Settings.", vendorsLocation.advancedSettingsVisible());
        assertTrue("Could not select Add Remittance Option button.", vendorsLocation.addRemittanceOptionClick());
        assertTrue("Could not find Remittance Type.", vendorsLocation.addRemittanceTypeVisible());
        assertTrue("Could not find Remittance Name.", vendorsLocation.addRemittanceNameVisible());
        assertTrue("Could not find Address.", vendorsLocation.addressVisible());
        assertTrue("Could not find Address Line One.", vendorsLocation.addRemittanceAddressOneVisible());
        assertTrue("Could not find Address Line Two.", vendorsLocation.addRemittanceAddressTwoVisible());
        assertTrue("Could not find Address Line Three.", vendorsLocation.addRemittanceAddressThreeVisible());
        assertTrue("Could not find City.", vendorsLocation.addRemittanceCityVisible());
        assertTrue("Could not find State.", vendorsLocation.addRemittanceStateVisible());
        assertTrue("Could not find Zip.", vendorsLocation.addRemittanceZipVisible());
        assertTrue("Could not find Make Default toggle.", vendorsLocation.makeDefaultToggleVisible());
        assertTrue("Could not find green Add button.", vendorsLocation.addRemittanceButtonVisible());
        assertTrue("Could not find Cancel hyperlink.", vendorsLocation.cancelRemittanceVisible());
        assertTrue("Could not find Close button.", vendorsLocation.closeRemittanceBoxVisible());
        assertTrue("Could not select Remittance Type.", vendorsLocation.selectRemittanceType());
        assertTrue("Could not select Add button.", vendorsLocation.addNewRemittanceOptionClick());
        assertTrue("Could not find Vendor Location page.", vendorsLocation.vendorLocationPageVisible());
        assertTrue("Could not locate green success banner.", vendorsLocation.successBannerCheck());
    }

    @Test
    public void shouldAddAVendorAccount_whenAllMandatoryFieldsAreCompleted() {
        EntrataNavBar navBar = new EntrataNavBar(driver);
        VendorsPage vendorsPage = new VendorsPage(driver);
        VendorsAccounts vendorsAccounts = new VendorsAccounts(driver);
        assertTrue("Could not find Accounting tab.", navBar.hoverAccountingTab());
        assertTrue("Could not select Vendors tab.", navBar.selectVendorsInDropdown());
        assertTrue("Could not close Vendor filter.", vendorsPage.closeVendorFilter());
        assertTrue("Could not select first listed vendor.", vendorsPage.firstListedVendorClick());
        assertTrue("Could not select Accounts tab.", vendorsAccounts.accountsTabClick());
        assertTrue("Could not find Add Account button.", vendorsAccounts.addAccountButtonVisible());
        assertTrue("Could not find Account Information box.", vendorsAccounts.accountsInformationVisible());
        assertTrue("Could not click Add Account button.", vendorsAccounts.addAccountButtonClick());
        assertTrue("Could not find Account Number.", vendorsAccounts.accountNumberVisible());
        assertTrue("Could not find Account Description.", vendorsAccounts.accountDescriptionVisible());
        assertTrue("Could not find Location.", vendorsAccounts.locationVisible());
        assertTrue("Could not find Default Remittance.", vendorsAccounts.defaultRemittanceVisible());
        assertTrue("Could not find Default GL Account.", vendorsAccounts.defaultGlAccountVisible());
        assertTrue("Could not find Default Property.", vendorsAccounts.defaultPropertyVisible());
        assertTrue("Could not find Utility Bill Receipt Type.", vendorsAccounts.utilityBillVisible());
        assertTrue("Could not find Enable Invoice Tracking toggle.", vendorsAccounts.enableInvoiceTrackingVisible());
        assertTrue("Could not find Disable This Account toggle.", vendorsAccounts.disableAccountVisible());
        assertTrue("Could not find Use Sub Account Number.", vendorsAccounts.useSubAccountNumberVisible());
        assertTrue("Could not find Invoice Processing Recapture Total Only toggle.", vendorsAccounts.invoiceProcessingVisible());
        assertTrue("Could not input Account Number.", vendorsAccounts.accountNumberInput(randomNumber()));
        assertTrue("Could not select a Location.", vendorsAccounts.selectLocation());
        assertTrue("Could not click on Default Remittance.", vendorsAccounts.defaultRemittanceClick());
        assertTrue("Could not select a Default Remittance.", vendorsAccounts.selectRemittance());
        assertTrue("Could not select Add Account button.", vendorsAccounts.addAccountSubmitClick());
        assertTrue("Could not locate green success banner.", vendorsAccounts.successBannerVisible());
    }

    @Test
    public void shouldAddADocumentToVendor_whenFileTypeAndLocationAreSelected() {
        EntrataNavBar navBar = new EntrataNavBar(driver);
        VendorsPage vendorsPage = new VendorsPage(driver);
        VendorsDocuments vendorsDocuments = new VendorsDocuments(driver);
        assertTrue("Could not find Accounting tab.", navBar.hoverAccountingTab());
        assertTrue("Could not select Vendors tab.", navBar.selectVendorsInDropdown());
        assertTrue("Could not close Vendor filter.", vendorsPage.closeVendorFilter());
        assertTrue("Could not select first listed vendor.", vendorsPage.firstListedVendorClick());
        assertTrue("Could not select Documents tab.", vendorsDocuments.documentsTabClick());
        assertTrue("Could not find Documents information.", vendorsDocuments.documentsInfoVisible());
        assertTrue("Could not click Upload New Document button.", vendorsDocuments.uploadNewDocumentClick());
        assertTrue("Could not find Choose File button.", vendorsDocuments.chooseFileButtonVisible());
        assertTrue("Could not find Type dropdown.", vendorsDocuments.typeVisible());
        assertTrue("Could not find Location dropdown.", vendorsDocuments.locationVisible());
        assertTrue("Could not choose designated test file.", vendorsDocuments.uploadFile());
        assertTrue("Could not select file Type.", vendorsDocuments.fileTypeSelect());
        assertTrue("Could not select file Location.", vendorsDocuments.fileLocationSelect());
        assertTrue("Could not select Upload button.", vendorsDocuments.uploadButtonClick());
        assertTrue("Could not find green success banner.", vendorsDocuments.successBannerVisible());
    }

    @Test
    public void shouldAddNewVendorContact_whenAllFieldsAreCompleted() {
        EntrataNavBar entrata_navBar = new EntrataNavBar(driver);
        VendorsPage vendorsPage = new VendorsPage(driver);
        VendorsContacts vendorsContacts = new VendorsContacts(driver);
        assertTrue("Could not find Accounting tab.", entrata_navBar.hoverAccountingTab());
        assertTrue("Could not select Vendors tab.", entrata_navBar.selectVendorsInDropdown());
        assertTrue("Could not close Vendor filter.", vendorsPage.closeVendorFilter());
        assertTrue("Could not select first listed vendor.", vendorsPage.firstListedVendorClick());
        assertTrue("Could not select Contacts tab.", vendorsContacts.contactsTabClick());
        assertTrue("Could not find Contacts Information.", vendorsContacts.contactsInfoVisible());
        assertTrue("Could not click Add Contact Button.", vendorsContacts.addContactButtonClick());
        assertTrue("Could not find First Name box.", vendorsContacts.firstNameVisible());
        assertTrue("Could not find Last Name box.", vendorsContacts.lastNameVisible());
        assertTrue("Could not find Associated Locations box.", vendorsContacts.associatedLocationsVisible());
        assertTrue("Could not find Set As Primary Contact For box.", vendorsContacts.setAsPrimaryContactVisible());
        assertTrue("Could not find Position box.", vendorsContacts.positionVisible());
        assertTrue("Could not find Phone box.", vendorsContacts.phoneVisible());
        assertTrue("Could not find Extension box.", vendorsContacts.extensionVisible());
        assertTrue("Could not find Fax box.", vendorsContacts.faxVisible());
        assertTrue("Could not find Email box.", vendorsContacts.emailVisible());
        assertTrue("Could not find Add button.", vendorsContacts.submitContactButtonVisible());
        assertTrue("Could not find Cancel hyperlink.", vendorsContacts.cancelHyperlinkVisible());
        assertTrue("Could not input First Name.", vendorsContacts.firstNameInput(randomName()));
        assertTrue("Could not input Last Name.", vendorsContacts.lastNameInput(randomName()));
        assertTrue("Could not input Position.", vendorsContacts.positionInput("Farmer"));
        assertTrue("Could not input Phone Number Area Code.", vendorsContacts.phoneAreaInput("123"));
        assertTrue("Could not input Phone Number First set.", vendorsContacts.phoneFirstInput("456"));
        assertTrue("Could not input Phone Number Second set.", vendorsContacts.phoneSecondInput("7890"));
        assertTrue("Could not input Extension Number.", vendorsContacts.extensionInput("12345"));
        assertTrue("Could not input Email.", vendorsContacts.emailInput("Test@Test.lcl"));
        assertTrue("Could not input Fax Number Area Code.", vendorsContacts.faxAreaInput("098"));
        assertTrue("Could not input Fax Number First set.", vendorsContacts.faxFirstInput("765"));
        assertTrue("Could not input Fax Number Second set.", vendorsContacts.faxSecondInput("4321"));
        assertTrue("Could not submit new contact.", vendorsContacts.submitContactButtonClick());
        assertTrue("Could not find green success banner.", vendorsContacts.successBannerVisible());
    }

    @Test
    public void shouldDeleteActiveVendorWithNoTransactions_whenTheDeleteOptionIsSelectedForTheVendor() {
        EntrataNavBar navBar = new EntrataNavBar(driver);
        VendorsPage vendorsPage = new VendorsPage(driver);
        AddVendor addVendor = new AddVendor(driver);

        //Create an active vendor with no transactions to delete.
        assertTrue("Could not find Accounting tab.", navBar.hoverAccountingTab());
        assertTrue("Could not select Vendors tab.", navBar.selectVendorsInDropdown());
        assertTrue("Could not close Vendor Filter.", vendorsPage.closeVendorFilter());
        assertTrue("Could not select Add New Vendor button.", vendorsPage.addNewVendor());
        assertTrue("Could not enter Business Name.", addVendor.enterBusinessName(randomName()));
        assertTrue("Could not select Vendor Type.", addVendor.selectVendorType("1"));
        assertTrue("Could not select Vendor Entity.", addVendor.selectVendorEntity("567"));
        assertTrue("Could not select Default Payment Terms.", addVendor.selectDefaultPaymentTerms("23058"));
        assertTrue("Could not enter Location Name.", addVendor.enterLocationName(randomName()));
        assertTrue("Could not select Add Properties button.", addVendor.addPropertiesButton());
        assertTrue("Could not select Add All Properties button.", addVendor.addAllProperties());
        assertTrue("Could not select Submit for new vendor.", addVendor.submitNewVendor());

        //Validate elements on vendor's page and then delete the vendor.
        assertTrue("Could not find Vendor Status box.", vendorsPage.vendorStatusBoxVisible());
        assertTrue("Could not find Vendor Quick View box.", vendorsPage.vendorQuickViewBoxVisible());
        assertTrue("Could not find Vendor Quick View Edit button.", vendorsPage.vendorQuickViewButtonVisible());
        assertTrue("Could not find Vendor Add Activity box.", vendorsPage.vendorAddActivityBoxVisible());
        assertTrue("Could not select More Actions dropdown.", vendorsPage.actionMenuClick());
        assertTrue("Could not find Place On Hold selection.", vendorsPage.placeOnHoldVisible());
        assertTrue("Could not find Make Inactive selection.", vendorsPage.makeInactiveVisible());
        assertTrue("Could not find Permanently Delete selection.", vendorsPage.permanentlyDeleteVisible());
        assertTrue("Could not select Permanently Delete selection.", vendorsPage.permanentlyDeleteVendorClick());
        assertTrue("Could not find Delete Confirmation popup.", vendorsPage.deletePopupFormVisible());
        assertTrue("Could not find Continue button to delete vendor.", vendorsPage.deleteConfirmVisible());
        assertTrue("Could not find Cancel delete hyperlink.", vendorsPage.cancelDeleteHyperlinkVisible());
        assertTrue("Could not select Continue to delete vendor.", vendorsPage.confirmDeleteClick());
        assertTrue("Could not find green success banner.", vendorsPage.successBannerVisible());
    }

    @Test
    public void shouldEditVendorInfo_whenEditVendorButtonIsClickedAndFieldsAreChanged() {
        EntrataNavBar navBar = new EntrataNavBar(driver);
        VendorsPage vendorsPage = new VendorsPage(driver);
        assertTrue("Could not find Accounting tab.", navBar.hoverAccountingTab());
        assertTrue("Could not select Vendors tab.", navBar.selectVendorsInDropdown());
        assertTrue("Could not close Vendor Filter.", vendorsPage.closeVendorFilter());
        assertTrue("Could not select first listed vendor.", vendorsPage.firstListedVendorClick());
        assertTrue("Could not select Edit Vendor Info button.", vendorsPage.editVendorInfoClick());
        assertTrue("Could not input Business Name.", vendorsPage.businessNameInput(randomName()));
        assertTrue("Could not select Payment Terms.", vendorsPage.paymentTermsSelect());
        assertTrue("Could not click Save button.", vendorsPage.saveVendorEditInfoButtonClick());
        assertTrue("Could not find green success banner.", vendorsPage.successBannerVisible());
    }

    @Test
    public void shouldAddAVendor_whenAllRequiredFieldsAreCompleted() {
        VendorsPage vendorsPage = new VendorsPage(driver);
        AddVendor addVendor = new AddVendor(driver);
        EntrataNavBar navBar = new EntrataNavBar(driver);

        assertTrue("Could not find Accounting tab.", navBar.hoverAccountingTab());
        assertTrue("Could not select Vendors tab.", navBar.selectVendorsInDropdown());
        assertTrue("Could not close Vendor Filter.", vendorsPage.closeVendorFilter());
        assertTrue("Could not select Add New Vendor button.", vendorsPage.addNewVendor());
        assertTrue("Could not locate Vendor Code.", addVendor.vendorCodeVisible());
        assertTrue("Could not locate EIN.", addVendor.einVisible());
        assertTrue("Could not locate Business Name (DBA).", addVendor.businessNameVisible());
        assertTrue("Could not locate Name on Tax Return.", addVendor.nameOnTaxReturnVisible());
        assertTrue("Could not locate Vendor Type.", addVendor.vendorTypeVisible());
        assertTrue("Could not locate Entity Type.", addVendor.entityTypeVisible());
        assertTrue("Could not locate Default Payment Terms.", addVendor.defaultPaymentTermsVisible());
        assertTrue("Could not locate Default GL Account.", addVendor.defaultGlAccountVisible());
        assertTrue("Could not locate Pay on Same Check.", addVendor.payOnSameCheckVisible());
        assertTrue("Could not locate Service Location.", addVendor.serviceLocationVisible());
        assertTrue("Could not locate Service Provided.", addVendor.serviceProvidedVisible());
        assertTrue("Could not locate Website.", addVendor.websiteVisible());
        assertTrue("Could not locate Location Name.", addVendor.locationNameVisible());
        assertTrue("Could not locate Country.", addVendor.countryVisible());
        assertTrue("Could not locate Address Line 1.", addVendor.addressLineOneVisible());
        assertTrue("Could not locate Address Line 2.", addVendor.addressLineTwoVisible());
        assertTrue("Could not locate Address Line 3.", addVendor.addressLineThreeVisible());
        assertTrue("Could not locate City.", addVendor.cityVisible());
        assertTrue("Could not locate State.", addVendor.stateVisible());
        assertTrue("Could not locate Zip.", addVendor.zipVisible());
        assertTrue("Could not locate DUNS Number.", addVendor.dunsNumberVisible());
        assertTrue("Could not locate Vendor Approved for All Property Groups.", addVendor.vendorApprovedForAllPropertiesVisible());
        assertTrue("Could not locate Approved Properties.", addVendor.approvedPropertiesVisible());
        assertTrue("Could not locate External ID.", addVendor.externalIdVisible());
        assertTrue("Could not locate Notes.", addVendor.notesVisible());
        assertTrue("Could not locate Generate 1099.", addVendor.generate1099Visible());
        assertTrue("Could not locate Remittance Type.", addVendor.remittanceTypeVisible());
        assertTrue("Could not locate Remittance Name.", addVendor.remittanceNameVisible());
        assertTrue("Could not locate Country.", addVendor.remittanceCountryVisible());
        assertTrue("Could not locate Remittance - Address Line 1.", addVendor.remittanceAddressOneVisible());
        assertTrue("Could not locate Remittance - Address Line 2.", addVendor.remittanceAddressTwoVisible());
        assertTrue("Could not locate Remittance - Address Line 3.", addVendor.remittanceAddressThreeVisible());
        assertTrue("Could not locate Remittance - City.", addVendor.remittanceCityVisible());
        assertTrue("Could not locate Remittance - State.", addVendor.remittanceStateVisible());
        assertTrue("Could not locate remittance - Zip.", addVendor.remittanceZipVisible());
        assertTrue("Could not locate Contact - First Name.", addVendor.contactFirstNameVisible());
        assertTrue("Could not locate Contact - Last Name", addVendor.contactLastNameVisible());
        assertTrue("Could not locate Contact - Position.", addVendor.contactPositionVisible());
        assertTrue("Could not locate Contact- Phone.", addVendor.contactPhoneVisible());
        assertTrue("Could not locate Contact - Ext.", addVendor.contactPhoneExtVisible());
        assertTrue("Could not locate Contact - Fax.", addVendor.contactFaxVisible());
        assertTrue("Could not locate Contact - Email.", addVendor.contactEmailVisible());
        assertTrue("Could not locate Accounts - Account Number.", addVendor.accountNumberVisible());
        assertTrue("Could not locate Accounts - Description.", addVendor.accountDescriptionVisible());
        assertTrue("Could not locate Accounts - Property.", addVendor.accountPropertyVisible());
        assertTrue("Could not locate Accounts - Default GL Account.", addVendor.accountDefaultGlAccountVisible());
        assertTrue("Could not enter Business Name.", addVendor.enterBusinessName(randomName()));
        assertTrue("Could not select Vendor Type.", addVendor.selectVendorType("1"));
        assertTrue("Could not select Vendor Entity.", addVendor.selectVendorEntity("567"));
        assertTrue("Could not select Default Payment Terms.", addVendor.selectDefaultPaymentTerms("23058"));
        assertTrue("Could not enter Location Name.", addVendor.enterLocationName(randomName()));
        assertTrue("Could not select Add Properties button.", addVendor.addPropertiesButton());
        assertTrue("Could not select Add All Properties button.", addVendor.addAllProperties());
        assertTrue("Could not select Submit for new vendor.", addVendor.submitNewVendor());
        assertTrue("Could not see the page of the recently added vendor.", addVendor.vendorsPageCheck());
    }
}
