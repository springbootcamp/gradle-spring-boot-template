import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    `kotlin-dsl`
}

apply {
    from("../gradle/repositories.gradle.kts")
}

kotlinDslPluginOptions {
    experimentalWarning.set(false)
}

dependencies {
  fun kotlin(module:String) = "org.jetbrains.kotlin:kotlin-$module:$embeddedKotlinVersion"

  implementation(kotlin("gradle-plugin"))
  implementation(kotlin("allopen"))

  implementation("org.springframework.boot:spring-boot-gradle-plugin:2.2.1.RELEASE")
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        jvmTarget = "1.8"
        freeCompilerArgs = listOf("-Xjsr305=strict", "-Xjvm-default=enable")
    }
}
