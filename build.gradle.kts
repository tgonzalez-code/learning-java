plugins {
    application
    java
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21)) // o 23 si prefieres
    }
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.2"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}

application {
    // Tu clase main SIN package:
    mainClass.set("MainApplication")
    applicationDefaultJvmArgs = listOf(
            "-Xms64m", "-Xmx64m",                 // fuerza presión de memoria (ajústalo si quieres)
            "-Xlog:gc*,safepoint,class+unload=info", // logs unificados de GC (Java 9+)
            "-XX:StartFlightRecording=filename=gc_demo.jfr,settings=profile,dumponexit=true"
    )
}
