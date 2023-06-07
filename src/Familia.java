import java.util.HashSet;

public class Familia {
    private HashSet<Familiar> personas;

    public Familia (){
        personas = new HashSet<Familiar>();
    }

    public Familia (HashSet<Familiar> personas){
        this.personas = personas;
    }

    public HashSet<Familiar> getPersonas() {
        return personas;
    }

    public void setPersonas(HashSet<Familiar> personas) {
        this.personas = personas;
    }

    public double promedio_familia (){
        double promedio = 0;
        for (Familiar persona : personas){
            promedio += persona.total_calorias();
        }
        return promedio / personas.size();
    }

    public Familiar mayor_consumidor (){
        Familiar mayor = new Familiar();
        double mayor_calorias = 0;
        for (Familiar persona : personas){
            if (persona.total_calorias() > mayor_calorias){
                mayor_calorias = persona.total_calorias();
                mayor = persona;
            }
        }
        return mayor;
    }

    public Familiar menor_consumidor (){
        Familiar menor = new Familiar();
        double menor_calorias = 0;
        for (Familiar persona : personas){
            if (menor_calorias == 0){
                menor_calorias = persona.total_calorias();
                menor = persona;
            }
            if (persona.total_calorias() < menor_calorias){
                menor_calorias = persona.total_calorias();
                menor = persona;
            }
        }
        return menor;
    }
}
