plugins {
    kotlin("jvm") version "1.5.10"
}

group = "br.com.cvinicius"
version = "1.0.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))

    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.0")
}