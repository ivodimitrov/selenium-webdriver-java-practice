package tests.toolsqaalerts;

import org.junit.Test;
import org.openqa.selenium.Alert;
import pages.ToolsQaAlertsPage;

import static org.junit.Assert.assertEquals;

public class AlertsTest extends ToolsQaAlertsPageBaseTest {

    @Test
    public void testSimpleAlert() {

        ToolsQaAlertsPage toolsQaAlertsPage = super.initLoad();

        toolsQaAlertsPage.clickSimpleAlertButton();


        // TODO
        // Get the Alert
        Alert alert = getWebDriver().switchTo().alert();
        // Get the text displayed on Alert
        String textOnAlert = alert.getText();
        // Simple Logger
        System.out.println("Alert text is: " + textOnAlert);
        // Check correct message is displayed to the user on Alert box
        assertEquals("A simple Alert", textOnAlert);
        // Click OK button, by calling accept method
        alert.accept();
    }

    @Test
    public void testConfirmAccept() {

        ToolsQaAlertsPage toolsQaAlertsPage = super.initLoad();

        toolsQaAlertsPage.clickConfirmPopUpButton();


        // TODO
        // Get the Alert
        Alert alert = getWebDriver().switchTo().alert();
        // Get the text displayed on Alert
        String textOnAlert = alert.getText();
        // Simple Logger
        System.out.println("Alert text is: " + textOnAlert);
        // Check correct message is displayed to the user on Alert box
        assertEquals("Confirm pop up with OK and Cancel button", textOnAlert);
        // Click OK button, by calling accept method
        alert.accept();
    }

    @Test
    public void testPrompt() {

        ToolsQaAlertsPage toolsQaAlertsPage = super.initLoad();

        toolsQaAlertsPage.clickPromptAlertBoxButton();


        // TODO
        // Get the Alert
        Alert alert = getWebDriver().switchTo().alert();
        String textOnAlert = alert.getText();
        // Check correct message is displayed to the user on Alert box
        assertEquals("Do you like toolsqa?", textOnAlert);
        // Simple Logger
        System.out.println("Alert text is: " + textOnAlert);
        // Enter some value on Prompt Alert box
        alert.sendKeys("Yes");
        // Click OK button, by calling accept method
        alert.accept();
    }
}
