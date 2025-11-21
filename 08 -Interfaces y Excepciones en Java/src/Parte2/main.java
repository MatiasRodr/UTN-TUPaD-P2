
package Parte2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;





public class main {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 1 - División segura 
        System.out.print("Ingrese numerador: ");
        int numerador = sc.nextInt();

        System.out.print("Ingrese denominador: ");
        int denominador = sc.nextInt();

        try {
            int resultado = numerador / denominador;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: no se puede dividir por cero.");
        }
        
        // 2 - Conversión de cadena a número
        System.out.print("Ingrese un número: ");
        String texto = sc.nextLine();

        try {
            int numero = Integer.parseInt(texto);
            System.out.println("Número convertido: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Error: No es un número válido.");
        }   
        
        // 3 - Lectura de archivo 
        try {
            File archivo = new File("texto.txt");
            Scanner rc = new Scanner(archivo);

            while (rc.hasNextLine()) {
                System.out.println(rc.nextLine());
            }
            rc.close();

        } catch (FileNotFoundException e) {
            System.out.println("Error: el archivo no existe.");
        }        
        
        // 4 - Excepción personalizada
        CuentaBancaria cuenta = new CuentaBancaria(100);

        try {
            cuenta.retirar(150); // ?? lanza SaldoInsuficienteException
        } catch (SaldoInsuficienteException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        // 5 - Uso de try-with-resources
        List<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);

        try {
            // Intentamos acceder a un índice inválido
            System.out.println("Elemento en posición 5: " + numeros.get(5));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: índice fuera de rango.");
        }
    }
    
}
