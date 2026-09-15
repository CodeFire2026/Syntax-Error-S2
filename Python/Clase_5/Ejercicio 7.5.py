# Ejercicio 3: Funcion regresiva
# Imprimir numeros de 5 a 1 de manera descendente usando funciones recursivas
# Puede ser cualquier valor positivo, por ejemplo, si pasamos el
# valor de 5, debe imprimir:
#5
#4
#3
#2
#1
# En caso de ser el número 3 debe imprimir:
#3
#2
#1
# Si se ingresan números negativos no imprime nada
def imprimir_descendente(numero):
    if numero > 0:
        print(numero)
        imprimir_descendente(numero - 1)


numero = int(input("Ingrese un número positivo: "))

imprimir_descendente(numero)