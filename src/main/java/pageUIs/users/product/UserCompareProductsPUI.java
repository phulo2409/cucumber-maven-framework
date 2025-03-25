package pageUIs.users.product;

public class UserCompareProductsPUI {
    public final static String PRODUCT_NAME_LINK = "Xpath=//tr[@class='product-name']//td/a";
    public final static String DYNAMIC_PRODUCT_NAME_LINK = "Xpath=//tr[@class='product-name']//td[%s]/a";
    public final static String DYNAMIC_DATA_COLUMN= "Xpath=//tr[@class='product-name']//td[%s]/a[text()='%s']" +
            "/ancestor::tr/following-sibling::tr[@class='product-price']//td[%s][text()='%s']";
    public final static String DYNAMIC_REMOVE_BUTTON_BY_PRODUCT_NAME= "Xpath=//tr[@class='product-name']//td[%s]/a[text()='%s']" +
            "/ancestor::tr/preceding-sibling::tr[@class='remove-product']/td[%s]/button";
}
