package seleniumtestingtoolscookbook.tests.demoqaselectable;

import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import seleniumtestingtoolscookbook.pages.demoqa.DemoQaSelectablePage;

import static org.junit.Assert.assertEquals;

public class KeyboardEventsTest extends DemoQaSelectableBaseTest {

    @Test
    public void testRowSelectionUsingControlKey() {

        DemoQaSelectablePage demoQaSelectablePage = super.initLoad();

        demoQaSelectablePage.waitToSelectElement();

        // Select second and fourth row from table using Control Key.
        // Row Index start at 0
        Actions builder = new Actions(getWebDriver());
        builder.click(demoQaSelectablePage.getTableRows().get(1))
                .keyDown(Keys.CONTROL)
                .click(demoQaSelectablePage.getTableRows().get(3))
                .keyUp(Keys.CONTROL)
                .build().perform();

        // Verify Selected Row table shows two rows selected
        assertEquals(2, demoQaSelectablePage.getRows().size());
    }
}

