package tests;

import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.support.ui.Select;
import utils.BaseTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static utils.Links.GMAIL_PAGE;

public class CookiesTest extends BaseTest {

    @Ignore("Because it is not finished yet")
    @Test
    public void testCookies() {
        // Go to page
        goToPageAndWaitPageToLoad(GMAIL_PAGE);
        // Get the Your language dropdown as instance of Select class
        Select language = new Select(getWebDriver().findElement(By.
                cssSelector(".language")));
        // Check default selected option is English
        assertEquals("English (United States)",
                language.getFirstSelectedOption().getText().trim());
        // Store cookies should be none
        Cookie mailCookie = getWebDriver().manage().getCookieNamed("gmail");

        assertNull(mailCookie);
        // Select an option using select_by_visible text
        language.selectByVisibleText("Deutsch");
        // Store cookie should be populated with selected country
        // mailCookie = getWebDriver().manage().getCookieNamed("gmail");
    }
}
