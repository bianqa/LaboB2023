import java.util.ArrayList;
import java.util.HashSet;

public class Ciudad extends Lugar{
    private HashSet<Barrio> barrios;

    public Ciudad (){
        super();
        barrios = new HashSet<Barrio>();
    }

    public Ciudad (String nombre, int codigo, ArrayList<String> latitud, ArrayList<String> longitud, HashSet<Barrio> barrios){
        super(nombre, codigo, latitud, longitud);
        this.barrios = barrios;
    }

    public HashSet<Barrio> getBarrios() {
        return barrios;
    }

    public void setBarrios(HashSet<Barrio> barrios) {
        this.barrios = barrios;
    }

    public void agregar_barrio (Barrio barrio){
        barrios.add(barrio);
    }

    public void eliminar_barrio (Barrio barrio){
        barrios.remove(barrio);
    }

    public void modificar_barrio (Barrio barrio_viejo, Barrio barrio_nuevo){
        if (barrios.contains(barrio_viejo)){
            barrios.remove(barrio_viejo);
            barrios.add(barrio_nuevo);
        }
    }

    public int cant_poblacion (){
        int total = 0;
        for (Barrio barrio : barrios){
                total += barrio.getPoblacion();
        }
        return total;
    }

    public int cant_poblacion1 (int codigo){
        int total = 0;
        for (Barrio barrio : barrios){
            if (barrio.getCodigo() == codigo){
                total += barrio.getPoblacion();
            }
        }
        return total;
    }
}
