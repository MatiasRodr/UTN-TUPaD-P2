package tp.pkg2;
import java.util.Scanner;

public class TP2 {

 /// Variables Globales
    static final double DESCUENTO_ESPECIAL = 0.10;

    
    /// Metodo
    public static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        double impuestoDecimal = impuesto / 100;
        double descuentoDecimal = descuento / 100; 
        return precioBase + (precioBase * impuestoDecimal) - (precioBase * descuentoDecimal);
    }
    
    public static double calcularCostoEnvio(double peso, String zona) {
        if (zona.equalsIgnoreCase("Nacional")){
            return peso * 5;
        } else{
            return peso *10;
        }
    }
    
     public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
         return precioProducto + costoEnvio;
    }

    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        return stockActual - cantidadVendida + cantidadRecibida;
    }
    
    public static void calcularDescuentoEspecial(double precio) {
        double descuentoAplicado = precio * DESCUENTO_ESPECIAL;
        double precioFinal = precio - descuentoAplicado;
        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + precioFinal);
    }
    
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

        // Ejercicio 1: Verificación de Año Bisiesto.
//        int anio;
//        System.out.println("Ingrese un año: ");
//        anio = Integer.parseInt(input.nextLine());
//
//        if((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)){
//            System.out.println("Es bisiesto");
//        } else{
//            System.out.println("No es bisiesto");
//        }

        // Ejercicio 2: Mayor de 3 numeros
//        int num, mayor= 0;
//        for (int i = 0; i < 3; i++) {
//           System.out.println("Ingrese el " + i+1 + " numero: ");
//           num = Integer.parseInt(input.nextLine());
//           if(mayor == 0 || num>mayor)
//           {
//               mayor = num;
//           }
//        }
//        System.out.println("El mayor es: " + mayor);

        // Ejercicio 3: Clasificacion de edad

//        System.out.println("Ingrese su edad: ");
//        int edad = Integer.parseInt(input.nextLine());
//
//        if (edad < 12) {
//            System.out.println("Niño");
//        } else if (edad >= 12 && edad <= 17) {
//            System.out.println("Adolescente");
//        } else if (edad >= 18 && edad <= 59) {
//            System.out.println("Adulto");
//        } else {
//            System.out.println("Adulto mayor");
//        }

        // Ejercicio 4: Calculadora de Descuento según categoría.
//        double  precioFinal;
//        System.out.println("Ingrese el precio del producto: ");
//        int precio = Integer.parseInt(input.nextLine());
//        System.out.println("Ingrese la categoria del producto(A, B, C): ");
//        String categoria = input.nextLine();
//
//        if ( categoria.equalsIgnoreCase("A")){
//            precioFinal = precio - (precio * 0.1);
//            System.out.println("Descuento aplicado: 10%");
//            System.out.println("Precion final: " + precioFinal);
//            } else if (categoria.equalsIgnoreCase("B")){
//                precioFinal = precio - (precio * 0.15);
//                System.out.println("Descuento aplicado: 15%");
//                System.out.println("Precion final: " + precioFinal);
//                } else if (categoria.equalsIgnoreCase("C")){
//                    precioFinal = precio - (precio * 0.2);
//                    System.out.println("Descuento aplicado: 20%");
//                    System.out.println("Precion final: " + precioFinal);
//                } else {
//                    precioFinal = precio;
//                    System.out.println("Categoria inexistente");
//                    System.out.println("Precion final: " + precioFinal);
//                }

        // Ejercicio 5: Suma de Números Pares (while)
//        int num=1, suma=0;
//        while(num != 0){
//            System.out.println("Ingrese un número (0 para terminar):");
//            num = Integer.parseInt(input.nextLine());
//            if(num % 2 == 0){
//                suma = suma + num;
//            }
//        }
//        System.out.println("La suma de los números pares es: " + suma);


        // Ejercicio 6: Contador de Positivos, Negativos y Ceros (for).
//        int num=1, positivo=0, negativo=0, cero=0;
//        for (int i = 1; i <= 10; i++) {
//           System.out.println("Ingrese el número " + i + ": ");
//            num = Integer.parseInt(input.nextLine());
//            if(num > 0){
//                positivo++;
//            } else if (num < 0){
//                negativo++;
//            } else{
//                cero++;
//            }}
//        System.out.println("Resultados: ");
//        System.out.println("Positivos: " + positivo);
//        System.out.println("Negativos: " + negativo);
//        System.out.println("Ceros: " + cero);


        // Ejercicio 7: Validación de Nota entre 0 y 10 (do-while).
//        int nota;
//        while (true) {
//            System.out.print("Ingrese una nota (0-10): ");
//            nota = input.nextInt();
//
//            if (nota >= 0 && nota <= 10) {
//                System.out.println("Nota guardada correctamente.");
//                break;
//            } else {
//                System.out.println("Error: Nota inválida. Ingrese una nota entre 0 y 10.");
//            }
//    }

        // Ejercicio 8: Cálculo del Precio Final con impuesto y descuento.
//         System.out.print("Ingrese el precio base del producto: ");
//        double precioBase = input.nextDouble();
//        System.out.print("Ingrese el impuesto en porcentaje: ");
//        double impuesto = input.nextDouble();
//        System.out.print("Ingrese el descuento en porcentaje: ");
//        double descuento = input.nextDouble();
//        double resultado = calcularPrecioFinal(precioBase, impuesto, descuento);
//        System.out.println("El precio final del producto es: " + resultado);

        // Ejercicio 9: Composición de funciones para calcular costo de envío y total de compra
        
//        System.out.print("Ingrese el precio del producto: ");
//        double precio = Double.parseDouble(input.nextLine());
//        System.out.print("Ingrese el peso del paquete en kg: ");
//        double peso = Double.parseDouble(input.nextLine());
//        System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
//        String zona = input.nextLine();
//        
//        double precioEnvio = calcularCostoEnvio(peso, zona);
//        System.out.println("El costo de envío es: " + precioEnvio);
//        System.out.println("El total a pagar es: " + calcularTotalCompra(precio, precioEnvio));
        

        // Ejercicio 10: Actualización de stock a partir de venta y recepción de productos.

//        System.out.print("Ingrese el stock actual del producto: ");
//        int stockActual = Integer.parseInt(input.nextLine());
//        System.out.print("Ingrese la cantidad vendida: ");
//        int cantidadVendida = Integer.parseInt(input.nextLine());
//        System.out.print("Ingrese la cantidad recibida: ");
//        int cantidadRecibida = Integer.parseInt(input.nextLine());
//        int nuevoStock = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);
//        System.out.println("El nuevo stock del producto es: " + nuevoStock);


        // Ejercicio 11:  Cálculo de descuento especial usando variable global.
//        System.out.print("Ingrese el precio del producto: ");
//        double precio = Double.parseDouble(input.nextLine());
//        calcularDescuentoEspecial(precio);
    }
    
}
