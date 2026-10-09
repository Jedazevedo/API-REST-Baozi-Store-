# Baozi Store - API REST

API REST desenvolvida para a disciplina de **Desenvolvimento Web Back-End**. O sistema simula o controle básico de vendas, clientes e produtos para a loja fictícia **Baozi Store**.

---

## Aluno
* **Nome:** Jedson

---

## Tecnologias Utilizadas
* **Linguagem:** Java 17
* **Framework:** Spring Boot
* **Persistência de Dados:** Spring Data JPA
* **Banco de Dados:** H2 Database (In-Memory)
* **Gerenciador de Dependências:** Maven
* **Testes de API:** Postman

---

## Modelo de Dados (DER)

A aplicação é composta por 3 entidades principais:
* **Cliente:** `id`, `nome`, `clienteDesde`
* **Produto:** `id`, `nome`, `preco`, `estoque`
* **Pedido:** `id`, `clienteId`, `produtoId`, `quantidade`

---

## Endpoints da API

### Clientes (`/clientes`)
* `POST /clientes` - Cadastra um novo cliente
* `GET /clientes` - Lista todos os clientes
* `GET /clientes/{id}` - Busca cliente por ID
* `DELETE /clientes/{id}` - Remove um cliente por ID

### Produtos (`/produtos`)
* `POST /produtos` - Cadastra um novo produto
* `GET /produtos` - Lista todos os produtos
* `GET /produtos/{id}` - Busca produto por ID
* `DELETE /produtos/{id}` - Remove um produto por ID

### Pedidos (`/pedidos`)
* `POST /pedidos` - Registra um novo pedido
* `GET /pedidos` - Lista todos os pedidos
* `GET /pedidos/{id}` - Busca pedido por ID
* `DELETE /pedidos/{id}` - Remove um pedido por ID

---

## Como Executar o Projeto

1. Clone o repositório:
   ```bash
   git clone git@github.com:Jedazevedo/API-REST-Baozi-Store-.git
