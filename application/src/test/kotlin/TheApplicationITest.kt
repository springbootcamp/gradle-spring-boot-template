package org.springbootcamp.template.gradle

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest(webEnvironment = RANDOM_PORT)
class TheApplicationITest {

  @Autowired
  lateinit var rest : TestRestTemplate

  @Test
  fun `get hello`() {
    val result = rest.getForEntity("/", String::class.java)

    assertThat(result.body).isEqualTo("hello Jan")
  }
}
