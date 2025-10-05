package CasoP2;



public class Libro {
    private String isbn;
    private String titulo;
    private Autor autor;
    private int anioPublicacion;
    
    public Libro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    @Override
    public String toString() {
        return "Libro{" + "isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor.getNombre() + ", anioPublicacion=" + anioPublicacion + '}';
    }
    

    
    
    public void mostrarInfo() {
        System.out.println("Titulo: " + titulo);
        System.out.println("ISBN: " + isbn);
        System.out.println("A�o de publicacion: " + anioPublicacion);
        autor.mostrarInfo();

    }

    public String getIsbn() {
        return isbn;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public Autor getAutor() {
        return autor;
    }
}
