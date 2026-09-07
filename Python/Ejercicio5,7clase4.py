# Cajero automático

def cajero():
    saldo = 1000  # saldo inicial
    while True:
        print("\n--- Cajero Automático ---")
        print("1. Ingresar dinero en la cuenta")
        print("2. Retirar dinero de la cuenta")
        print("3. Mostrar dinero disponible")
        print("4. Salir")

        opcion = input("Elige una opción (1-4): ")

        if opcion == "1":
            cantidad = float(input("¿Cuánto dinero deseas ingresar?: "))
            saldo += cantidad
            print(f"Has ingresado ${cantidad}. Tu nuevo saldo es ${saldo}.")

        elif opcion == "2":
            cantidad = float(input("¿Cuánto dinero deseas retirar?: "))
            if cantidad > saldo:
                print("Fondos insuficientes. No puedes retirar más de tu saldo.")
            else:
                saldo -= cantidad
                print(f"Has retirado ${cantidad}. Tu nuevo saldo es ${saldo}.")

        elif opcion == "3":
            print(f"Tu saldo disponible es: ${saldo}")

        elif opcion == "4":
            print("Gracias por usar el cajero. ¡Hasta luego!")
            break

        else:
            print("Opción inválida. Intenta de nuevo.")

# Ejecutar el programa
cajero()
