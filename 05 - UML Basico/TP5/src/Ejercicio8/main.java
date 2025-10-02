package Ejercicio8;


public class main {
    public static void main(String[] args) {
        Usuario user1 = new Usuario(null, null);
        Documento doc1 = new Documento("Contrato", "Contenido del contrato", "abc123", "2024-10-01", user1);
        doc1.mostrarFirma();
        System.out.println("Documento: " + doc1.getTitulo());
        System.out.println("Contenido: " + doc1.getContenido()); 
    }
}