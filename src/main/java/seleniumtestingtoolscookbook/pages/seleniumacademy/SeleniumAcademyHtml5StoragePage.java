package seleniumtestingtoolscookbook.pages.seleniumacademy;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import seleniumtestingtoolscookbook.pages.Page;

public class SeleniumAcademyHtml5StoragePage extends Page {

    private JavascriptExecutor jsExecutor = (JavascriptExecutor) getWebDriver();
    private String lastName;

    public SeleniumAcademyHtml5StoragePage(WebDriver webDriver) {
        super(webDriver);
    }

    public String getCurrentValueOfLocalStorage() {
        return lastName = (String) jsExecutor
                .executeScript("return localStorage.lastname;");
    }

    // Simple Logger
    public void printCurrentValueOfLocalStorage() {
        System.out.println("Current value of localStorage.lastname is " + lastName);
    }

    @FindBy(id = "click")
    private WebElement clickClickMeButton;

    @FindBy(id = "clicks")
    private WebElement clicksField;

    public WebElement getClicksField() {
        return clicksField;
    }

    public String getCurrentValueOfSessionStorage() {
        return (String) jsExecutor
                .executeScript("return sessionStorage.clickcount;");
    }

    public void clickClickMeButton() {
        clickClickMeButton.click();
    }
}
