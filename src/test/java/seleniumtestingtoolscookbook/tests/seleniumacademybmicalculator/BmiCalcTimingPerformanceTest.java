package seleniumtestingtoolscookbook.tests.seleniumacademybmicalculator;

import org.junit.Test;
import seleniumtestingtoolscookbook.pages.SeleniumAcademyBmiCalcPage;
import seleniumtestingtoolscookbook.utils.BaseTest;

import static org.junit.Assert.assertTrue;
import static seleniumtestingtoolscookbook.utils.Links.SELENIUMACADEMY_BMICALCULATOR_PAGE;

public class BmiCalcTimingPerformanceTest extends BaseTest {

    @Test
    public void measureNavigationTiming() {
        goToPageAndWaitPageToLoad(SELENIUMACADEMY_BMICALCULATOR_PAGE);

        SeleniumAcademyBmiCalcPage seleniumAcademyBmiCalcPage =
                new SeleniumAcademyBmiCalcPage(getWebDriver());

        seleniumAcademyBmiCalcPage.calculateLoadTime();

        assertTrue("Load Time is more than 2 seconds!",
                seleniumAcademyBmiCalcPage.calculateLoadTime() < 2);

        // Simple logger
        seleniumAcademyBmiCalcPage.printLoadTime();
    }
}
