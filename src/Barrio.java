import java.util.ArrayList;
import java.util.HashSet;

public class Barrio extends Lugar{
    private int poblacion;

    public Barrio (){
        super();
        poblacion = 0;
    }

    public Barrio (String nombre, int codigo, HashSet<Coordenada> coordenadas){
        super(nombre, codigo, coordenadas);
        this.poblacion = poblacion;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }
}
