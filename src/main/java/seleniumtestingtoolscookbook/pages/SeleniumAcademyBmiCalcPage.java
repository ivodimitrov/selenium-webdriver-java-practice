package seleniumtestingtoolscookbook.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

import java.io.File;
import java.io.IOException;

import static org.apache.commons.io.FileUtils.copyFile;

public class SeleniumAcademyBmiCalcPage extends Page {

    private String scrFile =
            "target/screenshots/seleniumacademybmicalcpage/screenshot.png";

    @FindBy(id = "heightCMS")
    private WebElement heightInput;

    @FindBy(id = "weightKg")
    private WebElement weightInput;

    @FindBy(id = "Calculate")
    private WebElement calculateButton;

    @FindBy(id = "bmi")
    private WebElement bmiInput;

    @FindBy(id = "bmi_category")
    private WebElement bmiCategoryInput;

    public void calculateBmi(String height, String weight) {
        heightInput.clear();
        heightInput.sendKeys(height);

        weightInput.clear();
        weightInput.sendKeys(weight);

        calculateButton.click();
    }

    public String getBmi() {
        return bmiInput.getAttribute("value");
    }

    public String getBmiCategory() {
        return bmiCategoryInput.getAttribute("value");
    }

    private String baseScrFile =
            "target/screenshots/seleniumacademybmicalcpage/baseScreenshot.png";
    private JavascriptExecutor js = (JavascriptExecutor) getWebDriver();
    private long loadEventEnd;
    private long navigationStart;

    public SeleniumAcademyBmiCalcPage(WebDriver webDriver) {
        super(webDriver);
    }

    public String getScrFile() {
        return scrFile;
    }

    public String getBaseScrFile() {
        return baseScrFile;
    }

    public void takeScreenshot() throws IOException {
        File screenshotFile = ((TakesScreenshot) getWebDriver())
                .getScreenshotAs(OutputType.FILE);
        copyFile(screenshotFile, new File(scrFile));
    }

    public Long getLoadEventEndTime() {
        return loadEventEnd = (Long) js
                .executeScript("return window.performance.timing.loadEventEnd;");
    }

    public Long getNavigationEventStartTime() {
        return navigationStart = (Long) js
                .executeScript("return window.performance.timing.navigationStart;");
    }

    // Difference between Load Event End and Navigation Event Start is
    // Page Load Time
    public Long calculateLoadTime() {
        return (loadEventEnd - navigationStart) / 1000;
    }

    // Simple logger
    public void printLoadTime() {
        System.out.println("Page Load Time is " + (loadEventEnd -
                navigationStart) / 1000 + " seconds.");
    }
}
