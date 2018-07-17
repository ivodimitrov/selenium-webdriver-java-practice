package seleniumtestingtoolscookbook.tests.seleniumacademyhtml5storage;

import seleniumtestingtoolscookbook.pages.SeleniumAcademyHtml5StoragePage;
import seleniumtestingtoolscookbook.utils.BaseTest;

import static seleniumtestingtoolscookbook.utils.Links.SELENIUMACADEMY_HTML5STORAGE_PAGE;

class SeleniumAcademyHtml5StorageBaseTest extends BaseTest {

    SeleniumAcademyHtml5StoragePage initLoad() {

        goToPageAndWaitPageToLoad(SELENIUMACADEMY_HTML5STORAGE_PAGE);

        return new SeleniumAcademyHtml5StoragePage(getWebDriver());
    }
}
