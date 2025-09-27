
package Ejercicio1;


public class Titular {
    private String nombre;
    private int DNI;
    private Pasaporte pasaporte;

    public Titular(String nombre, int DNI) {
        this.nombre = nombre;
        this.DNI = DNI;
    }

    public Pasaporte getPasaporte() {
        return pasaporte;
    }
@Override
    public String toString() {
        return "Titular{" + "nombre=" + nombre + ", DNI=" + DNI + ", pasaporte=" + (pasaporte != null ? pasaporte.getNumero() : "No tiene pasaporte") + '}';
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
