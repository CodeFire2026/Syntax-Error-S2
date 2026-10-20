class Persona:
    def __init__(self, nombre, edad): #Esta clase hereda de la clase Object
        self._nombre = nombre
        self._edad = edad

    #Método getter
    @property
    def nombre(self):
        return self._nombre

    @property
    def edad(self):
        return self._edad

    #Método setter
    @nombre.setter
    def nombre(self, nombre):
        self._nombre = nombre

    @edad.setter
    def edad(self, edad):
        self._edad = edad

class Empleado(Persona): #Esta clase es hija de la clase Persona
    def __init__(self, nombre, edad, sueldo):
        super().__init__(nombre,edad)
        self._sueldo = sueldo

    # Método setter
    @property
    def sueldo(self):
        return self._sueldo

    # Método setter
    @sueldo.setter
    def sueldo(self, sueldo):
        self._sueldo = sueldo

empleado1 = Empleado("Emanuel",19,985000)

print(empleado1.nombre)
print(empleado1.edad)
print(empleado1.sueldo)

empleado1.nombre = "Juan"
empleado1.edad = 30
empleado1.sueldo = 458000

print("----------------------------------------------------")
print(empleado1.nombre)
print(empleado1.edad)
print(empleado1.sueldo)