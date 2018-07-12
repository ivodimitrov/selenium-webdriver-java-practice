package seleniumtestingtoolscookbook.pages.storedemoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SearchResultsPage extends LoadableComponent<SearchResultsPage> {

    private WebDriver driver;
    private String query;

    SearchResultsPage(WebDriver driver, String query) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @Override
    protected void load() {

    }

    @Override
    protected void isLoaded() throws Error {
        assertEquals("Search results for: '" + this.query +
                "'", driver.getTitle());
    }

    public List<String> getProducts() {

        List<String> products = new ArrayList<>();

        List<WebElement> productList = driver.findElements(
                By.cssSelector(".product_grid_display"));

        for (WebElement item : productList) {
            products.add(item.findElement(By
                    .cssSelector("div.product_grid_item"))
                    .getText());
        }

        for (WebElement item : productList) {
            System.out.println(item);
            System.out.println(products);
        }

        return products;
    }
}
