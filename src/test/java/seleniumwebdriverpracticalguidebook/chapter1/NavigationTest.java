package seleniumwebdriverpracticalguidebook.chapter1;

import org.testng.annotations.Test;
import seleniumwebdriverpracticalguidebook.config.DriverFactory;

import static org.testng.Assert.assertEquals;

public class NavigationTest extends DriverFactory {

  @Test
  public void navigateToUrl() {

    // Navigate to the web site
    driver.get("http://demo-store.seleniumacademy.com/");

    // Validate page title
    assertEquals(driver.getTitle(), "Madison Island");
  }
}
