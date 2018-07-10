package tests.toolsqaswitchwindowspage;

import org.junit.Test;
import pages.ToolsQaSwitchWindowsPage;

import static org.junit.Assert.assertTrue;

public class SwitchWindowsTest extends ToolsQaSwitchWindowBaseTest {

    @Test
    public void testWindowUsingName() {

        ToolsQaSwitchWindowsPage toolsQaSwitchWindowsPage = super.initLoad();

        // Store WindowHandle of parent browser window
        toolsQaSwitchWindowsPage.getParentWindowId();

        // Clicking New Message Window button will open new child window
        toolsQaSwitchWindowsPage.clickNewMessageWindowButton();

        try {
            toolsQaSwitchWindowsPage.switchToNewMessageWindow();
            try {
                // Check the driver context is in Message window
                assertTrue("Message window does not exist",
                        toolsQaSwitchWindowsPage.verifyDriverContextInMessageWindow());
            } finally {
//                // Close the Message window
                toolsQaSwitchWindowsPage.closeMessageWindow();
            }
        } finally {
            // Switch to the parent browser window
            toolsQaSwitchWindowsPage.switchToParentBrowserWindow();
        }
        // Check driver context is in parent browser window
        assertTrue("Parent window does not exist",
                toolsQaSwitchWindowsPage.verifyDriverContextInParentBrowserWindow());
    }
}
