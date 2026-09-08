#Ejercicio 3: Agregar personajes a la lista
# Escriba un programa donde cree una lista con los siguientes personajes del señor de los anillos

# Nombre: Aragon
# Clase: Guerrero
# Raza: Dúnada del norte

# Nombre: Gandalf
# Clase: Mago
# Raza: Istar

# Nombre: Légolas
# Clase: Arquero
# RAza: Elfo Sindar

personajes = []
personaje1 = {
    "Nombre" : "Aragon",
    "Clase" : "Guerrero",
    "Raza" : "Dúnadan del norte"
}
personaje2 = {
    "Nombre" : "Gandalf",
    "Clase" : "Mago",
    "Raza" : "Istar"
}
personaje3 = {
    "Nombre" : "Legolas",
    "Clase" : "Arquero",
    "Raza" : "Elfo Sindar"
}
personajes.append(personaje1)
personajes.append(personaje2)
personajes.append(personaje3)
print(personajes)
