
package tp.pkg3;


public class Estudiante {
    private String nombre;
    private String apellido;
    private String curso;
    private int calificacion;
    
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCurso() {
        return curso;
    }

    public int getCalificacion() {
        return calificacion;
    }  

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }
    
    public void subirCalificacion(int puntos) {
        if (getCalificacion()+puntos>10) {
            setCalificacion(10);
        }
        else{
            setCalificacion(getCalificacion()+puntos);
        }
    }

    public void bajarCalificacion(int puntos) {
        if (getCalificacion()-puntos<0) {
            setCalificacion(0);
        }
        else{
            setCalificacion(getCalificacion()-puntos);
        }
    } 
    public void mostrarInfo(){
        System.out.println("Nombre: "+ getNombre() + getApellido());
        System.out.println("Curso: "+ getCurso());
        System.out.println("Nota: "+ getCalificacion());
    }
    
  
}
