package tests.toolsqaautomationpracticeform;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseTest;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static utils.Links.TOOLSQA_AUTOMATION_PRACTICE_FORM;

public class FindElementsTest extends BaseTest {

    @Test
    public void testFindElements() {

        goToPageAndWaitPageToLoad(TOOLSQA_AUTOMATION_PRACTICE_FORM);

        //Get all the links displayed on the Page
        List<WebElement> links = getWebDriver().findElements(By.tagName("a"));

        int linksCounter = 0;

        // Iterate though the list of links and print
        // target for each link
        for (WebElement link : links) {
            System.out.println("Link displayed on the page is number: " + (linksCounter + 1));

            System.out.println(link.getAttribute("href"));

            linksCounter++;
        }
        // Verify there are many links displayed on the page
        System.out.println();
        System.out.println("Numbers of links displayed on the page are: " + links.size());

        assertEquals("Verify numbers of links displayed on the page",
                219, links.size());
    }
}
