# 🏅 API Atlética - Spring Boot & MySQL

Este projeto é um sistema de gerenciamento para a Atlética Universitária da UNINASSAU, permitindo o cadastro, leitura e validação de inscrições de alunos em modalidades esportivas. 

O projeto nasceu de um protótipo em terminal (`projetoX.java`) e evoluiu para uma API robusta utilizando o ecossistema Spring.

## 🚀 Tecnologias Utilizadas

* **Java 21**
* **Spring Boot 4.0**
* **Spring Web** (Criação de endpoints REST)
* **Spring Data JPA** (Persistência de dados e mapeamento ORM)
* **MySQL Driver** (Conexão com o banco de dados relacional)
* **Hibernate** (Geração automática de tabelas)
* **Git & GitHub** (Controle de versão e hospedagem)

## 📌 Funcionalidades Atuais

* [x] Arquitetura baseada em Controllers, Entities e Repositories.
* [x] Conexão automática com banco de dados MySQL (`atletica_db`).
* [x] Criação automática da tabela `aluno` via Hibernate.
* [x] Endpoint de teste para cadastro de registros via Web (`/cadastrar-teste`).
* [x] Endpoint para listagem de dados em formato JSON (`/alunos`).

## 🛠️ Como rodar o projeto

1. Clone o repositório.
2. Configure as credenciais do seu MySQL local no arquivo `src/main/resources/application.properties`.
3. Execute a classe `AtelticaApplication.java`.
4. Acesse `http://localhost:8081/alunos` no seu navegador.

---
*IVANO GABRIEL - @i.gabriel13_ 🚀*