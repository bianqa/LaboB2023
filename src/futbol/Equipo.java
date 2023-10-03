package futbol;

import java.util.HashSet;

public class Equipo implements {
    private String nombre;
    private HashSet<Jugador> jugadores;

    public Equipo (){
        nombre = "qfef";
        jugadores = new HashSet<>();
    }

    public Equipo (String nombre, HashSet<Jugador> jugadores){
        this.nombre = nombre;
        this.jugadores = jugadores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public HashSet<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(HashSet<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public void contratar (Jugador jugador, Equipo e){
        jugador.contratar(e);
    }
}
