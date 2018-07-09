package tests.toolsqaautomationpracticeform;

import org.junit.Test;
import org.openqa.selenium.WebElement;
import pages.ToolsQaAutomationPracticeFormPage;

import static junit.framework.TestCase.assertTrue;

public class RadioButtonTest extends ToolsQaPracticeFormBaseTest {

    @Test
    public void testRadioButton() {

        ToolsQaAutomationPracticeFormPage toolsQaAutomationPracticeFormPage =
                super.initLoad();

        toolsQaAutomationPracticeFormPage.selectYearsOfExperienceRadioButton();

        // Verify Radio Button is selected
        assertTrue(toolsQaAutomationPracticeFormPage
                .getYearsOfExperience().isSelected());
    }

    @Test
    public void testRadioGroup() {

        ToolsQaAutomationPracticeFormPage toolsQaAutomationPracticeFormPage =
                super.initLoad();

        for (WebElement yearOfExperience : toolsQaAutomationPracticeFormPage
                .getYearsOfExperienceRadioButtons()) {
            // Search for Radio Button in the Radio Group and select it
            if (yearOfExperience.getAttribute("id").equals("exp-")) {
                if (!yearOfExperience.isSelected()) {
                    yearOfExperience.click();
                }
                assertTrue(yearOfExperience.isSelected());
                break;
            }
        }
    }
}
