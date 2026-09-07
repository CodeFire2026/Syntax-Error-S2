# Ejercicio 3: Insertar elementos y ordenarlos
# Pedir números y meterlos en una lista, cuando el usuario
# introduzca un número 0, nuestro programa dejaría de insertar.
# Por último, mostrar los números ordenados de menor a mayor

lista = []

numero = int(input("Ingrese un número (0 para terminar): "))

while numero != 0:
    lista.append(numero)
    numero = int(input("Ingrese un número (0 para terminar): "))

lista.sort()

print("Números ordenados de menor a mayor:", lista)


