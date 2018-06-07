package chapter03;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static junit.framework.TestCase.assertTrue;

public class ToolsQAChromeRadioButtonTest {

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
    public void testRadioButton() {
        // Get the Radio Button as WebElement using it's value attribute
        WebElement yearsOfExperience = driver.findElement(By.xpath("//*[@id=\"exp-0\"]"));
        // Check if its already selected? otherwise select the Radio Button
        // by calling click() method
        if (!yearsOfExperience.isSelected()) {
            yearsOfExperience.click();
        }
        // Verify Radio Button is selected
        assertTrue(yearsOfExperience.isSelected());

        System.out.println();
        System.out.println("Test passed.");
    }

    @Test
    public void testRadioGroup() {
        // radio
        // We can also get all the Radio buttons from a Radio Group in a list
        // using findElements() method along with Radio Group identifier
        // div.control-group:nth-child(23)
//        List<WebElement> yearsOfExperience = driver.findElements(By.
//                className("control-group"));
        List<WebElement> yearsOfExperience = driver.findElements(By.
                cssSelector("div.control-group:nth-child(23)"));
        for (WebElement yearOfExperience : yearsOfExperience) {
            // Search for Radio Button in the Radio Group and select it
            if (yearOfExperience.getAttribute("id").equals("exp-")) {
                if (!yearOfExperience.isSelected()) {
                    yearOfExperience.click();
                }
                assertTrue(yearOfExperience.isSelected());
                break;
            }
        }
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
