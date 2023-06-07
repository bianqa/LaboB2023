import java.util.HashSet;

public class Lugares {
    private HashSet<Lugar> lugares;

    public Lugares (){
        lugares = new HashSet<Lugar>();
    }

    public Lugares (HashSet<Lugar> lugares){
        this.lugares = lugares;
    }

    public HashSet<Lugar> getLugares() {
        return lugares;
    }

    public void setLugares(HashSet<Lugar> lugares) {
        this.lugares = lugares;
    }

    public void agregar_lugar (Lugar lugar){
        lugares.add(lugar);
    }

    public void eliminar_lugar (Lugar lugar){
        lugares.remove(lugar);
    }

    public void modificar_lugar (Lugar lugar_viejo, Lugar lugar_nuevo){
        if (lugares.contains(lugar_viejo)){
            lugares.remove(lugar_viejo);
            lugares.add(lugar_nuevo);
        }
    }

    public int cant_poblacion (int codigo){
        int total = 0;
        for (Lugar lugar : lugares){
            if (lugar.getCodigo() == codigo){
                lugar.
            }
        }
    }
}
