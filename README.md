# Library 
> written in *Hexagonal (Ports & Adapters) Architecture*

![Main Branch](https://github.com/nusmanov/library-hexagonal-minimlal/workflows/Main%20Branch/badge.svg?branch=main) [![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=nusmanov_library-hexagonal-minimal&metric=alert_status)](https://sonarcloud.io/dashboard?id=nusmanov_library-hexagonal-minimmal) [![Coverage](https://sonarcloud.io/api/project_badges/measure?project=nusmanov_library-hexagonal-minimal&metric=coverage)](https://sonarcloud.io/dashboard?id=nusmanov_library-hexagonal-minimal) [![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)

This is a small application that provides basic REST endpoints for managing users. 

The technology behind it: 
* Java 11
* Postgres
* Spring Boot 

## Installing / Getting started

#### Using `docker-compose`

In the terminal run the following command:
```console
$ docker-compose up
``` 

#### Using Maven (with H2 or local Postgres database)

First compile an application:

```console
$ mvn clean package
```

Then, you have two options either run it with H2 database or with local Postgres database. For first approach just run:

```console
$ mvn spring-boot:run 
```

For a second option, check in the configuration file - `src/main/resources/application.yml` for profile *local-postgres* if connection details are correct and if so, run the command:
```console
$ mvn spring-boot:run -P local-postgres
```

#### Inside IntelliJ (with H2 or Postgres database)

First configure how you run the `LibraryHexagonalApplication.java` by adding `--spring.profiles.active=h2` (for H2 database) or `--spring.profiles.active=postgres` (for Postgres database) as a **Program argument**.

Then just run the `LibraryHexagonalApplication.java` class so it will use H2 database (you don't need to have postgres database up and running).

