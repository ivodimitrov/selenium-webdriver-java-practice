package seleniumtestingtoolscookbook.pages.storedemoqa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {

    private WebDriver driver;
    @FindBy(css = ".search")
    private WebElement searchField;

    SearchPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public SearchResultsPage searchInStore(String query) {
        searchField.sendKeys(query);
        searchField.submit();
        return new SearchResultsPage(driver, query);
    }
}
