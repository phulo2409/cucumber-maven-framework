package pageUIs.users.product;

public class UserProductPUI {
    public final static String ADD_YOUR_REVIEW_LINK = "Xpath=//div[contains(@class, 'add-review')]";
    public final static String REVIEW_TITLE_TEXTBOX = "Xpath=//input[@id='AddProductReview_Title']";
    public final static String REVIEW_TEXT_TEXTAREA = "Xpath=//textarea[@id='AddProductReview_ReviewText']";
    public final static String RATING_RADIOBUTTON = "Xpath=//input[@id='addproductrating_%s']";
    public final static String SUBMIT_REVIEW_BUTTON = "Xpath=//button[@id='add-review']";
    public final static String ADD_TO_WISHLIST_BUTT0N = "Xpath=//div[@class='product-essential']//button[contains(@id, 'add-to-wishlist-button')]";
    public final static String WISHLIST_MENU_ITEM = "Xpath=//a[@class='ico-wishlist']";
    public final static String RECENTLY_VIEWED_PRODUCTS_LINK = "Xpath=//div[@class='footer']//a[text()='Recently viewed products']";
    public final static String DYNAMIC_BREADCRUMB_ITEM = "Xpath=//div[@class='breadcrumb']//span[text()='%s']";

    public final static String PROCESSOR_DROPDOWN = "Xpath=//select[@id='product_attribute_1']";
    public final static String RAM_DROPDOWN = "Xpath=//select[@id='product_attribute_2']";
    public final static String DYNAMIC_HDD_RADIO = "Xpath=//dd[@id='product_attribute_input_3']//label[text()='%s']/preceding-sibling::input";
    public final static String DYNAMIC_OS_RADIO = "Xpath=//dd[@id='product_attribute_input_4']//label[text()='%s']/preceding-sibling::input";
    public final static String DYNAMIC_SOFTWARE_CHECKBOX = "Xpath=//dd[@id='product_attribute_input_5']//label[text()='%s']/preceding-sibling::input";
    public final static String ADD_TO_CART_BUTTON = "Xpath=//button[contains(@id,'add-to-cart-button')]";
    public final static String PRODUCT_QUANTITY_TEXTBOX = "Xpath=//input[@id='product_enteredQuantity_1']";
    public final static String PRODUCT_PRICE = "Xpath=//div[@class='product-price']//span";
    public final static String SHOPPING_CART_MENU_ITEM = "Xpath=//a[@class='ico-cart']";
}
