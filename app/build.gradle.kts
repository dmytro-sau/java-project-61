
plugins {
    id("application") // добавляем, чтобы можно было запускать main()
    id("com.github.ben-manes.versions") version "0.53.0"
    id("org.sonarqube") version "7.1.0.6387"
    id("checkstyle")
}
group = "hexlet.code"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}
application {
    mainClass.set("hexlet.code.App") // указываем главный класс
}
tasks.test {
    useJUnitPlatform()
}


tasks.getByName<JavaExec>("run") {
    standardInput = System.`in`
}
checkstyle {
    toolVersion = "10.12.0" // или последняя версия
    configDirectory.set(file("config/checkstyle"))
}
sonar {
  properties {
    property("sonar.projectKey", "dmytro-sau_java-project-61")
    property("sonar.organization", "dmytro-sau")
  }
}