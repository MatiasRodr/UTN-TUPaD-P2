
package Ejercicio10;


public class Titular {
    private String nombre;
    private String dni;
    private CuentaBancaria cuentaBancaria;

    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }


    public void setCuentaBancaria(CuentaBancaria cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
        if (cuentaBancaria != null && cuentaBancaria.getTitular() != this) {
        cuentaBancaria.setTitular(this);
        }
    }

    public CuentaBancaria getCuentaBancaria() {
        return cuentaBancaria;
    }

    public String mostrarCuentaBancaria() {
        return "Nombre: "+nombre+" - DNI: "+dni+" - CBU: "+cuentaBancaria.getCBU()+" - Saldo: "+cuentaBancaria.getSaldo();
    }
    
    public String getNombre() {
        return nombre;
    }
    public String getDni() {
        return dni;
    }
}
