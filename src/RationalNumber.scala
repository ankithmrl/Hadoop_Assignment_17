

object RationalNumber {
    def main(args: Array[String]): Unit = {
    println("Hello, world!")
    
    val x = new Rational(2, 3)
    val y = new Rational(3, 4)
    
    val a = x * x
    println("Result a: " +a)
    
    val b = a * 2
    println("Result b: " +b)
    
    val z = (x + y) * x
    println("Result z: " +z)
    
    implicit def intToRational(x: Int) = new Rational(x)
    val r = new Rational(2,3)
    val s = 2 * r
    println("Result s: " +s)
    
  }
}