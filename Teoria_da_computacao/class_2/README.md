# Autômatos Finitos Determinístico

## Ex 1

Construa um autômato finito determinístico que reconhece a seguinte linguagem: 

$L = \{w|w\text{ possui um número par de a's e um número ímpar de b's}\}$.

![Preview](https://github.com/wolney-fo/university_year3-1/blob/main/Teoria_da_computacao/doc/class_2-preview-1.gif?raw=true)  
`Teste usando: "aabababababaabbbababbabba"`

```bash
#states
apbp
apbi
aibi
aibp
#initial
apbp
#accepting
apbi
#alphabet
a
b
#transitions
apbp:a>aibp
apbp:b>apbi
apbi:a>aibi
apbi:b>apbp
aibi:a>apbi
aibi:b>aibp
aibp:a>apbp
aibp:b>aibi
```

<br>


## Ex 2

Construa um autômato finito determinístico que reconhece a seguinte linguagem:

$L = \{w | w \text{ possui aa ou bb como subpalvra}\}$.

![Preview](https://github.com/wolney-fo/university_year3-1/blob/main/Teoria_da_computacao/doc/class_2-preview-2.gif?raw=true)  
`Teste usando: "baaba"`

```bash
#states
q0
qa
qb
qf
#initial
q0
#accepting
qf
#alphabet
a
b
#transitions
q0:a>qa
q0:b>qb
qa:a>qf
qa:b>qb
qb:a>qa
qb:b>qf
qf:a>qf
qf:b>qf
```

Ferramenta utilizada 👉 [FSM simulator](https://ivanzuzak.info/noam/webapps/fsm_simulator/)