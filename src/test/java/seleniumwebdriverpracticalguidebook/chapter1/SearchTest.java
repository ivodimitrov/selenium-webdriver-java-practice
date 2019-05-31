package seleniumwebdriverpracticalguidebook.chapter1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import seleniumwebdriverpracticalguidebook.config.DriverFactory;

import static org.testng.Assert.assertTrue;


public class SearchTest extends DriverFactory {

  @Test
  public void searchProduct() {

    // Navigate to the web site
    driver.get("http://demo-store.seleniumacademy.com/");

    // Find search box and enter search string
    WebElement searchBox = driver.findElement(By.name("q"));

    searchBox.sendKeys("Phones");
    WebElement searchButton = driver.findElement(By.className("search-button"));
    searchButton.click();

    assertTrue(driver.getTitle().equalsIgnoreCase("Search results for: 'Phones'"));
  }
}
