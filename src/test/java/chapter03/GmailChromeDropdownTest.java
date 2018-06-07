package chapter03;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class GmailChromeDropdownTest {

    private WebDriver driver;

    @Before
    public void setUp() {
        // Setting up Browser Desired Capabilities
        System.setProperty("webdriver.chrome.driver",
                "./src/test/resources/drivers/chromedriver.exe");

        // Launch a new Chrome instance
        System.out.println("Starting driver...");

        driver = new ChromeDriver();

        System.out.println("Started driver.");

        // Maximize the browser window
        driver.manage().window().maximize();
        // Navigate to Google
        driver.get("https://www.google.com/gmail/about/#");
    }

    private void getAllLanguageOptionsOnTheWeb() {
        //Get all the languages displayed on the Page
        List<WebElement> languagesOptions = driver.findElements(By.cssSelector(".language option"));

        //Iterate though the list of languages and count each language
        for (WebElement languagesOption : languagesOptions) {
            if (languagesOption != null) {
                System.out.print("\"" + languagesOption.getText().trim() + "\"" + ", ");
            }
        }
    }

    @Test
    public void testDropdownLanguages() {
        // Get the Dropdown as a Select
        Select languages = new Select(driver.findElement(By.cssSelector(".language")));
        // Verify Dropdown does not support multiple selection
        assertFalse(languages.isMultiple());
        //Get all the languages displayed on the Page
        List<WebElement> languagesOptions = driver.findElements(By.cssSelector(".language option"));

        int languagesCounter = 0;

        //Iterate though the list of languages and count each language
        for (WebElement languagesOption : languagesOptions) {
            System.out.println("Number of the language is: "
                    + (languagesCounter + 1));

            System.out.println(languagesOption.getText().trim());

            languagesCounter++;
        }

        // Verify Dropdown has many options for selection
        assertEquals("Verify Dropdown has many options for selection",
                62, languagesOptions.size());

        System.out.println();
        System.out.println("Number of all the languages displayed on the Page are: "
                + languagesCounter);

        System.out.println();
        System.out.println("Test passed.");
    }

    @Test
    public void testAnOptionIsSelectedInDropdownLanguages() {
        // Get the Dropdown as a Select
        Select languages = new Select(driver.findElement(By.cssSelector(".language")));
        // With Select class we can select an option in Dropdown using Visible text
        languages.selectByVisibleText("English (United States)");

        System.out.println("Selected option in Dropdown using Visible text is: " +
                languages.getFirstSelectedOption().getText().trim());

        assertEquals("English (United States)",
                languages.getFirstSelectedOption().getText().trim());

        System.out.println();
        System.out.println("Test passed.");
    }

    @Test
    public void testAnOptionsAreContainedInDropdownLanguages() {
        // Get the Dropdown as a Select
        Select languages = new Select(driver.findElement(By.cssSelector(".language")));
        // Verify Dropdown has expected values as listed in array
        List<String> expectedOptions = Arrays.asList("አማርኛ", "العربية", "azərbaycan dili",
                "български", "বাংলা", "català", "čeština", "dansk", "Deutsch", "Ελληνικά",
                "English (United Kingdom)", "English (India)", "English (United States)",
                "español", "español (Latinoamérica)", "eesti", "euskara", "فارسی", "suomi", "Filipino",
                "français", "galego", "ગુજરાતી", "עברית (ישראל)", "हिन्दी", "hrvatski", "magyar", "Indonesia",
                "íslenska", "italiano", "日本語", "ខ្មែរ", "ಕನ್ನಡ", "한국어", "lietuvių", "latviešu", "മലയാളം",
                "मराठी", "Bahasa Melayu", "ဗမာ", "norsk bokmål", "Nederlands", "polski", "português (Brasil)",
                "português (Portugal)", "română", "русский", "slovenčina", "slovenščina", "српски", "svenska",
                "Kiswahili", "தமிழ்", "తెలుగు", "ไทย", "Türkçe", "українська", "اردو", "Tiếng Việt",
                "中文 (简体, 中国)", "中文 (繁體字, 中華人民共和國香港特別行政區)", "中文 (繁體, 台灣)"
        );

        List<String> actualOptions = new ArrayList<String>();

        // Retrieve the option values from Dropdown using getOptions() method
        List<WebElement> options = languages.getOptions();

        for (WebElement option : options) {
            actualOptions.add(option.getText().trim());
        }

        // Verify expected options array and actual options array match
        assertArrayEquals(expectedOptions.toArray(), actualOptions.
                toArray());

        System.out.println();
        System.out.println("Test passed.");
    }

    @After
    public void tearDown() {
        // Close the browser
        driver.quit();
    }
}
