package repaso.tiendaElectronica;

import java.util.ArrayList;

public class Tienda {
    private ArrayList<Producto> productos;

    public Tienda (){
        productos = new ArrayList<Producto>();
    }

    public Tienda (ArrayList<Producto> productos){
        this.productos = productos;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public void agregar_producto (Producto producto){
        productos.add(producto);
    }

    public void eliminar_producto (Producto producto){
        productos.remove(producto);
    }

    public void modificar_producto (Producto producto_viejo, Producto producto_nuevo){
        for (int i = 0; i < productos.size(); i ++){
            if (productos.get(i).equals(producto_viejo)){
                productos.set(i, producto_nuevo);
            }
        }
    }

    public void producto_mayor (){
        int mayor = 0;
        Producto mayor1 = productos.get(0);
        for (Producto producto : productos){
            if (producto.getStock() > mayor){
                mayor1 = producto;
            }
        }
        System.out.println("Producto con mayor stock: ");
        System.out.println("Nombre : " + mayor1.getNombre());
        System.out.println("Precio: " + mayor1.getPrecio());
        System.out.println("Stock: " + mayor1.getStock());
    }

    public void producto_menor (){
        int menor = 0;
        Producto menor1 = productos.get(0);
        for (Producto producto : productos){
            if (producto.getStock() < menor){
                menor1 = producto;
            }
        }
        System.out.println("Producto con menor stock: ");
        System.out.println("Nombre : " + menor1.getNombre());
        System.out.println("Precio: " + menor1.getPrecio());
        System.out.println("Stock: " + menor1.getStock());
    }
}
