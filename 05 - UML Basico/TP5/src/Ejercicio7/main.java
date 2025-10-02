

package Ejercicio7;

public class main {


    public static void main(String[] args) {
        Motor m = new Motor("Diesel V6", "ENG-001");
        Conductor c = new Conductor("Colapinto", "123456");
        Vehiculo v = new Vehiculo("AA123BB", "Ford", m);

        v.setConductor(c);

        System.out.println("Conductor: " + v.getConductor().getNombre() + ", Licencia: " + v.getConductor().getLicencia());
        v.mostrarMotor();
        System.out.println("Vehiculo de " + c.getNombre() + ": " + c.getVehiculo().getPatente() + ", Modelo: " + c.getVehiculo().getModelo());
        
    }

    
}

