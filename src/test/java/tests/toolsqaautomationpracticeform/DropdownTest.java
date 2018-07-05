package tests.toolsqaautomationpracticeform;

import org.junit.Test;
import pages.ToolsQaAutomationPracticeFormPage;

import static org.junit.Assert.*;

public class DropdownTest extends ToolsQaPracticeFormPageBaseTest {

    @Test
    public void testDropdownContinents() {

        ToolsQaAutomationPracticeFormPage toolsQaAutomationPracticeFormPage =
                super.initLoad();

        // Verify Dropdown does not support multiple selection
        assertFalse(toolsQaAutomationPracticeFormPage.getContinentsSelect()
                .isMultiple());

        toolsQaAutomationPracticeFormPage.printContinentsSelectOptions();

        // Verify Dropdown has many options for selection
        assertEquals("Verify Dropdown has many options for selection",
                7, toolsQaAutomationPracticeFormPage
                        .getContinentsOptions().size());
    }

    @Test
    public void testAnOptionIsSelectedInDropdownContinents() {

        ToolsQaAutomationPracticeFormPage toolsQaAutomationPracticeFormPage =
                super.initLoad();

        // With Select class we can select an option in Dropdown using Visible text
        toolsQaAutomationPracticeFormPage.getContinentsSelect()
                .selectByVisibleText("Asia");

        toolsQaAutomationPracticeFormPage.printContinentsSelectFirstSelectedOption();

        assertEquals("Asia",
                toolsQaAutomationPracticeFormPage.getContinentsSelect()
                        .getFirstSelectedOption().getText().trim());
    }

    @Test
    public void testAnOptionsAreContainedInDropdownContinents() {

        ToolsQaAutomationPracticeFormPage toolsQaAutomationPracticeFormPage =
                super.initLoad();

        toolsQaAutomationPracticeFormPage.getActualContinentsSelectOptions();

        assertArrayEquals("Verify expected options array and actual options array match",
                toolsQaAutomationPracticeFormPage.getExpectedOptions().toArray(),
                toolsQaAutomationPracticeFormPage.getActualOptions().toArray());
    }
}
