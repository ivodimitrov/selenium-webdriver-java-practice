package seleniumtestingtoolscookbook.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class SeleniumAcademyConfigPage extends Page {

    private String chatWindowText;

    @FindBy(id = "chatbutton")
    private WebElement onlineChatSupportButton;

    @FindBy(id = "closebutton")
    private WebElement closeButton;

    @FindBy(tagName = "p")
    private WebElement paragraphElement;

    private String paragraphElementText;
    private String parentWindowId;

    private WebDriverWait wait = new WebDriverWait(getWebDriver(), 10);

    public SeleniumAcademyConfigPage(WebDriver webDriver) {
        super(webDriver);
    }

    public boolean verifyParagraphElementText() {
        return getContentOfChatWindow()
                .contains("Wait while we connect you to Chat...");
    }

    public void clickCloseButton() {
        closeButton.click();
    }

    public void clickOnlineChatSupportButton() {
        onlineChatSupportButton.click();
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

    // Check driver context is in parent browser window
    public boolean verifyDriverContextInParentBrowserWindow() {
        return getWebDriver().getTitle().contains("Build my Car - Configuration");
    }

    // There is no name or title provided for Chat Page window
    // Iterate through all the open windows
    // and check the contents to find out if it's Chat window
    public String getContentOfChatWindow() {
        for (String windowId : getWebDriver().getWindowHandles()) {

            getWebDriver().switchTo().window(windowId);

            // Use the page source to check the contents
            String pageSource = getWebDriver().getPageSource();

            if (pageSource.contains("Configuration - Online Chat")) {

                wait.until(ExpectedConditions.visibilityOf(paragraphElement));

                chatWindowText = paragraphElement.getText();
            }
        }
        return chatWindowText;
    }

    // Simple Logger
    public void printChatWindowText() {
        System.out.println("Chat window text is: "
                + chatWindowText);
    }


//    @FindBy(css = ".ui-tabs-nav")
//    private WebElement tabsNavigation;

    @FindBy(css = ".ui-tabs-nav > li")
    private List<WebElement> tabsLocator;

    @FindBy(css = ".ui-tabs-nav > li.ui-tabs-selected")
    private WebElement selectedTabLocator;

    public int getTabsCount() {
        return tabsLocator.size();
    }

    public String getSelectedTabText() {
        return selectedTabLocator.getText();
    }

    public void selectTab(String tabName) {
        int idx = 0;
        boolean found = false;

        List<WebElement> tabs = tabsLocator;

        for (WebElement tab : tabs) {
            if (tabName.equals(tab.getText())) {
                tab.click();
                found = true;
                break;
            }
            idx++;
        }
        // Throw an exception if specified tab is not found
        if (!found)
            throw new IllegalArgumentException("Could not find tab '" + tabName + "'!");
    }

    // Simple logger
    public void printTabsNames() {
        List<WebElement> tabs = tabsLocator;

        System.out.println();

        for (WebElement tab : tabs) {
            System.out.println(tab.getText());
        }
    }
}
