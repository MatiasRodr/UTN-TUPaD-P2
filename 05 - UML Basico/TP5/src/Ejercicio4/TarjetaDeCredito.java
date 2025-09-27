package Ejercicio4;


public class TarjetaDeCredito {
   private String numero;
   private String fechaVencimiento;
   private Banco banco;
   private Cliente cliente;

    public TarjetaDeCredito(String numero, String fechaVencimiento, Banco banco) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.banco = banco;
    }
   
    public void mostrarBanco() {
        System.out.println("Banco: "+ banco.getNombre()+" , cuit "+ banco.getCuit());
 }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente; 
        if (cliente != null && cliente.getTarjetaDeCredito()!= this) {
            cliente.setTarjetaDeCredito(this); 
         }
    }

    public String getNumero() {
        return numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    
    
    
}
