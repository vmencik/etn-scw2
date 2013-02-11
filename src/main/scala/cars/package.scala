import scala.language.implicitConversions

package object cars {

  // source: http://nfs.wikia.com/wiki/Need_for_Speed:_Hot_Pursuit_(2010)/Cars
  val models = {
    import CarMaker._
    import Drive._

    implicit def intToSomeInt(n: Int) = Some(n)
    val Classified = None

    List(
      CarModel(Porsche, "Boxter Spyder", 166, 4.90, RWD, 2010, 65000),
      CarModel(BMW, "Z4 sDrive35is", 166, 4.93, RWD, 2010, 62500),
      CarModel(Porsche, "Cayman S", 171, 4.60, RWD, 2010, 65000),
      CarModel(Chevrolet, "Camaro SS", 180, 4.72, RWD, 2010, 55000),
      CarModel(Audi, "TT RS", 185, 4.63, AWD, 2010, 65000),
      CarModel(Maserati, "GranCabrio", 176, 5.33, RWD, 2009, 135000),
      CarModel(BMW, "M3 E92", 183, 4.80, RWD, 2010, 75000),
      CarModel(Porsche, "Targa 4S", 183, 4.70, AWD, 2008, 108880),
      CarModel(Maserati, "GranTurismo S Automatic", 183, 4.90, RWD, 2009, 135000),
      CarModel(Porsche, "Panamera Turbo", 188, 3.80, AWD, 2010, 135300),
      CarModel(Porsche, "911 Turbo S Cabriolet", 196, 3.20, AWD, 2011, 146800),
      CarModel(Chevrolet, "Corvette Grand Sport", 188, 4.00, RWD, 2010, 59530),
      CarModel(Audi, "R8 Apyder 5.2 FSI quattro", 195, 4.00, AWD, 2010, 160000),
      CarModel(AstonMartin, "DBS Volante", 191, 4.30, RWD, 2009, 286740),
      CarModel(Lamborghini, "Gallardo LP 550-2 Valentino Balboni", 199, 3.90, RWD, 2009, 219800),
      CarModel(Lamborghini, "Gallardo LP 560-4 Coupe", 202, 3.70, AWD, 2009, 200000),
      CarModel(Porsche, "911 GT3 RS", 193, 3.80, RWD, 2010, 135000),
      CarModel(Lamborghini, "Gallardo LP 560-4 Spyder", 201, 3.90, AWD, 2009, 240000),
      CarModel(BMW, "M6 COnvertible", 200, 4.60, RWD, 2007, 104400),
      CarModel(AstonMartin, "V12 Vantage", 190, 4.20, RWD, 2009, 220000),
      CarModel(Lamborghini, "Gallardo LP 570-4 Superleggera", 201, 340, AWD, 2010, 270000),
      CarModel(Porsche, "918 Spyder", 199, 3.20, AWD, 2013, Classified),
      CarModel(Porsche, "Carrera GT", 201, 3.80, RWD, 2006, 510000),
      CarModel(Lamborghini, "Murciélago LP 650-4 Roadster", 201, 3.40, AWD, 2009, 416300),
      CarModel(Lamborghini, "Murciélago LP 640-4", 211, 3.70, AWD, 2006, 360000),
      CarModel(Chevrolet, "Corvette ZR1", 205, 3.40, RWD, 2009, 115000))
  }

}
