
package tp.pkg3;

public class Gallina {
    private int idGallina;
    private int edad;
    private int huevosPuestos;    

    public int getIdGallina() {
        return idGallina;
    }

    public void setIdGallina(int idGallina) {
        this.idGallina = idGallina;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getHuevosPuestos() {
        return huevosPuestos;
    }

    public void setHuevosPuestos(int huevosPuestos) {
        this.huevosPuestos = huevosPuestos;
    }
    
    public void ponerHuevo()
    {
        huevosPuestos++;
    }
    
    public void envejecer() {
        edad++;
    }
    
    public void mostrarEstado(){
        System.out.println("ID Gallina: "+ getIdGallina());
        System.out.println("Edad: " + getEdad());
        System.out.println("Huevos Puestos: "+ getHuevosPuestos());
    }
}
