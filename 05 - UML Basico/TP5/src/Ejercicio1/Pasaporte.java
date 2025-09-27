package Ejercicio1;


public class Pasaporte {
    private int numero;
    private String fechaEmision;
    private Foto foto;              // Composicion
    private Titular titular;        // Asocicion

    @Override
    public String toString() {
        return "Pasaporte{" + "numero=" + numero + ", fechaEmision=" + fechaEmision + ", foto=" + (foto != null ? foto.getImagen() + "." + foto.getFormato() : "No tiene foto") + '}';
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(String fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public String obtenerFoto() {
        return foto.getImagen()+ "." + foto.getFormato();
    }

    public void setFoto(Foto foto) {
        this.foto = foto;
    }

    public Pasaporte(int numero, String fechaEmision, String imagen, String formato) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = new Foto(imagen, formato);
    }

    public Titular getTitular() {
        return titular;
    }
    public void setTitular(Titular titular) {
        this.titular = titular;
        if (titular != null && titular.getPasaporte() != this) {
            titular.setPasaporte(this);
        }
    }
    
}
    


