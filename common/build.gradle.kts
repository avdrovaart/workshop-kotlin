plugins {
    `java-library`
    kotlin("jvm")
    kotlin("plugin.serialization")
}

dependencies {
    implementation("io.ktor:ktor-serialization:1.6.6")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-core:1.3.1")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-core-jvm:1.3.1")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core-jvm:1.5.2")
}

sourceSets { main { kotlin } }