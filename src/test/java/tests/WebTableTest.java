package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseTest;

import java.util.List;

import static org.testng.AssertJUnit.assertEquals;
import static utils.Links.TABLE_PAGE;

public class WebTableTest extends BaseTest {

    @Test
    public void testWebTable() {
        // Go to page
        goToPageAndWaitPageToLoad(TABLE_PAGE);

        WebElement simpleTable = getWebDriver().findElement(By.id("content"));

        // Get all rows
        List<WebElement> rows =
                simpleTable.findElements(By.tagName("tr"));
        // Verify number of rows in table
        assertEquals(6, rows.size());

        // Print data from each row
        for (WebElement row : rows) {
            List<WebElement> cols = row.findElements(By.tagName("td"));
            for (WebElement col : cols) {
                System.out.print(col.getText() + "\t");
            }
            System.out.println();
        }
    }
}
