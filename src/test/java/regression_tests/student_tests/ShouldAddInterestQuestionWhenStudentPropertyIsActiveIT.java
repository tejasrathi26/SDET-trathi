package regression_tests.student_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.FirstLevelNavigation;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.leasing_tab.CompanyLeasingNav;

import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.leasing_tab.application_tab.RoommateInterestsPage;

import static org.junit.Assert.*;

public class ShouldAddInterestQuestionWhenStudentPropertyIsActiveIT extends BaseBrowserTest {
    public ShouldAddInterestQuestionWhenStudentPropertyIsActiveIT(){
        super("campusapartments"); }


    @Test
    public void shouldAddInterestQuestion_whenStudentPropertyIsActive(){
        EntrataNavBar nav = new EntrataNavBar(driver);
        FirstLevelNavigation first = new FirstLevelNavigation(driver);
        CompanyLeasingNav leasingNav = new CompanyLeasingNav(driver);
        RoommateInterestsPage roommateInterests = new RoommateInterestsPage(driver);
        assertTrue("unable to click on setup tab",nav.clickSetupButton());
        assertTrue("unable to click Company sub tab",nav.clickCompanyButton());
        assertTrue("unable to click leasing tab",first.clickLeasingTab());
        assertTrue("unable to click application subtab",leasingNav.clickApplicationTab());
        assertTrue("unable to click add question button",roommateInterests.clickAddQuestion());
        assertTrue("unable to select personality question type", roommateInterests.selectPersonalityQuestionType());
        assertTrue("unable to enter interest question title", roommateInterests.enterInterestQuestionTitle());
        assertTrue("unable to click single select button",roommateInterests.clickSingleSelectButton());
        assertTrue("unable to enter information for option one",roommateInterests.enterOptionOne());
        assertTrue("unable to click save button",roommateInterests.clickSaveButton());
        assertEquals("success message not displaying","Roommate Interest Question inserted successfully. ",roommateInterests.checkSuccessMessage());
        assertTrue("unable to find added question",roommateInterests.checkAddedQuestion());



    }
}
