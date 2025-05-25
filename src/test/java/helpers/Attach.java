package helpers;

import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class Attach {
    @Attachment(value = "{attachName}", type = "image/png")
    public static void screenshotAs(String attachName) {
        ((TakesScreenshot) getWebDriver()).getScreenshotAs(OutputType.BYTES);
    }

    @Attachment(value = "Page source", type = "text/plain")
    public static void pageSource() {
        getWebDriver().getPageSource();
    }

    @Attachment(value = "{attachName}", type = "text/plain")
    public static String attachAsText(String attachName, String message) {
        return message;
    }

    @Attachment(value = "Video", type = "text/html", fileExtension = ".html")
    public static void addVideo(String sessionId) {
        BrowserStack.videoUrl(sessionId);
    }
}