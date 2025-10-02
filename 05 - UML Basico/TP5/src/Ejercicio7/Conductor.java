package Ejercicio7;


public class Conductor {
    private String nombre;
    private String licencia;
    private Vehiculo vehiculo; // Referencia a Vehiculo

    public Conductor(String nombre, String licencia) {
        this.nombre = nombre;
        this.licencia = licencia;
    }

    public String getNombre() {
        return nombre;
    }

    public String getLicencia() {
        return licencia;
    }
    
    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    // Setter para establecer el enlace bidireccional desde Conductor
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
        
        // Gestiona la bidireccionalidad: si el veh�culo no tiene este conductor, lo asigna.
        if (vehiculo != null && vehiculo.getConductor() != this) {
            vehiculo.setConductor(this);
        }
    }    
}
