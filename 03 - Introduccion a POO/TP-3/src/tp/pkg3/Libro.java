
package tp.pkg3;

public class Libro {
  
    private String titulo;
    private String autor;
    private int a�oPublicacion;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getA�oPublicacion() {
        return a�oPublicacion;
    }

    public void setA�oPublicacion(int a�oPublicacion) {
        if (a�oPublicacion > 1700 && a�oPublicacion<=2025) {
            this.a�oPublicacion = a�oPublicacion;
        } else {
            System.out.println("Error: a�o inv�lido.");
        }   
    }
   
    public void mostrarInfo(){
        System.out.println("Titulo: "+ getTitulo());
        System.out.println("Autor: "+ getAutor());
        System.out.println("A�o publicacion: "+ getA�oPublicacion());
    }
    
    
    
}
