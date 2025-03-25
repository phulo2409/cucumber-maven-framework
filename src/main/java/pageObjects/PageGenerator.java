package pageObjects;

import org.openqa.selenium.WebDriver;
import pageObjects.admin.customer.*;
import pageObjects.admin.dashboard.AdminDashboardPO;
import pageObjects.admin.login.AdminLoginPO;
import pageObjects.admin.product.AdminProductPO;
import pageObjects.users.dashboard.UserHomePO;
import pageObjects.users.dashboard.UserSearchPO;
import pageObjects.users.login.UserLoginPO;
import pageObjects.users.login.UserRegisterPO;
import pageObjects.users.myAccount.UserAddressPO;
import pageObjects.users.myAccount.UserChangePasswordPO;
import pageObjects.users.myAccount.UserCustomerInfoPO;
import pageObjects.users.myAccount.UserMyProductReviewsPO;
import pageObjects.users.product.UserCompareProductsPO;
import pageObjects.users.product.UserProductListPO;
import pageObjects.users.product.UserProductPO;
import pageObjects.users.product.UserRecentlyViewedProductsPO;
import pageObjects.users.shoppingCart.UserCheckOutPO;
import pageObjects.users.shoppingCart.UserShoppingCartPO;
import pageObjects.users.wishlist.UserWishlistPO;
import pageObjects.users.wishlist.UserWishlistSharePO;

public class PageGenerator {

    public static PageGenerator getPageGenerator(){
        return new PageGenerator();
    }

    public UserHomePO getUserHomePage(WebDriver driver){
        return new UserHomePO(driver);
    }

    public UserRegisterPO getUserRegisterPage(WebDriver driver){
        return new UserRegisterPO(driver);
    }

    public UserLoginPO getUserLoginPage(WebDriver driver){
        return new UserLoginPO(driver);
    }

    public UserCustomerInfoPO getUserCustomerInfoPage(WebDriver driver){
        return new UserCustomerInfoPO(driver);
    }

    public UserAddressPO getUserAddressPage(WebDriver driver){
        return new UserAddressPO(driver);
    }

    public UserChangePasswordPO getUserChangePassword(WebDriver driver){
        return new UserChangePasswordPO(driver);
    }

    public UserProductListPO getUserProductList(WebDriver driver){
        return new UserProductListPO(driver);
    }

    public UserProductPO getUserProduct(WebDriver driver){
        return new UserProductPO(driver);
    }

    public UserMyProductReviewsPO getUserMyProductReviews(WebDriver driver){
        return new UserMyProductReviewsPO(driver);
    }

    public UserSearchPO getUserSearch(WebDriver driver){
        return new UserSearchPO(driver);
    }

    public UserWishlistPO getWishList(WebDriver driver){
        return new UserWishlistPO(driver);
    }

    public UserWishlistSharePO getWishListShare(WebDriver driver){
        return new UserWishlistSharePO(driver);
    }

    public UserShoppingCartPO getShoppingCart(WebDriver driver){
        return new UserShoppingCartPO(driver);
    }

    public UserCompareProductsPO getCompareProduct(WebDriver driver){
        return new UserCompareProductsPO(driver);
    }

    public UserRecentlyViewedProductsPO getRecentlyViewedProducts(WebDriver driver){
        return new UserRecentlyViewedProductsPO(driver);
    }

    public UserCheckOutPO getCheckOut(WebDriver driver){
        return new UserCheckOutPO(driver);
    }

    public AdminLoginPO getAdminLogin(WebDriver driver){
        return new AdminLoginPO(driver);
    }

    public AdminDashboardPO getAdminDashboard(WebDriver driver){
        return new AdminDashboardPO(driver);
    }

    public AdminProductPO getAdminProduct(WebDriver driver){
        return new AdminProductPO(driver);
    }

    public AdminCustomerPO getAdminCustomer(WebDriver driver){
        return new AdminCustomerPO(driver);
    }

    public AdminAddCustomerPO getAdminAddCustomer(WebDriver driver){
        return new AdminAddCustomerPO(driver);
    }

    public AdminEditCustomerPO getAdminEditCustomer(WebDriver driver){
        return new AdminEditCustomerPO(driver);
    }

    public AdminAddNewAddressPO getAdminAddNewAddress(WebDriver driver){
        return new AdminAddNewAddressPO(driver);
    }

    public AdminEditAddressPO getAdminEditAddress(WebDriver driver){
        return new AdminEditAddressPO(driver);
    }
}
