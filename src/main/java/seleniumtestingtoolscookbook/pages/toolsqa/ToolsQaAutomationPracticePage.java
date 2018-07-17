package seleniumtestingtoolscookbook.pages.toolsqa;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import seleniumtestingtoolscookbook.pages.Page;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.fail;

public class ToolsQaAutomationPracticePage extends Page {
    @FindBy(css = "#profession-0")
    private WebElement professionManualTesterCheckBox;
    @FindBy(css = "#continents")
    private WebElement continents;
    @FindBy(css = "#continents option")
    private List<WebElement> continentsOptions;
    @FindBy(tagName = "a")
    private List<WebElement> links;
    @FindBy(css = "div.control-group:nth-child(5) > a:nth-child(1)")
    private WebElement partialLink;
    @FindBy(css = "div.control-group:nth-child(11)")
    private WebElement firstNameElementText;
    // Radio Button as WebElement
    @FindBy(xpath = "//*[@id=\"exp-0\"]")
    private WebElement yearsOfExperience;
    @FindBy(css = "div.control-group:nth-child(23)")
    private List<WebElement> yearsOfExperienceRadioButtons;
    private WebDriverWait wait = new WebDriverWait(getWebDriver(), 10);
    private JavascriptExecutor js = (JavascriptExecutor) getWebDriver();
    // Dropdown expected values in array
    private List<String> expectedOptions = Arrays.asList("Asia", "Europe",
            "Africa", "Australia", "South America", "North America", "Antartica");
    // Dropdown actual options
    private List<String> actualOptions = new ArrayList<>();
    @SuppressWarnings("ConstantConditions")
    private Select continentsSelect = new Select(continents);
    private String pageTitle = (String) js.executeScript("return document.title");
    private long jsLinks = (Long) js
            .executeScript(
                    "var links = document.getElementsByTagName('A'); return links.length");

    public ToolsQaAutomationPracticePage(WebDriver webDriver) {
        super(webDriver);
    }
    // Get the Dropdown as a Select

    //Get all the links displayed on the Page
    public List<WebElement> getLinks() {
        return links;
    }

    // Get the First name Element
    public String getFirstNameElementText() {
        return firstNameElementText.getText();
    }

    // Get the Partial Link Test Element
    public WebElement getPartialLink() {
        return partialLink;
    }

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

        wait.until(ExpectedConditions.elementToBeSelected(professionManualTesterCheckBox));
    }

    public void getActualContinentsSelectOptions() {

        List<WebElement> continentsSelectOptions = continentsSelect.getOptions();

        for (WebElement option : continentsSelectOptions) {
            actualOptions.add(option.getText().trim());
        }
    }

    public void doesProfessionalTesterCheckBoxExist() {
        if (isElementProfessionalManualTesterCheckBoxPresent()) {
            selectCheckBox();
        } else {
            fail("Profession Manual tester Checkbox doesn't exists!!");
        }
    }

    // Get all the Radio buttons from a Radio Group in a list
    public List<WebElement> getYearsOfExperienceRadioButtons() {
        return yearsOfExperienceRadioButtons;
    }

    public WebElement getYearsOfExperience() {
        return yearsOfExperience;
    }

    private boolean isElementProfessionalManualTesterCheckBoxPresent() {
        try {
            getProfessionManualTesterCheckBox().isDisplayed();
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public String getPageTitle() {
        return pageTitle;
    }

    public long getJsLinks() {
        return jsLinks;
    }

    // select Radio Button
    public void selectYearsOfExperienceRadioButton() {
        // Check if its already selected? otherwise select the Radio Button
        // by calling click() method
        if (!yearsOfExperience.isSelected()) {
            yearsOfExperience.click();
        }

        wait.until(ExpectedConditions.elementToBeSelected(yearsOfExperience));
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

    // Simple logger
    public void printFirstNameElementText() {
        System.out.println("Element's text is: " + getFirstNameElementText());
    }

    // Simple logger
    public void printLinks() {

        int linksCounter = 0;

        // Iterate though the list of links and print target for each link
        for (WebElement link : links) {
            System.out.println("Link displayed on the page is number: " + (linksCounter + 1));

            System.out.println(link.getAttribute("href"));

            linksCounter++;
        }
        // Verify there are many links displayed on the page
        System.out.println();
        System.out.println("Numbers of links displayed on the page are: " + links.size());
    }
}
