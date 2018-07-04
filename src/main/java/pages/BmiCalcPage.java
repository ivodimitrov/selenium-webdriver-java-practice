package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BmiCalcPage extends Page {

    public BmiCalcPage(WebDriver webDriver) {
        super(webDriver);
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

//    public void setHeight(String height) {
//        heightInput.clear();
//        heightInput.sendKeys(height);
//    }
//
//    public void setWeight(String weight) {
//        weightInput.clear();
//        weightInput.sendKeys(weight);
//    }

    public void calculateBmi(String height, String weight) {
        heightInput.clear();
        heightInput.sendKeys(height);

        weightInput.clear();
        weightInput.sendKeys(weight);

        calculateButton.click();
    }

    public String getBmi() {
        return bmiInput.getAttribute("value");
    }

    public String getBmiCategory() {
        return bmiCategoryInput.getAttribute("value");
    }
}
