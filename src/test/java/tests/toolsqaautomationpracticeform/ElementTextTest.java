package tests.toolsqaautomationpracticeform;

import org.junit.Test;
import pages.ToolsQaAutomationPracticeFormPage;

import static org.junit.Assert.assertEquals;

public class ElementTextTest extends ToolsQaPracticeFormPageBaseTest {

    @Test
    public void testFirstNameElementText() {

        ToolsQaAutomationPracticeFormPage toolsQaAutomationPracticeFormPage =
                super.initLoad();

        toolsQaAutomationPracticeFormPage.printFirstNameElementText();

        // Verify message element's text
        assertEquals("Verify message element's text",
                "First name:", toolsQaAutomationPracticeFormPage
                        .getFirstNameElementText());
    }
}
