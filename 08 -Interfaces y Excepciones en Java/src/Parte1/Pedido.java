
package Parte1;

import java.util.List;

public class Pedido implements Pagable{
     private List<Producto> productos;
     private Notificable cliente;
     private String estado;

    public Pedido(List<Producto> productos, Notificable cliente, String estado) {
        this.productos = productos;
        this.cliente = cliente;
        this.estado = estado;
    } 
    
    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        cliente.notificar("El estado de tu pedido cambió a: " + nuevoEstado);
    }
  
    @Override
    public double calcularTotal() {
        double total= 0;
        for (Producto p : productos) {
            total =+ p.calcularTotal();
        }
        return total;
    }
    
}
