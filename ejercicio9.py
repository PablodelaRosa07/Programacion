num1 = float(input("Introduce un número:"))
num2 = float(input("Introduce otro número"))
if num1 and num2 >= 0 :
    print("Los 2 números son positivos")
elif num1 < 0 and num2 >= 0:
    print("Solo un número es positivo")
elif num1 >= 0 and num2 < 0 :
    print("Solo un número es positivo")
else :
    print("Ninguno es positivo")