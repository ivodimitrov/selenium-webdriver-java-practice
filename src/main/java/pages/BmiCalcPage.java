package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BmiCalcPage extends Page {

    public BmiCalcPage(WebDriver driver) {
        super(driver);
    }

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
