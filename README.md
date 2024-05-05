# Exercícios de Arquivos - Sistemas Operacionais 1

<div align="center">
  
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Windows](https://img.shields.io/badge/Windows-000?style=for-the-badge&logo=windows&logoColor=2CA5E0)

</div>

## Sobre o projeto
Este projete contem a lista 1 de exercícios, sobre arquivos e diretórios, da materia de Sistemas Operacionais 1 do curso de Análise e desenvolvimento de sistemas da FATEC Zona Leste.<br>

## Índice
=================
<!--ts-->
* [Título](#exercícios-de-arquivos--sistemas-operacionais-1)
* [Sobre o Projeto](#sobre-o-projeto)
* [Índice](#índice)
* [Exercícios](#exercícios)
* [Status do projeto](#status-do-projeto)
* [Tecnologias](#tecnologias)
* [Agradecimentos](#agradecimentos)
* [Autor](#autor)
<!--te-->

## Exercícios
1) Fazer uma aplicação Java que leia o arquivo generic_food.csv, que deve estar na pasta C:\TEMP (A
existência da pasta e do arquivo na pasta devem ser validadas), selecione cada linha, verifique se o
alimento é do GROUP Fruits, se for, deve exibir no console, em formato tabular:<br>

FOOD NAME tabulação SCIENTIFIC NAME tabulação SUBGROUP

Exemplo:

![image](https://github.com/thiagosilvaantenor/ArquivosExercicios-1-SO1/assets/99970279/6a3f32ee-8d07-4ab8-b576-0a837536008d)

Dataset: https://drive.google.com/open?id=1fsyrpTXbJuUcLa0TZKcu0g4aNLnNmiuB&usp=drive_fs

<hr>

2) O Arquivo SteamCharts.csv contém informações sobre popularidade dos jogos na plataforma Steam, estão
contempladas as informações e divididas por ano e por mês. São mais de 83 mil registros de jogos.<br>
São interessantes para a nossa análise o nome do jogo, o ano, o mês e a média de jogadores ativos (avg).<br>

Fazer uma solução em java que tenha, na classe de controle (`SteamController`), um método que receba como
parâmetros o ano, o mês e um valor esperado para a média e exiba no console, no seguinte formato: *(Nome
do jogo | Média de jogadores ativos)* desde que o ano e o mês estejam de acordo com os parâmetros e a
média de jogadores ativos seja maior ou igual ao parâmetro passado.

A classe de controle deve ter um outro método que receba o ano, o mês, um caminho de diretório válido e
um nome de arquivo válido. O método deve filtrar as linhas de acordo com o mês e o ano inseridos pelo
usuário e deve gerar um arquivo (nome.csv), no diretório válido (A existência do diretório deve ser validada),
com o seguinte formato: nome do jogo ; média dos jogadores ativos

Uma classe de visão (`Principal.java`) deve ser criada com um método Main que permita realizar as
operações

Dataset: https://drive.google.com/file/d/1QT29x3lMj4_j9Ca9XRyjWzuUjtTjNi58/view?usp=sharing

## Status do projeto
  🚧Em construção🚧
* Exercícios: 2
* Exercícios completos na versão atual: 1


* Projeto utiliza o padrão **MVC** *(Model View Controller)*, todos os arquivos estão dentro do diretório **src**
  * Dentro do pacote **view** está a camada de interacao direta com o usuario:
    * Na classe `Arquivos`:
      * É criado as variaveis do caminho e nome do arquivo que será utilizado no exercicio 1
      * É criado uma instancia de `ArquivosController`
      * É chamado o método `exibirFrutas()`, dentro dos blocos `try catch`
    
  * Dentro do pacote **controller** estão as classes com métodos, que serão instanciada na camada **view**:  
    * Na classe `ArquivosController`:
    
      * O método `exibirFrutas()` vai:
        * Receber como parâmetro diretorio e o nome do arquivo
        * Verificar se ambos existem e se são diretorio e arquivo, caso não passem em alguma das verificações, é lançado uma exceção adequada a verificação
        * Caso passem na verificação, é realizado a leitura de cada linha do arquivo atráves das instancias de: `FileInputStream, InputStreamReader e BufferedReader`
        * Durante a leitura é verificado se a linha atual contem `Fruits`
        * Caso sim: atráves do `linha.split(";")` cada item da linha é separado em um vetor e utilizando o `StringBuffer` é criado a saída com as informações pedidas,<br>transformando o `StringBuffer` em string é exibido no terminal a saída do *exercício 1*
        * Caso não: se prossegue para a proxima linha do arquivo
    


## Tecnologias
- [Java](https://www.oracle.com/br/java/)
  - [File](https://docs.oracle.com/javase/8/docs/api/java/io/File.html)
  - [FileInputStream](https://docs.oracle.com/javase/8/docs/api/java/io/FileInputStream.html)
  - [InputStreamReader](https://docs.oracle.com/javase/8/docs/api/java/io/InputStreamReader.html)
  - [BufferedReader](https://docs.oracle.com/javase/8/docs/api/java/io/BufferedReader.html)
  - [StringBuffer](https://docs.oracle.com/javase/8/docs/api/java/lang/StringBuffer.html)
  - [IOException](https://docs.oracle.com/javase/8/docs/api/java/io/IOException.html?is-external=true)

- [Git](https://git-scm.com) 

## Agradecimentos
Agradeço ao professor da disciplina de Sistemas Operacionais 1, [Leandro Colevati dos Santos](https://www.leandrocolevati.com.br/index.jsp), por todo o aprendizado passado.

## Autor

<div align="center">
<a href="https://www.linkedin.com/in/thiago-antenor/">
<img style="border-radius: 50%;" src="https://avatars.githubusercontent.com/u/99970279?v=4" width="100px;" alt="foto do autor"/>
 <br />
 <sub><b>Thiago Silva Antenor</b></sub></a> <a href="https://www.linkedin.com/in/thiago-antenor/" title="Linkedin"> 🧑🏾‍💻</a>


Feito por Thiago Silva Antenor 👨🏾‍💻 Entre em contato!

[![Linkedin Badge](https://img.shields.io/badge/-Thiago-blue?style=flat-square&logo=Linkedin&logoColor=white&link=https://www.linkedin.com/in/thiago-antenor/)](https://www.linkedin.com/in/thiago-antenor/) 
[![Gmail Badge](https://img.shields.io/badge/-thiagoantenor31@gmail.com-c14438?style=flat-square&logo=Gmail&logoColor=white&link=mailto:thiagoantenor31.com)](mailto:thiagoantenor31.com)
</div>
