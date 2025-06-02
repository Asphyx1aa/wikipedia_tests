package tests;

import io.qameta.allure.Severity;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import screens.WikipediaOnbordingScreen;
import screens.WikipediaSearchScreen;

import static io.qameta.allure.SeverityLevel.CRITICAL;
import static io.qameta.allure.SeverityLevel.NORMAL;

public class WikipediaTests extends TestBase {
    final WikipediaSearchScreen wikipediaSearchScreen = new WikipediaSearchScreen();
    final WikipediaOnbordingScreen wikipediaOnbordingScreen = new WikipediaOnbordingScreen();

    @Test
    @Tag("browserstack")
    @Severity(CRITICAL)
    @DisplayName("Проверка работы поиска на главном экране приложения")
    void searchOnMainScreenTest() {
        String searchQuery = "Appium";

        wikipediaSearchScreen.clickOnSearch()
                .sendSearchQuery(searchQuery)
                .checkResults();
    }

    @Test
    @Tag("browserstack")
    @Severity(CRITICAL)
    @DisplayName("Проверка корректного открывания статьи из списка результатов")
    void openArticleFromTheResultList() {
        String searchQuery = "Android";

        wikipediaSearchScreen.clickOnSearch()
                .sendSearchQuery(searchQuery)
                .openArticle()
                .verifyNameOfArticle();
    }

    @Test
    @Tag("local")
    @Tag("emulator")
    @Severity(NORMAL)
    @DisplayName("Проверяем наличие контента в онбординге при первом запуске")
    void verifyThatAllContentExists() {
        wikipediaOnbordingScreen.assertThatMainTitleExist()
                .goOnNextScreen()
                .assertThatImageExists()
                .goOnNextScreen()
                .assertThatSubtitleExists()
                .goOnNextScreen()
                .assertThatButtonFinishOnbordingExists();
    }
}


