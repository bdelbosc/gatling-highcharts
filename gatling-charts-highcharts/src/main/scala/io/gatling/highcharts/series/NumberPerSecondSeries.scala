/*
 * Copyright 2011-2019 GatlingCorp (https://gatling.io)
 *
 * Licensed under the Gatling Highcharts License
 */

package io.gatling.highcharts.series

import io.gatling.core.stats._

class NumberPerSecondSeries(name: String, data: Iterable[IntVsTimePlot], color: String) extends Series[IntVsTimePlot](name, data, List(color))
