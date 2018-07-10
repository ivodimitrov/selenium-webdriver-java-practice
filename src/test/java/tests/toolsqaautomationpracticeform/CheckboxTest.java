package tests.toolsqaautomationpracticeform;

import org.junit.Test;
import pages.ToolsQaAutomationPracticePage;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class CheckboxTest extends ToolsQaPracticeFormBaseTest {

    @Test
    public void testCheckBox() {

        ToolsQaAutomationPracticePage toolsQaAutomationPracticePage =
                super.initLoad();

        toolsQaAutomationPracticePage.selectCheckBox();
        //Verify Checkbox is Selected
        assertTrue(toolsQaAutomationPracticePage
                .getProfessionManualTesterCheckBox().isSelected());

        toolsQaAutomationPracticePage.deselectCheckBox();
        //Verify Checkbox is Deselected
        assertFalse(toolsQaAutomationPracticePage
                .getProfessionManualTesterCheckBox().isSelected());
    }
}
