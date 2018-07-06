package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.DemoQaSelectablePage;
import tests.demoqaselectable.DemoQaSelectableBaseTest;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class KeyboardEventsTest extends DemoQaSelectableBaseTest {

    @Test
    public void testRowSelectionUsingControlKey() {

        // goToPageAndWaitPageToLoad(DEMOQA_SELECTABLE_PAGE);

        DemoQaSelectablePage demoQaSelectablePage = new DemoQaSelectablePage(getWebDriver());


        // TODO
        // Wait for the link to load, timeout after 10 seconds
        new WebDriverWait(getWebDriver(), 10).until((ExpectedCondition<WebElement>) d -> d.findElement(By.
                cssSelector("#selectable")));

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

