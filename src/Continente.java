import java.util.ArrayList;
import java.util.HashSet;

public class Continente extends Lugar{
    private HashSet<Pais> paises;

    public Continente (){
        super();
        paises = new HashSet<Pais>();
    }

    public Continente (String nombre, int codigo, HashSet<Coordenada> coordenadas, HashSet<Pais> paises){
        super(nombre, codigo, coordenadas);
        this.paises = paises;
    }

    public HashSet<Pais> getPaises() {
        return paises;
    }

    public void setPaises(HashSet<Pais> paises) {
        this.paises = paises;
    }

    public int cant_poblacion(){
        int cant = 0;
        for (Pais p : paises){
            cant += p.cant_poblacion();
        }
        return cant;
    }
}
