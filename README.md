# Incident Control Center
Стек 

Java 17

Spring Boot

Spring Web

Spring Data JPA

PostgreSQL

MapStruct

Lombok

Hibernate

SLF4J + Logback

JUnit 5

Docker (опционально)


Backend-сервис для централизованного управления инцидентами в распределённых системах.

##  Функциональность
- Регистрация инцидентов от внешних сервисов
- Управление статусами инцидентов
- Получение списка и статистики
- REST API

##  Технологии
- Java 17
- Spring Boot
- Spring Data JPA
- PostgreSQL
- MapStruct
- Lombok

##  Архитектура
Layered Architecture:
- Controller
- Service
- Repository
- DTO / Mapper

##  API

### Создать инцидент
POST /api/v1/incidents

### Получить все инциденты
GET /api/v1/incidents

### Обновить статус
PUT /api/v1/incidents/{id}/status

##  Командная работа
- Scrum
- GitFlow
- Pull Requests
- Code Review

##  Запуск
```bash
mvn spring-boot:run
