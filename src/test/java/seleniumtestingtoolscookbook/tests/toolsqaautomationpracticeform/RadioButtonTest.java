package seleniumtestingtoolscookbook.tests.toolsqaautomationpracticeform;

import org.junit.Test;
import org.openqa.selenium.WebElement;
import seleniumtestingtoolscookbook.pages.ToolsQaAutomationPracticePage;

import static junit.framework.TestCase.assertTrue;

public class RadioButtonTest extends ToolsQaPracticeFormBaseTest {

    @Test
    public void testRadioButton() {

        ToolsQaAutomationPracticePage toolsQaAutomationPracticePage =
                super.initLoad();

        toolsQaAutomationPracticePage.selectYearsOfExperienceRadioButton();

        // Verify Radio Button is selected
        assertTrue(toolsQaAutomationPracticePage
                .getYearsOfExperience().isSelected());
    }

    @Test
    public void testRadioGroup() {

        ToolsQaAutomationPracticePage toolsQaAutomationPracticePage =
                super.initLoad();

        for (WebElement yearOfExperience : toolsQaAutomationPracticePage
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
