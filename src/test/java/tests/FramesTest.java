package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseTest;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static utils.Links.CONFIG_PAGE;
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
            assertEquals("Button is not found!",
                    "Button", buttonButton.getText());
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
            assertEquals("Tab 1 is not found!",
                    "Tab 1", tab1Tab.getText());
        } finally {
            // Activate the Page, this will move context from frame back to the Page
            getWebDriver().switchTo().defaultContent();
        }
    }

    @Test
    public void testFrameByIndex() {
        goToPageAndWaitPageToLoad(IFRAME_PAGE);

        try {
            // Activate the frame in middle using it's index. Index starts at 0
            getWebDriver().switchTo().frame(0);
            // Get an element from the frame on left side and verify it's contents
            WebElement buttonButton = getWebDriver().findElement(By.
                    cssSelector("#submit"));
            assertEquals("Button is not found!",
                    "Button", buttonButton.getText());
        } finally {
            // Activate the Page, this will move context from frame back to the Page
            getWebDriver().switchTo().defaultContent();
        }
        try {
            // Activate the frame on right side using it's name attribute
            getWebDriver().switchTo().frame(1);
            // Get an element from the frame on right side and verify it's contents
            WebElement tab1Tab = getWebDriver().findElement(By.
                    cssSelector("#ui-id-1"));
            assertEquals("Tab 1 is not found!",
                    "Tab 1", tab1Tab.getText());
        } finally {
            // Activate the Page, this will move context from frame back to the Page
            getWebDriver().switchTo().defaultContent();
        }
    }

    @Test
    public void testFrameByContents() {
        goToPageAndWaitPageToLoad(CONFIG_PAGE);

        // Get all iframes on the Page, created with <frame> tag
        List<WebElement> frames = getWebDriver().findElements(By.tagName("frame"));

        // Activate iframe and check if it has the desired content.
        // If found perform the operations.
        // If not, then switch back to the Page and continue checking next frame
        try {
            for (WebElement frame : frames) {
                // switchTo().frame() also accepts frame elements apart from id,
                // name or index
                getWebDriver().switchTo().frame(frame);
                String title = getWebDriver().getTitle();
                if (title.equals("Frame B")) {
                    WebElement msg = getWebDriver().findElement(By.tagName("p"));
                    assertEquals("This is Left Frame", msg.getText());
                    break;
                } else
                    getWebDriver().switchTo().defaultContent();
            }
        } finally {
            // Activate the Page, this will move context from frame back to the Page
            getWebDriver().switchTo().defaultContent();
        }
    }
}
