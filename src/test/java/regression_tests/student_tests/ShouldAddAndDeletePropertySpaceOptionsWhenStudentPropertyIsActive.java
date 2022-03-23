package regression_tests.student_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.FirstLevelNavigation;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.PropertyListPage;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.property_tab.PropertyNavigation;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.property_tab.floorplans_and_units.FloorplanNav;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.property_tab.floorplans_and_units.PropertySpaceOptionsTab;

import static org.junit.Assert.*;

public class ShouldAddAndDeletePropertySpaceOptionsWhenStudentPropertyIsActive extends BaseBrowserTest {
    public ShouldAddAndDeletePropertySpaceOptionsWhenStudentPropertyIsActive() {
        super("campusapartments");
    }


    @Test
    public void shouldAddAndDeletePropertySpaceOptions_whenPropertyIsStudentAndCompanySpaceOptionsAreSetUp(){
        EntrataNavBar nav = new EntrataNavBar(driver);
        PropertySpaceOptionsTab propertySpaceOptions = new PropertySpaceOptionsTab(driver);
        FirstLevelNavigation firstLevelNavigation = new FirstLevelNavigation(driver);
        PropertyListPage propertyListPage = new PropertyListPage(driver);
        PropertyNavigation propertyNavigation = new PropertyNavigation(driver);
        FloorplanNav floorplanNav = new FloorplanNav(driver);
        assertTrue("unable to click setup tab",nav.clickSetupButton());
        assertTrue("unable to click properties tab",nav.clickPropertiesButton());
        assertTrue("unable to find property link",propertyListPage.clickEarleProperty());
        assertTrue("unable to click properties tab",firstLevelNavigation.clickPropertyTab());
        assertTrue("unable to locate Floor Plans & Units tab",propertyNavigation.clickFloorplansTab());
        assertTrue("unable to locate space options tab", floorplanNav.clickSpaceOptionsTab());
        assertTrue("unable to locate edit space options button", propertySpaceOptions.clickEditSpaceOption());
        assertTrue("unable to locate add space option", propertySpaceOptions.clickAddSpaceOption());
        assertTrue("unable to select space option", propertySpaceOptions.selectSpaceOption());
        assertTrue("cannot find save Button", propertySpaceOptions.saveSpaceOption());
        assertTrue("unable to confirm rates", propertySpaceOptions.clickConfirmRates());
        assertEquals("Space options updated successfully. ", propertySpaceOptions.checkSuccessMessage());
        assertTrue("Standard Shared Space Option is not displaying",propertySpaceOptions.confirmStandardSharedOption());
        assertTrue("unable to locate edit space options button", propertySpaceOptions.clickEditSpaceOption());
        assertTrue("unable to delete space option",propertySpaceOptions.clickDeleteSpaceOption());
        assertTrue("Unable to confirm Delete space option",propertySpaceOptions.clickConfirmDelete());
        assertTrue("cannot find Save Button", propertySpaceOptions.saveSpaceOption());
        assertTrue("unable to confirm rates", propertySpaceOptions.clickConfirmRates());
        assertEquals("Rates restored successfully.  Space options updated successfully. ", propertySpaceOptions.checkSuccessMessage());
    }
}
