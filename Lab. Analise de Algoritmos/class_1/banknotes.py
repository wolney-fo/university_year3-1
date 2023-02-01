def banknote_selector(valor):
    notas_100 = 0
    notas_50 = 0
    notas_20 = 0
    notas_10 = 0
    notas_5 = 0
    notas_2 = 0
    notas_1 = 0

    soma = 0

    while True:
        soma += 100.0
        if soma > valor:
            soma -= 100.0
            break
        else:
            notas_100 += 1
        

        
    while True:
        soma += 50.0
        if soma > valor:
            soma -= 50.0
            break
        else:
            notas_50 += 1

        
    while True:
        soma += 20.0
        if soma > valor:
            soma -= 20.0
            break
        else:
            notas_20 += 1
            
        
    while True:
        soma += 10.0
        if soma > valor:
            soma -= 10.0
            break
        else:
            notas_10 += 1
            
        
    while True:
        soma += 5.0
        if soma > valor:
            soma -= 5.0
            break
        else:
            notas_5 += 1
            
        
    while True:
        soma += 2.0
        if soma > valor:
            soma -= 2.0
            break
        else:
            notas_2 += 1
            

    while True:
        soma += 1.0
        if soma > valor:
            soma -= 1.0
            break
        else:
            notas_1 += 1
            
        
        

    print(valor)
    print(notas_100, 'nota(s) de R$ 100,00')
    print(notas_50, 'nota(s) de R$ 50,00')
    print(notas_20, 'nota(s) de R$ 20,00')
    print(notas_10, 'nota(s) de R$ 10,00')
    print(notas_5, 'nota(s) de R$ 5,00')
    print(notas_2, 'nota(s) de R$ 2,00')
    print(notas_1, 'nota(s) de R$ 1,00')


banknote_selector(int(input()))