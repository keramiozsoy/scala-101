import scala.io.Source

@main
def hello: Unit =
  try {
    val text = Source.fromFile("test.txt")
  }catch {
    case e: Exception => println("Problem occurred while reading file" + e)
  }finally {
    println("progress is done")
  }


// output

// Problem occurred while reading filejava.io.FileNotFoundException: test.txt (No such file or directory)
// progress is done
