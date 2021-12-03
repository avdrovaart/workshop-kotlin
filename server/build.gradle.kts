plugins {
    application
    kotlin("jvm")
    kotlin("plugin.serialization")
}

dependencies {
    implementation(project(":common"))
    implementation("io.ktor:ktor-server-core:1.6.6")
    implementation("io.ktor:ktor-server-netty:1.6.6")
    implementation("io.ktor:ktor-serialization:1.6.6")
    implementation("ch.qos.logback:logback-classic:1.2.7")
}

application {
    mainClass.set("server.ServerKt")
}

tasks.register("runServer") {
    application
}

