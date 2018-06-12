package tests;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.BaseTest;
import utils.Links;

import javax.annotation.Nonnull;

import static org.junit.Assert.assertEquals;

public class AlertsTest extends BaseTest {

    @Test
    public void testSimpleAlert() {
        // Go to page
        getWebDriver().get(Links.ALERTS_PAGE);
        // Wait for the page to load, timeout after 10 seconds
        new WebDriverWait(getWebDriver(), 10).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(@Nonnull WebDriver d) {
                return d.getTitle().toLowerCase()
                        .startsWith("toolsqa");
            }
        });

        // Click Simple button to show an Alert box
        WebElement simpleAlertButton = getWebDriver().findElement(By.
                cssSelector("#content > p:nth-child(7) > button:nth-child(3)"));
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
}
