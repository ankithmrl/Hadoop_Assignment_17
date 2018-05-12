
class MatchinDemo{ 
  
  def matchTest(x: String): String = x match {
    case "Android App Development" => "14,999 INR"
    case "Data Science" => "49,999 INR"
    case "Big Data Hadoop & Spark Developer" => "24,999 INR"
    case "Blockchain Certification" => "49,999 INR"
    case _ => "Please enter relavent course name"
  }
}

object MatchinDemo {
  def main(args: Array[String]){
      val md = new MatchinDemo()
      
      println("Course Name: " + "Android App Development" + "\nCourse Fee: "+md.matchTest("Android App Development"))
      println("Course Name: " + "Data Science" + "\nCourse Fee: "+md.matchTest("Data Science"))
      println("Course Name: " + "Big Data Hadoop & Spark Developer" + "\nCourse Fee: "+md.matchTest("Big Data Hadoop & Spark Developer"))
      println("Course Name: " + "Blockchain Certification" + "\nCourse Fee: "+md.matchTest("Blockchain Certification"))
      println("Course Name: " + "Java Concepts" + "\nCourse Fee: "+md.matchTest("Java Concepts"))
      
  }
}