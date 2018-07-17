package seleniumtestingtoolscookbook.tests.seleniumacademybmicalculator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import seleniumtestingtoolscookbook.pages.SeleniumAcademyBmiCalcPage;
import seleniumtestingtoolscookbook.utils.BaseTest;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static seleniumtestingtoolscookbook.utils.Links.SELENIUMACADEMY_BMICALCULATOR_PAGE;

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
        goToPageAndWaitPageToLoad(SELENIUMACADEMY_BMICALCULATOR_PAGE);

        SeleniumAcademyBmiCalcPage seleniumAcademyBmiCalcPage = new SeleniumAcademyBmiCalcPage(getWebDriver());

        seleniumAcademyBmiCalcPage.calculateBmi(height, weight);
        // Verify Bmi & Bmi Category values
        assertEquals("BMI calculation is not correct!", bmi, seleniumAcademyBmiCalcPage.getBmi());
        assertEquals("BMI category is not correct!", bmiCategory, seleniumAcademyBmiCalcPage.getBmiCategory());
    }
}

