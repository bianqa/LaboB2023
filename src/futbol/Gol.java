package futbol;

import java.util.HashSet;

public class Gol {
    private Jugador jugador;
    private Equipo equipo = equipoJugador();
    private boolean contra;
    private HashSet<Jugador> asistencias;

    public Gol (){
        jugador = new Jugador();
        contra = false;
        asistencias = new HashSet<>();
    }

    public Gol (Jugador jugador, boolean contra, HashSet<Jugador> asistencias){
        this.jugador = jugador;
        this.contra = contra;
        this.asistencias = asistencias;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public boolean isContra() {
        return contra;
    }

    public void setContra(boolean contra) {
        this.contra = contra;
    }

    public HashSet<Jugador> getAsistencias() {
        return asistencias;
    }

    public void setAsistencias(HashSet<Jugador> asistencias) {
        this.asistencias = asistencias;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public Equipo equipoJugador (){
        return jugador.getHistorial().get(jugador.getHistorial().size()-1);
    }
}
