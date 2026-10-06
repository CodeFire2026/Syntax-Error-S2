"""
Crear la clase Cubo con los atributos, ancho, alto y profundidad, con un método
calcular volumen que tendrá la formula:
volumen = ancho * altura * profundidad que el usuario ingrese los datos
"""
class Cubo:
    def __init__(self, ancho, altura, profundidad):
        self.ancho = ancho
        self.altura = altura
        self.profundidad = profundidad
    def calcular_volumen(self):
        return self.ancho * self.altura * self.profundidad
ancho = int(input("Ingrese el ancho del cubo: "))
altura = int(input("Ingrese la altura del cubo: "))
profundidad = int(input("Ingrese la profundidad del cubo: "))

mi_cubo = Cubo(ancho, altura, profundidad)

volumen = mi_cubo.calcular_volumen()
print(f'El volumen del cubo es: {volumen}')