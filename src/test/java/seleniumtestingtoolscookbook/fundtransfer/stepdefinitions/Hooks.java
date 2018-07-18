package seleniumtestingtoolscookbook.fundtransfer.stepdefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import seleniumtestingtoolscookbook.fundtransfer.utils.DriverFactory;

public class Hooks {

    private DriverFactory driverFactory = new DriverFactory();

    @Before
    public void beforeScenario() {
        driverFactory.setUp();
    }

    @After
    public void afterScenario() {
        driverFactory.tearDown();
    }
}
