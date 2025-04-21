plugins {
    kotlin("jvm") version "1.9.21"
    id("org.flywaydb.flyway") version "8.5.13"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.postgresql:postgresql:42.4.5")
}

flyway {
    url = "jdbc:postgresql://localhost:5432/flyway_test"
    user = "leahmassey"
    locations = arrayOf("filesystem:src/main/resources/db/migration")
}
