package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToolsQaAutomationPracticeFormPage extends Page {
    public ToolsQaAutomationPracticeFormPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(css = "#profession-0")
    private WebElement professionManualTesterCheckBox;

    @FindBy(css = "#continents")
    private WebElement continents;

    public WebElement getProfessionManualTesterCheckBox() {
        return professionManualTesterCheckBox;
    }

    //Check if its already selected? Otherwise select the Checkbox
    //by calling click() method
    public void selectCheckBox() {
        if (!professionManualTesterCheckBox.isSelected()) {
            professionManualTesterCheckBox.click();
        }

        WebDriverWait wait = new WebDriverWait(getWebDriver(), 10);
        wait.until(ExpectedConditions.elementToBeSelected(By.
                cssSelector("#profession-0")));
    }

    //Check Checkbox if selected? If yes, deselect it
    //by calling click() method
    public void deselectCheckBox() {
        if (professionManualTesterCheckBox.isSelected()) {
            professionManualTesterCheckBox.click();
        }
    }

    // Get the Dropdown as a Select
//    public Select continentsSelect = new Select(getWebDriver().findElement(By
//            .cssSelector("#continents")));
    public Select continentsSelect = new Select(continents);
}
