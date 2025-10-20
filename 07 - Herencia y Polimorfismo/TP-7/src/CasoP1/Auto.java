package CasoP1;

public class Auto extends Vehiculo {
    public int catidadPuertas;

    public Auto(String marca, String modelo,int cantidadPuertas) {
        super(marca, modelo); // Llama al constructor de la clase base
        this.catidadPuertas = cantidadPuertas;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo(); // Llama al metodo de la clase base
        System.out.println("Cantidad de Puertas: " + catidadPuertas);
    }
}
