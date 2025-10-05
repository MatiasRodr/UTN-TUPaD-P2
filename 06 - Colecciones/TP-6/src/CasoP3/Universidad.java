/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CasoP3;

import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author Marco
 */
public class Universidad {
    private String nombre;
    private ArrayList<Profesor> profesores;
    private ArrayList<Curso> cursos;

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }
    
    public void agregarProfesor(Profesor p) {
        
        profesores.add(p);
        System.out.println("Profesor "+ p.getId()+ " agregado correctamente!!!!");
    }

    public void agregarCurso(Curso c) {
        cursos.add(c);
        System.out.println("Curso "+ c.getCodigo()+ " agregado correctamente!!!!");
    }
    
    public Profesor buscarProfesorPorId(String idProfesor){
        Profesor prof = null;
        for (Profesor profesore : profesores) {
            if(profesore.getId().equalsIgnoreCase(idProfesor)){
                prof = profesore;
            }
        }
        return prof;
    }
    
    public Curso buscarCursoPorCodigo(String codigoCurso){
        Curso cur = null;
        for (Curso curso : cursos) {
            if(curso.getCodigo().equalsIgnoreCase(codigoCurso)){
                cur = curso;
            }
        }
        return cur; 
    }
    public void asignarProfesorACurso(String codigoCurso, String idProfesor){
        Curso c = buscarCursoPorCodigo(codigoCurso);
        Profesor p = buscarProfesorPorId(idProfesor);
        if (c != null && p != null) {
            c.setProfesor(p);
            System.out.println("\nProfesor/a " + p.getNombre() + " asignado al curso " + c.getNombre());
        } else {
            System.out.println("\nNo se encontró el curso o el profesor/a.");
        }
    }
    
    public void listarProfesores(){
        System.out.println("\n--- Lista profesores ---");
        for (Profesor p : profesores) {
            p.mostrarInfo();
            System.out.println("---------------------");
        }
    }
    
    public void listarCursos(){
        System.out.println("\n--- Lista cursos ---");
        for (Curso c : cursos) {
            c.mostrarInfo();
            System.out.println("---------------------");
        }
    }    
    
    public void eliminarCurso(String codigo){
        Curso c =buscarCursoPorCodigo(codigo);
        if(c != null){
          if(c.getProfesor() != null){
              System.out.println("Curso "+ c.getCodigo() + " - "+ c.getNombre() + " eliminado.");
              c.getProfesor().eliminarCurso(c);
          }
          cursos.remove(c);
        }
        
        
    }
    
    public void eliminarProfesor(String id){
        Profesor prof = buscarProfesorPorId(id);
        if(prof != null){
           System.out.println("Curso "+ prof.getId()+ " - "+ prof.getNombre() + " eliminado.");
           for (Curso c : new ArrayList<>(prof.getCursos())) {
               
                c.setProfesor(null);
            }
           profesores.remove(prof);
           
        }
    }
    
    public void reporteCursosPorProfesor() {
        System.out.println("\n Reporte de cantidad de cursos por profesor:");
        for (Profesor p : profesores) {
            System.out.println(" - " + p.getNombre() + ": " + p.getCursos().size() + " cursos");
        }
    }
}
