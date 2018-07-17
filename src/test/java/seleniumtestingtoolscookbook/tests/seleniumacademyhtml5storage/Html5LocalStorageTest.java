package seleniumtestingtoolscookbook.tests.seleniumacademyhtml5storage;

import org.junit.Test;
import seleniumtestingtoolscookbook.pages.seleniumacademy.SeleniumAcademyHtml5StoragePage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class Html5LocalStorageTest extends SeleniumAcademyHtml5StorageBaseTest {

    @Test
    public void testHTML5LocalStorage() {

        SeleniumAcademyHtml5StoragePage seleniumAcademyHtml5StoragePage =
                super.initLoad();

        assertEquals("Current value of localStorage.lastname does not match!",
                "Smith",
                seleniumAcademyHtml5StoragePage.getCurrentValueOfLocalStorage());

        // Simple Logger
        seleniumAcademyHtml5StoragePage.printCurrentValueOfLocalStorage();

        seleniumAcademyHtml5StoragePage.removeLastNameKeyValue();

        assertNull("Current value of localStorage.lastname is not null!",
                seleniumAcademyHtml5StoragePage.getCurrentValueOfLocalStorage());
    }
}
