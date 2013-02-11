package cars

object CarsUtils {

  def years(models: List[CarModel]) = models.map(_.year).toSet

  def orderedByMakeAndModel(models: List[CarModel]): List[String] =
    models.map(c => c.carMaker + " " + c.name).sorted

  def moreExpensiveThan(models: List[CarModel], price: Int) =
    models.filter(_.price.exists(_ > price))

  def groupByMaker(models: List[CarModel]): Map[CarMaker.Value, Set[CarModel]] = {
    models.groupBy(_.carMaker).map(v => (v._1 -> v._2.toSet))
  }

  def totalPriceByMaker(models: List[CarModel], maker: CarMaker.Value) = {
    //models.filter(_.carMaker == maker).foldLeft(0)(_ + _.price.getOrElse(0))
    //models.view.filter(_.carMaker == maker).map(_.price.getOrElse(0)).sum

    (for {
      cm <- models.view if cm.carMaker == maker
      price <- cm.price
    } yield price).sum
  }
}