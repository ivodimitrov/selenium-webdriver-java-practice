package seleniumtestingtoolscookbook.tests.google;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import seleniumtestingtoolscookbook.pages.google.GooglePage;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static seleniumtestingtoolscookbook.utils.Links.GOOGLE_PAGE;

public class GoogleSearchSafariTest {

    private WebDriver driver;

    @Before
    public void setUp() {
        // Allow Remote Automation in Safari browser -> Develop

        System.out.println("Starting driver...");
        driver = new SafariDriver();
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

        if (null != driver) {
            driver.quit();
            driver = null;
            System.out.println();
            System.out.println("Driver quit.");
        }
    }
}