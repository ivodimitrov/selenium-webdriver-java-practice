package seleniumtestingtoolscookbook.tests.toolsqaautomationpracticeform;

import org.junit.Test;
import seleniumtestingtoolscookbook.pages.ToolsQaAutomationPracticePage;

import static org.junit.Assert.assertEquals;

public class FindElementsTest extends ToolsQaPracticeFormBaseTest {

    @Test
    public void testFindElements() {

        ToolsQaAutomationPracticePage toolsQaAutomationPracticePage =
                super.initLoad();

        toolsQaAutomationPracticePage.printLinks();

        assertEquals("Verify numbers of links displayed on the page",
                219, toolsQaAutomationPracticePage
                        .getLinks().size());
    }
}
