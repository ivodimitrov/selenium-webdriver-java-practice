package seleniumtestingtoolscookbook.tests.seleniumacademyhtml5canvas;

import org.junit.Test;
import seleniumtestingtoolscookbook.pages.SeleniumAcademyHtml5CanvasPage;
import seleniumtestingtoolscookbook.utils.CompareUtil;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class Html5CanvasDrawingTest extends SeleniumAcademyHtml5CanvasBaseTest {

    @Test
    public void testHTML5CanvasDrawing() throws IOException {

        SeleniumAcademyHtml5CanvasPage seleniumAcademyHtml5CanvasPage = super.initLoad();

        seleniumAcademyHtml5CanvasPage.selectPencilTool();
        seleniumAcademyHtml5CanvasPage.drawShapeOnCanvas();

        seleniumAcademyHtml5CanvasPage.takeScreenshot();

        assertEquals("Canvas element does not match!", CompareUtil.Result.Matched,
                CompareUtil.CompareImage(seleniumAcademyHtml5CanvasPage.getBaseScrFile(),
                        seleniumAcademyHtml5CanvasPage.getScrFile()));
    }
}
