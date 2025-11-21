
package Parte2;


public class CuentaBancaria {
    
private double saldo;

    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void retirar(double monto) throws SaldoInsuficienteException {
        if (monto > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente. Intentaste retirar $" + monto);
        }
        saldo -= monto;
        System.out.println("Retiro exitoso. Saldo restante: $" + saldo);
    }   
}
