package tests.toolsqaautomationpracticeform;

import pages.ToolsQaAutomationPracticeFormPage;

import static utils.Links.TOOLSQA_AUTOMATION_PRACTICE_FORM_PAGE;

class ToolsQaPracticeFormPageBaseTest extends utils.BaseTest {

    ToolsQaAutomationPracticeFormPage initLoad() {

        goToPageAndWaitPageToLoad(TOOLSQA_AUTOMATION_PRACTICE_FORM_PAGE);

        return new ToolsQaAutomationPracticeFormPage(getWebDriver());
    }
}
