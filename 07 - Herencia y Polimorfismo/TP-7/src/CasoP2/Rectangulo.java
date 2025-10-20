
package CasoP2;


public class Rectangulo extends FiguraGeometrica{
    
     private double lado;
     private double altura;

    public Rectangulo(String nombre,double lado, double altura){
        super(nombre);
        this.lado = lado;
        this.altura = altura;
        
    }
        
        
    @Override
    public double calcularArea() {
        return lado*altura;
    }        
    
}
