package seleniumtestingtoolscookbook.fundtransfer.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertEquals;

public class FundTransferPage {

    public WebDriver driver;

    @FindBy(id = "payee")
    private WebElement payeeField;

    @FindBy(id = "amount")
    private WebElement amountField;

    @FindBy(id = "transfer")
    private WebElement transferButton;

    @FindBy(id = "message")
    private WebElement messageLabel;

    public FundTransferPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void goToPage() {
        driver.get("http://cookbook.seleniumacademy.com/fundTransfer.html");
    }

    public void verifyPageIsDisplayed() {
        assertEquals("This is not Fund Transfer Page!",
                "Online Fund Transfers", driver.getTitle());
        // Simple Logger
        System.out.println("Page Title is: " + driver.getTitle() + ".");
    }

    public void enterPayeeName(String payeeName) {
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
