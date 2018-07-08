package tests.toolsqaautomationpracticeform;

import org.junit.Test;
import pages.ToolsQaAutomationPracticeFormPage;

import static org.junit.Assert.assertEquals;

public class FindElementsTest extends ToolsQaPracticeFormBaseTest {

    @Test
    public void testFindElements() {

        ToolsQaAutomationPracticeFormPage toolsQaAutomationPracticeFormPage =
                super.initLoad();

        toolsQaAutomationPracticeFormPage.printLinks();

        assertEquals("Verify numbers of links displayed on the page",
                219, toolsQaAutomationPracticeFormPage
                        .getLinks().size());
    }
}
