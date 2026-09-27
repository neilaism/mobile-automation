package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void loginSuccess() {

        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);

        homePage.openMenu();

        homePage.clickLogin();

        loginPage.login(
                "bod@example.com",
                "10203040"
        );

        Assert.assertTrue(
                homePage.isHomePageDisplayed(),
                "Home page is not displayed after login"
        );
    }
}