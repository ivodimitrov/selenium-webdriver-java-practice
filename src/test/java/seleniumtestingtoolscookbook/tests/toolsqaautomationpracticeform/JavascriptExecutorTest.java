package seleniumtestingtoolscookbook.tests.toolsqaautomationpracticeform;

import org.junit.Test;
import seleniumtestingtoolscookbook.pages.toolsqa.ToolsQaAutomationPracticePage;

import static org.junit.Assert.assertEquals;

public class JavascriptExecutorTest extends ToolsQaPracticeFormBaseTest {

    @Test
    public void testJavaScriptCalls() {

        ToolsQaAutomationPracticePage toolsQaAutomationPracticePage =
                super.initLoad();

        assertEquals("Demo Form for practicing Selenium Automation",
                toolsQaAutomationPracticePage.getPageTitle());

        assertEquals(219, toolsQaAutomationPracticePage.getJsLinks());

    }
}
