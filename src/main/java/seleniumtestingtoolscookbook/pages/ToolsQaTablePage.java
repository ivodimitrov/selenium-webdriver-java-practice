package seleniumtestingtoolscookbook.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ToolsQaTablePage extends Page {
    @FindBy(id = "content")
    private WebElement simpleTable;

    public ToolsQaTablePage(WebDriver webDriver) {
        super(webDriver);
    }

    // Get all rows
    public List<WebElement> getAllRows() {
        return simpleTable.findElements(By.tagName("tr"));
    }

    // Print data from each row
    public void printAllRows() {
        for (WebElement row : getAllRows()) {
            List<WebElement> cols = row.findElements(By.tagName("td"));
            for (WebElement col : cols) {
                System.out.print(col.getText() + "\t");
            }
            System.out.println();
        }
    }
}
