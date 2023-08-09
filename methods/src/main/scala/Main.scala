@main def hello: Unit = 
  println("Hello world!")

  val msg = sum(1, 2)

  println(msg)

  val retrieved = retrieveParam("ABC")

  print(retrieved)
  
def sum(a: Int, b: Int): Int = a + b

def retrieveParam(word: String): String = "-" + word + "-"
