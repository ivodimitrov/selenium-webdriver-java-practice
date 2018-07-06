package tests.demoqaselectable;

import pages.DemoQaSelectablePage;
import utils.BaseTest;

import static utils.Links.DEMOQA_SELECTABLE_PAGE;

public class DemoQaSelectableBaseTest extends BaseTest {

    DemoQaSelectablePage initLoad() {

        goToPageAndWaitPageToLoad(DEMOQA_SELECTABLE_PAGE);

        return new DemoQaSelectablePage(getWebDriver());
    }
}
