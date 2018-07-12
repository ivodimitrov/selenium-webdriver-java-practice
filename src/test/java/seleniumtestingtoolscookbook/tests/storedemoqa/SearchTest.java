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
            // Create an instance of Home page
            HomePage homePage = new HomePage(Browser.driver);

            homePage.get();

            // Search for 'iPad', the searchInStore method will return SearchResultsPage
            SearchResultsPage searchResult = homePage.Search().searchInStore("iPad");

            // Verify there are 2 products available with this search
            assertEquals("Products are not available nor match!",
                    1, searchResult.getProducts().size());

            for (String resultText : searchResult.getProducts()) {
                assertTrue(resultText.contains("iPad"));
            }
        } finally {
            Browser.close();
        }
    }
}

