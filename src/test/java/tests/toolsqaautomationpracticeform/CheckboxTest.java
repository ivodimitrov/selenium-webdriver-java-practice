package tests.toolsqaautomationpracticeform;

import org.junit.Test;
import pages.ToolsQaAutomationPracticeFormPage;
import utils.BaseTest;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;
import static utils.Links.TOOLSQA_AUTOMATION_PRACTICE_FORM;

public class CheckboxTest extends BaseTest {

    @Test
    public void testCheckBox() {

        goToPageAndWaitPageToLoad(TOOLSQA_AUTOMATION_PRACTICE_FORM);

        ToolsQaAutomationPracticeFormPage toolsQaAutomationPracticeFormPage =
                new ToolsQaAutomationPracticeFormPage(getWebDriver());

        toolsQaAutomationPracticeFormPage.selectCheckBox();

        //Verify Checkbox is Selected
        assertTrue(toolsQaAutomationPracticeFormPage
                .getProfessionManualTesterCheckBox().isSelected());

        toolsQaAutomationPracticeFormPage.deselectCheckBox();

        //Verify Checkbox is Deselected
        assertFalse(toolsQaAutomationPracticeFormPage
                .getProfessionManualTesterCheckBox().isSelected());
    }
}
