/*
 * Copyright 2011-2019 GatlingCorp (https://gatling.io)
 *
 * Licensed under the Gatling Highcharts License
 */

package io.gatling.highcharts.series

import io.gatling.highcharts.template.Template

import io.gatling.core.stats._

case class CountsPerSecSeries(runStart: Long, data: Iterable[CountsVsTimePlot], colors: List[String]) {

  val names = List(Series.All, Series.KO, Series.OK)

  def render: String =
    s"[${data.map(renderCountsVsTimePlot).mkString(",")}]"

  def renderCountsVsTimePlot(countsVsTimePlot: CountsVsTimePlot) = {
    import countsVsTimePlot._
    s"[${Template.millisToSeconds(runStart + time)},[$total,$kos, $oks]]"
  }
}
