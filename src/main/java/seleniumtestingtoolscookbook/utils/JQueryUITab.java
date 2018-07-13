package seleniumtestingtoolscookbook.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class JQueryUITab {

    private WebElement jQueryUITab;

    private String tabLocator = ".ui-tabs-nav > li";
    private String selectedTabLocator = ".ui-tabs-nav > li.ui-tabs-selected";

    public JQueryUITab(WebElement jQueryUITab) {
        setjQueryUITab(jQueryUITab);
    }

//    public WebElement getjQueryUITab() {
//        return jQueryUITab;
//    }

    private void setjQueryUITab(WebElement jQueryUITab) {
        this.jQueryUITab = jQueryUITab;
    }

    public int getTabCount() {
        List<WebElement> tabs =
                jQueryUITab.findElements(By.cssSelector(tabLocator));
        return tabs.size();
    }

    public String getSelectedTab() {
        WebElement tab = jQueryUITab.findElement(By
                .cssSelector(selectedTabLocator));
        return tab.getText();
    }

    public void selectTab(String tabName) {
        int idx = 0;
        boolean found = false;

        List<WebElement> tabs = jQueryUITab.findElements(By
                .cssSelector(tabLocator));

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
            throw new IllegalArgumentException("Could not find tab '" + tabName + "'");
    }
}
