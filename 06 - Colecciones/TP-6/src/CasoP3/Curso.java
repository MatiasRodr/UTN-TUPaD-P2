
package CasoP3;

import java.util.Collections;
public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor; // puede ser null

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }
    
    public void setProfesor(Profesor profesor) {
        if (this.profesor == profesor) return;
        if (this.profesor != null) {
            this.profesor.eliminarCurso(this); // quitar de la lista anterior
        }
        this.profesor = profesor;
        if (profesor != null && !profesor.getCursos().contains(this)){
            
            profesor.agregarCurso(this); // agregar a la lista del nuevo profesor
        }
    }
    
    public Profesor getProfesor() {
        return profesor;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void mostrarInfo() {
        System.out.println("Codigo Curso: "+ codigo);
        System.out.println("Nombre Curso: "+ nombre);
        if(profesor == null){
            System.out.println("No tiene profesor asignado");
            
        }else{
            System.out.println("Profesor: " + profesor.getId() + " - " + profesor.getNombre());
        }
    }
}
