""" 1) Crea un programa que imprima en pantalla todos los números enteros desde 0 hasta 100 
(incluyendo ambos extremos), en orden creciente, mostrando un número por línea.  """

for i in range(101):
    print(i)


"""  2) Desarrolla un programa que solicite al usuario un número entero y determine la cantidad de 
dígitos que contiene.  """

num = int(input("Ingrese un numero entero: "))
contador = 0
while num > 0:
    num = num // 10
    contador += 1
print("La cantidad de digitos es: ", contador)



"""3) Escribe un programa que sume todos los números enteros comprendidos entre dos valores 
dados por el usuario, excluyendo esos dos valores.""" 

num1 = int(input("Ingrese el primer numero: "))
num2 = int(input("Ingrese el segundo numero: "))
suma = 0
if num1 > num2:
    num1, num2 = num2, num1  
for i in range(num1+1,num2):
    suma = suma + i
print(f"La suma es igual a : {suma}")

"""4) Elabora un programa que permita al usuario ingresar números enteros y los sume en 
secuencia. El programa debe detenerse y mostrar el total acumulado cuando el usuario ingrese 
un 0. """

num = 1
suma = 0
while num != 0:
    num = int(input("Ingrese un numero(0 para terminar): "))
    suma = suma +num
print(f"La sumatoria de los numeros ingresados es: {suma}")

"""5) Crea un juego en el que el usuario deba adivinar un número aleatorio entre 0 y 9. Al final, el 
programa debe mostrar cuántos intentos fueron necesarios para acertar el número. """

import random
cont = 0
numero_usuario = -1
numero_aleatorio = random.randint(0, 9)
while numero_usuario != numero_aleatorio:
    numero_usuario = int(input("Adivina el numero(0-9): "))
    cont += 1
print(f"Perfecto el numero era {numero_aleatorio} y lo conseguiste en {cont} intentos!!")

"""6) Desarrolla un programa que imprima en pantalla todos los números pares comprendidos 
entre 0 y 100, en orden decreciente. """

for i in range(101):
    if i % 2 == 0 and i != 0:
        print(i)

"""7) Crea un programa que calcule la suma de todos los números comprendidos entre 0 y un 
número entero positivo indicado por el usuario. """ 

num = int(input("Ingrese el primer numero: "))
suma = 0
if num > 0:
    for i in range(num):
        suma = suma + i
else: 
    print("El numero tiene que ser mayor que 0.")
print(f"La suma es igual a : {suma}")

""" 8) Escribe un programa que permita al usuario ingresar 100 números enteros. Luego, el
programa debe indicar cuántos de estos números son pares, cuántos son impares, cuántos son
negativos y cuántos son positivos. (Nota: para probar el programa puedes usar una cantidad
menor, pero debe estar preparado para procesar 100 números con un solo cambio). """

par, impar, neg, pos = 0, 0, 0, 0   
for i in range(100):
    num = int(input(f"Ingrese el {i+1} numero: "))
    if num !=0:
        if num > 0:
            pos = pos + 1
        else: 
            impar = impar + 1
        if num % 2 == 0:
            par = par + 1
        else:
            neg = neg + 1
print(f"Resultados:\nPositivos: {pos}\nNegativos: {neg}\nPares: {par}\nImpares: {impar}") 

""" 9) Elabora un programa que permita al usuario ingresar 100 números enteros y luego calcule la
media de esos valores. (Nota: puedes probar el programa con una cantidad menor, pero debe
poder procesar 100 números cambiando solo un valor). """

suma = 0
for i in range(100):
    num = int(input(f"Ingrese el {i+1} numero: "))
    suma = suma + num
media = suma / 100
print(f"La media es: {media}")

""" 10) Escribe un programa que invierta el orden de los dígitos de un número ingresado por el
usuario. Ejemplo: si el usuario ingresa 547, el programa debe mostrar 745. """

num = int(input("Ingrese un numero: "))
inverso = 0
while num > 0:
    digito = num % 10
    inverso = inverso * 10 + digito
    num = num // 10
print(f"El numero invertido es: {inverso}") 