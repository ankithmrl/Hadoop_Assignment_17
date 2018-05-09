

class Rational(n: Int, d: Int) {
    
  def this(n: Int) = this(n, 1)    // auxiliary constructors
    private def gcd(a: Int, b: Int): Int =
    if (b == 0) a else gcd(b, a % b)
    private val g = gcd(n, d)
    
  val numer: Int = n / g
  val denom: Int = d / g
  
  // All possibilities listed down as a part of method overloading.
  
  def +(that: Rational): Rational =
  new Rational(numer * that.denom + that.numer * denom, denom * that.denom)
  
  def -(that: Rational): Rational =
  new Rational(numer * that.denom - that.numer * denom, denom * that.denom)
  
  def *(that: Rational): Rational =
  new Rational(numer * that.numer, denom * that.denom)
  
  def /(that: Rational): Rational =
  new Rational(numer * that.denom, denom * that.numer)
    
  def +(that: Int): Rational = this + new Rational(that)
  
  def -(that: Int): Rational = this - new Rational(that)
  
  def *(that: Int): Rational = this * new Rational(that)
  
  def /(that: Int): Rational = this / new Rational(that)
    
  override def toString() = numer+"/"+denom
    
}