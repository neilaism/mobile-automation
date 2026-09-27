package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.ProductPage;

public class AddToCartTest extends BaseTest {

    @Test
    public void addProductToCart() {

        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        ProductPage productPage = new ProductPage(driver);

        homePage.openMenu();

        homePage.clickLogin();

        loginPage.login(
                "bod@example.com",
                "10203040"
        );

        productPage.clickProduct();

        productPage.addToCart();

        productPage.openCart();

        Assert.assertTrue(
                productPage.isProductInCart(),
                "Sauce Labs Backpack is not displayed in cart"
        );
    }
}