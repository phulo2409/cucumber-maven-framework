package pageUIs.users.wishlist;

public class UserWishlistPUI {
    public final static String DYNAMIC_REMOVE_BUTTON_BY_PRODUCT_NAME = "Xpath=//a[@class='product-name' and text()='%s']/parent::td/following-sibling::td[@class='remove-from-cart']//button";
    public final static String DYNAMIC_ADD_BUTTON_BY_PRODUCT_NAME = "Xpath=//a[@class='product-name' and text()='%s']/parent::td/preceding-sibling::td[@class='add-to-cart']//input";
    public final static String SHARE_LINK = "Xpath=//a[@class='share-link']";
    public final static String ADD_TO_CART_BUTTON = "Xpath=//button[contains(@class, 'wishlist-add-to-cart-button')]";
    public final static String NO_DATA_MESSAGE = "Xpath=//div[@class='no-data']";
}
