package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.BaseTest;
import utils.Links;

import javax.annotation.Nonnull;
import java.util.List;

import static org.testng.AssertJUnit.assertEquals;

public class WebTableTest extends BaseTest {

    @Test
    public void testWebTable() {
        // Go to page
        getWebDriver().get(Links.TABLE_PAGE);

        // Wait for the page to load, timeout after 10 seconds
        new WebDriverWait(getWebDriver(), 10).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(@Nonnull WebDriver d) {
                return d.getTitle().toLowerCase()
                        .startsWith("demo table");
            }
        });

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
