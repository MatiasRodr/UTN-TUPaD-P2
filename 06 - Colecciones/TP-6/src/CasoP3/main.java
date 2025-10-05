/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package CasoP3;

/**
 *
 * @author Marco
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("-----------------------------");
        System.out.println("Universidad Nacional.");
        System.out.println("-----------------------------");
        Universidad uni = new Universidad("Universidad Nacional");

        // Crear profesores y cursos
        Profesor prof1 = new Profesor("P1", "Ana Pérez", "Matemática");
        Profesor prof2 = new Profesor("P2", "Luis Gómez", "Informática");
        Profesor prof3 = new Profesor("P3", "Marta Díaz", "Historia");

        Curso c1 = new Curso("C101", "Álgebra");
        Curso c2 = new Curso("C102", "Programación I");
        Curso c3 = new Curso("C103", "Programación II");
        Curso c4 = new Curso("C104", "Probabilidad y Estadistica");
        Curso c5 = new Curso("C105", "Bases de Datos");

        // Agregar a la universidad
        uni.agregarProfesor(prof1);
        uni.agregarProfesor(prof2);
        uni.agregarProfesor(prof3);
        uni.agregarCurso(c1);
        uni.agregarCurso(c2);
        uni.agregarCurso(c3);
        uni.agregarCurso(c4);
        uni.agregarCurso(c5);
        
        // Asignar profesores a cursos
        uni.asignarProfesorACurso("C101", "P1");
        uni.asignarProfesorACurso("C102", "P2");
        uni.asignarProfesorACurso("C103", "P2");
        uni.asignarProfesorACurso("C104", "P3");
        uni.asignarProfesorACurso("C105", "P2");
        
        // Listar curso y profesores
        uni.listarCursos();
        uni.listarProfesores();
        
        //Cambiar profesor de curso
        uni.asignarProfesorACurso("C102", "P1");
        uni.listarCursos();
        uni.listarProfesores();
        
        // Eliminar un curso
        uni.eliminarCurso("C105");
        
        // Eliminar profesor
        uni.eliminarProfesor("P3");
        uni.listarCursos();
        
        // Reporte cursos por profesor
        uni.reporteCursosPorProfesor();
    }
    
}
