package seleniumwebdriver3practicalguide.chapter1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class NavigationTest {

  private WebDriver driver;

  @BeforeMethod
  public void beforeMethod() {

    // Set path of drivers executable
    System.setProperty("webdriver.chrome.driver",
            "./src/test/resources/drivers/chromedriver");

    System.setProperty("webdriver.gecko.driver",
            "./src/test/resources/drivers/geckodriver");

    System.setProperty("webdriver.opera.driver",
            "./src/test/resources/drivers/operadriver");

    // Initialize new WebDriver session”
    driver = new ChromeDriver();
//    driver = new FirefoxDriver();
//    driver = new SafariDriver();
//    driver = new OperaDriver();
  }

  @Test
  public void navigateToAUrl() {
    // Maximize browser window
    driver.manage().window().maximize();

    // Navigate to the web site
    driver.get("http://demo-store.seleniumacademy.com/");
    // Validate page title
    assertEquals(driver.getTitle(), "Madison Island");
  }

  @AfterMethod
  public void afterMethod() {
    // Close and quit the browser
    driver.quit();
  }
}
