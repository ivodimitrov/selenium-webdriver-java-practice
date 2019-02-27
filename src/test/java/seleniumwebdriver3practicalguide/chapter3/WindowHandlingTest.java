package seleniumwebdriver3practicalguide.chapter3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import seleniumwebdriver3practicalguide.config.DriverFactory;

public class WindowHandlingTest extends DriverFactory {

  @Test
  public void handleWindow() {

    driver.get("http://guidebook.seleniumacademy.com/Window.html");

    String firstWindow = driver.getWindowHandle();
    System.out.println("First Window Handle is: " + firstWindow);

    WebElement link = driver.findElement(By.linkText("Google Search"));
    link.click();

    String secondWindow = driver.getWindowHandle();
    System.out.println("Second Window Handle is: " + secondWindow);
    System.out.println("Number of Window Handles are: "
            + driver.getWindowHandles().size());

    driver.switchTo().window(firstWindow);
  }
}
