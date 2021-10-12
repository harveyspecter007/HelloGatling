package requests

import io.gatling.core.Predef._
import io.gatling.http.Predef._

object Google {


  val httpProtocol = http.baseUrl("www.google.com")
  .acceptHeader("");

  val feeder = csv("payloads/searchData.csv").circular;

  val search = feed(feeder)
    .exec(http("searchGoogle")
      .get("search?q=gatling").check(status.is(200)))

  val login = feed(feeder)
    .exec(http("searchGoogle")
      .get("/ServiceLogin").check(status.is(200)))

  val photos = feed(feeder)
    .exec(http("searchGoogle")
      .get("/ServiceLogin").check(status.is(200)))

  val drive = feed(feeder)
    .exec(http("searchGoogle")
      .get("/ServiceLogin").check(status.is(200)))

  val calendar = feed(feeder)
    .exec(http("searchGoogle")
      .get("/ServiceLogin").check(status.is(200)))

  val contacts = feed(feeder)
    .exec(http("searchGoogle")
      .get("/ServiceLogin").check(status.is(200)))

  val sheets = feed(feeder)
    .exec(http("searchGoogle")
      .get("/ServiceLogin").check(status.is(200)))

  val meet = feed(feeder)
    .exec(http("searchGoogle")
      .get("/ServiceLogin").check(status.is(200)))

  val images = feed(feeder)
    .exec(http("searchGoogle")
      .get("/ServiceLogin").check(status.is(200)))


}
