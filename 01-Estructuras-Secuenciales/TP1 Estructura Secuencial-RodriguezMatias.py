import math
# Ejercicio 1
""" print("Hola Mundo!") """

# Ejercicio 2
""" nombre = input("Ingrese su nombre: ")
print(f"Hola {nombre}!") """

#Ejercicio 3
""" nombre = input("Ingrese su nombre: ")
apellido = input("Ingrese su apellido: ")
edad = input("Ingrese su edad: ")
residencia = input("Ingrese su residencia: ")
print(f"Soy {nombre} {apellido}, tengo {edad} y vivo en {residencia}") """


# Ejercicio 4
""" radio = float(input("Ingrese el radio del circulo: "))
per = radio* 2 * math.pi
print(f"El perimetro es: {per}") """ 

# Ejercicio 5
""" seg = int(input("Ingrese el tiempo(segundos): "))
horas = seg / 60
print(f"{seg} segundos son {horas} horas") """ 

# Ejercicio 6
""" num = int(input("Ingrese un numero: "))
for i in range(1, 11):
    print(f"{num} * {i} = {i*num}") """
 

#Ejercicio 7
""" num1 = int(input("Ingrese el primer numero: "))
if(num1 != 0):
    num2 = int(input("Ingrese el segundo numero: "))
    if(num2 != 0):
        print(f"La suma es: {num1 + num2}")
        print(f"La resta es: {num1 - num2}")
        print(f"La multiplicacion es: {num1 * num2}")
        print(f"La division es: {num1 / num2}")
    else:
        print("El numero no puede ser 0")
else: 
    print("El numero no puede ser 0") """ 

#Ejercicio 8
""" alt = float(input("Ingrese su altura: "))
peso = float(input("Ingrese su peso: "))
imc = peso / (alt**2)
print(f"Su IMC es: {imc}") """

#Ejercicio 9
""" tempC = float(input("Ingrese la temperatura(Celsius): "))
tempF = (tempC * 9/5) + 32
print(f"La temperatura en Fahrenheit es: {tempF}") """

#Ejercicio 10
""" num1 = int(input("Ingrese el primer numero: "))
num2 = int(input("Ingrese el segundo numero: "))
num3 = int(input("Ingrese el tercer numero: "))
promedio = (num1 + num2 + num3) / 3
print(f"El promedio es: {promedio}") """
