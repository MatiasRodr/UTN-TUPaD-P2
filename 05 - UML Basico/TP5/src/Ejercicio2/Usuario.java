package Ejercicio2;

public class Usuario {
    private String nombre;
    private String dni;
    private Celular celular;

    public Usuario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", dni=" + dni + ", celular=" + (celular != null ? celular.getMarca()+" "+celular.getModelo() : "No tiene celular") + '}';
    }

    public String getNombre() {
        return nombre;
    }
    
    public Celular getCelular() {
        return celular;
    }

    public void setCelular(Celular celular) {
        this.celular = celular;
        if (celular.getUsuario() != this) {
            celular.setUsuario(this);
        }
    }
}
