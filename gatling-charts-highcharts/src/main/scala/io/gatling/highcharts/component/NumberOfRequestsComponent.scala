/*
 * Copyright 2011-2019 GatlingCorp (https://gatling.io)
 *
 * Licensed under the Gatling Highcharts License
 */

package io.gatling.highcharts.component

import io.gatling.highcharts.template.NumberOfRequestsTemplate

object NumberOfRequestsComponent {
  def apply(numberOfRequestNames: Int) = new HighchartsComponent(new NumberOfRequestsTemplate(numberOfRequestNames))
}
