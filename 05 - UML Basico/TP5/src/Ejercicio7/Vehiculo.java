package Ejercicio7;

import Ejercicio5.Propietario;

public class Vehiculo {
    private String patente;
    private String modelo;
    private Motor motor;       // Agregación
    private Conductor conductor; // Asociación Bidireccional


    public Vehiculo(String patente, String modelo, Motor motor) {
        this.patente = patente;
        this.modelo = modelo;
        this.motor = motor; // Agregación: inyección del objeto existente
    }
    
    public void mostrarMotor(){
        System.out.println("Numero de serie: : "+ motor.getNumeroSerie()+" de motor "+motor.getTipo()+" .");
    }
    
    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
        if (conductor != null && conductor.ge() != this) {conductor.setVehiculo(this);
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
