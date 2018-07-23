package seleniumtestingtoolscookbook.tests.demoqadraganddrop;

import org.junit.Test;
import seleniumtestingtoolscookbook.pages.demoqa.DemoQaDragAndDropPage;

import static org.junit.Assert.assertEquals;

public class DragDropTest extends DemoQaDragAndDropBaseTest {

    @Test
    public void testDragDrop() {

        DemoQaDragAndDropPage demoQaDragAndDropPage =
                super.initLoad();

        demoQaDragAndDropPage.dragAndDrop();
        assertEquals("Dropped!",
                demoQaDragAndDropPage.getTarget().getText());
    }
}
