package seleniumtestingtoolscookbook.tests.seleniumacademyconfig;

import seleniumtestingtoolscookbook.pages.SeleniumAcademyConfigPage;
import seleniumtestingtoolscookbook.utils.BaseTest;

import static seleniumtestingtoolscookbook.utils.Links.SELENIUMACADEMY_CONFIG_PAGE;

class SeleniumAcademyConfigBaseTest extends BaseTest {

    SeleniumAcademyConfigPage initLoad() {

        goToPageAndWaitPageToLoad(SELENIUMACADEMY_CONFIG_PAGE);

        return new SeleniumAcademyConfigPage(getWebDriver());
    }
}
