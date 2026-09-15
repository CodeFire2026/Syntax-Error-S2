# Ejercicio 11: Agenda telefónica
# Hacer un programa que simule una agenda de contactos. Crear un
# diccionario donde la clave sea el nombre del usuario y el valor
# sea el teléfono, el programa tendrá el siguiente menú de opciones:
#           1. Nuevo contacto
#           2. Borrar contacto
#           3. Ver contactos existentes
#           4. Salir
import time

agenda = {}
num = 0

while num != 4:
    num = int(input(f"""
            AGENDA DE CONTACTOS
            1. Nuevo Contacto
            2. Borrar contacto
            3. Ver contactos existentes
            4. Salir

            > """))
    time.sleep(1)

    if num == 1:
        pj1 = input("Ingrese el nombre del nuevo contacto: ")
        pj1Num = int(input("Ingrese el número del nuevo contacto: "))

        agenda[pj1] = pj1Num
        time.sleep(1)

    if num == 2:
        delContacto = input("Ingrese el nombre exacto del contacto que desea eliminar: ")
        del agenda[delContacto]
        time.sleep(1)

    if num == 3:
        for key,number in agenda.items():
            print(f"{key} = {number}")
        time.sleep(1)

