
package tp.pkg3;


public class Mascota {
    private String nombre;
    private String especie;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void mostrarInfo(){
        System.out.println("Nombre: "+ getNombre());
        System.out.println("Especie: "+ getEspecie());
        System.out.println("edad: "+ getEdad());
    }
    
    public void cumplirAnios(){
        setEdad(1);
        System.out.println(getNombre() +" ahora tiene "+ getEdad()+ "años!!!!");
    }
}
