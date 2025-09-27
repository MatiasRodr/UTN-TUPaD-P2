package Ejercicio5;

public class Computadora {
    private String marca;
    private String numeroSerie;
    private PlacaMadre placaMadre;
    private Propietario propietario;      

    
    public Computadora(String marca, String numeroSerie, String modeloPlaca, String chipsetPlaca) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.placaMadre = new PlacaMadre(modeloPlaca, chipsetPlaca); 
        }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
        if (propietario != null && propietario.getComputadora() != this) {
            propietario.setComputadora(this);
        }
    }

    public void mostrarPropietario() {
        System.out.println("Nombre: "+ propietario.getNombre()+" , DNI: "+ propietario.getDni());
    }
    
    public void mostrarPlacaMadre() {
        System.out.println("Nombre: "+ placaMadre.getModelo()+" , DNI: "+ placaMadre.getChipset());
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }  

    public String getMarca() {
        return marca;
    }

    public PlacaMadre getPlacaMadre() {
        return placaMadre;
    }
}
