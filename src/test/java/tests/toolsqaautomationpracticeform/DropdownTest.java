package tests.toolsqaautomationpracticeform;

import org.junit.Test;
import org.openqa.selenium.WebElement;
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

        int continentsCounter = 0;

        // Iterate though the list of continents and count each continent
        // Simple logger
        for (WebElement continentsOption :
                toolsQaAutomationPracticeFormPage.getContinentsOptions()) {
            System.out.println("Continent " + continentsOption.getText().trim() +
                    " is at position: " + (continentsCounter + 1));

            continentsCounter++;
        }
        // Verify Dropdown has many options for selection
        assertEquals("Verify Dropdown has many options for selection",
                7, toolsQaAutomationPracticeFormPage
                        .getContinentsOptions().size());

        // Simple logger
        System.out.println();
        System.out.println("Number of all the continents displayed on the Page are: "
                + continentsCounter);
    }

    @Test
    public void testAnOptionIsSelectedInDropdownContinents() {

        goToPageAndWaitPageToLoad(TOOLSQA_AUTOMATION_PRACTICE_FORM);

        ToolsQaAutomationPracticeFormPage toolsQaAutomationPracticeFormPage =
                new ToolsQaAutomationPracticeFormPage(getWebDriver());

        // With Select class we can select an option in Dropdown using Visible text
        toolsQaAutomationPracticeFormPage.continentsSelect.selectByVisibleText("Asia");

        // Simple logger
        System.out.println("Selected option in Dropdown using Visible text is: " +
                toolsQaAutomationPracticeFormPage.continentsSelect
                        .getFirstSelectedOption().getText().trim());

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
