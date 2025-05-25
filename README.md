# Проект по автоматизации мобильного приложения [Wikipedia](https://www.wikipedia.org/)
____

> Википедия - это свободная, общедоступная, многоязычная универсальная интернет-энциклопедия, созданная на принципах вики. Любой желающий может создавать и редактировать статьи, что делает ее постоянно развивающимся и обновляющимся источником информации

## Содержание:
___

- <a href="#tools">Технологии и инструменты</a>
- <a href="#cases">Примеры автоматизированных тест-кейсов</a>
- <a href="#jenkins">Сборка в Jenkins</a>
- - <a href="#commands">Команды для запуска из терминала</a>
- <a href="#allure">Allure Report</a>
- - <a href="#allure-report">Основная страница отчета</a>
- - <a href="#allure-cases">Тест-кейсы</a>
- <a href="#testops">Интеграция с Allure TestOps</a>
- <a href="#jira">Интеграция с JIRA</a>
- <a href="#telegram">Уведомления в телеграм при помощи бота</a>
___

<a id="tools"></a>
## Технологии и инструменты:
<p align="center">
<a href="https://www.jetbrains.com/idea/"><img src="media/intellij-original.svg" width="50" height="50" /></a>
<a href="https://www.java.com/"><img src="media/java-original.svg" width="50" height="50" /></a>
<a href="https://selenide.org/"><img src="media/Selenide.svg" width="50" height="50" /></a>
<a href="https://junit.org/junit5/"><img src="media/junit-original-wordmark.svg" width="50" height="50" /></a>
<a href="https://github.com/"><img src="media/github-original.svg" width="50" height="50" /></a>
<a href="https://gradle.org/"><img src="media/gradle-original.svg" width="50" height="50" /></a>
<a href="https://www.jenkins.io/"><img src="media/jenkins-original.svg" width="50" height="50" /></a>
<a href="https://allurereport.org/"><img src="media/Allure.svg" width="50" height="50" /></a>
<a href="https://qameta.io/"><img src="media/qameta.svg" width="50" height="50" /></a>
<a href="https://www.atlassian.com/software/jira"><img src="media/Jira.svg" width="50" height="50" /></a>
<a href="https://appium.io/"><img src="media/appium.png" width="50" height="50" /></a>
<a href="https://www.browserstack.com"><img src="media/browserstack.jpeg" width="50" height="50" /></a>
<a href="https://developer.android.com/studio"><img src="media/AndroidStudio.png" width="50" height="50" /></a>
</p>

<a id="cases"></a>
## Примеры автоматизированных тест-кейсов:
- Проверка работы поиска на главном экране приложения
- Проверка корректного открывания статьи из списка результатов
- Проверка наличие контента в онбординге при первом запуске

<a id="jenkins"></a>
## <img src="media/jenkins-original.svg" width="20" height="20" /> Сборка в [Jenkinks](https://jenkins.autotests.cloud/job/033_undef1ned_0_diploma23_mob/)
<img src="media/jenkins.jpg"/>


<a id="commands"></a>
### Команды для запуска из терминала

Локальный запуск:
```bash
gradle clean local_test -Denv=emulator
gradle clean local_test -Denv=local
```

Удалённый запуск через Jenkins:
```bash
gradle clean remote_test -Denv=browserstack
```

<a id="allure"></a>
## <img src="media/Allure.svg" width="20" height="20" /> Allure Report
___

<a id="allure-report"></a>
### Основная страница отчета
<img src="media/allure-overview.jpg"/>

<a id="allure-cases"></a>
### Тест-кейсы
<img src="media/allure-report.jpg"/>

<a id="testops"></a>
## <img src="media/qameta.svg" width="20" height="20" /> Интеграция с Allure TestOps
<img src="media/allure-testops.jpg"/>

<a id="jira"></a>
## <img src="media/Jira.svg" width="20" height="20" /> Интеграция с JIRA
<img src="media/jira.jpg"/>

<a id="telegram"></a>
## <img src="media/Telegram.svg" width="20" height="20" /> Уведомления в телеграм при помощи бота:
___
<img src="media/telegram-notify.jpg"/>