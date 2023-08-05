# scala-101

- <https://www.scala-lang.org/download>

## clone project on your local

```SHELL
cd $HOME && git clone https://github.com/keramiozsoy/scala-101.git && cd scala-101
```

## check installed scala

```SHELL
scala --version
```

```SHELL
Scala code runner version 3.3.0 -- lsCopyright 2002-2023, LAMP/EPFL
```

## scala-repl

- the scala repl ( READ - EVALUATE - PRINT - LOOP ) is a command-line interpreter that you use a test your scala code on terminal.

- open terminal to open repl

```SHELL
scala
```

- code

```SHELL
1 + 2
```

- ouput

```SHELL
val res0: Int = 3
```

- code

```SHELL
var a = 2 * 5
```

- output

```SHELL
var a: Int = 10
```

## first scala program with sbt

- The sbt help to run our project when we have one or multiple files

```SHELL
cd $HOME
```

- create project

```SHELL
sbt new scala/scala3.g8
```

- enter project name like below

```SHELL
hello-world
```

- go to file that have .sbt extension

```SHELL
cd hello-world
```

```SHELL
sbt clean && sbt run
```

```SHELL
Hello world!
I was compiled by Scala 3. :)
```

## var type

- var type is immutable.

- run below code. value of variable is changed.

```SCALA
  var a = 0;
  
  a = 5;
```

```SHELL
cd $HOME/scala-101/var-type
```

```SHELL
sbt clean && sbt run
```

## val type

- val type is immutable.

- run below code which wil not work.

```SHELL
  val a = 0

  a = 5; // wrong
```

```SHELL
cd $HOME/scala-101/val-type/src/main/scala
```

```SHELL
sbt clean && sbt run
```

## declaring variable

If you dont want to give type, compiler will understand, no problem

```SCALA
  // explicit
  val a:Int = 1

  // implicit; the compiler infers the type
  val b = 2 
```

```SHELL
cd $HOME/scala-101/declaring-variable 
```

```SHELL
sbt clean && sbt run
```

## strings

- You can use one character or sentence or multiline to define.

```SHELL
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
```

- output

```SHELL
AAAA
B
Result: AAAA and B
Calculate: 15
AAA
                  BBBBB
                      CCCC
```



```SHELL
cd $HOME/scala-101/strings
```

```SHELL
sbt clean && sbt run
```


## if else condition

- The if/else statement executes a block of code if a specified condition is true. If the condition is false, another block of code can be executed.

```SCALA
  val x = 10
  if x < 0 then
    println("x is negative")
  else if x == 0 then
    println ("x is zero")
  else
    println("x is positive")
```

- output

```SHELL
x is positive
```


```SHELL
cd $HOME/scala-101/if-else
```

```SHELL
sbt clean && sbt run
```





## for loop condition

- let's assume that we have got list of numbers and,
we will print all values. for condition helps to do it.


- for -> it starts loop
- do  -> to do something while for loop continue, like body of for loop

```SHELL
cd $HOME/scala-101/for-loop
```

```SHELL
sbt clean && sbt run
```

## for loop guards condition

- Guards which helps when you need to use multiple if expression on for loop.


```SHELL
cd $HOME/scala-101/for-loop-guards
```

```SHELL
sbt clean && sbt run
```
