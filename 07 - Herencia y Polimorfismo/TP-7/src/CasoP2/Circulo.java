package CasoP2;

public class Circulo extends FiguraGeometrica{
    private Double radio;

    public Circulo(String nombre, Double radio) {
        super(nombre);
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio ;
    }
    
    
}
