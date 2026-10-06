class Persona:
    def __init__(self, nombre, edad):
        self.__nombre = nombre
        self.__edad = edad

    def get_nombre(self):
        return self.__nombre

    def get_edad(self):
        return self.__edad

    def set_nombre(self, nombre):
        self.__nombre = nombre

    def set_edad(self, edad):
        self.__edad = edad

    def mostrar_detalles(self):
        print(f"Nombre: {self.__nombre}, Edad: {self.__edad}")


persona1 = Persona("Luciano", 20)
persona2 = Persona("Ana", 25)
persona3 = Persona("Pedro", 30)

print("Antes de los cambios:")
persona1.mostrar_detalles()
persona2.mostrar_detalles()
persona3.mostrar_detalles()

persona1.set_edad(persona1.get_edad() + 1)
persona2.set_nombre("María")
persona3.set_edad(persona3.get_edad() + 2)

print("\nNombre actualizado:", persona2.get_nombre())

print("\nDespués de los cambios:")
persona1.mostrar_detalles()
persona2.mostrar_detalles()
persona3.mostrar_detalles()