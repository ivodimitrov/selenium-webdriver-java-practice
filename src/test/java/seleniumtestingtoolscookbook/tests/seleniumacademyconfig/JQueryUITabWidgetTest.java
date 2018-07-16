package seleniumtestingtoolscookbook.tests.seleniumacademyconfig;

import org.junit.Test;
import seleniumtestingtoolscookbook.pages.SeleniumAcademyConfigPage;

import static org.junit.Assert.assertEquals;

public class JQueryUITabWidgetTest extends SeleniumAcademyConfigBaseTest {

    @Test
    public void testjQueryUITabWidget() {

        SeleniumAcademyConfigPage seleniumAcademyConfigPage =
                super.initLoad();

        // Simple logger
        seleniumAcademyConfigPage.printTabsNames();

        // Verify Tab Widget has 3 Tabs
        assertEquals(3, seleniumAcademyConfigPage
                .getTabsCount());

        // Verify Configure Tab is selected
        assertEquals("Configure", seleniumAcademyConfigPage
                .getSelectedTabText());

        // Select Your Details Tab and verify it is selected
        seleniumAcademyConfigPage
                .selectTab("Your Details");
        assertEquals("Your Details", seleniumAcademyConfigPage
                .getSelectedTabText());

        // Select Payment Tab and verify it is selected
        seleniumAcademyConfigPage
                .selectTab("Payment");
        assertEquals("Payment", seleniumAcademyConfigPage
                .getSelectedTabText());

        // Select Home Tab and verify it is selected
        seleniumAcademyConfigPage
                .selectTab("Configure");
        assertEquals("Configure", seleniumAcademyConfigPage
                .getSelectedTabText());
    }
}
