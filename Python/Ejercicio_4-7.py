# Ejercicio 4.7: Modificar los elementos de una lista
# Llenar una lista con los números del 1 al 10, luego modificar los
# elementos de la lista multiplicandolos por un valor ingresado por el usuario

lista = []
for numero in range(1, 11):
    lista.append(numero)

print("Lista original:", lista)


multiplicador = int(input("Ingrese un valor para multiplicar: "))


for i in range(len(lista)):
    lista[i] = lista[i] * multiplicador

print("Lista modificada:", lista)