package utils;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.Page;

public class ToolsQaBaseTest {

    private static Page homePage;
    private static WebDriver webDriver;

    protected static WebDriver getWebDriver() {
        return webDriver;
    }

    // Setting up Browser Desired Capabilities
    private static void setChromeDriverProperty() {
        if (System.getProperty("os.name").contains("Windows")) {
            System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chromedriver.exe");
        } else {
            System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chromedriver.exe");
        }
    }

    @Before
    public void setUp() {
        setChromeDriverProperty();
        // Launch a new Chrome instance
        System.out.println("Starting driver...");

        webDriver = new ChromeDriver();

        System.out.println("Started driver.");

        webDriver.get(Links.HOME);

        homePage = new Page(webDriver);
    }

    @After
    public void tearDown() {
        System.out.println();
        System.out.println("Test passed.");

        // Close the browser
        webDriver.quit();

        System.out.println();
        System.out.println("Driver is quit.");
    }
}
