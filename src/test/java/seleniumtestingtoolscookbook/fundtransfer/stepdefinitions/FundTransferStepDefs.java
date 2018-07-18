package seleniumtestingtoolscookbook.fundtransfer.stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import seleniumtestingtoolscookbook.fundtransfer.pages.FundTransferPage;

import static java.lang.Thread.sleep;
import static org.junit.Assert.assertEquals;

public class FundTransferStepDefs {

    private FundTransferPage fundTransferPage = new FundTransferPage();

    @Given("the user is on Fund Transfer Page")
    public void theUserIsOnFundTransferPage() {
        fundTransferPage.goToPage();
        fundTransferPage.verifyPageIsDisplayed();
    }

    @When("he enters \"([^\"]*)\" as payee name")
    public void heEntersPayeeName(String payeeName) {
        // driver.findElement(By.id("payee")).sendKeys(payeeName);
        fundTransferPage.enterPayeeName(payeeName);
    }

    @And("he enters \"([^\"]*)\" as amount")
    public void heEntersAmount(String amount) {
        fundTransferPage.enterAmount(amount);
    }

    @And("he submits request for Fund Transfer")
    public void heSubmitsRequestForFundTransfer() throws InterruptedException {
        fundTransferPage.clickTransferButton();
        sleep(500);
    }

    @Then("ensure the fund transfer is complete with \"([^\"]*)\" message")
    public void ensureTheFundTransferIsComplete(String msg) {
        assertEquals("Message does not match!",
                fundTransferPage.getMessageText(),
                msg);
    }

    @Then("^ensure a transaction failure \"([^\"]*)\" is displayed$")
    public void ensureATransactionFailureMessage(String msg) {
        assertEquals("Message does not match!",
                fundTransferPage.getMessageText(),
                msg);
    }
}
