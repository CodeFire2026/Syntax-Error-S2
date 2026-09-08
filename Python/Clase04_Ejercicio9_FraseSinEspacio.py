#Ejercicio 9
frase = input("Ingrese una frase: ")

frase_final = frase.replace(" ", "")

cantidad = len(frase_final)

print("Frase sin espacios:", frase_final)
print("N° de caracteres:", cantidad)