<h2>Flyway Database Migrations</h2>

This repo is an exercise in database migrations using Flyway. 

The aim of the project is to get a better understanding of how Flyway works and how I can use it in real-world projects.

In this first iteration, I'm looking at building, populating and updating database tables using the Flyway gradle plugin. 
The version of Flyway that I am using (Flyway Community Edition) does not allow for the Undo scripts.

To download and play with these usages for yourself simply clone this repo and redirect the following line of the Flyway extension in ``build.gradle.kts``:
```url = "jdbc:postgresql://localhost:5432/flyway_test"```
so that it points to a local db on your machine. 

To run the migration: 
``./gradlew flywayMigrate -i ``


To view the flyway migrations table in the command line (and see if your changes have been applied), run the command: ``./gradlew flywayInfo``

