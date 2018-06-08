package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import tests.basetests.GmailBaseTest;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FindElementTest extends GmailBaseTest {

    @Test
    public void testFindElements() {
        //Get all the links displayed on the Page
        List<WebElement> links = driver.findElements(By.tagName("a"));

        int linksCounter = 0;

        //Iterate though the list of links and print
        //target for each link
        for (WebElement link : links) {
            System.out.println("Link displayed on the page is number: " + (linksCounter + 1));

            System.out.println(link.getAttribute("href"));

            linksCounter++;
        }
        //Verify there are many links displayed on the page
        System.out.println();
        System.out.println("Numbers of links displayed on the page are: " + links.size());

        assertEquals("Verify numbers of links displayed on the page",
                linksCounter, links.size());
    }
}
