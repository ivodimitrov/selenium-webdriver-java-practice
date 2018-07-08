package tests.toolsqaautomationpracticeform;

import org.junit.Test;
import pages.ToolsQaAutomationPracticeFormPage;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class CheckboxTest extends ToolsQaPracticeFormBaseTest {

    @Test
    public void testCheckBox() {

        ToolsQaAutomationPracticeFormPage toolsQaAutomationPracticeFormPage =
                super.initLoad();

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
