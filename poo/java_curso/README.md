## Como rodar este projeto

<div align="center" style="align-items: flex-start;"><img src="https://techstack-generator.vercel.app/java-icon.svg" alt="icon" width="65" height="65" /></div>


### Abordagem 1: usando "package java_curso;"
é importante para o compilador que você não esteja na pasta, pois ele usa essa informação para o link de execução dos pacotes, sempre compile dizendo a pasta, esteja na pasta a cima `java-tips/poo`.
```sh
javac java_curso/Main.java java_curso/Carro.java
```
> Execute o seu código `java_curso.Main`

### Abordagem 2: não usando "package java_curso;"
Nesta abordagem, você pode não utilizar o termo `package` caso os arquivos estejam todos no mesmo diretório, assim simplificando para a execução. *Serve para códigos simples*
```sh
javac .\Main.java .\Carro.java
```
> Execute o seu código `java Main`