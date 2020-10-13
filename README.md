# Project Exemplo de Automação :: Selenium Webdriver (:brazil: PT-BR)
> Projeto exemplo desenvolvido para realizar testes automatizados em sistemas web.

## Como usar:

- [Instalação](#instalacao)
- [Funcionalidades](#funcionalidades)
- [Padrões](#padroes)
- [Dependências](#dependencias)
- [Compiladores](#compiladores)
- [Relatórios](#relatórios)
- [Contribuindo](#contribuindo)
- [Time](#time)

---

## Instalacao
### Pre-Requisitos
Deve-se ter instalado em sua maquina local:
- GIT
- MAVEN
- Java8 

---

### Clone

- Clone este repositório para sua máquina local usando comando abaixo:
```
	$ git clone https://github.com/willysalazar/selenium-webdriver-java-example.git
```

---

### Execucao

> Acessar raiz do projeto

```
	$ cd /diretorio/selenium-webdriver-java-example
```
> Realizar comando para executar todos os testes do projeto

```
	$ mvn clean test
```
> Realizar comando para executar apenas o teste de login

```
	$ mvn clean test -Dtest=ElementsTest
```

---

## Funcionalidades
- Elements (:white_check_mark:)
- Forms (:warning: under construction)
- Alerts (:warning:under construction)
- Frame (:warning: under construction)
- Windows (:warning: under construction)
- Widgets (:warning: under construction)
- Interactios (:warning: under construction)

---

## Padroes
- Fluent Page Object
- Factory

---

### Dependencias
Possui algumas dependencias: 
* *selenium* - [Selenium](https://www.selenium.dev/) framework para criar testes automatizados de sistemas Web. 
* *testng* - O framework [TestNG](https://testng.org/) engine de teste, que possui funcionalidades semelhantes ao JUnit e NUnit. 
* *extentreports* - A biblioteca [extentreports](http://www.extentreports.com/) gera os relatórios de teste em tempo real para que você possa analisar seus testes de uma maneira totalmente diferente. 
* *webdrivermanager* - A biblioteca [webdrivermanager](https://github.com/bonigarcia/webdrivermanager) permite automatizar o gerenciamento dos drivers (por exemplo, chromedriver, geckodriver, etc.) exigidos pelo Selenium WebDriver. 
* *lombok* - A biblioteca [Lombok](https://projectlombok.org/) permite automatizar a geração de getters, setters, builders, construtores de forma fácil. 

---

### Compiladores
* *apache-maven* - O sistema de compilacao [Apache Maven](https://maven.apache.org/) esta sendo utilizado para realizar a compilacao e build/test do projeto.
IMPORTANTE: Deve-se ter um repositório maven devidamente configurado. [Para saber mais acesse aqui](https://maven.apache.org/guides/mini/guide-configuring-maven.html). 

---

## Relatórios
* Para visualizar o relatorio dos testes, deve-se acessar o arquivo: */target/report/test_execution.html*

---

## Contribuindo

> Para contribuir com este projeto siga as seguintes etapas

### Etapa 1

- **Opção 1**
    - 🍴 Faça um Fork deste repositório!

- **Opção 2**
    - 👯 Clone este repositório para sua máquina local usando:  `https://github.com/willysalazar/selenium-webdriver-java-example.git`

### Etapa 2

- **Sinta-se livre para codificar!** 🔨🔨🔨

### Etapa 3

- 🔃 Crie um novo pull request usando <a href="https://github.com/willysalazar/selenium-webdriver-java-example/compare/" target="_blank">`https://github.com/willysalazar/selenium-webdriver-java-example/compare/`</a>.

---

## Time

| <a href="https://www.linkedin.com/in/willysalazar/" target="_blank">**Linkedin**</a>  |
| :---: |
| [![Linkedin](https://avatars2.githubusercontent.com/u/6722023?s=200 )](linkedin)    |
| <a href="http://github.com/willysalazar" target="_blank">`github.com/willysalazar`</a> | 


---
