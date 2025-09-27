package Ejercicio2;


public class main {
    public static void main(String[] args) {

        Bateria bateria1 = new Bateria("Ready", 4000);
        Usuario usuario1 = new Usuario("Matias", "12345678");
        Celular celular1 = new Celular("356789012345678", "Samsung", "Galaxy S21", bateria1, usuario1);
        usuario1.setCelular(celular1);
        System.out.println(celular1);
        System.out.println(usuario1);
        System.out.println(bateria1);
    }

}


