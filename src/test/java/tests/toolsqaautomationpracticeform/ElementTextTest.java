package tests.toolsqaautomationpracticeform;

import org.junit.Test;
import pages.ToolsQaAutomationPracticePage;

import static org.junit.Assert.assertEquals;

public class ElementTextTest extends ToolsQaPracticeFormBaseTest {

    @Test
    public void testFirstNameElementText() {

        ToolsQaAutomationPracticePage toolsQaAutomationPracticePage =
                super.initLoad();

        toolsQaAutomationPracticePage.printFirstNameElementText();

        // Verify message element's text
        assertEquals("Verify message element's text",
                "First name:", toolsQaAutomationPracticePage
                        .getFirstNameElementText());
    }
}
