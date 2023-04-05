import java.lang.reflect.Array;
import java.util.ArrayList;

public class Equipo {
    private String nombre;
    private String barrio;
    private Jugador capitan;
    private ArrayList<Jugador> jugadores;
    private ArrayList<Horario> horarios;

    public Equipo (String nombre, String barrio, Jugador capitan, ArrayList<Horario> horarios){
        this.nombre = nombre;
        this.barrio = barrio;
        this.capitan = capitan;
        this.jugadores = new ArrayList<Jugador>();
        this.horarios = horarios;
    }

    public Equipo (String nombre, String barrio, Jugador capitan, ArrayList<Jugador> jugadores, ArrayList<Horario> horarios){
        this.nombre = nombre;
        this.barrio = barrio;
        if (verificar_camiseta(jugadores, capitan)){
            this.capitan = capitan;
            capitan.setNro_camiseta(1);
            this.jugadores = jugadores;
            for (int i = 2; i < jugadores.size()+2; i++){
                jugadores.get(i-2).setNro_camiseta(i);
            }
        } else{
            this.capitan = capitan;
            this. jugadores = jugadores;
        }
        this.horarios = horarios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public Jugador getCapitan() {
        return capitan;
    }

    public void setCapitan(Jugador capitan) {
        this.capitan = capitan;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public ArrayList<Horario> getHorarios() {
        return horarios;
    }

    public void setHorarios(ArrayList<Horario> horarios) {
        this.horarios = horarios;
    }

    public boolean verificar_camiseta (ArrayList<Jugador> jugadores, Jugador capitan){
        for (int i = 0; i < jugadores.size(); i++){
            for (int j = i+1; j < jugadores.size(); j++){
                if (jugadores.get(i).getNro_camiseta() == jugadores.get(j).getNro_camiseta() || jugadores.get(i).getNro_camiseta() == capitan.getNro_camiseta()){
                    System.out.println("Hay algún jugador con el número de camiseta repetida.");
                    return false;
                }
            }
        }
        return true;
    }

    public void agregar_jugador (Jugador jugador){
        if (jugadores.size() > 9){
            System.out.println("Equipo lleno. No se agregará el jugador.");
        } else{
            boolean puede_entrar = true;
            for (Jugador jugador2 : jugadores){
                if (jugador2.getNro_camiseta() == jugador.getNro_camiseta()){
                    puede_entrar = false;
                }
            }
            if (puede_entrar){
                jugadores.add(jugador);
                System.out.println("Jugador agregado.");
            } else{
                System.out.println("Ya hay un jugador con ese número de camiseta. No se agregará el jugador.");
            }
        }
    }

    public void eliminar_jugador (Jugador jugador){
        for (Jugador jugador1 : jugadores){
            if (jugador1 == jugador){
                jugadores.remove(jugador);
            }
        }
    }
}
