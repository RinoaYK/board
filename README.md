# Decola Tech 2025 - Board
Board de Tarefas com JAVA - Dio - Decola tech 2025

## Principais Tecnologias
 - **Java 21**
 - **Spring Boot 3.4.3**
 - **Spring Data JPA**
 - **Liquibase**
 - **MySQL**

## Diagrama de Classes (Domínio da API)

```mermaid
classDiagram
    class Board {
        id: long
        name: string
    }
    class BoardColumns {
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
        blockedAt: OffsetDateTime
        blockReason: string
        unblockedAt: OffsetDateTime
        unblockReason: string
    }

  Board "1" *-- "N" BoardColumns
  BoardColumns "1" *-- "N" Card
  Card "1" *-- "N" Block
    
```
