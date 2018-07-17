package seleniumtestingtoolscookbook.tests.seleniumacademyhtml5canvas;

import seleniumtestingtoolscookbook.pages.seleniumacademy.SeleniumAcademyHtml5CanvasPage;
import seleniumtestingtoolscookbook.utils.BaseTest;

import static seleniumtestingtoolscookbook.utils.Links.SELENIUMACADEMY_HTML5CANVAS_PAGE;

class SeleniumAcademyHtml5CanvasBaseTest extends BaseTest {

    SeleniumAcademyHtml5CanvasPage initLoad() {

        goToPageAndWaitPageToLoad(SELENIUMACADEMY_HTML5CANVAS_PAGE);

        return new SeleniumAcademyHtml5CanvasPage(getWebDriver());
    }
}
