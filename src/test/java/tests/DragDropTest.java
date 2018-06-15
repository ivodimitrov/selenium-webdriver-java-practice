package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.BaseTest;

import static org.junit.Assert.assertEquals;
import static utils.Links.DRAG_DROP_PAGE;

public class DragDropTest extends BaseTest {

    @Test
    public void testDragDrop() {
        //Go to page
        goToPageAndWaitPageToLoad(DRAG_DROP_PAGE);

        WebElement source = getWebDriver().findElement(By.id("draggableview"));
        WebElement target = getWebDriver().findElement(By.id("droppableview"));

        Actions builder = new Actions(getWebDriver());
        builder.dragAndDrop(source, target).perform();
        assertEquals("Dropped!", target.getText());
    }
}
