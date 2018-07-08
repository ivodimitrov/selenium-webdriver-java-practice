package tests.toolsqaautomationpracticeform;

import org.junit.Test;
import pages.ToolsQaAutomationPracticeFormPage;

import static org.junit.Assert.assertEquals;

public class JavascriptExecutorTest extends ToolsQaPracticeFormBaseTest {

    @Test
    public void testJavaScriptCalls() {

        ToolsQaAutomationPracticeFormPage toolsQaAutomationPracticeFormPage =
                super.initLoad();

        assertEquals("Demo Form for practicing Selenium Automation",
                toolsQaAutomationPracticeFormPage.getPageTitle());

        assertEquals(219, toolsQaAutomationPracticeFormPage.getJsLinks());

    }
}
