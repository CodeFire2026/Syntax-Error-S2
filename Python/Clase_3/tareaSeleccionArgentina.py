seleccionArgentina = {
    10:{'Nombre': 'Lionel Messi', 'Edad': 39, 'Altura': 1.70, 'Precio': '50 Millones', 'Posición': 'Extremo Derecho'},
    19: {'Nombre': 'Nicolás Otamendi', 'Edad': 34, 'Altura': 1.83, 'Precio': '3.5 Millones', 'Posicion': 'Defensa Central'},
    9:{'Nombre': 'Julían Álvarez', 'Edad': 26, 'Altura': 1.70, 'Precio': '120 Millones', 'Posición': 'Delantero Centro'},
    24:{'Nombre': 'Enzo Fernandez', 'Edad': 24, 'Altura': 1.78, 'Precio': '100 Millones', 'Posición': 'Mediocampista Central'},
    13:{'Nombre': 'Cristian Romero', 'Edad': 28, 'Altura': 1.85, 'Precio': '50 Millones', 'Posición': 'Defensa Central'},
    6:{'Nombre': 'Lisandro Martinez', 'Edad': 28, 'Altura': 1.75, 'Precio': '45 Millones', 'Posición': 'Defensa Central'},
    23:{'Nombre': 'Emiliano Martínez', 'Edad': 32, 'Altura': 1.95, 'Precio': '35 Millones', 'Posición': 'Arquero'},
    22:{'Nombre': 'Lautaro Martínez', 'Edad': 27, 'Altura': 1.74, 'Precio': '85 Millones', 'Posición': 'Delantero'},
    7:{'Nombre': 'Alexis Mac Allister', 'Edad': 26, 'Altura': 1.74, 'Precio': '70 Millones', 'Posición': 'Mediocampista'}

}
for llave, valor in seleccionArgentina.items():
    print(llave, valor)

# Como tarea agregar por lo menos 4 jugadores mas al diccionario: seleccionArgentina
print("Tenemos cargados en el diccionario la cantidad de: ", end="")
print(len(seleccionArgentina))