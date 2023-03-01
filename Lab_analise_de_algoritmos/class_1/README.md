# Laboratório de Análise de Algorítmo - Aula 01

Atividades práticas passadas como exercícios no assunto de algoritmos visando encontrar opções com menores tempos de execução e melhores performances.

<center>

| Problema                                     | Nível | Peso |
| :------------------------------------------- | :---: | :--: |
| 1153 - Fatorial Simples                      |   1   | 100  |
| 1018 - Cédulas                               |   4   | 100  |
| 1066 - Pares, Ímpares, Positivos e Negativos |   1   | 100  |
| 1793 - Escada Rolante                        |   1   | 100  |

</center>

> 🐍 Utilizar Python 3/3.8/3.9


<br><br>

## 1. Fatorial Simples [(URI 1153)](https://www.beecrowd.com.br/judge/pt/problems/view/1153)
Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.

**Entrada**  
A entrada contém um valor inteiro N (0 < N < 13).

**Saída**  
A saída contém um valor inteiro, correspondente ao fatorial de N.

<br>

**Exemplo de entrada**  
*4*

**Exemplo de saída**  
*24*

<br>

### Meus resultados

![Results](/doc/result_class-1_ex1.png)


<br><br>

## 2. Cédulas [(URI 1018)](https://www.beecrowd.com.br/judge/pt/problems/view/1018)  
Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis (cédulas) no qual o valor pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2 e 1. A seguir mostre o valor lido e a relação de notas necessárias.

**Entrada**  
O arquivo de entrada contém um valor inteiro **N** (0 < **N** < 1000000).

**Saída**  
Imprima o valor lido e, em seguida, a quantidade mínima de notas de cada tipo necessárias, conforme o exemplo fornecido.  

<br>

**Exemplo de entrada**  
*576*

**Exemplo de saída**  
*576*  
*5 nota(s) de R$ 100,00*  
*1 nota(s) de R$ 50,00*  
*1 nota(s) de R$ 20,00*  
*0 nota(s) de R$ 10,00*  
*1 nota(s) de R$ 5,00*  
*0 nota(s) de R$ 2,00*  
*1 nota(s) de R$ 1,00*  

<br>

### Meus resultados

![Results](/doc/result_class-1_ex2.png)


<br><br>

## 3. Pares, Ímpares, Positivos e Negativos [(URI 1066)](https://www.beecrowd.com.br/judge/pt/problems/view/1066)
Leia 5 valores Inteiros. A seguir mostre quantos valores digitados foram pares, quantos valores digitados foram ímpares, quantos valores digitados foram positivos e quantos valores digitados foram negativos.

**Entrada**  
O arquivo de entrada contém 5 valores inteiros quaisquer.

**Saída**  
Imprima a mensagem conforme o exemplo fornecido, uma mensagem por linha, não esquecendo o final de linha após cada uma.

<br>

**Exemplo de entrada**  
*-5*  
*0*  
*-3*  
*-4*  
*12*  

**Exemplo de saída**  
*3 valor(es) par(es)*   
*2 valor(es) impar(es)*   
*1 valor(es) positivo(s)*   
*3 valor(es) negativo(s)*   

<br>

### Meus resultados

![Results](/doc/result_class-1_ex3.png)


<br><br>

## 4. Escada Rolante [(URI 1793)](https://www.beecrowd.com.br/judge/pt/problems/view/1793)
Escadas rolantes sem dúvidas facilitam muito a vida das pessoas. Subir escadas é uma das tarefas mais tediosas já inventadas (após a invenção das escadas normais).  

Após algumas observações você percebeu que há muita energia gasta com escadas rolantes, pois elas continuam funcionando mesmo quando não há ninguém à utilizando. Para contornar isso, o dono de um shopping local instalou um sensor que verifica quando há alguém na escada rolante. Quando o sensor não detecta nenhuma presença, a escada rolante é desativada, assim economizando energia até que a próxima pessoa chegue.  

Para ser mais específico, o sistema funciona da seguinte maneira: a escada está inicialmente desativada. O tempo necessário para que uma pessoa chegue de um lado até o outro da escada rolante é 10 segundos. Ou seja, se uma única pessoa se aproximar da escada rolante no tempo t, a escada rolante ficará ativada nos tempos t, t+1, t+2, …, t+8 e t+9, e será desativada no tempo t+10, momento no qual a pessoa já saiu da escada rolante. Tal duração pode ser prolongada caso uma ou mais pessoas se aproximem da escada rolante durante tal processo.  

O dono do shopping local agora pediu sua ajuda. Escreva um algoritmo que, dados os tempos em que as pessoas se aproximaram da escada rolante, diga por quantos segundos a escada ficou ativada.  

**Entrada**  
Haverá no máximo 30 casos de teste. Cada caso de teste inicia com uma linha contendo um inteiro N, indicando o número de pessoas que usaram a escada rolante no dia em questão (1 ≤ N ≤ 100).  

Na linha seguinte haverá N inteiros distintos, dados em ordem crescente, indicando o tempo t em que cada pessoa se aproximou da escada (1 ≤ t ≤ 1000).  

O último caso de teste é indicado quando N = 0, o qual não deverá ser processado.  

**Saída**  
Para cada caso de teste imprima uma linha, contendo um inteiro, indicando o número de segundos que a escada rolante ficou ativa.  

<br>

**Exemplo de entrada**  
*1*  
*5*  
*2*  
*12 25*  
*2*  
*13 16*  
*5*  
*15 20 29 31 50*  
*0*  

**Exemplo de saída**  
*10*   
*20*   
*13*   
*36*   

<br>

### Meus resultados

--
