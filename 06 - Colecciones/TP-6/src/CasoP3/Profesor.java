
package CasoP3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Profesor {
    private String id;
    private String nombre;
    private String especialidad;
    private ArrayList<Curso> cursos = new ArrayList<>();;

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }
    
    public void agregarCurso(Curso cur) {
        if (cur != null && !cursos.contains(cur)) {
            cursos.add(cur);
            if (cur.getProfesor() != this) {
                cur.setProfesor(this);
            }
        }
    }
    
    public void eliminarCurso(Curso cur){
        if(cursos.contains(cur)&& cur != null){
            cursos.remove(cur);
        }if (cur.getProfesor() != this) {
                cur.setProfesor(this);
            }
    }
    
    public List<Curso> getCursos() { return cursos;}

    public void setCursos(ArrayList<Curso> cursos) {
        this.cursos = cursos;
    }
    
    
    public void mostrarInfo(){
        System.out.println("- Profesor ID: "+ id +
                "\n- Nombre: "+nombre+
                "\n- Especialidad: "+especialidad);
        int i=1;
        for (Curso curso : cursos) {
            System.out.println(i +" )"+ curso.getCodigo() +" - "+curso.getNombre());
            i++;
        }
    }

    public String getId() {return id;}
    public String getNombre() {return nombre;}
    
    
}
