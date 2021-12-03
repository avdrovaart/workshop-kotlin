plugins {
    kotlin("jvm") version "1.6.0" apply false
    kotlin("plugin.serialization") version "1.5.31" apply false
}

allprojects {
    repositories {
        mavenCentral()
    }
}
