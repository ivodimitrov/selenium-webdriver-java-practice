package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import tests.basetests.ToolsQaBaseTest;

import static helpermethods.GetCurrentExecutableTestName.printCurrentExecutableTestName;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class CheckboxesTest extends ToolsQaBaseTest {

    @Test
    public void testCheckBox() {
        // Print the name of the current executed test
        printCurrentExecutableTestName();
        //Get the Checkbox as WebElement using it's value attribute
        WebElement profession = driver.findElement(By.
                cssSelector("#profession-0"));

        //Check if its already selected? Otherwise select the Checkbox
        //by calling click() method
        if (!profession.isSelected()) {
            profession.click();
        }

        //Verify Checkbox is Selected
        assertTrue(profession.isSelected());

        //Check Checkbox if selected? If yes, deselect it
        //by calling click() method
        if (profession.isSelected()) {
            profession.click();
        }

        //Verify Checkbox is Deselected
        assertFalse(profession.isSelected());
    }
}
