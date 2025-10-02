package Ejercicio9;

public class main {

    public static void main(String[] args) {
        CitaMedica cita = new CitaMedica("27/10/2025", "14:00pm");
        Paciente paciente = new Paciente("matias","boreal");
        Profesional profesional = new Profesional("Chapatin", "Proctologo");
        cita.setPaciente(paciente);
        cita.setProfesional(profesional);
        
        System.out.println(paciente.mostrarCitaMedica());
        System.out.println(profesional.mostrarCitaMedica());
        System.out.println(cita.mostrarPaciente());
        System.out.println(cita.mostrarProfesional());
        
        

    }
    
}
