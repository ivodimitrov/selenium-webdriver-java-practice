package seleniumtestingtoolscookbook.tests.seleniumacademyhtml5storage;

import org.junit.Test;
import seleniumtestingtoolscookbook.pages.seleniumacademy.SeleniumAcademyHtml5StoragePage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class Html5SessionStorageTest extends SeleniumAcademyHtml5StorageBaseTest {

    @Test
    public void testHTML5SessionStorage() {

        SeleniumAcademyHtml5StoragePage seleniumAcademyHtml5StoragePage =
                super.initLoad();

        assertNull("Current value of sessionStorage.clickcount, is not null",
                seleniumAcademyHtml5StoragePage
                        .getCurrentValueOfSessionStorage());

        assertEquals("Current value of counter is not 0",
                "0", seleniumAcademyHtml5StoragePage
                        .getClicksField().getAttribute("value"));

        seleniumAcademyHtml5StoragePage.clickClickMeButton();

        assertEquals("Current value of sessionStorage.clickcount, is not 1",
                "1", seleniumAcademyHtml5StoragePage
                        .getCurrentValueOfSessionStorage());
        assertEquals("Current value of counter is not 1",
                "1", seleniumAcademyHtml5StoragePage
                        .getClicksField().getAttribute("value"));
    }
}
