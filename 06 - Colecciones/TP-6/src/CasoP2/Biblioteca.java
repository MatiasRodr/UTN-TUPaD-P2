package CasoP2;

import java.util.ArrayList;
import java.util.Iterator;

public class Biblioteca {
    private String nombre;
    private ArrayList<Libro> libros;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }


    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        libros.add(new Libro(isbn, titulo, anioPublicacion, autor));
    }

    public void listarLibros() {
        for (Libro libro : libros) {
            libro.mostrarInfo();
            System.out.println("---------------------");
        }
    }

    public Libro buscarLibroPorIsbn(String isbn) {
        Libro encontrado = null;
        Iterator<Libro> it = this.libros.iterator();
        while (it.hasNext() && encontrado == null) {
            Libro libro = it.next();
            if (libro.getIsbn().equals(isbn)) {
                encontrado = libro;
            }
        }
        return encontrado;
    }

    public void eliminarLibroPorIsbn(String isbn) {
        buscarLibroPorIsbn(isbn);
        System.out.println("El libro con ISBN " + isbn + " ha sido eliminado.");
        if (buscarLibroPorIsbn(isbn) != null) { libros.remove(buscarLibroPorIsbn(isbn));}
    }

    public int obtenerCantidadLibros() {
        return libros.size();
    }

    public ArrayList<Libro> filtrarLibrosPorAnio(int anio) {
        ArrayList<Libro> filtrados = new ArrayList<>();
        for (Libro libro : libros) {
            if (libro.getAnioPublicacion() == anio) {
                filtrados.add(libro);
            }
        }
        return filtrados;
    }

    public ArrayList<Autor> mostrarAutoresDisponibles(){
        ArrayList<Autor> autores = new ArrayList<>();
        for (Libro libro : libros) {
            if (!autores.contains(libro.getAutor())) {
                autores.add(libro.getAutor());
            }
        }
        return autores;
    }

    public String getNombre() {
        return nombre;
    }
}