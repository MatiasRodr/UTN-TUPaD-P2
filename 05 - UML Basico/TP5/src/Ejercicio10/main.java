/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio10;



/**
 *
 * @author Marco
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Titular titular = new Titular("Matias", "40918990");
        CuentaBancaria cuenta = new CuentaBancaria("545355",5000.00,"12345","27/10/2025");
        titular.setCuentaBancaria(cuenta);
        
        System.out.println(cuenta.mostrarClaveSeguridad());
        System.out.println(cuenta.mostrarTitular());
        System.out.println(titular.mostrarCuentaBancaria());;

    }
    
}
