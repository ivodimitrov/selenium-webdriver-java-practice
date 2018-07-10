package seleniumtestingtoolscookbook.tests.demoqadraganddrop;

import org.junit.Test;
import org.openqa.selenium.interactions.Actions;
import seleniumtestingtoolscookbook.pages.DemoQaDragAndDropPage;

import static org.junit.Assert.assertEquals;

public class DragDropTest extends DemoQaDragAndDropBaseTest {

    @Test
    public void testDragDrop() {

        DemoQaDragAndDropPage demoQaDragAndDropPage =
                super.initLoad();

        Actions builder = new Actions(getWebDriver());
        builder.dragAndDrop(demoQaDragAndDropPage.getSource(),
                demoQaDragAndDropPage.getTarget()).perform();
        assertEquals("Dropped!",
                demoQaDragAndDropPage.getTarget().getText());
    }
}
