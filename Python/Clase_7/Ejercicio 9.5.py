class Rectangulo:
    """
    Crear una clase llamada Rectangulo, debe tener 2 atributos: altura y base.
    El nombre del método será calcular_area utilizando la fórmula:
    area = base * altura. Pero la base y la altura deben ser ingresadas por
    el usuario y los objetos deben ser tres.
    """

    def __init__(self, base, altura):
        self.base = base
        self.altura = altura

    def calcular_area(self):
        return self.base * self.altura


# Creamos los 3 objetos pidiendo los datos al usuario
rectangulos = []
for i in range(1, 4):
    print(f"Rectángulo {i}")
    base = float(input("Ingrese la base: "))
    altura = float(input("Ingrese la altura: "))
    rectangulos.append(Rectangulo(base, altura))

# Mostramos el área de cada uno
for i, rect in enumerate(rectangulos, start=1):
    print(f"El área del rectángulo {i} es: {rect.calcular_area()}")
