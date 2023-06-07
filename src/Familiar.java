import java.util.HashMap;

public class Familiar extends Persona{
    private HashMap<String, Double> platos;

    public Familiar (){
        super();
        platos = new HashMap<String, Double>();
    }

    public Familiar (String nombre, String apellido, Fecha nacimiento, int edad, String direccion, HashMap<String, Double> platos){
        super(nombre, apellido, nacimiento, edad, direccion);
        this.platos = platos;
    }

    public HashMap<String, Double> getPlatos() {
        return platos;
    }

    public void setPlatos(HashMap<String, Double> platos) {
        this.platos = platos;
    }

    public double total_calorias (){
        double total = 0;
        for (String nombre : platos.keySet()){
            total += platos.get(nombre);
        }
        return total;
    }
}
