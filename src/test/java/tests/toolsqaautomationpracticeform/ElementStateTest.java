package tests.toolsqaautomationpracticeform;

import org.junit.Test;
import pages.ToolsQaAutomationPracticePage;

import static junit.framework.TestCase.fail;

public class ElementStateTest extends ToolsQaPracticeFormBaseTest {

    @Test
    public void testElementIsEnabled() {

        ToolsQaAutomationPracticePage toolsQaAutomationPracticePage =
                super.initLoad();

        // Check if its enabled before selecting it
        if (toolsQaAutomationPracticePage
                .getProfessionManualTesterCheckBox().isEnabled()) {
            // Check if its already selected? Otherwise select the Checkbox
            toolsQaAutomationPracticePage.selectCheckBox();
        } else {
            fail("Profession Manual tester Checkbox is disabled!");
        }
    }
}
