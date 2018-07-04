package tests.toolsqaautomationpracticeform;

import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import utils.BaseTest;

import static org.junit.Assert.assertEquals;
import static utils.Links.TOOLSQA_AUTOMATION_PRACTICE_FORM_PAGE;

public class JavascriptExecutorTest extends BaseTest {

    @Test
    public void testJavaScriptCalls() {

        goToPageAndWaitPageToLoad(TOOLSQA_AUTOMATION_PRACTICE_FORM_PAGE);

        JavascriptExecutor js = (JavascriptExecutor) getWebDriver();

        String title = (String) js.executeScript("return document.title");

        assertEquals("Demo Form for practicing Selenium Automation", title);
        long links = (Long) js
                .executeScript("var links = document.getElementsByTagName('A'); return links.length");
        assertEquals(219, links);

    }
}
