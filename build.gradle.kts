import com.vanniktech.maven.publish.SonatypeHost

plugins {
    id("java")
    id("maven-publish")
    id("signing")
    id("com.diffplug.spotless") version "6.25.0"
    id("com.vanniktech.maven.publish") version "0.30.0"
}

group = "io.github.heberbarra"
version = "0.0.8-SNAP"

repositories {
    mavenCentral()
}

java {
    sourceCompatibility = JavaVersion.VERSION_23
    targetCompatibility = JavaVersion.VERSION_23
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

mavenPublishing {
    coordinates (
        groupId = group as String,
        artifactId = "heber-modelo-api",
        version = version as String
    )

    pom {
        name = "heber-modelo-api"
        description = "API do Heber-Modelo"
        url = "https://github.com/HeberBarra/heber-modelo-api"
        packaging = "jar"

        licenses {
            license {
                name = "MIT"
                url = "https://github.com/HeberBarra/heber-modelo-api/blob/main/LICENSE"
            }
        }

        developers {
            developer {
                id = "HeberFB"
                name = "Heber F Barra"
                email = "heberferreirabarra@gmail.com"
                url = "https://github.com/HeberBarra"
            }

            developer {
                id = "Blashss"
                name = "Matheus de Assis de Paula"
                url = "https://github.com/Blashss"
            }

            developer {
                id = "MatheusJam"
                name = "Matheus Jun Alves Matuda"
            }
        }

        scm {
            url = "https://github.com/HeberBarra/heber-modelo-api"
            connection = "scm:git://github.com:HeberBarra/heber-modelo-api"
            developerConnection = "scm:git:git@github.com:HeberBarra/heber-modelo-api.git"
        }
    }

    publishToMavenCentral(SonatypeHost.CENTRAL_PORTAL)
    signAllPublications()
}

dependencies {
    implementation("org.tomlj:tomlj:1.1.1")
}

tasks.javadoc {
    options {
        (this as CoreJavadocOptions).addBooleanOption("Xdoclint:none", true)
    }
}
