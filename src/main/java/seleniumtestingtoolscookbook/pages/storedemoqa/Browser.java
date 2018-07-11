package seleniumtestingtoolscookbook.pages.storedemoqa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Browser {

    public static WebDriver driver = new ChromeDriver();

    public static void setUp() {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public static WebDriver getDriver() {
        return driver;
    }

    static void open(String url) {
        driver.get(url);
    }

    public static void close() {
        driver.quit();
    }
}
