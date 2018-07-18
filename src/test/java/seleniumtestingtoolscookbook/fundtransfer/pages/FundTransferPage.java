package seleniumtestingtoolscookbook.fundtransfer.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import seleniumtestingtoolscookbook.fundtransfer.utils.DriverFactory;

import static org.junit.Assert.assertEquals;

public class FundTransferPage extends DriverFactory {

    @FindBy(id = "payee")
    private WebElement payeeField;

    @FindBy(id = "amount")
    private WebElement amountField;

    @FindBy(id = "transfer")
    private WebElement transferButton;

    @FindBy(id = "message")
    private WebElement messageLabel;

    public FundTransferPage() {
        PageFactory.initElements(driver, this);
    }

    public void goToPage() {
        driver.get("http://cookbook.seleniumacademy.com/fundTransfer.html");
    }

    public void verifyPageIsDisplayed() {
        waitVar.until(ExpectedConditions.titleContains("Online Fund Transfers"));
        assertEquals("This is not Fund Transfer Page!",
                "Online Fund Transfers", driver.getTitle());
        // Simple Logger
        System.out.println("Page Title is: " + driver.getTitle());
    }

    public void enterPayeeName(String payeeName) {
        waitVar.until(ExpectedConditions.visibilityOf(payeeField));
        payeeField.sendKeys(payeeName);
    }

    public void enterAmount(String amount) {
        amountField.sendKeys(amount);
    }

    public void clickTransferButton() {
        transferButton.click();
    }

    public String getMessageText() {
        // Simple Logger
        System.out.println();
        System.out.println("Message text is: " + messageLabel.getText() + ".");
        return messageLabel.getText();
    }
}
