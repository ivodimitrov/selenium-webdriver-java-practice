package seleniumwebdriver3practicalguide.chapter3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import seleniumwebdriver3practicalguide.config.DriverFactory;

public class FrameHandlingTest extends DriverFactory {

  @Test
  public void switchBetweenFrames() {

    driver.get("http://guidebook.seleniumacademy.com/Frames.html");

    // First Frame
    driver.switchTo().frame(0);

    WebElement firstField = driver.findElement(By.name("1"));
    firstField.sendKeys("I'm Frame One");
    driver.switchTo().defaultContent();

    // Second Frame
    driver.switchTo().frame(1);

    WebElement secondField = driver.findElement(By.name("2"));
    secondField.sendKeys("I'm Frame Two");
  }
}
