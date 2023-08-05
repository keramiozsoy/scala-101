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



## scala in terminal

- open terminal

```SHELL
scala
```

```SCALA
println("hello world")
```

```SHELL
:quit
```



## scala-multiline-mode


- If you need to run multiple command you can put your code into between { and }.

- open terminal

```SHELL
scala
```

```SCALA
{
print("hello world")
}
```

```
print("hello world")
```

```SCALA

{

print("hello world")

1 + 2

}
```

- hit enter

```SHELL
hello world
val res3: Int = 3
```

## declaring variables

- variable in scala must be declared with eather val or var.

- val is immutable
- var is mutable

```SCALA
val a = 5
```

```SCALA
{

val a = 5

a = 6

}
```

```SHELL
-- [E052] Type Error: ----------------------------------------------------------
5 |a = 6
  |^^^^^
  |Reassignment to val a
```




```SCALA
var b = 10
```


```SHELL
{

var b = 10

b = 11

}
```

- hit enter

```SCALA
var b: Int = 11
b: Int = 11
```



