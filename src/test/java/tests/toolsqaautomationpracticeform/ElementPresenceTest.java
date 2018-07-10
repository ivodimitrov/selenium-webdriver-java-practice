package tests.toolsqaautomationpracticeform;

import org.junit.Test;
import pages.ToolsQaAutomationPracticePage;

import static org.junit.Assert.assertTrue;

public class ElementPresenceTest extends ToolsQaPracticeFormBaseTest {

    @Test
    public void testIsElementPresent() {

        ToolsQaAutomationPracticePage toolsQaAutomationPracticePage =
                super.initLoad();

        toolsQaAutomationPracticePage.doesProfessionalTesterCheckBoxExist();

        assertTrue(toolsQaAutomationPracticePage
                .getProfessionManualTesterCheckBox().isDisplayed());
    }
}
