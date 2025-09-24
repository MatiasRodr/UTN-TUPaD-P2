
public class main {


    public static void main(String[] args) {
        // Instancia con todos los parametros
        Empleado e1 = new Empleado(1, "Matias", "cebador de mates", 200);
        Empleado e2 = new Empleado(2, "Carlos", "administrativo", 250);

        // Instancias con parametros nombre y puesto
        Empleado e3 = new Empleado("Luis", "vendedor");
        Empleado e4 = new Empleado("Jose", "jefe");
        
        e1.actualizarSalario(10);   // 10% de aumento
        e2.actualizarSalario(100); // aumento de 100
        
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        System.out.println(e4);        
       
         System.out.println("Total empleados creados: " + Empleado.mostrarTotalEmpleados());
        
    }
    
}
