import math
#Ejercicio 4: Sacar la raíz cuadrada de un número positivo utilizando la función math
numero = float(input("Introduce un numero: "))
if numero > 0:
    raiz = math.sqrt(numero)
    print("La raiz es: ", raiz)
else:
    print("Ingrese un numero positivo")

