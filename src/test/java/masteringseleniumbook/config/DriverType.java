package masteringseleniumbook.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;

import java.util.Arrays;
import java.util.HashMap;

public enum DriverType implements DriverSetup {

    FIREFOX {
        public DesiredCapabilities getDesiredCapabilities() {
            return DesiredCapabilities.firefox();
        }

        public WebDriver getWebDriverObject(DesiredCapabilities
                                                    capabilities) {
            return new FirefoxDriver(capabilities);
        }
    },
    CHROME {
        public DesiredCapabilities getDesiredCapabilities() {
            DesiredCapabilities capabilities =
                    DesiredCapabilities.chrome();
            capabilities.setCapability("chrome.switches",
                    Arrays.asList("--no-default-browser-check"));
            HashMap<String, String> chromePreferences =
                    new HashMap<>();
            chromePreferences.put(
                    "profile.password_manager_enabled", "false");
            capabilities.setCapability("chrome.prefs", chromePreferences);
            return capabilities;
        }

        public WebDriver getWebDriverObject(DesiredCapabilities
                                                    capabilities) {
            return new ChromeDriver(capabilities);
        }
    },
    IE {
        public DesiredCapabilities getDesiredCapabilities() {
            DesiredCapabilities capabilities =
                    DesiredCapabilities.internetExplorer();
            capabilities.setCapability(CapabilityType.
                    ForSeleniumServer.ENSURING_CLEAN_SESSION, true);
            capabilities.setCapability(InternetExplorerDriver.
                    ENABLE_PERSISTENT_HOVERING, true);
            capabilities.setCapability("requireWindowFocus",
                    true);
            return capabilities;
        }

        public WebDriver getWebDriverObject(DesiredCapabilities
                                                    capabilities) {
            return new InternetExplorerDriver(capabilities);
        }
    },
    SAFARI {
        public DesiredCapabilities getDesiredCapabilities() {
            DesiredCapabilities capabilities =
                    DesiredCapabilities.safari();
            capabilities.setCapability("safari.cleanSession",
                    true);
            return capabilities;
        }

        public WebDriver getWebDriverObject(DesiredCapabilities
                                                    capabilities) {
            return new SafariDriver(capabilities);
        }
    },
    OPERA {
        public DesiredCapabilities getDesiredCapabilities() {
            return DesiredCapabilities.operaBlink();
        }

        public WebDriver getWebDriverObject(DesiredCapabilities
                                                    capabilities) {
            return new OperaDriver(capabilities);
        }
    }
}
