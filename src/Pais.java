import java.util.ArrayList;
import java.util.HashSet;

public class Pais extends Lugar{
    private HashSet<ProvinciaEstado> provincias;

    public Pais (){
        super();
        provincias = new HashSet<ProvinciaEstado>();
    }

    public Pais (String nombre, int codigo, HashSet<Coordenada> coordenadas, HashSet<ProvinciaEstado> provincias){
        super(nombre, codigo, coordenadas);
        this.provincias = provincias;
    }

    public HashSet<ProvinciaEstado> getProvincias() {
        return provincias;
    }

    public void setProvincias(HashSet<ProvinciaEstado> provincias) {
        this.provincias = provincias;
    }
}
