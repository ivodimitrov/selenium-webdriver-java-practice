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
                .getjQueryUITab().getTabCount());

        // Verify Configure Tab is selected
        assertEquals("Configure", seleniumAcademyConfigPage.
                getjQueryUITab().getSelectedTab());

        // Select Your Details Tab and verify it is selected
        seleniumAcademyConfigPage.getjQueryUITab().selectTab("Your Details");
        assertEquals("Your Details", seleniumAcademyConfigPage
                .getjQueryUITab().getSelectedTab());

        // Select Payment Tab and verify it is selected
        seleniumAcademyConfigPage.getjQueryUITab().selectTab("Payment");
        assertEquals("Payment", seleniumAcademyConfigPage
                .getjQueryUITab().getSelectedTab());

        // Select Home Tab
        seleniumAcademyConfigPage.getjQueryUITab().selectTab("Configure");
        assertEquals("Configure", seleniumAcademyConfigPage.
                getjQueryUITab().getSelectedTab());
    }
}
