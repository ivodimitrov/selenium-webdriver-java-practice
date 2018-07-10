package tests.seleniumacademyconfig;

import org.junit.Test;
import pages.SeleniumAcademyConfigPage;

import static java.lang.Thread.sleep;
import static org.junit.Assert.assertTrue;

public class SwitchWindowTest extends SeleniumAcademyConfigBaseTest {

    @Test
    public void testWindowUsingContents() throws InterruptedException {

        SeleniumAcademyConfigPage seleniumAcademyConfigPage =
                super.initLoad();

        // Store WindowHandle of parent browser window
        seleniumAcademyConfigPage.getParentWindowId();

        // Clicking Chat Button will open Chat Page in a new child window
        seleniumAcademyConfigPage.clickOnlineChatSupportButton();

        sleep(500);

        seleniumAcademyConfigPage.getContentOfChatWindow();

        assertTrue("Chat window does not exist",
                seleniumAcademyConfigPage.verifyParagraphElementText());

        // Simple Logger
        seleniumAcademyConfigPage.printChatWindowText();

        // Find the Close Button on Chat Window and close the window
        seleniumAcademyConfigPage.clickCloseButton();

        // Switch back to the parent browser window
        seleniumAcademyConfigPage.switchToParentBrowserWindow();

        // Check driver context is in parent browser window
        assertTrue("Parent window does not exist",
                seleniumAcademyConfigPage.verifyDriverContextInParentBrowserWindow());
    }
}
