# RPG em Java

Este é um projeto simples de RPG desenvolvido em Java, criado para praticar conceitos iniciais de Programação Orientada a Objetos.

O projeto simula uma batalha entre um herói e um dragão. O jogador pode escolher entre diferentes tipos de heróis e, durante a batalha, realizar ações como atacar, usar habilidade especial ou beber poção de vida.

## Objetivo do projeto

O objetivo principal deste projeto foi praticar os fundamentos de Java e Programação Orientada a Objetos, criando uma estrutura simples de personagens com herança, métodos sobrescritos e interação pelo terminal.

## Como funciona

Ao iniciar o programa, o jogador escolhe um dos heróis disponíveis:

- Guerreiro
- Mago
- Arqueiro

Depois da escolha, o herói enfrenta um Dragão em turnos.

Durante o turno do jogador, é possível escolher uma das ações:

1. Atacar
2. Usar habilidade especial
3. Beber poção de vida

Após a jogada do herói, o Dragão realiza sua ação, podendo atacar normalmente ou usar seu poder especial.

O jogo continua até que o Dragão seja derrotado.

## Funcionalidades

- Escolha de personagem
- Sistema de batalha por turnos
- Ataque normal
- Ataque especial
- Uso de poção de vida
- Regeneração de vida do monstro
- Defesa com chance aleatória
- Verificação de fim de jogo

## Conceitos praticados

Neste projeto, foram praticados conceitos importantes de Java e POO:

- Classes e objetos
- Herança
- Classe abstrata
- Métodos abstratos
- Sobrescrita de métodos com `@Override`
- Atributos `protected` e `private`
- Construtores
- Uso de `Scanner`
- Estrutura `switch`
- Laço `do while`
- Interação entre objetos
- Geração de evento aleatório com `Math.random()`

## Estrutura do projeto

```text
RPG
├── src
│   └── rpg
│       └── projeto
│           ├── Heroi.java
│           ├── Jogo.java
│           ├── Monstro.java
│           └── Personagem.java
