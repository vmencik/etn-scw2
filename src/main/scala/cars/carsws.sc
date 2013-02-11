package cars

object carsws {
  val str = "Hello Scala"                         //> str  : String = Hello Scala
  str foreach print                               //> Hello Scala
  str(3)                                          //> res0: Char = l
  
  val add = (a: Int, b: Int) => a + b             //> add  : (Int, Int) => Int = <function2>
  add.apply(2, 4)                                 //> res1: Int = 6
  add(4, 3)                                       //> res2: Int = 7
  
  IndexedSeq(1,2,3)                               //> res3: IndexedSeq[Int] = Vector(1, 2, 3)
  val set = Set(1,2,3,5)                          //> set  : scala.collection.immutable.Set[Int] = Set(1, 2, 3, 5)
  set(4)                                          //> res4: Boolean = false
  
  val m = Map(1 -> "Hello", 2 -> "World")         //> m  : scala.collection.immutable.Map[Int,String] = Map(1 -> Hello, 2 -> World
                                                  //| )
  m(2)                                            //> res5: String = World
  m get 3                                         //> res6: Option[String] = None
  Drive.values                                    //> res7: cars.Drive.ValueSet = Drive.ValueSet(RWD, FWD, AWD)
  
  import collection.mutable
  val mutaSet = mutable.Set(1, 2)                 //> mutaSet  : scala.collection.mutable.Set[Int] = Set(1, 2)
  
  val buf = new mutable.ListBuffer[Int]() ++ List(1, 2, 3)
                                                  //> buf  : scala.collection.mutable.ListBuffer[Int] = ListBuffer(1, 2, 3)
  buf(0) = 3
  buf                                             //> res8: scala.collection.mutable.ListBuffer[Int] = ListBuffer(3, 2, 3)
  
  buf += 5                                        //> res9: cars.carsws.buf.type = ListBuffer(3, 2, 3, 5)
  buf ++= List(10, 11, 12)                        //> res10: cars.carsws.buf.type = ListBuffer(3, 2, 3, 5, 10, 11, 12)
  
  
  val lst = List(1,2) ++ List(3,4) ++ List(5,6)   //> lst  : List[Int] = List(1, 2, 3, 4, 5, 6)
  
  val lview = lst.view                            //> lview  : scala.collection.SeqView[Int,List[Int]] = SeqView(...)
  val lviewFiltered = lview.filter ( _ > 2)       //> lviewFiltered  : scala.collection.SeqView[Int,List[Int]] = SeqViewF(...)
  val lviewFilteredMapped = lviewFiltered.map(_.toString)
                                                  //> lviewFilteredMapped  : scala.collection.SeqView[String,Seq[_]] = SeqViewFM(.
                                                  //| ..)
  lviewFilteredMapped.force                       //> res11: Seq[String] = List(3, 4, 5, 6)
  
 
 for {
 (maker, cars) <- CarsUtils.groupByMaker(models)
 i <- List(1, 2, 3)
 car <- cars if car.year >= 2010
 } yield (maker, car.year + i)                    //> res12: scala.collection.immutable.Map[cars.CarMaker.Value,Int] = Map(Audi ->
                                                  //|  2013, BMW -> 2013, Chevrolet -> 2013, Lamborghini -> 2013, Porsche -> 2016)
                                                  //| 
                                                  
 def numbers(i: Long): Stream[Long] = i #:: numbers(i+1)
                                                  //> numbers: (i: Long)Stream[Long]
 numbers(10).take(5).toList                       //> res13: List[Long] = List(10, 11, 12, 13, 14)
 
 def fib(a: Int, b: Int): Stream[Int] =
   a #:: fib(b, a + b)                            //> fib: (a: Int, b: Int)Stream[Int]
   
 val f = fib(0, 1)                                //> f  : Stream[Int] = Stream(0, ?)
 f.take(10).toList                                //> res14: List[Int] = List(0, 1, 1, 2, 3, 5, 8, 13, 21, 34)
 f                                                //> res15: Stream[Int] = Stream(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ?)
}