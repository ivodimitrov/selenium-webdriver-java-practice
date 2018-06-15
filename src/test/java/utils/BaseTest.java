package utils;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.Page;

public class BaseTest {

    private static Page homePage;

    private static WebDriver webDriver;

    protected static WebDriver getWebDriver() {
        return webDriver;
    }

    // Setting up Browser Desired Capabilities
    private static void setChromeDriverProperty() {
        if (System.getProperty("os.name").contains("Windows")) {
            System.setProperty("webdriver.chrome.driver",
                    "./src/test/resources/drivers/chromedriver.exe");
        } else {
            System.setProperty("webdriver.chrome.driver",
                    "./src/test/resources/drivers/chromedriver.exe");
        }
    }

    protected static void goToPageAndWaitPageToLoad(final String page) {
        // Go to page
        getWebDriver().get(page);
        // Wait for the page to load, timeout after 10 seconds
        new WebDriverWait(getWebDriver(), 10).
                until((ExpectedCondition<Boolean>) driver -> driver.getTitle().toLowerCase()
                        .contains(Links.getPages()
                                .get(page)));
    }

    @Before
    public void setUp() {
        // Setting up Browser
        setChromeDriverProperty();
        // Launch a new Chrome instance
        System.out.println("Starting driver...");
        webDriver = new ChromeDriver();
        System.out.println("Started driver.");

        webDriver.manage().window().maximize();

        homePage = new Page(webDriver);
    }

    @After
    public void tearDown() {
        // Close the browser
        webDriver.quit();

        System.out.println();
        System.out.println("Driver quit.");
    }
}
