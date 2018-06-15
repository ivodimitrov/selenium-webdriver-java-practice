package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseTest;

import static org.junit.Assert.assertEquals;
import static utils.Links.IFRAME_PAGE;

public class FramesTest extends BaseTest {

    @Test
    public void testFrameWithIdOrName() {
        goToPageAndWaitPageToLoad(IFRAME_PAGE);
        try {
            // Activate the frame on left side using it's id attribute
            getWebDriver().switchTo().frame("IF1");
            // Get an element from the frame on left side and verify it's contents
            WebElement buttonButton = getWebDriver().findElement(By.
                    cssSelector("#submit"));
            assertEquals("Button", buttonButton.getText());
        } finally {
            // Activate the Page, this will move context from frame back to the Page
            getWebDriver().switchTo().defaultContent();
        }
        try {
            // Activate the frame on right side using it's name attribute
            getWebDriver().switchTo().frame("IF2");
            // Get an element from the frame on right side and verify it's contents
            WebElement tab1Tab = getWebDriver().findElement(By.
                    cssSelector("#ui-id-1"));
            assertEquals("Tab 1", tab1Tab.getText());
        } finally {

            // Activate the Page, this will move context from frame back to the Page
            getWebDriver().switchTo().defaultContent();
        }
    }
}
