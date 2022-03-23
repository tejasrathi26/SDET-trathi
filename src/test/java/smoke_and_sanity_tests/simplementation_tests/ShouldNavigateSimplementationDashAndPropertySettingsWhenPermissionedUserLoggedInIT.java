package smoke_and_sanity_tests.simplementation_tests;

import base_tests.BaseBrowserTest;
import base_tests.SitesEnum;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.dashboard_tab.simplementation_portal.SimplementationDashboardPage;
import page_objects.entrata_page_objects.setup_tab.profiles_subtab.ProfilesPage;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.AddPropertyPage;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.PropertyListPage;

import static org.junit.Assert.*;

public class ShouldNavigateSimplementationDashAndPropertySettingsWhenPermissionedUserLoggedInIT extends BaseBrowserTest {
    public ShouldNavigateSimplementationDashAndPropertySettingsWhenPermissionedUserLoggedInIT (){
        super("atbenterprises", SitesEnum.ENTRATA,"Entrata_7331","Xento123");}

    @Test
    public void shouldNavToSimplementationPortal_whenPermissionedUserLoggedIn(){
        EntrataNavBar nav = new EntrataNavBar(driver);
        SimplementationDashboardPage simplementationDashboardPage = new SimplementationDashboardPage(driver);
        assertTrue("unable to click Simplementation Portal", nav.clickSimplementationPortalTab());
        assertTrue("unable to click activate simplementation",simplementationDashboardPage.clickActivateSimplementation());
        assertTrue("unable to find select property dropdown",simplementationDashboardPage.findSelectPropertyDropdown());
    }
    @Test
    public void shouldNavToSetupProfile_whenPermissionedUserLoggedIn(){
        EntrataNavBar navBar = new EntrataNavBar(driver);
        ProfilesPage profilesPage = new ProfilesPage(driver);
        assertTrue("unable to click setup tab",navBar.clickSetupButton());
        assertTrue("unable to click profiles subtab",navBar.clickProfilesSubtab());
        assertTrue("unable to click add profile", profilesPage.clickAddProfile());
        assertTrue("unable to find occupancy type dropdown", profilesPage.findOccupancyTypesDropdown());
        assertTrue("unable to click cancel", profilesPage.clickCancelAddSettingPopup());
        assertTrue("unable to click edit profile icon", profilesPage.clickEditProfile());
        assertTrue("unable to find profile name field", profilesPage.findProfileNameField());
        assertTrue("unable to find save profile", profilesPage.findSaveProfile());
    }
    @Test
    public void shouldNavToAddPropertyPopup_whenPermissionUserLoggedIn(){
        EntrataNavBar navBar = new EntrataNavBar(driver);
        PropertyListPage propertyListPage = new PropertyListPage(driver);
        AddPropertyPage addPropertyPage = new AddPropertyPage(driver);
        assertTrue("unable to click setup tab",navBar.clickSetupButton());
        assertTrue("unable to click properties subtab", navBar.clickPropertiesButton());
        assertTrue("unable to click add property",propertyListPage.clickAddPropertyButton());
        assertTrue("unable to find property type dropdown",addPropertyPage.findPropertyTypeDropdown());
    }



}
