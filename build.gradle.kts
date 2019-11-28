plugins {
  base
  idea
}

allprojects {
  extra["kotlin.version"] = embeddedKotlinVersion
  group = "org.springbootcamp.template.gradle"

  apply {
    from("${rootProject.rootDir}/gradle/repositories.gradle.kts")
  }

}

dependencies {
  subprojects.forEach {
    archives(it)
  }
}




idea {
  project {
    jdkName = Versions.Java.name
    languageLevel = Versions.Java.languageLevel
    vcs = "Git"
  }
  module {
    excludeDirs = mutableSetOf(File("gradle"))
  }
}
