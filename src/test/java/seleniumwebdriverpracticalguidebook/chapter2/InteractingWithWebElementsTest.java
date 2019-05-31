package seleniumwebdriverpracticalguidebook.chapter2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import seleniumwebdriverpracticalguidebook.config.DriverFactory;


public class InteractingWithWebElementsTest extends DriverFactory {

  @Test
  public void elementGetAttributesExample() {

    // Navigate to the web site
    driver.get("http://demo-store.seleniumacademy.com/");

    WebElement searchBox = driver.findElement(By.name("q"));

    System.out.println("Name of the box is: "
            + searchBox.getAttribute("name"));
    System.out.println("Id of the box is: " + searchBox.getAttribute("id"));
    System.out.println("Class of the box is: "
            + searchBox.getAttribute("class"));
    System.out.println("Placeholder of the box is: "
            + searchBox.getAttribute("placeholder"));
  }

  @Test
  public void elementGetTextExample() {

    // Navigate to the web site
    driver.get("http://demo-store.seleniumacademy.com/");

    WebElement siteNotice = driver.findElement(By
            .className("global-site-notice"));

    System.out.println("Complete text is: "
            + siteNotice.getText());
  }

  @Test
  public void elementGetCssValueExample() {

    // Navigate to the web site
    driver.get("http://demo-store.seleniumacademy.com/");

    WebElement searchBox = driver.findElement(By.name("q"));

    System.out.println("Font of the box is: "
            + searchBox.getCssValue("font-family"));
  }

  @Test
  public void elementGetLocationAndSizeExample() {

    // Navigate to the web site
    driver.get("http://demo-store.seleniumacademy.com/");

    WebElement searchBox = driver.findElement(By.name("q"));

    System.out.println("Location of the box (x, y) is: "
            + searchBox.getLocation());
    System.out.println("Size of the box is: "
            + searchBox.getSize());
  }

  @Test
  public void elementGetTagNameExample() {

    // Navigate to the web site
    driver.get("http://demo-store.seleniumacademy.com/");

    WebElement searchButton = driver.findElement(By.className("search-button"));

    System.out.println("Html tag of the button is: "
            + searchButton.getTagName());
  }
}
