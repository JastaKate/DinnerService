# DinnerService

REST-сервис на Java для хранения рецептов ужинов и управления их ингредиентами. Используется Telegram-ботом TgRecipeBot для получения списка блюд

## Возможности

- Создание, просмотр списка, изменение и удаление ужинов
- Добавление, изменение и удаление ингредиентов
- Хранение названия блюда, категории и времени приготовления
- Валидация обязательных полей запросов
- Хранение данных в PostgreSQL и миграции схемы через Liquibase

## Технологии

Java 21, Spring Boot, Spring Data JPA, PostgreSQL, Liquibase, Bean Validation, Lombok, Gradle

## REST API

- `GET /v2/api/dinners` — получить список ужинов с ингредиентами
- `POST /v2/api/dinners` — создать ужин
- `PUT /v2/api/dinners` — обновить ужин, передав его ID в теле запроса
- `DELETE /v2/api/dinners/{id}` — удалить ужин
- `POST /v2/api/ingredients?dinner_id={id}` — добавить ингредиент к ужину
- `PUT /v2/api/ingredients/{id}` — обновить ингредиент
- `DELETE /v2/api/ingredients/{id}` — удалить ингредиент

Пример тела запроса для создания ужина:

```json
{
  "name": "Паста с томатным соусом",
  "category": "Паста",
  "time": "30 минут"
}
```

## Запуск

1. Установить JDK 21 и запустить PostgreSQL
2. Создать базу данных `dinners`
3. Настроить подключение в `src/main/resources/application.yml`. По умолчанию используется адрес `jdbc:postgresql://localhost:5433/dinners`. Указать свои имя пользователя и пароль
4. Запустить приложение

При запуске Liquibase применит миграции базы данных

Сервис доступен по адресу `http://localhost:8091`
