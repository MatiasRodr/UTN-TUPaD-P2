
package CasoP2;

import java.util.ArrayList;

public class main {


    public static void main(String[] args) {
        ArrayList<FiguraGeometrica> figuras = new ArrayList<>();
        figuras.add(new Circulo("Circulo 1",3.0));
        figuras.add(new Circulo("Circulo 2",5.0));
        figuras.add(new Circulo("Circulo 3",1.0));
        figuras.add(new Circulo("Circulo 4",7.0));
        figuras.add(new Rectangulo("Rectangulo 1",2,1));
        figuras.add(new Rectangulo("Rectangulo 2",2,4));
        figuras.add(new Rectangulo("Rectangulo 3",3,1));
        figuras.add(new Rectangulo("Rectangulo 3",5,4));
        
        for (FiguraGeometrica figura : figuras) {
            System.out.println(figura.calcularArea());
        }
    }
    
}
