package CasoP2;


abstract public class FiguraGeometrica {
    private String nombre;

    public FiguraGeometrica(String nombre) {
        this.nombre = nombre;
    }
    
    
    abstract public double calcularArea();
    
}
