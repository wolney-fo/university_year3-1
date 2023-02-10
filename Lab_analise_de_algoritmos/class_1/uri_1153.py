def fatorial(n):
    if n == 0:
        return 1
    else:
        return n * fatorial(n-1)
        
valor = int(input())
valor_fatorial = fatorial(valor)

print(valor_fatorial)
