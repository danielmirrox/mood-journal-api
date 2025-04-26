# mood-journal-api

Простой backend API на базе Spring Boot, позволяющий пользователям записывать и управлять записями о настроении, с использованием современных технологий Java.

## Функционал

- Добавление новых записей о настроении (например, "Happy", "Sad", "Excited")
- Просмотр всех записей о настроении
- Удаление записи по ID
- Легко расширяемый для добавления новых функций, таких как аутентификация или фронтенд

## Технологии

- Java 17+
- Spring Boot 3
- Maven
- Архитектура RESTful

## Использование
+ **Построить проект**:
    ```bash
    mvn clean install
    ```

+ **Запустить приложение**:
    ```bash
    mvn spring-boot:run
    ```

+ **Протестируйте в любом браузере**:
  - `GET http://localhost:8080/ping` → проверить соединение
  - `GET http://localhost:8080/api/moods` → список всех записей
  - `POST http://localhost:8080/api/moods` → создать новую запись (JSON)
  - `DELETE http://localhost:8080/api/moods/{id}` → удалить запись

## Пример запроса

```http
POST /api/moods
Content-Type: application/json

{
  "date": "2025-04-24",
  "mood": "Motivated"
}
```
## Пример ответа
```http
{
  "id": "123e4567-e89b-12d3-a456-426614174000",
  "date": "2025-04-24",
  "mood": "Motivated"
}
```
## Структура
```html
mood-journal-api/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── moodjournal/
│   │   │           ├── controller/
│   │   │           │   └── MoodController.java
│   │   │           ├── model/
│   │   │           │   ├── Mood.java
│   │   │           │   └── MoodEntry.java
│   │   │           ├── service/
│   │   │           │   └── MoodService.java
│   │   │           └── MoodJournalApiApplication.java
│   │   ├── .gitignore
│   │   └── pom.xml
└── README.md```
