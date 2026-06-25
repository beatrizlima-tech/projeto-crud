# 📦 CRUD de Produtos

![Java](https://img.shields.io/badge/Java-21-red?style=for-the-badge\&logo=openjdk)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-Database-blue?style=for-the-badge\&logo=postgresql)
![JDBC](https://img.shields.io/badge/JDBC-Database-orange?style=for-the-badge)
![Maven](https://img.shields.io/badge/Maven-Build-red?style=for-the-badge\&logo=apachemaven)
![Build](https://img.shields.io/badge/build-passing-brightgreen?style=for-the-badge)
![License](https://img.shields.io/badge/license-MIT-lightgrey?style=for-the-badge)

---

# 📌 Sobre o projeto

O **CRUD de Produtos** é uma aplicação desenvolvida em **Java** para gerenciamento de produtos, implementando as operações de cadastro, consulta, atualização e exclusão de registros em um banco de dados PostgreSQL utilizando JDBC.

O projeto foi desenvolvido com foco na prática de Programação Orientada a Objetos, integração com banco de dados relacional, arquitetura em camadas e boas práticas na organização do código.

---

# 🚀 Funcionalidades

* Cadastro de produtos
* Consulta de produtos cadastrados
* Atualização de produtos
* Exclusão de produtos
* Persistência em banco de dados PostgreSQL
* Interface baseada em menu via console

---

# 🧱 Tecnologias utilizadas

* Java
* JDBC
* PostgreSQL
* SQL
* Maven
* Programação Orientada a Objetos (POO)

---

# 🏗️ Estrutura do projeto

```text
src/

├── controllers
│   └── ProdutoController
│
├── entities
│   └── Produto
│
├── factories
│   └── ConnectionFactory
│
└── repositories
    └── ProdutoRepository
```

---

# 🔗 Funcionalidades disponíveis

| Operação    | Descrição                         |
| ----------- | --------------------------------- |
| Cadastro    | Inserção de novos produtos        |
| Consulta    | Listagem dos produtos cadastrados |
| Atualização | Alteração de produtos existentes  |
| Exclusão    | Remoção de produtos pelo ID       |

---

# ⚙️ Como executar o projeto

### 1. Clone o repositório

```bash
git clone https://github.com/beatrizlima-tech/projetoCrud.git
```

### 2. Crie o banco de dados

```sql
CREATE DATABASE bdaula03;
```

### 3. Execute o script SQL

Utilize o script disponível no projeto para criar a tabela **produtos**.

### 4. Configure a conexão

Caso necessário, altere os dados da classe:

```text
ConnectionFactory.java
```

com as credenciais do seu PostgreSQL.

### 5. Execute a aplicação

Abra o projeto em uma IDE Java (IntelliJ IDEA ou Eclipse) e execute a classe principal.

---

# 🗄️ Banco de dados

Tabela utilizada:

```sql
CREATE TABLE produtos(
    id SERIAL PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    preco NUMERIC(10,2) NOT NULL,
    quantidade INTEGER NOT NULL,
    data_criacao TIMESTAMP DEFAULT NOW()
);
```

Banco de dados:

```text
PostgreSQL
```

---

# 📊 Arquitetura

```text
Usuário
   │
   ▼
Controller
   │
   ▼
Repository
   │
   ▼
JDBC
   │
   ▼
PostgreSQL
```

---

# 📚 Conceitos aplicados

* Programação Orientada a Objetos
* Encapsulamento
* JDBC
* SQL
* CRUD
* Arquitetura em Camadas
* Manipulação de dados em banco relacional
* Tratamento de exceções
* Organização em pacotes

---

# 📌 Melhorias futuras

* Implementar validações de entrada
* Adicionar interface gráfica
* Migrar JDBC para Spring Data JPA
* Criar testes automatizados
* Dockerizar a aplicação

---

# 👩‍💻 Autora

Desenvolvido por **Beatriz Lima**

🔗 GitHub
https://github.com/beatrizlima-tech

💼 LinkedIn
https://www.linkedin.com/in/beatrizlima-tech
