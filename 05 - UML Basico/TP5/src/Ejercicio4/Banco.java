/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

/**
 *
 * @author Marco
 */
public class Banco {
    private String nombre;
    private String cuit;

    public Banco(String nombre, String dni) {
        this.nombre = nombre;
        this.cuit = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCuit() {
        return cuit;
    }
    
}
