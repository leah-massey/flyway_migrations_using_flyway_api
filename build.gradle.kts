plugins {
    kotlin("jvm") version "1.9.21"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.postgresql:postgresql:42.4.5")
    implementation("org.flywaydb:flyway-core:11.3.4")
}
