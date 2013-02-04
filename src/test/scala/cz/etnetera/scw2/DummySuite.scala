package cz.etnetera.scw2

import org.scalatest.FunSuite

class DummySuite extends FunSuite {

  test("Our dummy class is really dumb") {
    assert(new Dummy().message === "I'm dumb as nails")
  }

}