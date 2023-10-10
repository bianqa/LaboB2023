package futbol;

import Intercambio.Fecha;
import personas.Persona;
import repaso.elecciones.Provincia;

import java.util.ArrayList;
import java.util.HashSet;

public class Jugador extends Persona implements Contrato{
    private String posicion;
    private Provincia provincia;
    private ArrayList<Equipo> historial;
    private int numero;
    private HashSet<Partido> partidos;

    public Jugador (){
        super();
        posicion = "nose";
        provincia = Provincia.CHACO;
        historial = new ArrayList<>();
        numero = 4;
        partidos = new HashSet<>();
    }

    public Jugador (String nombre, String apellido, Fecha nacimiento, int edad, String direccion, String posicion, Provincia provincia, ArrayList<Equipo> historial, int numero, HashSet<Partido> partidos){
        super(nombre, apellido, nacimiento, edad, direccion);
        this.posicion = posicion;
        this.provincia = provincia;
        this.historial = historial;
        this.numero = numero;
        this.partidos = partidos;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }

    public ArrayList<Equipo> getHistorial() {
        return historial;
    }

    public void setHistorial(ArrayList<Equipo> historial) {
        this.historial = historial;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public HashSet<Partido> getPartidos() {
        return partidos;
    }

    public void setPartidos(HashSet<Partido> partidos) {
        this.partidos = partidos;
    }

    @Override
    public boolean contratar(Equipo e) {
        return false;
    }

    @Override
    public boolean renovar(Equipo e) {
        boolean ultEquipo = false;
        boolean edad = false;
        try{
            if (getHistorial().get(getHistorial().size()-1).equals(e)){
                ultEquipo = true;
            } else{
                throw new CriteriosRenovarException("No se puede renovar porque el arquero no esta jugando actualmente en el equipo ingresado.");
            }
            if (getEdad() < 35){
                edad = true;
            } else{
                throw new CriteriosRenovarException("No se puede renovar porque el arquero es mayor de 35 años.");
            }

            if (ultEquipo && edad){
                System.out.println("El jugador" + getNombre() + " " + getApellido() + " se renovó en el " + e.getNombre());
            }
        } catch (CriteriosRenovarException ex){
            ex.getMessage();
        }
        return false;
    }
}
