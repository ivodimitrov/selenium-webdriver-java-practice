package tests;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.BaseTest;

import static org.junit.Assert.assertEquals;
import static utils.Links.ALERTS_PAGE;

public class AlertsTest extends BaseTest {

    @Test
    public void testSimpleAlert() {
        // Go to page
        goToPageAndWaitPageToLoad(ALERTS_PAGE);

        // Click Simple button to show an Alert box
        WebElement simpleAlertButton = getWebDriver().findElement(By.
                xpath("//*[@id='content']/p[4]/button"));
        simpleAlertButton.click();

        // Optionally we can also wait for an Alert box using the WebDriverWait
        new WebDriverWait(getWebDriver(), 10)
                .until(ExpectedConditions.alertIsPresent());
        // Get the Alert
        Alert alert = getWebDriver().switchTo().alert();
        // Get the text displayed on Alert
        String textOnAlert = alert.getText();
        // Check correct message is displayed to the user on Alert box
        assertEquals("A simple Alert", textOnAlert);
        // Click OK button, by calling accept method
        alert.accept();
    }

    @Test
    public void testConfirmAccept() {
        // Go to page
        goToPageAndWaitPageToLoad(ALERTS_PAGE);

        // Click Confirm button to show Confirmation Alert box
        WebElement confirmPopUpButton = getWebDriver().findElement(By.
                xpath("//*[@id='content']/p[8]/button"));
        confirmPopUpButton.click();
        // Get the Alert
        Alert alert = getWebDriver().switchTo().alert();
        // Get the text displayed on Alert
        String textOnAlert = alert.getText();
        // Check correct message is displayed to the user on Alert box
        assertEquals("Confirm pop up with OK and Cancel button", textOnAlert);
        // Click OK button, by calling accept method
        alert.accept();
    }

    @Test
    public void testPrompt() {
        // Go to page
        goToPageAndWaitPageToLoad(ALERTS_PAGE);

        // Click Confirm button to show Prompt Alert box
        getWebDriver().findElement(By.
                xpath("//*[@id='content']/p[11]/button")).click();
        // Get the Alert
        Alert alert = getWebDriver().switchTo().alert();
        String textOnAlert = alert.getText();
        // Check correct message is displayed to the user on Alert box
        assertEquals("Do you like toolsqa?", textOnAlert);
        // Enter some value on Prompt Alert box
        alert.sendKeys("Yes");
        // Click OK button, by calling accept method
        alert.accept();
    }
}
