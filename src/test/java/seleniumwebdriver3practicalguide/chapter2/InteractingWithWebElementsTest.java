package seleniumwebdriver3practicalguide.chapter2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import seleniumwebdriver3practicalguide.config.DriverFactory;


public class InteractingWithWebElementsTest extends DriverFactory {

  @Test
  public void elementGetAttributesExample() {

    WebElement searchBox = driver.findElement(By.name("q"));
    System.out.println("Name of the box is: "
            + searchBox.getAttribute("name"));
    System.out.println("Id of the box is: " + searchBox.getAttribute("id"));
    System.out.println("Class of the box is: "
            + searchBox.getAttribute("class"));
    System.out.println("Placeholder of the box is: "
            + searchBox.getAttribute("placeholder"));
  }
}
