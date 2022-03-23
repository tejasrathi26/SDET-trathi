package smoke_and_sanity_tests.doc_management;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.tools_tab.documents_subtab.DocumentSearchSubtab;

import static org.junit.Assert.assertTrue;

public class ShouldLoadDocumentSearchPageWhenNavigatingToDocumentsIT extends BaseBrowserTest {

    public ShouldLoadDocumentSearchPageWhenNavigatingToDocumentsIT(){
        super("derapid");
    }

    @Test
    public void ShouldLoadDocumentSearchPageWhenNavigatingToDocumentsIT() {

        EntrataNavBar entrataNavigation = new EntrataNavBar(driver);
        DocumentSearchSubtab documentSearch = new DocumentSearchSubtab(driver);

        assertTrue("Unable to click Tools button",entrataNavigation.clickToolsTab());
        assertTrue("Unable to click Documents tab", entrataNavigation.clickDocumentsTab());
        assertTrue("Unable to find Category dropdown", documentSearch.findCategoryDropdown());
        assertTrue("Unable to find Add Properties button", documentSearch.findAddProperties());
        assertTrue("Unable to find Document Types 'All Options' checkbox", documentSearch.findDocumentTypesAllOptions());
        assertTrue("Unable to find 'Add Search Options'", documentSearch.findAddSearchOptions());
        assertTrue("Unable to find Search button", documentSearch.findSearchButton());

    }

}
