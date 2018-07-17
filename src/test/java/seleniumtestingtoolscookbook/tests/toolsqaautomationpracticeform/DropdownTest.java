package seleniumtestingtoolscookbook.tests.toolsqaautomationpracticeform;

import org.junit.Test;
import seleniumtestingtoolscookbook.pages.toolsqa.ToolsQaAutomationPracticePage;

import static org.junit.Assert.*;

public class DropdownTest extends ToolsQaPracticeFormBaseTest {

    @Test
    public void testDropdownContinents() {

        ToolsQaAutomationPracticePage toolsQaAutomationPracticePage =
                super.initLoad();

        // Verify Dropdown does not support multiple selection
        assertFalse(toolsQaAutomationPracticePage.getContinentsSelect()
                .isMultiple());

        toolsQaAutomationPracticePage.printContinentsSelectOptions();

        // Verify Dropdown has many options for selection
        assertEquals("Verify Dropdown has many options for selection",
                7, toolsQaAutomationPracticePage
                        .getContinentsOptions().size());
    }

    @Test
    public void testAnOptionIsSelectedInDropdownContinents() {

        ToolsQaAutomationPracticePage toolsQaAutomationPracticePage =
                super.initLoad();

        // With Select class we can select an option in Dropdown using Visible text
        toolsQaAutomationPracticePage.getContinentsSelect()
                .selectByVisibleText("Asia");

        toolsQaAutomationPracticePage.printContinentsSelectFirstSelectedOption();

        assertEquals("Asia",
                toolsQaAutomationPracticePage.getContinentsSelect()
                        .getFirstSelectedOption().getText().trim());
    }

    @Test
    public void testAnOptionsAreContainedInDropdownContinents() {

        ToolsQaAutomationPracticePage toolsQaAutomationPracticePage =
                super.initLoad();

        toolsQaAutomationPracticePage.getActualContinentsSelectOptions();

        assertArrayEquals("Verify expected options array and actual options array match",
                toolsQaAutomationPracticePage.getExpectedOptions().toArray(),
                toolsQaAutomationPracticePage.getActualOptions().toArray());
    }
}
