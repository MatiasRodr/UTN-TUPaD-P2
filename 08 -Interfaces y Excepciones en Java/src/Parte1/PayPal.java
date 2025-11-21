
package Parte1;


public class PayPal implements Pago{
    private String titular;
    private String numeroCuenta;

    public PayPal(String titular, String numeroCuenta) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
    }


    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago con Paypal de " + titular + " por $" + monto);
    }   
}
