package chapter03;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

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

    @Test
    public void testCheckBox() {
        //Get the Checkbox as WebElement using it's value attribute
        WebElement professions = driver.findElement(By.
                cssSelector("#profession-0"));

        //Check if its already selected? Otherwise select the Checkbox
        //by calling click() method
        if (!professions.isSelected()) {
            professions.click();
        }

        //Verify Checkbox is Selected
        assertTrue(professions.isSelected());

        //Check Checkbox if selected? If yes, deselect it
        //by calling click() method
        if (professions.isSelected()) {
            professions.click();
        }

        //Verify Checkbox is Deselected
        assertFalse(professions.isSelected());

        System.out.println();
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
