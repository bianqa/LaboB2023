import java.util.ArrayList;

public class Lugar {
    private String nombre;
    private int codigo;
    private ArrayList<String> latitud;
    private ArrayList<String> longitud;

    public Lugar (){
        nombre = "";
        codigo = 1;
        latitud = new ArrayList<String>();
        longitud = new ArrayList<String>();
    }

    public Lugar (String nombre, int codigo, ArrayList<String> latitud, ArrayList<String> longitud){
        this.nombre = nombre;
        this.codigo = codigo;
        this.latitud = latitud;
        this.longitud = longitud;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public ArrayList<String> getLatitud() {
        return latitud;
    }

    public void setLatitud(ArrayList<String> latitud) {
        this.latitud = latitud;
    }

    public ArrayList<String> getLongitud() {
        return longitud;
    }

    public void setLongitud(ArrayList<String> longitud) {
        this.longitud = longitud;
    }

    public void agregar_lugar(){

    }
}
