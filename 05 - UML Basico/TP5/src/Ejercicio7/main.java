package Ejercicio7;


public class main {


    public static void main(String[] args) {
        Motor m = new Motor("Di�sel V6", "ENG-001"); 
        Conductor c = new Conductor("Pablo Gim�nez", "A-123456");
        Vehiculo v = new Vehiculo("AA123BB", "Camioneta Ford", m);
    }
    
}
