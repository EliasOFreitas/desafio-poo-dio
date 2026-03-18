# 🚀 Desafio: Abstraindo um Bootcamp com Orientação a Objetos em Java

Este projeto foi desenvolvido como parte do currículo de Java da **DIO (Digital Innovation One)**. O objetivo principal foi aplicar os pilares da Programação Orientada a Objetos (POO) em um cenário real: a estrutura de funcionamento de um Bootcamp.

---

## 🧠 Conceitos de POO Aplicados

Durante o desenvolvimento deste desafio, exercitei os quatro pilares fundamentais da POO:

* **Abstração:** Criação da classe abstrata `Conteudo`, servindo de base para diferentes tipos de atividades.
* **Herança:** As classes `Curso` e `Mentoria` herdam atributos e métodos comuns de `Conteudo`.
* **Encapsulamento:** Uso de modificadores de acesso `private` e métodos `getters/setters` para proteção dos dados.
* **Polimorfismo:** Implementações distintas do método `calcularXp()` para cursos (proporcional à carga horária) e mentorias (bônus fixo).

---

## 🛠️ Tecnologias e Estruturas Utilizadas

* **Linguagem:** Java (JDK 11+)
* **Coleções (Java Collections):** Uso de `LinkedHashSet` para gerenciar inscrições e conclusões sem duplicidade, mantendo a ordem de entrada.
* **API de Datas (LocalDate):** Manipulação de períodos e prazos de conclusão.
* **Streams & Optional:** Utilizados para manipulação eficiente de dados e tratamento seguro de fluxos de progressão.

---

## 📋 Como Funciona o Sistema

O sistema simula a jornada de um desenvolvedor em um bootcamp:

1.  **Bootcamp:** Possui nome, descrição e um período de validade (calculado automaticamente em 45 dias).
2.  **Conteúdos:** O sistema aceita a criação de `Cursos` (com carga horária) e `Mentorias` (com data específica).
3.  **Devs:** O desenvolvedor pode se inscrever em um Bootcamp, o que adiciona automaticamente todos os conteúdos à sua lista de "inscritos".
4.  **Progressão:** Ao utilizar o método `progredir()`, o primeiro conteúdo da lista de inscritos é movido para a lista de "concluídos", e o XP é calculado e acumulado.

---


### 👩‍💻 Desenvolvido por:
**EliasOFreitas** - *Estudante de ADS e em transição para Back-End*