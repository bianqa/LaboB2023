import Intercambio.Fecha;

import java.util.ArrayList;

public class EspectadorCine extends Persona{
    private int id;
    private ArrayList<Pelicula> historial;

    public EspectadorCine (){
        super();
        id = 1;
        historial = new ArrayList<Pelicula>();
    }

    public EspectadorCine (String nombre, String apellido, Fecha nacimiento, int edad, String direccion, int id, ArrayList<Pelicula> historial){
        super(nombre, apellido, nacimiento, edad, direccion);
        this.id = id;
        this.historial = historial;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Pelicula> getHistorial() {
        return historial;
    }

    public void setHistorial(ArrayList<Pelicula> historial) {
        this.historial = historial;
    }
}
