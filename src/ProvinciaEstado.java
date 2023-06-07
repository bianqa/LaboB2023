import java.util.ArrayList;
import java.util.HashSet;

public class ProvinciaEstado extends Lugar{
    private HashSet<Ciudad> ciudades;

    public ProvinciaEstado (){
        super();
        ciudades = new HashSet<Ciudad>();
    }

    public ProvinciaEstado (String nombre, int codigo, ArrayList<String> latitud, ArrayList<String> longitud, HashSet<Ciudad> ciudades){
        super (nombre, codigo, latitud, longitud);
        this.ciudades = ciudades;
    }

    public HashSet<Ciudad> getCiudades() {
        return ciudades;
    }

    public void setCiudades(HashSet<Ciudad> ciudades) {
        this.ciudades = ciudades;
    }

    public void agregar_ciudad (Ciudad ciudad){
        ciudades.add(ciudad);
    }

    public void eliminar_ciudad (Ciudad ciudad){
        ciudades.remove(ciudad);
    }

    public void modificar_ciudad (Ciudad ciudad_vieja, Ciudad ciudad_nueva){
        if (ciudades.contains(ciudad_vieja)){
            ciudades.remove(ciudad_vieja);
            ciudades.add(ciudad_nueva);
        }
    }

    public int cant_poblacion (){
        int total = 0;
        for (Ciudad ciudad : ciudades){
            total += ciudad.cant_poblacion();
        }
        return total;
    }

    public int cant_poblacion1 (int codigo){
        int total = 0;
        for (Ciudad ciudad :ciudades){
            if (ciudad.getCodigo() == codigo){
                total += ciudad.cant_poblacion();
            }
        }
        if (total == 0){
            for (Ciudad ciudad : ciudades){
                total = ciudad.cant_poblacion1(codigo);
            }
        }
        return total;
    }
}
