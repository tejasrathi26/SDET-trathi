package smoke_and_sanity_tests.client_admin_tests.client_admin_task_management;

import base_tests.BaseBrowserTest;
import base_tests.SitesEnum;
import org.junit.Test;
import page_objects.client_admin_page_objects.ClientAdminNavBar;
import page_objects.client_admin_page_objects.tasks_tab.add_task.AddTaskPage;

import static org.junit.Assert.*;

public class ValidateAddTaskFunctionalityIT extends BaseBrowserTest {
    public ValidateAddTaskFunctionalityIT(){
        super("clientadmin", SitesEnum.CLIENTADMIN,"bliddell","Xento123");}
    @Test
    public void shouldValidateAddTaskFunctionality_whenAddTaskIsClickedOn(){
        ClientAdminNavBar nav = new ClientAdminNavBar(driver);
        AddTaskPage addTaskPage = new AddTaskPage(driver);
        assertTrue("cannot find tasks tab",nav.moveToTasksTab());
        assertTrue("cannot click add task",nav.clickAddTask());
        assertTrue("unable to select feature task type", addTaskPage.selectFeatureDropdown());
        assertTrue("unable to click create task", addTaskPage.clickCreateTaskButton());
        assertEquals("error message does not match","Description is required. Product is required. Assigned To is required. Please select task impact.",addTaskPage.getErrorMessage());
    }


}
