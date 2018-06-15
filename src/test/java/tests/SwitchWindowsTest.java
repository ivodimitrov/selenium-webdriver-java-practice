package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import utils.BaseTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static utils.Links.CONFIG_PAGE;
import static utils.Links.SWITCH_WINDOWS_PAGE;

public class SwitchWindowsTest extends BaseTest {

    @Test
    public void testWindowUsingName() {
        goToPageAndWaitPageToLoad(SWITCH_WINDOWS_PAGE);

        // Store WindowHandle of parent browser window
        String parentWindowId = getWebDriver().getWindowHandle();
        // Clicking New Message Window button will open new child window
        getWebDriver().findElement(By.
                cssSelector("#content > p:nth-child(5) > button:nth-child(1)")).click();
        try {
            // Switch to the new Message window using name
            getWebDriver().switchTo().window("MsgWindow");
            try {
                // Check the driver context is in Message window
                assertTrue("Message window does not exist", getWebDriver().getPageSource().
                        contains("Knowledge increases by sharing but not by saving."));
            } finally {
                // Close the Message window
                getWebDriver().close();
            }
        } finally {
            // Switch to the parent browser window
            getWebDriver().switchTo().window(parentWindowId);
        }
        // Check driver context is in parent browser window
        assertEquals("Parent window does not exist",
                "A new title is here",
                getWebDriver().getTitle());
    }

    @Test
    public void testWindowUsingContents() {
        goToPageAndWaitPageToLoad(CONFIG_PAGE);

        // Store WindowHandle of parent browser window
        String currentWindowId = getWebDriver().getWindowHandle();
        // Clicking Chat Button will open Chat Page in a new child window
        getWebDriver().findElement(By.id("chatbutton")).click();
        // There is no name or title provided for Chat Page window
        // Iterate through all the open windows
        // and check the contents to find out if it's Chat window
        try {
            for (String windowId : getWebDriver().getWindowHandles()) {
                getWebDriver().switchTo().window(windowId);
                // We will use the page source to check the contents
                String pageSource = getWebDriver().getPageSource();
                if (pageSource.contains("Configuration - Online Chat")) {
                    // Check the page for an element displaying a expected message
                    assertEquals("Chat window does not exist",
                            "Wait while we connect you to Chat...",
                            getWebDriver().findElement(By.tagName("p")).getText());
                    // Find the Close Button on Chat Window and close the window
                    // by clicking Close Button
                    getWebDriver().findElement(By.id("closebutton")).click();
                    break;
                }
            }
        } finally {
            // Switch back to the parent browser window
            getWebDriver().switchTo().window(currentWindowId);
        }
        // Check driver context is in parent browser window
        assertEquals("Parent window does not exist",
                "Build my Car - Configuration", getWebDriver().getTitle());
    }
}
