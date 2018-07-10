package seleniumtestingtoolscookbook.tests.demoqaselectable;

import seleniumtestingtoolscookbook.pages.DemoQaSelectablePage;
import seleniumtestingtoolscookbook.utils.BaseTest;

import static seleniumtestingtoolscookbook.utils.Links.DEMOQA_SELECTABLE_PAGE;

public class DemoQaSelectableBaseTest extends BaseTest {

    protected DemoQaSelectablePage initLoad() {

        goToPageAndWaitPageToLoad(DEMOQA_SELECTABLE_PAGE);

        return new DemoQaSelectablePage(getWebDriver());
    }
}
