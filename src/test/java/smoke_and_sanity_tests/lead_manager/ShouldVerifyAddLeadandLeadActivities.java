package smoke_and_sanity_tests.lead_manager;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.leads_tab.all_leads_subtab.AllLeadsPage;
import page_objects.entrata_page_objects.leads_tab.add_lead_page.AddLeadPage;
import page_objects.entrata_page_objects.leads_tab.lead_profile.LeadActivityLog;

import static junit.framework.Assert.assertTrue;

public class ShouldVerifyAddLeadandLeadActivities extends BaseBrowserTest {

    public ShouldVerifyAddLeadandLeadActivities() { super("dittmarcompany"); }

    @Test
    public void shouldVerifyAddingLeadAndAddingLeadActivities_whenInTheLeadActivityLog() {
//2256647 - To verify Add Activity on lead's profile

        EntrataNavBar useNavBar = new EntrataNavBar(driver);
        assertTrue("Unable to navigate to the \"Leads\" tab!", useNavBar.clickLeadsTab());

        AllLeadsPage leadsTab = new AllLeadsPage(driver);
        assertTrue("Unable to select the \"Add Lead\" button in the \"Leads\" tab!", leadsTab.clickAddLeadLeftHandSideMenu());

        AddLeadPage useAddLeadPage = new AddLeadPage(driver);
        assertTrue("Unable to select the \"Property Search\" button in the \"Add Leads\" workflow!", useAddLeadPage.selectPropertySearch());

        assertTrue("Unable to click and search for the \"Boulder Hollow\" Property!", useAddLeadPage.searchingCavalierCourtPropertySendKeys());
        assertTrue("Unable to select the searched property \"Boulder Hollow\" in the Property Search!", useAddLeadPage.searchPropertyClickProperty());

        assertTrue("Unable to send keys to the \"Legal First Name\" field in the Add Lead Workflow!", useAddLeadPage.sendKeysToFirstNameFieldLeadManager());
        assertTrue("Unable to click and send keys to the \"Last Name\" field in the Add Lead Workflow", useAddLeadPage.lastNameTextFieldSendKeysLeadManager());
        assertTrue("Unable to click and send keys to the \"Email\" field in the Add Lead Workflow", useAddLeadPage.clickAndSendKeysToTheEmailTextBoxExists());
        assertTrue("Unable to click and send keys to the \"Phone Number\" field in the Add Lead Workflow", useAddLeadPage.addPhoneNumberSendKeys());

        assertTrue("Unable to click the \"Floor Plan\" dropdown selection in the Add Lead Workflow", useAddLeadPage.selectFloorPlanDropdown());
        assertTrue("Unable to select the \"2BR/2BA\" FloorPlan selection in the Add Lead Workflow", useAddLeadPage.selectFloorPlan2Bed2Bath());
        //  assertTrue("Unable to select the \"Lead Details\" section in the Add Lead Workflow", useAddLeadPage.clickLeadDetailsTab());
        assertTrue("Unable to select the \"Originating Lead Source\" section in the Add Lead Workflow", useAddLeadPage.clickOriginatingLeadSourceDropdown());
        assertTrue("Unable to select the \"Unknown\" \"Originating Lead Source\" option in the Add Lead Workflow", useAddLeadPage.dropdownResultsOriginatingLeadSource());

        assertTrue("Unable to select and send keys to the \"Move-In Date\" \"Month\" field in the \"Lead Details\" section of the Add Lead Workflow", useAddLeadPage.clickAndSendKeysToLeadMoveInDateMonth());
        assertTrue("Unable to select and send keys to the \"Move-In Date\" \"Day\" field in the \"Lead Details\" section of the Add Lead Workflow", useAddLeadPage.clickAndSendKeysToLeadMoveInDateDay());
        assertTrue("Unable to select and send keys to the \"Move-In Date\" \"Year\" field in the \"Lead Details\" section of the Add Lead Workflow", useAddLeadPage.clickAndSendKeysToLeadMoveInDateYear());
        assertTrue("Unable to select the \"Method of Contact\" Dropdown in the \"Lead Details\" section of the Add Lead Workflow", useAddLeadPage.selectContactMethodByValue());
        assertTrue("Unable to select the \"Result of Contact\" Dropdown in the \"Lead Details\" section of the Add Lead Workflow", useAddLeadPage.clickAndSelectResultOfContactDropdownNoResponseSent());
        assertTrue("Unable to select and send keys to the \"Notes:\" textbox for the \"Result of Contact\" in the \"Lead Details\" section of the Add Lead Workflow", useAddLeadPage.contactMethodResultNotes());

        assertTrue("Unable to select the \"Save Lead\" button in the Add Lead Workflow", useAddLeadPage.clickSaveLeadButton());
        LeadActivityLog useLeadActivityLog = new LeadActivityLog(driver);


        assertTrue("Unable to navigate to the Lead's \"Activity Log\" section!", useLeadActivityLog.clickActivityLogPage());
        assertTrue("Unable to locate the Lead's \"Lead Submitted\" event in the lead \"Activity Log\" section!", useLeadActivityLog.locateLeadSubmittedActivity());

        assertTrue("Unable to use the \"Add Activity\" Button in the Lead->\"Activity Log\" section!", useLeadActivityLog.useAddActivityButton());
        assertTrue("Unable to use the \"Event Type\" dropdown button in the Lead->\"Activity Log\" section!", useLeadActivityLog.useAddActivityEventTypeDropdown());
        assertTrue("Unable to use the \"Add Note\" selection in the Lead->\"Activity Log\"->\"Add Activity\" section!", useLeadActivityLog.selectAddNoteActivityEvent());
        assertTrue("Unable to use the \"Event Type\" dropdown button in the Lead->\"Activity Log\" section!", useLeadActivityLog.useAddActivityEventTypeDropdown());
        assertTrue("Unable to select and send keys to the \"Notes\" selection in the Lead->\"Activity Log\"->\"Add Activity\" section!", useLeadActivityLog.addActivityNotesTextField());
        assertTrue("Unable to select the \"Submit\" button for creating an Activity in the Lead->\"Activity Log\"->\"Add Activity\" section!", useLeadActivityLog.selectSubmitCreateActivityButton());

        assertTrue("Unable to use the \"Add Activity\" Button in the Lead->\"Activity Log\" section!", useLeadActivityLog.useAddActivityButton());
        assertTrue("Unable to use the \"Onsite Visit\" selection in the Lead->\"Activity Log\"->\"Add Activity\" section!", useLeadActivityLog.selectOnsiteVisitActivityEvent());
        assertTrue("Unable to select and send keys to the \"Notes\" selection in the Lead->\"Activity Log\"->\"Add Activity\" section!", useLeadActivityLog.addActivityNotesTextField());
        assertTrue("Unable to use the \"Result\" dropdown when adding the event for \"Onsite Visit in the Lead\"->\"Activity Log\"->\"Add Activity\" section!", useLeadActivityLog.clickResultOfAddActivityDropdown());
        assertTrue("Unable to use the \"Completed\" option in the \"Result\" dropdown when adding the event for \"Onsite Visit\" in the Lead\"->\"Activity Log\"->\"Add Activity\" section!", useLeadActivityLog.clickResultCompleted());
        assertTrue("Unable to select the \"Submit\" button for creating an Activity in the Lead->\"Activity Log\"->\"Add Activity\" section!", useLeadActivityLog.selectSubmitCreateActivityButton());

        assertTrue("Unable to use the \"Add Activity\" Button in the Lead->\"Activity Log\" section!", useLeadActivityLog.useAddActivityButton());
        assertTrue("Unable to use the \"Event Type\" dropdown button in the Lead->\"Activity Log\" section!", useLeadActivityLog.useAddActivityEventTypeDropdown());
        assertTrue("Unable to use the \"Incoming Call\" dropdown button in the Lead->\"Activity Log\" section!", useLeadActivityLog.selectIncomingCallActivityEvent());
        assertTrue("Unable to select and send keys to the \"Notes\" selection in the Lead->\"Activity Log\"->\"Add Activity\" section!", useLeadActivityLog.addActivityNotesTextField());
        assertTrue("Unable to use the \"Result\" dropdown when adding the event for \"Outgoing Call\"->\"Activity Log\"->\"Add Activity\" section!", useLeadActivityLog.clickResultOfAddActivityDropdown());
        assertTrue("Unable to use the \"Unqualified\" option in the \"Result\" dropdown when adding the event for \"Onsite Visit\" in the Lead\"->\"Activity Log\"->\"Add Activity\" section!", useLeadActivityLog.clickResultUnqualified());
        assertTrue("Unable to select the \"Submit\" button for creating an Activity in the Lead->\"Activity Log\"->\"Add Activity\" section!", useLeadActivityLog.selectSubmitCreateActivityButton());

        assertTrue("Unable to use the \"Add Activity\" Button in the Lead->\"Activity Log\" section!", useLeadActivityLog.useAddActivityButton());
        assertTrue("Unable to use the \"Event Type\" dropdown button in the Lead->\"Activity Log\" section!", useLeadActivityLog.useAddActivityEventTypeDropdown());
        assertTrue("Unable to use the \"Incoming Email\" dropdown button in the Lead->\"Activity Log\" section!", useLeadActivityLog.selectIncomingEmailActivityEvent());
        assertTrue("Unable to select and send keys to the \"Notes\" selection in the Lead->\"Activity Log\"->\"Add Activity\" section!", useLeadActivityLog.addActivityNotesTextField());
        assertTrue("Unable to use the \"Result\" dropdown when adding the event for \"Outgoing Call\"->\"Activity Log\"->\"Add Activity\" section!", useLeadActivityLog.clickResultOfAddActivityDropdown());
        assertTrue("Unable to use the \"Response Sent\" option in the \"Result\" dropdown when adding the event for \"Onsite Visit\" in the Lead\"->\"Activity Log\"->\"Add Activity\" section!", useLeadActivityLog.clickResultResponseSent());
        assertTrue("Unable to select the \"Submit\" button for creating an Activity in the Lead->\"Activity Log\"->\"Add Activity\" section!", useLeadActivityLog.selectSubmitCreateActivityButton());

        assertTrue("Unable to use the \"Add Activity\" Button in the Lead->\"Activity Log\" section!", useLeadActivityLog.useAddActivityButton());
        assertTrue("Unable to use the \"Event Type\" dropdown button in the Lead->\"Activity Log\" section!", useLeadActivityLog.useAddActivityEventTypeDropdown());
        assertTrue("Unable to use the \"Outgoing Call\" dropdown button in the Lead->\"Activity Log\" section!", useLeadActivityLog.selectOutgoingCallActivityEvent());
        assertTrue("Unable to select and send keys to the \"Notes\" selection in the Lead->\"Activity Log\"->\"Add Activity\" section!", useLeadActivityLog.addActivityNotesTextField());
        assertTrue("Unable to use the \"Result\" dropdown when adding the event for \"Outgoing Call\"->\"Activity Log\"->\"Add Activity\" section!", useLeadActivityLog.clickResultOfAddActivityDropdown());
        assertTrue("Unable to use the \"Unqualified\" option in the \"Result\" dropdown when adding the event for \"Onsite Visit\" in the Lead\"->\"Activity Log\"->\"Add Activity\" section!", useLeadActivityLog.clickResultUnqualified());
        assertTrue("Unable to select the \"Submit\" button for creating an Activity in the Lead->\"Activity Log\"->\"Add Activity\" section!", useLeadActivityLog.selectSubmitCreateActivityButton());

        assertTrue("Unable to use the \"Add Activity\" Button in the Lead->\"Activity Log\" section!", useLeadActivityLog.useAddActivityButton());
        assertTrue("Unable to use the \"Event Type\" dropdown button in the Lead->\"Activity Log\" section!", useLeadActivityLog.useAddActivityEventTypeDropdown());
        assertTrue("Unable to use the \"Incoming Text\" dropdown button in the Lead->\"Activity Log\" section!", useLeadActivityLog.selectIncomingTextActivityEvent());
        assertTrue("Unable to select and send keys to the \"Notes\" selection in the Lead->\"Activity Log\"->\"Add Activity\" section!", useLeadActivityLog.addActivityNotesTextField());
        assertTrue("Unable to use the \"Result\" dropdown when adding the event for \"Outgoing Call\"->\"Activity Log\"->\"Add Activity\" section!", useLeadActivityLog.clickResultOfAddActivityDropdown());
        assertTrue("Unable to use the \"Response Sent\" option in the \"Result\" dropdown when adding the event for \"Onsite Visit\" in the Lead\"->\"Activity Log\"->\"Add Activity\" section!", useLeadActivityLog.clickResultResponseSent());
        assertTrue("Unable to select the \"Submit\" button for creating an Activity in the Lead->\"Activity Log\"->\"Add Activity\" section!", useLeadActivityLog.selectSubmitCreateActivityButton());

        assertTrue("Unable to use the \"Add Activity\" Button in the Lead->\"Activity Log\" section!", useLeadActivityLog.useAddActivityButton());
        assertTrue("Unable to use the \"Event Type\" dropdown button in the Lead->\"Activity Log\" section!", useLeadActivityLog.useAddActivityEventTypeDropdown());
        assertTrue("Unable to use the \"Outgoing Text\" dropdown button in the Lead->\"Activity Log\" section!", useLeadActivityLog.selectOutgoingTextActivityEvent());
        assertTrue("Unable to select and send keys to the \"Notes\" selection in the Lead->\"Activity Log\"->\"Add Activity\" section!", useLeadActivityLog.addActivityNotesTextField());
        assertTrue("Unable to use the \"Result\" dropdown when adding the event for \"Outgoing Call\"->\"Activity Log\"->\"Add Activity\" section!", useLeadActivityLog.clickResultOfAddActivityDropdown());
        assertTrue("Unable to use the \"Unqualified\" option in the \"Result\" dropdown when adding the event for \"Onsite Visit\" in the Lead\"->\"Activity Log\"->\"Add Activity\" section!", useLeadActivityLog.clickResultUnqualified());
        assertTrue("Unable to select the \"Submit\" button for creating an Activity in the Lead->\"Activity Log\"->\"Add Activity\" section!", useLeadActivityLog.selectSubmitCreateActivityButton());


        assertTrue("Unable to use the \"Add Activity\" Button in the Lead->\"Activity Log\" section!", useLeadActivityLog.useAddActivityButton());
        assertTrue("Unable to use the \"Event Type\" dropdown button in the Lead->\"Activity Log\" section!", useLeadActivityLog.useAddActivityEventTypeDropdown());
        assertTrue("Unable to use the \"Self Guided Tour\" dropdown button in the Lead->\"Activity Log\" section!", useLeadActivityLog.selectSelfGuidedTourActivityEvent());
        assertTrue("Unable to select and send keys to the \"Notes\" selection in the Lead->\"Activity Log\"->\"Add Activity\" section!", useLeadActivityLog.addActivityNotesTextField());
        assertTrue("Unable to use the \"Result\" dropdown when adding the event for \"Outgoing Call\"->\"Activity Log\"->\"Add Activity\" section!", useLeadActivityLog.clickResultOfAddActivityDropdown());
        assertTrue("Unable to use the \"Completed\" option in the \"Result\" dropdown when adding the event for \"Onsite Visit\" in the Lead\"->\"Activity Log\"->\"Add Activity\" section!", useLeadActivityLog.clickResultCompleted());
        assertTrue("Unable to use the \"Property Tour\" Yes/No Toggle when adding the event for \"Self-Guided Tour\" in the Lead\"->\"Activity Log\"->\"Add Activity\" section!", useLeadActivityLog.selectPropertyTourYesNoToggle());
        assertTrue("Unable to select the \"Submit\" button for creating an Activity in the Lead->\"Activity Log\"->\"Add Activity\" section!", useLeadActivityLog.selectSubmitCreateActivityButton());


    }
}
