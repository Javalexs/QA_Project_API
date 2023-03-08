# Дипломный проект по автоматизации тестирования API для сайта: [reqres.in](https://reqres.in/)

##	Содержание

- [Технологии и инструменты](#technologist-технологии-и-инструменты)
- [Реализованныe проверки](#bookmark_tabs-реализованные-проверки)
- [Запуск тестов из терминала](#computer-запуск-тестов-из-терминала)
- [Запуск тестов в Jenkins](#-запуск-тестов-в-jenkins)
- [Отчет о результатах тестирования в Allure Report](#-отчет-о-результатах-тестирования-в-Allure-report)
- [Интеграция с Allure TestOps](#-интеграция-с-allure-testops)
- [Уведомления в Telegram с использованием бота](#-уведомления-в-telegram-с-использованием-бота)


### :technologist: Технологии и инструменты


<code><img width="5%" title="Allure Report" src="images/icons/Allure.svg"></code>
<code><img width="5%" title="IntelliJ IDEA" src="images/icons/Idea.svg"></code>
<code><img width="5%" title="Junit5" src="images/icons/Junit5.svg"></code>
<code><img width="5%" title="Java" src="images/icons/Java.svg"></code>
<code><img width="5%" title="Jenkins" src="images/icons/Jenkins.svg"></code>
<code><img width="5%" title="Selenoid" src="images/icons/RestAssured.svg"></code>
<code><img width="5%" title="Gradle" src="images/icons/Gradle.svg"  /></code>
<code><img width="5%" title="Allure TestOps" src="images/icons/Allure_TO.svg"></code>
<code><img width="5%" title="GitHub" src="images/icons/GitHub.svg"></code>


## :bookmark_tabs: Реализованные проверки:

- Успешная регистрация
- Успешная авторизация
- Создание нового пользователя
- Проверка email, при помощи Groovy
- Неуспешная авторизация
- Обновление данных пользователя
- Поиск пользователя

## :computer: Запуск тестов из терминала

### Локальный запуск тестов

```bash
gradle clean test
```

## Запуск тестов в <img width="4%" title="Allure TestOPS" src="images/icons/Jenkins.svg">[Jenkins](https://jenkins.autotests.cloud/job/QA_Project_API/)

Для запуска сборки необходимо нажать кнопку <code><strong>*Собрать сейчас*</strong></code>.

<p align="center">
  <img src="images/screen/AllureSborka.jpg" alt="Jenkins" width="800">
</p>

После выполнения сборки, в блоке <code><strong>*История сборок*</strong></code> напротив номера сборки появится
значок *Allure TestOps и Allure Report*, кликнув по которым, откроется соответствующая страница с html-отчетом. 

## Отчет о результатах тестирования в <img width="4%" title="Allure TestOPS" src="images/icons/Allure.svg">[Allure Report](https://jenkins.autotests.cloud/job/QA_Project_API/3/allure/)

<p align="center">
  <img src="images/screen/AllureAPIMain.jpg" alt="allure-report1" width="900">
</p>

<p align="center">
  <img src="images/screen/AllureAPI.jpg" alt="allure-report" width="900">
</p>

##  Интеграция с <img width="4%" title="Allure TestOPS" src="images/icons/Allure_TO.svg"> [Allure TestOps](https://allure.autotests.cloud/launch/20054)

### Основной дашборд

<p align="center">
  <img src="images/screen/AllureopsMainAPI.jpg" alt="dashboard" width="900">
</p>

### Список тестов с результатами прогона

<p align="center">
  <img src="images/screen/AllureOPSAPI.jpg" alt="dashboard" width="900">
</p>


## <img width="4%" title="Telegram" src="images/logo/Telegram.svg"> Уведомления в Telegram с использованием бота
После завершения сборки специальный бот, созданный в <code>Telegram</code>, автоматически обрабатывает и отправляет сообщение с отчетом о прогоне тестов.

<p align="center">
<img title="Telegram Notifications" src="images/screen/APItELEGRAM.jpg">