
plugins {
    id("application") // добавляем, чтобы можно было запускать main()
    id("com.github.ben-manes.versions") version "0.53.0"
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
