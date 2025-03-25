package pageUIs.users.dashboard;

public class UserSearchPUI {
    public final static String SEARCH_KEYWORD_TEXTBOX = "Xpath=//input[contains(@class, 'search-text')]";
    public final static String ADVANCED_SEARCH_CHECKBOX = "Xpath=//input[@id='advs']";
    public final static String CATEGORY_DROPDOWN = "Xpath=//select[@id='cid']";
    public final static String CATEGORY_CHECKBOX = "Xpath=//input[@id='isc']";
    public final static String MANUFACTURER_DROPDOWN = "Xpath=//select[@id='mid']";
    public final static String SEARCH_BUTTON = "Xpath=//button[contains(@class, 'search-button')]";
    public final static String WARNING_VALIDATION = "Xpath=//div[@class='search-results']//div[@class='warning']";
    public final static String NO_RESULT_VALIDATION = "Xpath=//div[@class='search-results']//div[@class='no-result']";

    public final static String PRODUCT_ITEM = "Xpath=//div[@class='product-item']";
    public final static String PRODUCT_ITEM_TITLE = "Xpath=//h2[@class='product-title' and normalize-space()='%s']/ancestor::div[@class='product-item']";
}
