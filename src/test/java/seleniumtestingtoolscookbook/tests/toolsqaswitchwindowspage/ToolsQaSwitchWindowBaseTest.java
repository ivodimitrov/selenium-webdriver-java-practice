package seleniumtestingtoolscookbook.tests.toolsqaswitchwindowspage;

import seleniumtestingtoolscookbook.pages.toolsqa.ToolsQaSwitchWindowsPage;
import seleniumtestingtoolscookbook.utils.BaseTest;

import static seleniumtestingtoolscookbook.utils.Links.TOOLSQA_SWITCH_WINDOWS_PAGE;

class ToolsQaSwitchWindowBaseTest extends BaseTest {

    ToolsQaSwitchWindowsPage initLoad() {

        goToPageAndWaitPageToLoad(TOOLSQA_SWITCH_WINDOWS_PAGE);

        return new ToolsQaSwitchWindowsPage(getWebDriver());
    }
}
