# Технологии разработки программного обеспечения
## Лабораторная работа №1: создание микросервиса на Spring Boot с базой данных
Выполнил: студент группы МБД2131 **Уланов М.З.** <br>
Целью лабораторной работы является знакомство с проектированием многослойной архитектуры Web-API (веб-приложений, микро-сервисов).



## Инструкции по сборке и запуску приложения
##### 1. Склонировать репозиторий

`$ git clone https://github.com/Septent/LR-1`

##### 2. Команда для сборки приложения в Maven из командной строки.

`$ mvnw package`

##### 3. Команда для сборки docker-образа из командной строки.

`$ docker build . -t myapi:latest`

##### 4. Команда для запуска docker-контейнера из docker-образа с указанием маппинга портов.

`$ docker run -p 5433:5433 myapi:latest`

##### 5. 4 curl для обращения к ендпоинтам приложения.

- Получение записи из базы данных по id

`GET` `http://localhost:8080/api/v1/product/7`

- Запись в базу данных нового продукта

`POST` `http://localhost:8080/api/v1/product/`

JSON: `{"title": "Don Quixote", "author": "Miguel de Cervantes", "genre": "Novel", "language": "Spanish" , "price": 950, "quantity": 535 }`

- Изменение параметров продукта в базе данных по id

`PUT` `http://localhost:8080/api/v1/product/8`

JSON: `{"title": "Don Quixote", "author": "Miguel de Cervantes", "genre": "Novel", "language": "Spanish" , "price": 850, "quantity": 433 }`

- Удаление записи из базы данных по id

`DELETE` `http://localhost:8080/api/v1/product/8`

##### 6. curl для обращения к ендпоинту, возвращающему hostname.

`GET` `http://localhost:8080/api/v1/status`
