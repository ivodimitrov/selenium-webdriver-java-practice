package seleniumtestingtoolscookbook.mobilewebapp;

import io.appium.java_client.ios.IOSDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

import static org.junit.Assert.assertEquals;

public class MobileBmiCalculatorTest {

    private WebDriver driver;

    @Before
    public void setUp() throws Exception {
        // Set the desired capabilities for iOS- iPhone 6
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "iOS");
        caps.setCapability("platformVersion", "8.4");
        caps.setCapability("deviceName", "iPhone 6");
        caps.setCapability("browserName", "safari");

        // Create an instance of IOSDriver for testing on iOS platform
        // connect to the local Appium server running on a different machine
        // Use WebElement type for testing the Web application
        driver = new IOSDriver<WebElement>(new URL("http://192.168.0.101:4723/wd/hub"), caps);

        driver.get("http://cookbook.seleniumacademy.com/mobilebmicalculator.html");
    }

    @Test
    public void testMobileBmiCalculator() {

        WebElement height = driver.findElement(By.name("heightCMS"));
        height.sendKeys("181");

        WebElement weight = driver.findElement(By.name("weightKg"));
        weight.sendKeys("80");

        WebElement calculateButton =
                driver.findElement(By.id("Calculate"));
        calculateButton.click();

        WebElement bmi = driver.findElement(By.name("bmi"));
        assertEquals("24.4", bmi.getAttribute("value"));

        WebElement bmi_category =
                driver.findElement(By.name("bmi_category"));
        assertEquals("Normal", bmi_category.getAttribute("value"));
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
