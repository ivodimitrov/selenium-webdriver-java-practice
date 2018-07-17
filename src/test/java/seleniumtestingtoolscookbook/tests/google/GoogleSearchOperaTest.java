package seleniumtestingtoolscookbook.tests.google;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
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


        // Launch a new Opera instance
        System.out.println("Starting driver...");

        driver = new OperaDriver(options);

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
    public void tearDown() throws Exception {
        // Close the browser
        driver.quit();

        System.out.println();
        System.out.println("Driver quit.");
        // Opera browser does not close. Solution for windows:
        Runtime.getRuntime().exec("taskkill /f /im opera.exe");
        // For MacOS:
        // Runtime.getRuntime().exec("pgrep 'Opera' | xargs kill");
    }
}