package tests.toolsqaautomationpracticeform;

import org.junit.Test;
import pages.ToolsQaAutomationPracticeFormPage;

import static junit.framework.TestCase.fail;

public class ElementStateTest extends ToolsQaPracticeFormBaseTest {

    @Test
    public void testElementIsEnabled() {

        ToolsQaAutomationPracticeFormPage toolsQaAutomationPracticeFormPage =
                super.initLoad();

        // Check if its enabled before selecting it
        if (toolsQaAutomationPracticeFormPage
                .getProfessionManualTesterCheckBox().isEnabled()) {
            // Check if its already selected? Otherwise select the Checkbox
            toolsQaAutomationPracticeFormPage.selectCheckBox();
        } else {
            fail("Profession Manual tester Checkbox is disabled!");
        }
    }
}
