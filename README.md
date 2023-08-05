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


## check installed scala

```SHELL
scala --version
```
```SHELL
Scala code runner version 3.3.0 -- Copyright 2002-2023, LAMP/EPFL
```


## scala-repl

- the scala repl ( READ - EVALUATE - PRINT - LOOP ) is a command-line interpreter that you use a test your scala code on terminal.

- open terminal to open repl

```SHELL
scala
```

```SHELL
1 + 2
```



## first scala program

```SHELL
mkdir hello-world && cd hello-world && sbt new scala/scala3.g8
```

- enter project name like below

```SHELL
hello-world
```

- compile scala code

```SHELL
scalac hello-world/src/main/scala/Main.scala
```

- main method name is hello when you looked at the Main.scala

```SHELL
scala hello
```

```SHELL
Hello world!
I was compiled by Scala 3. :)
```

```SHELL
cd ../
```


## first scala program