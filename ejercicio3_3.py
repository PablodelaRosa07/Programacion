vip = input("Eres VIP?:")
if vip == "Si" or vip == "si" :
    print("Tienes un descuento")
    quit()
else :
    gasto = input("Has gastado más de 100€ en tienda?:")
    if gasto == "Si" or gasto == "si" :
        print("Tienes un descuento")
        quit()
    else:
        input("No tienes un descuento")