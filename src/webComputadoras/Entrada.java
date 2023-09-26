package webComputadoras;

public class Entrada extends Periferico {
    private String tipo_conector;

    public Entrada (){
        super();
        tipo_conector = "USB";
    }

    public Entrada (String nombre, String fabricante, String modelo, double precio, int stock, String puertos_valido, String tipo_conector){
        super(nombre, fabricante, modelo, precio, stock, puertos_valido);
        this.tipo_conector = tipo_conector;
    }

    public String getTipo_conector() {
        return tipo_conector;
    }

    public void setTipo_conector(String tipo_conector) {
        this.tipo_conector = tipo_conector;
    }
}
