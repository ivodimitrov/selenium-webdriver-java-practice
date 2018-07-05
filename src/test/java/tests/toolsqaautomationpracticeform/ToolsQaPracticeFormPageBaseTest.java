package tests.toolsqaautomationpracticeform;

import pages.ToolsQaAutomationPracticeFormPage;
import utils.BaseTest;

import static utils.Links.TOOLSQA_AUTOMATION_PRACTICE_FORM_PAGE;

class ToolsQaPracticeFormPageBaseTest extends BaseTest {

    ToolsQaAutomationPracticeFormPage initLoad() {

        goToPageAndWaitPageToLoad(TOOLSQA_AUTOMATION_PRACTICE_FORM_PAGE);

        return new ToolsQaAutomationPracticeFormPage(getWebDriver());
    }
}
