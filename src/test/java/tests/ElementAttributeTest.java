package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import tests.basetests.GmailBaseTest;

import static org.junit.Assert.assertEquals;

public class ElementAttributeTest extends GmailBaseTest {

    @Test
    public void testElementAttributeValue() {
        // Get the Create An Account Element
        WebElement createAnAccountLink = driver.findElement(By.
                cssSelector(".hero_home__link__desktop"));
        // Verify an element's attribute value
        assertEquals("Verify an element's attribute value",
                "Get Gmail", createAnAccountLink.getAttribute("data-g-label"));
    }

    @Test
    public void testElementStyle() {
        // Get the Create An Account Element
        WebElement createAnAccountLink = driver.findElement(By.
                cssSelector(".hero_home__link__desktop"));
        // CSS value
        String textAlign = createAnAccountLink.getCssValue("text-align");
        // Verify an element's CSS value
        assertEquals("Verify an element's CSS value",
                "center", textAlign);
    }
}
