
import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class RecordedSimulation extends Simulation {

	val httpProtocol = http
		.baseUrl("https://www.opencart.com")
		.inferHtmlResources()

	val headers_0 = Map(
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/89.0.4389.90 Safari/537.36",
		"sec-ch-ua" -> """Google Chrome";v="89", "Chromium";v="89", ";Not A Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0")

	val headers_18 = Map(
		"accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"sec-ch-ua" -> """Google Chrome";v="89", "Chromium";v="89", ";Not A Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "document",
		"sec-fetch-mode" -> "navigate",
		"sec-fetch-site" -> "none",
		"sec-fetch-user" -> "?1",
		"upgrade-insecure-requests" -> "1",
		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/89.0.4389.90 Safari/537.36")

	val headers_53 = Map(
		"accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"sec-ch-ua" -> """Google Chrome";v="89", "Chromium";v="89", ";Not A Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "image",
		"sec-fetch-mode" -> "no-cors",
		"sec-fetch-site" -> "cross-site",
		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/89.0.4389.90 Safari/537.36")

	val headers_54 = Map(
		"accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"pragma" -> "no-cache",
		"sec-ch-ua" -> """Google Chrome";v="89", "Chromium";v="89", ";Not A Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "image",
		"sec-fetch-mode" -> "no-cors",
		"sec-fetch-site" -> "same-origin",
		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/89.0.4389.90 Safari/537.36")

	val headers_55 = Map(
		"accept" -> "*/*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"access-control-request-headers" -> "content-type",
		"access-control-request-method" -> "POST",
		"origin" -> "https://www.opencart.com",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "cross-site",
		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/89.0.4389.90 Safari/537.36")

	val headers_56 = Map(
		"accept" -> "application/json",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"content-type" -> "application/json",
		"origin" -> "https://www.opencart.com",
		"sec-ch-ua" -> """Google Chrome";v="89", "Chromium";v="89", ";Not A Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "cross-site",
		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/89.0.4389.90 Safari/537.36")

    val uri1 = "https://www.sandbox.paypal.com/xoplatform/logger/api/logger"
    val uri2 = "https://www.paypal.com/sdk/js"
    val uri3 = "https://www.google-analytics.com"
    val uri4 = "https://js.braintreegateway.com/web/3.76.4/js"
    val uri5 = "https://www.googletagmanager.com/gtag/js"

	val scn = scenario("RecordedSimulation")
		.exec(http("request_0")
			.get("/application/view/stylesheet/bootstrap.css")
			.headers(headers_0)
			.resources(http("request_1")
			.get("/application/view/stylesheet/stylesheet.css")
			.headers(headers_0),
            http("request_2")
			.get("/application/view/javascript/fontawesome/css/font-awesome.min.css")
			.headers(headers_0),
            http("request_3")
			.get("/application/view/javascript/jquery/datetimepicker/bootstrap-datetimepicker.min.css")
			.headers(headers_0),
            http("request_4")
			.get("/application/view/javascript/jquery/jquery-1.12.2.min.js")
			.headers(headers_0),
            http("request_5")
			.get("/application/view/javascript/bootstrap/js/bootstrap.min.js")
			.headers(headers_0),
            http("request_6")
			.get("/application/view/javascript/jquery/datetimepicker/moment.js")
			.headers(headers_0),
            http("request_7")
			.get("/application/view/javascript/jquery/datetimepicker/bootstrap-datetimepicker.min.js")
			.headers(headers_0),
            http("request_8")
			.get("/application/view/javascript/common.js")
			.headers(headers_0),
            http("request_9")
			.get(uri2 + "?client-id=Aah3N-pqgdc5eLwdDCg_hWrLUt3FEFuNQ399H2owlt6RIMm1m8tRqCfnzgpuydaaNslRbYQJORcSfUmh")
			.headers(headers_0),
            http("request_10")
			.get("/application/view/image/icon/opencart-logo.png")
			.headers(headers_0),
            http("request_11")
			.get("/application/view/image/home/hero-image.png")
			.headers(headers_0),
            http("request_12")
			.get(uri5 + "?id=UA-1988725-3")
			.headers(headers_0),
            http("request_13")
			.get("/application/view/stylesheet/fonts/SourceSansPro-Regular.ttf"),
            http("request_14")
			.get("/application/view/stylesheet/fonts/opencart.ttf?h4wsna"),
            http("request_15")
			.get("/application/view/javascript/fontawesome/fonts/fontawesome-webfont.woff2?v=4.7.0"),
            http("request_16")
			.get(uri5 + "?id=UA-1988725-1&l=dataLayer&cx=c")
			.headers(headers_0),
            http("request_17")
			.get(uri3 + "/analytics.js")
			.headers(headers_0),
            http("request_18")
			.get("/")
			.headers(headers_18),
            http("request_19")
			.get("/application/view/image/home/brand/british-red-cross.png")
			.headers(headers_0),
            http("request_20")
			.get("/application/view/image/home/brand/bjpenn.com.png")
			.headers(headers_0),
            http("request_21")
			.get("/application/view/image/home/brand/concordia-college.png")
			.headers(headers_0),
            http("request_22")
			.get("/application/view/image/home/brand/fx-creation.png")
			.headers(headers_0),
            http("request_23")
			.get("/application/view/image/home/brand/hkuvcg.png")
			.headers(headers_0),
            http("request_24")
			.get("/application/view/image/home/shop-showcase.png")
			.headers(headers_0),
            http("request_25")
			.get("/application/view/image/home/payment/paypal.png")
			.headers(headers_0),
            http("request_26")
			.get("/application/view/image/home/payment/amazon-payments.png")
			.headers(headers_0),
            http("request_27")
			.get("/application/view/image/home/payment/authorize.net.png")
			.headers(headers_0),
            http("request_28")
			.get("/application/view/image/home/payment/sagapay.png")
			.headers(headers_0),
            http("request_29")
			.get("/application/view/image/home/payment/e-way.png")
			.headers(headers_0),
            http("request_30")
			.get("/application/view/image/home/payment/skrill.png")
			.headers(headers_0),
            http("request_31")
			.get("/application/view/image/home/payment/2checkout.png")
			.headers(headers_0),
            http("request_32")
			.get("/application/view/image/home/payment/klarna.png")
			.headers(headers_0),
            http("request_33")
			.get("/application/view/image/home/payment/worldpay.png")
			.headers(headers_0),
            http("request_34")
			.get("/application/view/image/home/shipping/ups.png")
			.headers(headers_0),
            http("request_35")
			.get("/application/view/image/home/shipping/fedex.png")
			.headers(headers_0),
            http("request_36")
			.get("/application/view/image/home/shipping/usps.png")
			.headers(headers_0),
            http("request_37")
			.get("/application/view/image/home/shipping/aust-post.png")
			.headers(headers_0),
            http("request_38")
			.get("/application/view/image/home/shipping/parcel-force.png")
			.headers(headers_0),
            http("request_39")
			.get("/application/view/image/home/shipping/royal-mail.png")
			.headers(headers_0),
            http("request_40")
			.get("/application/view/image/home/community-support-icon.png")
			.headers(headers_0),
            http("request_41")
			.get("/application/view/image/home/dedicated-support-icon.png")
			.headers(headers_0),
            http("request_42")
			.get("/application/view/image/home/featured/forbes.png")
			.headers(headers_0),
            http("request_43")
			.get("/application/view/image/home/featured/paypal.png")
			.headers(headers_0),
            http("request_44")
			.get("/application/view/image/home/featured/bbc.png")
			.headers(headers_0),
            http("request_45")
			.get("/application/view/image/home/featured/south-china-morning-post.png")
			.headers(headers_0),
            http("request_46")
			.get("/application/view/image/icon/opencart-logo-white.png")
			.headers(headers_0),
            http("request_47")
			.get("/application/view/image/icon/facebook_marketing_partner.png")
			.headers(headers_0),
            http("request_48")
			.get(uri4 + "/client.min.js")
			.headers(headers_0),
            http("request_49")
			.get(uri4 + "/three-d-secure.min.js")
			.headers(headers_0),
            http("request_50")
			.get(uri4 + "/hosted-fields.min.js")
			.headers(headers_0),
            http("request_51")
			.get(uri4 + "/data-collector.min.js")
			.headers(headers_0),
            http("request_52")
			.get(uri4 + "/paypal-checkout.min.js")
			.headers(headers_0),
            http("request_53")
			.get(uri3 + "/collect?v=1&_v=j91&a=358446080&t=pageview&_s=1&dl=https%3A%2F%2Fwww.opencart.com%2F&ul=en-us&de=UTF-8&dt=OpenCart%20-%20Open%20Source%20Shopping%20Cart%20Solution&sd=24-bit&sr=1280x720&vp=709x578&je=0&_u=QACAAUAB~&jid=&gjid=&cid=1235029491.1626180240&tid=UA-1988725-1&_gid=134588823.1626180240&gtm=2ou770&z=1934418731")
			.headers(headers_53),
            http("request_54")
			.get("/favicon.ico")
			.headers(headers_54),
            http("request_55")
			.options(uri1)
			.headers(headers_55),
            http("request_56")
			.post(uri1)
			.headers(headers_56)
			.body(RawFileBody("recordedsimulation/0056_request.json"))))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}