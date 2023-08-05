@main def hello: Unit =
  val numbers = List(1, 2, 3, 4, 5)

  println(numbers)

  val calculatedNumbers = for i <- numbers yield i * 2

  println(calculatedNumbers)

// output
//List(1, 2, 3, 4, 5)
//List(2, 4, 6, 8, 10)