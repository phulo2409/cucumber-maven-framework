package pageUIs.users.dashboard;

public class BasePageUI {
    public static final String HEADER_MENU_FIRST_LEVEL = "Xpath=//div[@class='header-menu']//a[normalize-space()='%s']";
    public static final String HEADER_MENU_SECOND_LEVEL = "Xpath=//div[@class='header-menu']//a[normalize-space()='%s']/parent::li//ul//a[normalize-space()='%s']";
    public static final String LOGOUT_LINK = "XPath=//a[@class='ico-logout']";
    public static final String MY_ACCOUNT_LINK = "XPath=//a[@class='ico-account']";
    public static final String SHOPPING_CART_LINK = "XPath=//a[@class='ico-cart']";
    public final static String BAR_NOTIFICATION = "Xpath=//div[@class='bar-notification success' and normalize-space()='%s']";
    public final static String CLOSE_BAR_BUTTON = "Xpath=//div[@class='bar-notification success']/span";
    public final static String AJAX_ICON = "Xpath=//div[contains(@class, 'ajax')]";
    public final static String DYNAMIC_PRODUCT_NAME = "Xpath=//a[@class='product-name' and text()='%s']";
    public final static String PRODUCT_NAME_FLYOUT_CART = "Xpath=//div[@class='product']//div[@class='name']/a";
    public final static String PRODUCT_ATTRIBUTE_FLYOUT_CART = "Xpath=//div[@id='flyout-cart']//div[@class='attributes']";
    public final static String TOTAL_FLYOUT_CART = "Xpath=//div[@id='flyout-cart']//div[@class='totals']";
    public final static String COUNT_PRODUCT_FLYOUT_CART = "Xpath=//div[@id='flyout-cart']//div[@class='count']";

}
