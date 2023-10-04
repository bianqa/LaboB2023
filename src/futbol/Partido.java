package futbol;

import java.util.HashMap;

public class Partido {
    private Equipo equipo1;
    private Equipo equipo2;
    private HashMap<Jugador, Integer> goles;

    public Partido (){
        equipo1 = new Equipo();
        equipo2 = new Equipo();
        goles = new HashMap<>();
    }

    public Partido (Equipo equipo1, Equipo equipo2, HashMap<Jugador, Integer> goles){
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.goles = goles;
    }

    public Equipo getEquipo1() {
        return equipo1;
    }

    public void setEquipo1(Equipo equipo1) {
        this.equipo1 = equipo1;
    }

    public Equipo getEquipo2() {
        return equipo2;
    }

    public void setEquipo2(Equipo equipo2) {
        this.equipo2 = equipo2;
    }

    public HashMap<Jugador, Integer> getGoles() {
        return goles;
    }

    public void setGoles(HashMap<Jugador, Integer> goles) {
        this.goles = goles;
    }
}
