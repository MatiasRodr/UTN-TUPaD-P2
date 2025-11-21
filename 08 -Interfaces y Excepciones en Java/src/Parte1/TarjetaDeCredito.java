/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parte1;

/**
 *
 * @author Marco
 */
public class TarjetaDeCredito implements PagoConDescuento{
    private String titular;
    private String numeroTarjeta;

    public TarjetaDeCredito(String titular, String numeroTarjeta) {
        this.titular = titular;
        this.numeroTarjeta = numeroTarjeta;
    }

    @Override
    public double aplicarDescuento(double monto) {
        return monto * 0.9;                         // Descuento del 10%
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago con tarjeta de " + titular + " por $" + monto);
    }
}
