/*
 * Copyright 2011-2019 GatlingCorp (https://gatling.io)
 *
 * Licensed under the Gatling Highcharts License
 */

package io.gatling.highcharts.series

import io.gatling.core.stats._

class StackedColumnSeries(name: String, data: Iterable[PieSlice], color: String) extends ColumnSeries(name, data, List(color)) {

  def elements: Iterable[String] = data.map(_.value.toString)
}
