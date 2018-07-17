package seleniumtestingtoolscookbook.tests.demoqadraganddrop;

import seleniumtestingtoolscookbook.pages.demoqa.DemoQaDragAndDropPage;
import seleniumtestingtoolscookbook.utils.BaseTest;

import static seleniumtestingtoolscookbook.utils.Links.DEMOQA_DRAG_DROP_PAGE;

class DemoQaDragAndDropBaseTest extends BaseTest {

    DemoQaDragAndDropPage initLoad() {

        goToPageAndWaitPageToLoad(DEMOQA_DRAG_DROP_PAGE);

        return new DemoQaDragAndDropPage(getWebDriver());
    }
}
