/*
 * Copyright 2011-2019 GatlingCorp (https://gatling.io)
 *
 * Licensed under the Gatling Highcharts License
 */

package io.gatling.highcharts.component

import io.gatling.core.stats._
import io.gatling.highcharts.series.NumberPerSecondSeries
import io.gatling.highcharts.template.Template

class AllUsersComponent(runStart: Long, series: Series[IntVsTimePlot]) {

  def getJavascript: String = {
    val numberPerSecondSeries = new NumberPerSecondSeries(series.name, series.data, series.colors.head)
    s"""allUsersData = {
    ${Template.renderUsersPerSecondSeries(runStart, numberPerSecondSeries)}
    , zIndex: 20
    , yAxis: 1
};"""
  }
}
