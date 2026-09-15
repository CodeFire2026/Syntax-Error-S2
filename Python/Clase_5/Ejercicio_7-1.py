# Ejercicio 2: Función con * args para multiplicar
# Crear una función para multiplicar los valores recibidos
# de tipo numérico, utilizando argumentos variables *args
# como parámetro de la función y regresar como resultado
# la multiplicación de todos los valores pasados como argumento

def multiplicar_valores(*args):
    # Inicializamos el resultado en 1
    resultado = 1
    # Itera los valores ingresados
    for valor in args:
        resultado *= valor    
    return resultado
    
    # Prueba funcion
print(multiplicar_valores(2, 4, 3))  
