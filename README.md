# 🚀 Spring CRUD API

API RESTful desenvolvida com Spring Boot, utilizando PostgreSQL como banco de dados e Docker para containerização.

## 📌 Sobre o projeto

Este projeto tem como objetivo demonstrar a construção de uma API backend completa com operações CRUD (Create, Read, Update, Delete), seguindo boas práticas de desenvolvimento com Spring Boot.

APIs CRUD são fundamentais no desenvolvimento backend, permitindo criar, listar, atualizar e remover dados através de endpoints REST .

## 🛠️ Tecnologias utilizadas
Java 21
Spring Boot
Spring Data JPA
PostgreSQL
Docker
Maven
## ⚙️ Funcionalidades
✅ Criar registro
✅ Listar registros
✅ Buscar por ID
✅ Atualizar dados
✅ Deletar registro
## 📁 Estrutura do projeto
src/
 ├── controller   → Camada de entrada (API REST)
 ├── service      → Regras de negócio
 ├── repository   → Acesso ao banco de dados
 ├── model/entity → Entidades
## ▶️ Como executar o projeto
🔹 Pré-requisitos
Java 21
Maven
Docker
🔹 Rodando com Docker 🐳
docker-compose up -d
🔹 Rodando localmente
mvn spring-boot:run

## A API estará disponível em:

http://localhost:8080
## 📡 Endpoints (exemplo)
GET     /api
POST    /api
GET     /api/{id}
PUT     /api/{id}
DELETE  /api/{id}


