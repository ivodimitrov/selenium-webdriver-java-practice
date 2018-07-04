package tests.toolsqaautomationpracticeform;

import org.junit.Test;
import pages.ToolsQaAutomationPracticeFormPage;
import utils.BaseTest;

import static org.junit.Assert.*;
import static utils.Links.TOOLSQA_AUTOMATION_PRACTICE_FORM;

public class DropdownTest extends BaseTest {

    @Test
    public void testDropdownContinents() {

        goToPageAndWaitPageToLoad(TOOLSQA_AUTOMATION_PRACTICE_FORM);

        ToolsQaAutomationPracticeFormPage toolsQaAutomationPracticeFormPage =
                new ToolsQaAutomationPracticeFormPage(getWebDriver());

        // Verify Dropdown does not support multiple selection
        assertFalse(toolsQaAutomationPracticeFormPage.continentsSelect
                .isMultiple());

        toolsQaAutomationPracticeFormPage.printContinentsSelectOptions();

        // Verify Dropdown has many options for selection
        assertEquals("Verify Dropdown has many options for selection",
                7, toolsQaAutomationPracticeFormPage
                        .getContinentsOptions().size());
    }

    @Test
    public void testAnOptionIsSelectedInDropdownContinents() {

        goToPageAndWaitPageToLoad(TOOLSQA_AUTOMATION_PRACTICE_FORM);

        ToolsQaAutomationPracticeFormPage toolsQaAutomationPracticeFormPage =
                new ToolsQaAutomationPracticeFormPage(getWebDriver());

        // With Select class we can select an option in Dropdown using Visible text
        toolsQaAutomationPracticeFormPage.continentsSelect.selectByVisibleText("Asia");

        toolsQaAutomationPracticeFormPage.printContinentsSelectFirstSelectedOption();

        assertEquals("Asia",
                toolsQaAutomationPracticeFormPage.continentsSelect
                        .getFirstSelectedOption().getText().trim());
    }

    @Test
    public void testAnOptionsAreContainedInDropdownContinents() {

        goToPageAndWaitPageToLoad(TOOLSQA_AUTOMATION_PRACTICE_FORM);

        ToolsQaAutomationPracticeFormPage toolsQaAutomationPracticeFormPage =
                new ToolsQaAutomationPracticeFormPage(getWebDriver());

        toolsQaAutomationPracticeFormPage.getActualContinentsSelectOptions();

        assertArrayEquals("Verify expected options array and actual options array match",
                toolsQaAutomationPracticeFormPage.expectedOptions.toArray(),
                toolsQaAutomationPracticeFormPage.actualOptions.toArray());
    }
}
