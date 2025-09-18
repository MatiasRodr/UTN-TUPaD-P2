
package tp.pkg3;

public class NaveEspacial {
    private String nombre;
    private double combustible;
    private boolean despego;

    public NaveEspacial() {
        this.despego = false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCombustible() {
        return combustible;
    }

    public void setCombustible(double combustible) {
        this.combustible = combustible;
    }
    
    public void despegar() {
        if (getCombustible() > 0) {
            System.out.println(nombre + " ha despegado!");
            despego = true;
        } else {
            System.out.println("No hay combustible para despegar.");
        }
    }
    
    public void avanzar(int distancia) {
        if (despego) {
          if (combustible >= distancia) {
            combustible -= distancia;
            System.out.println(nombre + " avanzó " + distancia + " unidades.");
        } else {
            System.out.println("Combustible insuficiente para avanzar " + distancia + " unidades.");
        }  
        }else{
            System.out.println("Primero hay que despegar.");
        }
        
    }
    
    public void recargarCombustible(int cantidad) {
        if (combustible + cantidad <= 100) {
            combustible += cantidad;
            System.out.println("Combustible recargado. Actual: " + combustible);
        } else {
            System.out.println("No se puede superar el máximo de " + 100);
        }
    }
    
    public void mostrarEstado() {
        System.out.println("Nave: " + nombre + " | Combustible: " + combustible);
    }
}
