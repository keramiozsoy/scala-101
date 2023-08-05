@main def hello: Unit =
  // explicit
  val a:Int = 1
  println(a)

  // implicit; the compiler infers the type
  val b = 2 
  println(b)
