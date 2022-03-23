package smoke_and_sanity_tests.message_center;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.tools_tab.message_center_subtab.message_center_product_navigation.MessageCenterCreateNewListGeneralNav;
import page_objects.entrata_page_objects.tools_tab.message_center_subtab.message_center_product_navigation.MessageCenterNav;
import page_objects.entrata_page_objects.tools_tab.message_center_subtab.message_center_product_navigation.MyLists;

import static junit.framework.Assert.assertTrue;

public class ShouldCreateAndValidateListGenerationIT extends BaseBrowserTest {

//Constructor
    public ShouldCreateAndValidateListGenerationIT() { super("dittmarcompany"); }

    @Test
    public void shouldCreateAndValidateListGeneration_whenInMessageCenter() {
// Message Center Test ID: 2226992 - To validate create & update list in Message Center

        EntrataNavBar useEntrataNavBar = new EntrataNavBar(driver);
        assertTrue("Unable to navigate to the Tools tab in Dashboard -> Tools!", useEntrataNavBar.clickToolsTab());
        assertTrue("Couldn't navigate to the Message Center area under Tools!", useEntrataNavBar.clickMessageCenterSubTab());

        MessageCenterNav messageCenterSmokeNavigation = new MessageCenterNav(driver);
        assertTrue("Unable to open the create new MC item box!", messageCenterSmokeNavigation.createNewMessageCenterItem());

        MessageCenterCreateNewListGeneralNav useMessageCenterCreateListGeneral = new MessageCenterCreateNewListGeneralNav(driver);
        assertTrue("Unable to use the Create New MC List option!", messageCenterSmokeNavigation.messageCenterSelectCreateListOption());
        assertTrue("Unable to select and enter keys into the \"Name this List:\" field!",
                useMessageCenterCreateListGeneral.messageCenterCreateNewListNameThisList());

        assertTrue("Unable to select the \"Select Recipients:\" dropdown option!",
                useMessageCenterCreateListGeneral.messageCenterCreateNewListSelectRecipients());

        assertTrue("Unable to select the Recipient type \"Leads and Applicants\"!"
                , useMessageCenterCreateListGeneral.messageCenterCreateNewListSelectRecipientsTypeLeadsAndApplicants());
        assertTrue("Unable to enter re-click the \"Select Recipients:\" dropdown option after selecting the List Type!",
                useMessageCenterCreateListGeneral.messageCenterCreateNewListSelectRecipients());

        assertTrue("Unable to use the \"Save and Continue\" option in the 1st page \"(Select Recipients)\" of the create list screen!"
                , useMessageCenterCreateListGeneral.messageCenterCreateNewListSaveAndContinue());

        assertTrue("Unable to use the \"Save and Continue\" option in the 2nd page \"(Select Properties)\" of the create list screen!"
                , useMessageCenterCreateListGeneral.messageCenterCreateNewListSaveAndContinuePage2());

        assertTrue("Unable to use the Generate List option in the create list Screen!",
                useMessageCenterCreateListGeneral.messageCenterCreateNewListGenerateList());

        assertTrue("Unable to use the Save List option!", useMessageCenterCreateListGeneral.generateListSaveList());

        MyLists useMyLists = new MyLists(driver);
        assertTrue("Unable to navigate to the Message Center My Lists after saving the new list!", useMyLists.navigateToMyLists());
        assertTrue("Unable to locate the newly created list!", messageCenterSmokeNavigation.viewNewlyCreatedList());

        assertTrue("Couldn't navigate to the Message Center area under Tools!", useEntrataNavBar.clickMessageCenterSubTab());
        assertTrue("Unable to open the create new Message Center item box!", messageCenterSmokeNavigation.createNewMessageCenterItem());

        assertTrue("Unable to use the Create New Message Center List option!", messageCenterSmokeNavigation.messageCenterSelectCreateListOption());

        assertTrue("Unable to enter keys into the \"Name this List\" option!",
                useMessageCenterCreateListGeneral.messageCenterCreateNewListNameThisList2());

        assertTrue("Unable to enter keys into the \"Name this List\" option!",
                useMessageCenterCreateListGeneral.messageCenterCreateNewListSelectRecipients());

        assertTrue("Unable to select the Recipient type \"Residents\"!"
                , useMessageCenterCreateListGeneral.messageCenterCreateNewListSelectRecipientsTypeResidents());

        assertTrue("Unable to enter recheck the recipients dropdown option",
                useMessageCenterCreateListGeneral.messageCenterCreateNewListSelectRecipients());

        assertTrue("Unable to use the First Save and Continue option in create list screen!"
                , useMessageCenterCreateListGeneral.messageCenterCreateNewListSaveAndContinue());

        assertTrue("Unable to use the Second Save and Continue option in create list screen!",
                useMessageCenterCreateListGeneral.messageCenterCreateNewListSaveAndContinuePage2());

        assertTrue("Unable to use the Generate List option in the create list Screen!",
                useMessageCenterCreateListGeneral.messageCenterCreateNewListGenerateList());

        assertTrue("Unable to use the Save List option!", useMessageCenterCreateListGeneral.generateListSaveList());
        assertTrue("Unable to navigate to the Message Center My Lists after saving the new list!", useMyLists.navigateToMyLists());
        assertTrue("Unable to locate the newly created list!", messageCenterSmokeNavigation.viewNewlyCreatedList2());


    }
}
