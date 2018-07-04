package tests.toolsqaautomationpracticeform;

import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import utils.BaseTest;

import static org.junit.Assert.assertEquals;
import static utils.Links.TOOLSQA_AUTOMATION_PRACTICE_FORM;

public class JavascriptExecutorTest extends BaseTest {

    @Test
    public void testJavaScriptCalls() {
        // Go to page
        goToPageAndWaitPageToLoad(TOOLSQA_AUTOMATION_PRACTICE_FORM);

        JavascriptExecutor js = (JavascriptExecutor) getWebDriver();

        String title = (String) js.executeScript("return document.title");

        assertEquals("Demo Form for practicing Selenium Automation", title);
        long links = (Long) js
                .executeScript("var links = document.getElementsByTagName('A'); return links.length");
        assertEquals(219, links);

    }
}
