import math
""" 1. Crear una función llamada imprimir_hola_mundo que imprima por
pantalla el mensaje: “Hola Mundo!”. Llamar a esta función desde el
programa principal. """

def imprimir_hola_mundo():
    print("Hola Mundo!")
    
imprimir_hola_mundo()

""" 2. Crear una función llamada saludar_usuario(nombre) que reciba
como parámetro un nombre y devuelva un saludo personalizado.
Por ejemplo, si se llama con saludar_usuario("Marcos"), deberá devolver: “Hola Marcos!”. Llamar a esta función desde el programa
principal solicitando el nombre al usuario. """

def saludar_usuario(nombre):
    print(f"Hola {nombre}!")

nombre = input("Ingresa tu nombre: ")
saludar_usuario(nombre)

""" 3. Crear una función llamada informacion_personal(nombre, apellido,
edad, residencia) que reciba cuatro parámetros e imprima: “Soy
[nombre] [apellido], tengo [edad] años y vivo en [residencia]”. Pedir los datos al usuario y llamar a esta función con los valores ingresados. """

def informacion_pesonal(nombre, apellido, edad, residencia):
        print(f"Soy {nombre} {apellido}, tengo {edad} años y vivo en {residencia}.")

nombre = input("Ingresa tu nombre: ")
apellido = input("Ingresa tu apellido: ")
edad = int(input("Ingresa tu edad: "))
residencia= input("Ingresa tu residencia: ")
informacion_pesonal(nombre, apellido, edad, residencia)

""" 4. Crear dos funciones: calcular_area_circulo(radio) que reciba el radio como parámetro y devuelva el área del círculo. 
calcular_perimetro_circulo(radio) que reciba el radio como parámetro y devuelva el perímetro del círculo. 
Solicitar el radio al usuario y llamar ambas funciones para mostrar los resultados. """

def calcular_area_circulo(radio):
     area = math.pi*radio*radio
     print(f"El area del circulo es: {area}")
def calcular_perimetro_circulo(radio):
     perimetro = 2*math.pi*radio
     print(f"El perimetro del circulo es: {perimetro}")

radio = float(input("Ingresa el radio del circulo: "))
calcular_area_circulo(radio)
calcular_perimetro_circulo(radio)


    
""" 5. Crear una función llamada segundos_a_horas(segundos) que reciba
una cantidad de segundos como parámetro y devuelva la cantidad
de horas correspondientes. Solicitar al usuario los segundos y mostrar el resultado usando esta función. """

def segundos_a_horas(segundos):
     horas = segundos / 3600
     print(f"{segundos} segundos es igual a {horas} horas")

segundos = int(input("Ingresa los segundos para convertir a horas: "))
segundos_a_horas(segundos)

""" 6. Crear una función llamada tabla_multiplicar(numero) que reciba un
número como parámetro y imprima la tabla de multiplicar de ese
número del 1 al 10. Pedir al usuario el número y llamar a la función. """

def tabla_multiplicar(numero):
    for i in range(1,11):
        print(f"{numero} * {i} = {numero*i}")

num = int(input("Ingrese un numero: "))
tabla_multiplicar(num)

""" 7. Crear una función llamada operaciones_basicas(a, b) que reciba
dos números como parámetros y devuelva una tupla con el resultado de sumarlos, restarlos, multiplicarlos y dividirlos. 
Mostrar los resultados de forma clara. """

def operaciones_basicas(a, b):
    suma = a + b
    resta = a - b
    multiplicacion = a * b
    if b != 0:
        division = a / b
    else:
        division = "No se puede dividir por cero"
    return (suma, resta, multiplicacion, division)

a = int(input("Ingrese el primer numero: "))
b = int(input("Ingrese el segundo numero: "))
resultados = operaciones_basicas(a, b)
print(f"Suma: {resultados[0]}")
print(f"Resta: {resultados[1]}")
print(f"Multiplicacion: {resultados[2]}")
print(f"Division: {resultados[3]}")


""" 8. Crear una función llamada calcular_imc(peso, altura) que reciba el
peso en kilogramos y la altura en metros, y devuelva el índice de
masa corporal (IMC). Solicitar al usuario los datos y llamar a la función para 
mostrar el resultado con dos decimales. """

def calcular_imc(peso, altura):
    imc = peso / (altura*altura)
    print(f"Tu IMC es: {imc:.2f}")

peso = float(input("Ingrese el peso(kg): "))
altura = float(input("Ingrese la altura(metros): "))
calcular_imc(peso, altura)


""" 9. Crear una función llamada celsius_a_fahrenheit(celsius) que reciba
una temperatura en grados Celsius y devuelva su equivalente en
Fahrenheit. Pedir al usuario la temperatura en Celsius y mostrar el
resultado usando la función. """

def celsius_a_fahrenheit(celsius):
    fahrenheit = (celsius*9/5)+32
    print(f"{celsius} celsius es igual a {fahrenheit} fahrenheit.")

celsius = int(input("Ingrese la temperatura (Celsius): "))
celsius_a_fahrenheit(celsius)

""" 10.Crear una función llamada calcular_promedio(a, b, c) que reciba
tres números como parámetros y devuelva el promedio de ellos.
Solicitar los números al usuario y mostrar el resultado usando esta
función. """

def calcular_promedio(a, b, c):
    prom = (a+b+c)/3
    print(f"El primedio es: {prom}")

a = int(input("Ingrese el primer numero: "))
b = int(input("Ingrese el segundo numero: "))
c = int(input("Ingrese el tercer numero: "))
calcular_promedio(a, b, c)