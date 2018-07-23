package seleniumtestingtoolscookbook.tests.google;

import org.junit.Test;
import seleniumtestingtoolscookbook.pages.google.GooglePage;
import seleniumtestingtoolscookbook.utils.BaseTest;

import static org.junit.Assert.assertEquals;
import static seleniumtestingtoolscookbook.utils.Links.GOOGLE_PAGE;

public class GoogleSearchChromeTest extends BaseTest {

    @Test
    public void testGoogleSearch() {
        goToPageAndWaitPageToLoad(GOOGLE_PAGE);

        GooglePage googlePage = new GooglePage(getWebDriver());

        String keywordToSearch = "Selenium";

        googlePage.searchFor(keywordToSearch);

        googlePage.waitTitleToMatchWithKeyword(keywordToSearch);

        assertEquals("Selenium - Google Search",
                getWebDriver().getTitle());
    }
}