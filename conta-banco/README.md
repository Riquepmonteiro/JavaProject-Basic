# Desafio DIO - Java Básico

## Sintaxe - Desafio

Vamos exercitar todo o conteúdo apresentado no módulo de Sintaxe codificando o seguinte cenário.

### Descrição do Projeto

Crie o projeto **ContaBanco** que receberá dados via terminal contendo as características de uma conta em banco, conforme os atributos abaixo:

| Atributo      | Tipo   | Exemplo     |
|---------------|--------|-------------|
| **Número**    | Inteiro| 1021        |
| **Agência**   | Texto  | 067-8       |
| **Nome Cliente** | Texto  | MARIO ANDRADE |
| **Saldo**     | Decimal| 237.48      |

### Instruções

1. Dentro do projeto, crie a classe `ContaTerminal.java` para realizar toda a codificação do programa.
2. Revise as regras de declaração de variáveis.
3. Revise sobre terminal, `main args` e a classe `Scanner`.
4. Permita que os dados sejam inseridos via terminal. O usuário receberá a mensagem de qual informação será solicitada. Por exemplo:
   - **Programa:** "Por favor, digite o número da Agência!"
   - **Usuário:** 1021 (depois ENTER para o próximo campo)
5. Revise sobre concatenação e a classe `String` com o método `concat`.
6. Depois de todas as informações terem sido inseridas, o sistema deverá exibir a seguinte mensagem:
   
* Olá MARIO ANDRADE, obrigado por criar uma conta em nosso banco. Sua agência é 067-8, conta 1021 e seu saldo 237.48 já está disponível para saque.
