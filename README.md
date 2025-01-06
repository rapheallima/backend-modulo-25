# Módulo 25: Projeto: Sistema Genérico de DAO e Serviço

## Descrição
Este projeto é uma implementação genérica de um sistema de DAO (*Data Access Object*) e serviços utilizando Java. Ele foi desenvolvido com foco em flexibilidade e reutilização de código, permitindo que diferentes entidades possam ser gerenciadas de forma consistente e eficiente.

## Funcionalidades
- **CRUD Genérico**: Operações de Cadastro, Consulta, Atualização e Exclusão para qualquer entidade que implemente a interface `Persistente`.
- **Mapeamento Genérico**: Utilização de um `SingletonMap` para armazenar e gerenciar entidades em memória.
- **Anotações Customizadas**: Uso da anotação `@TipoChave` para identificar o campo chave das entidades.
- **Tratamento de Exceções**: Implementação de exceções personalizadas, como `TipoChaveNaoEncontradaException`, para melhor controle de erros.

## Estrutura do Projeto
### Pacotes
- **`generic`**: Contém as interfaces e classes genéricas para DAO.
  - `IGenericDAO`: Interface genérica para operações de CRUD.
  - `GenericDAO`: Implementação abstrata do DAO genérico.
- **`genericS`**: Contém a lógica genérica de serviços.
  - `GenericService`: Classe abstrata para lógica de negócios genérica.
- **`Service`**: Implementação de serviços específicos para entidades.
  - `ProdutoService`: Serviço específico para a entidade `Produto`.
  - `IProdutoService`: Interface para o serviço de `Produto`.
- **`Main`**: Contém as entidades do sistema.
  - `Produto`: Exemplo de entidade que estende `Persistente`.
- **`dao`**: Contém classes relacionadas à persistência.
  - `Persistente`: Classe base para todas as entidades persistentes.
- **`exceptions`**: Exceções personalizadas.
  - `TipoChaveNaoEncontradaException`: Exceção para chaves ausentes.
- **`anotacao`**: Definições de anotações customizadas.
  - `@TipoChave`: Anotação para marcar o campo chave de uma entidade.

## Requisitos
- **Java 8 ou superior**.
- **IDE compatível** (Eclipse, IntelliJ, etc.).

## Como Executar
1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/sistema-generico-dao-servico.git
