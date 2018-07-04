package tests.google;

import org.junit.Test;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.GooglePage;
import utils.BaseTest;

import static org.junit.Assert.assertEquals;
import static utils.Links.GOOGLE_PAGE;

public class GoogleSearchChromeTest extends BaseTest {

    @Test
    public void testGoogleSearch() {
        GooglePage googlePage = new GooglePage(getWebDriver());

        goToPageAndWaitPageToLoad(GOOGLE_PAGE);

        googlePage.searchFor("Selenium");

        // Google's search is rendered dynamically with JavaScript.
        // Wait for the page to load, timeout after 10 seconds
        new WebDriverWait(getWebDriver(), 10)
                .until((ExpectedCondition<Boolean>) d -> d.getTitle().toLowerCase()
                        .startsWith("selenium"));

        assertEquals("Selenium - Google Search",
                getWebDriver().getTitle());
    }
}