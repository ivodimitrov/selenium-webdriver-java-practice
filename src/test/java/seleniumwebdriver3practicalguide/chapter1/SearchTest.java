package seleniumwebdriver3practicalguide.chapter1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;


public class SearchTest {

  private WebDriver driver;

  @BeforeMethod
  public void setup() {

    // Set path of drivers executable
    System.setProperty("webdriver.chrome.driver",
            "./src/test/resources/drivers/chromedriver");

    // Initialize new WebDriver session
    driver = new ChromeDriver();
    // Maximize browser window
    driver.manage().window().maximize();
    // Navigate to the web site
    driver.get("http://demo-store.seleniumacademy.com/");
  }

  @Test
  public void searchProduct() {
    // Find search box and enter search string
    WebElement searchBox = driver.findElement(By.name("q"));

    searchBox.sendKeys("Phones");
    WebElement searchButton = driver.findElement(By.className("search-button"));
    searchButton.click();

    assertTrue(driver.getTitle().equalsIgnoreCase("Search results for: 'Phones'"));
  }

  @AfterMethod
  public void tearDown() {
    // Close and quit the browser
    driver.quit();
  }
}
