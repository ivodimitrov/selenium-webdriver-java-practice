package seleniumtestingtoolscookbook.tests.demoqaselectable;

import org.junit.Test;
import seleniumtestingtoolscookbook.pages.demoqa.DemoQaSelectablePage;

import static org.junit.Assert.assertEquals;

public class KeyboardEventsTest extends DemoQaSelectableBaseTest {

    @Test
    public void testRowSelectionUsingControlKey() {

        DemoQaSelectablePage demoQaSelectablePage = super.initLoad();

        demoQaSelectablePage.waitToSelectElement();

        demoQaSelectablePage.selectTableRowsUsingControlKey();

        // Verify Selected Row table shows two rows selected
        assertEquals(2, demoQaSelectablePage.getRows().size());
    }
}

