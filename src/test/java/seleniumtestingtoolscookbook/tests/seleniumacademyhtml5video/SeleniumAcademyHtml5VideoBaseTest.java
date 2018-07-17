package seleniumtestingtoolscookbook.tests.seleniumacademyhtml5video;

import seleniumtestingtoolscookbook.pages.SeleniumAcademyHtml5VideoPage;
import seleniumtestingtoolscookbook.utils.BaseTest;

import static seleniumtestingtoolscookbook.utils.Links.SELENIUMACADEMY_HTML5VIDEO_PAGE;

class SeleniumAcademyHtml5VideoBaseTest extends BaseTest {

    SeleniumAcademyHtml5VideoPage initLoad() {

        goToPageAndWaitPageToLoad(SELENIUMACADEMY_HTML5VIDEO_PAGE);

        return new SeleniumAcademyHtml5VideoPage(getWebDriver());
    }
}
