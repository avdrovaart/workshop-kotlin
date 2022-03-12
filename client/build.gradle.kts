plugins {
    application
    kotlin("jvm")
    kotlin("plugin.serialization")
}


repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":common"))
    implementation("io.ktor:ktor-serialization:1.6.7")
    implementation("io.ktor:ktor-client-core:1.6.7")
    implementation("io.ktor:ktor-client-apache:1.6.7")
    implementation("io.ktor:ktor-client-serialization-jvm:1.6.7")
    implementation("io.ktor:ktor-client-json-jvm:1.6.7")
}

application {
    mainClass.set("client.ClientKt")
}