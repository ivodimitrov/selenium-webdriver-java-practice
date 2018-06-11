package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import utils.ToolsQaBaseTest;

import static junit.framework.TestCase.fail;

public class ElementPresenceTest extends ToolsQaBaseTest {

    private boolean isElementPresent(By by) {
        try {
            getWebDriver().findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    @Test
    public void testIsElementPresent() {
        // Check if element with locator criteria exists on Page
        if (isElementPresent(By.
                cssSelector("#profession-0"))) {
            // Get the checkbox and select it
            WebElement profession = getWebDriver().findElement(By.
                    cssSelector("#profession-0"));
            if (!profession.isSelected()) {
                profession.click();
            }
        } else {
            fail("Profession Checkbox doesn't exists!!");
        }
    }
}
