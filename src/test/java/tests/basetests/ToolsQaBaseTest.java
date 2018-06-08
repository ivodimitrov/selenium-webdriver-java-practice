package tests.basetests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolsQaBaseTest {

    public WebDriver driver;

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
        driver.get("http://toolsqa.com/automation-practice-form/");
    }

    @After
    public void tearDown() {
        System.out.println();
        System.out.println("Test passed.");

        // Close the browser
        driver.quit();

        System.out.println();
        System.out.println("Driver is quit.");
    }
}
