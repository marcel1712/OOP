# Banco - Exemplo de Herança em Java

Este projeto é uma simulação simples de um sistema bancário, desenvolvido com o objetivo de demonstrar os conceitos de **herança** e **polimorfismo** na linguagem Java, como parte da disciplina de Programação Orientada a Objetos.

## 📚 Conceitos Abordados

- **Herança**: Classes que herdam atributos e métodos de uma superclasse.
- **Polimorfismo** (implícito): Métodos compartilhados com comportamentos específicos nas subclasses.
- **Encapsulamento**: Atributos `private` ou `protected`, com acesso controlado.

## 🧱 Estrutura do Projeto

O projeto contém as seguintes classes:

- `ContaBancaria`: Superclasse com atributos `titular` e `saldo`, além do método `depositar()`.
- `ContaCorrente`: Subclasse com limite de cheque especial e método `usarChequeEspecial()`.
- `ContaPoupanca`: Subclasse com taxa de juros e método `renderJuros()`.
- `Aplicacao`: Subclasse com prazo de resgate e método `verificarPrazo()`.
- `Banco`: Classe principal com o método `main()` que executa o programa.

## ▶️ Como Executar

1. Compile os arquivos com:
   ```bash
   javac Banco.java
