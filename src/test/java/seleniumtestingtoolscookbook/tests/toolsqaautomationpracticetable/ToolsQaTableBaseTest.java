package seleniumtestingtoolscookbook.tests.toolsqaautomationpracticetable;

import seleniumtestingtoolscookbook.pages.toolsqa.ToolsQaTablePage;
import seleniumtestingtoolscookbook.utils.BaseTest;

import static seleniumtestingtoolscookbook.utils.Links.TOOLSQA_AUTOMATION_PRACTICE_TABLE_PAGE;

class ToolsQaTableBaseTest extends BaseTest {

    ToolsQaTablePage initLoad() {

        goToPageAndWaitPageToLoad(TOOLSQA_AUTOMATION_PRACTICE_TABLE_PAGE);

        return new ToolsQaTablePage(getWebDriver());
    }
}
