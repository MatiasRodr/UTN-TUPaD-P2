
package Ejercicio1;


public class main {


    public static void main(String[] args) {
        Titular titular1 = new Titular("Matias Rodriguez", 24269);
        Titular titular2 = new Titular("Messi", 101010);
        Pasaporte pasaporte1 = new Pasaporte(123, "27/10/1997", "imagen1", "PNG");
        Pasaporte pasaporte2 = new Pasaporte(10, "24/06/1987", "imagen2", "JPG");

        titular1.setPasaporte(pasaporte1);
        pasaporte2.setTitular(titular2);
        System.out.println(titular1 + "-" + titular1.getPasaporte());
        System.out.println(titular2 + "-" + titular2.getPasaporte());
        System.out.println(pasaporte1 + "-" + pasaporte1.getTitular());
        System.out.println(pasaporte2 + "-" + pasaporte2.getTitular());
        System.out.println("El pasaporte numero " + pasaporte1.getNumero() + " pertenece a " + pasaporte1.getTitular().getNombre());
        System.out.println("El pasaporte numero " + pasaporte2.getNumero() + " pertenece a " + pasaporte2.getTitular().getNombre());

        System.out.println("Foto del pasaporte 1: " + pasaporte1.obtenerFoto());
        System.out.println("Foto del pasaporte 2: " + pasaporte2.obtenerFoto());

    }
    
}
