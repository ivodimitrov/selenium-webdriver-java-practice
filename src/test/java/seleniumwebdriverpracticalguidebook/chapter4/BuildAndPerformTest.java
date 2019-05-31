package seleniumwebdriverpracticalguidebook.chapter4;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import seleniumwebdriverpracticalguidebook.config.DriverFactory;

public class BuildAndPerformTest extends DriverFactory {

  @Test
  public void shouldPerformCompositeAction() {

    driver.get("http://guidebook.seleniumacademy.com/Selectable.html");

    WebElement one = driver.findElement(By.name("one"));
    WebElement three = driver.findElement(By.name("three"));
    WebElement five = driver.findElement(By.name("five"));

    // Add all the actions into the Actions builder
    Actions actions = new Actions(driver);
    actions.keyDown(Keys.CONTROL)
            .click(one)
            .click(three)
            .click(five)
            .keyUp(Keys.CONTROL);

    // Generate the composite action
    Action compositeAction = actions.build();

    // Perform the composite action.
    compositeAction.perform();
  }

  @Test
  public void shouldPerformAction() {

    driver.get("http://guidebook.seleniumacademy.com/Selectable.html");

    WebElement one = driver.findElement(By.name("one"));
    WebElement three = driver.findElement(By.name("three"));
    WebElement five = driver.findElement(By.name("five"));

    // Add all the actions into the Actions builder.
    Actions actions = new Actions(driver);
    actions.keyDown(Keys.CONTROL)
            .click(one)
            .click(three)
            .click(five)
            .keyUp(Keys.CONTROL);

    // Perform the action
    actions.perform();
  }
}
