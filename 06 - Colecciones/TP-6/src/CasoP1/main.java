
package CasoP1;

import java.util.ArrayList;



public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     // Crear inventario
    Inventario inventario = new Inventario();
    System.out.println("Inventario creado.");
    // 1. Crear productos
    Producto p1 = new Producto("P001", "Arroz", 800.0, 50, CategoriaProducto.ALIMENTOS);
    Producto p2 = new Producto("P002", "Laptop", 150000.00, 10, CategoriaProducto.ELECTRONICA);
    Producto p3 = new Producto("P003", "Camiseta", 2000.00, 100, CategoriaProducto.ROPA);
    Producto p4 = new Producto("P004", "Silla", 3000.00, 25, CategoriaProducto.HOGAR);
    Producto p5 = new Producto("P005", "Auriculares", 2500.00, 60, CategoriaProducto.ELECTRONICA);
    
    // Agregar productos al inventario
    inventario.agregarProducto(p1);
    inventario.agregarProducto(p2);
    inventario.agregarProducto(p3);
    inventario.agregarProducto(p4);
    inventario.agregarProducto(p5);

    // Listar productos
    System.out.println("\n-----------------------");
    System.out.println(" LISTA DE PRODUCTOS:");
    inventario.listarProductos();

    // Buscar producto por ID
    System.out.println("\n-----------------------");
    Producto buscado = inventario.buscarProductoPorId("P003");
    if (buscado != null) {
        System.out.println("Producto encontrado");
        buscado.mostrarInfo();}
    else {
        System.out.println("Producto no encontrado.");
    }

    // Eliminar producto por ID
    inventario.eliminarProductoPorID("P003");
    
    // Listar productos
    System.out.println("\n-----------------------");
    System.out.println("LISTA DE PRODUCTOS:");
    inventario.listarProductos();
    
    // Actualizar Stock P001
    inventario.actualizarStock("P001", 40);
    
    // Total stock disponible
    System.out.println("Total en stock: " + inventario.obtenerTotalStock());    
    
    // Producto con Mayor Stock
    System.out.println("\n-----------------------");
    System.out.println("PRODUCTO CON MAYOR STOCK:");
    ArrayList<Producto> productosMax = inventario.obtenerProductoConMayorStock();
    for (Producto producto : productosMax) {
        producto.mostrarInfo();
        System.out.println("-----------------------");
    }
    
    
    // filtrar precio
    System.out.println("\n-----------------------");
    System.out.println("PRODUCTO ENTRE 1000$ Y 10000$)");
    ArrayList<Producto> filtrarPrecio = inventario.filtrarProductosPorPrecio(1000,10000);
        for (Producto producto : filtrarPrecio) {
            producto.mostrarInfo();
            System.out.println("-----------------------");
        }
    
    // Mostrar Categoria
    System.out.println("\n-----------------------");
    System.out.println("CATEGORÍAS DISPONIBLES:");
    inventario.mostrarCategoriasDisponibles();    
    }
}
