package Ejercicio9;

public class CitaMedica {
    private String fecha;
    private String hora;
    private Profesional profesional;
    private Paciente paciente;

    public CitaMedica(String fecha, String hora) {
        this.fecha = fecha;
        this.hora = hora;
    }
    
    public void setProfesional(Profesional profesional) {
        this.profesional = profesional;
        if (profesional != null && profesional.getCitaMedica() != this) {
        profesional.setCitaMedica(this);
        }
    }   
    
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
        if (paciente != null && paciente.getCitaMedica()!= this) {
        paciente.setCitaMedica(this);
        }  
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    public Profesional getProfesional() {
        return profesional;
    }

    public Paciente getPaciente() {
        return paciente;
    }
    
    public String mostrarProfesional() {
        return "Doctor: "+ profesional.getNombre() + " - "+ profesional.getEspecialidad();
    }

    public String mostrarPaciente() {
        return "Paciente: "+ paciente.getNombre() + " - "+ paciente.getObraSocial();
    }
    
}
