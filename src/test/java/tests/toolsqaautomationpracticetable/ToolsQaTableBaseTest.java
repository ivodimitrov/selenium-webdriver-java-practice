package tests.toolsqaautomationpracticetable;

import pages.ToolsQaTablePage;
import utils.BaseTest;

import static utils.Links.TOOLSQA_AUTOMATION_PRACTICE_TABLE_PAGE;

class ToolsQaTableBaseTest extends BaseTest {

    ToolsQaTablePage initLoad() {

        goToPageAndWaitPageToLoad(TOOLSQA_AUTOMATION_PRACTICE_TABLE_PAGE);

        return new ToolsQaTablePage(getWebDriver());
    }
}
