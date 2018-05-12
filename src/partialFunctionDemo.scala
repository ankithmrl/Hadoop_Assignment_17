

class partialFunction{
  val addConstantTo: PartialFunction[(Int, Int), Int] = {
      case (a, b) => a + b + 5
  }    
  
  def squareIt(x: Int) = x*x
}

object partialFunctionDemo {
  def main(args: Array[String]){
      val pf = new partialFunction()
      
      println("Sum of three numbers: "+pf.addConstantTo(1,2))
      
      val res = pf.squareIt(pf.addConstantTo(1,2))
      println("Final Square: "+res)
  }  
}