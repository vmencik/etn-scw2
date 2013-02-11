package cars

case class CarModel(
  carMaker: CarMaker.Value,
  name: String,
  topSpeed: Int,
  zeroTo62: Double,
  drive: Drive.Value,
  year: Int,
  price: Option[Int]) {

  require(name != "", "Model name must not be empty")
  require(topSpeed > 0, "Top speed must be positive")
  require(zeroTo62 > 0, "Zero to 62 must be positive")
  require(price == None || price.get >= 0, "If set, price must be non-negative")
}