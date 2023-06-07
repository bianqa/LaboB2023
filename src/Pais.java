import java.util.ArrayList;
import java.util.HashSet;

public class Pais extends Lugar{
    private HashSet<ProvinciaEstado> provincias;

    public Pais (){
        super();
        provincias = new HashSet<ProvinciaEstado>();
    }

    public Pais (String nombre, int codigo, ArrayList<String> latitud, ArrayList<String> longitud, HashSet<ProvinciaEstado> provincias){
        super(nombre, codigo, latitud, longitud);
        this.provincias = provincias;
    }

    public HashSet<ProvinciaEstado> getProvincias() {
        return provincias;
    }

    public void setProvincias(HashSet<ProvinciaEstado> provincias) {
        this.provincias = provincias;
    }

    public void agregar_provincia (ProvinciaEstado provincia){
        provincias.add(provincia);
    }

    public void eliminar_provincia (ProvinciaEstado provincia){
        provincias.remove(provincia);
    }

    public void modificar_provincia (ProvinciaEstado provincia_vieja, ProvinciaEstado provincia_nueva){
        if (provincias.contains(provincia_vieja)){
            provincias.remove(provincia_vieja);
            provincias.add(provincia_nueva);
        }
    }

    public int cant_poblacion (){
        int total = 0;
        for (ProvinciaEstado provincia : provincias){
            total += provincia.cant_poblacion();
        }
        return total;
    }

    public int cant_poblacion1 (int codigo){
        int total = 0;
        for (ProvinciaEstado provincia : provincias){
            if (provincia.getCodigo() == codigo){
                total += provincia.cant_poblacion();
            }
        }
        if (total == 0){
            for (ProvinciaEstado provincia : provincias){
                total = provincia.cant_poblacion1(codigo);
            }
        }
        return total;
    }
}
