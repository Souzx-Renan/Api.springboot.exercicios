Autores:

Renan Souza. RA: 24042082-2

Filipe Mello. RA: 24159233-2

# API REST com Spring Boot — Exercícios de CRUD

Este projeto consiste em uma API REST desenvolvida com **Spring Boot** com o objetivo de consolidar conceitos de **JPA (Java Persistence API)**, **arquitetura em camadas** e operações **CRUD**.

---

## Stack Tecnológica

- Java
- Spring Boot
- Spring Data JPA
- Banco de dados relacional (H2 ou configurável)
- Maven ou Gradle
- Postman (para testes)

---

## Arquitetura

O projeto segue o padrão de arquitetura em camadas:

- **Entity** → Representação das tabelas no banco (JPA)
- **Repository** → Interface de acesso a dados (JpaRepository)
- **Service** → Regras de negócio e operações CRUD
- **Controller** → Exposição dos endpoints REST

Cada módulo contém:
- entity
- repository
- service
- controller

---

## Domínios Implementados

### Cliente
- nome
- email
- telefone

### Categoria
- nome
- descricao

### Fornecedor
- nomeFantasia
- cnpj
- contato

### Departamento
- nome
- localizacao

### Projeto
- nome
- dataInicio (LocalDate)
- dataFim (LocalDate)

### Tarefa
- descricao
- dataVencimento (LocalDate)
- concluida (Boolean)

---

## Endpoints REST

Todos os recursos seguem o padrão RESTful:

| Método | Endpoint         | Descrição            |
|--------|------------------|---------------------|
| POST   | /{recurso}       | Criar novo registro |
| GET    | /{recurso}       | Listar todos        |
| GET    | /{recurso}/{id}  | Buscar por ID       |
| DELETE | /{recurso}/{id}  | Remover por ID      |

### Exemplos:
- /clientes
- /fornecedores
- /projetos
- /tarefas

---

## Exemplo de Requisição

### POST /clientes

```json
{
  "nome": "Davy Jones",
  "email": "davyjones@gmail.com",
  "telefone": "44999999999"
}

