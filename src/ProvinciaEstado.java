import java.util.ArrayList;
import java.util.HashSet;

public class ProvinciaEstado extends Lugar{
    private HashSet<Ciudad> ciudades;

    public ProvinciaEstado (){
        super();
        ciudades = new HashSet<Ciudad>();
    }

    public ProvinciaEstado (String nombre, int codigo, HashSet<Coordenada> coordenadas, HashSet<Ciudad> ciudades){
        super (nombre, codigo, coordenadas);
        this.ciudades = ciudades;
    }

    public HashSet<Ciudad> getCiudades() {
        return ciudades;
    }

    public void setCiudades(HashSet<Ciudad> ciudades) {
        this.ciudades = ciudades;
    }
}
