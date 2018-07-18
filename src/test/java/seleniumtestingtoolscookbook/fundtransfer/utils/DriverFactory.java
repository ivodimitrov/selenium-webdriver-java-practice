package seleniumtestingtoolscookbook.fundtransfer.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class DriverFactory {
    protected static WebDriver driver = null;
    protected static WebDriverWait waitVar = null;

    public void setUp() {
        driver = new ChromeDriver();
        // driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//        String baseURL = "http://cookbook.seleniumacademy.com/fundTransfer.html";
//        driver.get(baseURL);
        waitVar = new WebDriverWait(driver, 15);
    }

    public void tearDown() {
        driver.close();
        driver.quit();
    }
}
