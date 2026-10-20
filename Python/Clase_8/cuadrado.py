from figura_geometrica import FiguraGeometrica
from color import Color


class Cuadrado(FiguraGeometrica, Color):
    def __init__(self, lado, color):
        FiguraGeometrica.__init__(self, lado, lado)  # un cuadrado tiene ancho = alto
        Color.__init__(self, color)

    def area(self):
        return self.get_ancho() * self.get_alto()

    def __str__(self):
        return f"Cuadrado [{FiguraGeometrica.__str__(self)}, {Color.__str__(self)}]"