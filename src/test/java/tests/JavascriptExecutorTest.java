package tests;

import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import utils.BaseTest;

import static org.junit.Assert.assertEquals;
import static utils.Links.HOME_PAGE;

public class JavascriptExecutorTest extends BaseTest {

    @Test
    public void testJavaScriptCalls() {
        // Go to page
        goToPageAndWaitPageToLoad(HOME_PAGE);

        JavascriptExecutor js = (JavascriptExecutor) getWebDriver();

        String title = (String) js.executeScript("return document.title");

        assertEquals("Demo Form for practicing Selenium Automation", title);
        long links = (Long) js
                .executeScript("var links = document.getElementsByTagName('A'); return links.length");
        assertEquals(219, links);

    }
}
