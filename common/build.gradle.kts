plugins {
    `java-library`
    kotlin("jvm")
    kotlin("plugin.serialization")
}

dependencies {
    implementation("io.ktor:ktor-serialization:1.6.7")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-core:1.3.2")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-core-jvm:1.3.2")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core-jvm:1.6.0")
}

sourceSets { main { kotlin } }