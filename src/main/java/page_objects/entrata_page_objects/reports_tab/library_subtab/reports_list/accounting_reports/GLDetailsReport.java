package page_objects.entrata_page_objects.reports_tab.library_subtab.reports_list.accounting_reports;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.entrata_page_objects.reports_tab.ReportsBasePage;

public class GLDetailsReport extends ReportsBasePage {
    
        private final By REPORT_LINK = By.cssSelector("li[data-report-title ='GL Details'] a");
        private final By LOOK_FOR_CHART_OF_ACCOUNTS_OR_MASKED_DROPDOWN = By.xpath("//*[@id=\"gl_tree_ids\"]");
        private final By LOOK_FOR_SELECT_GL_ACCOUNTS_FILTER = By.id("accounts");
        private final By LOOK_FOR_GL_ACCOUNTS_ALL_OPTIONS = By.xpath("//*[@id=\"gl_account_ids_list\"]/div/span");
        private final By LOOK_FOR_PERIOD_FILTER = By.id("period_filter_range");
        private final By LOOK_FOR_USE_ALT_YEAR_FILTER = By.id("use_alternative_year_end");
        private final By LOOK_FOR_GL_BOOKS_FILTER = By.id("gl_book_ids_list");
        private final By LOOK_FOR_ACCOUNT_METHOD_FILTER = By.id("accounting_method");
        private final By LOOK_FOR_CONSOLIDATE_BY_FILTER = By.id("consolidate_properties");
        private final By LOOK_FOR_BEGINNING_BALANCE_FILTER = By.id("beginning_balances");
        private final By LOOK_FOR_SHOW_GL_ACCOUNTS_TOGGLE = By.id("show_gl_accounts");
        private final By LOOK_FOR_TRANSACTION_TYPES_FILTER = By.id("transaction_types_list");
        private final By LOOK_FOR_SUMMARIZE_BY_GL_ACCOUNT_FILTER = By.id("summarize_by_gl_account_filter");
        private final By LOOK_FOR_SUMMARIZE_BY_TRANSACTION_TYPES = By.id("summarize_transaction_types_label");
        private final By LOOK_FOR_INCLUDE_PAUSED_JOURNAL_ENTRIES_TOGGLE = By.id("include_paused_journal_entries");
        private final By LOOK_FOR_CUSTOM_TAGS_FILTER = By.id("custom_tags_list");
        private final By LOOK_FOR_RESET_BUTTON = By.xpath("//*[@id=\"report_form\"]/fieldset/div/div[5]/span/a");
        private final By ADD_BUTTON_IN_PROPERTY_GROUPS = By.id("addbutton");
        private final By TYPE_PROPERTY_NAME_IN_PROPERTY_GROUPS = By.id("test");
        private final By ADD_PROPERTY_TO_PROPERTY_GROUPS = By.cssSelector("li[data-listid='679024'] > label > i");
        private final By ADD_ALL_GL__ACCOUNTS = By.name("report_filter[gl_account_ids]");
        private final By CLICK_ON_DISPLAY_OPTIONS = By.id("display_options");
        private final By LOOK_FOR_PRIMARY_SORT = By.id("primary_sort");
        private final By LOOK_FOR_PRIMARY_SORT_ASC = By.cssSelector("#report_form > fieldset > div > div.js-tab-display.white.overflow-y-scroll > div.clearfix > div:nth-child(2) > div > div:nth-child(2) > ul > li.selected.binded");
        private final By LOOK_FOR_PRIMARY_SORT_DSC = By.cssSelector("#report_form > fieldset > div > div.js-tab-display.white.overflow-y-scroll > div.clearfix > div:nth-child(2) > div > div:nth-child(2) > ul > li:nth-child(2)");
        private final By LOOK_FOR_SECONDARY_SORT = By.id("secondary_sort");
        private final By LOOK_FOR_SECONDARY_SORT_ASC = By.cssSelector("#report_form > fieldset > div > div.js-tab-display.white.overflow-y-scroll > div.clearfix > div:nth-child(2) > div > div:nth-child(3) > ul > li.binded.selected");
        private final By LOOK_FOR_SECONDARY_SORT_DSC = By.cssSelector("#report_form > fieldset > div > div.js-tab-display.white.overflow-y-scroll > div.clearfix > div:nth-child(2) > div > div:nth-child(3) > ul > li:nth-child(2)");
        private final By LOOK_FOR_SUBTITLE = By.cssSelector("#report_form > fieldset > div > div.js-tab-display.white.overflow-y-scroll > div.clearfix > div:nth-child(2) > div > div:nth-child(4) > select");
        private final By GL_ACCOUNTS_FILTER_OVERLAY = By.cssSelector(".loading-overlay");

        public GLDetailsReport(WebDriver driver) {
            super(driver);
        }

        public boolean clickOnGLDetailsReport() {
            return clickElement(REPORT_LINK, waitTimes.LONG_WAIT);
        }
        // Checking for all Default Filters
        public boolean checkChartOfAccountsOrMask() {
            return confirmElementIsVisible(LOOK_FOR_CHART_OF_ACCOUNTS_OR_MASKED_DROPDOWN);
        }
        public boolean checkSelectGLAccounts() {
            return confirmElementIsVisible(LOOK_FOR_SELECT_GL_ACCOUNTS_FILTER);
        }
        public boolean checkGLAccountsAllOptions() {
            return confirmElementIsVisible(LOOK_FOR_GL_ACCOUNTS_ALL_OPTIONS);
        }
        public boolean checkPeriod() {
            return confirmElementIsVisible(LOOK_FOR_PERIOD_FILTER);
        }
        public boolean checkUseAltYearEnd() {
            return confirmElementIsVisible(LOOK_FOR_USE_ALT_YEAR_FILTER);
        }
        public boolean checkGLBooks() {
            return confirmElementIsVisible(LOOK_FOR_GL_BOOKS_FILTER);
        }
        public boolean checkAccountingMethod() {
            return confirmElementIsVisible(LOOK_FOR_ACCOUNT_METHOD_FILTER);
        }
        public boolean checkConsolidateBy() {
            return confirmElementIsVisible(LOOK_FOR_CONSOLIDATE_BY_FILTER);
        }
        public boolean checkBeginningBalancesToggle() {
            return confirmElementIsVisible(LOOK_FOR_BEGINNING_BALANCE_FILTER);
        }

        public boolean checkShowGLAccounts() {
            return confirmElementIsVisible(LOOK_FOR_SHOW_GL_ACCOUNTS_TOGGLE);
        }
        public boolean checkTransactionTypes() {
            return confirmElementIsVisible(LOOK_FOR_TRANSACTION_TYPES_FILTER);
        }
        public boolean checkSummarizeByGLAccount() {
            return confirmElementIsVisible(LOOK_FOR_SUMMARIZE_BY_GL_ACCOUNT_FILTER);
        }
        public boolean checkSummarizeTransactionTypes() {
            return confirmElementIsVisible(LOOK_FOR_SUMMARIZE_BY_TRANSACTION_TYPES);
        }
        public boolean checkIncludePausedJournalEntries() {
            return confirmElementIsVisible(LOOK_FOR_INCLUDE_PAUSED_JOURNAL_ENTRIES_TOGGLE);
        }
        public boolean checkCustomTags() {
            return confirmElementIsVisible(LOOK_FOR_CUSTOM_TAGS_FILTER);
        }
        public boolean checkResetButton() {
            return confirmElementIsVisible(LOOK_FOR_RESET_BUTTON);
        }

        // Entering Property & GL Accounts so we can click into the Display Options Tab
        public boolean clickOnaddProperty() {
            return clickElement(ADD_BUTTON_IN_PROPERTY_GROUPS, waitTimes.LONG_WAIT);
        }
        public boolean sendKeysPropertyName() {
            return sendKeysToElement(TYPE_PROPERTY_NAME_IN_PROPERTY_GROUPS, "60 Jane Lane");
        }
        public boolean clickProperty() {
            return clickElement(ADD_PROPERTY_TO_PROPERTY_GROUPS,waitTimes.LONG_WAIT);
        }
        public boolean clickAllGLAccounts() {
            filterOverlay();
            return clickElement(ADD_ALL_GL__ACCOUNTS, waitTimes.LONG_WAIT);
        }
        //Filter Overlay
        private void filterOverlay () {waitForOverlay(GL_ACCOUNTS_FILTER_OVERLAY); }

        // Display Options
        public boolean clickDisplayOptions() {
            return clickElement(CLICK_ON_DISPLAY_OPTIONS, waitTimes.LONG_WAIT);
        }
        public boolean checkPrimarySort() {
            return confirmElementIsVisible(LOOK_FOR_PRIMARY_SORT, waitTimes.LONG_WAIT);
        }
        public boolean checkPrimarySortAsc() {
            return confirmElementIsVisible(LOOK_FOR_PRIMARY_SORT_ASC);
        }
        public boolean checkPrimarySortDsc() {
            return confirmElementIsVisible(LOOK_FOR_PRIMARY_SORT_DSC);
        }
        public boolean checkSecondarySort() {
            return confirmElementIsVisible(LOOK_FOR_SECONDARY_SORT);
        }
        public boolean checkSecondarySortAsc() {
            return confirmElementIsVisible(LOOK_FOR_SECONDARY_SORT_ASC);
        }
        public boolean checkSecondarySortDsc() {
            return confirmElementIsVisible(LOOK_FOR_SECONDARY_SORT_DSC);
        }
        public boolean checkSubtitle() {
            return confirmElementIsVisible(LOOK_FOR_SUBTITLE);
        }
}
