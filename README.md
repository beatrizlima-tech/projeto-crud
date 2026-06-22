# 📦 CRUD de Produtos com Java, JDBC e MySQL

Projeto desenvolvido para gerenciamento de produtos utilizando Java, JDBC e MySQL, implementando operações completas de CRUD (Create, Read, Update e Delete) com persistência em banco de dados relacional.

A aplicação segue uma arquitetura organizada em camadas, separando responsabilidades entre Controller, Repository, Entity e Factory, aplicando conceitos fundamentais do desenvolvimento backend.

---

## 🚀 Tecnologias Utilizadas

* Java
* Maven
* JDBC
* MySQL
* SQL
* Programação Orientada a Objetos (POO)

---

## 📋 Funcionalidades

### Cadastro de Produtos

Permite registrar novos produtos informando:

* Nome
* Preço
* Quantidade em estoque

### Consulta de Produtos

Lista todos os produtos cadastrados no banco de dados.

### Atualização de Produtos

Atualiza informações de produtos já cadastrados através do identificador único (ID).

### Exclusão de Produtos

Remove produtos da base de dados de forma segura utilizando o ID.

---

## 🏛️ Arquitetura do Projeto

O projeto foi estruturado seguindo o padrão de separação de responsabilidades:

```text
src
│
├── controllers
│   └── ProdutoController
│
├── entities
│   └── Produto
│
├── repositories
│   └── ProdutoRepository
│
└── factories
    └── ConnectionFactory
```

### Camadas

| Camada     | Responsabilidade                  |
| ---------- | --------------------------------- |
| Controller | Receber entradas do usuário       |
| Entity     | Representar os dados da aplicação |
| Repository | Executar operações no banco       |
| Factory    | Gerenciar conexões com o banco    |

---

## 🗄️ Banco de Dados

### Estrutura da Tabela

```sql
CREATE TABLE produtos(
    id INTEGER AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100),
    preco DOUBLE,
    quantidade INTEGER
);
```

### Banco Utilizado

```text
MySQL
```

### Nome do Banco

```text
bd_produtos
```

---

## 🔌 Conexão com Banco de Dados

A conexão é realizada através da classe:

```java
ConnectionFactory
```

Utilizando:

* JDBC
* Driver MySQL Connector/J
* Maven para gerenciamento de dependências

---

## ▶️ Como Executar

### 1. Clonar o projeto

```bash
git clone https://github.com/beatrizlima-tech/projeto-crud.git
```

### 2. Criar o banco

```sql
CREATE DATABASE bd_produtos;
```

### 3. Executar o script da tabela

Disponível no projeto.

### 4. Configurar usuário e senha

Arquivo:

```java
ConnectionFactory.java
```

### 5. Executar a aplicação

A aplicação poderá ser executada diretamente pela IDE.

---

## 📚 Conceitos Praticados

Durante o desenvolvimento foram aplicados:

* Programação Orientada a Objetos
* Encapsulamento
* JDBC
* SQL
* CRUD
* Arquitetura em Camadas
* Conexão com Banco de Dados
* Maven
* Tratamento de Exceções

---

## 🎯 Objetivo

Este projeto foi desenvolvido com foco no aprendizado de integração entre aplicações Java e bancos de dados relacionais, explorando operações CRUD e boas práticas de organização de código backend.

---

## 👩‍💻 Desenvolvedora

**Beatriz Lima**

Desenvolvedora Java Full Stack em formação.

GitHub:
https://github.com/beatrizlima-tech
