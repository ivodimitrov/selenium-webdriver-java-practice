package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseTest;

import static org.junit.Assert.assertEquals;

public class ElementAttributeTest extends BaseTest {

    @Test
    public void testElementAttributeValue() {
        // Get the Partial Link Test Element
        WebElement partialLink = getWebDriver().findElement(By.
                cssSelector("div.control-group:nth-child(5) > a:nth-child(1)"));
        // Verify an element's attribute value
        assertEquals("Verify an element's attribute value",
                "Automation Practice Form", partialLink.getAttribute("title"));
    }

    @Test
    public void testElementStyle() {
        // Get the Partial Link Test Element
        WebElement partialLink = getWebDriver().findElement(By.
                cssSelector("div.control-group:nth-child(5) > a:nth-child(1)"));
        // CSS value
        String marginBottom = partialLink.getCssValue("margin-bottom");
        // Verify an element's CSS value
        assertEquals("Verify an element's CSS value",
                "0px", marginBottom);
    }
}
