import scala.util.Random

@main def hello: Unit =
  val numbers = List("one","two","three", "four")
  val last = numbers.last

  last match
    case "one" => println("1")
    case "two" => println("2")
    case "three" => println("3")
    case _ => println("4")


// output
// 4

