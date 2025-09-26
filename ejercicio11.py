num1 = float(input("Introduce un número:"))
num2 = float(input("Introduce un segundo número:"))
num3 = float(input("Introduce un tercer número:"))
if num1 > num2 and num1 > num3 :
    print("El número", num1, "es el mayor")
elif num2 > num1 and num2 > num3 :
    print("El número", num2, "es el mayor")
elif num3 > num1 and num3 > num2 :
    print("El número", num3, "es el mayor")
else :
    print("Todos los números son iguales")