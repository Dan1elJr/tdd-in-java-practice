# 🧪 TDD in Java — Engineering Practice

Repositório focado na prática de **Test Driven Development (TDD)** aplicado ao desenvolvimento backend em **Java**.

O projeto explora como **testes unitários guiam o design do código**, utilizando **JUnit** e **Mockito** para validar comportamento, isolar dependências e garantir regras de negócio confiáveis.

---

# 🚀 O que este repositório demonstra

* Desenvolvimento orientado a testes (**TDD**)
* Escrita de **testes unitários robustos**
* **Isolamento de dependências** com mocks
* Verificação de **interações entre componentes**
* Validação de **exceções e regras de negócio**

---

# 🔬 Práticas exploradas

## Test Driven Development

Aplicação do ciclo clássico:

```
Red → Green → Refactor
```

1. Escrever um teste que falha
2. Implementar o mínimo necessário para passar
3. Refatorar mantendo os testes verdes

---

## Unit Testing

Principais abordagens utilizadas:

* Testes de comportamento
* Validação de resultados esperados
* Testes de exceções com `assertThrows`
* Organização clara de cenários de teste

---

## Mockito (Mocking & Behavior Verification)

Uso de **Mockito** para simular dependências e validar interações:

* Criação de **mocks**
* **Stubbing** de métodos
* Verificação com `verify`
* Uso de `doCallRealMethod` para execução parcial de métodos reais

Essas técnicas permitem testar **serviços isoladamente**, sem dependência de infraestrutura externa.

---

# 🧱 Estrutura do Projeto

```
tdd-in-java-practice
│
├── src
│   ├── main
│   │   └── serviços e lógica de negócio
│   │
│   └── test
│       └── testes unitários orientados a TDD
│
└── pom.xml
```

---

# 🛠 Stack Tecnológica

| Tecnologia  | Uso                                 |
| ----------- | ----------------------------------- |
| **Java**    | Linguagem principal                 |
| **JUnit**   | Framework de testes                 |
| **Mockito** | Mocking e verificação de interações |
| **Maven**   | Gerenciamento de dependências       |

---

# 🎯 Objetivo do Projeto

Desenvolver domínio prático em **engenharia de software orientada a testes**, incluindo:

* escrita de **testes claros e confiáveis**
* design de código **testável**
* isolamento de dependências
* validação de comportamento de serviços

Este repositório funciona como um **laboratório de práticas profissionais de testes em Java**, reforçando habilidades essenciais para desenvolvimento de **software robusto e sustentável**.
