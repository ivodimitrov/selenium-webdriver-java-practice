package seleniumtestingtoolscookbook.tests.google;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
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
        System.out.println("Starting driver...");
        driver = new EdgeDriver(options);
        System.out.println("Started driver.");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(GOOGLE_PAGE);
    }

    @Test
    public void testGoogleSearch() {
        GooglePage googlePage = new GooglePage(driver);

        String keywordToSearch = "Selenium";

        googlePage.searchFor(keywordToSearch);

        googlePage.waitTitleToMatchWithKeyword(keywordToSearch);

        assertEquals("Selenium - Google Search",
                driver.getTitle());
    }

    @After
    public void tearDown() {
        driver.quit();
        System.out.println();
        System.out.println("Driver quit.");
    }
}
