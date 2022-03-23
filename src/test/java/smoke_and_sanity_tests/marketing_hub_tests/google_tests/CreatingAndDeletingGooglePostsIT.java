package smoke_and_sanity_tests.marketing_hub_tests.google_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.tools_tab.marketing_hub_subtab.MarketingHubNav;
import page_objects.entrata_page_objects.tools_tab.marketing_hub_subtab.google_tab.google_posts_subtab.GooglePostsSubtab;
import page_objects.entrata_page_objects.tools_tab.marketing_hub_subtab.google_tab.google_posts_subtab.GooglePostsModal;

import static org.junit.Assert.assertTrue;

public class CreatingAndDeletingGooglePostsIT extends BaseBrowserTest {

    public CreatingAndDeletingGooglePostsIT() {
        super("dittmarcompany");
    }

    @Test
    public void shouldVerifyWhatsNewPost_whenCreatingNewGooglePost() {
        //Testcase 3176077 1/3

        //Navigate to Google tab of Marketing hub
        EntrataNavBar entrataNavBar = new EntrataNavBar(driver);
        MarketingHubNav marketingHubNav = new MarketingHubNav(driver);
        assertTrue("Unable to move to the 'Tools' tab.", entrataNavBar.moveToToolsTab());
        assertTrue("Unable to select the 'Marketing Hub' subtab from the tools list.", entrataNavBar.clickMarketingHubSubTab());
        assertTrue("Unable to select the 'Google' subtab of Marketing Hub.", marketingHubNav.clickGoogleTab());

        //Create a "What's new" post.
        GooglePostsSubtab googlePostsSubtab = new GooglePostsSubtab(driver);
        GooglePostsModal googlePostsModal = new GooglePostsModal(driver);
        assertTrue("Unable to select the 'Posts' subtab of the Google subtab.", googlePostsSubtab.clickGooglePostsSubTab_GooglePosts());
        assertTrue("Unable to select the 'Create Post' on the subtab of Google Posts.", googlePostsSubtab.clickCreatePost());
        assertTrue("Unable to click the 'Add Photo' option of the New Google Post modal.", googlePostsModal.clickAddPhotoOption());
        assertTrue("Unable to select the test photo of an airplane from the media library.", googlePostsModal.clickF35Photo());
        assertTrue("Unable to select the 'Use Selected' button from the Media Library.", googlePostsModal.clickUseSelectedButton());
        assertTrue("Unable to enter text into the 'Write your post' field of the New Google Post modal.", googlePostsModal.enterGenericMessageText());
        assertTrue("Unable to click the post button.", googlePostsModal.clickPostButton());

        //Confirm the Post saved correctly and then delete it. Then finally confirm it was deleted correctly.
        assertTrue("Post did not save correctly.", googlePostsSubtab.confirmAutomationTestSavedCorrectly());
        assertTrue("Unable to click the edit button.", googlePostsSubtab.clickFirstGooglePostEditButton());
        assertTrue("Unable to click the delete button.", googlePostsModal.clickDeletePostButton());
        assertTrue("Unable to click the confirm delete button.", googlePostsModal.clickConfirmDeleteButton());
        assertTrue("The Post was not deleted Properly.", googlePostsSubtab.confirmPostDeletedSuccessfullyMessageIsDisplayed());

    }

}