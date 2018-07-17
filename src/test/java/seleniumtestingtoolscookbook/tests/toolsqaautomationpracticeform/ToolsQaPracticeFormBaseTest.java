package seleniumtestingtoolscookbook.tests.toolsqaautomationpracticeform;

import seleniumtestingtoolscookbook.pages.toolsqa.ToolsQaAutomationPracticePage;
import seleniumtestingtoolscookbook.utils.BaseTest;

import static seleniumtestingtoolscookbook.utils.Links.TOOLSQA_AUTOMATION_PRACTICE_FORM_PAGE;

class ToolsQaPracticeFormBaseTest extends BaseTest {

    ToolsQaAutomationPracticePage initLoad() {

        goToPageAndWaitPageToLoad(TOOLSQA_AUTOMATION_PRACTICE_FORM_PAGE);

        return new ToolsQaAutomationPracticePage(getWebDriver());
    }
}
