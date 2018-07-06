package tests.demoqadraganddrop;

import pages.DemoQaDragAndDropPage;
import utils.BaseTest;

import static utils.Links.DEMOQA_DRAG_DROP_PAGE;

class DemoQaDragAndDropBaseTest extends BaseTest {

    DemoQaDragAndDropPage initLoad() {

        goToPageAndWaitPageToLoad(DEMOQA_DRAG_DROP_PAGE);

        return new DemoQaDragAndDropPage(getWebDriver());
    }
}
