# Ejercicio: Fatorial de un número positivo
# Hacer un programa para calcular el factorial de un número positivo
from math import factorial

#Pedimos un numero que sea positivo al usuario y validamos
numero = int(input("Ingrese un numero que sea Entero (> 0) : "))

while numero < 0:
    print("Error: El numero debe de ser positivo o cero")
    numero =  int(input("Ingrese un numero entero positivo: "))

#Factorial de 0 y 1 es 1
factorial = 1

#Calcularemos el factorial utilizando el ciclo for
for i in range(1, numero+1):
    factorial *= i

#Mostramos el resultado
print(f"El factorial de {numero} es: {factorial}")