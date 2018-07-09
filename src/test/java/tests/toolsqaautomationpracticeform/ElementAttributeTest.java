package tests.toolsqaautomationpracticeform;

import org.junit.Test;
import pages.ToolsQaAutomationPracticeFormPage;

import static org.junit.Assert.assertEquals;

public class ElementAttributeTest extends ToolsQaPracticeFormBaseTest {

    @Test
    public void testElementAttributeValue() {

        ToolsQaAutomationPracticeFormPage toolsQaAutomationPracticeFormPage =
                super.initLoad();

        // Verify an element's attribute value
        assertEquals("Verify an element's attribute value",
                "Automation Practice Form", toolsQaAutomationPracticeFormPage
                        .getPartialLink().getAttribute("title"));
    }

    @Test
    public void testElementStyle() {

        ToolsQaAutomationPracticeFormPage toolsQaAutomationPracticeFormPage =
                super.initLoad();

        // CSS value
        String marginBottom =
                toolsQaAutomationPracticeFormPage.getPartialLink().getCssValue("margin-bottom");

        // Verify an element's CSS value
        assertEquals("Verify an element's CSS value",
                "0px", marginBottom);
    }
}
