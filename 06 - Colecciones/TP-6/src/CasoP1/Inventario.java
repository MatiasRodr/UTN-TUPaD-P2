package CasoP1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;



public class Inventario {
    private ArrayList<Producto> producto;

    public Inventario() {
        this.producto = new ArrayList<>();

    }

    public void agregarProducto(Producto p){
       this.producto.add(p);
    }
    
    // Buscar Producto por ID
    public Producto buscarProductoPorId(String id){
        Producto encontrado = null;
        Iterator<Producto> it = this.producto.iterator();
        while (it.hasNext() && encontrado == null) {
            Producto producto = it.next();
            if (producto.getId().equals(id)) {
                encontrado = producto;
            }
        }
        return encontrado;
    }
    
    public void eliminarProductoPorID(String id) {
        if (buscarProductoPorId(id) != null) {
            producto.remove(buscarProductoPorId(id));
            System.out.println("");
            System.out.println("El producto con ID " + id + " ha sido eliminado.");
        }else{
            System.out.println("No se encontro el producto con ID: "+ id);
        }
    }

    public void actualizarStock(String id, int nuevaCantidad) {
        Producto p = buscarProductoPorId(id);
        if (p != null) {
            p.setCantidad(nuevaCantidad);
            System.out.println("Stock actualizado para el producto con ID: " + id);
        } else {
            System.out.println("No se encontro el producto con ID: " + id);
        }
    }
    
    public void listarProductos() {
        if (producto.isEmpty()) {
            System.out.println("El inventario no tiene productos.");
        } else {
            for (Producto producto : producto) {
                producto.mostrarInfo();
                System.out.println("---------------------");
            }
        }
    }
    public int obtenerTotalStock(){
        int acumulador = 0;
        for (Producto producto : producto) {
            acumulador += producto.getCantidad();
        }     
        return acumulador;
    }
    
    public ArrayList<Producto> obtenerProductoConMayorStock(){
        ArrayList<Producto> listaStockMax = new ArrayList<>();
        int stockMax = -1;
        for (Producto producto : producto) {
            if(producto.getCantidad() == stockMax){
                listaStockMax.add(producto);
            }else if(producto.getCantidad() > stockMax){
                stockMax = producto.getCantidad();
                listaStockMax.clear();
                listaStockMax.add(producto);
            }
        }
        return listaStockMax;
    }
    
    public ArrayList<Producto> filtrarProductosPorPrecio(double min, double max){
        ArrayList<Producto> filtrarprecio = new ArrayList<>();
        for (Producto producto : producto) {
            double precio = producto.getPrecio();   
            if(precio >= min && precio <= max ){
                filtrarprecio.add(producto);
            }
        }
        return filtrarprecio;
    }
    
    
    public void mostrarCategoriasDisponibles() {
        for (CategoriaProducto c : CategoriaProducto.values()) {
            System.out.println(c + ": " + c.getDescripcion());
        }
    }
}
