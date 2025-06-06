package screens;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.id;

public class WikipediaOnbordingScreen {
    private final SelenideElement screenTitle = $(id("org.wikipedia.alpha:id/primaryTextView")),
            screenSubtitle = $(id("org.wikipedia.alpha:id/secondaryTextView")),
            forwardButton = $(id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")),
            viewImage = $(id("org.wikipedia.alpha:id/imageViewCentered")),
            finishOnbordingButton = $(id("org.wikipedia.alpha:id/fragment_onboarding_done_button"));

    @Step("Проверяем, что на первом экране онбординга есть основной заголовок")
    public WikipediaOnbordingScreen assertThatMainTitleExist() {
        screenTitle.shouldBe(visible);
        return this;
    }

    @Step("Переходим на следующий экран")
    public WikipediaOnbordingScreen goOnNextScreen() {
        forwardButton.click();
        return this;
    }

    @Step("Проверяем, что на экране показывается изображение")
    public WikipediaOnbordingScreen assertThatImageExists() {
        viewImage.shouldBe(visible);
        return this;
    }

    @Step("Проверяем, что на экране есть подзаголовок")
    public WikipediaOnbordingScreen assertThatSubtitleExists() {
        screenSubtitle.shouldBe(visible);
        return this;
    }

    @Step("Проверяем, на финальном шаге есть кнопка завершения онбординга")
    public WikipediaOnbordingScreen assertThatButtonFinishOnbordingExists() {
        finishOnbordingButton.shouldBe(visible);
        return this;
    }
}
