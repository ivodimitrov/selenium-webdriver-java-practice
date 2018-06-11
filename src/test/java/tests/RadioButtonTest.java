package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseTest;

import java.util.List;

import static junit.framework.TestCase.assertTrue;

public class RadioButtonTest extends BaseTest {

    @Test
    public void testRadioButton() {
        // Get the Radio Button as WebElement using it's value attribute
        WebElement yearsOfExperience = getWebDriver().findElement(By.
                xpath("//*[@id=\"exp-0\"]"));
        // Check if its already selected? otherwise select the Radio Button
        // by calling click() method
        if (!yearsOfExperience.isSelected()) {
            yearsOfExperience.click();
        }
        // Verify Radio Button is selected
        assertTrue(yearsOfExperience.isSelected());
    }

    @Test
    public void testRadioGroup() {
        // Get all the Radio buttons from a Radio Group in a list
        // using findElements() method along with Radio Group identifier
        List<WebElement> yearsOfExperience = getWebDriver().findElements(By.
                cssSelector("div.control-group:nth-child(23)"));
        for (WebElement yearOfExperience : yearsOfExperience) {
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
