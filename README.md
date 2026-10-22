\# API de Estoque



API REST para gerenciamento de produtos, desenvolvida com Java e Spring Boot.



\## Tecnologias

\- Java 21

\- Spring Boot 4.1

\- Spring Data JPA (Hibernate)

\- PostgreSQL

\- Maven



\## Arquitetura

Organizada em camadas: \*\*Controller\*\* (HTTP) → \*\*Service\*\* (regras de negócio) → \*\*Repository\*\* (acesso ao banco), com injeção de dependência pelo construtor.



\## Endpoints

| Método | Rota | Descrição |

|--------|------|-----------|

| GET | /produtos | Lista todos os produtos |

| GET | /produtos/{id} | Busca um produto por id |

| POST | /produtos | Cadastra um produto |

| PUT | /produtos/{id} | Atualiza um produto |

| DELETE | /produtos/{id} | Remove um produto |



Exemplo de corpo (POST/PUT):

```json

{ "nome": "Teclado", "quantidade": 10, "preco": 89.90 }

```



\## Como rodar

1\. Instale Java 21 e PostgreSQL

2\. Crie um banco chamado `estoque\_db`

3\. Defina a variável de ambiente `DB\_PASSWORD` com a senha do seu PostgreSQL

4\. Na pasta do projeto, rode `mvnw spring-boot:run` (Windows) ou `./mvnw spring-boot:run` (Linux/macOS)

5\. Acesse `http://localhost:8080/produtos`



\## Autor

Dequex Araújo Silva Neto — \[GitHub](https://github.com/Dequex00)

