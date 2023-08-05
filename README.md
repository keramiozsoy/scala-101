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

## declaring variables

- variable in scala must be declared with eather val or var.

- val is immutable
- var is mutable

```SCALA
val a = 5
```

```SCALA
var b = 10
```

