import java.util.ArrayList;
import java.util.HashSet;

public class Continente extends Lugar{
    private HashSet<Pais> paises;

    public Continente (){
        super();
        paises = new HashSet<Pais>();
    }

    public Continente (String nombre, int codigo, ArrayList<String> latitud, ArrayList<String> longitud, HashSet<Pais> paises){
        super(nombre, codigo, latitud, longitud);
        this.paises = paises;
    }

    public HashSet<Pais> getPaises() {
        return paises;
    }

    public void setPaises(HashSet<Pais> paises) {
        this.paises = paises;
    }

    public void agregar_pais (Pais pais){
        paises.add(pais);
    }

    public void eliminar_pais (Pais pais){
        paises.remove(pais);
    }

    public void modificar_pais (Pais pais_viejo, Pais pais_nuevo){
        if (paises.contains(pais_viejo)){
            paises.remove(pais_viejo);
            paises.add(pais_nuevo);
        }
    }

    public int cant_poblacion (){
        int total = 0;
        for (Pais pais : paises){
            total += pais.cant_poblacion();
        }
        return total;
    }

    public int cant_poblacion1 (int codigo){
        int total = 0;
        for (Pais pais : paises){
            if (pais.getCodigo() == codigo){
                total += pais.cant_poblacion();
            }
        }
        if (total == 0){
            for (Pais pais : paises){
                total = cant_poblacion1(codigo);
            }
        }
        return total;
    }
}
