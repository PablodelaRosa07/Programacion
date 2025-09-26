temperatura = float(input("La temperatura es :"))
if temperatura > 26 :
    print ("Encendiendo el aire acondicionado")

elif temperatura < 10 :
    print ("Encendiendo el calefactor")    
    
else : 
        print ("Apagando todo")  
    
print ("Registro:" + str(temperatura))