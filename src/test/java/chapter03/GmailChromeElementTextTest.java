package chapter03;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class GmailChromeElementTextTest {

    private WebDriver driver;

    @Before
    public void setUp() {
        // Setting up Browser Desired Capabilities
        System.setProperty("webdriver.chrome.driver",
                "./src/test/resources/drivers/chromedriver.exe");

        // Launch a new Chrome instance
        System.out.println("Starting driver...");

        driver = new ChromeDriver();

        System.out.println("Started driver.");

        // Maximize the browser window
        driver.manage().window().maximize();
        // Navigate to Google
        driver.get("https://www.google.com/gmail/about/#");
    }

    @Test
    public void testCreateAnAccountElementText() {
        // Get the Create An Account Element
        WebElement createAnAccountLink = driver.findElement(By.cssSelector(".hero_home__link__desktop"));
        // Get the message element's text
        String createAnAccountLinkText = createAnAccountLink.getText();
        // Verify message element's text
        assertEquals("Verify message element's text",
                "CREATE AN ACCOUNT", createAnAccountLinkText);

        System.out.println("Test passed.");
    }

    @Test
    public void testSignInElementText() {
        // Get the Sign In Element
        WebElement signInLink = driver.findElement(By.cssSelector("a.gmail-nav__nav-link:nth-child(2)"));
        // Get the message element's text
        String signInLinkText = signInLink.getText();
        // Verify message element's text
        assertEquals("Verify message element's text",
                "SIGN IN", signInLinkText);

        System.out.println("Test passed.");
    }

    @After
    public void tearDown() {
        // Close the browser
        driver.quit();

        System.out.println();
        System.out.println("Driver is quited.");
    }
}
