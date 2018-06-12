package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.BaseTest;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class CheckboxTest extends BaseTest {

    @Test
    public void testCheckBox() {

        WebDriverWait wait = new WebDriverWait(getWebDriver(), 10);
        wait.until(ExpectedConditions.titleContains("Demo"));

        //Get the Checkbox as WebElement using it's value attribute
        WebElement professionManualTesterCheckBox = getWebDriver().findElement(By.
                cssSelector("#profession-0"));

        //Check if its already selected? Otherwise select the Checkbox
        //by calling click() method
        if (!professionManualTesterCheckBox.isSelected()) {
            professionManualTesterCheckBox.click();
        }

        wait.until(ExpectedConditions.elementToBeSelected(By.
                cssSelector("#profession-0")));

        //Verify Checkbox is Selected
        assertTrue(professionManualTesterCheckBox.isSelected());

        //Check Checkbox if selected? If yes, deselect it
        //by calling click() method
        if (professionManualTesterCheckBox.isSelected()) {
            professionManualTesterCheckBox.click();
        }

        //Verify Checkbox is Deselected
        assertFalse(professionManualTesterCheckBox.isSelected());
    }
}
