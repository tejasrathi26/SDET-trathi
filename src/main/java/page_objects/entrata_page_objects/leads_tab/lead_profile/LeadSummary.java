package page_objects.entrata_page_objects.leads_tab.lead_profile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;
import utils.RandomGenerator;

public class LeadSummary extends BasePage {

    public LeadSummary(WebDriver driver) {
        super(driver);
    }

    //Overlay Selector
    private final By LOADING_OVERLAY = By.cssSelector("div[class='loading-overlay bg-img-medium']");

    //Lead Tabs Selectors
    private final By LEAD_SUMMARY_TAB = By.id("application_summary_system_tab");
    private final By LEAD_DOCUMENTS_TAB = By.id("application_documents_tab_tab");

    //Lead Contact Button Selectors
    private final By LEAD_PROFILE_EMAIL_BUTTON = By.id("show-email-modal");

    //More Actions Dropdown Selectors
    private final By MORE_ACTIONS_DROPDOWN = By.cssSelector("a[class='button action menu nomargin more-actions binded binded-hover-intent']");
    private final By CANCEL_LEAD_BUTTON = By.xpath("//li[text()='Cancel Lead']");

    //Cancel Lead Workflow Selectors
    private final By REASON_FOR_CANCELLING_DROPDOWN = By.id("list_item_id");
    private final By CANCEL_LEAD_FINALIZE_BUTTON = By.id("activeCloseBtn");

    //Cancellation Reasons Selectors
    private final By OTHER_CANCELLATION_REASON = By.xpath("//option[text()='Other']");

    //Status Selectors
    private final By OVERLAY_BEFORE_STATUS_TEXT = By.cssSelector("div[class='loading-overlay bg-img-small']");
    private final By APPLICATION_STARTED_STATUS_TEXT = By.xpath("//*[text()='Application: Started']");

    //"Important Information" Selectors
    private final By EDIT_IMPORTANT_INFORMATION = By.id("js-imp-info");
    private final By EDIT_IMPORTANT_INFO_CLOSE_BUTTON = By.xpath("/html/body/div[12]/div[1]/button");

    //Preferences Selectors
    private final By EDIT_PREFERENCES_BUTTON = By.id("preferences_edit");
    private final By CANCEL_PREFERENCES_BUTTON = By.xpath("//*[@id=\"application_preferences\"]/div/div[2]/div/a");

    //Affordable specific locators
    RandomGenerator rand = new RandomGenerator();
    private final By START_CERTIFICATION = By.xpath("//*[contains(@onclick, 'start_certification')]");
    private final By ENTER_CERTIFICATION_INFO_BELOW_BUTTON = By.cssSelector("#step-2 > div:nth-child(2) > div > ul > li > a");
    private final By MIDDLE_NAME_CHECKBOX = By.cssSelector("input[name='applicant[has_middle_name]']");
    private final By EMAIL_MEMBER_TAB = By.cssSelector("input[name='applicant[username]']");
    private final By PHONE_NUMBER_MEMBER_TAB = By.id("applicant[customer_phone_numbers][primary_phone_number][0][phone_number]-base");
    private final By SSN_NUMBER_MEMBER_TAB = By.cssSelector("input[name='applicant[tax_number]']");
    private final By CERTIFICATION_COMPLETE_STATUS = By.xpath("//div/h4[text()='Certification: Complete']");
    private final By MARK_COMPLETE_BUTTON = By.className("js-mark-complete");
    private String PHONE_NUMBER = rand.randomPhoneNumber();
    private String EMAIL = rand.randomEmail();
    private String SSN = rand.randomSocialSecurityNumber();

    private final By CLOSE_LEAD_SUMMARY = By.cssSelector("i[class='close-button close']");

    //Renters Insurance Selectors
    private final By ADD_POLICY_BUTTON = By.id("edit_renters_insurance");
    private final By PROVIDER_DROPDOWN = By.id("selected_provider");
    private final By POLICY_NUMBER = By.id("policy_number");
    private final By INSURANCE_START_DATE_DATEPICKER = By.xpath("//*[@id=\"insuranceEdit\"]/div[1]/div/dl[3]/dd/div[2]");
    private final By INSURANCE_END_DATE_DATEPICKER = By.xpath("//*[@id=\"insuranceEdit\"]/div[1]/div/dl[4]/dd/div[2]");
    private final By LIABILITY = By.cssSelector("input[name='resident_insurance_policy[custom_personal_limit]']");
    private final By PERSONAL_CONTENTS = By.cssSelector("input[name='resident_insurance_policy[custom_personal_limit]']");
    private final By DEDUCTIBLE = By.cssSelector("input[name='resident_insurance_policy[custom_deductible]']");
    private final By PROOF_OF_COVERAGE_UPLOAD = By.id("upload-doc");
    private final By INSURANCE_VERIFIED_YES = By.id("radio1");
    private final By INSURANCE_VERIFIED_NO = By.id("radio2");
    private final By INSURANCE_SAVE_BUTTON = By.id("btn_save");

    //Leads Tab Methods
    public boolean locateLeadSummaryTab() {waitForOverlay(LOADING_OVERLAY); return confirmElementIsVisible(LEAD_SUMMARY_TAB);}
    public boolean locateDocumentsTab() {return confirmElementIsVisible(LEAD_DOCUMENTS_TAB);}

    //Lead Contact Button Methods
    public boolean clickEmailButton() {return clickElement(LEAD_PROFILE_EMAIL_BUTTON);}

    //More Actions Dropdown Methods
    public boolean clickMoreActionsDropdown() {waitForPotentialOverlayLeadSummaryScreen(); return clickElement(MORE_ACTIONS_DROPDOWN);}
    public boolean clickCancelLeadButton() {return clickElement(CANCEL_LEAD_BUTTON);}

    //Cancel Lead Workflow Methods
    public boolean clickReasonForCancellingDropdown() {return clickElement(REASON_FOR_CANCELLING_DROPDOWN);}
    public boolean clickCancelLeadFinalizeButton() {return clickElement(CANCEL_LEAD_FINALIZE_BUTTON);}

    //Cancellation Reasons Methods
    public boolean clickOtherCancellationReason() {return clickElement(OTHER_CANCELLATION_REASON);}

    //Status Methods
    public boolean applicationStartedStatusTextVisible(){
        waitForOverlay(OVERLAY_BEFORE_STATUS_TEXT);
        return confirmElementIsVisible(APPLICATION_STARTED_STATUS_TEXT);
    }

    //Screening Specific Variables
    private final By PROCESS_SCREENING_BUTTON = By.id("process-load-screening-applicants");
    private final By PROCESS_SCREENING_WINDOW_PROCESS_SCREENING_BUTTON = By.id("btn_process_screening");

    //Screening Specific Methods
    public boolean clickProcessScreening() {
        return clickElement(PROCESS_SCREENING_BUTTON);
    }
    public boolean processScreeningWindowProcessScreeningButtonIsVisible() {
        return confirmElementIsVisible(PROCESS_SCREENING_WINDOW_PROCESS_SCREENING_BUTTON);
    }

    //"Important Information" Methods
    public boolean click_EditImportantInformationButton() {return clickElement(EDIT_IMPORTANT_INFORMATION);}
    public boolean click_CloseImportantInformationButton() {return clickElement(EDIT_IMPORTANT_INFO_CLOSE_BUTTON);}

    //Preferences Button Methods
    public boolean click_EditPreferencesButton() {return clickElement(EDIT_PREFERENCES_BUTTON);}
    public boolean click_CancelPreferencesButton() {return clickElement(CANCEL_PREFERENCES_BUTTON);}

    //Affordable specific methods
    public boolean clickStartCertificationButton() {
        return clickElement(START_CERTIFICATION);
    }

    public boolean clickEnterCertificationInfoBelowButton() {
        waitForOverlayEnterCertificationInfo();
        return clickElement(ENTER_CERTIFICATION_INFO_BELOW_BUTTON, waitTimes.LONG_WAIT);
    }

    public boolean clickMiddleNameCheckbox() {
        return clickElement(MIDDLE_NAME_CHECKBOX);
    }

    public boolean enterEmailMemberTab() {
        return sendKeysToElement(EMAIL_MEMBER_TAB, EMAIL);
    }

    public boolean enterPhoneNumberMemberTab() {
        return sendKeysToElement(PHONE_NUMBER_MEMBER_TAB, PHONE_NUMBER);
    }

    public boolean enterSocialSecurityNumber() {
        return sendKeysToElement(SSN_NUMBER_MEMBER_TAB, SSN);
    }

    public boolean clickMarkCompleteButton() {
        return clickElement(MARK_COMPLETE_BUTTON);
    }

    public String  confirmCertificationCompleteStatus() {
        return getElementText(CERTIFICATION_COMPLETE_STATUS);
    }

    public boolean clickCloseOnLeadSummary() {
        return clickElement(CLOSE_LEAD_SUMMARY);
    }

    private void waitForOverlayEnterCertificationInfo() {
        waitForOverlay(LOADING_OVERLAY);
    }

    //Renters Insurance Methods
    public boolean clickAddPolicyButton() { return clickElement(ADD_POLICY_BUTTON); }

    public boolean findProviderDropdown() { return confirmElementIsVisible(PROVIDER_DROPDOWN); }

    public boolean findPolicyNumberField() { return confirmElementIsVisible(POLICY_NUMBER); }

    public boolean findInsuranceStartDate() { return confirmElementIsVisible(INSURANCE_START_DATE_DATEPICKER); }

    public boolean findInsuranceEndDate() { return confirmElementIsVisible(INSURANCE_END_DATE_DATEPICKER); }

    public boolean findLiabilityField() { return confirmElementIsVisible(LIABILITY); }

    public boolean findPersonalContentsField() { return confirmElementIsVisible(PERSONAL_CONTENTS); }

    public boolean findDeductibleField() { return confirmElementIsVisible(DEDUCTIBLE); }

    public boolean findProofOfCoverageUpload() { return confirmElementIsVisible(PROOF_OF_COVERAGE_UPLOAD); }

    public boolean findInsuranceVerifiedYes() { return confirmElementIsVisible(INSURANCE_VERIFIED_YES); }

    public boolean findInsuranceVerifiedNo() { return confirmElementIsVisible(INSURANCE_VERIFIED_NO); }

    public boolean findInsuranceSaveButton() { return confirmElementIsVisible(INSURANCE_SAVE_BUTTON); }

    //Overlay Method
    private void waitForPotentialOverlayLeadSummaryScreen() { waitForOverlay(LOADING_OVERLAY);}

}
