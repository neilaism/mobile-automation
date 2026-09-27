package base;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class BaseTest {

    protected AndroidDriver driver;

    @BeforeMethod
    public void setUp() {

        UiAutomator2Options options = new UiAutomator2Options()
                .setDeviceName("emulator-5554")
                .setApp("/Users/mac/Downloads/mda-2.2.0-25.apk")
                .setAppWaitActivity("*");

        options.setCapability("appium:chromedriverAutodownload", true);

        try {
            URL appiumServerUrl = new URL("http://127.0.0.1:4723");

            driver = new AndroidDriver(appiumServerUrl, options);

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            System.out.println("Driver session started!");

        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    @AfterMethod
    public void tearDown() {

        if (driver != null) {
            driver.quit();
            System.out.println("Driver session quitted!");
        }
    }
}