import random

numero = random.randint(1, 100)

min = 0
max = 100
contador = 1
    
print("Vamos a jugar un juego, tenes que adivinar mi número")

print("Te voy a dar pistas hasta que lo encuentres!! :)")

numPlayer = int(input("Proba un número: "))

while numPlayer != numero:
    contador+=1
    if numPlayer > numero:
        print("Es menor")
    else:
        print("Es mayor")

    numPlayer = int(input("Probá otro número: "))
print(f"Adivinaste!! Mi número era {numero}, Número de intentos: {contador}")

