package smoke_and_sanity_tests.client_admin_tests.training_and_knowledge_base;
import base_tests.BaseBrowserTest;
import base_tests.SitesEnum;
import org.junit.Test;
import page_objects.client_admin_page_objects.ClientAdminNavBar;
import page_objects.client_admin_page_objects.support_tab.knowledge_base_subtab.AddExistingContentPopup;
import page_objects.client_admin_page_objects.support_tab.knowledge_base_subtab.AddTrainingCoursePage;
import page_objects.client_admin_page_objects.support_tab.knowledge_base_subtab.KnowledgeBasePage;
import page_objects.client_admin_page_objects.support_tab.knowledge_base_subtab.ViewContentPage;

import static junit.framework.Assert.assertTrue;

public class AddCourseContentIT extends BaseBrowserTest {
    public AddCourseContentIT() {
        super("clientadmin", SitesEnum.CLIENTADMIN, "dworwood", "Entrata123");
    }

    @Test
    public void shouldCheckAddCourseContentButton_whenCourseContentButtonIsSelected() throws InterruptedException {
        ClientAdminNavBar clientNavBar = new ClientAdminNavBar(driver);
        assertTrue("Unable to locate/select 'Support' tab.",clientNavBar.moveToSupportMenu());
        assertTrue("Unable to locate/select 'Knowledge Base' sub-tab.",clientNavBar.clickKnowledgeBaseListItem());
        KnowledgeBasePage knowledgePage = new KnowledgeBasePage(driver);
        assertTrue("Unable to locate/select 'Add Training Course' button.",knowledgePage.clickAddTrainingCourseButton());
        AddTrainingCoursePage addTrainingCoursePage = new AddTrainingCoursePage(driver);
        assertTrue( "Unable to find Training Course Title field", addTrainingCoursePage.enterTrainingCourseTitle());
        assertTrue("Unable to find Training Course Description",addTrainingCoursePage.enterTrainingCourseDescription());
        assertTrue("Unable to click first checkbox in relevant topics",addTrainingCoursePage.clickFirstCheckboxInRelevantLocations());
        assertTrue("Unable to enter relevant keywords in add training course page", addTrainingCoursePage.enterRelevantKeywords());
        assertTrue("Unable to select advanced budgeting relvant product checkbox",addTrainingCoursePage.clickAdvancedBudgetingRelevantProduct());
        assertTrue("Unable to click save and next button",addTrainingCoursePage.clickSaveAndNextButton());
        ViewContentPage viewContentPage = new ViewContentPage(driver);
        assertTrue("Unable to click add content button", viewContentPage.clickAddContentButton());
        AddExistingContentPopup addExistingContentPopup = new AddExistingContentPopup(driver);
        assertTrue("unable to select first option from add existing content field",addExistingContentPopup.clickFirstCheckBoxOfAddExistingContact());
        assertTrue("Unable to click Add to course button on add existing content popup", addExistingContentPopup.clickAddToCourse());
        assertTrue("Unable to click quiz tab",viewContentPage.clickQuizTab());
        assertTrue("Unable to click create new question on quiz tab",viewContentPage.clickCreateQuizQuestion());
        assertTrue("Unable to enter question in question field", viewContentPage.enterQuestion());
        assertTrue("Unable to enter answer one",viewContentPage.enterAnswerOne());
        assertTrue("Unable to enter answer two",viewContentPage.enterAnswerTwo());
        assertTrue("Unable to indicate answer one as correct answer", viewContentPage.clickCorrectAnswerOne());
        assertTrue("Unable to click Save Add Question Button",viewContentPage.clickSaveAddQuestionButton());

    }
}
