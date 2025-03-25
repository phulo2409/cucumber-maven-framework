package pageUIs.users.shoppingCart;

public class UserShoppingCartPUI {
    public final static String SHOPPING_CART_QUANTITY_MENU_ITEM = "Xpath=//a[@class='ico-cart']//span[@class='cart-qty']";
    public final static String WISHLIST_QUATITY_MENU_ITEM = "Xpath=//a[@class='ico-wishlist']//span[@class='wishlist-qty']";
    public final static String DYNAMIC_EDIT_LINK = "Xpath=//a[@class='product-name' and text()='%s']/following-sibling::div[@class='edit-item']/a";
    public final static String DYNAMIC_REMOVE_BUTTON = "xpath=//a[@class='product-name' and text()='%s']/parent::td/following-sibling::td[@class='remove-from-cart']//button";
    public final static String NO_DATA_MESSAGE = "Xpath=//div[@class='no-data']";
    public final static String DYNAMIC_PRODUCT_TOTAL_PRICE_TABLE = "Xpath=//a[@class='product-name' and text()='%s']/parent::td/following-sibling::td[@class='subtotal']/span";
    public final static String DYNAMIC_PRODUCT_QUANTITY = "Xpath=//a[@class='product-name' and text()='Lenovo IdeaCentre']/parent::td/following-sibling::td[@class='quantity']//input";
    public final static String GIFT_WRAPPING_DROPDOWN = "Xpath=//select[@id='checkout_attribute_1']";
    public final static String ESTIMATE_SHIPPING_BUTTON = "Xpath=//a[@id='open-estimate-shipping-popup']";
    public final static String COUNTRY_POPUP_DROPDOWN = "Xpath=//select[@id='CountryId']";
    public final static String STATE_POPUP_DROPDOWN = "Xpath=//select[@id='StateProvinceId']";
    public final static String ZIP_POSTAL_POPUP_TEXTBOX = "Xpath=//input[@id='ZipPostalCode']";
    public final static String DYNAMIC_SHIPPING_METHOD_POPUP_RADIO = "Xpath=//div[@class='estimate-shipping-row-item shipping-item' and text()='%s']";
    public final static String APPLY_BUTTON = "Xpath=//button[contains(@class, 'apply-shipping-button')]";
    public final static String TERM_OF_SERVICE_CHECKBOX = "Xpath=//input[@id='termsofservice']";
    public final static String CHECK_OUT_BUTTON = "Xpath=//button[@id='checkout']";
    public final static String POPUP_LOADING_ICON = "Xpath=//div[@class='shipping-options-loading']";

}
