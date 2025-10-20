
package CasoP3;

import java.util.ArrayList;


public class main {

    public static void main(String[] args) {
    ArrayList<Empleado> empleados = new ArrayList<>();

        empleados.add(new EmpleadoPlanta("Ana", 200000.00 , 5));
        empleados.add(new EmpleadoTemporal("Luis", 20, 8000));
        empleados.add(new EmpleadoPlanta("María", 180000, 3));
        empleados.add(new EmpleadoTemporal("Pedro", 15, 7500));

        for (Empleado e : empleados) {
            System.out.println("Empleado: " + e.getNombre());
            System.out.println("Sueldo: $" + e.calcularSueldo());
            if (e instanceof EmpleadoPlanta) {
                System.out.println(" Tipo: Empleado de planta");
            } else if (e instanceof EmpleadoTemporal) {
                System.out.println(" Tipo: Empleado temporal");
            }    
    }
        

    }
}
