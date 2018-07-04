package tests.toolsqaautomationpracticeform;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.ToolsQaAutomationPracticeFormPage;
import utils.BaseTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

        // Get all Continents displayed on the Page
        List<WebElement> continentsOptions = getWebDriver().findElements(By.
                cssSelector("#continents option"));

        int continentsCounter = 0;

        // Iterate though the list of continents and count each continent
        for (WebElement continentsOption : continentsOptions) {
            System.out.println("Number of the continent is: "
                    + (continentsCounter + 1));

            System.out.println(continentsOption.getText().trim());

            continentsCounter++;
        }
        // Verify Dropdown has many options for selection
        assertEquals("Verify Dropdown has many options for selection",
                7, continentsOptions.size());

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

        // Verify Dropdown has expected values as listed in array
        List<String> expectedOptions = Arrays.asList("Asia", "Europe",
                "Africa", "Australia", "South America", "North America", "Antartica");

        List<String> actualOptions = new ArrayList<>();

        // Retrieve the option values from Dropdown using getOptions() method
        List<WebElement> options = toolsQaAutomationPracticeFormPage.continentsSelect
                .getOptions();

        for (WebElement option : options) {
            actualOptions.add(option.getText().trim());
        }
        // Verify expected options array and actual options array match
        assertArrayEquals("Verify expected options array and actual options array match",
                expectedOptions.toArray(), actualOptions.toArray());
    }
}
