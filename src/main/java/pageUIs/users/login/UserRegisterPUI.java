package pageUIs.users.login;

public class UserRegisterPUI {
    public static final String FIRST_NAME_VALIDATION = "Xpath=//span[@id='FirstName-error']";
    public static final String LAST_NAME_VALIDATION = "Xpath=//span[@id='LastName-error']";
    public static final String EMAIL_VALIDATION = "Xpath=//span[@id='Email-error']";
    public static final String PASSWORD_VALIDATION = "Xpath=//span[@id='Password-error']";
    public static final String CONFIRM_PASSWORD_VALIDATION = "Xpath=//span[@id='ConfirmPassword-error']";
    public static final String FIRST_NAME_TEXTBOX="Xpath=//input[@id='FirstName']";
    public static final String LAST_NAME_TEXTBOX="Xpath=//input[@id='LastName']";
    public static final String EMAIL_TEXTBOX="Xpath=//input[@id='Email']";
    public static final String COMPANY_NAME_TEXTBOX="Xpath=//input[@id='Company']";
    public static final String PASSWORD_TEXTBOX="Xpath=//input[@id='Password']";
    public static final String CONFIRM_PASSWORD_TEXTBOX="Xpath=//input[@id='ConfirmPassword']";
    public static final String REGISTER_BUTTON = "Xpath=//button[@id='register-button']";
    public static final String SUCCESS_MESSAGE = "Xpath=//div[@class='result']";
    public static final String REGISTER_ERROR_MESSAGE = "Xpath=//div[contains(@class, 'message-error')]//li";
}
