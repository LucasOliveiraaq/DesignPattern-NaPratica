# Padrão de Design Builder

O padrão **Builder** é um dos padrões de design criacionais que se concentra na construção de objetos complexos. A ideia principal é separar a construção de um objeto complexo da sua representação, permitindo que o mesmo processo de construção possa criar diferentes representações do objeto.

## Quando Usar o Padrão Builder

- **Várias formas de criar um objeto**: Use o padrão Builder quando um objeto pode ser criado de várias maneiras ou quando ele tem muitas opções de configuração.
- **Construção complexa**: Use o padrão Builder quando a criação de um objeto envolve muitos passos ou parâmetros e você deseja tornar o código mais legível e organizado.

## Estrutura do Padrão Builder

- **Objeto (Fusca)**: O objeto complexo que está sendo construído.
- **Builder**: Uma classe que define os métodos para configurar as propriedades do objeto e um método `build()` para criar o objeto.

Este exemplo mostra como o padrão Builder pode ser usado para criar objetos de forma clara e flexível, especialmente quando há muitos parâmetros ou configurações diferentes.

---

# Padrão de Design Factory

O padrão **Factory** é um dos padrões de design criacionais que fornece uma interface para criar objetos em uma superclasse, permitindo que as subclasses alterem o tipo de objetos que serão criados.

## Quando Usar o Padrão Factory

- **Processo de Criação Complexo:** Use o padrão Factory quando o processo de criação de um objeto é complexo ou envolve lógica condicional significativa.
- **Desacoplamento:** Use o padrão Factory quando você deseja desacoplar a criação de objetos da sua utilização.
- **Flexibilidade:** Use o padrão Factory quando você prevê a necessidade de adicionar novos tipos de objetos no futuro sem modificar a lógica existente.
- **Centralização da Lógica de Criação:** Use o padrão Factory quando a lógica de criação precisa ser centralizada para facilitar a manutenção e a expansão.

## Estrutura do Padrão Factory

- **Interface:** Define a interface comum que todos os objetos criados pelo Factory devem implementar.
- **Classe Factory:** Contém a lógica de criação de objetos e retorna uma instância do tipo apropriado.
- **Classes Concretas:** Implementam a interface ou classe abstrata e fornecem comportamentos específicos.
