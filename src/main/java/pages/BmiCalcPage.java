package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BmiCalcPage {

    private WebDriver driver;

    private WebElement heightCMS;
    private WebElement weightKg;
    private WebElement Calculate;
    private WebElement bmi;

    @FindBy(id = "bmi_category")
    private WebElement bmiCategory;

    public BmiCalcPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
