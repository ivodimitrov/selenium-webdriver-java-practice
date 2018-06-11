package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.GmailBaseTest;

import static org.junit.Assert.assertEquals;

public class ElementTextTest extends GmailBaseTest {

    @Test
    public void testCreateAnAccountElementText() {
        // Get the Create An Account Element
        WebElement createAnAccountLink = driver.findElement(By.
                cssSelector(".hero_home__link__desktop"));
        // Get the message element's text
        String createAnAccountLinkText = createAnAccountLink.getText();
        // Verify message element's text
        assertEquals("Verify message element's text",
                "CREATE AN ACCOUNT", createAnAccountLinkText);
    }

    @Test
    public void testSignInElementText() {
        // Get the Sign In Element
        WebElement signInLink = driver.findElement(By.
                cssSelector("a.gmail-nav__nav-link:nth-child(2)"));
        // Get the message element's text
        String signInLinkText = signInLink.getText();
        // Verify message element's text
        assertEquals("Verify message element's text",
                "SIGN IN", signInLinkText);
    }
}
