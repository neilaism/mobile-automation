package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class ProductPage {

    private AndroidDriver driver;

    private By productImage =
            AppiumBy.id("com.saucelabs.mydemoapp.android:id/productIV");

    private By addToCartButton =
            AppiumBy.id("com.saucelabs.mydemoapp.android:id/addToCartLL");

    private By cartButton =
            AppiumBy.id("com.saucelabs.mydemoapp.android:id/cartIV");

    private By cartProduct =
            AppiumBy.androidUIAutomator(
                    "new UiSelector().text(\"Sauce Labs Backpack\")"
            );

    public ProductPage(AndroidDriver driver) {
        this.driver = driver;
    }

    public void clickProduct() {
        driver.findElement(productImage).click();
    }

    public void addToCart() {
        driver.findElement(addToCartButton).click();
    }

    public void openCart() {
        driver.findElement(cartButton).click();
    }

    public boolean isProductInCart() {
        return driver.findElement(cartProduct).isDisplayed();
    }
}