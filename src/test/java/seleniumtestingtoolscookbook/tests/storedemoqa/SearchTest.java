package seleniumtestingtoolscookbook.tests.storedemoqa;

import org.junit.Test;
import seleniumtestingtoolscookbook.pages.storedemoqa.Browser;
import seleniumtestingtoolscookbook.pages.storedemoqa.HomePage;
import seleniumtestingtoolscookbook.pages.storedemoqa.SearchResultsPage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SearchTest {

    @Test
    public void testProductSearch() {
        try {
            HomePage homePage = new HomePage(Browser.driver);

            homePage.get();

            // Search for 'iPad', the searchInStore method will return SearchResultsPage
            SearchResultsPage searchResult = homePage.Search().searchInStore("iPad");

            // Verify there are products available with this search
            assertEquals("Products quantity does not match!",
                    1, searchResult.getProducts().size());

            for (String resultText : searchResult.getProducts()) {
                assertTrue("Products does not match!",
                        resultText.contains("iPad"));
            }
        } finally {
            Browser.close();
        }
    }
}

