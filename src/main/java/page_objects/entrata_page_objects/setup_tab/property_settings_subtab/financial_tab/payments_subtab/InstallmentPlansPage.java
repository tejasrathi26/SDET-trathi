package page_objects.entrata_page_objects.setup_tab.property_settings_subtab.financial_tab.payments_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;
import utils.RandomGenerator;

public class InstallmentPlansPage extends BasePage {

    public InstallmentPlansPage(WebDriver driver) {
        super(driver);}
    RandomGenerator randomGenerator = new RandomGenerator();

    private final By ADD_STUDENT_PLAN = By.linkText("Add Student Plan");
    private final By SUCCESS_MESSAGE = By.cssSelector("p[class= 'alert success slim']");
    private final By LAST_EDIT_ICON = By.xpath("//*[@id=\"installment_plans_table\"]/b/table/tbody/tr[last()]/td[6]/i");
    private final By LAST_MONEY_ICON = By.xpath("//*[@id=\"installment_plans_table\"]/b/table/tbody/tr[last()]/td[5]/i");
    private final By DISCOUNT_AMOUNT = By.cssSelector("input[ng-model='rate.rate_amount']");
    private final By SAVE_DISCOUNT = By.cssSelector("input[value = 'Save']");


    //add installment plan page - installment plan details
    private final By INSTALLMENT_TITLE_FIELD = By.id("installment_plan_name");
    private final By INSTALLMENT_PLAN_DESCRIPTION = By.id("installment_plan_description");
    private final By APPLY_DISCOUNT_SWITCH = By.cssSelector(".onoff > span");
    private final By PAYMENT_CHARGE_CODE_DROPDOWN = By.cssSelector("i[class = 'form-icon dropdown']");
    private final By PAYMENT_CHARGE_CODE = By.cssSelector("li[class = 'payment_charge_code_value']");
    private final By SAVE_AND_CONTINUE = By.id("save-continue");
    private final String INSTALLMENT_PLAN_TITLE = randomGenerator.randomName();
    private final String SELECTOR_FORMAT= String.format("//*[contains(text(), '%s')]",INSTALLMENT_PLAN_TITLE);
    private final By ADDED_INSTALLMENT_PLAN = By.xpath(SELECTOR_FORMAT);

    //add installment plan page - installment setup
    private final By PERCENTAGE_OF_LEASE_CHARGES = By.id("percentage_0");
    private final By INSTALLMENT_BILL_DATE = By.id("masked-installments[new_0][post_on_date]");
    private final By SAVE_BUTTON = By.id("save-installment");
    private final By OVERLAY = By.cssSelector(".loading-overlay");


    public boolean clickAddStudentPlan(){return clickElement(ADD_STUDENT_PLAN);}
    public boolean verifyVisibilityOfTitleField(){return confirmElementIsVisible(INSTALLMENT_TITLE_FIELD);}
    public boolean enterInstallmentPlanTitle(){return sendKeysToElement(INSTALLMENT_TITLE_FIELD,INSTALLMENT_PLAN_TITLE);}
    public boolean enterInstallmentPlanDescription() {return sendKeysToElement(INSTALLMENT_PLAN_DESCRIPTION,randomGenerator.randomName());}
    public boolean clickApplyDiscountSwitch(){return clickElement(APPLY_DISCOUNT_SWITCH);}
    public boolean clickPaymentChargeCodeDropdown(){return clickElement(PAYMENT_CHARGE_CODE_DROPDOWN);}
    public boolean clickPaymentChargeCode(){return clickElement(PAYMENT_CHARGE_CODE);}
    public boolean clickSaveContinue(){return clickElement(SAVE_AND_CONTINUE);}
    public boolean enterPercentageOfLeaseCharges(){return sendKeysToElement(PERCENTAGE_OF_LEASE_CHARGES,"100");}
    public boolean enterInstallmentDate(){return sendKeysToElement(INSTALLMENT_BILL_DATE,"06/01/2022");}
    public boolean clickSaveButton(){return clickElement(SAVE_BUTTON);}
    public String checkSuccessMessage(){return getElementText(SUCCESS_MESSAGE);}
    public boolean checkAddedPlan(){return confirmElementIsVisible(ADDED_INSTALLMENT_PLAN);}
    public boolean clickLastEditIcon(){waitForOverlay(OVERLAY); return clickElement(LAST_EDIT_ICON);}
    public boolean clickLastMoneyIcon(){return clickElement(LAST_MONEY_ICON, waitTimes.LONG_WAIT);}
    public boolean enterDiscountAmount(){return sendKeysToElement(DISCOUNT_AMOUNT,"100");}
    public boolean clickSaveDiscount(){return clickElement(SAVE_DISCOUNT);}
    public boolean checkDiscount(){return confirmElementIsVisible(SUCCESS_MESSAGE);}


}
