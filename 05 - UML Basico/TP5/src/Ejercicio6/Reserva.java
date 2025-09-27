package Ejercicio6;


public class Reserva {
    private String fecha;
    private String hora;
    private Cliente cliente;
    private Mesa mesa;       

    public Reserva(String fecha, String hora, Mesa mesa) {
        this.fecha = fecha;
        this.hora = hora;   
        this.mesa = mesa;
    }
    
   public void mostrarCliente() {
        if (cliente != null) {
        System.out.println("Reserva a nombre de : "+ cliente.getNombre()+", numero de tel. "+cliente.getTelefono());
        } else {
        System.out.println("La reserva no tiene cliente.");        }
    }
   
   public void mostrarMesa(){
        System.out.println("Mesa: "+ mesa.getNumero()+" de "+mesa.getCapacidad()+" personaas");
   }

    
    public void setCliente(Cliente cliente) {              
        this.cliente = cliente;
 }
    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }
    
    public Cliente getCliente() {
        return cliente;
    }
    
    public Mesa getMesa() {
        return mesa;
    }   
}
