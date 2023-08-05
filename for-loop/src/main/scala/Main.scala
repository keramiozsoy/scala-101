@main def hello: Unit =

  val numbers = List(1,2,3,4,5)
  
  for i <- numbers do
     println(i)


// output
// 1
// 2
// 3
// 4
// 5