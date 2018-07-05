package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToolsQaAlertsPage extends Page {
    @FindBy(xpath = "//*[@id='content']/p[4]/button")
    private WebElement simpleAlertButton;
    @FindBy(xpath = "//*[@id='content']/p[8]/button")
    private WebElement confirmPopUpButton;
    @FindBy(xpath = "//*[@id='content']/p[11]/button")
    private WebElement promptAlertBoxButton;

    public ToolsQaAlertsPage(WebDriver webDriver) {
        super(webDriver);
    }

    public WebElement getSimpleAlertButton() {
        return simpleAlertButton;
    }

    // Click Simple button to show an Alert box
    public void clickSimpleAlertButton() {
        simpleAlertButton.click();
        waitForAlert();
    }

    public WebElement getConfirmPopUpButton() {
        return confirmPopUpButton;
    }

    // Click Confirm button to show Confirmation Alert box
    public void clickConfirmPopUpButton() {
        confirmPopUpButton.click();
        waitForAlert();
    }

    public WebElement getPromptAlertBoxButton() {
        return promptAlertBoxButton;
    }

    // Click Confirm button to show Prompt Alert box
    public void clickPromptAlertBoxButton() {
        promptAlertBoxButton.click();
        waitForAlert();
    }

    // Wait for an Alert box using the WebDriverWait
    private void waitForAlert() {
        WebDriverWait wait = new WebDriverWait(getWebDriver(), 10);
        wait.until(ExpectedConditions.alertIsPresent());
    }

//    // Simple Logger
//    public void printAlertText() {
//        System.out.println("Alert text is: " + alertText);
//    }
}