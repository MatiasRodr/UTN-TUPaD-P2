/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author Marco
 */
public class Libro {
    private String Libro;
    private String isbn;
    private Autor autor;
    private Editorial editorial;

    public Libro(String Libro, String isbn, Editorial editorial) {
        this.Libro = Libro;
        this.isbn = isbn;
        this.editorial = editorial;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    
    public void mostrarEditorial(){
        System.out.println("Editorial: "+editorial.getNombre()+", "+ editorial.getDireccion());
    }
    
    public void mostrarAutor(){
        if(autor != null){
            System.out.println("Autor: "+ autor.getNombre()+" de "+autor.getNacionalidad());
        }
    }

    public String getLibro() {
        return Libro;
    }

    public String getIsbn() {
        return isbn;
    }
    
    
    
}
