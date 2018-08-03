package foo

object Pain {
  
  object WibbleConstructor {
    def apply(x: Int): Wibble =
      new Wibble(x)
  }

  val Wibble = WibbleConstructor

  def main(args: Array[String]): Unit = {

    val w1 = new Wibble(1)
    val w2 = Wibble.apply(2)
    val w3 = Wibble(3)

    List(w1,w2,w3).foreach(println)

  }
}


