package tests;

import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import utils.BaseTest;

import static org.testng.AssertJUnit.assertEquals;

public class JavascriptExecutorTest extends BaseTest {

    @Test
    public void testJavaScriptCalls() {

        JavascriptExecutor js = (JavascriptExecutor) getWebDriver();

        String title = (String) js.executeScript("return document.title");

        assertEquals("Demo Form for practicing Selenium Automation", title);
        long links = (Long) js
                .executeScript("var links = document.getElementsByTagName('A'); return links.length");
        assertEquals(219, links);

    }
}
