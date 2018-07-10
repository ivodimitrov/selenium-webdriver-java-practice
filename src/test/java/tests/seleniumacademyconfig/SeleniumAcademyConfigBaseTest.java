package tests.seleniumacademyconfig;

import pages.SeleniumAcademyConfigPage;
import utils.BaseTest;

import static utils.Links.SELENIUMACADEMY_CONFIG_PAGE;

class SeleniumAcademyConfigBaseTest extends BaseTest {

    SeleniumAcademyConfigPage initLoad() {

        goToPageAndWaitPageToLoad(SELENIUMACADEMY_CONFIG_PAGE);

        return new SeleniumAcademyConfigPage(getWebDriver());
    }
}
