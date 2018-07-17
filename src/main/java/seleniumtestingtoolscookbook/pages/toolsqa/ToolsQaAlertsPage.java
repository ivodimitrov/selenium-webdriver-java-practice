package seleniumtestingtoolscookbook.pages.toolsqa;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import seleniumtestingtoolscookbook.pages.Page;

public class ToolsQaAlertsPage extends Page {

    public Alert alert = new Alert() {
        @Override
        public void dismiss() {

        }

        @Override
        public void accept() {

        }

        @Override
        public String getText() {
            return null;
        }

        @Override
        public void sendKeys(String keysToSend) {

        }
    };
    @FindBy(xpath = "//*[@id='content']/p[4]/button")
    private WebElement simpleAlertButton;
    @FindBy(xpath = "//*[@id='content']/p[8]/button")
    private WebElement confirmPopUpButton;
    @FindBy(xpath = "//*[@id='content']/p[11]/button")
    private WebElement promptAlertBoxButton;
    private String alertText;

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

    // Click Confirm button to show Confirmation Alert box
    public void clickConfirmPopUpButton() {
        confirmPopUpButton.click();
        waitForAlert();
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

    public String getAlertText() {
        return alert.getText();
    }

    public Alert getAlert() {
        return alert;
    }

    public void switchToAlert() {
        alert = getWebDriver().switchTo().alert();
    }

    // Simple Logger
    public void printAlertText() {
        System.out.println("Alert text is: " + getAlertText());
    }
}