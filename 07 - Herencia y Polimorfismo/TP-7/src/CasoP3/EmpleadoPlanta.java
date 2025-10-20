/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CasoP3;

/**
 *
 * @author Marco
 */
public class EmpleadoPlanta extends Empleado{
    private double sueldoBase;
    private int aniosAntiguedad;
    
    public EmpleadoPlanta(String nombre, double sueldoBase, int aniosAntiguedad) {
        super(nombre);
        this.sueldoBase = sueldoBase;
        this.aniosAntiguedad = aniosAntiguedad;
    }

    public double calcularSueldo() {
        return sueldoBase + (aniosAntiguedad * 1000);
    }
    
    
}
