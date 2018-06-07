package chapter03;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolsQAChromeCheckboxesTest {

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
        driver.get("http://toolsqa.com/automation-practice-form/");
    }

    @After
    public void tearDown() {
        // Close the browser
        driver.quit();

        System.out.println();
        System.out.println("Driver is quited.");
    }
}
