package seleniumtestingtoolscookbook.tests.toolsqaautomationpracticeform;

import org.junit.Test;
import seleniumtestingtoolscookbook.pages.toolsqa.ToolsQaAutomationPracticePage;

import static org.junit.Assert.assertEquals;

public class ElementAttributeTest extends ToolsQaPracticeFormBaseTest {

    @Test
    public void testElementAttributeValue() {

        ToolsQaAutomationPracticePage toolsQaAutomationPracticePage =
                super.initLoad();

        // Verify an element's attribute value
        assertEquals("Verify an element's attribute value",
                "Automation Practice Form", toolsQaAutomationPracticePage
                        .getPartialLink().getAttribute("title"));
    }

    @Test
    public void testElementStyle() {

        ToolsQaAutomationPracticePage toolsQaAutomationPracticePage =
                super.initLoad();

        // CSS value
        String marginBottom =
                toolsQaAutomationPracticePage.getPartialLink().getCssValue("margin-bottom");

        // Verify an element's CSS value
        assertEquals("Verify an element's CSS value",
                "0px", marginBottom);
    }
}
