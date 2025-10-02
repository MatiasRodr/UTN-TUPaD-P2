
package Ejercicio10;

public class CuentaBancaria {
    private String CBU;
    private Double saldo;
    private Titular titular;
    private ClaveSeguridad claveSeguridad;
    
    public CuentaBancaria(String CBU, Double saldo, String codigo, String ultimaModificacion) {
        this.CBU = CBU;
        this.saldo = saldo;
        this.claveSeguridad = new ClaveSeguridad(codigo, ultimaModificacion);
    }

    public String mostrarClaveSeguridad() {
        return "Codigo: "+claveSeguridad.getCodigo()+" - Ultima Modificacion: "+claveSeguridad.getUltimaModificacion();
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
        if (titular != null && titular.getCuentaBancaria() != this) {
        titular.setCuentaBancaria(this);
        }
    }

    public Titular getTitular() {
        return titular;
    }

    public String mostrarTitular() {
        return "Nombre: "+titular.getNombre()+" - DNI: "+titular.getDni();
    }

    public String getCBU() {
        return CBU;
    }

    public Double getSaldo() {
        return saldo;
    }
}
