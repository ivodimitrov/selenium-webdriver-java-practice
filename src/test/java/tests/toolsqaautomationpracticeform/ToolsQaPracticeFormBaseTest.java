package tests.toolsqaautomationpracticeform;

import pages.ToolsQaAutomationPracticePage;
import utils.BaseTest;

import static utils.Links.TOOLSQA_AUTOMATION_PRACTICE_FORM_PAGE;

class ToolsQaPracticeFormBaseTest extends BaseTest {

    ToolsQaAutomationPracticePage initLoad() {

        goToPageAndWaitPageToLoad(TOOLSQA_AUTOMATION_PRACTICE_FORM_PAGE);

        return new ToolsQaAutomationPracticePage(getWebDriver());
    }
}
