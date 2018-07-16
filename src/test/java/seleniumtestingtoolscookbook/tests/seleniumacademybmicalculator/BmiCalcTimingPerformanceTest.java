package seleniumtestingtoolscookbook.tests.seleniumacademybmicalculator;

import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import seleniumtestingtoolscookbook.utils.BaseTest;

import static seleniumtestingtoolscookbook.utils.Links.SELENIUMACADEMY_BMICALCULATOR_PAGE;

public class BmiCalcTimingPerformanceTest extends BaseTest {

    @Test
    public void measureNavigationTiming() {
        goToPageAndWaitPageToLoad(SELENIUMACADEMY_BMICALCULATOR_PAGE);

        JavascriptExecutor js = (JavascriptExecutor) getWebDriver();

        // Get the Load Event End
        long loadEventEnd = (Long) js.executeScript("return window.performance.timing.loadEventEnd;");

        // Get the Navigation Event Start
        long navigationStart = (Long) js.executeScript("return window.performance.timing.navigationStart;");

        // Difference between Load Event End and Navigation Event Start is
        // Page Load Time
        System.out.println("Page Load Time is " + (loadEventEnd -
                navigationStart) / 1000 + " seconds.");
    }
}
