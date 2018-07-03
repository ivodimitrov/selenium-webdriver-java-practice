package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BmiCalcPage {

    private WebDriver driver;

    @FindBy(id = "heightCMS")
    private WebElement heightInput;

    @FindBy(id = "weightKg")
    private WebElement weightInput;

    @FindBy(id = "Calculate")
    private WebElement calculateButton;

    @FindBy(id = "bmi")
    private WebElement bmiInput;

    @FindBy(id = "bmi_category")
    private WebElement bmiCategoryInput;

    public BmiCalcPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setHeight(String height) {
        heightInput.clear();
        heightInput.sendKeys(height);
    }

    public void setWeight(String weight) {
        weightInput.clear();
        weightInput.sendKeys(weight);
    }

    public void calculateBmi() {
        calculateButton.click();
    }

    public String getBmi() {
        return bmiInput.getAttribute("value");
    }

    public String getBmiCategory() {
        return bmiCategoryInput.getAttribute("value");
    }
}
