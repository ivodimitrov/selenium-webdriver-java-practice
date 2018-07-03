package tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import pages.BmiCalcPage;
import utils.BaseTest;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static utils.Links.BMICALCULATOR_PAGE;

@RunWith(Parameterized.class)
public class SimpleDDTest extends BaseTest {

    private String height;
    private String weight;
    private String bmi;
    private String bmiCategory;

    public SimpleDDTest(String height, String weight, String bmi,
                        String bmiCategory) {
        this.height = height;
        this.weight = weight;
        this.bmi = bmi;
        this.bmiCategory = bmiCategory;
    }

    @Parameterized.Parameters
    public static List<String[]> testData() {
        return Arrays.asList(new String[][]{
                {"160", "45", "17.6", "Underweight"},
                {"168", "70", "24.8", "Normal"},
                {"181", "89", "27.2", "Overweight"},
                {"178", "100", "31.6", "Obesity"}});
    }

    @Test
    public void testBMICalculator() {
        goToPageAndWaitPageToLoad(BMICALCULATOR_PAGE);

        BmiCalcPage bmiCalcPage = new BmiCalcPage(getWebDriver());

        // Get the Height element and set the value using height variable
        bmiCalcPage.setHeight(height);

        // Get the Weight element and set the value using weight variable
        bmiCalcPage.setWeight(weight);

        // Click on Calculate Button
        bmiCalcPage.calculateBmi();

        // Get the Bmi element and verify its value using bmi variable
        assertEquals(bmi, bmiCalcPage.getBmi());

        // Get the Bmi Category element and verify its value using bmiCategory variable
        assertEquals(bmiCategory, bmiCalcPage.getBmiCategory());
    }
}

