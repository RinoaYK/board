# Decola Tech 2025 - Board
Board de Tarefas com JAVA - Dio - Decola tech 2025

## Principais Tecnologias
 - **Java 21**
 - **Spring Boot 3.4.3**
 - **Spring Data JPA**
 - **OpenAPI (Swagger)**
 - **MySQL**

## Diagrama de Classes (Domínio da API)

```mermaid
classDiagram
    class Board {
        id: long
        name: string
    }
    class BoardColumn {
        id: long
        name: string
        kind: string
        order: int
    }
    class Card {
        id: long
        title: string
        description: string
        createdAt: OffsetDateTime
    }
    class Block {
        id: long
        blockCause: string
        blockDate: OffsetDateTime
        unblockCause: string
        unblockDate: OffsetDateTime
    }

  Board "1" *-- "N" BoardColumn
  BoardColumn "1" *-- "N" Card
  Card "1" *-- "N" Block
    
```
