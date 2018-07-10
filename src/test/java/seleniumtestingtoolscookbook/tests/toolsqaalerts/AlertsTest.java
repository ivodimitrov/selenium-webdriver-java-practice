package seleniumtestingtoolscookbook.tests.toolsqaalerts;

import org.junit.Test;
import seleniumtestingtoolscookbook.pages.ToolsQaAlertsPage;

import static java.lang.Thread.sleep;
import static org.junit.Assert.assertEquals;

public class AlertsTest extends ToolsQaAlertsBaseTest {

    @Test
    public void testSimpleAlert() throws InterruptedException {

        ToolsQaAlertsPage toolsQaAlertsPage = super.initLoad();

        toolsQaAlertsPage.clickSimpleAlertButton();

        // Get the Alert
        toolsQaAlertsPage.switchToAlert();

        // Thread sleep for 1 sec to see visual result
        sleep(1000);

        // Simple Logger
        toolsQaAlertsPage.printAlertText();

        // Check correct message is displayed to the user on Alert box
        assertEquals("A simple Alert",
                toolsQaAlertsPage.getAlertText());

        // Click OK button, by calling accept method
        toolsQaAlertsPage.alert.accept();
    }

    @Test
    public void testConfirmAccept() throws InterruptedException {

        ToolsQaAlertsPage toolsQaAlertsPage = super.initLoad();

        toolsQaAlertsPage.clickConfirmPopUpButton();

        // Get the Alert
        toolsQaAlertsPage.switchToAlert();

        // Thread sleep for 1 sec to see visual result
        sleep(1000);

        // Simple Logger
        toolsQaAlertsPage.printAlertText();

        // Check correct message is displayed to the user on Alert box
        assertEquals("Confirm pop up with OK and Cancel button",
                toolsQaAlertsPage.getAlertText());

        // Click OK button, by calling accept method
        toolsQaAlertsPage.alert.accept();
    }

    @Test
    public void testPrompt() throws InterruptedException {

        ToolsQaAlertsPage toolsQaAlertsPage = super.initLoad();

        toolsQaAlertsPage.clickPromptAlertBoxButton();

        // Get the Alert
        toolsQaAlertsPage.switchToAlert();

        // Thread sleep for 1 sec to see visual result
        sleep(1000);

        // Simple Logger
        toolsQaAlertsPage.printAlertText();

        // Check correct message is displayed to the user on Alert box
        assertEquals("Do you like toolsqa?",
                toolsQaAlertsPage.getAlertText());

        // Enter some value on Prompt Alert box
        toolsQaAlertsPage.alert.sendKeys("Yes");

        // Thread sleep for 1 sec to see visual result
        sleep(1000);

        // Click OK button, by calling accept method
        toolsQaAlertsPage.alert.accept();
    }
}
