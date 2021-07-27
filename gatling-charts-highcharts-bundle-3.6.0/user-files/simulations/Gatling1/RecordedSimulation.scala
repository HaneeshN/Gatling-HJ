
import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class RecordedSimulation extends Simulation {

	val httpProtocol = http
		.baseUrl("http://www.gstatic.com")
		.inferHtmlResources()
		.acceptEncodingHeader("gzip, deflate")
		.acceptLanguageHeader("en-US,en;q=0.9")
		.userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/89.0.4389.90 Safari/537.36")

	val headers_0 = Map(
		"Cache-Control" -> "no-cache",
		"Pragma" -> "no-cache",
		"Proxy-Connection" -> "keep-alive")



	val scn = scenario("RecordedSimulation")
		.exec(http("request_0")
			.get("/generate_204")
			.headers(headers_0))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}