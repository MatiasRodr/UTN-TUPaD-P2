import random

""" 1) Dado el diccionario precios_frutas
precios_frutas = {'Banana': 1200, 'Ananá': 2500, 'Melón': 3000, 'Uva':
1450}
Añadir las siguientes frutas con sus respectivos precios:
● Naranja = 1200
● Manzana = 1500
● Pera = 2300 """

precios_frutas = {'Banana': 1200, 'Ananá': 2500, 'Melón': 3000, 'Uva': 1450}
precios_frutas['Naranja'] = 1200
precios_frutas['Manzana'] = 1500
precios_frutas['Pera'] = 2300
print(precios_frutas)


""" 2) Siguiendo con el diccionario precios_frutas que resulta luego de ejecutar el código
desarrollado en el punto anterior, actualizar los precios de las siguientes frutas:
● Banana = 1330
● Manzana = 1700
● Melón = 2800 """

precios_frutas['Banana'] = 1330
precios_frutas['Manzana'] = 1700
precios_frutas['Melón'] = 2800
print(precios_frutas)


""" 3) Siguiendo con el diccionario precios_frutas que resulta luego de ejecutar el código
desarrollado en el punto anterior, crear una lista que contenga únicamente las frutas sin los
precios """

lista_frutas = list(precios_frutas.keys())
print(lista_frutas)

""" 4) Escribí un programa que permita almacenar y consultar números telefónicos.
• Permití al usuario cargar 5 contactos con su nombre como clave y número como valor.
• Luego, pedí un nombre y mostrale el número asociado, si existe."""

contactos = {}
for i in range(5):
    nombre = input("Ingrese el nombre del contacto: ")
    numero = input("Ingrese el número de teléfono: ")
    contactos[nombre] = numero
nombre_consulta = input("Ingrese el nombre del contacto a consultar: ")
if nombre_consulta in contactos:
    print(f"El número de {nombre_consulta} es: {contactos[nombre_consulta]}")
else:
    print(f"No se encontró el contacto: {nombre_consulta}")


""" 5) Solicita al usuario una frase e imprime:
• Las palabras únicas (usando un set).
• Un diccionario con la cantidad de veces que aparece cada palabra. """

frase = input("Ingrese una frase: ")
palabras = frase.split()
palabras_unicas = set(palabras)
print("Palabras únicas:", palabras_unicas)
conteo_palabras = {}
for palabra in palabras:
    if palabra in conteo_palabras:
        conteo_palabras[palabra] += 1
    else:
        conteo_palabras[palabra] = 1

print("Conteo de palabras:", conteo_palabras)



""" 6) Permití ingresar los nombres de 3 alumnos, y para cada uno una tupla de 3 notas.
Luego, mostrá el promedio de cada alumno """

alumnos = {}
for i in range(3):
    nombre = input("Ingrese el nombre del alumno: ")
    notas = tuple(float(input(f"Ingrese la nota {j+1} de {nombre}: ")) for j in range(3))
    alumnos[nombre] = notas

for nombre, notas in alumnos.items():
    promedio = sum(notas) / len(notas)
    print(f"El promedio de {nombre} es: {promedio}")

""" 7) Dado dos sets de números, representando dos listas de estudiantes que aprobaron Parcial 1
y Parcial 2:
• Mostrá los que aprobaron ambos parciales.
• Mostrá los que aprobaron solo uno de los dos.
• Mostrá la lista total de estudiantes que aprobaron al menos un parcial (sin repetir). """

parcial_1 = set(random.sample(range(100, 110), 5))
parcial_2 = set(random.sample(range(100, 110), 5))
print("Aprobados Parcial 1:", parcial_1)
print("Aprobados Parcial 2:", parcial_2)

aprobados_ambos = parcial_1.intersection(parcial_2)
print("Aprobados en ambos parciales:", aprobados_ambos)
aprobados_solo_uno = parcial_1.symmetric_difference(parcial_2)
print("Aprobados en solo uno de los parciales:", aprobados_solo_uno)
aprobados_totales = parcial_1.union(parcial_2)
print("Aprobados en al menos un parcial:", aprobados_totales)

""" 8) Armá un diccionario donde las claves sean nombres de productos y los valores su stock.
Permití al usuario:
• Consultar el stock de un producto ingresado.
• Agregar unidades al stock si el producto ya existe.
• Agregar un nuevo producto si no existe. """

productos_stock = {}
def consultar_stock(producto):
    return productos_stock.get(producto, "Producto no encontrado.")
def agregar_stock(producto, unidades):
    if producto in productos_stock:
        productos_stock[producto] += unidades
    else:
        productos_stock[producto] = unidades
        print(f"Producto {producto} agregado con {unidades} unidades.")

while True:
    accion = input("Ingrese 'consultar' para consultar stock, 'agregar' para agregar stock, o 'salir' para terminar: ").lower()
    if accion == 'salir':
        break
    elif accion == 'consultar':
        producto = input("Ingrese el nombre del producto a consultar: ")
        print(consultar_stock(producto))
    elif accion == 'agregar':
        producto = input("Ingrese el nombre del producto: ")
        unidades = int(input("Ingrese la cantidad de unidades a agregar: "))
        agregar_stock(producto, unidades)
    else:
        print("Acción no reconocida. Intente nuevamente.")




""" 9) Creá una agenda donde las claves sean tuplas de (día, hora) y los valores sean eventos.
Ejemplo: """


agenda = {
    ("lunes", "10:00"): "Reunión",
    ("martes", "15:00"): "Clase de inglés",
    ("miércoles", "18:30"): "Gimnasio",
    ("jueves", "20:00"): "Cena con amigos",
    ("viernes", "19:00"): "Partido de fútbol",
    ("sábado", "14:00"): "Almuerzo familiar",
    ("domingo", "10:00"): "Descanso"
}

dia = input("Ingresá el día: ").strip().lower()
hora = input("Ingresá la hora (formato HH:MM): ").strip()

evento = agenda.get((dia, hora))

if evento:
    print(f"Actividad programada: {evento}")
else:
    print("No hay actividad programada para ese día y hora.")


""" 10) Dado un diccionario que mapea nombres de países con sus capitales, construí un nuevo
diccionario donde:
• Las capitales sean las claves.
• Los países sean los valores. """

paises_capitales = {
    'Argentina': 'Buenos Aires',
    'Brasil': 'Brasilia',
    'Chile': 'Santiago',
    'Colombia': 'Bogotá',
    'Perú': 'Lima'
}

capitales_paises = {capital: pais for pais, capital in paises_capitales.items()}

print(capitales_paises)