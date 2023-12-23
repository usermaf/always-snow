plugins {
    kotlin("jvm") version "1.9.22"
    id("fabric-loom") version "1.4-SNAPSHOT"
    id("org.jetbrains.kotlin.plugin.serialization") version "2.0.0-Beta2"
}

group = "de.miraculixx"
version = "1.0.0"

repositories {
    mavenCentral()
    maven("https://maven.shedaniel.me/")
    maven("https://maven.terraformersmc.com/releases/")
}

dependencies {
    minecraft("com.mojang:minecraft:1.20.4")
    mappings(loom.officialMojangMappings())
    modImplementation("net.fabricmc:fabric-loader:0.15.3")
    modImplementation("net.fabricmc.fabric-api:fabric-api:0.91.3+1.20.4")
    modImplementation("net.fabricmc:fabric-language-kotlin:1.10.17+kotlin.1.9.22")
    modApi("me.shedaniel.cloth:cloth-config-fabric:13.0.121") {
        exclude("net.fabricmc.fabric-api")
    }
    modApi("com.terraformersmc:modmenu:9.0.0")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.4.1")
}


tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}