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
        for (Lugar l : lugares){
            if (l.getCodigo() == codigo){
                return l.cant_poblacion();
            }
        }
        return 0;
    }

    public Pais paisMasPoblacion(){
        int mayor = -1;
        Pais paisMayor = new Pais();
        for (Lugar l : lugares){
            if (l instanceof Pais){
                if (l.cant_poblacion() > mayor){
                    mayor = l.cant_poblacion();
                    paisMayor = (Pais) l;
                }
            }
        }
        return paisMayor;
    }

    public Pais paisMenosPoblacion(){
        int menor = 0;
        boolean primero = true;
        Pais paisMenor = new Pais();
        for (Lugar l : lugares){
            if (l instanceof Pais){
                if (primero || l.cant_poblacion() < menor){
                    primero = false;
                    menor = l.cant_poblacion();
                    paisMenor = (Pais) l;
                }
            }
        }
        return paisMenor;
    }

    public Continente contMasPoblacion(){
        int mayor = -1;
        Continente contMayor = new Continente();
        for (Lugar l : lugares){
            if (l instanceof Continente){
                if (l.cant_poblacion() > mayor){
                    mayor = l.cant_poblacion();
                    contMayor = (Continente) l;
                }
            }
        }
        return contMayor;
    }

    public Continente contMenosPoblacion(){
        int menor = 0;
        boolean primero = true;
        Continente contMenor = new Continente();
        for (Lugar l : lugares){
            if (l instanceof  Continente){
                if (primero || l.cant_poblacion() < menor){
                    primero = false;
                    menor = l.cant_poblacion();
                    contMenor = (Continente) l;
                }
            }
        }
        return contMenor;
    }
}
