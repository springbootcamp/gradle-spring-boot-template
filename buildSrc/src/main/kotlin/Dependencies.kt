import org.gradle.api.JavaVersion
import org.gradle.kotlin.dsl.embeddedKotlinVersion
import org.gradle.plugins.ide.idea.model.IdeaLanguageLevel

object Versions {
  val kotlin = embeddedKotlinVersion
  const val springBoot = "2.2.1.RELEASE"
  const val axon = "4.2"
  const val avro4k = "0.20.0"

  object Java {
    val version = JavaVersion.VERSION_1_8
    val name = version.toString()
    val languageLevel = IdeaLanguageLevel(name)
  }

}
