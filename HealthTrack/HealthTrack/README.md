# HealthTrack

Sistema de gerenciamento de saúde desenvolvido em Java via terminal com integração ao MySQL.

## Funcionalidades

* Cadastro de atividades físicas
* Cadastro de dados biométricos
* Cadastro de hábitos de saúde
* Atualização de informações
* Remoção de registros
* Listagem de dados cadastrados
* Integração com banco de dados MySQL
* Navegação por menus interativos
* Estrutura baseada em Programação Orientada a Objetos (OOP)

## Tecnologias Utilizadas

* Java
* MySQL
* JDBC
* VS Code

## Conceitos Aplicados

* Encapsulamento
* Herança
* Classe abstrata
* Separação em camadas
* CRUD completo
* Integração com banco de dados

## Estrutura do Projeto

src/
│
├── App.java
│
├── database/
│   └── Conexao.java
│
├── interfaces/
│   └── Crud.java
│
├── model/
│   ├── RegistroSaude.java
│   ├── AtividadeFisica.java
│   ├── DadoBiometrico.java
│   └── HabitoSaude.java
│
└── service/
    └── HealthService.java

## Encerramento

* Para encerrar o sistema digite 0 no menu principal