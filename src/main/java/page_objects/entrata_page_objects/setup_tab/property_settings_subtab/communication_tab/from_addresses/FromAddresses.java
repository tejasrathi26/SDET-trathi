package page_objects.entrata_page_objects.setup_tab.property_settings_subtab.communication_tab.from_addresses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class FromAddresses extends BasePage {

    // Select "Communication"->"From Addresses" tab Selector
    private final By CLICK_SELECT_FROM_ADDRESSES_SUB_TAB = (By.id("property_communication_from_addressesxxx"));


    //"From" Email Addresses section Locate Headers Selectors
    private final By LOCATE_FROM_EMAIL_ADDRESSES_HEADER = By.xpath("//h4[text()='\"From\" Email Addresses']");
    private final By LOCATE_LEASING_FROM_EMAIL_ADDRESSES_SECTION_HEADER = By.xpath("//h5[text()='Leasing']");
    private final By LOCATE_RESIDENTS_FROM_EMAIL_ADDRESSES_SECTION_HEADER = By.xpath("//h5[text()='Residents']");
    private final By LOCATE_OTHER_FROM_EMAIL_ADDRESSES_SECTION_HEADER = By.xpath("//h5[text()='Other']");
    private final By LOCATE_EMAILRELAY_FROM_EMAIL_ADDRESSES_SECTION_HEADER = By.xpath("//h5[text()='EmailRelay']");

    // "From" Email Addresses section selectors
    //Other
    private final By CLICK_MESSAGE_CENTER_EMAIL_FIELD = By.name("property_preferences[FROM_MESSAGE_CENTER_DEFAULT_EMAIL][value]");
    private final By CLICK_PROPERTY_STAFF_EMAIL_FIELD = By.name("property_preferences[FROM_MANAGER_NOTIFICATION_EMAIL][value]");
    private final By CLICK_CONTACT_POINTS_EMAIL_FIELD = By.name("property_preferences[FROM_EVENT_SCHEDULER_DEFAULT_EMAIL][value]");

    //////// "EmailRelay" settings block selectors ////////
// "Recipients will view Message Center emails as being sent from:" Setting selector and options
    private final By CLICK_MC_EMAILS_BEING_SENT_FROM_OPTIONS = (By.name("property_preferences[MESSAGE_CENTER_EMAIL_RELAY][value]"));
    private final By CLICK_MC_EMAILS_BEING_SENT_FROM_SELECT_EMAIL_RELAY_OPTION = By.xpath("//option[text()='EmailRelay']");
    private final By CLICK_MC_EMAILS_BEING_SENT_FROM_SELECT_MESSAGE_CENTER_FROM_ADDRESS_OPTION = By.xpath("//option[text()='Message Center Email \"From\" Address']");

    // "Recipients will view Contact Points emails as being sent from:" Setting selectors
    private final By CLICK_CP_EMAILS_BEING_SENT_FROM = (By.id("event_scheduler_email_relay_option_id"));
    private final By CLICK_CP_EMAILS_BEING_SENT_FROM_SELECT_CONTACT_POINTS_FROM_ADDRESS_OPTION = By.xpath("//option[text()='Contact Points Email \"From\" Address']");
    private final By CLICK_CP_EMAILS_BEING_SENT_FROM_SELECT_EMAIL_RELAY_OPTION = By.xpath("//option[text()='EmailRelay']");

    // "Default EmailRelay Reply Forwarding Address:" Setting selectors
    private final By CLICK_DEFAULT_EMAIL_RELAY_REPLY_FORWARDING_ADDRESS =(By.id("default_emailrelay_reply_forwarding_address"));
    private final By DEFAULT_EMAIL_RELAY_REPLY_FORWARDING_ADDRESS_EMAIL_CREATOR_DEFAULT = By.xpath("//option[text()='EmailRelay']");
    private final By DEFAULT_EMAIL_RELAY_REPLY_FORWARDING_ADDRESS_PROPERTY_EMAIL = By.xpath("//option[text()='Property Email']");
    // "Default EmailRelay Reply Forwarding Address:" Setting selectors for "Entrata User Email" and "Custom"
    private final By DEFAULT_EMAIL_RELAY_REPLY_FORWARDING_ADDRESS_PROPERTY_EMAIL_ENTRATA_USER_EMAIL = By.xpath("//option[text()='Entrata User Email']");
    private final By DEFAULT_EMAIL_RELAY_REPLY_FORWARDING_ADDRESS_CUSTOM = By.xpath("//option[text()='Custom']");

    //Edit, Save, and Cancel Selectors
    private final By CLICK_EDIT_FROM_ADDRESS_ADDRESSES = (By.id("from-button"));


    //Constructor//
    public FromAddresses(WebDriver driver) {
        super(driver);
    }

    // Select "Communication"->"From Addresses" tab Method
    public boolean selectFromAddressesSubTab() { return clickElement(CLICK_SELECT_FROM_ADDRESSES_SUB_TAB); }

    //"From" Email Addresses section Locate Headers Methods
    public boolean locate_From_Email_Addresses_Page_Header() {return confirmElementIsVisible(LOCATE_FROM_EMAIL_ADDRESSES_HEADER);}
    public boolean locate_Leasing_From_Email_Addresses_Section_Header() {return confirmElementIsVisible(LOCATE_LEASING_FROM_EMAIL_ADDRESSES_SECTION_HEADER);}
    public boolean locate_Residents_From_Email_Addresses_Section_Header() {return confirmElementIsVisible(LOCATE_RESIDENTS_FROM_EMAIL_ADDRESSES_SECTION_HEADER);}
    public boolean locate_Other_From_Email_Addresses_Section_Header() {return confirmElementIsVisible(LOCATE_OTHER_FROM_EMAIL_ADDRESSES_SECTION_HEADER);}
    public boolean locate_EmailRelay_From_Email_Addresses_Section_Header() {return confirmElementIsVisible(LOCATE_EMAILRELAY_FROM_EMAIL_ADDRESSES_SECTION_HEADER);}


    /// "From" Email Addresses section Methods ///
    //Other
//"Message Center:"
    public boolean click_Message_Center_Email_Field() {return clickElement(CLICK_MESSAGE_CENTER_EMAIL_FIELD);}
    //"Property Staff:"
    public boolean click_Property_Staff_Email_Field() {return clickElement(CLICK_PROPERTY_STAFF_EMAIL_FIELD);}
    //"Contact Points:"
    public boolean click_Contact_Points_Email_Field() {return clickElement(CLICK_CONTACT_POINTS_EMAIL_FIELD);}


//////// EmailRelay settings block Methods ////////

    // "Recipients will view Message Center emails as being sent from:" Setting options methods
    public boolean click_MCEmailsBeingSentFrom(){ return clickElement(CLICK_MC_EMAILS_BEING_SENT_FROM_OPTIONS); }
    public boolean mcEmailsBeingSentFrom_SelectEmailRelayOption(){ return clickElement(CLICK_MC_EMAILS_BEING_SENT_FROM_SELECT_EMAIL_RELAY_OPTION); }
    public boolean locate_MCEmailsBeingSentFrom_SelectEmailRelayOption(){ return confirmElementIsVisible(CLICK_MC_EMAILS_BEING_SENT_FROM_SELECT_EMAIL_RELAY_OPTION); }
    public boolean mcEmailsBeingSentFrom_SelectMessageCenter_From_Address_Option(){ return clickElement(CLICK_MC_EMAILS_BEING_SENT_FROM_SELECT_MESSAGE_CENTER_FROM_ADDRESS_OPTION); }
    public boolean locate_MCEmailsBeingSentFrom_SelectMessageCenter_From_Address_Option(){ return confirmElementIsVisible(CLICK_MC_EMAILS_BEING_SENT_FROM_SELECT_MESSAGE_CENTER_FROM_ADDRESS_OPTION); }


    // "Recipients will view Contact Points emails as being sent from:" Setting selectors
    public boolean click_CPEmailsBeingSentFrom(){ return clickElement(CLICK_CP_EMAILS_BEING_SENT_FROM); }
    public boolean cpEmailsBeingSentFrom_From_Address_Option(){ return clickElement(CLICK_CP_EMAILS_BEING_SENT_FROM_SELECT_CONTACT_POINTS_FROM_ADDRESS_OPTION); }
    public boolean locate_CPEmailsBeingSentFrom_From_Address_Option(){ return confirmElementIsVisible(CLICK_CP_EMAILS_BEING_SENT_FROM_SELECT_CONTACT_POINTS_FROM_ADDRESS_OPTION); }
    public boolean cpEmailsBeingSentFrom_Email_Relay_Option(){ return clickElement(CLICK_CP_EMAILS_BEING_SENT_FROM_SELECT_EMAIL_RELAY_OPTION); }
    public boolean locate_CPEmailsBeingSentFrom_Email_Relay_Option(){ return confirmElementIsVisible(CLICK_CP_EMAILS_BEING_SENT_FROM_SELECT_EMAIL_RELAY_OPTION); }




    // "Default EmailRelay Reply Forwarding Address:" Methods
    public boolean clickDefaultEmailRelayReplyForwardingAddress(){ return clickElement(CLICK_DEFAULT_EMAIL_RELAY_REPLY_FORWARDING_ADDRESS); }
    public boolean locateEmailRelayReplyForwardingAddress_Email_Creator_Default(){ return confirmElementIsVisible(DEFAULT_EMAIL_RELAY_REPLY_FORWARDING_ADDRESS_EMAIL_CREATOR_DEFAULT); }
    public boolean defaultEmailRelayReplyForwardingAddress_Select_Email_Creator_Default(){ return clickElement(DEFAULT_EMAIL_RELAY_REPLY_FORWARDING_ADDRESS_EMAIL_CREATOR_DEFAULT); }
    public boolean locateEmailRelayReplyForwardingAddress_Property_Email(){ return confirmElementIsVisible(DEFAULT_EMAIL_RELAY_REPLY_FORWARDING_ADDRESS_PROPERTY_EMAIL); }


    public boolean locateEmailRelayReplyForwardingAddress_Entrata_User_Email(){ return confirmElementIsVisible(DEFAULT_EMAIL_RELAY_REPLY_FORWARDING_ADDRESS_PROPERTY_EMAIL_ENTRATA_USER_EMAIL); }
    public boolean locateEmailRelayReplyForwardingAddress_Custom(){ return confirmElementIsVisible(DEFAULT_EMAIL_RELAY_REPLY_FORWARDING_ADDRESS_CUSTOM); }

    //Edit, Save, and Cancel Methods
    public boolean editFromAddressAddresses() { return clickElement(CLICK_EDIT_FROM_ADDRESS_ADDRESSES); }
}

