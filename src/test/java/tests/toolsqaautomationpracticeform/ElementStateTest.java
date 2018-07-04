package tests.toolsqaautomationpracticeform;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseTest;

import static junit.framework.TestCase.fail;
import static utils.Links.TOOLSQA_AUTOMATION_PRACTICE_FORM;

public class ElementStateTest extends BaseTest {

    @Test
    public void testElementIsEnabled() {
        // Go to page
        goToPageAndWaitPageToLoad(TOOLSQA_AUTOMATION_PRACTICE_FORM);

        // Get the Checkbox as WebElement using it's name attribute
        WebElement professionManualTesterCheckBox = getWebDriver().findElement(By.
                cssSelector("#profession-0"));
        // Check if its enabled before selecting it
        if (professionManualTesterCheckBox.isEnabled()) {
            // Check if its already selected? otherwise select the Checkbox
            if (!professionManualTesterCheckBox.isSelected()) {
                professionManualTesterCheckBox.click();
            }
        } else {
            fail("Profession Manual tester Checkbox is disabled!");
        }
    }
}
