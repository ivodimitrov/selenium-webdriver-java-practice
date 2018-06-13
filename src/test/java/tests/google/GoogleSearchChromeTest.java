package tests.google;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.BaseTest;

import javax.annotation.Nonnull;

import static org.junit.Assert.assertEquals;
import static utils.Links.GOOGLE_PAGE;

public class GoogleSearchChromeTest extends BaseTest {

    @Test
    public void testGoogleSearch() {
        // Go to page
        goToPageAndWaitPageToLoad(GOOGLE_PAGE);

        // Find the text input element by its name
        WebElement element = getWebDriver().findElement(By.name("q"));
        // Clear the existing text value
        element.clear();
        // Enter something to search for
        element.sendKeys("Selenium");
        // Now submit the form
        element.submit();
        // Google's search is rendered dynamically with JavaScript.
        // Wait for the page to load, timeout after 10 seconds
        new WebDriverWait(getWebDriver(), 10).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(@Nonnull WebDriver d) {
                return d.getTitle().toLowerCase()
                        .startsWith("selenium");
            }
        });

        assertEquals("Selenium - Google Search",
                getWebDriver().getTitle());
    }
}