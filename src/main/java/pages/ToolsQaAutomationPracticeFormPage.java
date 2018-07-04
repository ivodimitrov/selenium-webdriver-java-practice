package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.openqa.selenium.By.cssSelector;

public class ToolsQaAutomationPracticeFormPage extends Page {
    public ToolsQaAutomationPracticeFormPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(css = "#profession-0")
    private WebElement professionManualTesterCheckBox;

    @FindBy(css = "#continents")
    private WebElement continents;

    // Dropdown expected values in array
    public List<String> expectedOptions = Arrays.asList("Asia", "Europe",
            "Africa", "Australia", "South America", "North America", "Antartica");

    public WebElement getProfessionManualTesterCheckBox() {
        return professionManualTesterCheckBox;
    }

    // Dropdown actual options
    public List<String> actualOptions = new ArrayList<>();
    // Get the Dropdown as a Select
//    public Select continentsSelect = new Select(getWebDriver().findElement(By
//            .cssSelector("#continents")));
    public Select continentsSelect = new Select(continents);
    @FindBy(css = "#continents option")
    private List<WebElement> continentsOptions;

    //Check Checkbox if selected? If yes, deselect it
    //by calling click() method
    public void deselectCheckBox() {
        if (professionManualTesterCheckBox.isSelected()) {
            professionManualTesterCheckBox.click();
        }
    }

    // Get all Continents displayed on the Page
    public List<WebElement> getContinentsOptions() {
        return continentsOptions;
    }

    //Check if its already selected? Otherwise select the Checkbox
    //by calling click() method
    public void selectCheckBox() {
        if (!professionManualTesterCheckBox.isSelected()) {
            professionManualTesterCheckBox.click();
        }

        WebDriverWait wait = new WebDriverWait(getWebDriver(), 10);
        wait.until(ExpectedConditions.elementToBeSelected(cssSelector("#profession-0")));
    }

    public void getActualContinentsSelectOptions() {

        List<WebElement> continentsSelectOptions = continentsSelect.getOptions();

        for (WebElement option : continentsSelectOptions) {
            actualOptions.add(option.getText().trim());
        }
    }
}
