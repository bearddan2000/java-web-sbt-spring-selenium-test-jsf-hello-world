package example;

import org.scalatest._
import org.scalatest.matchers._
import org.scalatestplus.selenium._

class GeneralTest extends flatspec.AnyFlatSpec with should.Matchers with HtmlUnit {
  def host = "http://app:8080/"

  "The default endpoint" should "have the correct title" in {
    go to (host)
    pageTitle should be ("Spring Boot JSF Example")
  }

  "The welcome endpoint" should "have the correct title" in {
    go to (host + "welcome")
    pageTitle should be ("PrimeFaces Hello World Example")
  }
}
