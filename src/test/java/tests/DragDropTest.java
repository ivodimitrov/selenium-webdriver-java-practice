package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import static org.testng.AssertJUnit.assertEquals;

public class DragDropTest {

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
        driver.get("http://demoqa.com/droppable/");
    }

    @Test
    public void testDragDrop() {

        WebElement source = driver.findElement(By.id("draggableview"));
        WebElement target = driver.findElement(By.id("droppableview"));

        Actions builder = new Actions(driver);
        builder.dragAndDrop(source, target).perform();
        assertEquals("Dropped!", target.getText());
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
