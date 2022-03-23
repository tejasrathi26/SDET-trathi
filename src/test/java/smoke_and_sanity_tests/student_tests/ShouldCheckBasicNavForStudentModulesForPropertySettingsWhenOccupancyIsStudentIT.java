package smoke_and_sanity_tests.student_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.FirstLevelNavigation;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.PropertyListPage;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.financial_tab.FinancialNav;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.financial_tab.payments_subtab.InstallmentPlansPage;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.financial_tab.payments_subtab.PaymentsNav;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.leasing_tab.PropertyLeasingNav;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.leasing_tab.applications.ApplicationsNav;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.leasing_tab.applications.RoommateInterests;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.pricing_tab.PricingNav;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.pricing_tab.preferences.Preferences_General;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.pricing_tab.rent.RentNav;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.pricing_tab.rent.Rent_Property;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.pricing_tab.rent.Rent_UnitType;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.property_tab.floorplans_and_units.FloorPlansTab;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.property_tab.floorplans_and_units.FloorplanNav;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.property_tab.floorplans_and_units.PropertySpaceOptionsTab;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.property_tab.floorplans_and_units.UnitsTab;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.residents_tab.moveout_subtab.ResidentsMoveOut;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.residents_tab.ResidentsNav;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.residents_tab.movein_subtab.MoveInNav;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.residents_tab.movein_subtab.MoveinPage;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.residents_tab.movein_subtab.MoveinSchedulerPage;

import static org.junit.Assert.*;


public class ShouldCheckBasicNavForStudentModulesForPropertySettingsWhenOccupancyIsStudentIT extends BaseBrowserTest {
    public ShouldCheckBasicNavForStudentModulesForPropertySettingsWhenOccupancyIsStudentIT() {
        super("dallasentratatest9");
    }


    @Test

    public void shouldCheckStudentModulesForPropertySectionOfSettings_whenOccupancyTypeIsStudent() {
        EntrataNavBar nav = new EntrataNavBar(driver);
        PropertyListPage plist = new PropertyListPage(driver);
        FirstLevelNavigation fnav = new FirstLevelNavigation(driver);
        FloorplanNav fpnav = new FloorplanNav(driver);
        FloorPlansTab floorPlansTab = new FloorPlansTab(driver);
        UnitsTab unitsTab = new UnitsTab(driver);
        PropertySpaceOptionsTab propertySpaceOptions = new PropertySpaceOptionsTab(driver);
        assertTrue("unable to find setup tab", nav.clickSetupButton());
        assertTrue("unable to click on properties tab", nav.clickPropertiesButton());
        assertTrue("unable to find Lofts at Lorien property", plist.clickLoftsAtLorien());
        assertTrue("unable to click on property tab", fnav.clickPropertyTab());
        assertTrue("unable to click floorplan and units tab", fpnav.clickFloorplansTab());
        assertTrue("unable to click view lease term pricing", floorPlansTab.clickViewLeaseTermPricing());
        assertTrue("Lease term pricing window is not displaying", floorPlansTab.verifyLeaseTermPricingWindow());
        assertTrue("cannot close lease term pricing window", floorPlansTab.clickCloseLeaseTermPricing());
        assertTrue("cannot click units tab", fpnav.clickUnitsTab());
        assertTrue("cannot enter value to search", unitsTab.searchForUnit());
        assertTrue("cannot complete search", unitsTab.hitEnterOnSearch());
        assertTrue("cannot click on unit 13-A", unitsTab.clickSecondUnit());
        assertTrue("cannot click on space configuration tab", unitsTab.clickSpaceConfiguration());
        assertTrue("cannot click edit space configurations", unitsTab.clickEditSpaceConfiguration());
        assertTrue("unable to find merge spaces button", unitsTab.VerifyEditUnitSpacesIsVisible());
        assertTrue("unable to close edit unit space configurations", unitsTab.clickCloseEditUnitSpaces());
        assertTrue("unable to close selected unit space", unitsTab.clickCloseUnitSpace());
        assertTrue("unable to click on space options tab",fpnav.clickSpaceOptionsTab());
        assertTrue("unable to locate edit space options button", propertySpaceOptions.confirmVisibilityofEditSpaceOptions());
        //

    }

    @Test
    public void shouldCheckStudentModulesForPricingSectionOfSettings_whenOccupancyTypeIsStudent() {
        EntrataNavBar nav = new EntrataNavBar(driver);
        PropertyListPage plist = new PropertyListPage(driver);
        FirstLevelNavigation fnav = new FirstLevelNavigation(driver);
        RentNav rentNav = new RentNav(driver);
        Rent_Property property = new Rent_Property(driver);
        Rent_UnitType unitType = new Rent_UnitType(driver);
        PricingNav pricingNav = new PricingNav(driver);
        Preferences_General general = new Preferences_General(driver);
        assertTrue("unable to find setup tab", nav.clickSetupButton());
        assertTrue("unable to click on properties tab", nav.clickPropertiesButton());
        assertTrue("unable to find Lofts at Lorien property", plist.clickLoftsAtLorien());
        assertTrue("unable to click on Pricing tab", fnav.clickPricingTab());
        assertTrue("unable to click property subtab", rentNav.clickPropertySubtab());
        assertTrue("unable to click bulk edit prospect rents", property.clickBulkEditProspectRents());
        assertTrue("unable to view bulk adjust pricing", property.verifyVisibilityOfBulkAdjustPRicing());
        assertTrue("unable to close bulk edit prospect rents", property.clickCLoseButton());
        assertTrue("unable to click unit type subtab", rentNav.clickUnitTypeSubtab());
        assertTrue("unable to find and click on rent matrix", unitType.clickRentMatrix());
        assertTrue("unable to locate lease term selector", unitType.verifyVisibilityOfLeaseTermSelector());
        assertTrue("unable to click close rent matrix button", unitType.clickCloseButton());
        assertTrue("unable to click pricing preferences", pricingNav.clickPreferences());
        assertTrue("unable to click edit pricing options", general.clickEditPricingOptions());
        assertTrue("unable to click save button", general.clickSaveButton());
        assertTrue("unable to click yes and confirm save", general.clickConfirmSave());
    }

    @Test
    public void shouldCheckStudentModulesForLeasingSectionOfSettings_whenOccupancyTypeIsStudent() {
        EntrataNavBar nav = new EntrataNavBar(driver);
        PropertyListPage plist = new PropertyListPage(driver);
        FirstLevelNavigation fnav = new FirstLevelNavigation(driver);
        PropertyLeasingNav leasingNav = new PropertyLeasingNav(driver);
        ApplicationsNav applicationsNav = new ApplicationsNav(driver);
        RoommateInterests roommateInterests = new RoommateInterests(driver);
        assertTrue("unable to find setup tab", nav.clickSetupButton());
        assertTrue("unable to click on properties tab", nav.clickPropertiesButton());
        assertTrue("unable to find Lofts at Lorien property", plist.clickLoftsAtLorien());
        assertTrue("unable to click leasing tab", fnav.clickLeasingTab());
        assertTrue("unable to click on applications tab", leasingNav.clickApplication());
        assertTrue("unable to click on roommate interests tab", applicationsNav.clickRoommateInterestsTab());
        assertTrue("unable to click add questions button", roommateInterests.clickAddQuestion());
        assertTrue("unable to find roommate interest question dropdown", roommateInterests.verifyVisibilityOfInterestQuestionDropdown());
        assertTrue("unable to find close button", roommateInterests.clickCloseButton());
    }

    @Test
    public void shouldCheckThatMoveInMoveOutSettingsOpen_whenTabsAreClicked() {
        EntrataNavBar nav = new EntrataNavBar(driver);
        PropertyListPage plist = new PropertyListPage(driver);
        FirstLevelNavigation fnav = new FirstLevelNavigation(driver);
        ResidentsNav residentsNav = new ResidentsNav(driver);
        MoveinPage residentsMovein = new MoveinPage(driver);
        ResidentsMoveOut residentsMoveOut = new ResidentsMoveOut(driver);
        assertTrue("unable to find setup tab", nav.clickSetupButton());
        assertTrue("unable to click on properties tab", nav.clickPropertiesButton());
        assertTrue("unable to find Lofts at Lorien property", plist.clickLoftsAtLorien());
        assertTrue("unable to click on Residents Tab", fnav.clickResidentsTab());
        assertTrue("unable to click move-in subtab", residentsNav.clickMoveInTab());
        assertTrue("unable to click edit move-in", residentsMovein.clickEditMovein());
        assertTrue("unable to click Save button", residentsMovein.clickSaveButton());
        assertTrue("unable to see edit move-in button", residentsMovein.verifyEditMoveinButtonVisible());
        assertTrue("unable to click move-out tab",residentsNav.clickMoveOutTab());
        assertTrue("unable to locate edit move out settings button",residentsMoveOut.verifyVisibilityOfEditMoveOutSettings());

    }

    @Test
    public void shouldCheckThatMoveInSchedulerPageOpens_WhenTabIsClicked(){
        EntrataNavBar nav = new EntrataNavBar(driver);
        PropertyListPage plist = new PropertyListPage(driver);
        FirstLevelNavigation fnav = new FirstLevelNavigation(driver);
        MoveInNav  moveInNav = new MoveInNav(driver);
        MoveinSchedulerPage moveinSchedulerPage = new MoveinSchedulerPage(driver);
        assertTrue("unable to find setup tab", nav.clickSetupButton());
        assertTrue("unable to click on properties tab", nav.clickPropertiesButton());
        assertTrue("unable to find Lofts at Lorien property", plist.clickLoftsAtLorien());
        assertTrue("unable to click on Residents Tab", fnav.clickResidentsTab());
        assertTrue("unable to click move in scheduler tab",moveInNav.clickMoveInScheduler());
        assertTrue("unable to find scheduler dropdown",moveinSchedulerPage.confirmScheduleDropdownIsVisible());


    }

    @Test
    public void shouldCheckStudentModulesForFinancialSectionOfSettings_whenOccupancyTypeIsStudent() {
        EntrataNavBar nav = new EntrataNavBar(driver);
        PropertyListPage plist = new PropertyListPage(driver);
        FirstLevelNavigation fnav = new FirstLevelNavigation(driver);
        FinancialNav financialNav = new FinancialNav(driver);
        PaymentsNav paymentsNav = new PaymentsNav(driver);
        InstallmentPlansPage installmentPlansTab = new InstallmentPlansPage(driver);
        assertTrue("unable to find setup tab", nav.clickSetupButton());
        assertTrue("unable to click on properties tab", nav.clickPropertiesButton());
        assertTrue("unable to find Lofts at Lorien property", plist.clickLoftsAtLorien());
        assertTrue("unable to click on financial tab", fnav.clickFinancialTab());
        assertTrue("cannot click on payments tab", financialNav.clickPaymentsTab());
        assertTrue("unable to click installment plans tab", paymentsNav.clickInstallmentPlans());
        assertTrue("unable to click add student plan", installmentPlansTab.clickAddStudentPlan());
        assertTrue("Installment plan title field is not visible", installmentPlansTab.verifyVisibilityOfTitleField());


    }
}