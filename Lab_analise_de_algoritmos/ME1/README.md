# Decodificando palavras

Um grupo de alunos desenvolveu um método para criptografar mensagens que eles enviavam em sala de aula. O professor achou interessante o sistema de criptografia deles e fez o desafio para turma desenvolver um sistema capaz de decifrar as mensagens enviadas pelos alunos. Segundo os alunos que desenvolveram o método, o sistema de codificação era bem simples.  

Primeiro eles pegavam a palavra que queriam criptografar e substituíam cada caractere pelo enésimo caractere depois do símbolo que desejavam codificar. Para isso, eles usavam como referência o alfabeto tradicional em português com 26 letras: [a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z]. Por exemplo, se eles quisessem codificar a palavra  **CASA**, usando n = 5, o resultado seria: HFXF. Outro exemplo, a palavra **VOCE**, utilizando  n = 10, ficaria: FYMO. Observe que no caso do V, ao verificar o décimo termo, ele passou do total de elementos do alfabeto. Nesse caso, a contagem continua a partir do primeiro símbolo do alfabeto, a letra a. Se n = 0, a palavra não é codificada.  

O problema apresenta uma série de palavras que devem ser descriptografadas para a mensagem original juntamente com o valor de n utilizado para criptografar. Todas as palavras apresentadas sempre vão aparecer em letra minúscula e sem acentuações ou cedilhas. O valor de n varia de 0 a 27.  

<br>

**Entrada**  

A entrada é composta de um número (X) que indica o total de palavras que vão ser lidas, seguida de X pares composto por um número (n) e uma palavra criptografada.

**Saída**  

Para cada linha com uma palavra criptografada, deve imprimir a palavra decodificada.

<br>

| Samples Input	| Samples Output |
|:--------------|---------------:|
|21 gvwjmvojmdj | laboratorio    |
|4 gsqtyxeges   | computacao     |
|1 bmhpsjunpt   | algoritmo      |
|24 agclagy     | ciencia        |
|9 jyaxejmx     | aprovado       |
|8 xgbpwv       | python         |