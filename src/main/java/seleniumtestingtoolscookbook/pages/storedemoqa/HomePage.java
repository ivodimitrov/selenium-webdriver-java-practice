package seleniumtestingtoolscookbook.pages.storedemoqa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

import static org.junit.Assert.assertEquals;

public class HomePage extends LoadableComponent<HomePage> {

    private static String url = "http://store.demoqa.com/";
    private static String title = "ONLINE STORE | Toolsqa Dummy Test site";
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @Override
    protected void load() {
        Browser.setUp();
        Browser.open(url);
    }

    @Override
    protected void isLoaded() throws Error {
        assertEquals(title, driver.getTitle());
    }

    public SearchPage Search() {
        return new SearchPage(driver);
    }
}
