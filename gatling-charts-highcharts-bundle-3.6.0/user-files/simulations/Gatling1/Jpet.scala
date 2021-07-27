
import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class Jpet extends Simulation {

	val httpProtocol = http
		.baseUrl("http://www.gstatic.com")
		.inferHtmlResources()
		.acceptEncodingHeader("gzip, deflate")
		.acceptLanguageHeader("en-US,en;q=0.9")
		.userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/89.0.4389.90 Safari/537.36")

	val headers_0 = Map(
		"Accept-Encoding" -> "gzip, deflate",
		"Cache-Control" -> "no-cache",
		"Pragma" -> "no-cache",
		"Proxy-Connection" -> "keep-alive")

	val headers_1 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
		"Cache-Control" -> "max-age=0",
		"Sec-Fetch-Dest" -> "document",
		"Sec-Fetch-Mode" -> "navigate",
		"Sec-Fetch-Site" -> "none",
		"Sec-Fetch-User" -> "?1",
		"Upgrade-Insecure-Requests" -> "1",
		"sec-ch-ua" -> """"Google Chrome";v="89", "Chromium";v="89", ";Not A Brand";v="99"""",
		"sec-ch-ua-mobile" -> "?0")

	val headers_2 = Map(
		"Accept" -> "*/*",
		"Origin" -> "https://www.opencart.com",
		"Sec-Fetch-Dest" -> "font",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "same-origin",
		"sec-ch-ua" -> """"Google Chrome";v="89", "Chromium";v="89", ";Not A Brand";v="99"""",
		"sec-ch-ua-mobile" -> "?0")

	val headers_5 = Map(
		"Accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
		"Cache-Control" -> "no-cache",
		"Pragma" -> "no-cache",
		"Sec-Fetch-Dest" -> "image",
		"Sec-Fetch-Mode" -> "no-cors",
		"Sec-Fetch-Site" -> "same-origin",
		"sec-ch-ua" -> """"Google Chrome";v="89", "Chromium";v="89", ";Not A Brand";v="99"""",
		"sec-ch-ua-mobile" -> "?0")

    val uri1 = "https://opencart.com"
    val uri2 = "https://www.opencart.com"

	val scn = scenario("Jpet")
		.exec(http("request_0")
			.get("/generate_204")
			.headers(headers_0))
		.pause(93)
		.exec(http("request_1")
			.get(uri1 + "/")
			.headers(headers_1)
			.resources(http("request_2")
			.get(uri2 + "/application/view/stylesheet/fonts/opencart.ttf?h4wsna")
			.headers(headers_2),
            http("request_3")
			.get(uri2 + "/application/view/stylesheet/fonts/SourceSansPro-Regular.ttf")
			.headers(headers_2),
            http("request_4")
			.get(uri2 + "/application/view/javascript/fontawesome/fonts/fontawesome-webfont.woff2?v=4.7.0")
			.headers(headers_2),
            http("request_5")
			.get(uri2 + "/favicon.ico")
			.headers(headers_5)))
		.pause(8)
		.exec(http("request_6")
			.get("/generate_204")
			.headers(headers_0))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}