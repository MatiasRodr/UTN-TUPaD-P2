
package Ejercicio7;



public class Vehiculo {
    private String patente;
    private String modelo;
    private Motor motor;       // Agregaci�n
    private Conductor conductor; // Asociaci�n Bidireccional


    public Vehiculo(String patente, String modelo, Motor motor) {
        this.patente = patente;
        this.modelo = modelo;
        this.motor = motor; // Agregaci�n: inyecci�n del objeto existente
    }
    
    public void mostrarMotor(){
        System.out.println("Numero de serie: : "+ motor.getNumeroSerie()+" de motor "+motor.getTipo()+" .");
    }
    
    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
        if (conductor != null && conductor.getVehiculo() != this) {conductor.setVehiculo(this);
        }
    }
    public String getPatente() {
        return patente;
    }

    public String getModelo() {
        return modelo;
    }
    
    public Conductor getConductor() {
        return conductor;
    }
    
    
}
