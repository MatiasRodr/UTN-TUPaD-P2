package CasoP2;

import java.util.ArrayList;



public class main {
    public static void main(String[] args) {
    // Instanciamos la Biblioteca
    Biblioteca biblioteca = new Biblioteca("El Ateneo");
    // Instanciamos 3 Autores
    Autor autor1 = new Autor("A123", "Stephen King", "USA");
    Autor autor2 = new Autor("A456", "J.K. Rowling", "UK");
    Autor autor3 = new Autor("A789","Edgar Allan Poe","USA");
    // Agregamos 5 libros a la Biblioteca
    biblioteca.agregarLibro("978-3-16-148410-0", "The Shining", 1977, autor1);
    biblioteca.agregarLibro("978-0-7475-3272-3", "Harry Potter and the Philosopher's Stone", 1997, autor2);
    biblioteca.agregarLibro("978-0-7475-38492-3", "Harry Potter and the Chamber of Secrets", 1998, autor2);
    biblioteca.agregarLibro("978-0-553-21311-7", "It", 1986, autor1);
    biblioteca.agregarLibro("978-0-14-243796-4", "The Tell-Tale Heart", 1843, autor3);
    // Listamos todos los libros
    System.out.println("Listado de libros en la biblioteca " + biblioteca.getNombre() + ":");
    biblioteca.listarLibros();
    // Buscar un libro
    Libro libroBuscado = biblioteca.buscarLibroPorIsbn("2122");
    if(libroBuscado == null){
        System.out.println("No se encontro el libro");
    }else{
        System.out.println("Se encontro"+ libroBuscado);
    }
    libroBuscado = biblioteca.buscarLibroPorIsbn("978-3-16-148410-0");
    if(libroBuscado == null){
        System.out.println("No se encontro el libro");
    }else{
        System.out.println("Se encontro el Libro: ");
        System.out.println(libroBuscado);
    }
    // Filtrar Libro
    ArrayList<Libro> libroFiltado = biblioteca.filtrarLibrosPorAnio(1997);
    if(libroFiltado.isEmpty()){
        System.out.println("No se encontro libros en ese a�o");
    }else{
        for (Libro libro : libroFiltado) {
            System.out.println("---------------------------");
            libro.mostrarInfo();
        }
    }
        
        
    // Eliminar Libro
    System.out.println("---------------------------");
    biblioteca.eliminarLibroPorIsbn("978-0-553-21311-7");
    biblioteca.listarLibros();
    
    // Cantidad Libros
    System.out.println("Hay "+ biblioteca.obtenerCantidadLibros()+" libros.");
    
    // Autores
    ArrayList<Autor> autores = biblioteca.mostrarAutoresDisponibles();
    int i = 1;
    System.out.println("---------------------------");
    System.out.println("AUTORES DISPONIBLE");
    for (Autor autore : autores) {
        System.out.println( i +") "+ autore);
        i++;
        }
    
    }
    
    
    

}


