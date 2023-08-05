@main def hello: Unit =
  val x = 10
  if x < 0 then
    println("x is negative")
  else if x == 0 then
    println ("x is zero")
  else
    println("x is positive")