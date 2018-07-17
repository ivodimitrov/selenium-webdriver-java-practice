package seleniumtestingtoolscookbook.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

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

}
