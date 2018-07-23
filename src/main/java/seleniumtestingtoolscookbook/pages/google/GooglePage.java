package seleniumtestingtoolscookbook.pages.google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import seleniumtestingtoolscookbook.pages.Page;

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

    public Boolean waitTitleToMatchWithKeyword(String keywordToSearch) {
        return new WebDriverWait(getWebDriver(), 10)
                .until((ExpectedCondition<Boolean>) d -> d.getTitle()
                        .startsWith(keywordToSearch));
    }
}
