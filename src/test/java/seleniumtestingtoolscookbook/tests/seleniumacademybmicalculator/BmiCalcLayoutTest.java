package seleniumtestingtoolscookbook.tests.seleniumacademybmicalculator;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import seleniumtestingtoolscookbook.utils.BaseTest;
import seleniumtestingtoolscookbook.utils.CompareUtil;

import java.io.File;

import static org.junit.Assert.assertEquals;
import static seleniumtestingtoolscookbook.utils.Links.SELENIUMACADEMY_BMICALCULATOR_PAGE;

public class BmiCalcLayoutTest extends BaseTest {

    @Test
    public void testBmiCalculatorLayout() throws Exception {
        goToPageAndWaitPageToLoad(SELENIUMACADEMY_BMICALCULATOR_PAGE);

        String scrFile = "target/screenshots/bmicalcpage/screenshot.png";
        String baseScrFile = "target/screenshots/bmicalcpage/baseScreenshot.png";

        // Open the BMI Calculator Page and get a Screen Shot of Page into a File
        File screenshotFile = ((TakesScreenshot) getWebDriver())
                .getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshotFile, new File(scrFile));

        // Verify baseline image with actual image
        assertEquals(CompareUtil.Result.Matched,
                CompareUtil.CompareImage(baseScrFile, scrFile));
    }
}
