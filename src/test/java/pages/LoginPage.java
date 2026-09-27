package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class LoginPage {

    private AndroidDriver driver;

    private By usernameField =
            AppiumBy.id("com.saucelabs.mydemoapp.android:id/nameET");

    private By passwordField =
            AppiumBy.id("com.saucelabs.mydemoapp.android:id/passwordET");

    private By loginButton =
            AppiumBy.id("com.saucelabs.mydemoapp.android:id/loginBtn");

    public LoginPage(AndroidDriver driver) {
        this.driver = driver;
    }

    public void enterUsername(String username) {
        driver.findElement(usernameField).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }

    public void login(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        clickLogin();
    }
}