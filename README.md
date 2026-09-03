# 📚 Sistema de Gerenciamento de Livraria (Java)

Sistema de console desenvolvido em Java com foco na aplicação prática dos princípios de **Programação Orientada a Objetos (POO)** e separação de responsabilidades.

---

## 🎯 Funcionalidades

- **Cadastro de Livros:** Geração incremental e automática de identificadores únicos (IDs).
- **Listagem do Catálogo:** Exibição estruturada com status dinâmico de disponibilidade.
- **Empréstimo de Livros:** Validação de existência prévia no acervo e checagem de disponibilidade.
- **Devolução de Livros:** Atualização de status e bloqueio contra devoluções redundantes.

---

## 🏗️ Arquitetura e Decisões de Design

O projeto adota separação clara de papéis entre três camadas:

- **`Livro.java` (Entidade / Domínio):** Encapsulamento de atributos (`private`), getters para consulta e métodos de negócio próprios (`emprestar()` e `devolver()`).
- **`LivrariaService.java` (Camada de Serviço):** Gerenciamento da coleção (`ArrayList<Livro>`), busca por ID e validação das regras operacionais.
- **`Main.java` (Interface CLI):** Entrada e saída de dados via terminal usando `Scanner`, controle de fluxo por `while` e direcionamento via `switch-case`.

---

## 🚀 Como Executar

1. Clone o repositório:
   ```bash
   git clone [https://github.com/DPaes26/sistema-livraria-java.git](https://github.com/DPaes26/sistema-livraria-java.git)