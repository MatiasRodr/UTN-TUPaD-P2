package Ejercicio9;


public class Paciente {
    private String nombre;
    private String obraSocial;
    private CitaMedica citaMedica;

    public Paciente(String nombre, String obraSocial) {
        this.nombre = nombre;
        this.obraSocial = obraSocial;
    }
    
    public void setCitaMedica(CitaMedica citaMedica) {
        this.citaMedica = citaMedica;
        if (citaMedica != null && citaMedica.getPaciente() != this) {
        citaMedica.setPaciente(this);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public String getObraSocial() {
        return obraSocial;
    }

    public CitaMedica getCitaMedica() {
        return citaMedica;
    }

    public String mostrarCitaMedica(){
            return "Fecha: "+ citaMedica.getFecha() + " - Hora:  "+ citaMedica.getHora();
    }
    
}
