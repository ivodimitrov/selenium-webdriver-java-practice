package masteringseleniumbook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverThread {

    private final String operatingSystem =
            System.getProperty("os.name").toUpperCase();
    private final String systemArchitecture =
            System.getProperty("os.arch");
    private WebDriver webdriver;

    public WebDriver getDriver() {
        if (null == webdriver) {
            System.out.println(" ");
            System.out.println("Current Operating System: " +
                    operatingSystem);
            System.out.println("Current Architecture: " +
                    systemArchitecture);
            System.out.println(" ");

//            FirefoxOptions firefoxOptions = new FirefoxOptions();
//            firefoxOptions.setCapability("marionette", true);
//            webdriver = new FirefoxDriver(firefoxOptions);

//            System.setProperty("webdriver.gecko.driver",
//                    "./src/test/resources/drivers/geckodriver");

//            webdriver = new FirefoxDriver();

            webdriver = new ChromeDriver();
            // webdriver = new SafariDriver();

            System.out.println("Current Browser Selection: " +
                    webdriver);
            System.out.println(" ");
        }
        return webdriver;
    }

    void quitDriver() {
        if (null != webdriver) {
            webdriver.quit();
            webdriver = null;
        }
    }
}
