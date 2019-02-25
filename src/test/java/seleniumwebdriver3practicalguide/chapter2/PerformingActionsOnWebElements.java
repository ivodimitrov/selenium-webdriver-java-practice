package seleniumwebdriver3practicalguide.chapter2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import seleniumwebdriver3practicalguide.config.DriverFactory;

import static org.testng.Assert.assertTrue;

public class PerformingActionsOnWebElements extends DriverFactory {

  @Test
  public void elementSendKeysExample() {

    WebElement searchBox = driver.findElement(By.name("q"));
    searchBox.sendKeys("Phones");
    searchBox.submit();

    assertTrue(driver.getTitle().equalsIgnoreCase("Search results for: 'Phones'"));
  }

  @Test
  public void elementStateExample() {

    WebElement searchBox = driver.findElement(By.name("q"));

    System.out.println("Search box is displayed: "
            + searchBox.isDisplayed());
    System.out.println("Search box is enabled: "
            + searchBox.isEnabled());
    System.out.println("Search box is selected: "
            + searchBox.isSelected());
  }
}
