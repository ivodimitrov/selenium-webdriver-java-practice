package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import utils.BaseTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static utils.Links.SWITCH_WINDOWS_PAGE;

public class SwitchWindowsTest extends BaseTest {

    @Test
    public void testWindowUsingName() {
        // Go to page
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
        assertEquals("A new title is here",
                getWebDriver().getTitle());
    }
}
