# Laboratório de Análise de Algorítmo - Aula 02

Atividades práticas passadas como exercícios no assunto de algoritmos visando encontrar opções com menores tempos de execução e melhores performances.

> 🐍 Utilizar Python 3/3.8/3.9

## Screenshots

![Screenshot](/doc/result_class-2_ex1.png)

<br>

## Problema: Encontrar a posição no array

O problema consiste em encontrar a posição que um número (n) deve ser inserido em um array ordenado de forma que este array se mantenha ordenado de forma crescente. Se o número já existir no array, a posição considerada vai ser a menor posição do número já existente. Vale ressaltar que não é preciso fazer a inserção, basta retornar o índice que o número entraria.  

Considere `0 <= n <= 100000`

<br>

**Entrada**  

A entrada é composta de vários casos de testes que são encerrados quando se lê o número  -1. Cada caso de teste é composto por duas linhas. A primeira possui o número que deve ser inserido. A linha seguinte possui o array. Quando n for -1 deve-se encerrar o programa sem imprimir nenhuma informação para essa linha.  

**Saída**  

Para cada caso de teste, deve-se imprimir somente a posição que o número n estaria posicionado no array. 

![Examples](/doc/examples_class-2_ex1.png)