package chapter02;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class GmailChromeTest {

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
    public void testFindElements() {
        //Get all the links displayed on Page
        List<WebElement> links = driver.findElements(By.tagName("a"));
        //Iterate though the list of links and print
        //target for each link
        for (WebElement link : links) {
            System.out.println(link.getAttribute("href"));
        }
        //Verify there are 22 links displayed on the page
        System.out.println(links.size());
        assertEquals(22, links.size());
        System.out.println("Test passed.");
    }

    @After
    public void tearDown() {
        // Close the browser
        driver.quit();
    }
}
