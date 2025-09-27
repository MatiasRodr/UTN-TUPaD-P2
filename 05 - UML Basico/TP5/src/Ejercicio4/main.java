/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio4;

/**
 *
 * @author Marco
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Banco banco = new Banco("Naranja ","202530312");
        Cliente cliente = new Cliente("Jorge Borges","4041423");
        TarjetaDeCredito tj = new TarjetaDeCredito("4020102034","27/30",banco);
        tj.setCliente(cliente);
        
        System.out.println("Tarjeta numero : "+ tj.getNumero()+", fecha vencimiento: "+tj.getFechaVencimiento());
        tj.mostrarBanco();
        System.out.println("Cliente : "+ tj.getCliente().getNombre()+", fecha vencimiento: "+tj.getCliente().getDni());
    }
    
}
