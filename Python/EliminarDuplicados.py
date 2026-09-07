# Ejercicio 1: Eliminar duplicados de una lista
# Escriba un programa donde tenga una lista y que a continuación
# elimine los elementos repetidos, por último mostrar la lista.

# Creamos una lista
lista = [1, 2, 3, 2, 4, 5, 1, 6, 3, 7]

print("Lista original:", lista)

# Eliminamos los duplicados usando un set (no mantiene el orden)
lista_sin_duplicados = list(set(lista))
print("Lista sin duplicados:", lista_sin_duplicados)

# Alternativa manteniendo el orden original
lista_sin_duplicados_ordenada = []
for elemento in lista:
    if elemento not in lista_sin_duplicados_ordenada:
        lista_sin_duplicados_ordenada.append(elemento)

print("Lista sin duplicados (orden original):", lista_sin_duplicados_ordenada)