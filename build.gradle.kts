plugins {
    kotlin("jvm") version "2.0.20"
}

group = "org.stefanie"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("io.appium:java-client:8.5.1")
    testImplementation("org.junit.jupiter:junit-jupiter:5.9.2")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.9.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.9.2")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit5")
    implementation("org.seleniumhq.selenium:selenium-api:4.3.0")
    implementation("org.seleniumhq.selenium:selenium-support:4.3.0")



}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}