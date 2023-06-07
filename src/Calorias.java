import java.util.HashSet;

public class Calorias {
    private HashSet<Familia> familias;

    public Calorias (){
        familias = new HashSet<Familia>();
    }

    public Calorias (HashSet<Familia> familias){
        this.familias = familias;
    }

    public HashSet<Familia> getFamilias() {
        return familias;
    }

    public void setFamilias(HashSet<Familia> familias) {
        this.familias = familias;
    }

    public double total_persona (Familiar persona){
        double total = 0;
        for (Familia familia : familias){
            for (Familiar familiar : familia.getPersonas()){
                if (familiar.equals(persona)){
                    total = familiar.total_calorias();
                }
            }
        }
        return total;
    }

    public double promedio_familia (Familia familia){
        double promedio = 0;
        for (Familia familia1 : familias){
            if (familia1.equals(familia)){
                promedio = familia1.promedio_familia();
            }
        }
        return promedio;
    }

    public Familiar mayor_familia (Familia familia){
        Familiar mayor = new Familiar();
        for (Familia familia1 : familias){
            if (familia1.equals(familia)){
                mayor = familia1.mayor_consumidor();
            }
        }
        return mayor;
    }

    public Familiar menor_familia (Familia familia){
        Familiar menor = new Familiar();
        for (Familia familia1 : familias){
            if (familia1.equals(familia)){
                menor = familia1.menor_consumidor();
            }
        }
        return menor;
    }
}
