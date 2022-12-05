import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.7.0"
    application
}

group = "com.github.leetcode.kt"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven {
      url = uri("https://maven.pkg.jetbrains.space/kotlin/p/kotlin/dev/")
      artifactUrls("https://maven.pkg.jetbrains.space/kotlin/p/kotlin/dev/")
    }
}

dependencies {
//    testImplementation(kotlin("test"))
    implementation(kotlin("script-runtime"))
    implementation(kotlin("test"))
    implementation("org.jetbrains.kotlin:kotlin-test:1.7.0")
//  org.jetbrains.kotlin:kotlin-test:1.7.0

}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

application {
    mainClass.set("MainKt")
}