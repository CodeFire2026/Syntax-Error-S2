lista1 = ["python", "java", "javascript", "html", "css"]
lista2 = ["python", "java", "c++", "php", "css"]

lista1 = set(lista1)
lista2 = set(lista2)

print("Todas:", lista1 | lista2)
print("Solo primera:", lista1 - lista2)
print("Solo segunda:", lista2 - lista1)
print("En ambas:", lista1 & lista2)