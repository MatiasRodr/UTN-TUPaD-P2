package Ejercicio8;

public class Documento {

    private String titulo;
    private String contenido;
    private FirmaDigital firma;

    public Documento(String titulo, String contenido, String codigoHash, String fecha, Usuario usuario) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.firma = new FirmaDigital(codigoHash, fecha, usuario);  
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    // Método para mostrar información del documento
    public void mostrarFirma() {
        System.out.println("CodigoHash: " + firma.getCodigoHash());
        System.out.println("Fecha: " + firma.getFecha());
        firma.mostrarUsuario();
    }
}

