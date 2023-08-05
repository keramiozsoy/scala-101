@main def hello: Unit =
  var a = 1
  while (a < 5) {
    println(s"Value of a: $a")
    a = a + 1
  }



// output
//Value of a: 1
//Value of a: 2
//Value of a: 3
//Value of a: 4