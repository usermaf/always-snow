plugins {
    kotlin("jvm") version "1.9.22"
    id("fabric-loom") version "1.7-SNAPSHOT"
    id("org.jetbrains.kotlin.plugin.serialization") version "2.0.0-Beta2"
}

group = "de.miraculixx"
version = "1.0.1"

repositories {
    mavenCentral()
    maven("https://maven.shedaniel.me/")
    maven("https://maven.terraformersmc.com/releases/")
}

dependencies {
    minecraft("com.mojang:minecraft:1.21")
    mappings(loom.officialMojangMappings())
    modImplementation("net.fabricmc:fabric-loader:0.16.2")
    modImplementation("net.fabricmc.fabric-api:fabric-api:0.102.0+1.21")
    modImplementation("net.fabricmc:fabric-language-kotlin:1.11.0+kotlin.2.0.0")
    modApi("me.shedaniel.cloth:cloth-config-fabric:15.0.128") {
        exclude("net.fabricmc.fabric-api")
    }
    modApi("com.terraformersmc:modmenu:11.0.1")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.7.1")
}


tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}
