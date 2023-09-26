package lugares;

import lugares.Coordenada;
import lugares.Lugar;

import java.util.HashSet;

public class Ciudad extends Lugar {
    private HashSet<Barrio> barrios;

    public Ciudad (){
        super();
        barrios = new HashSet<Barrio>();
    }

    public Ciudad (String nombre, int codigo, HashSet<Coordenada> coordenadas, HashSet<Barrio> barrios){
        super(nombre, codigo, coordenadas);
        this.barrios = barrios;
    }

    public HashSet<Barrio> getBarrios() {
        return barrios;
    }

    public void setBarrios(HashSet<Barrio> barrios) {
        this.barrios = barrios;
    }

    public int cant_poblacion(){
        int cant = 0;
        for (Barrio b : barrios){
            cant += b.cant_poblacion();
        }
        return cant;
    }
}
