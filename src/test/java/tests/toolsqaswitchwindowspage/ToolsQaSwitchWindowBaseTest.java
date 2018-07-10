package tests.toolsqaswitchwindowspage;

import pages.ToolsQaSwitchWindowsPage;
import utils.BaseTest;

import static utils.Links.TOOLSQA_SWITCH_WINDOWS_PAGE;

class ToolsQaSwitchWindowBaseTest extends BaseTest {

    ToolsQaSwitchWindowsPage initLoad() {

        goToPageAndWaitPageToLoad(TOOLSQA_SWITCH_WINDOWS_PAGE);

        return new ToolsQaSwitchWindowsPage(getWebDriver());
    }
}
