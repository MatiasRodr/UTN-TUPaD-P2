package Ejercicio6;


public class main {

    public static void main(String[] args) {
        Mesa m = new Mesa(10, 4); 
        Cliente c = new Cliente("Roberto Días", "381-1234567");
        Reserva r = new Reserva("2024-10-31", "21:00", m);
        r.setCliente(c);
        
        System.out.println("Fecha y Hora: " + r.getFecha() + " a las " + r.getHora());
        r.mostrarMesa();
        r.mostrarCliente();
    }
    
}
