package tests.toolsqaalerts;

import pages.ToolsQaAlertsPage;
import utils.BaseTest;

import static utils.Links.TOOLSQA_ALERTS_PAGE;

class ToolsQaAlertsBaseTest extends BaseTest {

    ToolsQaAlertsPage initLoad() {

        goToPageAndWaitPageToLoad(TOOLSQA_ALERTS_PAGE);

        return new ToolsQaAlertsPage(getWebDriver());
    }
}
