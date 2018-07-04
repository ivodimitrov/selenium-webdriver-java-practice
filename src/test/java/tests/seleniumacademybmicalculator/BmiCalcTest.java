package tests.seleniumacademybmicalculator;

import org.junit.Test;
import pages.BmiCalcPage;
import utils.BaseTest;

import static org.junit.Assert.assertEquals;
import static utils.Links.SELENIUMACADEMY_BMICALCULATOR_PAGE;

public class BmiCalcTest extends BaseTest {

    @Test
    public void testBmiCalculation() {
        goToPageAndWaitPageToLoad(SELENIUMACADEMY_BMICALCULATOR_PAGE);

        BmiCalcPage bmiCalcPage = new BmiCalcPage(getWebDriver());

        bmiCalcPage.calculateBmi("181", "80");
        // Verify Bmi & Bmi Category values
        assertEquals("BMI calculation is not correct!", "24.4", bmiCalcPage.getBmi());
        assertEquals("BMI category is not correct!", "Normal", bmiCalcPage.getBmiCategory());
    }
}
