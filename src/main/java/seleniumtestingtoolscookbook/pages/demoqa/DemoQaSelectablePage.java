package seleniumtestingtoolscookbook.pages.demoqa;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import seleniumtestingtoolscookbook.pages.Page;

import java.util.List;

public class DemoQaSelectablePage extends Page {
    @FindBy(css = "#selectable")
    private WebElement selectableElement;
    @FindBy(css = "#selectable li.ui-widget-content")
    private List<WebElement> tableRows;
    @FindBy(css = ".ui-selected")
    private List<WebElement> rows;

    public DemoQaSelectablePage(WebDriver webDriver) {
        super(webDriver);
    }

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

    public void selectTableRowsUsingControlKey() {
        // Select second and fourth row from table using Control Key.
        // Row Index start at 0
        Actions builder = new Actions(getWebDriver());
        builder.click(getTableRows().get(1))
                .keyDown(Keys.CONTROL)
                .click(getTableRows().get(3))
                .keyUp(Keys.CONTROL)
                .build().perform();
    }
}
