package tests;

import org.junit.Test;
import pages.BmiCalcPage;
import utils.BaseTest;

import static org.junit.Assert.assertEquals;
import static utils.Links.BMICALCULATOR_PAGE;

public class BmiCalcTest extends BaseTest {

    @Test
    public void testBmiCalculation() {

        goToPageAndWaitPageToLoad(BMICALCULATOR_PAGE);

        BmiCalcPage bmiCalcPage = new BmiCalcPage(getWebDriver());
        // Set Height
        bmiCalcPage.setHeight("181");
        // Set Weight
        bmiCalcPage.setWeight("80");
        // Click on Calculate button
        bmiCalcPage.calculateBmi();
        // Verify Bmi & Bmi Category values
        assertEquals("24.4", bmiCalcPage.getBmi());
        assertEquals("Normal", bmiCalcPage.getBmiCategory());
    }
}
