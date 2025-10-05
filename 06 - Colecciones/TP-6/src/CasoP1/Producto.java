package CasoP1;


public class Producto {
    private String id;
    private String nombre;
    private Double precio;
    private int cantidad;
    private CategoriaProducto categoria;

    public Producto(String id, String nombre, Double precio, int cantidad, CategoriaProducto categoria) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoria = categoria;
    }
    
    public String getId() {
        return id;
    }

    public int getCantidad() {
        return cantidad;
    }
    
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Double getPrecio() {
        return precio;
    }
    
    public void mostrarInfo(){
        System.out.println("- ID: "+ id +
                "\n- Nombre: "+nombre+
                "\n- Precio: "+precio+
                "\n- Cantidad: "+cantidad+
                "\n- Categoria: "+categoria);
    }
}
