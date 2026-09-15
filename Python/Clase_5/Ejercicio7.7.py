# Ejercicio 5: Convertidor de temperaturas
# Realizar dos funciones para convertir de grados celsius
# a fahrenheit y viseversa.
# Investigar las formulas

def celsiusFahrenheit(grados):
    celsiusaFahrenheit = (grados * 1.8) + 32
    return print(celsiusaFahrenheit)

def fahrenheitCelsius(grados):
    fahrenheitaCelsius = (grados - 32)/1.8
    return print(fahrenheitaCelsius)

print("A que escala querés convertir? ")
opcion = int(input(f"""
            1. Grados Celsius a Fahrenheit
            2. Grados Fahrenheit a Celsius

            > """))

if opcion == 1:
    grados = float(input("Digite los grados Celsius: "))
    celsiusFahrenheit(grados)

if opcion == 2:
    grados = float(input("Digite los grados Fahrenheit: "))
    fahrenheitCelsius(grados)
