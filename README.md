# Spring Boot REST Template Example

![CircleCI](https://img.shields.io/circleci/build/github/fitraalim/spring-boot-rest-template-example/master?style=for-the-badge) ![Docker Image Size (tag)](https://img.shields.io/docker/image-size/fitraalim/spring-boot-rest-template-example/latest?style=for-the-badge)  ![Docker Pulls](https://img.shields.io/docker/pulls/fitraalim/spring-boot-rest-template-example?style=for-the-badge) ![GitHub last commit (branch)](https://img.shields.io/github/last-commit/fitraalim/spring-boot-rest-template-example/master?style=for-the-badge)

Example of Spring Boot application that consumes REST API. In this example, the application consumes fake REST API from JSONPlaceholder (https://jsonplaceholder.typicode.com). JSONPlaceholder has 6 common resources that can be used. Here, I am using ```/comments``` resource.

## Resource

Refer to ```application.properties``` if you want to change the resource.

```
jsonplaceholder.url = https://jsonplaceholder.typicode.com/comments/
```

You may need to adjust ```Comment.java```.

## Instruction

To try the application:

```
git clone git@github.com:fitraalim/spring-boot-rest-template-example.git
cd spring-boot-rest-template-example
mvn spring-boot:run
```

The application runs on port 8080.

To list all comments returned by JSONPlaceholder:

```
curl http://localhost:8080/comments
```

The output should be formatted nicely because pretty JSON is configured in ```application.properties```

```
spring.jackson.serialization.indent_output = true
```

To list comment by its ``id``:

```
curl http://localhost:8080/comments/{id}
```

## Limitation

This application only do GET operation.
