
package Ejercicio1;


public class Titular {
    private String nombre;
    private int DNI;
    Pasaporte pasaporte;

    public Titular(String nombre, int DNI) {
        this.nombre = nombre;
        this.DNI = DNI;
    }

    public Pasaporte getPasaporte() {
        return pasaporte;
    }
    
    public void setPasaporte(Pasaporte pasaporte) {
        this.pasaporte = pasaporte;
        if (pasaporte != null && pasaporte.getTitular() != this) {
            pasaporte.setTitular(this);
        }
    }  

    public String getNombre() {
        return nombre;
    }

    public int getDNI() {
        return DNI;
    }


}
