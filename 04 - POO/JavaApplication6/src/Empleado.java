public class Empleado {
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados=0; // Variable Static
    
    // Contructores 
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
    }
    public Empleado(String nombre, String puesto) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 200;
        this.id = ++totalEmpleados; 
    }
   
    /// Metodos sobrecargados: Actualizar Salarios
    public void actualizarSalario(double porcentaje){
        this.salario += this.salario * (porcentaje/100);     
    }   
    public void actualizarSalario(int monto){
        this.salario += monto;
    }
    
    // Metodo toString
    @Override
    public String toString(){
        return "Empleado: \n    Id="+ id+
                "\n     nombre: "+ nombre +
                "\n     puesto: "+ puesto +
                "\n     salario: "+ salario ;
    }
    
    // Metodo estatico
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }
    
    // Getter and Setters

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
}
