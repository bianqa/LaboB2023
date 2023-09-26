package repaso.tiendaElectronica;

abstract class Producto {
    private String nombre;
    private double precio;
    private int stock;

    public Producto (){
        nombre = "a";
        precio = 10.5;
        stock = 5;
    }

    public Producto (String nombre, double precio, int stock){
        this.nombre = nombre;
        if (precio < 1){
            this.precio = 1;
        } else{
            this.precio = precio;
        }
        if (stock < 0){
            this.stock = 0;
        } else{
            this.stock = stock;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
