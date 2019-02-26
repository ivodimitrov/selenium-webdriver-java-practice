package seleniumwebdriver3practicalguide.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class DriverFactory {

  protected WebDriver driver;

  @BeforeMethod
  public void beforeMethod() {

    // Set path of drivers executable
    System.setProperty("webdriver.chrome.driver",
            "./src/test/resources/drivers/chromedriver");
    System.setProperty("webdriver.gecko.driver",
            "./src/test/resources/drivers/geckodriver");
    System.setProperty("webdriver.opera.driver",
            "./src/test/resources/drivers/operadriver");

    // Initialize new WebDriver session
    ChromeOptions chromeOptions = new ChromeOptions();
    chromeOptions.setHeadless(false);

    driver = new ChromeDriver(chromeOptions);

    FirefoxOptions firefoxOptions = new FirefoxOptions();
    firefoxOptions.setHeadless(false);

//    driver = new FirefoxDriver(firefoxOptions);
//    driver = new SafariDriver();
//    driver = new OperaDriver();

    // Maximize browser window
    driver.manage().window().maximize();

    // Navigate to the web site
    driver.get("http://demo-store.seleniumacademy.com/");
  }

  @AfterMethod
  public void afterMethod() {
    // Close and quit the browser
    driver.quit();
  }
}
