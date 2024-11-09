plugins {
    id("java")
    id("com.diffplug.spotless") version "6.25.0"
}

group = "io.github.heberbarra"
version = "0.0.6-SNAPSHOT"

java {
    sourceCompatibility = JavaVersion.VERSION_23
    targetCompatibility = JavaVersion.VERSION_23
    withJavadocJar()
    withSourcesJar()
}

spotless {

    java {
        importOrder()
        removeUnusedImports()
        cleanthat()
        palantirJavaFormat()
        formatAnnotations()
    }

}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.tomlj:tomlj:1.1.1")
}
