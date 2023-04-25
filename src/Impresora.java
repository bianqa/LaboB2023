public class Impresora extends Salida{
    private String metodo;

    public Impresora (){
        super();
    }

    public Impresora (String nombre, String fabricante, String modelo, double precio, int stock, String puertos_valido, String metodo){
        super(nombre, fabricante, modelo, precio, stock, puertos_valido);
        this.metodo = metodo;
    }

    public String getMetodo() {
        return metodo;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }
}
