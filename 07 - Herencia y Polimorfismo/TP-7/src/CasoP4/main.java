package CasoP4;

import java.util.ArrayList;


public class main {


    public static void main(String[] args) {
        ArrayList<Animal> animales = new ArrayList<>();

        animales.add(new Perro("Atila"));
        animales.add(new Gato("Tita"));
        animales.add(new Vaca("Lola"));

        for (Animal a : animales) {
            a.describirAnimal();
            a.hacerSonido();
            System.out.println("-----------------------------");
        }
    }
    
    
}
