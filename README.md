# 📦 Projeto CRUD de Produtos

Aplicação desenvolvida em Java para gerenciamento de produtos utilizando JDBC, Maven e MySQL.

O sistema permite realizar operações de cadastro, consulta, atualização e exclusão de produtos armazenados em banco de dados relacional.

## 🚀 Tecnologias Utilizadas

* Java
* Maven
* JDBC
* MySQL
* SQL
* Programação Orientada a Objetos (POO)

## 📋 Funcionalidades

* Cadastrar produtos
* Consultar produtos cadastrados
* Atualizar informações de produtos
* Excluir produtos
* Persistência de dados em banco MySQL
* Conexão com banco de dados utilizando JDBC

## 🏗️ Estrutura do Projeto

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

## 📊 Modelo de Dados

```sql
CREATE TABLE produtos(
    id INTEGER AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100),
    preco DOUBLE,
    quantidade INTEGER
);
```

## 🖥️ Operações Disponíveis

### Cadastro

Permite registrar um novo produto informando:

* Nome
* Preço
* Quantidade

### Consulta

Exibe todos os produtos cadastrados no banco de dados.

### Atualização

Permite alterar os dados de um produto existente através do ID.

### Exclusão

Remove um produto cadastrado utilizando seu ID.

## ⚙️ Configuração do Banco de Dados

Crie um banco de dados chamado:

```text
bd_produtos
```

Execute o script SQL disponível no projeto para criar a tabela de produtos.

Configure as credenciais de acesso na classe:

```java
ConnectionFactory
```

## ▶️ Executando o Projeto

Clone o repositório:

```bash
git clone https://github.com/beatrizlima-tech/projeto-crud.git
```

Acesse a pasta do projeto e execute a aplicação Java.

## 🎯 Objetivo do Projeto

Projeto desenvolvido para praticar:

* Operações CRUD
* JDBC
* Integração Java com MySQL
* Maven
* Programação Orientada a Objetos
* Persistência de dados
* Organização em camadas

## 👩‍💻 Desenvolvedora

Beatriz Lima

GitHub:
https://github.com/beatrizlima-tech
