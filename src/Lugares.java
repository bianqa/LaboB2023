import java.util.HashSet;

public class Lugares {
    private HashSet<Continente> continentes;

    public Lugares (){
        continentes = new HashSet<Continente>();
    }

    public Lugares (HashSet<Continente> continentes){
        this.continentes = continentes;
    }

    public HashSet<Continente> getContinentes() {
        return continentes;
    }

    public void setContinentes(HashSet<Continente> continentes) {
        this.continentes = continentes;
    }

    public void agregar_continente (Continente continente){
        continentes.add(continente);
    }

    public void eliminar_continente (Continente continente){
        continentes.remove(continente);
    }

    public void modificar_continente (Continente continente_viejo, Continente continente_nuevo){
        if (continentes.contains(continente_viejo)){
            continentes.remove(continente_viejo);
            continentes.add(continente_nuevo);
        }
    }

    public int cant_poblacion (int codigo){
        int total = 0;
        for (Continente continente : continentes){
            if (continente.getCodigo() == codigo){
                total += continente.cant_poblacion();
            }
        }
        if (total == 0){
            for (Continente continente : continentes){
                total = continente.cant_poblacion1(codigo);
            }
        }
        return total;
    }
}
