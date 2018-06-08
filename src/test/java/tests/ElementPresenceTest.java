package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import tests.basetests.ToolsQaAutomationPracticeFormBaseTest;

import static helpermethods.GetCurrentExecutableTestName.printCurrentExecutableTestName;
import static junit.framework.TestCase.fail;

public class ElementPresenceTest extends ToolsQaAutomationPracticeFormBaseTest {

    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    @Test
    public void testIsElementPresent() {
        // Print the name of the current executed test
        printCurrentExecutableTestName();

        // Check if element with locator criteria exists on Page
        if (isElementPresent(By.
                cssSelector("#profession-0"))) {
            // Get the checkbox and select it
            WebElement profession = driver.findElement(By.
                    cssSelector("#profession-0"));
            if (!profession.isSelected()) {
                profession.click();
            }
        } else {
            fail("Profession Checkbox doesn't exists!!");
        }
    }
}
