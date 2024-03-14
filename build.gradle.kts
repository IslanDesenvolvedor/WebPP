plugins {
    id("java")
}

group = "com.icodelt.webpp"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(files("libs/antlr-4.13.1-complete.jar"))
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}

sourceSets{
    main{
        java.srcDirs("src/main/gen")
    }
}