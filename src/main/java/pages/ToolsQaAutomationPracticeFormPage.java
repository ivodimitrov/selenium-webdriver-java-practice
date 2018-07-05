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

    @FindBy(css = "#continents option")
    private List<WebElement> continentsOptions;

    // Dropdown expected values in array
    private List<String> expectedOptions = Arrays.asList("Asia", "Europe",
            "Africa", "Australia", "South America", "North America", "Antartica");
    // Dropdown actual options
    private List<String> actualOptions = new ArrayList<>();
    // Get the Dropdown as a Select
    @SuppressWarnings("ConstantConditions")
    private Select continentsSelect = new Select(continents);

    public WebElement getProfessionManualTesterCheckBox() {
        return professionManualTesterCheckBox;
    }

    // Get all Continents displayed on the Page
    public List<WebElement> getContinentsOptions() {
        return continentsOptions;
    }

    public List<String> getExpectedOptions() {
        return expectedOptions;
    }

    public List<String> getActualOptions() {
        return actualOptions;
    }

    public Select getContinentsSelect() {
        return continentsSelect;
    }

    //Check Checkbox if selected? If yes, deselect it
    //by calling click() method
    public void deselectCheckBox() {
        if (professionManualTesterCheckBox.isSelected()) {
            professionManualTesterCheckBox.click();
        }
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

    // Simple logger
    public void printContinentsSelectOptions() {

        int continentsCounter = 0;

        // Iterate though the list of continents and count each continent
        for (WebElement continentsOption : getContinentsOptions()) {
            System.out.println("Continent " + continentsOption.getText().trim() +
                    " is at position: " + (continentsCounter + 1));

            continentsCounter++;
        }

        System.out.println();
        System.out.println("Number of all the continents displayed on the Page are: "
                + continentsCounter);
    }

    // Simple logger
    public void printContinentsSelectFirstSelectedOption() {
        System.out.println("Selected option in Dropdown using Visible text is: " +
                continentsSelect.getFirstSelectedOption().getText().trim());
    }
}