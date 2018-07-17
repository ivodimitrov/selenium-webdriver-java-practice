package seleniumtestingtoolscookbook.tests.seleniumacademyhtml5video;

import org.junit.Test;
import seleniumtestingtoolscookbook.pages.SeleniumAcademyHtml5VideoPage;

import static org.junit.Assert.assertEquals;

public class HTML5VideoPlayerTest extends SeleniumAcademyHtml5VideoBaseTest {

    @Test
    public void testHTML5VideoPlayer() {

        SeleniumAcademyHtml5VideoPage seleniumAcademyHtml5VideoPage = super.initLoad();

        seleniumAcademyHtml5VideoPage.printVideoPlayerSource();
        assertEquals("Video is not loaded!", "http://html5demos.com/assets/dizzy.mp4",
                seleniumAcademyHtml5VideoPage.getSource());

        seleniumAcademyHtml5VideoPage.printVideoPlayerDuration();
        assertEquals("Video duration is not correct!", 25,
                seleniumAcademyHtml5VideoPage.getDuration());
    }
}
