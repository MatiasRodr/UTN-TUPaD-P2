package CasoP4;


public class Animal {
    private String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }
    
    
    public void hacerSonido(){
        System.out.println("Sonido desconocido");
    }
    
    public void describirAnimal(){
        System.out.println("Nombre: "+ nombre);
    }
}
