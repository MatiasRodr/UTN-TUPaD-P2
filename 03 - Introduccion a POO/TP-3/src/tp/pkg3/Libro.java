
package tp.pkg3;

public class Libro {
  
    private String titulo;
    private String autor;
    private int añoPublicacion;

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

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public void setAñoPublicacion(int añoPublicacion) {
        if (añoPublicacion > 1700 && añoPublicacion<=2025) {
            this.añoPublicacion = añoPublicacion;
        } else {
            System.out.println("Error: año inválido.");
        }   
    }
   
    public void mostrarInfo(){
        System.out.println("Titulo: "+ getTitulo());
        System.out.println("Autor: "+ getAutor());
        System.out.println("Año publicacion: "+ getAñoPublicacion());
    }
    
    
    
}
