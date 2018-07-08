package tests.toolsqaautomationpracticeform;

import org.junit.Test;
import pages.ToolsQaAutomationPracticeFormPage;

import static org.junit.Assert.assertTrue;

public class ElementPresenceTest extends ToolsQaPracticeFormBaseTest {

    @Test
    public void testIsElementPresent() {

        ToolsQaAutomationPracticeFormPage toolsQaAutomationPracticeFormPage =
                super.initLoad();

        toolsQaAutomationPracticeFormPage.doesProfessionalTesterCheckBoxExist();

        assertTrue(toolsQaAutomationPracticeFormPage
                .getProfessionManualTesterCheckBox().isDisplayed());
    }
}
