package seleniumtestingtoolscookbook.tests.toolsqaalerts;

import seleniumtestingtoolscookbook.pages.toolsqa.ToolsQaAlertsPage;
import seleniumtestingtoolscookbook.utils.BaseTest;

import static seleniumtestingtoolscookbook.utils.Links.TOOLSQA_ALERTS_PAGE;

class ToolsQaAlertsBaseTest extends BaseTest {

    ToolsQaAlertsPage initLoad() {

        goToPageAndWaitPageToLoad(TOOLSQA_ALERTS_PAGE);

        return new ToolsQaAlertsPage(getWebDriver());
    }
}
