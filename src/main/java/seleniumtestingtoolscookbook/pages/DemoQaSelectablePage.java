package seleniumtestingtoolscookbook.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class DemoQaSelectablePage extends Page {
    public DemoQaSelectablePage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(css = "#selectable")
    private WebElement selectableElement;
    @FindBy(css = "#selectable li.ui-widget-content")
    private List<WebElement> tableRows;
    @FindBy(css = ".ui-selected")
    private List<WebElement> rows;

    public void waitToSelectElement() {
        // Wait for the link to load, timeout after 10 seconds
        new WebDriverWait(getWebDriver(), 10)
                .until((ExpectedCondition<WebElement>) d -> selectableElement);
    }

    public List<WebElement> getTableRows() {
        return tableRows;
    }

    public List<WebElement> getRows() {
        return rows;
    }
}
