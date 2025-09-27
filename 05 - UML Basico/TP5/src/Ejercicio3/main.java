package Ejercicio3;


public class main {
    public static void main(String[] args) {
        Editorial edi1 = new Editorial("Sudamericana","Calle Falsa 123");
        Autor autor1 = new Autor("Jorge Borges", "Argentina");
        Libro lb1 = new Libro("Ficciones","554523",edi1);
        lb1.setAutor(autor1);
        
        System.out.println("Libro: "+ lb1.getLibro()+", ISBN: "+lb1.getIsbn());
        lb1.mostrarAutor();
        lb1.mostrarEditorial();
    
    }
    
}
