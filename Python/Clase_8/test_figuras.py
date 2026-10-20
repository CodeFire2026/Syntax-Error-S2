from rectangulo import Rectangulo
from cuadrado import Cuadrado

rect = Rectangulo(4, 6, "rojo")
print(rect)
print("Área:", rect.area())   # 24

cuad = Cuadrado(5, "azul")
print(cuad)
print("Área:", cuad.area())   # 25