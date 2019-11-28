import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import org.springframework.boot.gradle.plugin.SpringBootPlugin

plugins {
  kotlin("jvm")
  kotlin("plugin.spring")
  id("org.springframework.boot")
}

dependencies {
  fun springBoot(module : String) = "org.springframework.boot:spring-boot-$module"

  implementation(
    platform(SpringBootPlugin.BOM_COORDINATES)
  )
  implementation(
    platform("org.jetbrains.kotlin:kotlin-bom")
  )

  implementation(springBoot("starter-web"))
  implementation(kotlin("stdlib-jdk8"))
  implementation(kotlin("reflect"))

  testImplementation("org.jetbrains.kotlin:kotlin-test")
  testImplementation(springBoot("starter-test"))
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit")
  testImplementation("org.assertj:assertj-core")
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
  kotlinOptions {
    jvmTarget = Versions.Java.name
    freeCompilerArgs = listOf("-Xjsr305=strict", "-Xjvm-default=enable")
  }
}
