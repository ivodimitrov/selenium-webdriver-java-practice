package seleniumtestingtoolscookbook.tests.seleniumacademybmicalculator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import seleniumtestingtoolscookbook.pages.BmiCalcPage;
import seleniumtestingtoolscookbook.utils.BaseTest;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;
import static seleniumtestingtoolscookbook.utils.Links.SELENIUMACADEMY_BMICALCULATOR_PAGE;

public class TestNGDDTest extends BaseTest {

    private WebDriver driver;

    @DataProvider
    public Object[][] testData() {
        return new Object[][]{
                new Object[]{"160", "45", "17.6", "Underweight"
                },
                new Object[]{"168", "70", "24.8", "Normal"},
                new Object[]{"181", "89", "27.2", "Overweight"},
                new Object[]{"178", "100", "31.6", "Obesity"},};
    }

    @BeforeTest
    public void setUp() {
        // driver = new FirefoxDriver();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(SELENIUMACADEMY_BMICALCULATOR_PAGE);
    }

    @Test(dataProvider = "testData")
    public void testBMICalculator(String height, String
            weight, String bmi, String category) {
        BmiCalcPage bmiCalcPage = new BmiCalcPage(driver);

        bmiCalcPage.calculateBmi(height, weight);
        // Verify Bmi & Bmi Category values
        assertEquals(bmiCalcPage.getBmi(), bmi, "BMI calculation is not correct!");
        assertEquals(bmiCalcPage.getBmiCategory(), category, "BMI category is not correct!");
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
