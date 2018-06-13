package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.BaseTest;

import javax.annotation.Nonnull;
import java.util.List;

import static org.testng.AssertJUnit.assertEquals;
import static utils.Links.SELECTABLE_PAGE;

public class KeyboardEventsTest extends BaseTest {

    @Test
    public void testRowSelectionUsingControlKey() {
        // Go to page
        goToPageAndWaitPageToLoad(SELECTABLE_PAGE);

        // Wait for the link to load, timeout after 10 seconds
        new WebDriverWait(getWebDriver(), 10).until(new ExpectedCondition<WebElement>() {
            public WebElement apply(@Nonnull WebDriver d) {
                return d.findElement(By.
                        cssSelector("#selectable"));
            }
        });

        List<WebElement> tableRows = getWebDriver().findElements(By.
                cssSelector("#selectable li.ui-widget-content"));

        // Select second and fourth row from table using Control Key.
        // Row Index start at 0
        Actions builder = new Actions(getWebDriver());
        builder.click(tableRows.get(1))
                .keyDown(Keys.CONTROL)
                .click(tableRows.get(3))
                .keyUp(Keys.CONTROL)
                .build().perform();

        // Verify Selected Row table shows two rows selected
        List<WebElement> rows = getWebDriver().findElements(By.
                cssSelector(".ui-selected"));
        assertEquals(2, rows.size());
    }
}

