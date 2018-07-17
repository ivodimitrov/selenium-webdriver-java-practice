package seleniumtestingtoolscookbook.tests.google;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import seleniumtestingtoolscookbook.pages.google.GooglePage;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static seleniumtestingtoolscookbook.utils.Links.GOOGLE_PAGE;

public class GoogleSearchEdgeTest {

    private WebDriver driver;

    @Before
    public void setUp() {
        // Microsoft WebDriver Release 15063
        // Version: 4.15063 | Edge version supported: 15.15063
        // More driver versions: https://developer.microsoft.com/en-us/microsoft-edge/tools/webdriver/
        // Setting up Browser Desired Capabilities
        System.setProperty("webdriver.edge.driver",
                ".\\src\\test\\resources\\drivers\\microsoftwebdriver.exe");

        EdgeOptions options = new EdgeOptions();
        options.setPageLoadStrategy("eager");

        // Launch a new Edge instance
        System.out.println("Starting driver...");

        driver = new EdgeDriver(options);

        System.out.println("Started driver.");

        // Maximize the browser window
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // Navigate to page
        driver.get(GOOGLE_PAGE);
    }

    @Test
    public void testGoogleSearch() {
        GooglePage googlePage = new GooglePage(driver);

        googlePage.searchFor("Selenium");

        // Google's search is rendered dynamically with JavaScript.
        // wait for the page to load, timeout after 10 seconds
        new WebDriverWait(driver, 10).until((ExpectedCondition<Boolean>) d ->
                d.getTitle().toLowerCase()
                        .startsWith("selenium"));

        assertEquals("Selenium - Google Search",
                driver.getTitle());
    }

    @After
    public void tearDown() {
        // Close the browser
        driver.quit();

        System.out.println();
        System.out.println("Driver quit.");
    }
}
