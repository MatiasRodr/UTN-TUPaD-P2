package Ejercicio5;

public class main {


    public static void main(String[] args) {
        Propietario maria = new Propietario("María Rojas", "40111222");
        Computadora pc = new Computadora("HP", "XCVB123", "ASUS Z790", "Intel Z790"); 
        pc.setPropietario(maria);
        
        System.out.println("PC : "+ pc.getMarca()+", chipset: "+pc.getNumeroSerie());
        pc.mostrarPropietario();
        pc.mostrarPlacaMadre();
    }
    
}
