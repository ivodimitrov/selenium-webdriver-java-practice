package seleniumwebdriver3practicalguide.chapter2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import seleniumwebdriver3practicalguide.config.DriverFactory;

import static org.testng.Assert.assertTrue;

public class PerformingActionsOnWebElementsTest extends DriverFactory {

  @Test
  public void elementSendKeysExample() {

    // Navigate to the web site
    driver.get("http://demo-store.seleniumacademy.com/");

    WebElement searchBox = driver.findElement(By.name("q"));
    searchBox.sendKeys("Phones");
    searchBox.submit();

    assertTrue(driver.getTitle().equalsIgnoreCase("Search results for: 'Phones'"));
  }

  @Test
  public void elementStateExample() {

    // Navigate to the web site
    driver.get("http://demo-store.seleniumacademy.com/");

    WebElement searchBox = driver.findElement(By.name("q"));

    System.out.println("Search box is displayed: "
            + searchBox.isDisplayed());
    System.out.println("Search box is enabled: "
            + searchBox.isEnabled());
    System.out.println("Search box is selected: "
            + searchBox.isSelected());
  }
}
