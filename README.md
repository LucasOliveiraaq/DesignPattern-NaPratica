# Padrão de Design Builder

O padrão **Builder** é um dos padrões de design criacionais que se concentra na construção de objetos complexos. A ideia principal é separar a construção de um objeto complexo da sua representação, permitindo que o mesmo processo de construção possa criar diferentes representações do objeto.

## Quando Usar o Padrão Builder

- **Várias formas de criar um objeto**: Use o padrão Builder quando um objeto pode ser criado de várias maneiras ou quando ele tem muitas opções de configuração.
- **Construção complexa**: Use o padrão Builder quando a criação de um objeto envolve muitos passos ou parâmetros e você deseja tornar o código mais legível e organizado.

## Estrutura do Padrão Builder

- **Objeto (Fusca)**: O objeto complexo que está sendo construído.
- **Builder**: Uma classe que define os métodos para configurar as propriedades do objeto e um método `build()` para criar o objeto.

Este exemplo mostra como o padrão Builder pode ser usado para criar objetos de forma clara e flexível, especialmente quando há muitos parâmetros ou configurações diferentes.
