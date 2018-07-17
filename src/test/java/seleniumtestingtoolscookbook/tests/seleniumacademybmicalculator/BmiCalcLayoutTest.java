package seleniumtestingtoolscookbook.tests.seleniumacademybmicalculator;

import org.junit.Test;
import seleniumtestingtoolscookbook.pages.seleniumacademy.SeleniumAcademyBmiCalcPage;
import seleniumtestingtoolscookbook.utils.BaseTest;
import seleniumtestingtoolscookbook.utils.CompareUtil;

import static org.junit.Assert.assertEquals;
import static seleniumtestingtoolscookbook.utils.Links.SELENIUMACADEMY_BMICALCULATOR_PAGE;

public class BmiCalcLayoutTest extends BaseTest {

    @Test
    public void testBmiCalculatorLayout() throws Exception {
        goToPageAndWaitPageToLoad(SELENIUMACADEMY_BMICALCULATOR_PAGE);

        SeleniumAcademyBmiCalcPage seleniumAcademyBmiCalcPage =
                new SeleniumAcademyBmiCalcPage(getWebDriver());

        seleniumAcademyBmiCalcPage.takeScreenshot();

        // Verify baseline image with actual image
        assertEquals("Screenshot does not match!", CompareUtil.Result.Matched,
                CompareUtil.CompareImage(
                        seleniumAcademyBmiCalcPage.getBaseScrFile(),
                        seleniumAcademyBmiCalcPage.getScrFile()));
    }
}
