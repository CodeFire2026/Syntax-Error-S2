#Ejercicio: Sumar números pares dentro de un rango
# Hacer un programa para sumar numeros pares dentro
# de un rango, por Ej:
#                           suma de números pares del 2 al 30
#                           suma = 240


#Pedimos al usuario el Rango de números
inicio = int(input("Ingrese el inicio del Rango: "))
fin = int(input("Ingrese el fin del Rango: "))

suma = 0

for i in range(inicio, fin+1):
    if i % 2 == 0:  #comprobamos si los numeros son pares
        suma += i
print(f"La suma de los numeros pares del {inicio} al {fin} es: {suma}")