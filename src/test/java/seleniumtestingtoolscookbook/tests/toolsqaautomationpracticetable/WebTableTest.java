package seleniumtestingtoolscookbook.tests.toolsqaautomationpracticetable;

import org.junit.Test;
import seleniumtestingtoolscookbook.pages.ToolsQaTablePage;

import static org.junit.Assert.assertEquals;

public class WebTableTest extends ToolsQaTableBaseTest {

    @Test
    public void testWebTable() {

        ToolsQaTablePage toolsQaTablePage = super.initLoad();

        // Verify number of rows in table
        assertEquals(6, toolsQaTablePage.getAllRows().size());

        // Simple Logger
        toolsQaTablePage.printAllRows();
    }
}
