package tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseTest;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static utils.Links.BMICALCULATOR_PAGE;

@RunWith(Parameterized.class)
public class SimpleDDT extends BaseTest {

    private String height;
    private String weight;
    private String bmi;
    private String bmiCategory;

    public SimpleDDT(String height, String weight, String bmi,
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

        // Get the Height element and set the value using height variable
        WebElement heightField = getWebDriver().findElement(By.
                name("heightCMS"));
        heightField.clear();
        heightField.sendKeys(height);

        // Get the Weight element and set the value using weight variable
        WebElement weightField = getWebDriver().findElement(By.
                name("weightKg"));
        weightField.clear();
        weightField.sendKeys(weight);

        // Click on Calculate Button
        WebElement calculateButton = getWebDriver().findElement(By.
                id("Calculate"));
        calculateButton.click();

        // Get the Bmi element and verify its value using bmi variable
        WebElement bmiLabel = getWebDriver().findElement(By.
                name("bmi"));
        assertEquals(bmi, bmiLabel.getAttribute("value"));

        // Get the Bmi Category element and verify its value using
        // bmiCategory variable
        WebElement bmiCategoryLabel = getWebDriver().findElement(By
                .name("bmi_category"));
        assertEquals(bmiCategory,
                bmiCategoryLabel.getAttribute("value"));
    }
}

