package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ToolsQaSwitchWindowsPage extends Page {
    @FindBy(css = "#content > p:nth-child(5) > button:nth-child(1)")
    private WebElement newMessageWindowButton;

    private String parentWindowId;

    public ToolsQaSwitchWindowsPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void clickNewMessageWindowButton() {
        newMessageWindowButton.click();
    }

    // Store WindowHandle of parent browser window
    public String getParentWindowId() {
        parentWindowId = getWebDriver().getWindowHandle();
        return parentWindowId;
    }

    // Switch to the parent browser window
    public void switchToParentBrowserWindow() {
        getWebDriver().switchTo().window(parentWindowId);
    }

    // Switch to the new Message window using name
    public void switchToNewMessageWindow() {
        getWebDriver().switchTo().window("MsgWindow");
    }

    // Close the Message window
    public void closeMessageWindow() {
        getWebDriver().close();
    }

    // Check the driver context is in Message window
    public boolean verifyDriverContextInMessageWindow() {
        return getWebDriver().getPageSource().
                contains("Knowledge increases by sharing but not by saving.");
    }

    // Check driver context is in parent browser window
    public boolean verifyDriverContextInParentBrowserWindow() {
        return getWebDriver().getTitle().contains("A new title is here");
    }
}