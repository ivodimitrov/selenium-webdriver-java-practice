package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseTest;

import static org.junit.Assert.assertEquals;

public class ElementTextTest extends BaseTest {

    @Test
    public void testFirstNameElementText() {
        // Get the First name Element
        WebElement firstNameText = getWebDriver().findElement(By.
                cssSelector("div.control-group:nth-child(11)"));
        // Get the element's text
        String firstNameElementText = firstNameText.getText();

        System.out.println("Element's text is: " + firstNameElementText);
        // Verify message element's text
        assertEquals("Verify message element's text",
                "First name:", firstNameElementText);
    }
}
