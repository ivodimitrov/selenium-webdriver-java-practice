package seleniumtestingtoolscookbook.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Page {

    private static WebDriver webDriver;

    Page(WebDriver webDriver) {
        Page.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    protected static WebDriver getWebDriver() {
        return webDriver;
    }
}
