package seleniumtestingtoolscookbook.tests.google;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;
import seleniumtestingtoolscookbook.pages.google.GooglePage;

import java.io.File;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static seleniumtestingtoolscookbook.utils.Links.GOOGLE_PAGE;

public class GoogleSearchOperaTest {

    private WebDriver driver;

    @Before
    public void setUp() {
        // Setting up Browser Desired Capabilities
        System.setProperty("webdriver.opera.driver",
                ".\\src\\test\\resources\\drivers\\operadriver.exe");
        OperaOptions options = new OperaOptions();
        options.setBinary(new File("C:\\Program Files\\Opera\\launcher.exe"));

        System.out.println("Starting driver...");
        driver = new OperaDriver(options);
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
    public void tearDown() throws Exception {
        driver.quit();
        System.out.println();
        System.out.println("Driver quit.");
        // Opera browser does not close. Solution for windows:
        Runtime.getRuntime().exec("taskkill /f /im opera.exe");
        // For MacOS:
        // Runtime.getRuntime().exec("pgrep 'Opera' | xargs kill");
    }
}