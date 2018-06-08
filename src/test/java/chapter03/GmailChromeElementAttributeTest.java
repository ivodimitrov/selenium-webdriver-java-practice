package chapter03;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class GmailChromeElementAttributeTest {
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
        // Navigate to page
        driver.get("https://www.google.com/gmail/about/#");
    }

    @Test
    public void testElementAttributeValue() {
        // Get the Create An Account Element
        WebElement createAnAccountLink = driver.findElement(By.
                cssSelector(".hero_home__link__desktop"));
        // Verify an element's attribute value
        assertEquals("Verify an element's attribute value",
                "Get Gmail", createAnAccountLink.getAttribute("data-g-label"));

        System.out.println("Test passed.");
    }

    @Test
    public void testElementStyle() {
        // Get the Create An Account Element
        WebElement createAnAccountLink = driver.findElement(By.cssSelector(".hero_home__link__desktop"));
        // CSS value
        String textAlign = createAnAccountLink.getCssValue("text-align");
        // Verify an element's CSS value
        assertEquals("Verify an element's CSS value", "center", textAlign);

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
