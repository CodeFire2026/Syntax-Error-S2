# Ejercicio 4: Claculadora de Impuestos
# Crea una funcion para calcular el total de un pago incluyendo un impuesto aplicado (Iva).
#  Formula: pago_total = pago_sin_impuesto + pago_impuesto * (impuesto/100)
# Proporcione el paso sin impuesto: 1000
# Proporcione el monto del impuesto: 21%
# Pago con impuesto: xxxxxx

def calcular_pago_total(pago_sin_impuesto, impuesto):
    pago_impuesto = pago_sin_impuesto * (impuesto / 100)
    pago_total = pago_sin_impuesto + pago_impuesto
    return pago_total

# Le solicitamos al usuario que ingrese el pago
pago_sin_impuesto = float(input("Proporcione el pago sin impuesto: $"))

# Le solicitamos al usuario que ingrese el monto del impuesto
impuesto = float(input("Proporcione el monto del impuesto (%): %"))

# LLamamos a la funcion para calcular el pago total
pago_total = calcular_pago_total(pago_sin_impuesto, impuesto)

# Le motramos al usuario el resultado del pago total con el impuesto incluido
print(f"\nPago sin Impuesto: ${pago_sin_impuesto:.2f}")
print(f"Impuesto: ${pago_total - pago_sin_impuesto:.2f}")
print(f"Pago con Impuesto: ${pago_total:.2f}")