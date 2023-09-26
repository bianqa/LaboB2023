package bufe;

public class Plato {
    private String nombre;
    private double precio;

    public Plato(){
        nombre = "Hamburguesa";
        precio = 700;
    }

    public Plato (String nombre, double precio){
        this.nombre = nombre;
        if (precio < 1){
            this.precio = 1;
        } else{
            this.precio = precio;
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
}
