puntaje = float(input("Introduce tu puntaje de crédito:"))
ingreso = float(input("Introduce tu ingreso anueal:"))
if puntaje > 700 and ingreso > 60000:
    print("Eres elegible para un préstamo hipotecario")
else :
    print("No eres elegible para un préstamo hipotecario")