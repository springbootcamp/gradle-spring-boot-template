import org.gradle.api.JavaVersion
import org.gradle.kotlin.dsl.embeddedKotlinVersion
import org.gradle.plugins.ide.idea.model.IdeaLanguageLevel

object Versions {

  object Java {
    val version = JavaVersion.VERSION_1_8
    val name = version.toString()
    val languageLevel = IdeaLanguageLevel(name)
  }

}
