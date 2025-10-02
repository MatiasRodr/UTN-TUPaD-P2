package Ejercicio9;

public class Profesional {
    private String nombre;
    private String especialidad;
    private CitaMedica citaMedica;

    public Profesional(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
    }
    
    public void setCitaMedica(CitaMedica citaMedica) {
        this.citaMedica = citaMedica;
        if (citaMedica != null && citaMedica.getProfesional() != this) {
        citaMedica.setProfesional(this);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public CitaMedica getCitaMedica() {
        return citaMedica;
    }
    
    public String mostrarCitaMedica(){
         return "Fecha: "+ citaMedica.getFecha() + " - Hora:  "+ citaMedica.getHora();
    }
    
}
