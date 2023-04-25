public class Periferico extends Componente{
    private String puertos_valido;

    public Periferico (){
        super();
        puertos_valido = "a";
    }

    public Periferico (String nombre, String fabricante, String modelo, double precio, int stock, String puertos_valido){
        super(nombre, fabricante, modelo, precio, stock);
        this.puertos_valido = puertos_valido;
    }

    public String getPuertos_valido() {
        return puertos_valido;
    }

    public void setPuertos_valido(String puertos_valido) {
        this.puertos_valido = puertos_valido;
    }
}
