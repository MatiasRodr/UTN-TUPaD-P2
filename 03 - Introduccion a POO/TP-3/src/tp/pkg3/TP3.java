
package tp.pkg3;

public class TP3 {

    
    public static void main(String[] args) {
        
        //// --------  EJERCIO NRO 1:  -----------------
        Estudiante e1 = new Estudiante();
        e1.setNombre("Matias");
        e1.setApellido("Rodriguez");
        e1.setCurso("Programación II");
        e1.setCalificacion(7);

        e1.mostrarInfo();
        e1.subirCalificacion(4);
        e1.bajarCalificacion(1);
        System.out.println("\nCalificaciones actualizadas:");
        e1.mostrarInfo();
        
        
        //// --------  EJERCIO NRO 2:  -----------------
        Mascota m1 = new Mascota();
        m1.setNombre("Firulais");
        m1.setEspecie("Perro");
        m1.setEdad(3);
        m1.mostrarInfo();
        m1.cumplirAnios();
        m1.cumplirAnios();
        m1.cumplirAnios();
        m1.mostrarInfo();
        
        
        //// --------  EJERCIO NRO 3:  -----------------
        Libro l1 = new Libro();
        l1.setTitulo("El Principito");
        l1.setAutor("Antoine de Saint-Exupéry");
        l1.setAñoPublicacion(1943);
        l1.mostrarInfo();
        l1.setAñoPublicacion(2030); // inválido
        l1.setAñoPublicacion(2020); // válido
        l1.mostrarInfo();        
        
        
        //// --------  EJERCIO NRO 4:  -----------------
        Gallina g1 = new Gallina();
        g1.setIdGallina(1);
        Gallina g2 = new Gallina();
        g2.setIdGallina(2);
        g1.envejecer();
        g1.ponerHuevo();
        g2.ponerHuevo();
        g2.ponerHuevo();
        g1.mostrarEstado();
        g2.mostrarEstado();  
    
         //// --------  EJERCIO NRO 5:  -----------------
        NaveEspacial nave = new NaveEspacial();
        nave.setNombre("Apolo");
        nave.setCombustible(50);
        nave.despegar();
        nave.avanzar(60); // no alcanza
        nave.recargarCombustible(30);
        nave.avanzar(60); // ahora sí
        nave.mostrarEstado();
    
    }
    
}
