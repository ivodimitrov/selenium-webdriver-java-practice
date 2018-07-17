package seleniumtestingtoolscookbook.pages.seleniumacademy;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import seleniumtestingtoolscookbook.pages.Page;

import static java.lang.Thread.sleep;

public class SeleniumAcademyHtml5VideoPage extends Page {

    @FindBy(id = "vplayer")
    private WebElement videoPlayer;

    // JavaScript Executor for interacting with Video Element's methods
    // and properties
    private JavascriptExecutor jsExecutor = (JavascriptExecutor) getWebDriver();
    // Get the Source of Video that will be played in Video Player
    @SuppressWarnings("ConstantConditions")
    private String source = (String) jsExecutor
            .executeScript("return arguments[0].currentSrc;",
                    videoPlayer);

    // Get the Duration of Video
    private long duration = (Long) jsExecutor
            .executeScript("return arguments[0].duration", videoPlayer);

    public SeleniumAcademyHtml5VideoPage(WebDriver webDriver) {
        super(webDriver);
    }

    public String getSource() {
        return source;
    }

    public void printVideoPlayerSource() {
        System.out.println("Video Player source is: " + source);
    }

    public long getDuration() {
        return duration;
    }

    public void printVideoPlayerDuration() {
        System.out.println("Video duration is: " + duration);
    }

    public void playVideo() throws InterruptedException {
        jsExecutor
                .executeScript("return arguments[0].play()",
                        videoPlayer);
        sleep(5000);
    }

    public void pauseVideo() {
        jsExecutor
                .executeScript("arguments[0].pause()", videoPlayer);
    }
}
