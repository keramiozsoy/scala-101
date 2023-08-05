@main def hello: Unit =
  val numbers = List(1, 2, 3, 4, 5)

  for
    i <- numbers
    if i > 3
    if i < 5
  do
    println(i)