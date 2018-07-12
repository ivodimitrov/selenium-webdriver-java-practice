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
        seleniumAcademyConfigPage.printTabNames();

        // Verify Tab Widget has 3 Tabs
        assertEquals(3, seleniumAcademyConfigPage
                .getTab().getTabCount());

        // Verify Configure Tab is selected
        assertEquals("Configure", seleniumAcademyConfigPage.
                getTab().getSelectedTab());

        // Select Your Details Tab and verify it is selected
        seleniumAcademyConfigPage.getTab().selectTab("Your Details");
        assertEquals("Your Details", seleniumAcademyConfigPage
                .getTab().getSelectedTab());

        // Select Payment Tab and verify it is selected
        seleniumAcademyConfigPage.getTab().selectTab("Payment");
        assertEquals("Payment", seleniumAcademyConfigPage
                .getTab().getSelectedTab());

        // Select Home Tab
        seleniumAcademyConfigPage.getTab().selectTab("Configure");
        assertEquals("Configure", seleniumAcademyConfigPage.
                getTab().getSelectedTab());
    }
}
