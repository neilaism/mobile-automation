package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class HomePage {

    private AndroidDriver driver;

    private By viewMenu =
            AppiumBy.accessibilityId("View menu");

    private By loginMenuItem =
            AppiumBy.accessibilityId("Login Menu Item");

    public HomePage(AndroidDriver driver) {
        this.driver = driver;
    }

    public void openMenu() {
        driver.findElement(viewMenu).click();
    }

    public void clickLogin() {
        driver.findElement(loginMenuItem).click();
    }

    public boolean isHomePageDisplayed() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        return driver.findElement(viewMenu).isDisplayed();
    }
}