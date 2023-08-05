# scala-101

- https://www.scala-lang.org/download


```SHELL
wget https://github.com/lampepfl/dotty/releases/download/3.3.0/scala3-3.3.0.zip
cd $HOME
ls -ltr
unzip scala3-3.3.0.zip
rm scala3-3.3.0.zip
sudo mv -f scala3-3.3.0 /opt
sudo chown ${USER}:${USER} -R /opt/scala3-3.3.0
sudo ln -s /opt/scala3-3.3.0 scala
```

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


```SHELL
cd $HOME/scala-101/var-type
```

## val type 

- val type is immutable.

-  run below code which wil not work.

```SHELL
cd $HOME/scala-101/val-type
```
