abstract class Componente {
    private String nombre;
    private String fabricante;
    private String modelo;
    private double precio;
    private int stock;

    public Componente (){
        nombre = "A";
        fabricante = "msi";
        modelo = "A";
        precio = 20000;
        stock = 10;
    }

    public Componente (String nombre, String fabricante, String modelo, double precio, int stock){
        this.nombre = nombre;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.precio = precio;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
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
