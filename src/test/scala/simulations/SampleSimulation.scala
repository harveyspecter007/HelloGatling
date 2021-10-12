package simulations

import io.gatling.core.Predef._
import requests.Google
import scala.concurrent.duration._

class SampleSimulation extends Simulation {


  val ss = scenario("SearchGoogle")

    during(1)
      {
        exec(
        Google.search,
        Google.login,
        Google.photos,
        Google.drive,
        Google.sheets,
        Google.images,
        Google.meet,
        Google.contacts,
        Google.calendar)
      }


  setUp(ss.inject(rampUsers(100) during (10)).protocols(Google.httpProtocol))
    .assertions(global.successfulRequests.percent.gt(95))


}
