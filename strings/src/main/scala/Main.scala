@main def hello: Unit =
  
  val first = "AAAA"  // String

  println(first)

  val second = 'B'  // Char

  println(second)

  println(s"Result: $first and $second")  // combine string and char

  println(s"Calculate: ${3 * 5} ") // 

  val multiline = """AAA
                  BBBBB
                      CCCC"""
  

  println(multiline)
  