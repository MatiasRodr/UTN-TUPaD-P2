
package Ejercicio1;


public class main {


    public static void main(String[] args) {
        Titular titular = new Titular("Matias Rodriguez", 123);
        Pasaporte pasaporte = new Pasaporte(123, "27/10/1997", "asfksad", "PNG");
        titular.setPasaporte(pasaporte);
    }
    
}
