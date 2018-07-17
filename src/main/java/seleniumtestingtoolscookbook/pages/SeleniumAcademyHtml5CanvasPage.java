package seleniumtestingtoolscookbook.pages;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;

import static org.apache.commons.io.FileUtils.copyFile;

public class SeleniumAcademyHtml5CanvasPage extends Page {

    @FindBy(id = "imageTemp")
    private WebElement canvas;
    @FindBy(id = "dtool")
    private WebElement drawingTool;
    private Select drawingTools = new Select(drawingTool);
    private String scrFile =
            "target/screenshots/seleniumacademyhtml5canvasdrawpage/screenshot.png";
    private String baseScrFile =
            "target/screenshots/seleniumacademyhtml5canvasdrawpage/baseScreenshot.png";

    public SeleniumAcademyHtml5CanvasPage(WebDriver webDriver) {
        super(webDriver);
    }

    public WebElement getCanvas() {
        return canvas;
    }

    public void selectPencilTool() {
        drawingTools.selectByValue("pencil");
    }

    public void drawShapeOnCanvas() {
        Actions builder = new Actions(getWebDriver());
        builder.clickAndHold(canvas)
                .moveByOffset(10, 50)
                .moveByOffset(50, 10)
                .moveByOffset(-10, -50)
                .moveByOffset(-50, -10)
                .release().perform();
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
}

