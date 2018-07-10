package seleniumtestingtoolscookbook.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GooglePage extends Page {
    @FindBy(name = "q")
    private WebElement searchInput;

    public GooglePage(WebDriver webDriver) {
        super(webDriver);
    }

    public void searchFor(String keyword) {
        searchInput.clear();
        searchInput.sendKeys(keyword);
        searchInput.submit();
    }
}
