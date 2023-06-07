import java.util.ArrayList;

public class Barrio extends Lugar{
    private int poblacion;

    public Barrio (){
        super();
        poblacion = 0;
    }

    public Barrio (String nombre, int codigo, ArrayList<String> latitud, ArrayList<String> longitud, int poblacion){
        super(nombre, codigo, latitud, longitud);
        this.poblacion = poblacion;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }
}
