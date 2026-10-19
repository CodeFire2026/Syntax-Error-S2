class Vehiculo: #Primera Clase (Clase Padre)
    def __init__(self, color, ruedas):
        self.color = color
        self.ruedas = ruedas

    def __str__(self):
        return f'Clase Vehículo: (Color: {self.color}, Ruedas: {self.ruedas})'

class Auto(Vehiculo): #Segunda Clase (Clase hija)
    def __init__(self, color, ruedas, velocidad):
        super().__init__(color, ruedas)
        self.velocidad = velocidad

    def __str__(self):
        return f'{super().__str__()} Clase Auto: (velocidad: {self.velocidad})'

class Bicicleta(Vehiculo): #Tercera Clase (Clase hija)
    def __init__(self, color, ruedas, tipo):
        super().__init__(color, ruedas)
        self.tipo = tipo

    def __str__(self):
        return f'{super().__str__()} Clase Bicicleta: (tipo: {self.tipo})'

#Creación de Objetos
miAuto = Vehiculo("Rosado", "Deportivas") #Primer objeto miAuto
miAutoVel = Auto("Rojo","Deportivas", 100) #Segundo objeto miAutoVel
miBici = Bicicleta("Amarillo", "Rodado 26", "Playera") #Tercer objeto miBici

print(miAuto)
print(miAutoVel)
print(miBici)