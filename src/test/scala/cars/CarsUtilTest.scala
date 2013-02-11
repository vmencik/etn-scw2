package cars

import org.scalatest.FunSuite
import CarMaker._
import Drive._
import org.scalatest.matchers.ShouldMatchers

class CarsUtilTest extends FunSuite with ShouldMatchers {

  val models @ List(mas, bmw92, bmw91, porPT, porCGt, por918S) = List(
    CarModel(Maserati, "GranCabrio", 176, 5.33, RWD, 2009, Some(135000)),
    CarModel(BMW, "M3 E92", 183, 4.80, RWD, 2010, Some(75000)),
    CarModel(BMW, "M3 E91", 183, 4.80, RWD, 2010, None),
    CarModel(Porsche, "Panamera Turbo", 188, 3.80, AWD, 2010, Some(135300)),
    CarModel(Porsche, "Carrera GT", 201, 3.80, RWD, 2006, Some(510000)),
    CarModel(Porsche, "918 Spyder", 199, 3.20, AWD, 2013, None))

  test("years") {
    CarsUtils.years(models) should be(Set(2009, 2010, 2006, 2013))
  }

  test("order by make and model") {
    CarsUtils.orderedByMakeAndModel(models) should be(List(
      "BMW M3 E91", "BMW M3 E92",
      "Maserati GranCabrio",
      "Porsche 918 Spyder",
      "Porsche Carrera GT",
      "Porsche Panamera Turbo"))
  }

  test("cars more expesive than 120000$") {
    CarsUtils.moreExpensiveThan(models, 120000) should be(
      List(mas, porPT, porCGt))
  }

  test("models group by maker") {
    CarsUtils.groupByMaker(models) should be(Map(Maserati -> Set(mas), BMW -> Set(bmw92, bmw91), Porsche -> Set(porPT, porCGt, por918S)))
  }

  test("total price by Porsche") {
    CarsUtils.totalPriceByMaker(models, CarMaker.Porsche) should be(135300 + 510000)
  }

}