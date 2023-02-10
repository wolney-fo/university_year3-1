qty_even_values = 0
qty_odd_values = 0
qty_positive_values = 0
qty_negative_values = 0

for i in range(5):
    value = int(input())

    if (value > 0):
        qty_positive_values += 1
    elif (value < 0):
        qty_negative_values += 1

    if ((value % 2) == 0):
        qty_even_values += 1
    else:
        qty_odd_values += 1

print(f'''
{qty_even_values} valor(es) par(es)
{qty_odd_values} valor(es) impar(es)
{qty_positive_values} valor(es) positivo(s)
{qty_negative_values} valor(es) negativo(s)\n''')
