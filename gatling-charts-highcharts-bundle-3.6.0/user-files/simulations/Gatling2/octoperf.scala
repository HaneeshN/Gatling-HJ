
import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class octoperf extends Simulation {

	val httpProtocol = http
		.baseUrl("https://www.opencart.com")
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

	val headers_6 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
		"Sec-Fetch-Dest" -> "document",
		"Sec-Fetch-Mode" -> "navigate",
		"Sec-Fetch-Site" -> "same-origin",
		"Sec-Fetch-User" -> "?1",
		"Upgrade-Insecure-Requests" -> "1",
		"sec-ch-ua" -> """"Google Chrome";v="89", "Chromium";v="89", ";Not A Brand";v="99"""",
		"sec-ch-ua-mobile" -> "?0")

	val headers_7 = Map(
		"Accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
		"Sec-Fetch-Dest" -> "image",
		"Sec-Fetch-Mode" -> "no-cors",
		"Sec-Fetch-Site" -> "same-origin",
		"sec-ch-ua" -> """"Google Chrome";v="89", "Chromium";v="89", ";Not A Brand";v="99"""",
		"sec-ch-ua-mobile" -> "?0")

	val headers_8 = Map(
		"Accept" -> "*/*",
		"Sec-Fetch-Dest" -> "script",
		"Sec-Fetch-Mode" -> "no-cors",
		"Sec-Fetch-Site" -> "same-origin",
		"sec-ch-ua" -> """"Google Chrome";v="89", "Chromium";v="89", ";Not A Brand";v="99"""",
		"sec-ch-ua-mobile" -> "?0")

	val headers_9 = Map(
		"Accept" -> "*/*",
		"CF-Challenge" -> "7375c7262fb6def",
		"Origin" -> "https://www.opencart.com",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "same-origin",
		"sec-ch-ua" -> """"Google Chrome";v="89", "Chromium";v="89", ";Not A Brand";v="99"""",
		"sec-ch-ua-mobile" -> "?0")

	val headers_11 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
		"Cache-Control" -> "max-age=0",
		"Origin" -> "https://www.opencart.com",
		"Sec-Fetch-Dest" -> "document",
		"Sec-Fetch-Mode" -> "navigate",
		"Sec-Fetch-Site" -> "same-origin",
		"Upgrade-Insecure-Requests" -> "1",
		"sec-ch-ua" -> """"Google Chrome";v="89", "Chromium";v="89", ";Not A Brand";v="99"""",
		"sec-ch-ua-mobile" -> "?0")

	val headers_17 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
		"Cache-Control" -> "max-age=0",
		"Content-Type" -> "multipart/form-data; boundary=----WebKitFormBoundaryzq5w0U9yyA8bPgJd",
		"Origin" -> "https://www.opencart.com",
		"Sec-Fetch-Dest" -> "document",
		"Sec-Fetch-Mode" -> "navigate",
		"Sec-Fetch-Site" -> "same-origin",
		"Sec-Fetch-User" -> "?1",
		"Upgrade-Insecure-Requests" -> "1",
		"sec-ch-ua" -> """"Google Chrome";v="89", "Chromium";v="89", ";Not A Brand";v="99"""",
		"sec-ch-ua-mobile" -> "?0")

	val headers_18 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
		"Cache-Control" -> "max-age=0",
		"Content-Type" -> "multipart/form-data; boundary=----WebKitFormBoundaryQulAqgyzGOhI3KHN",
		"Origin" -> "https://www.opencart.com",
		"Sec-Fetch-Dest" -> "document",
		"Sec-Fetch-Mode" -> "navigate",
		"Sec-Fetch-Site" -> "same-origin",
		"Sec-Fetch-User" -> "?1",
		"Upgrade-Insecure-Requests" -> "1",
		"sec-ch-ua" -> """"Google Chrome";v="89", "Chromium";v="89", ";Not A Brand";v="99"""",
		"sec-ch-ua-mobile" -> "?0")

    val uri1 = "https://opencart.com"
    val uri3 = "http://www.gstatic.com/generate_204"

	val scn = scenario("octoperf")
		.exec(http("request_0")
			.get(uri3)
			.headers(headers_0))
		.pause(35)
		.exec(http("request_1")
			.get(uri1 + "/")
			.headers(headers_1)
			.resources(http("request_2")
			.get("/application/view/stylesheet/fonts/opencart.ttf?h4wsna")
			.headers(headers_2),
            http("request_3")
			.get("/application/view/stylesheet/fonts/SourceSansPro-Regular.ttf")
			.headers(headers_2),
            http("request_4")
			.get("/application/view/javascript/fontawesome/fonts/fontawesome-webfont.woff2?v=4.7.0")
			.headers(headers_2),
            http("request_5")
			.get("/favicon.ico")
			.headers(headers_5)))
		.pause(1)
		.exec(http("request_6")
			.get("/index.php?route=account/login")
			.headers(headers_6)
			.resources(http("request_7")
			.get("/cdn-cgi/images/trace/jschal/js/transparent.gif?ray=66e261ebc9850ef4")
			.headers(headers_7),
            http("request_8")
			.get("/cdn-cgi/challenge-platform/h/g/orchestrate/jsch/v1?ray=66e261ebc9850ef4")
			.headers(headers_8),
            http("request_9")
			.post("/cdn-cgi/challenge-platform/h/g/flow/ov1/0.4241582199458185:1626174470:b20e3b6b196cd211b4da20cb97b171bf738cfcf1ef90c91d5c39376b7316a670/66e261ebc9850ef4/7375c7262fb6def")
			.headers(headers_9)
			.formParam("v_66e261ebc9850ef4", "YCtNHNdNbNhNsPUnvUVNOH6xNz92vC37$UyqX-NiC3NUgCUDqNIChsntm4XUWUiGLk3dUztUWzvi1mtU9b6Ui$ptvvUJ6jggUYb67izjUbz6yzy$tUzIfoUxU4p3UGUW3vDUJFX53WU+T5Ut6UTn37TONN3dU7dzN7YTFDQERCNhNU-UX -U7JXdUvgZUUEjRVlonFgN7jVvUW1vF UV67xOEbUm3hgkoZ1 NFSw-VO9qT$NiDCk6U$neDUIReUD37hUmdEUUD3SvTA$HnS2$Pj5RpFzs-PGJx-frhd1twyvHn5OyaUuHn2NUgUN7AncJM0hJ2UIeDHXLg62BiSVKDbc4Ai ZNNsFeiGNPza6zx2IvyXbSNvdNyB trqDrRPAUNwxC5PvsNUnP-xa4prEPK9DN7wj6wjhRi67uhHJphbIyTCth 2HJ23b etbuHuUvSNK GieXXaqxexPJ0atGaNIHN9vNcsxoRtHUvcFvriDcy6HiL$6v3qDLbNAkqUihT6UcjWEefvnsdJbyJW$M1yAWvJ2UOyx2629dCIgDUUeDKyPYeC m6BpOfz6hYRu Nsa2vNC7UNWFAmoAzaNSh$4CYhFgrNYsUj99tIdtZhZwg3SiotEzN7E9P6C63mN7Os5TCGVGoD-U3jHWphzNli6GTj6v$ywh761JPPy$v1TuVvfTZmD$GLfDrsY76$WM730IWZeucDI i36ICVP1zgHmGo25Pvy4hG t4QsuhZ29GzZRHCIukb$$OuGLYeQsDt6uv-Ig43xYUP3OYQsivpZ$bSvNpN7d2icvU UbJi4XG$IgXU0ZCRp5YNDWdI QP-o 0y2mUp6 I2Db$oZIGPItsUe 3S1cfQaGSZt4GW$aiGphhcW tRe76oZBvSZ2ZvLI5ao t7 muSCiHtev2yNtq6w274-bw-SNhN xg6xY RUEKN9vJU 4cYX9DThiU5PpI2p66I5GyH$GzIyfuRvJnUd7RXUGyPT2RhQS5dmIZtvS$YS U3ZC16eo2IH7d2q6TZ6R32zqds4SCRpaDel1cZ6RU6o2Ov-Zt66eYeds9Y4aGyvNrNdu2aoY xdmap2lclX95GCv4ETxsa6olfZpb1$GgbcYS5eGzqAmTI$X73tIBUpXB6IpaeET5txDawv1Pcy-32Thma4cMzqpb 794cdILt97tIHUyx4q9eR4PoDzagEuiN9A $CdP u gb$Zt2GctClcGv4ZsTYQSCxY4DmY7Uaz37il3QHUucGoO2TVu2ymuyiXpD746og7m1Eot4qTjI2emIoCaISZ6uHCt6EIyvjgWvt6RUHy3xyuICDvJZelca$GaolzvHWE$Gd7da--b$iUAoMUROmLkvyvppC6I3DtDm tISCE-3p9etCII$ vX7CI5Wz3$GSyuo2c6ToCiczE6c6pdH3y2I20PpN QNEfuSwRYNXfgtIEJ773$EHZDumDtIcNwYNp5LDtVNDZCOUEP4UvQ$LvXN NnX cyfI50sg$GAG1f6PLXZQ6tAZ2LBg7SGU2735y3Ig2Pozgb9376zvnNEa$v  dXUWZZNlhZdC$aYtHwPP$UNYQt4gatml dtIt oQ6m9dg7tzNR3kPLRLtCWZpyqNQAbt4E9uHymE7a 0X75m47bi6U zNsVPviitKNvNEExPFNAp3t a3xivXJ7Uv60jyvy7Nmab9r7Ssd76X vZq6t37XLU5T9RH6GvqIdUmN16xoEUBYNVac6UsCdCfQo62dDdZiaDNvZ Ug7wF ITIUAUJv5 XY4e6SEjcYd ZCjEdyZsuFviNvZcE-6pjW tL6d7zPwj3EUdHtU-76d zvW2dy$sM76 3TU26-7Usx7Un3I71vyqIZ6t4U6Q1SX2dUutuUt73dDmUvUdN$7pUhqN$3LQUvL2GNU"),
            http("request_10")
			.post("/cdn-cgi/challenge-platform/h/g/flow/ov1/0.4241582199458185:1626174470:b20e3b6b196cd211b4da20cb97b171bf738cfcf1ef90c91d5c39376b7316a670/66e261ebc9850ef4/7375c7262fb6def")
			.headers(headers_9)
			.formParam("v_66e261ebc9850ef4", "YCtNsv7D2zJb7HU6NO3itvgvR7$UNqUfECvQtUYvU7T37qUTUI97i9UHsqUZ37Z$BBZo62NUoNUFCtgjv1eUyrUv4UMbCU1XU793xLNX93UmsgS314f2UZLle-0gOINoEnkxpaJCQ7rXirDpZX2FUng7+EyzbU7- mJqX 9pXPjeR3UWoy3ZaxYBYKarIGmuMx9sOy -IGZpoPdqzxJumtcuabCRLy3aLbJeHN96UdkIiUUfOUUkUvDU$n Uz67cDWUUiGgj4N7MbyC2xXNUJbxUxndcKN3ad97XoWzIiay3IR9ZHs1-7$JitGwbNbIWUR6C7W3MEqVGhX7hTs1McgW6BihizW1tcLZUCV6Qnd3ahit3SXsSOyDOyuXN1WyDd62pEiM6QOhh hacE77pewFIboE$IOX3JXmGXyDI3JZ7IZePxsGMEMOE49IZdP1ISexyuMWGz6REytS3CIGZvvemyxeoZ6b4osFzE4 6uB2QEn1xsZo6JtSIbs-oblosGIeQT CosZeTsIJrUvSU7FwNNUYtQUvOc tsU3u2UaN7YfueoyX 73YCtI3UJ3U3rZUvt2UUSjF2TiOkXNl7BzbC- YPhJ6o gEUgPNjayTkewsv-IZ9mCxyy9v4$PEfEzIsDRyz$7CVFHZZCbIeHqmwMi6hUrpUlHJ2DhTzhp4ZcU0QPimm97e- USbCEN5aCYyTe9YNTGUKUsUuX3FUk hLKgxYIAs 7hF I3UUVxc3D6svRINnnROQIGpEUaUUIe9DC4UUu3WZ7wX$T-nyUWYidpu6zGKbUw7UE6ANUejqx9edqb7wyNUU0UUpOEu3UfF3q7JKae6OIgHNUmVwURMWmIgr7kUUXs9dU4d3N7nTbZyeSyEd nmugN6yvUUVHQB6ed3HNwZIxJEXeIG4 tZsIUdu7IANDEiYpeWcN6x4UXeSm9ssCXSmz1XYIHjWNp60e9fs6W uDddOZUdvQSUrXtSh9S2k-EIQh6PH$m-itUO6Umb6JNOi9jJvd3KUgmUd9g7 Ws5YCCdLo7b7uhUnvYF4FJwYC-wUtRpu27PeUwfaoUGpOO4S aQ1UUtUUeqc670Y5R5bEvLx4Rdqi7DY iUeXO-w0SagEwi9tcThTYyTf$5WEd5-UhI3obEv3i7c-TWZU-RC1HiHP0yY3su9 IM0UDtvJK7xdUe7xtcKm9u0pZ9JHDtG9EIdpxcud2b9OfNVKydR JBy$40vu5q0iUOh0T5qi7ivQHyJNLKsr-LQqNDKbygDHNKDVUe6vMNOEP9Req-t75WH2waE5VwlKVrx5RETda7Wr$L7wP-rbJMpvAUha6YkJLr0p9SrnivHKisSYaRAsYaqGO-GKKd$-NYK-KqL9qUxAyUVAs9vgAcD-pxgB3s$41wK$KuaYAED2YvxrN7UFP2xyek ebjsgN7dTIAPGIvobfoyME3z2sXIN5j-gM6nPWIU-d1MI5uxeA0z6bzxANisTYp7Xwd5pUxMyBEow $WEY LUwY3a6edrgC2Y4K0sM GWjD2d7V-nL LyGtckTqQ Cs jskq3iUO4jNgHivXFHUxbgI2G NY9xD2Up7XEUikDCBkOhom3 4t4a6wzGEj5tENZUjs$WtE6R9ue9UJd m6bNEawtpd9btnvQNjPZX1pknq-Jim7AxK3HNE9yig7 xtp143YEGbW Z$EAkdi-KQrTYENjLhute9deynYr22UR74nEEszIqZZE0V6IZzNuY4ac iQFEvQWi$UX7BkEzo7$Ux CTjwy0gm$2z4rj13zK$Iz6zINviLYTUxnSQ3j7YsQMxEzQHEoksuaRm11yEzzqbF k4IywPBbTXM9zWZ9UTUGIztGDYEmky6oJOi1dmPH7U7aV6O7xG-PxUxzUv9R2FoIEechtb3aEIIW ASDb Fzf5a4Wz2aeqhK65xmhnbRpBxIueQh1 -UCI1Mxz4fbQUS7$zaLzPbEK0$vu QzaW2qHtoYDhzu7OhzPWokYI79kK5zPK ohEWnFdye 4-UAP2KkF pD5L0sqhUpG9 gdDogt-GE944z2aWPLYWv2fwlPFNzPGMZ-d0P6dHma52oCOFbTge9iMx9qJDFhf$ QAJ2cDafIqDQRJpGGjhZvnN6F1 D7Xtq9Q1JOGHFVoaPNoCZDGp5tA7IKFXIjv-PodCQFFU3U6 RJIAFHbg7 t67Sqj1 j3C$hJFx9i6roGUeeg2I0Qdd7EJD gh7 Aq1rUtPQJ1pharYBeINPMGjaSv6I6BHrUkxWtkbi4F7JQ dtwWg4Fz3rXkNoiNU4BJgogmSmNwhRFJyez2n6Fj J4 VYobpzyovum5fqmNrUc7695- z92GfQ6m--7PDiyhgu0B59ox HBFivBELaXIRNZWP76KnRrUTURvZd0bcZ-tNQUp7xU2F95arwbEAb$cZtPdNIpIh6fUDaZTcrOsO5BIZ-uPjwF7ZE-00RrpBSghBA0pTA6RftTZShiIPjlJLwBm0x393AMzuBluztNu6mKdx$1ntp-4yaUi$04ZUk6LLpm$iev V2vp CcWJsprqdOrmzi5RZUqzLlmIUq3QnLSVox-irsg97aqiUEBUp2JruHKsPiQv4M5a141MiembDgFNDCJ4wfAea55R4-JwtpUNgX$Wz3quZUGoJtGiEIfrH2AEgWzighbe9aJdsYq0Z$M Ayky6VGwbW3zhFxx4FNQj32m ETqSUOTzFwFGXiXALVptd5b3nEf5MyhwR9ZxC4zJU NZmL0qFG6GiNeEWYF$KnCnRpoTUtibEuMF3pj7lYxn-btDpFnD4kV  cMcRgs1ubkakhkuKYievGGtGWmXUTux9AkGocoP4boIgZIbsUvcHT7S9NTYaO16uu3-yEv9wtT76ftxhxRy4g$xRthUJACTes3Zyckqxu zyDWV50Wx9mAd4aV-UkbGR5ui3VqZlRemZdgALcoqkEigRCMBRGa$ev4I5sz-NJT7flW9UYNItjduon70mg6e$Sm4ThO5hp fQM30SCGLXsU UBYTtscbG$ju2BzSWrX7flYKRgpWAh0XwiuHfWm5Xpm$Meww1REV43lJFTzHcSKA$1ObLzCyhU45IDzNWUxXz6AuJinatLcoaas5dvf2sQyi1q5Jqg42cypmL13B4-haCATVtpX5GD4wP0aDEg2fxndn1ngLwUX0aCoSDYLJZCyafbYCJ2djt3z9aOEUyC6djBbKm BixW0PN4IYLXW Zpm0frPTINgckXAduJivJF2thyfbMMOjLp0nPx-JGld1pwqoGeaZNdCyQnwWpmFrb0 bX3Mj7FYW TGDDMwHwtm1gF6O9s7mAu6n13NTHKaMp12vDxi$LLBdLKCfK1 3qqFC2xm4MEq9mGXTBfKRwk9rHlrQXAdQH9TZ09oVcb0rALMwLs9 f3pGc6ajMHmA5yjFP3lENmBqoH7PgGkqUfNZaaHRYKUYHbxXykgqo33o$ s3 Gfqo3ZgZyUfUbjqtZ9PjKZWMkHb2IQq4EmRVgcvZK9gcyak1RKR9IZs3$CZ97$dvk xt$YPZq6ICY4qzF7sT3Tk2YT gKPk2iEKfcPcgRKcafkkp eYqv3m YafaZ6ImHmAefPRUcnRKcRHNd dgzmcRkCjq7 j0goHUtoHLK7yCIi7javKnx4YjdvRWkQfCfHggKCnQoaNZNTmYF XMNJE3AaiV3eW$KetSkvfvYWG$gjPrAkAv$aRq3YApvG$eKQcGRJgCe9R9HCikRmgGKY3RX$7jFIcLGSfk326R7$7zqqgutJkjmobTvgNmim3-F3N0bVWXUmFLqif-j7kXgitqtGUoigP3iW3$H bq$WR4NuWxYo3ZZ7FxYBR4F3NeegR-KPZ9dacRzxAkk XZR2g9 1Z7sgyZxFc5z6 9ajsYACjR$mkhFOZvZxcxzOZjqVgxkqkIcxzuj X-g9 VgCnPYVAV3ebLibgZqW3EtQgZNTXiAaU6c0npiJWLyAFBcHfHg0RWgfKHG3mSeJbma1kERJjzIfq4aLYveP6aadHUiJY NqXnnma7y iJYc3RPhfyNMWwY1KJbgFfkdfd$0eqXQG$k1KRA5RJte3rbF$DW7Rjz67DWFtGUjtRvjodf-G$GFfSc xJYYZtoYodYYzkoktYf$XP$gg-IFZVZCxegMa2iJtgb2IejEcwo1$ZZgz AJtmfgftkqXqZJnBo7amfmZsI3iVZBo1tjN2IWoZfJINKRZ$Ig3nx0j$ZxZBtAEUguIzAhn$XyR-PJfgsotpzRZNknnnj0EdZo$jAozlxh$3oQH3zTfhEK6Go7KTtkz67yNRZB$XZlksRvYXfJfXtujNA$N-N2WwYKImPjWw$vIJZc BFzNHz4qcIaauZh$KIfImK$HjyXEHRfW0brZLtNgZPrz drZNGun7ZrZNR5zzg2vqYTvVnCW ewooEXE UIGgqPz7N-s9X53IGL71GZkHIZcEYXxLGcg2i649 WzUm6hk$mo6h$Xf6xITUgNlbaacX Xk3G76435SnCf34JW6ptpGg2-3-2S3U92246R9S G3mbNlsDZ9d3pco$I2hXENUUvB24jBub2Im4-zOUMQ6YNIJoEUn-MBNoHGa2W-ZoH4CBfG-o9BCBdkEUaHm-s-jv-o-mOP39kIoILsfPgUhGNwvIddrDCmeIxFrVOWIU U4bwzisrochO HHloi7UpeZnzfo UzJUpfsNpUSGo3wrBaVf4NPEU 7iUWdycqc 7gSm4ewU9qaOBwzVtDDgSZSQSwt movNBbpDSXkIpnkxbLg 7ZHztrhlz YHU-DE7$Sq3neI fITwYIOpbcVIOpF40zE7lYU46hfsH7xHcNa3Q7W qFW 9vtSwSdpTgq9htWG3DYpdS sVSHdBpE4U9sp5pwSa3aUFF1acoBpy-i7cpI70SdjZ3KS670p0zQDTwTSBpopQP3sFzApBSjSst7SoSdSqHoWNTopoowU9TtuLs2TMpsp9TE 4bYNa2eutuaHvomt19 TDuPoaDbovTvIBtGujGlSdpvTEt47lyuF4TKpopr4YgcYEdvu9QOCqufSxuFmH-o ZWjp3TqudSaJ-m$u1BzuzJmovTFNwTWsiuyWeudSSdgs$ wTEU4UYyvTDghuOTBpDQzdVuXw0zvua3vHcT39YkcujBU2FThcBS7Zwz3ZmTopAWvTFYJNf4YEfuTBCuAudS1PwzTtlu3931jJfudjvTfFeD90qUdtfg91lheBqFDza0nkU0raOWC-6ukSmVBpOh0tzpvudZLdYzDtS7b1JZIb400hb92Pddb1q110zzBgOt4TFuDT0VSVvumZ3w5u50EuaHdg3T70XToSWNm-H10pz1SYkgL0O MSy0OudSLmvuMGtJi7QPD1Y1Lo13YgVu40Y1stjSB1-0c1OveUrzo0LmQ1Y0ieY2sks1qYE7T-WPY1CYf0EUstY0iVnuj0Bpa3C141B-izwerzF1z1dSd9ryKCmTFtS7AsXSypdu2m5peDbIEU-Da71HAwFk4iqHDXQihtqdxdVvDiCTq7Fz ZDiVINs04DXF4rNhQ6UDX$QFyBD6sIUDXO2 1fgNbddvia7O2U2wtPXlZMuPvOizXiUhiH DXUc5PNQDXhN2mpJaXfPv3v3FyaoM4pZRXRoRZs-dcuiQQcizdo4-ujZOXcipieJDtPP9o-ZGPdXciV0i1oXL CT4XWTEUEp-1cJ3JSaSpa RiliUKF-dmMib0Yoc-NywoiXC9won4OXC9s7 KMiGgE 7SLiokhD4q2mQ1QqjJhVEzC91WI7$BJPE7SKm-zsYI1qEPa36YbkAWuKqQhTAk-BIUxKJyLdWVH4NwuUWYhZn EUxKZHbg7v97uUHdzKhqS7JqA0ZZ97q70tNBKTWsJNiGYgj9XkdkC4RWsoGSzKycitcqI46WNccN-DvHVKYZE7TqeaLp00YoKK-iliKq0KHp0zRKIUfq1sYYsTAq0qP0nz0zrqeF3xzplq6Ufq6962KqTXCnluV0NqoJl23q1s9stqwz2qUnluUqDDDnTQspWSeUfcTPmXbnCuN2PbsYfsuxXcvn9s$QNnu36xcoun$BdgsPtSOnSBKV6ou3Cn7nZ3QI5IXqbnlT$QJn9PZoux1P39l6poxnTBtWqjdnlTYnZH2TAKlT14OQTKluLxDGmVuxSxKKWn7Ivcen9PWPc2IxLV$ZXkisonTxIxSnAxTx PIbmxXnTxaPoKkxCPNAl1qx$1z cDxspnNxfPmnCAi7 xH wBB9bCUxCZFjZqUnqajsAK0tXgqnvR-9bqhDTqbAp9sni-I7XQsYHZCxM91jjBUZd JIZypqLgqRu -tRW5AjQht 3QUMXuAEd5BJyit2Ka94pisHZBXNcHYtGO4LRpgZouYl2LJWKuA9JlNLgLX 1Oq67hdWiInFvXYIcYosR YWRyKz-I7hdwdd UT3PEUXA- wzKAvs0ubstdTAEUIsnRD0nAJkyb-JmqvX0RrhSFWvmGmXOhhDptj-Yt YuFiSE7hYLdUGSS1GcohYcVokOYI7hYYYHRZyCo WlhabPfdQUfSfZ3iaQURy4cg$6ZiFF-54zcn xf1$Nw$A5$iFFxSUdjYXYohZOfCJzX9Vhi6UH$iFz$$Z HR9skEfxfSbU4N- YtmJN-ve9NhY$j9VfBDd1eTwc-Yg$mfhRBfGK5k04-fm$pftYWf$dcf-fofkkso$ McuHitK$jNnf0fkgru6RJ$of-vs$ijFz2sl$AfTsw7qR4S0$9rLR9ZZ9c$Pf6rVfkgGRvKgrn$35Bf4rt1IqBxlWD5UraRMoE7Mf2rQrkg9-w02werK$G595FDjJS5xrurirgJq565M2djb9QIN2LfD5U9DZRUg2CrBf-m7Ycnyx2PDD-fgJLnC-g$i02sF-11aSq0Efk5ddY5BriUq Q-p0gfnhwQPfc5wtDRJ$-WCJt0Eflzw5eXDfmPwk$vJ$Ar6fp9QUmzSaZnomT$r57GYXUJLSf5kZOzAr6McD7pM5ZuLofstOEdrrQS3MQ1UClCn53VaM2OgM9O-9ZoDMeOwz1-S Drf52ObMwfh$74YZ-Y$dRf5kX tOR04GaOTh7YYf$OEdlZmA7GH 74zyTfTttJbJ$BGf ogfmCzBBDw-hMuHVBEMLDN$P$JOBBHgY9D0Ei-9DDFy1Dm14VYA5G67BOWFwSg7mq9IEUcOq3oOY I E$coTOLP9RoVIUnO39AOVTYoTOM0uHUchSH cMGqptrNZNIn0Iz9TM1V6LpkOBqdgS2Lr9fM9LgfeL9jipfPcOvHkgUuDYjn ZDlkkUl699l1HtvjJnqETWM1VIlJySL-JDlXS4lMO1LY6ilgO7pql4l1DFyntGM9mNGcMLlDtpMyLLlnzUckgyLLgcOmZhlBvNlGLcnp9LD-OfrwL7GRQ6SGLZlNA4lgPe7HZZo$X$ PL5ixlrCTMduLIaUpVUPlx5gOkylTL-0Xx0xVbLIfl2kOhpSgiwLTltGmlGaWlBwiYlt0Ylk-T4Jd6zqEhUoEZbB2t7M2Vl-UIimGUC7Rd6UOibQznQRbKxWay1jYwdFl2M4f4KscasNVQ7Q5JY47FUcz fO5loXz3aI1Um37sUpWIzxKWshbqplWNV3fGJdDT$YlMNu3IXEDvE71xEmvDiqvgwASZNRKz3a22IvUQcBdOP2$Ncu6RGFJXqy2$lWE33GGZO6TtYe $ETgBZu6b9ZgdiJeUzPeCNTsg rhixtVD1mkPmG$mVtDHO0Sve2UOvXtY5oyi3yU7LvsZU6ky7yEv JUfQBY9Zh $Pi04tyjNl6EadH0F-rZUeJXz3AzNP7tyhhXteaIDdq9JbrnbtTixEPzmd7UiX9p2YaXkNYtqDE1set67sdDt$EI5ag$eIUHjG9JdxiNXDSJkk74NqUJAxKtImkLHNyU7ZoSbm jPW6GdIpK-2WmteIkIbvMaq7omZaLHo2MmdsIEgwyq3p9h9euimv UG3LC2Qn2NbFkyL33Ppc fs2jIgKiXWmDZ HfkkgUKZR74ZthXHoPUqxymfW73ImteW9jUNtb$cngYyuUU0YXnRdBvN2OUb Owb6vtPN2a3R OwE52KmteAF6LdhKkGSwACi32RyQnRdkdLqH3g9TtZyEasL Cqm9OxjqvjgZST5m96L3wp0mkbEFECE4ouzrHNZ43fCDwig3QsU4ntlCE4YNGlkByp9VL$43CWiD4EfRf9jPZxcmhBRbVz2xPz$iFjc2YKv9xaE3H7HBEdVzJq37idqed7HtPaEuYadyvNyvN5gEeIR9Wv-qWSUgMR6qXCzdQK2hkd6jqULsr$f2qeS33eXI-t7CVz2M YPiGv2HU2gp4 Yad-vzy$E6v4qo5wPtd7KtP2O7ecUg32iY2yUmqYZTzPA5u61UhafKWwmRC1E6G$1IYdYvQyrNR6uu6q ImxHilj4OGz$dUFg1W6kgP4USXpgLHnab3acdTXgD$gEB CEoPn2Wmx3pBEsfmmKirkFHcizZegfKdpPlCRX$B7p6Aix hEgC33V2bpdFm-vd6P3Fj3YyjP 343aCbqErS1mmZHqEDKwkQXr4Dy00DNbWgl mg1OXVxm2ERvdr3fCq9DvSW cUI3W ETWbSfnc2wvFgTzINM1YTCxsqDjX9vuC6RUh4 ze5OFoJNKuHmbqL 5cdngHo9FDzG5UPn1zhoV94SyFXtJFUGmng4vQ$EPe1PZGzZGZ465k Jq2qHvi5A r-dbG aEvU2e nMd5nDHu9a2S 3 OzIJymVhzNqWCpGtaFIW64ZayZYYKvCwv6OTUZl-3RvdFhgSOX7ytge 9btBzeaoF2vIvtbtE5HaK1vez oz-evrqWZXvcCt9Cfz0hxg2SWga4dLvNymZuwt tuN5EgKmn5s R3xsEOfBTOab6zo7vzHzPXtj5W9v$bFzQNv9vGk3WIEitOUjJ54GkNVVD pB 6z5fQuJFpOFUISx3brbcUfLFeFDed ua-WqZDMiv4koSapsYIjewj2UEHHjWNRXeSprlW3ut9Eh gRX7yxqFN9whDi6Gx 3DEZHIhcbZDMktRFeUwh TMSDOI3UBWD LyXDJQWatuyz5i3fgJjYq7aasZLki1nVoZ3TBXh6qJ16f6W7o7FCVeR1xBIjWNWtIpgyGfBzZ66W1ixm$S6WmGquwfPKgGR5KHUvMWrhPZp195PVE$tu1$$7ZvDv6UP74JbUzu27jgyKF-$QOfiWszVEQ3jN0QoIrsZTCn4cILZNz5W$EdwJU4CcbNfs$xG0me4f $UbczzqIyVInZPV c asGhmCAZK2TZia3j9yvKZKi6xddKZ3zJ-9IxE2nmtHJLJv4hU p$XtSGQRCoXqToI2zPtEJL4Qx9Tf4NQG-Ji3ZRWsIYKbcTJJ4FHUakbutGn IWjbhczD6JYAJWRVzNXm$N76tLl4PBI5FtdJjhNrbbubtm0cZzUOcA$$9KAaHgmSidxtghPA53IH59ya7QDrg2vWDSvzc9oanf6pKYmqKiVAPU qwL33Eq$E2qFd$IZ6CxWDL6tHXQGD3uwcDyP9nz9UtUa3fUzHsLkD9PUqwcUUOEXIXwW4HwlDS1qys0WsG7wpsWCarIWmzQxUvQROEfIWUmJBg6FYOTSRAamcyw43VJaEqfFzyWwosfBhMz$m7Ga7MDKOxvYSKVcKwW Fxzmc9vvJp9C-dBXMtGqnGShenzL6fofd9Uv4EqV$unoKax V$zcoIqroe9y6qZPWVe9OAXFhyov9LICu3g3xxdcNFT6iI3$Aqe9wJ9PmI7S7Bwqjs5c LStnYtqocKZQ4q5THj6dL4HwTvCUxNYNdRGOIE3r-fk yhegH 6PhZ$t7DP$ZwieKeEupeaegB9h$3AQP3p ebI7LgPyWy-7Z2PUHda5xl7TvCivIaH7aWuoRGZnOPzN7Hm5aXK1y-mKJ$P2y dv 1voXdRkzSb2Sxv27S4EqW5JCWgw- GJFUMS 4iJo3Dj9VUh$e -gJkCXdCNb3r$IfsRI2FDbSpyHP-JEoMqjH7pNC4Gje4T53bAz6kgLtdIlijo74Ye6WJqjNFac9Z4 26ItJNFKmO0tg2Qo5hkgUbAbPgh3XLoO vBWbPg5IzYb7Gmbh9 472WZz3dmPkMydxvnWo7SjbKHoghixb4dPmPpmSOWQ9hI FakfqnToxeKbYF koJxa5GjEIXHmPyQJlIHCnod9naU5bUivjpco4OxYoNQSx7pGuFNPaC qdTmlsYZTzt0IJnyPxFyZMueNaP3emCwUDtUvi$l7 mZ7QDlE62Xh3RvqmMwZbSg$d3RUdyRILEeHYUh vdUl2gEI9ssNud$2bJzP3FnpFqmcFgSaoIgZ4e6GtDL9zCSgUaxgyxs0iIooCiXg973Gk9MI5iJgZrHPtDZcLVpdneghO pgUSGNmISLmvS-y2SkgdBmYPtJst21DszI2jmG6H3PyiimssloI hgE62Ibtmlz3buLNqT0XOKWIv9M9punxdhvIcLgg9IUfRfMAVjL3Y WQZEK14vyeZuifvzkvtPyiX9H Vy E$VyCElHEUXoIGJ6U$tDck2Ygf1vt7BS3CwQHPZiYwH 7--WPLTt$msNeEK3l9eH d63KceuIsCuI3i7r$pnGZDjhB6G74Uzxe7mP9FENd120eQ65krSPHtNogbtvOktUOEtNtXjspE FIsvTtshxFh096KoG wxtpZ2-5kgpq 5- u76gI11CZ2pRrpAGl951gq75pXnCCP7obVx$Sh mIHqUpHEhdPppjG6ikFU$B6L2B9DIAkoU7BxTAp0gGtS01G3N25MxrS6U6iKJMtgCSporkB1CmWHU5 tIYNgiHF sYrelpovuahqiab3U23Lg ipmj673kCuZI7iybJWP4NpU0j6OZsESU1GJaSYhgyiTE2aFi-iYUrVmn7- 72TIUkIJdxvI uQu32YIrUZWvG3JUszkIfQFFqqcA9hY2PxIaVyHcGTEUWfj-WChtiDWP9GqB6XLjr SHuxkQV6 hUZsFZLI9CuFUOFEGMcztL$IG74m9SfGT vPOEyQRFJiunYZPQjP44JW5uyYIfmt Nd$ItDsY4PeWTyX RbTkUPrmPeJhuExuyZZ4RcD$EZb$TNGkI$FZ3dNhiutYujTsEOaZA7zUjdu1cjxSIAZbl2sEoh KX-Swtu-OxI1YesX7VtPjKseFTaqvPPzFhBFuGzGt1ggpL-n6SpDz55xjzBPX 1izHASh7Cx-w kTheNwxZUPhZh S9yyuRoTF-fgjTMZ7$UVTd-X5UPd0NL0pTWPRaDlY$E$R1Ez-mbIfP4U5kyEd-0kb0Vhv$20uB-hR0XqI2OgMTv7RJiTVB-gN0T15i3vK4B5hJMUFRJPB0ThmLeZQjNWfx1Wnc7AoW2VRaISDYpeb1EchEA6GiOS1WPpO aScCFgsR9AuT2MxCzIW5oeBu4Ud$QJzS5bhpTkUWiIv$VrtSwtqZFyf2u9aMu76$V 3b3F-gQ9XV-5W$cKut w S3bw5bfQ4LhHHVtlGEkOlsPhFkVPia-9OlaXZgHk-jVUtkHfMHkA7zdVIYmnJq7ltp7mVCG9ADpjYAq11RTR2AjkSycmTojOczXO2 GsFIq-CqOnE05eytHmj5bmi XRig0EMZ6xp6ac4 33vZ7V45-4lFghVtjzXR6GIX-pmAcc23R1 9HUaoH1FFDSQJYK2aI6BDC5bOjid3ZjZ0RS75ohd9p TYTkUf-JFicpGHqu-1mOhrJq7TkOvrNJu$kFga0AV0tFCG6MO4nth0wzvIvsrTmqTks1Q45yUMWf2FJ51eS3bWrjuSvzojEgnbU-W6AuA7zbkXS0Oa4HSbwzmBwuGmzx5mt016S3iffPM2TgItAyHLhpO1FG66uUusJTKug6lX7ttYKzoKbJaHSl0HanamL cpUYXvYN0gVHXNmTbrJA $Qmh j$4N0FPQxWeVmE7$vzzaxg$9NT6mXpTcrZtPOqrSeze7 GjcZdfr  ms33hR9nm02y3KbeeptUznC2zrP7zWvjJzEaPT2LNPon6ciDQyyzTcKEAS2y4zrWi7GiEx3bcXXXt99JatxiEqtyPtdSS-d0zEaRSyBRgfxHSiMu$iIoGVWn3C5fTjMOtKVbESZ55ahYjUe7PiEBmOPEEZ$rHxyp09i1o5btyx1xbszg7VbjzZgqvJ09Uw6LtCuwP5Wv-9Nnni uPY mqOMg1QJ6mhbwGYNLDrM5723kndYmbRMd4FzX KV1dYPxdDoPvdQuJPBWvcxdv0CMDLYSzz hsbZAQtGSxjxkZ3PZked43dE2cTFebyiTc24EVd437vJ94VYlERlZbc1$q-pd juFdXvj61TZDGADkN4u5CoXNOoE1oDLzZGroSed1MEud5tKphLzMun9BaTPRky2jkIOCW4HD2TXps51EGKgEGA-cGwmUqH77SgCGW-tQZX3Cyqh66TwHhOWbZGFLYiuzNMuupbwx-dNwS-WPSbo0SWN$JMVXumtfVyugf1MVXxylxl5vEM7OdjyxwTaq9asF1HIB KW tGvL0GZ2d7EUmoEfS7xjh57lTaaJY10i-hLCzt2nyyeKa9jzyGrm7nj6KDa2x9g4 Kr6mZNBYadiFFb1WU9qWWxAzXITJfZKNaPwn21SDGpXTkU7gY1o0hjwDVNaC1gHZIzwhVtsC6eQIutFBAl6dGviVvd AaPUQD mh5kbGyTWG7xgXbEkOy jv9go2D6W$dscXmizYZMJY1XpYZzi9KCfgY1UQMyN730hzHB6XO2GUlE6Vmz2U0chpgJqOV00YruJqdfZz b0LwbYQ$vsyBABqE0ljqMcYEqlBqE5zxgmwAkq5Yb40lMAxDf7tzNR-9jKFKHhoaje1N6dzgqpoph11ODm9daY3c5zTt$vMbiJxQjQ3I 56VHZcAB$jygBt 0OpMYlsvzAR6aK9keT9$kKIsNZoJaX2Ht Q1cCGVbIohdk-TW20OBvfimPmRi$g IaUf9Tq9SHak9$O3w2$-PkTMChgUvCmU jJjlcj6PCyLM4f 3V2SRU4Q793dDatI3n6ifQ sA3nxk7HM9qtK64096ScarvAzU35o9xa0TzLvEDRyBhU9GIH4hEOEjfk04-dln HV9EjJu mdPh9yF252xioWIyPALgZZZn9DWZblhE9GU6HZCh1Pb1$MFH7wU9-IOFdzX0t6nPPG5dbH6f7sZihg FCtKh9aEw9molvO0sETGc7 BDpFWQLJTCEX1coSJrymQzNrqn74kFCciCY2rDnIosBodq$iR jKNoI4ul479YxXHIo$Kjjrge7NgHnt19FxIkhUnxnfVh oGQ7MaNWjIoQa HxgOU4Vi1d756i7gu4xfYDpkOv6hEOUGDzf4lvZbLM3SruoNo0TtczdMS-X9sZ52QZjdMR3qeKoHdw9pdJDWHntPPj3i lawJiWEpeTMy dTJIsxQREquLNjTayKH0y6D9ZKYM5ixxOoGkLuRx5R4pxE v1Cv3VMb2eQYptPDSQVMq-OE7v216ivNdwPqYIoNZz1Q7VCWQtFq6 3i$BJCyopIorvOCMBT2dUR6ZpG01AdO2H9plp YlIBmDi5xXkpmQvik-Ty5qxBpSY4- VO4r4cWoVFsigdMa7O6zvyMMi0VItXNRAt3Gl1Rc30Sen9I-jPuAzUeWQBp9kEVPKwuJ-6BPoKuP6D7uYYAnC4RcYunc9k7e $TtPENIQj1CuVvmt-4O-TUJrTxE 9BnSwEJLipjHTJHrq1oHPFSAmCBOGPcuuyzIVgGCR$q79ZY4Kb-9Vd156o6gt0PNokFFAfdyAiAbFpc-09-7Ot4-tRThqJql7$UraxipkFyCh-X$PIAIosSIS-oTaN6TBDedHRCmms5Nx0jLcm0aKDGfHAUQ6xZiZw9NgORXTEFCvcVu2e7SG-YPJPO5kiFdTW Xx-k XX0Su3PW3w95 chiuwKB L9q L2U2WZ9yg9rnpKIPr6o1ltswBtkgaNrJAoQmOGO3LKU-uKJ05rn$kBr4$R6eoZFCzfyDskxEDtBzpOC-yyNpRbo7dAy zFGW2nSowB2IdmDArnRXC3YRLCHT2X4nqaKdHL1FMibQxY0KB2IUzDM-vnU24wlL0rur433zzCFHL3Ghl5bxYNgF-CHfJ4-rs2X3EER3NCD4qn-g-BB7Gsu3M7 QT5mHGQrur5hKnoumqqVT9l4t$MoP4iOBfOrYe$ JvmgI0047NExKs-BRr7Sdw4lAR037c5HX9COJKARZkP 1fJP4CRGgvjsN3Nlb-6$JXNYvRo60G5oxp0EjwspM91$nxM0ddRLgkTum4f-XzFVSLsEu51$OpEm4HgMUaVmnPjgsgOGVVy5ARWpukgELVTRJWDp0zkBigClq-9R Xzkl7clJ$-uflXkkR1kMVfrha XUYsoY CM4lRqopG1zHmJ-rT0E0ksLkv2Br4J$nX Wwi1Db4rzfCTfENE3aLErKZEXOWLiBC0IM3RlX1WPiC 1IOqnYtEYaRknSEr3R6K1WqqGjJlrgAIX2BytSPJLXuEbKvm-0aMJw4VfmPKLILlcMqVvRNyvmKz5l 7179tIq9$FY7tn5vAzTBmgOHouF-t$jKILHJloDQ46$M0G-sBIpVrrSA okcKxw9nqM1AeX2B2RQWJYCtfQDO1bPsQ1-4IRT0fBN5kpXOVRRnTx4YRkMV7Mx30KfBwtR4Ri$JyHK2Bg$wlFEVzR4bW3SLQK9W-dRM0OoSOlfMLgJR5YxVyBfvC6D6TOXxJcd0XDG$gryXsmgOlKD7MLnDnCWcOwUHjsnucI-OsPe5YYfuK7n2N9TTOOdgjjm5WR0eHmJoaG5pdRc3LfAVMdK12DZpPTfUf50VRfBBVRf U90$76Jn i14AqOdMVqVuTeKmtfMeUxradwpVvZwdDs5EftfaoGXwm T7E62Ce -miMKc5zGG2FumPzvhWSUaCWboCmphTExqPj1w1F KvsMEEkUjNx1UUUhudkBx4oV vbA6Y3GTNUYGAEs5kt6-HZihUU7Ix1$dSZsCoEUyUO3f2Xe7eNgAu9Mu56d5Nx3Sv-gYIyjy6vj5h9oZ6NYPiWM57fUOtZgoVXrqINM2BTHg RCmWHrP9BpP$$Cavs$74JYSV6zjOhFxWjADaVVGDXt7Q1$akITVBj9ds5zs5Du BBSVZt1VgtfTHP NVmDCx-QZNUYGNvmOqzwUBTwYRqCcVO64A$TrYk9 oMd5-UhTP-kxlYyXDxUxv5-3RlKD-5RAXTqUdRQMVBrT2U0Q1 $0H75UfU30PVk$1V637JAsTSaz5l5Z9$XA-Zv3TVixH47kUq0ABZHYjs5z39hubU7mXk3nYmefiQJZbDCCvpA  SD nBvZHQdoWnXVH 10DNOErtraurj11SZE6BjWiTek6d3NU7LIpYh7tvSNptCz6NUVsONbhSitP9WwcYT727KUFIDJizDJHFhOwBK5kotPmkLZ5hJKVHZkqeI2HmeCe6KOxjCGpKn1yUJGYp6FbtVrsjCa5$CFHsRMrPP4VvUBO vihf231toQSsMxIMfnWSTkBJUFWZbe9lpGNm9 tmD7vUTtUaoqlgvv6FUaUz6$IaYEIqNr4ciyLyUUm NKs92uKFbEr2L0POiQ2cNIihyK pIqLCaEVTgzeeAwdQfS166uDwbop$eKYdsaE1YB3OLtmiD7mOyWj2xs$wezPRUMUR2OtXh7jkr7mNj2z7Nki5lkNQU5R-CYNFlsWU2UugUGJ-BPPAWW9G3I3i3v5mgUa3q9IZda7ysZU5US5JNdNXqva6wtB5t4X3vZ2Q7Y2iU7UYZvg7zNwtSUYN R73mJN5Ug3I37NdT7NUSUvfL9XhUG7hEm6NQP9XhU3mtLNXtUWbfUdT7hELUQNYI7Zdp7VEF3b97bo5sW72UZN6HoU 4 hBD7cNI3j474X0Np7cN7 xG$DvTvkNjNg3EKlZUesBHBU79D6v47Cmc713 vM5tYvQNWchNlemUiF72N-YL2lDfbt K$7D7LMk3MYm-z$vqhUaB9oGv4UKaT7JNiUXiOtv-lcUcwq99Ac3v2mJNv6i3zZIzEx7I7LMaqJ4$Dvgvct-UbNDCfxv67u2g2iUeP HUVlcjKMvauCfq4xzrUFNjNu9UqULs3UQUkNxKYZvsBDUTsjUiSg4 c7hy-MQNO6fMG3mg7Z3xwV5j2dkF1-bOs t3UUi22t-U CfAvKQdy1UhGoUXN cmB6hl9UU4iF t7AuBtTUONU$f5yuU9GB3oGdfCWmw64U-9eb-pbg7oUwtB3INdwUQ7wL5UvUj24oc6UtUZU4OENIn1xUKloUvJNQUbqvyQhlD6X4zEtO672Nv39gv67wNoN 9y13oNveyx3oGd1NP3v9U37TttAAp73az9d2UhlYIUR7zM6NmgN4UOCmU7Dtv9d27DtYN7C7cNJNmjBqUYImgN-UEPXg7EIx4vTUZ3v7b2UDUDCmUUzNO6vvU3UnSvydLCx9UeNpUxQbKB13xomMh2wzZv3vg3JNXTUOUbbveUFUt3X U147bvs7itT6Y1NWU CmaNDUzUiqUQgzUv67g3MnGW7Z6 ngcU 3oN7NUP3z4v3UT6OAvCUeUENve7-t CvoUa3t37xURNxsmgy61t3X1ygBU4vZ7u3mU y6lUGTFrBEFt37RgQUdNd NutDid26 3buv vrtmtil34UWZvENgU KG3UBt7Zd1ygDM5X 7LCJJs97aUt3mbyTqONXcU3UnV7$UFUI5s3UP3ebKBQHMWZdzN UOCmgycNOCm37g3ZUUW7q3vm7dEitfbvWU 3eo cUZUfbiqyeseCWYNT9D6d 2DUtJdHhiU23vHtSUZUd UFUU477kx3$zWDN4U PAcUWNiPmby02fb7Ha3UMSv eyPTWX5Nq9d9vgUrtMSin7o3ebK0NsU7Zdum13bpk3yMlM6X57 ad9d7vT19DK5N5UUDEDv-Ufr3eNJlXNvKQZUJa 9y1AD-vZUq3DNZKQEiO6m67cNYZ t7O2O6mW7UaXNU67LCu9mhyNZoNX 7wUpUX0NouMNvZUa3MSv47t nvXUHHUnvX5UZ2iPX57uUMSU-2SUYZv473aIMHd6WNx9UWUiUWZ7CUgUoGXqUC6sUXwQdt6NUF3P JNv3Y160-dBBmhz6X0Nv3X1UnBBUu9iqUDUOCU6Uq3MSXLyEIiPX1Nutz4X0yEIfbX5Nya KGWUttzZ byEIMHK1ypMMgx9UrtXNv3Uv3OCXa7O2YBvXa3PzZiVQa3oGXgUOCIfA57EIi6WUUg2YUi9UgU$2ogNg2d97Zvv3bFPC7EtzUv4U9MWrRbN2NIMkI6NZM6vgUP3unH6UOUnS cU-UiUd-v4NFYXgUpDxN7R753Y7Xy9-eWZ kBEtoNXq7EIEPmU7wNUDZFQ-MoGijBbUYiXrymUOCmFUdtT43GvwtiPX2U2yM6dq7O2OC t713e Y4yRNcuveN2uIN 9y02Jev277 nSvQy53iUUY66Uv6sWUn6HPvW7vUXUmbNoumUUeNdtYZUo7LCO4 $aM3AQfuEZ4xG7ov0QOC evXPvv7fQH3LN UQata6d h$tx9YcHiUo6dp71Uj4vTUwtt4d2U UxNv67L2v9i97P9IMcI6FNM6U3UBUl5 XQHIYIv67p4MSiq7RU04d4y$txNv wBlmtvYvFNXNXpUDU9nKJyaMebmbyeWiPf U U7ZmfyuUYIUWUq3XNUAQFUi2mgyg2VPmqy$tu9vxUZNiPUq7HUv9XUJXDX6PQNg3INi97MIIMk1z02J WKBwNz9X0NeUINX5UaNINX 7BUYZmhveUDGfxQVifOdP7A YNvX6SYOU7hUJ6t6iLUzC9gmnEOlJe7IybNT3m9UTUiaX17qUvvdSUm6t2d27W6o6vNNVUxNvZUINt9 uBr6TNiiyUtzqX3mFUDs bU0UU6XaUDUM6U6hvCtUU"))
			.check(status.is(503)))
		.pause(2)
		.exec(http("request_11")
			.post("/index.php?route=account/login&__cf_chl_jschl_tk__=75d53b50f15a5d250372f13a409eb971c1316fac-1626177957-0-AQVrzVxvqmGhLXEMjqgXB5oDGCINQaT3CAhb4S5sxKTxiKml9RT6eg59gZEabCROlVyidaqhmPaUMviymlJ3yg3qENt6DVtIhQWKuG0FgOs1VRQnH46nAo_HCjyyCzJlckEWItNWqAJfGThkwH5dZvDO981-Lxz0pDakLYHkUZv-VVX25_Q0w6-TWAbh3XZPOD2T-wAowdBz5H81QQZxnyCMvAdvURk3fT8VCZ7-3CED7xWf3nM31A7XH30pmsXP4gA6bnFH5UEDulETOw6P0ay_HcNKz2mSfHDzCbtNqZ9xwVFDRHEqKsL0th9EgyEtNugW7tWa6Teu5j7eXBB5bFbJ6Q72_XXQATeFZaFBcR3OWKAppaZhefx51iOGZV06TwpTjgfsL9U-fkNHIXn5ivLn3KXI20EONtonevLCY29G1BX9KXRO3Kux1w1JmclSpz87AXPlI97rlm24kbjEjw_FWNFFhs1rhzaSZv21Ilr6aRbuN8HpkZzvV6OOUEvFHw")
			.headers(headers_11)
			.formParam("r", "fcea35f326704e59fde66ef8ed6254eb4ad35f3c-1626177957-0-AcY5aMq//W8xlgs3qzzAWXUDoYOaZNY3ffICcRlVzc45lh+JdPFiDXINvq/i5mhy6/dBPJdNXh48Z0niQZc8TpdfQtGGAL65FoIOiS4rqn+6g/SmV9fTt5dKwtPkyIdQxEWMiSR3z7K7Q+8/7nEd1L0aOiqqqCq4wPMRWdEcylXn7fOfiUsLgNw7sD47X9+cKpr6+zrGEMj9BXwIHxlShfZDmnE3uskT+9OT7pWWXEVsQCyOpI6xvosqH+9GfEmHZI3s6UIjJWaWNtCjkzaYg1s5UWoGHvPUzJjhgUxp3hATYmV7PwZqqt2BYnthY0IVnFKAvHMVdXW9qWw5F571JKPSDIuc6eZK1yt6/bKd05mRYyKTV9kW0U4ZymF3Ye7AfHL+ku5ztVNDzGgK7Kf7hcSeF2lnQtMipNbe/SEgS8MzobgM9JwoiK38h0ALddGW3alII5rc08O/VzLDOolRf22XsRO8w8wpilnMGlrfTflZVq/gMrzJLDAMBaJ5qi6+UHbXi4EGV5YnqOQFgENqUnTfsTeWdeDC7NdF3dQTwxXH026HZw7aOpEk8Yniv2NZWBr8AC6Mr/EXRByNhyLe1iPZe8Zmk7rQnYbypC8zku0Sps5v9LkWjrAScr76ELQmSSYOBJ7l5ZeSfMQufyIApR+3OavnM4djM+aXeCggZyjcmQUREjWkCMrzVeDhu6Bc26lJMmC1/HY+ZiM12z/1g95D0dfm9CYq3RwnzT5HTGvAvrT7MfASrQK3XWBDPTU+UuSWF4wug5LIgvniyuTeYl1OhzxhS/FUGwD/KO9GJXn6FRGb8P3JeNYyB+y8plYZFr2Fpr6Rkt+ZhsZ6g9bnuHGscTDdxb5UxRHpMdV79U4/ypzPyuBrUxcxaWMRH1FYVq+tJ3tjLGW6ckUS4F2ATbHHJo7IsUm1gkBxkYMx2LIz28k3+BhC2PlfzmJfBUyWwuTyA371GbD08IVk6XdGt9tV2RwDDjEqQEgJwHR3NPZJkqKnsVsC6E6VLW35Ok4URFJutaWdQkrSITfpE12u263oCCVSH129CTfgorfIiC1NsMxENHfm4o9/qPjkHFdNBluIU+HRzg5CJxLwAfqZwTEzLcQuhIWB6twRA7yGAUpblYrPDPl0XOhtU7E9A+HBCVGX96Dat/jM8cVEgtK/hrY344JHBsy/hZPH3GHxehxQewYBuLVcaaKM8BDb90cGneIXJZZbvlSDppp/KrfTK/nsXvqM1n5+KjbbCH0G+X2iYLb5TS3OOXCIgrLvkIE1id40jFadI88T7bwmDB/Y/q5Ol68/E8eM2jpCxfb7GKFruhLDtBPrz4ZnmKajC4dDmQRjR1y0np1inrOdx4hsj1kkl2A73X5OYUuC3dzWQnI7gSu8rNR+8lYV3/tVQ63n36cqh6oOY2a1Gukz8QRkTxkO+Zvt+jDHvHWdZWH4E73sFHDJHjAd61rZwHV208YBEnlP8EL2gdb1srMevmJzlVUk57TagfpWP6U07jiowJXFLbtcZl2RJkkTuK2oSIEvGaMCEuCB4TqMIY/Gc4gP4wQ71RXWWPuk2zdK2ZXuv5YtxBD74IBqIJAQlDDjm6yiKgmT5Wm7WZoWrUCFiZOuvJHQxJSikgRGw7wmq4fMBfAz14KptGWCoD2a0TBj+u6tJE3x5tUP/AVgEHvh1qNejZ0ymbsiMf1gBOBbLF7Zcsf0tUH3kQhsAGm9JBa7EiJSZgWLEDp8BFjXbDjRdKB5Q60=")
			.formParam("jschl_vc", "6d192b928eb28ec6e0eaf2b35f5c78fc")
			.formParam("pass", "1626177961.724-Ly1xjatSU7")
			.formParam("jschl_answer", "ovTrGonICecM-8-66e261ebc9850ef4")
			.formParam("cf_ch_verify", "plat")
			.resources(http("request_12")
			.get("/application/view/image/banner/login.jpg")
			.headers(headers_7),
            http("request_13")
			.get("/application/view/image/account/bg_ds.png")
			.headers(headers_7),
            http("request_14")
			.get("/application/view/stylesheet/fonts/SourceSansPro-Regular.ttf")
			.headers(headers_2),
            http("request_15")
			.get("/application/view/javascript/fontawesome/fonts/fontawesome-webfont.woff2?v=4.7.0")
			.headers(headers_2)))
		.pause(4)
		.exec(http("request_16")
			.get("/index.php?route=account/login")
			.headers(headers_6))
		.pause(22)
		.exec(http("request_17")
			.post("/index.php?route=account/login")
			.headers(headers_17)
			.body(RawFileBody("octoperf/0017_request.dat")))
		.pause(8)
		.exec(http("request_18")
			.post("/index.php?route=account/security&member_token=0cf05271ffba58e5992cc6578151df4e")
			.headers(headers_18)
			.body(RawFileBody("octoperf/0018_request.dat")))
		.pause(5)
		.exec(http("request_19")
			.get("/index.php?route=account/logout&member_token=0cf05271ffba58e5992cc6578151df4e")
			.headers(headers_6)
			.resources(http("request_20")
			.get("/application/view/stylesheet/fonts/opencart.ttf?h4wsna")
			.headers(headers_2)))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}