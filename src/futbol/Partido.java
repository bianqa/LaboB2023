package futbol;

import java.util.HashMap;
import java.util.HashSet;

public class Partido {
    private Equipo equipo1;
    private Equipo equipo2;
    private HashSet<Gol> goles;

    public Partido (){
        equipo1 = new Equipo();
        equipo2 = new Equipo();
        goles = new HashSet<>();
    }

    public Partido (Equipo equipo1, Equipo equipo2, HashSet<Gol> goles){
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

    public HashSet<Gol> getGoles() {
        return goles;
    }

    public void setGoles(HashSet<Gol> goles) {
        this.goles = goles;
    }
}
