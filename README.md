# scala-101

- https://www.scala-lang.org/download


```SHELL
cd $HOME
wget https://github.com/lampepfl/dotty/releases/download/3.3.0/scala3-3.3.0.zip
ls -ltr
unzip scala3-3.3.0.zip
rm scala3-3.3.0.zip
sudo mv -f scala3-3.3.0 /opt
sudo chown ${USER}:${USER} -R /opt/scala3-3.3.0
sudo ln -s /opt/scala3-3.3.0 scala
```SHELL
